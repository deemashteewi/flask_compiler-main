import antlr.ast.node.ASTNode;
import antlr.symbol.SymbolTable;
import antlr.semantic.SemanticError;
import antlr.visitor.ASTBuilder;
import antlr.visitor.ASTPrinter;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


// public class Main {

//     public static void main(String[] args) {
//         String testsDir = "tests";

//         // Run all tests or specific test from command line
//         if (args.length > 0) {
//             // Run specific test file
//             runTest(args[0]);
//         } else {
//             // Run all tests in the tests folder
//             runAllTests(testsDir);
//         }
//     }

//     public static void runAllTests(String testsDir) {
//         try {
//             Files.list(Paths.get(testsDir))
//                 .filter(path -> path.toString().endsWith(".py"))
//                 .sorted()
//                 .forEach(Main::runTest);
//         } catch (IOException e) {
//             System.err.println("Error reading tests directory: " + e.getMessage());
//         }
//     }

//     public static void runTest(String filePath) {
//         runTest(Paths.get(filePath));
//     }

//     public static void runTest(Path filePath) {
//         try {
//             String fileName = filePath.getFileName().toString();
//             System.out.println("=== Running: " + fileName + " ===");

//             String program = Files.readString(filePath);
//             evaluate(program);

//             System.out.println();
//         } catch (IOException e) {
//             System.err.println("Error reading file: " + filePath + " - " + e.getMessage());
//         }
//     }

//     public static void evaluate(String program) {
//         ProgLangEvaluator visitor = new ProgLangEvaluator();
//         CharStream input = CharStreams.fromString(program);
//         pythonLexer lexer = new pythonLexer(input);
//         CommonTokenStream tokens = new CommonTokenStream(lexer);
//         pythonParser parser = new pythonParser(tokens);
//         ParseTree tree = parser.root();
//         visitor.visit(tree);
//     }
// }


import antlr.gen.python.pythonLexer;
import antlr.gen.python.pythonParser;
import antlr.gen.jinja2.jinja2Lexer;
import antlr.gen.jinja2.jinja2Parser;
import antlr.visitor.JinjaASTBuilder;
import antlr.generator.CodeGenerator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * نقطة الدخول الرئيسية للمترجم
 * 
 * خطوات الترجمة:
 * 1. Lexical Analysis (Lexer) - تحليل معجمي
 * 2. Syntax Analysis (Parser) - تحليل نحوي
 * 3. AST Building - بناء الشجرة المجردة
 * 4. Semantic Analysis - تحليل دلالي
 * 5. Code Generation - توليد الكود
 */
public class Main {

    // ==================== ANSI Colors (Custom Palette) ====================
    public static final String RESET = "\u001B[0m";
    public static final String BOLD = "\u001B[1m";

    // Custom palette: 222831, 393E46, 00ADB5, EEEEEE
    public static final String DARK = "\u001B[38;2;8;217;214m";       // 08D9D6 - Bright cyan
    public static final String GRAY = "\u001B[38;2;255;46;99m";      // FF2E63 - Pink/red accent
    public static final String TEAL = "\u001B[38;2;0;173;181m";      // 00ADB5 - Primary accent
    public static final String LIGHT = "\u001B[38;2;238;238;238m";   // EEEEEE - Main text

    // Keep RED for errors
    public static final String RED = "\u001B[31m";

    // Global option to hide whitespace-only text nodes in AST output
    private static boolean hideWhitespace = false;

    public static void main(String[] args) {
        String testsDir = "tests/flask";

        // Parse command-line flags
        int fileArgIndex = 0;
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("--hide-whitespace") || args[i].equals("-w")) {
                hideWhitespace = true;
            } else if (args[i].equals("--generate") || args[i].equals("-g")) {
                // ==================== المرحلة 5: توليد الكود ====================
                // يشغّل CodeGenerator على تطبيق Flask التجريبي (tests/flask) ويولّد
                // صفحات HTML نهائية كاملة (products / add / detail / delete) داخل
                // مجلد output/، إثباتاً عملياً بأن الأجزاء المولّدة (Python AST +
                // Jinja2 AST) قادرة على العمل معاً.
                generateWebsite();
                return;
            } else {
                fileArgIndex = i;
                break;
            }
        }

        if (args.length > 0 && fileArgIndex < args.length && !args[fileArgIndex].startsWith("-")) {
            // تشغيل ملف محدد
            compile(args[fileArgIndex]);
        } else if (args.length == 0 || (args.length > 0 && args[fileArgIndex - 1].startsWith("-"))) {
            // تشغيل جميع الاختبارات
            runAllTests(testsDir);
        } else {
            System.out.println(TEAL + "Usage: " + RESET + "java Main [--hide-whitespace | -w] [--generate | -g] [file]");
            System.out.println("  " + TEAL + "--hide-whitespace, -w" + RESET + "  Hide whitespace-only text nodes in AST output");
            System.out.println("  " + TEAL + "--generate, -g" + RESET + "         Run the Phase 5 code generator on tests/flask and write output/*.html");
            System.out.println("\n" + LIGHT + "Examples:" + RESET);
            System.out.println("  java Main                                    # Run all tests");
            System.out.println("  java Main tests/flask/templates/products.html");
            System.out.println("  java Main -w tests/flask/templates/products.html");
            System.out.println("  java Main -g                                 # Generate the final website into output/");
        }
    }
    public static void runAllTests(String testsDir) {
        try {
            Files.walk(Paths.get(testsDir))
                .filter(Files::isRegularFile)
                .filter(path -> {
                    String name = path.toString().toLowerCase();
                    return name.endsWith(".py") || name.endsWith(".html");
                })
                .sorted()
                .forEach(Main::compile);
        } catch (IOException e) {
            System.err.println("Error reading tests directory: " + e.getMessage());
        }
    }

    public static void compile(String filePath) {
        compile(Paths.get(filePath));
    }

    public static void compile(Path filePath) {
        try {
            String fileName = filePath.getFileName().toString();
            String filePathStr = filePath.toString().toLowerCase();

            // Determine file type
            String fileType = filePathStr.endsWith(".py") ? "Python" :
                              filePathStr.endsWith(".html") ? "Jinja2" : "Unknown";

            // Header with colors
            System.out.println("\n" + TEAL + "═".repeat(70) + RESET);
            System.out.println(TEAL + "  " + BOLD + "COMPILING (" + fileType + "): " + LIGHT + fileName + RESET);
            System.out.println(TEAL + "═".repeat(70) + RESET);

            String sourceCode = Files.readString(filePath);

            // عرض الكود المصدري
            System.out.println("\n" + TEAL + "📄 Source Code:" + RESET);
            System.out.println(GRAY + "─".repeat(40) + RESET);
            System.out.println(LIGHT + sourceCode + RESET);
            System.out.println(GRAY + "─".repeat(40) + RESET);

            // بدء الترجمة - Route based on file extension
            CompilationResult result;
            if (filePathStr.endsWith(".py")) {
                result = compilePythonSource(sourceCode);
            } else if (filePathStr.endsWith(".html")) {
                result = compileJinjaSource(sourceCode);
            } else {
                result = new CompilationResult();
                result.errors.add("Unsupported file type: " + fileName);
            }

            // عرض النتائج
            if (result.success) {
                System.out.println("\n" + TEAL + "✅ Compilation successful!" + RESET);
            } else {
                System.out.println("\n" + RED + "❌ Compilation failed!" + RESET);
                for (String error : result.errors) {
                    System.out.println(RED + "   Error: " + error + RESET);
                }
            }

        } catch (IOException e) {
            System.err.println(RED + "Error reading file: " + filePath + " - " + e.getMessage() + RESET);
        }
    }

    /**
     * ترجمة كود Python
     */
    public static CompilationResult compilePythonSource(String sourceCode) {
        CompilationResult result = new CompilationResult();
        
        try {
            // ==================== Phase 1: Lexical Analysis ====================
            System.out.println("\n" + TEAL + "🔍 Phase 1: " + LIGHT + "Lexical Analysis..." + RESET);
            CharStream input = CharStreams.fromString(sourceCode);
            pythonLexer lexer = new pythonLexer(input);

            // جمع الأخطاء المعجمية
            lexer.removeErrorListeners();
            lexer.addErrorListener(new CompilerErrorListener(result));

            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // عرض الـ Tokens
            tokens.fill();
            System.out.println("\n" + TEAL + "   Tokens:" + RESET);
            for (Token token : tokens.getTokens()) {
                if (token.getType() != Token.EOF) {
                    String tokenName = pythonLexer.VOCABULARY.getSymbolicName(token.getType());
                    if (tokenName == null) {
                        // Handle parser tokens (INDENT, DEDENT from DenterHelper)
                        if (token.getType() == pythonParser.INDENT) {
                            tokenName = "INDENT";
                        } else if (token.getType() == pythonParser.DEDENT) {
                            tokenName = "DEDENT";
                        } else {
                            tokenName = "UNKNOWN_" + token.getType();
                        }
                    }
                    System.out.printf("   " + LIGHT + "[%-15s]" + RESET + " " + TEAL + "'%s'" + RESET + " " + GRAY + "(Line %d, Col %d)" + RESET + "%n",
                        tokenName,
                        token.getText().replace("\n", "newline"),
                        token.getLine(),
                        token.getCharPositionInLine());
                }
            }

            // ==================== Phase 2: Syntax Analysis ====================
            System.out.println("\n" + TEAL + "🔍 Phase 2: " + LIGHT + "Syntax Analysis (Parsing)..." + RESET);
            pythonParser parser = new pythonParser(tokens);

            // جمع الأخطاء النحوية
            parser.removeErrorListeners();
            parser.addErrorListener(new CompilerErrorListener(result));

            ParseTree parseTree = parser.root();

            if (!result.errors.isEmpty()) {
                result.success = false;
                return result;
            }

            // ==================== Phase 3: AST Building ====================
            System.out.println("\n" + TEAL + "🔍 Phase 3: " + LIGHT + "Building AST..." + RESET);
            ASTBuilder builder = new ASTBuilder();
            ASTNode ast = builder.visit(parseTree);
            result.ast = ast;
            result.symbolTable = builder.getSymbolTable();
            result.semanticErrors = builder.getSemanticErrors();

            System.out.println("\n" + TEAL + "🌳 Abstract Syntax Tree:" + RESET);
            ASTPrinter printer = new ASTPrinter(hideWhitespace);
            printer.print(ast);

            System.out.println("\n" + TEAL + "📋 Symbol Table:" + RESET);
            result.symbolTable.printAll();

            System.out.println("\n" + TEAL + "🧠 Semantic Analysis:" + RESET);
            if (result.semanticErrors.isEmpty()) {
                System.out.println(TEAL + "   لا يوجد أخطاء دلالية." + RESET);
            } else {
                for (SemanticError err : result.semanticErrors) {
                    System.out.println(RED + "   " + err + RESET);
                }
                result.success = false;
                for (SemanticError err : result.semanticErrors) {
                    result.errors.add(err.toString());
                }
                return result;
            }

            result.success = true;
            
        } catch (Exception e) {
            result.success = false;
            result.errors.add("Compilation error: " + e.getMessage());
            e.printStackTrace();
        }
        
        return result;
    }

    /**
     * ترجمة قوالب Jinja2
     */
    public static CompilationResult compileJinjaSource(String sourceCode) {
        CompilationResult result = new CompilationResult();

        try {
            // ==================== Phase 1: Lexical Analysis ====================
            System.out.println("\n" + TEAL + "🔍 Phase 1: " + LIGHT + "Lexical Analysis..." + RESET);
            CharStream input = CharStreams.fromString(sourceCode);
            jinja2Lexer lexer = new jinja2Lexer(input);

            // جمع الأخطاء المعجمية
            lexer.removeErrorListeners();
            lexer.addErrorListener(new CompilerErrorListener(result));

            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // عرض الـ Tokens
            tokens.fill();
            System.out.println("\n" + TEAL + "   Tokens:" + RESET);
            for (Token token : tokens.getTokens()) {
                if (token.getType() != Token.EOF) {
                    String tokenName = jinja2Lexer.VOCABULARY.getSymbolicName(token.getType());
                    if (tokenName == null) {
                        tokenName = "UNKNOWN_" + token.getType();
                    }
                    System.out.printf("   " + LIGHT + "[%-15s]" + RESET + " " + TEAL + "'%s'" + RESET + " " + GRAY + "(Line %d, Col %d)" + RESET + "%n",
                        tokenName,
                        token.getText().replace("\n", "\\n").replace("\r", "\\r"),
                        token.getLine(),
                        token.getCharPositionInLine());
                }
            }

            // ==================== Phase 2: Syntax Analysis ====================
            System.out.println("\n" + TEAL + "🔍 Phase 2: " + LIGHT + "Syntax Analysis (Parsing)..." + RESET);
            jinja2Parser parser = new jinja2Parser(tokens);

            // جمع الأخطاء النحوية
            parser.removeErrorListeners();
            parser.addErrorListener(new CompilerErrorListener(result));

            ParseTree parseTree = parser.template();

            if (!result.errors.isEmpty()) {
                result.success = false;
                return result;
            }

            // ==================== Phase 3: AST Building ====================
            System.out.println("\n" + TEAL + "🔍 Phase 3: " + LIGHT + "Building AST..." + RESET);
            JinjaASTBuilder builder = new JinjaASTBuilder();
            ASTNode ast = builder.visit(parseTree);
            result.ast = ast;
            result.symbolTable = builder.getSymbolTable();
            result.semanticErrors = builder.getSemanticErrors();

            System.out.println("\n" + TEAL + "🌳 Abstract Syntax Tree:" + RESET);
            ASTPrinter printer = new ASTPrinter(hideWhitespace);
            printer.print(ast);

            System.out.println("\n" + TEAL + "📋 Symbol Table:" + RESET);
            result.symbolTable.printAll();

            System.out.println("\n" + TEAL + "🧠 Semantic Analysis:" + RESET);
            if (result.semanticErrors.isEmpty()) {
                System.out.println(TEAL + "   لا يوجد أخطاء دلالية." + RESET);
            } else {
                for (SemanticError err : result.semanticErrors) {
                    System.out.println(RED + "   " + err + RESET);
                }
                result.success = false;
                for (SemanticError err : result.semanticErrors) {
                    result.errors.add(err.toString());
                }
                return result;
            }

            result.success = true;

        } catch (Exception e) {
            result.success = false;
            result.errors.add("Compilation error: " + e.getMessage());
            e.printStackTrace();
        }

        return result;
    }

    /**
     * نتيجة الترجمة
     */
    public static class CompilationResult {
        public boolean success = false;
        public ASTNode ast = null;
        public SymbolTable symbolTable = null;
        public java.util.List<String> errors = new java.util.ArrayList<>();
        public java.util.List<SemanticError> semanticErrors = new java.util.ArrayList<>();
    }
    
    /**
     * ==================== المرحلة 5: توليد الكود (Code Generation) ====================
     *
     * يشغّل المترجم على تطبيق Flask التجريبي الموجود في tests/flask، بحسب
     * المخطط الموضّح في الإعلان التوضيحي:
     *
     *   app.py --Python Parser--> Python AST --Semantic--> Generator
     *          --Context Data--> render_template() --Jinja Parser--> Jinja AST
     *          --تبديل المتغيرات--> HTML --> المتصفح
     *
     * الخرج:
     *  - output/                 : الصفحات المولّدة فعلياً (index.html, add_product.html,
     *                              product_detail.html, delete_product.html) + نسخ عن
     *                              الملفات المرافقة كما هي (app.py, style.css) دون أي معالجة.
     *  - compiler_output/        : نواتج مراحل التحليل والتوليد:
     *                              ast_python.json, ast_jinja.json,
     *                              semantic_report.txt, generation_log.txt
     */
    public static void generateWebsite() {
        String appPyPath = "tests/flask/app.py";
        String templatesDir = "tests/flask/templates";
        String staticDir = "tests/flask/static";
        String outDir = "output";
        String compilerOutDir = "compiler_output";

        StringBuilder log = new StringBuilder();
        log.append("=== Generation Log ===\n");
        log.append("Started: ").append(java.time.LocalDateTime.now()).append("\n\n");

        try {
            Files.createDirectories(Paths.get(outDir));
            Files.createDirectories(Paths.get(compilerOutDir));

            System.out.println("\n" + TEAL + "═".repeat(70) + RESET);
            System.out.println(TEAL + "  " + BOLD + "PHASE 5: CODE GENERATION (Python AST + Jinja2 AST -> HTML)" + RESET);
            System.out.println(TEAL + "═".repeat(70) + RESET);

            String pythonSource = Files.readString(Paths.get(appPyPath));

            // ---- 1) تحليل app.py (المراحل 1-4) لبناء شجرته الدلالية ----
            log.append("[app.py] Compiling Python source...\n");
            CompilationResult pythonResult = compilePythonSource(pythonSource);
            log.append("  success=").append(pythonResult.success)
               .append(", semanticErrors=").append(pythonResult.semanticErrors.size()).append("\n");

            StringBuilder semanticReport = new StringBuilder();
            semanticReport.append("=== Semantic Analysis Report ===\n\n");
            appendSemanticSection(semanticReport, "app.py", pythonResult.semanticErrors);

            Files.writeString(Paths.get(compilerOutDir, "ast_python.json"),
                    astNodeToJson(pythonResult.ast, 0) + "\n");
            log.append("  -> ").append(compilerOutDir).append("/ast_python.json written\n\n");

            // ---- 2) تحليل كل قوالب Jinja2 (المراحل 1-4) وتجميع أشجارها بملف واحد ----
            String[] templateFiles = {
                    "products.html", "add_product.html", "product_detail.html", "delete_product.html"
            };
            StringBuilder jinjaAstJson = new StringBuilder("[\n");
            for (int i = 0; i < templateFiles.length; i++) {
                String tplName = templateFiles[i];
                String tplSource = Files.readString(Paths.get(templatesDir, tplName));

                log.append("[").append(tplName).append("] Compiling Jinja2 template...\n");
                CompilationResult tplResult = compileJinjaSource(tplSource);
                log.append("  success=").append(tplResult.success)
                   .append(", semanticErrors=").append(tplResult.semanticErrors.size()).append("\n");

                appendSemanticSection(semanticReport, tplName, tplResult.semanticErrors);

                jinjaAstJson.append("  {\n    \"file\": ").append(jsonString(tplName))
                            .append(",\n    \"ast\": ").append(astNodeToJson(tplResult.ast, 2))
                            .append("\n  }").append(i < templateFiles.length - 1 ? ",\n" : "\n");
            }
            jinjaAstJson.append("]\n");
            Files.writeString(Paths.get(compilerOutDir, "ast_jinja.json"), jinjaAstJson.toString());
            log.append("  -> ").append(compilerOutDir).append("/ast_jinja.json written\n\n");

            Files.writeString(Paths.get(compilerOutDir, "semantic_report.txt"), semanticReport.toString());
            log.append("[report] ").append(compilerOutDir).append("/semantic_report.txt written\n\n");

            // ==================== المرحلة 5 نفسها: Generator + Context Data + render ====================
            CodeGenerator generator = new CodeGenerator();
            log.append("[generate] Running Generator (Context Data -> render_template)...\n");

            // ---- صفحة المنتجات (index.html): تحتاج فقط المصفوفة "products" ----
            String productsTpl = Files.readString(Paths.get(templatesDir, "products.html"));
            CodeGenerator.GenerationResult indexResult = generator.generate(pythonSource, productsTpl, "products");
            writeGeneratedFile(outDir, "index.html", indexResult, log);

            // نحضّر منتجاً مفرداً (أول عنصر في products) لصفحتي تفاصيل/حذف منتج،
            // لأن قالبهما يحتاج متغير product مفرد وليس المصفوفة الكاملة.
            Object firstProduct = null;
            if (indexResult.extractedData != null) {
                Object productsList = indexResult.extractedData.get("products");
                if (productsList instanceof List) {
                    List<?> list = (List<?>) productsList;
                    if (!list.isEmpty()) {
                        firstProduct = list.get(0);
                    }
                }
            }
            Map<String, Object> productContext = new LinkedHashMap<>();
            productContext.put("product", firstProduct);

            // ---- صفحة تفاصيل منتج ----
            String detailTpl = Files.readString(Paths.get(templatesDir, "product_detail.html"));
            CodeGenerator.GenerationResult detailResult =
                    generator.generate(pythonSource, detailTpl, "products", productContext);
            writeGeneratedFile(outDir, "product_detail.html", detailResult, log);

            // ---- صفحة حذف منتج ----
            String deleteTpl = Files.readString(Paths.get(templatesDir, "delete_product.html"));
            CodeGenerator.GenerationResult deleteResult =
                    generator.generate(pythonSource, deleteTpl, "products", productContext);
            writeGeneratedFile(outDir, "delete_product.html", deleteResult, log);

            // ---- صفحة إضافة منتج: لا تحتاج بيانات من Python (نموذج فارغ) ----
            String addTpl = Files.readString(Paths.get(templatesDir, "add_product.html"));
            CodeGenerator.GenerationResult addResult = generator.generate(pythonSource, addTpl, null);
            writeGeneratedFile(outDir, "add_product.html", addResult, log);

            // ---- نسخ الملفات المرافقة كما هي دون أي معالجة (app.py, style.css) ----
            Files.copy(Paths.get(appPyPath), Paths.get(outDir, "app.py"),
                    java.nio.file.StandardCopyOption.REPLACE_EXISTING);
            log.append("[copy] app.py copied as-is to ").append(outDir).append("/app.py\n");

            Path styleSrc = Paths.get(staticDir, "style.css");
            if (Files.exists(styleSrc)) {
                Files.copy(styleSrc, Paths.get(outDir, "style.css"),
                        java.nio.file.StandardCopyOption.REPLACE_EXISTING);
                log.append("[copy] style.css copied as-is to ").append(outDir).append("/style.css\n");
            }
            // ملاحظة: script.js اختياري وغير موجود في هذا المشروع، لذا لم يُنسخ.

            log.append("\nFinished: ").append(java.time.LocalDateTime.now()).append("\n");
            Files.writeString(Paths.get(compilerOutDir, "generation_log.txt"), log.toString());

            System.out.println("\n" + TEAL + "✅ Generated pages written to '" + outDir + "/'." + RESET);
            System.out.println(TEAL + "✅ Compiler analysis artifacts written to '" + compilerOutDir + "/'." + RESET);
        } catch (IOException e) {
            System.err.println(RED + "Error during code generation: " + e.getMessage() + RESET);
            log.append("\nERROR: ").append(e.getMessage()).append("\n");
            try {
                Files.writeString(Paths.get(compilerOutDir, "generation_log.txt"), log.toString());
            } catch (IOException ignored) {
            }
        }
    }

    private static void appendSemanticSection(StringBuilder report, String fileName,
                                               java.util.List<SemanticError> errors) {
        report.append("-- ").append(fileName).append(" --\n");
        if (errors.isEmpty()) {
            report.append("No semantic errors.\n\n");
        } else {
            for (SemanticError err : errors) {
                report.append(" - ").append(err).append("\n");
            }
            report.append("\n");
        }
    }

    private static void writeGeneratedFile(String outDir, String fileName,
                                            CodeGenerator.GenerationResult result, StringBuilder log) {
        try {
            if (result.success) {
                // إعادة الرابط النسبي لملف الأنماط بحيث يعمل style.css كملف مستقل
                // بجانب صفحات output/ (بدل مسار /static/ الخاص بخادم Flask نفسه).
                String html = result.html.replace("/static/style.css", "style.css");
                Files.writeString(Paths.get(outDir, fileName), html);
                System.out.println(TEAL + "   ✔ " + LIGHT + fileName + RESET + TEAL + " generated successfully." + RESET);
                log.append("  ✔ ").append(fileName).append(" generated successfully\n");
            } else {
                System.out.println(RED + "   ✘ " + fileName + " failed to generate:" + RESET);
                log.append("  ✘ ").append(fileName).append(" FAILED:\n");
                for (String err : result.errors) {
                    System.out.println(RED + "     - " + err + RESET);
                    log.append("      - ").append(err).append("\n");
                }
            }
        } catch (IOException e) {
            System.err.println(RED + "Error writing " + fileName + ": " + e.getMessage() + RESET);
            log.append("  ✘ ").append(fileName).append(" write error: ").append(e.getMessage()).append("\n");
        }
    }

    /**
     * تحويل شجرة AST (Python أو Jinja2) إلى JSON عام يشمل اسم العقدة، رقم السطر
     * والعمود، أي معلومات إضافية خاصة بالعقدة (extra info)، وأبناءها بشكل متكرر.
     */
    private static String astNodeToJson(ASTNode node, int indentLevel) {
        String pad = "  ".repeat(indentLevel);
        String childPad = "  ".repeat(indentLevel + 1);

        if (node == null) {
            return "null";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("{\n");
        sb.append(childPad).append("\"node\": ").append(jsonString(node.getNodeName())).append(",\n");
        sb.append(childPad).append("\"line\": ").append(node.getLineNumber()).append(",\n");
        sb.append(childPad).append("\"col\": ").append(node.getColumnNumber()).append(",\n");
        sb.append(childPad).append("\"info\": ").append(jsonString(extractExtraInfo(node))).append(",\n");

        List<ASTNode> children = node.getChildren();
        sb.append(childPad).append("\"children\": [");
        boolean any = false;
        for (ASTNode child : children) {
            if (child == null) {
                continue;
            }
            any = true;
            sb.append("\n").append(childPad).append("  ")
              .append(astNodeToJson(child, indentLevel + 2)).append(",");
        }
        if (any) {
            sb.setLength(sb.length() - 1);
            sb.append("\n").append(childPad);
        }
        sb.append("]\n");
        sb.append(pad).append("}");
        return sb.toString();
    }

    /**
     * يستخرج المعلومات الإضافية الخاصة بعقدة واحدة (extra info) بالاعتماد على
     * toString(0) العام دون الحاجة للوصول إلى getExtraInfo() المحمية.
     */
    private static String extractExtraInfo(ASTNode node) {
        String full = node.toString(0);
        int nl = full.indexOf('\n');
        String firstLine = nl >= 0 ? full.substring(0, nl) : full;
        String prefix = "├── " + node.getNodeName()
                + " [Line: " + node.getLineNumber() + ", Col: " + node.getColumnNumber() + "]";
        if (firstLine.startsWith(prefix)) {
            return firstLine.substring(prefix.length()).trim();
        }
        return "";
    }

    private static String jsonString(String s) {
        if (s == null) {
            s = "";
        }
        StringBuilder sb = new StringBuilder("\"");
        for (char c : s.toCharArray()) {
            switch (c) {
                case '"': sb.append("\\\""); break;
                case '\\': sb.append("\\\\"); break;
                case '\n': sb.append("\\n"); break;
                case '\r': sb.append("\\r"); break;
                case '\t': sb.append("\\t"); break;
                default:
                    if (c < 0x20) {
                        sb.append(String.format("\\u%04x", (int) c));
                    } else {
                        sb.append(c);
                    }
            }
        }
        sb.append("\"");
        return sb.toString();
    }

    /**
     * مستمع الأخطاء
     */
    public static class CompilerErrorListener extends BaseErrorListener {
        private final CompilationResult result;
        
        public CompilerErrorListener(CompilationResult result) {
            this.result = result;
        }
        
        @Override
        public void syntaxError(Recognizer<?, ?> recognizer,
                               Object offendingSymbol,
                               int line,
                               int charPositionInLine,
                               String msg,
                               RecognitionException e) {
            result.errors.add(String.format("Line %d:%d - %s", line, charPositionInLine, msg));
        }
    }
}