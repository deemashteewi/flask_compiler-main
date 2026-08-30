import antlr.ast.node.ASTNode;
import antlr.semantic.SemanticError;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;


public class Generator {

    private static final String FLASK_APP = "tests/flask/app.py";
    private static final String TEMPLATES_DIR = "tests/flask/templates";
    private static final String OUTPUT_DIR = "output";
    private static final String COMPILER_OUTPUT_DIR = "compiler_output";

    private static final List<String> logLines = new ArrayList<>();

    public static void main(String[] args) {
        log("=== بدء مرحلة التوليد (Code Generation) ===");

        try {
            Files.createDirectories(Paths.get(OUTPUT_DIR));
            Files.createDirectories(Paths.get(COMPILER_OUTPUT_DIR));

            String pythonSource = Files.readString(Paths.get(FLASK_APP));
            log("قراءة " + FLASK_APP + " (" + pythonSource.length() + " حرف)");

            Main.CompilationResult pythonResult = Main.compilePythonSource(pythonSource);
            log("تحليل Python: " + (pythonResult.success ? "نجح" : "فشل")
                    + " | أخطاء دلالية: " + pythonResult.semanticErrors.size());

            Files.writeString(Paths.get(COMPILER_OUTPUT_DIR, "ast_python.json"),
                    toJson(pythonResult.ast));
            log("كتابة compiler_output/ast_python.json");

            List<Map<String, Object>> products = extractProducts(pythonSource);
            log("استخراج " + products.size() + " عنصر من مصفوفة products (Generator -> Context Data)");

            Map<String, ASTNode> jinjaAsts = new LinkedHashMap<>();
            Map<String, List<SemanticError>> jinjaErrors = new LinkedHashMap<>();

            List<Path> templateFiles;
            try (Stream<Path> s = Files.list(Paths.get(TEMPLATES_DIR))) {
                templateFiles = s.filter(p -> p.toString().endsWith(".html"))
                        .sorted()
                        .toList();
            }

            for (Path templatePath : templateFiles) {
                String name = templatePath.getFileName().toString();
                String templateSource = Files.readString(templatePath);

                Main.CompilationResult jinjaResult = Main.compileJinjaSource(templateSource);
                jinjaAsts.put(name, jinjaResult.ast);
                jinjaErrors.put(name, jinjaResult.semanticErrors);
                log("تحليل " + name + ": " + (jinjaResult.success ? "نجح" : "فشل")
                        + " | أخطاء دلالية: " + jinjaResult.semanticErrors.size());


                Map<String, Object> context = new HashMap<>();
                context.put("products", products);
                if (!products.isEmpty()) {
                    context.put("product", products.get(0));
                }

                String rendered = renderTemplate(templateSource, context);
                Files.writeString(Paths.get(OUTPUT_DIR, name), rendered);
                log("توليد " + OUTPUT_DIR + "/" + name);
            }

            Files.writeString(Paths.get(COMPILER_OUTPUT_DIR, "ast_jinja.json"),
                    jinjaAstsToJson(jinjaAsts));
            log("كتابة compiler_output/ast_jinja.json");

            Files.copy(Paths.get(FLASK_APP), Paths.get(OUTPUT_DIR, "app.py"),
                    StandardCopyOption.REPLACE_EXISTING);
            log("نسخ app.py إلى " + OUTPUT_DIR + " دون أي معالجة إضافية");

            writeSemanticReport(pythonResult, jinjaErrors);
            log("كتابة compiler_output/semantic_report.txt");

            log("=== انتهت مرحلة التوليد بنجاح ===");

        } catch (IOException e) {
            log("خطأ: " + e.getMessage());
        } finally {
            try {
                Files.writeString(Paths.get(COMPILER_OUTPUT_DIR, "generation_log.txt"),
                        String.join("\n", logLines));
            } catch (IOException ignored) {
            }
        }
    }

    private static void log(String message) {
        String line = "[" + LocalDateTime.now() + "] " + message;
        System.out.println(line);
        logLines.add(line);
    }


    private static String toJson(ASTNode node) {
        if (node == null) return "null";
        StringBuilder sb = new StringBuilder();
        sb.append("{\"node\":").append(quote(node.getNodeName()))
          .append(",\"line\":").append(node.getLineNumber())
          .append(",\"col\":").append(node.getColumnNumber())
          .append(",\"children\":[");
        List<ASTNode> children = node.getChildren();
        boolean first = true;
        if (children != null) {
            for (ASTNode child : children) {
                if (child == null) continue;
                if (!first) sb.append(",");
                sb.append(toJson(child));
                first = false;
            }
        }
        sb.append("]}");
        return sb.toString();
    }

    private static String jinjaAstsToJson(Map<String, ASTNode> asts) {
        StringBuilder sb = new StringBuilder("[");
        boolean first = true;
        for (Map.Entry<String, ASTNode> e : asts.entrySet()) {
            if (!first) sb.append(",");
            sb.append("{\"file\":").append(quote(e.getKey()))
              .append(",\"ast\":").append(toJson(e.getValue())).append("}");
            first = false;
        }
        sb.append("]");
        return sb.toString();
    }

    private static String quote(String s) {
        if (s == null) return "\"\"";
        return "\"" + s.replace("\\", "\\\\")
                .replace("\"", "\\\"")
                .replace("\n", "\\n")
                .replace("\r", "") + "\"";
    }


    private static void writeSemanticReport(Main.CompilationResult pythonResult,
                                             Map<String, List<SemanticError>> jinjaErrors) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("تقرير التحليل الدلالي\n").append("=".repeat(40)).append("\n\n");

        sb.append("app.py (Python)\n").append("-".repeat(20)).append("\n");
        if (pythonResult.semanticErrors.isEmpty()) {
            sb.append("لا يوجد أخطاء دلالية.\n\n");
        } else {
            for (SemanticError err : pythonResult.semanticErrors) {
                sb.append("  - ").append(err).append("\n");
            }
            sb.append("\n");
        }

        for (Map.Entry<String, List<SemanticError>> entry : jinjaErrors.entrySet()) {
            sb.append(entry.getKey()).append(" (Jinja2)\n").append("-".repeat(20)).append("\n");
            if (entry.getValue().isEmpty()) {
                sb.append("لا يوجد أخطاء دلالية.\n\n");
            } else {
                for (SemanticError err : entry.getValue()) {
                    sb.append("  - ").append(err).append("\n");
                }
                sb.append("\n");
            }
        }

        Files.writeString(Paths.get(COMPILER_OUTPUT_DIR, "semantic_report.txt"), sb.toString());
    }


    private static List<Map<String, Object>> extractProducts(String pythonSource) {
        List<Map<String, Object>> result = new ArrayList<>();

        Matcher listMatcher = Pattern.compile(
                "products\\s*=\\s*\\[(.*?)\\n\\s*\\]", Pattern.DOTALL).matcher(pythonSource);
        if (!listMatcher.find()) {
            return result;
        }
        String listBody = listMatcher.group(1);

        Matcher dictMatcher = Pattern.compile("\\{([^{}]*)\\}", Pattern.DOTALL).matcher(listBody);
        Pattern pairPattern = Pattern.compile(
                "\"(\\w+)\"\\s*:\\s*(\"(?:[^\"\\\\]|\\\\.)*\"|[-+]?[0-9]*\\.?[0-9]+)");

        while (dictMatcher.find()) {
            Map<String, Object> item = new LinkedHashMap<>();
            Matcher pairMatcher = pairPattern.matcher(dictMatcher.group(1));
            while (pairMatcher.find()) {
                String key = pairMatcher.group(1);
                String rawValue = pairMatcher.group(2);
                Object value = rawValue.startsWith("\"")
                        ? rawValue.substring(1, rawValue.length() - 1)
                        : rawValue;
                item.put(key, value);
            }
            if (!item.isEmpty()) {
                result.add(item);
            }
        }
        return result;
    }


    private static String renderTemplate(String src, Map<String, Object> context) {
        // {% for item in list %} ... {% endfor %}
        Pattern forPattern = Pattern.compile(
                "\\{%-?\\s*for\\s+(\\w+)\\s+in\\s+(\\w+)\\s*-?%\\}(.*?)\\{%-?\\s*endfor\\s*-?%\\}",
                Pattern.DOTALL);
        Matcher forMatcher = forPattern.matcher(src);
        StringBuilder afterFor = new StringBuilder();
        int last = 0;
        while (forMatcher.find()) {
            afterFor.append(src, last, forMatcher.start());
            String itemVar = forMatcher.group(1);
            String listVar = forMatcher.group(2);
            String body = forMatcher.group(3);
            Object listObj = context.get(listVar);
            if (listObj instanceof List<?> items) {
                for (Object item : items) {
                    Map<String, Object> innerContext = new HashMap<>(context);
                    innerContext.put(itemVar, item);
                    afterFor.append(renderExpressions(body, innerContext));
                }
            }
            last = forMatcher.end();
        }
        afterFor.append(src.substring(last));

        // {% if var %} ... {% else %} ... {% endif %}
        Pattern ifPattern = Pattern.compile(
                "\\{%-?\\s*if\\s+(\\w+)\\s*-?%\\}(.*?)(?:\\{%-?\\s*else\\s*-?%\\}(.*?))?\\{%-?\\s*endif\\s*-?%\\}",
                Pattern.DOTALL);
        Matcher ifMatcher = ifPattern.matcher(afterFor.toString());
        StringBuilder afterIf = new StringBuilder();
        last = 0;
        while (ifMatcher.find()) {
            afterIf.append(afterFor, last, ifMatcher.start());
            String condVar = ifMatcher.group(1);
            String truePart = ifMatcher.group(2);
            String falsePart = ifMatcher.group(3) == null ? "" : ifMatcher.group(3);
            boolean truthy = context.get(condVar) != null;
            afterIf.append(truthy ? truePart : falsePart);
            last = ifMatcher.end();
        }
        afterIf.append(afterFor.substring(last));

        return renderExpressions(afterIf.toString(), context);
    }

    private static String renderExpressions(String src, Map<String, Object> context) {
        Pattern exprPattern = Pattern.compile("\\{\\{\\s*(\\w+)(?:\\.(\\w+))?\\s*\\}\\}");
        Matcher m = exprPattern.matcher(src);
        StringBuilder sb = new StringBuilder();
        while (m.find()) {
            String varName = m.group(1);
            String field = m.group(2);
            Object value = context.get(varName);
            String replacement = "";
            if (value instanceof Map<?, ?> map && field != null) {
                Object fieldValue = map.get(field);
                replacement = fieldValue == null ? "" : fieldValue.toString();
            } else if (value != null) {
                replacement = value.toString();
            }
            m.appendReplacement(sb, Matcher.quoteReplacement(replacement));
        }
        m.appendTail(sb);
        return sb.toString();
    }
}
