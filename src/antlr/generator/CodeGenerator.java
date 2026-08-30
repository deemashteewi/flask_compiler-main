package antlr.generator;

import antlr.ast.node.ASTNode;
import antlr.ast.python.ProgramNode;
import antlr.ast.jinja2.TemplateNode;
import antlr.gen.jinja2.jinja2Lexer;
import antlr.gen.jinja2.jinja2Parser;
import antlr.gen.python.pythonLexer;
import antlr.gen.python.pythonParser;
import antlr.visitor.ASTBuilder;
import antlr.visitor.JinjaASTBuilder;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class CodeGenerator {

    public static class GenerationResult {
        public boolean success = false;
        public String html = "";
        public Map<String, Object> extractedData;
        public final List<String> errors = new ArrayList<>();
    }

    /**
     * @param pythonSource   كود Python المصدر الذي يحوي مصفوفة البيانات (مثال: tests/flask/app.py)
     * @param templateSource قالب Jinja2/HTML المصدر (مثال: tests/flask/templates/products.html)
     * @param dataVarName    اسم المتغير المراد استخراجه من كود Python ليصبح متاحاً باسمه نفسه داخل القالب
     */
    public GenerationResult generate(String pythonSource, String templateSource, String dataVarName) {
        return generate(pythonSource, templateSource, dataVarName, null);
    }


    public GenerationResult generate(String pythonSource, String templateSource, String dataVarName,
                                      Map<String, Object> extraVariables) {
        GenerationResult result = new GenerationResult();

        ASTNode pythonAst;
        try {
            CharStream pyInput = CharStreams.fromString(pythonSource);
            pythonLexer pyLexer = new pythonLexer(pyInput);
            CommonTokenStream pyTokens = new CommonTokenStream(pyLexer);
            pythonParser pyParser = new pythonParser(pyTokens);
            ParseTree pyTree = pyParser.root();

            ASTBuilder pyBuilder = new ASTBuilder();
            pythonAst = pyBuilder.visit(pyTree);
        } catch (Exception e) {
            result.errors.add("Python parsing error: " + e.getMessage());
            return result;
        }

        if (!(pythonAst instanceof ProgramNode)) {
            result.errors.add("Python source did not produce a valid ProgramNode (first tree).");
            return result;
        }

        ASTNode templateAst;
        try {
            CharStream tplInput = CharStreams.fromString(templateSource);
            jinja2Lexer tplLexer = new jinja2Lexer(tplInput);
            CommonTokenStream tplTokens = new CommonTokenStream(tplLexer);
            jinja2Parser tplParser = new jinja2Parser(tplTokens);
            ParseTree tplTree = tplParser.template();

            JinjaASTBuilder tplBuilder = new JinjaASTBuilder();
            templateAst = tplBuilder.visit(tplTree);
        } catch (Exception e) {
            result.errors.add("Jinja2 template parsing error: " + e.getMessage());
            return result;
        }

        if (!(templateAst instanceof TemplateNode)) {
            result.errors.add("Template source did not produce a valid TemplateNode (second tree).");
            return result;
        }

        try {
            PythonDataExtractor extractor = new PythonDataExtractor();
            Map<String, Object> variables = extractor.extract((ProgramNode) pythonAst);
            result.extractedData = variables;

            if (dataVarName != null && !variables.containsKey(dataVarName)) {
                result.errors.add("Variable '" + dataVarName + "' was not found in the Python source.");
            }

            Map<String, Object> renderContext = new LinkedHashMap<>(variables);
            if (extraVariables != null) {
                renderContext.putAll(extraVariables);
            }

            JinjaTemplateRenderer renderer = new JinjaTemplateRenderer();
            String body = renderer.render((TemplateNode) templateAst, renderContext);

            result.html = "<!DOCTYPE html>\n" + body;
            result.success = result.errors.isEmpty();
        } catch (Exception e) {
            result.errors.add("Code generation error: " + e.getMessage());
        }

        return result;
    }
}
