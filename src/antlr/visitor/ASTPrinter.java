package antlr.visitor;

import java.util.List;

import antlr.ast.css.*;
import antlr.ast.css.selectors.*;
import antlr.ast.css.properties.*;
import antlr.ast.css.values.*;
import antlr.ast.jinja2.TemplateNode;
import antlr.ast.jinja2.blocks.*;
import antlr.ast.jinja2.content.*;
import antlr.ast.jinja2.content.elements.*;
import antlr.ast.jinja2.content.elements.document.*;
import antlr.ast.jinja2.content.elements.sectioning.*;
import antlr.ast.jinja2.content.elements.text.*;
import antlr.ast.jinja2.content.elements.form.*;
import antlr.ast.jinja2.content.elements.media.*;
import antlr.ast.jinja2.content.elements.embedded.*;
import antlr.ast.jinja2.expressions.*;
import antlr.ast.jinja2.expressions.literals.*;
import antlr.ast.jinja2.expressions.operations.*;
import antlr.ast.jinja2.statements.*;
import antlr.ast.jinja2.targets.*;
import antlr.ast.node.ASTNode;
import antlr.ast.python.ProgramNode;
import antlr.ast.python.StatementNode;
import antlr.ast.python.expressions.ExpressionNode;
import antlr.ast.python.expressions.ListComprehensionNode;
import antlr.ast.python.expressions.access.*;
import antlr.ast.python.expressions.literals.*;
import antlr.ast.python.expressions.operations.*;
import antlr.ast.python.parameters.*;
import antlr.ast.python.statements.*;
import antlr.ast.visitor.ASTVisitor;

/**
 * طابعة الشجرة المجردة (AST Printer) تطبع الشجرة بشكل مقروء ومنسق
 *
 * المتطلبات المحققة: - طباعة كل عقدة مع معلوماتها - طباعة الأبناء بشكل متداخل -
 * طباعة مقروءة وواضحة
 */
public class ASTPrinter implements ASTVisitor<String> {

    // ==================== ANSI Colors (Custom Palette) ====================
    public static final String RESET = "\u001B[0m";
    public static final String BOLD = "\u001B[1m";
    public static final String DIM = "\u001B[2m";

    // Custom palette: 222831, 393E46, 00ADB5, EEEEEE
    public static final String DARK = "\u001B[38;2;8;217;214m";       // 08D9D6 - Bright cyan
    public static final String GRAY = "\u001B[38;2;255;46;99m";      // FF2E63 - Pink/red accent
    public static final String TEAL = "\u001B[38;2;0;173;181m";      // 00ADB5 - Primary accent
    public static final String LIGHT = "\u001B[38;2;238;238;238m";   // EEEEEE - Main text

    private int indentLevel = 0;
    private final String INDENT = "  ";
    private final String BRANCH = GRAY + "├── " + RESET;
    private final String LAST_BRANCH = GRAY + "└── " + RESET;
    private final String VERTICAL = GRAY + "│   " + RESET;
    private final String SPACE = "    ";
    private final boolean hideWhitespace;

    /**
     * Default constructor - shows all nodes including whitespace
     */
    public ASTPrinter() {
        this(false);
    }

    /**
     * Constructor with option to hide whitespace-only text nodes
     * @param hideWhitespace if true, hides text nodes that contain only whitespace
     */
    public ASTPrinter(boolean hideWhitespace) {
        this.hideWhitespace = hideWhitespace;
    }

    /**
     * طباعة الشجرة
     */
    public void print(ASTNode node) {
        System.out.println("\n" + TEAL + "╔══════════════════════════════════════════════════════════════╗" + RESET);
        System.out.println(TEAL + "║" + RESET + BOLD + LIGHT + "                   Abstract Syntax Tree (AST)                  " + RESET + TEAL + "║" + RESET);
        System.out.println(TEAL + "╚══════════════════════════════════════════════════════════════╝" + RESET + "\n");
        System.out.println(node.accept(this));
    }

    /**
     * إنشاء مسافة بادئة
     */
    private String indent() {
        return INDENT.repeat(indentLevel);
    }

    /**
     * طباعة معلومات العقدة
     */
    private String nodeInfo(ASTNode node, String extra) {
        StringBuilder sb = new StringBuilder();
        sb.append(TEAL).append(BOLD).append(node.getNodeName()).append(RESET);
        sb.append(GRAY).append(" [Line: ").append(node.getLineNumber());
        sb.append(", Col: ").append(node.getColumnNumber()).append("]").append(RESET);
        if (extra != null && !extra.isEmpty()) {
            sb.append(" ").append(LIGHT).append(extra).append(RESET);
        }
        return sb.toString();
    }

    // ==================== Python Nodes ====================
    @Override
    public String visit(ProgramNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(nodeInfo(node, "(statements: " + node.getStatementCount() + ")")).append("\n");

        indentLevel++;
        var statements = node.getStatements();
        for (int i = 0; i < statements.size(); i++) {
            StatementNode stmt = statements.get(i);
            boolean isLast = (i == statements.size() - 1);
            sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH);
            sb.append(stmt.accept(this));
        }
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(BlockNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(nodeInfo(node, "(statements: " + node.getStatementCount() + ")")).append("\n");

        indentLevel++;
        var statements = node.getStatements();
        for (int i = 0; i < statements.size(); i++) {
            StatementNode stmt = statements.get(i);
            boolean isLast = (i == statements.size() - 1);
            sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH);
            sb.append(stmt.accept(this));
        }
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(AssignmentNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(nodeInfo(node, "(var: " + node.getVariableName() + ")")).append("\n");

        indentLevel++;
        sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Value: ").append(RESET);
        sb.append(node.getValue().accept(this));
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(PrintNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(nodeInfo(node, "")).append("\n");

        indentLevel++;
        sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Expression: ").append(RESET);
        sb.append(node.getExpression().accept(this));
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(ReturnNode node) {
        StringBuilder sb = new StringBuilder();
        String extra = node.hasValue() ? "(has value)" : "(bare return)";
        sb.append(nodeInfo(node, extra)).append("\n");

        if (node.hasValue()) {
            indentLevel++;
            sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Value: ").append(RESET);
            sb.append(node.getValue().accept(this));
            indentLevel--;
        }

        return sb.toString();
    }

    @Override
    public String visit(ExpressionStatementNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(nodeInfo(node, "")).append("\n");

        indentLevel++;
        sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Expression: ").append(RESET);
        sb.append(node.getExpression().accept(this));
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(ImportedClassNode node) {
        return nodeInfo(node, "(class: " + node.getClassName() + ")") + "\n";
    }

    @Override
    public String visit(ImportStatement node) {
        StringBuilder sb = new StringBuilder();
        sb.append(nodeInfo(node, "(module: " + node.getModuleName() + ", classes: " + node.getImportedClassesCount() + ")")).append("\n");

        indentLevel++;
        var importedClasses = node.getImportedClasses();
        for (int i = 0; i < importedClasses.size(); i++) {
            boolean isLast = (i == importedClasses.size() - 1);
            sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH);
            sb.append(importedClasses.get(i).accept(this));
        }
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(FunctionDefinitionNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(nodeInfo(node, "(name: " + node.getFunctionName() + ", params: " + node.getParametersCount() + ")")).append("\n");

        indentLevel++;

        // Print parameters
        var params = node.getParameters();
        if (!params.isEmpty()) {
            sb.append(indent()).append(BRANCH).append(TEAL).append("Parameters:").append(RESET).append("\n");
            indentLevel++;
            for (int i = 0; i < params.size(); i++) {
                boolean isLast = (i == params.size() - 1);
                sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH);
                sb.append(params.get(i).accept(this));
            }
            indentLevel--;
        }

        // Print body statements
        var bodyStatements = node.getBodyStatements();
        boolean hasBody = !bodyStatements.isEmpty();
        sb.append(indent()).append(hasBody ? BRANCH : LAST_BRANCH).append(TEAL).append("Body:").append(RESET).append("\n");
        if (hasBody) {
            indentLevel++;
            for (int i = 0; i < bodyStatements.size(); i++) {
                boolean isLast = (i == bodyStatements.size() - 1);
                sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH);
                sb.append(bodyStatements.get(i).accept(this));
            }
            indentLevel--;
        }

        indentLevel--;
        return sb.toString();
    }

    @Override
    public String visit(ClassDefinitionNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(nodeInfo(node, "(name: " + node.getClassName() + ", statements: " + node.getBodyStatementsCount() + ")")).append("\n");

        indentLevel++;
        var bodyStatements = node.getBodyStatements();
        if (!bodyStatements.isEmpty()) {
            sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Body:").append(RESET).append("\n");
            indentLevel++;
            for (int i = 0; i < bodyStatements.size(); i++) {
                boolean isLast = (i == bodyStatements.size() - 1);
                sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH);
                sb.append(bodyStatements.get(i).accept(this));
            }
            indentLevel--;
        }
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(ParameterNode node) {
        return nodeInfo(node, "(name: " + node.getName() + ")") + "\n";
    }

    @Override
    public String visit(KeywordOnlyParamNode node) {
        StringBuilder sb = new StringBuilder();
        String extra = node.hasDefault() ? "(name: " + node.getName() + ", keyword-only, has default)" : "(name: " + node.getName() + ", keyword-only)";
        sb.append(nodeInfo(node, extra)).append("\n");

        if (node.hasDefault()) {
            indentLevel++;
            sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Default: ").append(RESET);
            sb.append(node.getDefaultValue().accept(this));
            indentLevel--;
        }

        return sb.toString();
    }

    @Override
    public String visit(KwargsNode node) {
        return nodeInfo(node, "(**" + node.getName() + ")") + "\n";
    }

    @Override
    public String visit(KeywordOnlySeparator node) {
        return nodeInfo(node, "(bare *, keyword-only separator)") + "\n";
    }

    @Override
    public String visit(PositionalOnlyParamNode node) {
        StringBuilder sb = new StringBuilder();
        String extra = node.hasDefault() ? "(name: " + node.getName() + ", positional-only, has default)" : "(name: " + node.getName() + ", positional-only)";
        sb.append(nodeInfo(node, extra)).append("\n");

        if (node.hasDefault()) {
            indentLevel++;
            sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Default: ").append(RESET);
            sb.append(node.getDefaultValue().accept(this));
            indentLevel--;
        }

        return sb.toString();
    }

    @Override
    public String visit(RegularParamNode node) {
        StringBuilder sb = new StringBuilder();
        String extra = node.hasDefault() ? "(name: " + node.getName() + ", has default)" : "(name: " + node.getName() + ")";
        sb.append(nodeInfo(node, extra)).append("\n");

        if (node.hasDefault()) {
            indentLevel++;
            sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Default: ").append(RESET);
            sb.append(node.getDefaultValue().accept(this));
            indentLevel--;
        }

        return sb.toString();
    }

    @Override
    public String visit(StarArgsNode node) {
        return nodeInfo(node, "(*" + node.getName() + ")") + "\n";
    }

    @Override
    public String visit(IfStatementNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(nodeInfo(node, "")).append("\n");

        indentLevel++;

        // Condition
        sb.append(indent()).append(BRANCH).append(TEAL).append("Condition: ").append(RESET);
        sb.append(node.getCondition().accept(this));

        // If block
        sb.append(indent()).append(BRANCH).append(TEAL).append("Then: ").append(RESET);
        sb.append(node.getIfBlock().accept(this));

        // Elif blocks
        var elifConditions = node.getElifConditions();
        var elifBlocks = node.getElifBlocks();
        for (int i = 0; i < elifConditions.size(); i++) {
            sb.append(indent()).append(BRANCH).append(TEAL).append("Elif ").append(i + 1).append(":").append(RESET).append("\n");
            indentLevel++;
            sb.append(indent()).append(BRANCH).append(TEAL).append("Condition: ").append(RESET);
            sb.append(elifConditions.get(i).accept(this));
            sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Block: ").append(RESET);
            sb.append(elifBlocks.get(i).accept(this));
            indentLevel--;
        }

        // Else block
        if (node.hasElse()) {
            sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Else: ").append(RESET);
            sb.append(node.getElseBlock().accept(this));
        }

        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(ForStatementNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(nodeInfo(node, "(target: " + node.getTargetVariable() + ")")).append("\n");

        indentLevel++;
        sb.append(indent()).append(BRANCH).append(TEAL).append("Iterable: ").append(RESET);
        sb.append(node.getIterable().accept(this));
        sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Body: ").append(RESET);
        sb.append(node.getBody().accept(this));
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(WhileStatementNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(nodeInfo(node, "")).append("\n");

        indentLevel++;
        sb.append(indent()).append(BRANCH).append(TEAL).append("Condition: ").append(RESET);
        sb.append(node.getCondition().accept(this));
        sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Body: ").append(RESET);
        sb.append(node.getBody().accept(this));
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(BreakNode node) {
        return nodeInfo(node, "") + "\n";
    }

    @Override
    public String visit(ContinueNode node) {
        return nodeInfo(node, "") + "\n";
    }

    // ==================== Expression Nodes ====================
    @Override
    public String visit(BinaryOpNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(nodeInfo(node, "(op: " + node.getOperator().getSymbol() + ")")).append("\n");

        indentLevel++;
        sb.append(indent()).append(BRANCH).append(TEAL).append("Left: ").append(RESET);
        sb.append(node.getLeft().accept(this));
        sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Right: ").append(RESET);
        sb.append(node.getRight().accept(this));
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(UnaryOpNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(nodeInfo(node, "(op: " + node.getOperator().getSymbol() + ")")).append("\n");

        indentLevel++;
        sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Operand: ").append(RESET);
        sb.append(node.getOperand().accept(this));
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(NumberIntegerNode node) {
        return nodeInfo(node, "(value: " + node.getValue() + ")") + "\n";
    }

    @Override
    public String visit(NumberDoubleNode node) {
        return nodeInfo(node, "(value: " + node.getValue() + ")") + "\n";
    }

    @Override
    public String visit(VariableNode node) {
        return nodeInfo(node, "(name: " + node.getName() + ")") + "\n";
    }

    @Override
    public String visit(BooleanNode node) {
        return nodeInfo(node, "(value: " + node.getValue() + ")") + "\n";
    }

    @Override
    public String visit(NoneNode node) {
        return nodeInfo(node, "") + "\n";
    }

    @Override
    public String visit(ComparisonNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(nodeInfo(node, "(op: " + node.getOperator().getSymbol() + ")")).append("\n");

        indentLevel++;
        sb.append(indent()).append(BRANCH).append(TEAL).append("Left: ").append(RESET);
        sb.append(node.getLeft().accept(this));
        sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Right: ").append(RESET);
        sb.append(node.getRight().accept(this));
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(LogicalOpNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(nodeInfo(node, "(op: " + node.getOperator().getSymbol() + ")")).append("\n");

        indentLevel++;
        sb.append(indent()).append(BRANCH).append(TEAL).append("Left: ").append(RESET);
        sb.append(node.getLeft().accept(this));
        sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Right: ").append(RESET);
        sb.append(node.getRight().accept(this));
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(ListNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(nodeInfo(node, "(elements: " + node.getElements().size() + ")")).append("\n");

        indentLevel++;
        List<ExpressionNode> elements = node.getElements();
        for (int i = 0; i < elements.size(); i++) {
            boolean isLast = (i == elements.size() - 1);
            sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH);
            sb.append(elements.get(i).accept(this));
        }
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(ListComprehensionNode node) {
        StringBuilder sb = new StringBuilder();
        String filterInfo = node.hasFilter() ? ", filtered" : "";
        sb.append(nodeInfo(node, "(target: " + node.getTargetVariable() + filterInfo + ")")).append("\n");

        indentLevel++;
        sb.append(indent()).append(BRANCH).append(TEAL).append("Element: ").append(RESET);
        sb.append(node.getElement().accept(this));
        sb.append(indent()).append(BRANCH).append(TEAL).append("Iterable: ").append(RESET);
        sb.append(node.getIterable().accept(this));
        if (node.hasFilter()) {
            sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Filter: ").append(RESET);
            sb.append(node.getFilterCondition().accept(this));
        }
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(StringNode node) {
        return nodeInfo(node, "(value: " + node.getValue() + ")") + "\n";
    }

    @Override
    public String visit(DictEntryNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(TEAL).append("Key: ").append(RESET).append(node.getKey().accept(this));
        sb.append(indent()).append(SPACE).append(TEAL).append("Value: ").append(RESET).append(node.getValue().accept(this));
        return sb.toString();
    }

    @Override
    public String visit(DictNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(nodeInfo(node, "(elements: " + node.getElements().size() + ")")).append("\n");
        indentLevel++;
        List<DictEntryNode> elements = node.getElements();
        for (int i = 0; i < elements.size(); i++) {
            boolean isLast = (i == elements.size() - 1);
            sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH);
            sb.append(elements.get(i).accept(this));
        }
        indentLevel--;
        return sb.toString();
    }

    @Override
    public String visit(IndexAccessNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(TEAL).append("Container: ").append(RESET).append(node.getContainer().accept(this));
        sb.append(indent()).append(SPACE).append(TEAL).append("Key: ").append(RESET).append(node.getKey().accept(this));
        return sb.toString();
    }

    @Override
    public String visit(DotAccessNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(nodeInfo(node, "(property: " + node.getProperty() + ")")).append("\n");

        indentLevel++;
        sb.append(indent()).append(LAST_BRANCH).append("Object: ");
        sb.append(node.getObject().accept(this));
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(FunctionCallNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(nodeInfo(node, "(arguments: " + node.getParametersCount() + ")")).append("\n");

        indentLevel++;
        sb.append(indent()).append(BRANCH).append(TEAL).append("Callee: ").append(RESET);
        sb.append(node.getCallee().accept(this));

        var args = node.getParameters();
        for (int i = 0; i < args.size(); i++) {
            boolean isLast = (i == args.size() - 1);
            sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH);
            sb.append(TEAL).append("Arg " + (i + 1) + ": ").append(RESET);
            sb.append(args.get(i).accept(this));
        }
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(KeywordArgumentNode node) {
        StringBuilder sb = new StringBuilder();
        String extra = node.getName() != null
            ? "(keyword: " + node.getName() + ")"
            : "(positional)";
        sb.append(nodeInfo(node, extra)).append("\n");

        indentLevel++;
        sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Value: ").append(RESET);
        sb.append(node.getValue().accept(this));
        indentLevel--;

        return sb.toString();
    }

    // ==================== Jinja2 Nodes ====================

    // ==================== Jinja2 Root & Content ====================
    @Override
    public String visit(TemplateNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(nodeInfo(node, "(content: " + node.getContent().size() + " items)")).append("\n");

        indentLevel++;
        List<ASTNode> content = node.getContent();
        for (int i = 0; i < content.size(); i++) {
            boolean isLast = (i == content.size() - 1);
            sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH);
            sb.append(content.get(i).accept(this));
        }
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(HtmlTextNode node) {
        // Skip whitespace-only text nodes if hideWhitespace is enabled
        if (hideWhitespace && node.getText().trim().isEmpty()) {
            return "";
        }

        String preview = node.getText();
        if (preview.length() > 30) {
            preview = preview.substring(0, 30) + "...";
        }
        preview = preview.replace("\n", "\\n").replace("\r", "\\r");
        return nodeInfo(node, "(text: \"" + preview + "\")") + "\n";
    }

    @Override
    public String visit(ExpressionBlockNode node) {
        StringBuilder sb = new StringBuilder();
        String filterInfo = node.hasFilters() ? ", filters: " + node.getFilters().size() : "";
        sb.append(nodeInfo(node, "(expr: " + (node.getExpression() != null ? node.getExpression().getFullPath() : "null") + filterInfo + ")")).append("\n");

        indentLevel++;
        if (node.getExpression() != null) {
            sb.append(indent()).append(node.hasFilters() ? BRANCH : LAST_BRANCH).append(TEAL).append("Expression: ").append(RESET);
            sb.append(node.getExpression().accept(this));
        }
        if (node.hasFilters()) {
            List<FilterNode> filters = node.getFilters();
            for (int i = 0; i < filters.size(); i++) {
                boolean isLast = (i == filters.size() - 1);
                sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH).append(TEAL).append("Filter: ").append(RESET);
                sb.append(filters.get(i).accept(this));
            }
        }
        indentLevel--;

        return sb.toString();
    }

    // ==================== Jinja2 Blocks ====================
    @Override
    public String visit(ForBlockNode node) {
        StringBuilder sb = new StringBuilder();
        String extra = String.format("(hasCondition: %s, hasElse: %s)", node.hasCondition(), node.hasElseBranch());
        sb.append(nodeInfo(node, extra)).append("\n");

        indentLevel++;
        // Target
        if (node.getTarget() != null) {
            sb.append(indent()).append(BRANCH).append(TEAL).append("Target: ").append(RESET);
            sb.append(node.getTarget().accept(this));
        }
        // Iterable
        if (node.getIterable() != null) {
            sb.append(indent()).append(BRANCH).append(TEAL).append("Iterable: ").append(RESET);
            sb.append(node.getIterable().accept(this));
        }
        // Condition
        if (node.hasCondition()) {
            sb.append(indent()).append(BRANCH).append(TEAL).append("Condition: ").append(RESET);
            sb.append(node.getCondition().accept(this));
        }
        // Body
        List<ASTNode> body = node.getBody();
        if (!body.isEmpty()) {
            sb.append(indent()).append(node.hasElseBranch() ? BRANCH : LAST_BRANCH).append(TEAL).append("Body:").append(RESET).append("\n");
            indentLevel++;
            for (int i = 0; i < body.size(); i++) {
                boolean isLast = (i == body.size() - 1);
                sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH);
                sb.append(body.get(i).accept(this));
            }
            indentLevel--;
        }
        // Else branch
        if (node.hasElseBranch()) {
            sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Else:").append(RESET).append("\n");
            indentLevel++;
            sb.append(indent()).append(LAST_BRANCH);
            sb.append(node.getElseBranch().accept(this));
            indentLevel--;
        }
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(IfBlockNode node) {
        StringBuilder sb = new StringBuilder();
        String extra = String.format("(elifCount: %d, hasElse: %s)", node.getElifBranches().size(), node.hasElseBranch());
        sb.append(nodeInfo(node, extra)).append("\n");

        indentLevel++;
        // Condition
        if (node.getCondition() != null) {
            sb.append(indent()).append(BRANCH).append(TEAL).append("Condition: ").append(RESET);
            sb.append(node.getCondition().accept(this));
        }
        // Body
        List<ASTNode> body = node.getBody();
        if (!body.isEmpty()) {
            sb.append(indent()).append(BRANCH).append(TEAL).append("Then:").append(RESET).append("\n");
            indentLevel++;
            for (int i = 0; i < body.size(); i++) {
                boolean isLast = (i == body.size() - 1);
                sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH);
                sb.append(body.get(i).accept(this));
            }
            indentLevel--;
        }
        // Elif branches
        List<ElifBranchNode> elifBranches = node.getElifBranches();
        for (int j = 0; j < elifBranches.size(); j++) {
            sb.append(indent()).append(BRANCH).append(TEAL).append("Elif " + (j + 1) + ":").append(RESET).append("\n");
            indentLevel++;
            sb.append(indent()).append(LAST_BRANCH);
            sb.append(elifBranches.get(j).accept(this));
            indentLevel--;
        }
        // Else branch
        if (node.hasElseBranch()) {
            sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Else:").append(RESET).append("\n");
            indentLevel++;
            sb.append(indent()).append(LAST_BRANCH);
            sb.append(node.getElseBranch().accept(this));
            indentLevel--;
        }
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(ElifBranchNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(nodeInfo(node, "")).append("\n");

        indentLevel++;
        if (node.getCondition() != null) {
            sb.append(indent()).append(BRANCH).append(TEAL).append("Condition: ").append(RESET);
            sb.append(node.getCondition().accept(this));
        }
        List<ASTNode> body = node.getBody();
        if (!body.isEmpty()) {
            sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Body:").append(RESET).append("\n");
            indentLevel++;
            for (int i = 0; i < body.size(); i++) {
                boolean isLast = (i == body.size() - 1);
                sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH);
                sb.append(body.get(i).accept(this));
            }
            indentLevel--;
        }
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(ElseBranchNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(nodeInfo(node, "(bodySize: " + node.getBody().size() + ")")).append("\n");

        indentLevel++;
        List<ASTNode> body = node.getBody();
        for (int i = 0; i < body.size(); i++) {
            boolean isLast = (i == body.size() - 1);
            sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH);
            sb.append(body.get(i).accept(this));
        }
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(BlockDefinitionNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(nodeInfo(node, "(name: " + node.getName() + ", scoped: " + node.isScoped() + ")")).append("\n");

        indentLevel++;
        List<ASTNode> children = node.getChildren();
        for (int i = 0; i < children.size(); i++) {
            boolean isLast = (i == children.size() - 1);
            sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH);
            sb.append(children.get(i).accept(this));
        }
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(MacroNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(nodeInfo(node, "(name: " + node.getName() + ", params: " + node.getParams().size() + ")")).append("\n");

        indentLevel++;
        // Parameters
        List<MacroParamNode> params = node.getParams();
        if (!params.isEmpty()) {
            sb.append(indent()).append(BRANCH).append(TEAL).append("Parameters:").append(RESET).append("\n");
            indentLevel++;
            for (int i = 0; i < params.size(); i++) {
                boolean isLast = (i == params.size() - 1);
                sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH);
                sb.append(params.get(i).accept(this));
            }
            indentLevel--;
        }
        // Body
        List<ASTNode> body = node.getBody();
        if (!body.isEmpty()) {
            sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Body:").append(RESET).append("\n");
            indentLevel++;
            for (int i = 0; i < body.size(); i++) {
                boolean isLast = (i == body.size() - 1);
                sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH);
                sb.append(body.get(i).accept(this));
            }
            indentLevel--;
        }
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(MacroParamNode node) {
        StringBuilder sb = new StringBuilder();
        String extra = node.hasDefaultValue()
            ? "(name: " + node.getName() + ", hasDefault: true)"
            : "(name: " + node.getName() + ")";
        sb.append(nodeInfo(node, extra)).append("\n");

        if (node.hasDefaultValue()) {
            indentLevel++;
            sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Default: ").append(RESET);
            sb.append(node.getDefaultValue().accept(this));
            indentLevel--;
        }

        return sb.toString();
    }

    @Override
    public String visit(WithBlockNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(nodeInfo(node, "(assignments: " + node.getAssignments().size() + ")")).append("\n");

        indentLevel++;
        // Assignments
        List<WithAssignmentNode> assignments = node.getAssignments();
        if (!assignments.isEmpty()) {
            sb.append(indent()).append(BRANCH).append(TEAL).append("Assignments:").append(RESET).append("\n");
            indentLevel++;
            for (int i = 0; i < assignments.size(); i++) {
                boolean isLast = (i == assignments.size() - 1);
                sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH);
                sb.append(assignments.get(i).accept(this));
            }
            indentLevel--;
        }
        // Body
        List<ASTNode> body = node.getBody();
        if (!body.isEmpty()) {
            sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Body:").append(RESET).append("\n");
            indentLevel++;
            for (int i = 0; i < body.size(); i++) {
                boolean isLast = (i == body.size() - 1);
                sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH);
                sb.append(body.get(i).accept(this));
            }
            indentLevel--;
        }
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(WithAssignmentNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(nodeInfo(node, "(name: " + node.getName() + ")")).append("\n");

        indentLevel++;
        if (node.getValue() != null) {
            sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Value: ").append(RESET);
            sb.append(node.getValue().accept(this));
        }
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(FilterBlockNode node) {
        StringBuilder sb = new StringBuilder();
        String argsInfo = node.hasArgs() ? ", args: " + node.getArgs().size() : "";
        sb.append(nodeInfo(node, "(name: " + node.getName() + argsInfo + ")")).append("\n");

        indentLevel++;
        // Args
        if (node.hasArgs()) {
            List<ArgumentNode> args = node.getArgs();
            sb.append(indent()).append(BRANCH).append(TEAL).append("Args:").append(RESET).append("\n");
            indentLevel++;
            for (int i = 0; i < args.size(); i++) {
                boolean isLast = (i == args.size() - 1);
                sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH);
                sb.append(args.get(i).accept(this));
            }
            indentLevel--;
        }
        // Body
        List<ASTNode> body = node.getBody();
        if (!body.isEmpty()) {
            sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Body:").append(RESET).append("\n");
            indentLevel++;
            for (int i = 0; i < body.size(); i++) {
                boolean isLast = (i == body.size() - 1);
                sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH);
                sb.append(body.get(i).accept(this));
            }
            indentLevel--;
        }
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(CallBlockNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(nodeInfo(node, "(callArgs: " + node.getCallArgs().size() + ", hasCallee: " + (node.getCallee() != null) + ")")).append("\n");

        indentLevel++;
        // Call args
        if (node.hasCallArgs()) {
            List<ArgumentNode> callArgs = node.getCallArgs();
            sb.append(indent()).append(BRANCH).append(TEAL).append("CallArgs:").append(RESET).append("\n");
            indentLevel++;
            for (int i = 0; i < callArgs.size(); i++) {
                boolean isLast = (i == callArgs.size() - 1);
                sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH);
                sb.append(callArgs.get(i).accept(this));
            }
            indentLevel--;
        }
        // Callee
        if (node.getCallee() != null) {
            sb.append(indent()).append(BRANCH).append(TEAL).append("Callee: ").append(RESET);
            sb.append(node.getCallee().accept(this));
        }
        // Body
        List<ASTNode> body = node.getBody();
        if (!body.isEmpty()) {
            sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Body:").append(RESET).append("\n");
            indentLevel++;
            for (int i = 0; i < body.size(); i++) {
                boolean isLast = (i == body.size() - 1);
                sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH);
                sb.append(body.get(i).accept(this));
            }
            indentLevel--;
        }
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(AutoescapeBlockNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(nodeInfo(node, "(bodySize: " + node.getBody().size() + ")")).append("\n");

        indentLevel++;
        // Escape mode
        if (node.getEscapeMode() != null) {
            sb.append(indent()).append(BRANCH).append(TEAL).append("Mode: ").append(RESET);
            sb.append(node.getEscapeMode().accept(this));
        }
        // Body
        List<ASTNode> body = node.getBody();
        if (!body.isEmpty()) {
            sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Body:").append(RESET).append("\n");
            indentLevel++;
            for (int i = 0; i < body.size(); i++) {
                boolean isLast = (i == body.size() - 1);
                sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH);
                sb.append(body.get(i).accept(this));
            }
            indentLevel--;
        }
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(EscapeModeNode node) {
        // Fallback for abstract base class - subclasses handle specific types
        return nodeInfo(node, "") + "\n";
    }

    @Override
    public String visit(BooleanEscapeModeNode node) {
        return nodeInfo(node, "(value: " + node.getValue() + ")") + "\n";
    }

    @Override
    public String visit(StringEscapeModeNode node) {
        return nodeInfo(node, "(value: \"" + node.getValue() + "\")") + "\n";
    }

    // ==================== Jinja2 Statements ====================
    @Override
    public String visit(ExtendsNode node) {
        return nodeInfo(node, "(parent: " + node.getParentTemplateName() + ")") + "\n";
    }

    @Override
    public String visit(IncludeNode node) {
        return nodeInfo(node, "(template: " + node.getIncludedTemplateName() + ")") + "\n";
    }

    @Override
    public String visit(SetStatementNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(nodeInfo(node, "")).append("\n");

        indentLevel++;
        if (node.getTarget() != null) {
            sb.append(indent()).append(BRANCH).append(TEAL).append("Target: ").append(RESET);
            sb.append(node.getTarget().accept(this));
        }
        if (node.getValue() != null) {
            sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Value: ").append(RESET);
            sb.append(node.getValue().accept(this));
        }
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(SetBlockNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(nodeInfo(node, "(name: " + node.getName() + ", bodySize: " + node.getBody().size() + ")")).append("\n");

        indentLevel++;
        List<ASTNode> body = node.getBody();
        for (int i = 0; i < body.size(); i++) {
            boolean isLast = (i == body.size() - 1);
            sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH);
            sb.append(body.get(i).accept(this));
        }
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(DoStatementNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(nodeInfo(node, "")).append("\n");

        indentLevel++;
        if (node.getExpression() != null) {
            sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Expression: ").append(RESET);
            sb.append(node.getExpression().accept(this));
        }
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(ImportNode node) {
        return nodeInfo(node, "(template: " + node.getTemplateName() + ", alias: " + node.getAlias() + ", contextMode: " + node.getContextMode() + ")") + "\n";
    }

    @Override
    public String visit(FromImportNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(nodeInfo(node, "(template: " + node.getTemplateName() + ", items: " + node.getItems().size() + ", contextMode: " + node.getContextMode() + ")")).append("\n");

        indentLevel++;
        List<FromImportItemNode> items = node.getItems();
        for (int i = 0; i < items.size(); i++) {
            boolean isLast = (i == items.size() - 1);
            sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH);
            sb.append(items.get(i).accept(this));
        }
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(FromImportItemNode node) {
        String extra = node.hasAlias()
            ? "(name: " + node.getName() + ", alias: " + node.getAlias() + ")"
            : "(name: " + node.getName() + ")";
        return nodeInfo(node, extra) + "\n";
    }

    // ==================== Jinja2 Expressions ====================
    @Override
    public String visit(JinjaExpressionNode node) {
        // This is an abstract base class, but we implement a fallback
        return nodeInfo(node, "") + "\n";
    }

    @Override
    public String visit(FilterNode node) {
        StringBuilder sb = new StringBuilder();
        String argsInfo = node.hasArgs() ? ", args: " + node.getArgs().size() : "";
        sb.append(nodeInfo(node, "(name: " + node.getName() + argsInfo + ")")).append("\n");

        if (node.hasArgs()) {
            indentLevel++;
            List<JinjaExpressionNode> args = node.getArgs();
            for (int i = 0; i < args.size(); i++) {
                boolean isLast = (i == args.size() - 1);
                sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH).append(TEAL).append("Arg: ").append(RESET);
                sb.append(args.get(i).accept(this));
            }
            indentLevel--;
        }

        return sb.toString();
    }

    @Override
    public String visit(VariableExprNode node) {
        return nodeInfo(node, "(name: " + node.getName() + ")") + "\n";
    }

    @Override
    public String visit(DotAccessExprNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(nodeInfo(node, "(property: " + node.getProperty() + ")")).append("\n");

        indentLevel++;
        if (node.getObject() != null) {
            sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Object: ").append(RESET);
            sb.append(node.getObject().accept(this));
        }
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(IndexAccessExprNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(nodeInfo(node, "")).append("\n");

        indentLevel++;
        if (node.getObject() != null) {
            sb.append(indent()).append(BRANCH).append(TEAL).append("Object: ").append(RESET);
            sb.append(node.getObject().accept(this));
        }
        if (node.getIndex() != null) {
            sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Index: ").append(RESET);
            sb.append(node.getIndex().accept(this));
        }
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(FunctionCallExprNode node) {
        StringBuilder sb = new StringBuilder();
        String funcName = node.getCallable() != null ? node.getCallable().getFullPath() : "?";
        sb.append(nodeInfo(node, "(func: " + funcName + ", args: " + node.getArguments().size() + ")")).append("\n");

        indentLevel++;
        if (node.getCallable() != null) {
            sb.append(indent()).append(BRANCH).append(TEAL).append("Callable: ").append(RESET);
            sb.append(node.getCallable().accept(this));
        }
        List<ArgumentNode> args = node.getArguments();
        for (int i = 0; i < args.size(); i++) {
            boolean isLast = (i == args.size() - 1);
            sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH).append(TEAL).append("Arg " + (i + 1) + ": ").append(RESET);
            sb.append(args.get(i).accept(this));
        }
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(ParenExprNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(nodeInfo(node, "")).append("\n");

        indentLevel++;
        if (node.getExpression() != null) {
            sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Expression: ").append(RESET);
            sb.append(node.getExpression().accept(this));
        }
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(SliceExprNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(nodeInfo(node, "")).append("\n");

        indentLevel++;
        if (node.getObject() != null) {
            sb.append(indent()).append(BRANCH).append(TEAL).append("Object: ").append(RESET);
            sb.append(node.getObject().accept(this));
        }
        if (node.hasStart()) {
            sb.append(indent()).append(BRANCH).append(TEAL).append("Start: ").append(RESET);
            sb.append(node.getStart().accept(this));
        }
        if (node.hasStop()) {
            sb.append(indent()).append(BRANCH).append(TEAL).append("Stop: ").append(RESET);
            sb.append(node.getStop().accept(this));
        }
        if (node.hasStep()) {
            sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Step: ").append(RESET);
            sb.append(node.getStep().accept(this));
        }
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(TernaryExprNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(nodeInfo(node, "")).append("\n");

        indentLevel++;
        if (node.getTrueValue() != null) {
            sb.append(indent()).append(BRANCH).append(TEAL).append("TrueValue: ").append(RESET);
            sb.append(node.getTrueValue().accept(this));
        }
        if (node.getCondition() != null) {
            sb.append(indent()).append(BRANCH).append(TEAL).append("Condition: ").append(RESET);
            sb.append(node.getCondition().accept(this));
        }
        if (node.getFalseValue() != null) {
            sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("FalseValue: ").append(RESET);
            sb.append(node.getFalseValue().accept(this));
        }
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(TestExprNode node) {
        StringBuilder sb = new StringBuilder();
        String extra = String.format("(test: %s%s%s)",
            node.isNegated() ? "not " : "",
            node.getTestName(),
            !node.getArguments().isEmpty() ? ", args: " + node.getArguments().size() : "");
        sb.append(nodeInfo(node, extra)).append("\n");

        indentLevel++;
        if (node.getExpression() != null) {
            sb.append(indent()).append(BRANCH).append(TEAL).append("Expression: ").append(RESET);
            sb.append(node.getExpression().accept(this));
        }
        List<JinjaExpressionNode> args = node.getArguments();
        for (int i = 0; i < args.size(); i++) {
            boolean isLast = (i == args.size() - 1);
            sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH).append(TEAL).append("Arg: ").append(RESET);
            sb.append(args.get(i).accept(this));
        }
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(ArgumentNode node) {
        StringBuilder sb = new StringBuilder();
        String extra = node.getName() != null
            ? "(keyword: " + node.getName() + ")"
            : "(positional)";
        sb.append(nodeInfo(node, extra)).append("\n");

        indentLevel++;
        if (node.getValue() != null) {
            sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Value: ").append(RESET);
            sb.append(node.getValue().accept(this));
        }
        indentLevel--;

        return sb.toString();
    }

    // ==================== Jinja2 Literals ====================
    @Override
    public String visit(JinjaBooleanNode node) {
        return nodeInfo(node, "(value: " + node.getValue() + ")") + "\n";
    }

    @Override
    public String visit(JinjaStringNode node) {
        return nodeInfo(node, "(value: \"" + node.getValue() + "\")") + "\n";
    }

    @Override
    public String visit(JinjaNumberIntegerNode node) {
        return nodeInfo(node, "(value: " + node.getValue() + ")") + "\n";
    }

    @Override
    public String visit(JinjaNumberDoubleNode node) {
        return nodeInfo(node, "(value: " + node.getValue() + ")") + "\n";
    }

    @Override
    public String visit(JinjaNoneNode node) {
        return nodeInfo(node, "") + "\n";
    }

    @Override
    public String visit(JinjaListNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(nodeInfo(node, "(elements: " + node.getElements().size() + ")")).append("\n");

        indentLevel++;
        List<JinjaExpressionNode> elements = node.getElements();
        for (int i = 0; i < elements.size(); i++) {
            boolean isLast = (i == elements.size() - 1);
            sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH);
            sb.append(elements.get(i).accept(this));
        }
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(JinjaDictNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(nodeInfo(node, "(entries: " + node.getElements().size() + ")")).append("\n");

        indentLevel++;
        List<JinjaDictEntryNode> elements = node.getElements();
        for (int i = 0; i < elements.size(); i++) {
            boolean isLast = (i == elements.size() - 1);
            sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH);
            sb.append(elements.get(i).accept(this));
        }
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(JinjaDictEntryNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(nodeInfo(node, "")).append("\n");

        indentLevel++;
        if (node.getKey() != null) {
            sb.append(indent()).append(BRANCH).append(TEAL).append("Key: ").append(RESET);
            sb.append(node.getKey().accept(this));
        }
        if (node.getValue() != null) {
            sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Value: ").append(RESET);
            sb.append(node.getValue().accept(this));
        }
        indentLevel--;

        return sb.toString();
    }

    // ==================== Jinja2 Operations ====================
    @Override
    public String visit(JinjaBinaryOpNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(nodeInfo(node, "(op: " + node.getOperator().getSymbol() + ")")).append("\n");

        indentLevel++;
        if (node.getLeft() != null) {
            sb.append(indent()).append(BRANCH).append(TEAL).append("Left: ").append(RESET);
            sb.append(node.getLeft().accept(this));
        }
        if (node.getRight() != null) {
            sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Right: ").append(RESET);
            sb.append(node.getRight().accept(this));
        }
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(JinjaUnaryOpNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(nodeInfo(node, "(op: " + node.getOperator().getSymbol() + ")")).append("\n");

        indentLevel++;
        if (node.getOperand() != null) {
            sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Operand: ").append(RESET);
            sb.append(node.getOperand().accept(this));
        }
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(JinjaComparisonNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(nodeInfo(node, "(op: " + node.getOperator().getSymbol() + ")")).append("\n");

        indentLevel++;
        if (node.getLeft() != null) {
            sb.append(indent()).append(BRANCH).append(TEAL).append("Left: ").append(RESET);
            sb.append(node.getLeft().accept(this));
        }
        if (node.getRight() != null) {
            sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Right: ").append(RESET);
            sb.append(node.getRight().accept(this));
        }
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(JinjaLogicalOpNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(nodeInfo(node, "(op: " + node.getOperator().getSymbol() + ")")).append("\n");

        indentLevel++;
        if (node.getLeft() != null) {
            sb.append(indent()).append(BRANCH).append(TEAL).append("Left: ").append(RESET);
            sb.append(node.getLeft().accept(this));
        }
        if (node.getRight() != null) {
            sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Right: ").append(RESET);
            sb.append(node.getRight().accept(this));
        }
        indentLevel--;

        return sb.toString();
    }

    // ==================== Jinja2 Targets ====================
    @Override
    public String visit(TargetNode node) {
        // Fallback for abstract base class - subclasses handle specific types
        return nodeInfo(node, "") + "\n";
    }

    @Override
    public String visit(SimpleTargetNode node) {
        return nodeInfo(node, "(target: " + node.getTarget() + ")") + "\n";
    }

    @Override
    public String visit(TupleTargetNode node) {
        return nodeInfo(node, "(targets: " + String.join(", ", node.getTargets()) + ")") + "\n";
    }

    @Override
    public String visit(NamespaceTargetNode node) {
        return nodeInfo(node, "(namespace: " + node.getNameSpace() + ", attrs: " + String.join(".", node.getAttributes()) + ")") + "\n";
    }
    // ==================== HTML Nodes ====================

    // ==================== HTML Element Nodes ====================

    // Base HTML Element Node
    @Override
    public String visit(HtmlElementNode node) {
        StringBuilder sb = new StringBuilder();
        String extra = String.format("(tag: %s, attrs: %d, canHaveChildren: %s)",
            node.getTagName(),
            node.getAttributes().size(),
            node.canHaveChildren());
        sb.append(nodeInfo(node, extra)).append("\n");

        indentLevel++;
        // Attributes
        List<HtmlAttributeNode> attrs = node.getAttributes();
        if (!attrs.isEmpty()) {
            for (int i = 0; i < attrs.size(); i++) {
                boolean isLast = (i == attrs.size() - 1) && node.getChildNodes().isEmpty();
                sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH).append(TEAL).append("Attribute: ").append(RESET);
                sb.append(attrs.get(i).accept(this));
            }
        }

        // Child nodes
        List<ASTNode> children = node.getChildNodes();
        for (int i = 0; i < children.size(); i++) {
            boolean isLast = i == children.size() - 1;
            sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH).append(DARK).append("Child: ").append(RESET);
            sb.append(children.get(i).accept(this));
        }
        indentLevel--;

        return sb.toString();
    }

    // HTML Attribute Value Node
    @Override
    public String visit(HtmlAttributeValueNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(nodeInfo(node, "(parts: " + node.getParts().size() + ")")).append("\n");

        indentLevel++;
        List<ASTNode> parts = node.getParts();
        for (int i = 0; i < parts.size(); i++) {
            boolean isLast = i == parts.size() - 1;
            sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH).append(TEAL).append("Part: ").append(RESET);
            sb.append(parts.get(i).accept(this));
        }
        indentLevel--;

        return sb.toString();
    }

    // ==================== Specific HTML Element Nodes ====================

    // Document structure elements
    @Override
    public String visit(HtmlRootHtmlNode node) {
        StringBuilder sb = new StringBuilder();
        String extra = String.format("(tag: %s, attrs: %d, children: %d%s)",
            node.getTagName(),
            node.getAttributes().size(),
            node.getChildNodes().size(),
            node.isImplicitlyClosed() ? ", implicit" : "");
        sb.append(nodeInfo(node, extra)).append("\n");

        indentLevel++;
        // Attributes
        List<HtmlAttributeNode> attrs = node.getAttributes();
        if (!attrs.isEmpty()) {
            sb.append(indent()).append(BRANCH).append(TEAL).append("Attributes:").append(RESET).append("\n");
            indentLevel++;
            for (int i = 0; i < attrs.size(); i++) {
                boolean isLast = (i == attrs.size() - 1);
                sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH);
                sb.append(attrs.get(i).accept(this));
            }
            indentLevel--;
        }
        // Children
        List<ASTNode> children = node.getChildNodes();
        if (!children.isEmpty()) {
            sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Children:").append(RESET).append("\n");
            indentLevel++;
            for (int i = 0; i < children.size(); i++) {
                boolean isLast = (i == children.size() - 1);
                sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH);
                sb.append(children.get(i).accept(this));
            }
            indentLevel--;
        }
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(HeadHtmlNode node) {
        StringBuilder sb = new StringBuilder();
        String extra = String.format("(tag: %s, attrs: %d, children: %d%s)",
            node.getTagName(),
            node.getAttributes().size(),
            node.getChildNodes().size(),
            node.isImplicitlyClosed() ? ", implicit" : "");
        sb.append(nodeInfo(node, extra)).append("\n");

        indentLevel++;
        // Attributes
        List<HtmlAttributeNode> attrs = node.getAttributes();
        if (!attrs.isEmpty()) {
            sb.append(indent()).append(BRANCH).append(TEAL).append("Attributes:").append(RESET).append("\n");
            indentLevel++;
            for (int i = 0; i < attrs.size(); i++) {
                boolean isLast = (i == attrs.size() - 1);
                sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH);
                sb.append(attrs.get(i).accept(this));
            }
            indentLevel--;
        }
        // Children
        List<ASTNode> children = node.getChildNodes();
        if (!children.isEmpty()) {
            sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Children:").append(RESET).append("\n");
            indentLevel++;
            for (int i = 0; i < children.size(); i++) {
                boolean isLast = (i == children.size() - 1);
                sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH);
                sb.append(children.get(i).accept(this));
            }
            indentLevel--;
        }
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(BodyHtmlNode node) {
        StringBuilder sb = new StringBuilder();
        String extra = String.format("(tag: %s, attrs: %d, children: %d%s)",
            node.getTagName(),
            node.getAttributes().size(),
            node.getChildNodes().size(),
            node.isImplicitlyClosed() ? ", implicit" : "");
        sb.append(nodeInfo(node, extra)).append("\n");

        indentLevel++;
        // Attributes
        List<HtmlAttributeNode> attrs = node.getAttributes();
        if (!attrs.isEmpty()) {
            sb.append(indent()).append(BRANCH).append(TEAL).append("Attributes:").append(RESET).append("\n");
            indentLevel++;
            for (int i = 0; i < attrs.size(); i++) {
                boolean isLast = (i == attrs.size() - 1);
                sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH);
                sb.append(attrs.get(i).accept(this));
            }
            indentLevel--;
        }
        // Children
        List<ASTNode> children = node.getChildNodes();
        if (!children.isEmpty()) {
            sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Children:").append(RESET).append("\n");
            indentLevel++;
            for (int i = 0; i < children.size(); i++) {
                boolean isLast = (i == children.size() - 1);
                sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH);
                sb.append(children.get(i).accept(this));
            }
            indentLevel--;
        }
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(TitleHtmlNode node) {
        StringBuilder sb = new StringBuilder();
        String extra = String.format("(tag: %s, attrs: %d, children: %d%s)",
            node.getTagName(),
            node.getAttributes().size(),
            node.getChildNodes().size(),
            node.isImplicitlyClosed() ? ", implicit" : "");
        sb.append(nodeInfo(node, extra)).append("\n");

        indentLevel++;
        // Attributes
        List<HtmlAttributeNode> attrs = node.getAttributes();
        if (!attrs.isEmpty()) {
            sb.append(indent()).append(BRANCH).append(TEAL).append("Attributes:").append(RESET).append("\n");
            indentLevel++;
            for (int i = 0; i < attrs.size(); i++) {
                boolean isLast = (i == attrs.size() - 1);
                sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH);
                sb.append(attrs.get(i).accept(this));
            }
            indentLevel--;
        }
        // Children
        List<ASTNode> children = node.getChildNodes();
        if (!children.isEmpty()) {
            sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Children:").append(RESET).append("\n");
            indentLevel++;
            for (int i = 0; i < children.size(); i++) {
                boolean isLast = (i == children.size() - 1);
                sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH);
                sb.append(children.get(i).accept(this));
            }
            indentLevel--;
        }
        indentLevel--;

        return sb.toString();
    }

    // Sectioning elements
    @Override
    public String visit(DivHtmlNode node) {
        StringBuilder sb = new StringBuilder();
        String extra = String.format("(tag: %s, attrs: %d, children: %d%s)",
            node.getTagName(),
            node.getAttributes().size(),
            node.getChildNodes().size(),
            node.isImplicitlyClosed() ? ", implicit" : "");
        sb.append(nodeInfo(node, extra)).append("\n");

        indentLevel++;
        // Attributes
        List<HtmlAttributeNode> attrs = node.getAttributes();
        if (!attrs.isEmpty()) {
            sb.append(indent()).append(BRANCH).append(TEAL).append("Attributes:").append(RESET).append("\n");
            indentLevel++;
            for (int i = 0; i < attrs.size(); i++) {
                boolean isLast = (i == attrs.size() - 1);
                sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH);
                sb.append(attrs.get(i).accept(this));
            }
            indentLevel--;
        }
        // Children
        List<ASTNode> children = node.getChildNodes();
        if (!children.isEmpty()) {
            sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Children:").append(RESET).append("\n");
            indentLevel++;
            for (int i = 0; i < children.size(); i++) {
                boolean isLast = (i == children.size() - 1);
                sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH);
                sb.append(children.get(i).accept(this));
            }
            indentLevel--;
        }
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(H1HtmlNode node) {
        StringBuilder sb = new StringBuilder();
        String extra = String.format("(tag: %s, attrs: %d, children: %d%s)",
            node.getTagName(),
            node.getAttributes().size(),
            node.getChildNodes().size(),
            node.isImplicitlyClosed() ? ", implicit" : "");
        sb.append(nodeInfo(node, extra)).append("\n");

        indentLevel++;
        // Attributes
        List<HtmlAttributeNode> attrs = node.getAttributes();
        if (!attrs.isEmpty()) {
            sb.append(indent()).append(BRANCH).append(TEAL).append("Attributes:").append(RESET).append("\n");
            indentLevel++;
            for (int i = 0; i < attrs.size(); i++) {
                boolean isLast = (i == attrs.size() - 1);
                sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH);
                sb.append(attrs.get(i).accept(this));
            }
            indentLevel--;
        }
        // Children
        List<ASTNode> children = node.getChildNodes();
        if (!children.isEmpty()) {
            sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Children:").append(RESET).append("\n");
            indentLevel++;
            for (int i = 0; i < children.size(); i++) {
                boolean isLast = (i == children.size() - 1);
                sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH);
                sb.append(children.get(i).accept(this));
            }
            indentLevel--;
        }
        indentLevel--;

        return sb.toString();
    }

    // Text elements
    @Override
    public String visit(ParagraphHtmlNode node) {
        StringBuilder sb = new StringBuilder();
        String extra = String.format("(tag: %s, attrs: %d, children: %d%s)",
            node.getTagName(),
            node.getAttributes().size(),
            node.getChildNodes().size(),
            node.isImplicitlyClosed() ? ", implicit" : "");
        sb.append(nodeInfo(node, extra)).append("\n");

        indentLevel++;
        // Attributes
        List<HtmlAttributeNode> attrs = node.getAttributes();
        if (!attrs.isEmpty()) {
            sb.append(indent()).append(BRANCH).append(TEAL).append("Attributes:").append(RESET).append("\n");
            indentLevel++;
            for (int i = 0; i < attrs.size(); i++) {
                boolean isLast = (i == attrs.size() - 1);
                sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH);
                sb.append(attrs.get(i).accept(this));
            }
            indentLevel--;
        }
        // Children
        List<ASTNode> children = node.getChildNodes();
        if (!children.isEmpty()) {
            sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Children:").append(RESET).append("\n");
            indentLevel++;
            for (int i = 0; i < children.size(); i++) {
                boolean isLast = (i == children.size() - 1);
                sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH);
                sb.append(children.get(i).accept(this));
            }
            indentLevel--;
        }
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(AnchorHtmlNode node) {
        StringBuilder sb = new StringBuilder();
        String extra = String.format("(tag: %s, attrs: %d, children: %d%s)",
            node.getTagName(),
            node.getAttributes().size(),
            node.getChildNodes().size(),
            node.isImplicitlyClosed() ? ", implicit" : "");
        sb.append(nodeInfo(node, extra)).append("\n");

        indentLevel++;
        // Attributes
        List<HtmlAttributeNode> attrs = node.getAttributes();
        if (!attrs.isEmpty()) {
            sb.append(indent()).append(BRANCH).append(TEAL).append("Attributes:").append(RESET).append("\n");
            indentLevel++;
            for (int i = 0; i < attrs.size(); i++) {
                boolean isLast = (i == attrs.size() - 1);
                sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH);
                sb.append(attrs.get(i).accept(this));
            }
            indentLevel--;
        }
        // Children
        List<ASTNode> children = node.getChildNodes();
        if (!children.isEmpty()) {
            sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Children:").append(RESET).append("\n");
            indentLevel++;
            for (int i = 0; i < children.size(); i++) {
                boolean isLast = (i == children.size() - 1);
                sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH);
                sb.append(children.get(i).accept(this));
            }
            indentLevel--;
        }
        indentLevel--;

        return sb.toString();
    }

    // Form elements
    @Override
    public String visit(FormHtmlNode node) {
        StringBuilder sb = new StringBuilder();
        String extra = String.format("(tag: %s, attrs: %d, children: %d%s)",
            node.getTagName(),
            node.getAttributes().size(),
            node.getChildNodes().size(),
            node.isImplicitlyClosed() ? ", implicit" : "");
        sb.append(nodeInfo(node, extra)).append("\n");

        indentLevel++;
        // Attributes
        List<HtmlAttributeNode> attrs = node.getAttributes();
        if (!attrs.isEmpty()) {
            sb.append(indent()).append(BRANCH).append(TEAL).append("Attributes:").append(RESET).append("\n");
            indentLevel++;
            for (int i = 0; i < attrs.size(); i++) {
                boolean isLast = (i == attrs.size() - 1);
                sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH);
                sb.append(attrs.get(i).accept(this));
            }
            indentLevel--;
        }
        // Children
        List<ASTNode> children = node.getChildNodes();
        if (!children.isEmpty()) {
            sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Children:").append(RESET).append("\n");
            indentLevel++;
            for (int i = 0; i < children.size(); i++) {
                boolean isLast = (i == children.size() - 1);
                sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH);
                sb.append(children.get(i).accept(this));
            }
            indentLevel--;
        }
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(LabelHtmlNode node) {
        StringBuilder sb = new StringBuilder();
        String extra = String.format("(tag: %s, attrs: %d, children: %d%s)",
            node.getTagName(),
            node.getAttributes().size(),
            node.getChildNodes().size(),
            node.isImplicitlyClosed() ? ", implicit" : "");
        sb.append(nodeInfo(node, extra)).append("\n");

        indentLevel++;
        // Attributes
        List<HtmlAttributeNode> attrs = node.getAttributes();
        if (!attrs.isEmpty()) {
            sb.append(indent()).append(BRANCH).append(TEAL).append("Attributes:").append(RESET).append("\n");
            indentLevel++;
            for (int i = 0; i < attrs.size(); i++) {
                boolean isLast = (i == attrs.size() - 1);
                sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH);
                sb.append(attrs.get(i).accept(this));
            }
            indentLevel--;
        }
        // Children
        List<ASTNode> children = node.getChildNodes();
        if (!children.isEmpty()) {
            sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Children:").append(RESET).append("\n");
            indentLevel++;
            for (int i = 0; i < children.size(); i++) {
                boolean isLast = (i == children.size() - 1);
                sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH);
                sb.append(children.get(i).accept(this));
            }
            indentLevel--;
        }
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(TextareaHtmlNode node) {
        StringBuilder sb = new StringBuilder();
        String extra = String.format("(tag: %s, attrs: %d, children: %d%s)",
            node.getTagName(),
            node.getAttributes().size(),
            node.getChildNodes().size(),
            node.isImplicitlyClosed() ? ", implicit" : "");
        sb.append(nodeInfo(node, extra)).append("\n");

        indentLevel++;
        // Attributes
        List<HtmlAttributeNode> attrs = node.getAttributes();
        if (!attrs.isEmpty()) {
            sb.append(indent()).append(BRANCH).append(TEAL).append("Attributes:").append(RESET).append("\n");
            indentLevel++;
            for (int i = 0; i < attrs.size(); i++) {
                boolean isLast = (i == attrs.size() - 1);
                sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH);
                sb.append(attrs.get(i).accept(this));
            }
            indentLevel--;
        }
        // Children
        List<ASTNode> children = node.getChildNodes();
        if (!children.isEmpty()) {
            sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Children:").append(RESET).append("\n");
            indentLevel++;
            for (int i = 0; i < children.size(); i++) {
                boolean isLast = (i == children.size() - 1);
                sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH);
                sb.append(children.get(i).accept(this));
            }
            indentLevel--;
        }
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(ButtonHtmlNode node) {
        StringBuilder sb = new StringBuilder();
        String extra = String.format("(tag: %s, attrs: %d, children: %d%s)",
            node.getTagName(),
            node.getAttributes().size(),
            node.getChildNodes().size(),
            node.isImplicitlyClosed() ? ", implicit" : "");
        sb.append(nodeInfo(node, extra)).append("\n");

        indentLevel++;
        // Attributes
        List<HtmlAttributeNode> attrs = node.getAttributes();
        if (!attrs.isEmpty()) {
            sb.append(indent()).append(BRANCH).append(TEAL).append("Attributes:").append(RESET).append("\n");
            indentLevel++;
            for (int i = 0; i < attrs.size(); i++) {
                boolean isLast = (i == attrs.size() - 1);
                sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH);
                sb.append(attrs.get(i).accept(this));
            }
            indentLevel--;
        }
        // Children
        List<ASTNode> children = node.getChildNodes();
        if (!children.isEmpty()) {
            sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Children:").append(RESET).append("\n");
            indentLevel++;
            for (int i = 0; i < children.size(); i++) {
                boolean isLast = (i == children.size() - 1);
                sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH);
                sb.append(children.get(i).accept(this));
            }
            indentLevel--;
        }
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(InputHtmlNode node) {
        StringBuilder sb = new StringBuilder();
        String extra = String.format("(tag: %s, attrs: %d)",
            node.getTagName(),
            node.getAttributes().size());
        sb.append(nodeInfo(node, extra)).append("\n");

        indentLevel++;
        // Attributes
        List<HtmlAttributeNode> attrs = node.getAttributes();
        if (!attrs.isEmpty()) {
            sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Attributes:").append(RESET).append("\n");
            indentLevel++;
            for (int i = 0; i < attrs.size(); i++) {
                boolean isLast = (i == attrs.size() - 1);
                sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH);
                sb.append(attrs.get(i).accept(this));
            }
            indentLevel--;
        }
        indentLevel--;

        return sb.toString();
    }

    // Media elements
    @Override
    public String visit(ImgHtmlNode node) {
        StringBuilder sb = new StringBuilder();
        String extra = String.format("(tag: %s, attrs: %d)",
            node.getTagName(),
            node.getAttributes().size());
        sb.append(nodeInfo(node, extra)).append("\n");

        indentLevel++;
        // Attributes
        List<HtmlAttributeNode> attrs = node.getAttributes();
        if (!attrs.isEmpty()) {
            sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Attributes:").append(RESET).append("\n");
            indentLevel++;
            for (int i = 0; i < attrs.size(); i++) {
                boolean isLast = (i == attrs.size() - 1);
                sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH);
                sb.append(attrs.get(i).accept(this));
            }
            indentLevel--;
        }
        indentLevel--;

        return sb.toString();
    }

    // Embedded elements
    @Override
    public String visit(StyleHtmlNode node) {
        StringBuilder sb = new StringBuilder();
        String extra = String.format("(tag: %s, attrs: %d, children: %d%s)",
            node.getTagName(),
            node.getAttributes().size(),
            node.getChildNodes().size(),
            node.isImplicitlyClosed() ? ", implicit" : "");
        sb.append(nodeInfo(node, extra)).append("\n");

        indentLevel++;
        // Attributes
        List<HtmlAttributeNode> attrs = node.getAttributes();
        if (!attrs.isEmpty()) {
            sb.append(indent()).append(BRANCH).append(TEAL).append("Attributes:").append(RESET).append("\n");
            indentLevel++;
            for (int i = 0; i < attrs.size(); i++) {
                boolean isLast = (i == attrs.size() - 1);
                sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH);
                sb.append(attrs.get(i).accept(this));
            }
            indentLevel--;
        }
        // Children
        List<ASTNode> children = node.getChildNodes();
        if (!children.isEmpty()) {
            sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Children:").append(RESET).append("\n");
            indentLevel++;
            for (int i = 0; i < children.size(); i++) {
                boolean isLast = (i == children.size() - 1);
                sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH);
                sb.append(children.get(i).accept(this));
            }
            indentLevel--;
        }
        indentLevel--;

        return sb.toString();
    }

    // Generic element
    @Override
    public String visit(GenericHtmlNode node) {
        StringBuilder sb = new StringBuilder();
        String extra = String.format("(tag: %s, attrs: %d, children: %d%s)",
            node.getTagName(),
            node.getAttributes().size(),
            node.getChildNodes().size(),
            node.isImplicitlyClosed() ? ", implicit" : "");
        sb.append(nodeInfo(node, extra)).append("\n");

        indentLevel++;
        // Attributes
        List<HtmlAttributeNode> attrs = node.getAttributes();
        if (!attrs.isEmpty()) {
            sb.append(indent()).append(BRANCH).append(TEAL).append("Attributes:").append(RESET).append("\n");
            indentLevel++;
            for (int i = 0; i < attrs.size(); i++) {
                boolean isLast = (i == attrs.size() - 1);
                sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH);
                sb.append(attrs.get(i).accept(this));
            }
            indentLevel--;
        }
        // Children
        List<ASTNode> children = node.getChildNodes();
        if (!children.isEmpty()) {
            sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Children:").append(RESET).append("\n");
            indentLevel++;
            for (int i = 0; i < children.size(); i++) {
                boolean isLast = (i == children.size() - 1);
                sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH);
                sb.append(children.get(i).accept(this));
            }
            indentLevel--;
        }
        indentLevel--;

        return sb.toString();
    }

    // HTML Attribute
    @Override
    public String visit(HtmlAttributeNode node) {
        StringBuilder sb = new StringBuilder();
        String extra = String.format("(name: %s, quote: %s%s)",
            node.getNameAsString(),
            node.getQuoteStyle().name().toLowerCase(),
            node.isBooleanAttribute() ? ", boolean" : "");
        sb.append(nodeInfo(node, extra)).append("\n");

        indentLevel++;
        if (node.hasValue() && node.getValue() != null) {
            sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Value: ").append(RESET);
            // HtmlAttributeValueNode doesn't have visitor yet, so just show info
            sb.append(LIGHT).append("[attribute value]").append(RESET).append("\n");
        }
        indentLevel--;

        return sb.toString();
    }

    // ==================== CSS Nodes ====================

    @Override
    public String visit(StylesheetNode node) {
        return nodeInfo(node, "") + "\n";
    }

    @Override
    public String visit(CSSStylesheetNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(nodeInfo(node, "(rules: " + node.getRules().size() + ")")).append("\n");

        indentLevel++;
        List<CSSRuleNode> rules = node.getRules();
        for (int i = 0; i < rules.size(); i++) {
            boolean isLast = (i == rules.size() - 1);
            sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH);
            sb.append(rules.get(i).accept(this));
        }
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(CSSRuleNode node) {
        StringBuilder sb = new StringBuilder();
        String selectorText = node.getSelectors().stream()
            .map(sel -> sel.getSelectorText())
            .collect(java.util.stream.Collectors.joining(", "));
        sb.append(nodeInfo(node, "(selectors: \"" + selectorText + "\", declarations: " + node.getDeclarations().size() + ")")).append("\n");

        indentLevel++;

        // Print selectors
        List<CSSSelectorNode> selectors = node.getSelectors();
        if (!selectors.isEmpty()) {
            sb.append(indent()).append(BRANCH).append(TEAL).append("Selectors:").append(RESET).append("\n");
            indentLevel++;
            for (int i = 0; i < selectors.size(); i++) {
                boolean isLast = (i == selectors.size() - 1);
                sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH);
                sb.append(selectors.get(i).accept(this));
            }
            indentLevel--;
        }

        // Print declarations
        List<CSSDeclarationNode> declarations = node.getDeclarations();
        if (!declarations.isEmpty()) {
            boolean selectorsExist = !selectors.isEmpty();
            sb.append(indent()).append(selectorsExist ? LAST_BRANCH : BRANCH).append(TEAL).append("Declarations:").append(RESET).append("\n");
            indentLevel++;
            for (int i = 0; i < declarations.size(); i++) {
                boolean isLast = (i == declarations.size() - 1);
                sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH);
                sb.append(declarations.get(i).accept(this));
            }
            indentLevel--;
        }

        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(CSSDeclarationNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(nodeInfo(node, "(property: \"" + node.getProperty() + "\", values: " + node.getValues().size() + ")")).append("\n");

        indentLevel++;
        List<CSSValueNode> values = node.getValues();
        for (int i = 0; i < values.size(); i++) {
            boolean isLast = (i == values.size() - 1);
            sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH).append(TEAL).append("Value: ").append(RESET);
            sb.append(values.get(i).accept(this));
        }
        indentLevel--;

        return sb.toString();
    }

    // ==================== CSS Selector Nodes ====================

    @Override
    public String visit(CSSElementSelectorNode node) {
        return nodeInfo(node, "(element: \"" + node.getElementName() + "\")") + "\n";
    }

    @Override
    public String visit(CSSClassSelectorNode node) {
        return nodeInfo(node, "(class: \"" + node.getClassName() + "\")") + "\n";
    }

    @Override
    public String visit(CSSPseudoClassSelectorNode node) {
        return nodeInfo(node, "(pseudo: \"" + node.getPseudoClass() + "\")") + "\n";
    }

    @Override
    public String visit(CSSDescendantSelectorNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(nodeInfo(node, "(descendant: \"" + node.getSelectorText() + "\")")).append("\n");

        indentLevel++;

        // Print ancestor
        if (node.getAncestor() != null) {
            sb.append(indent()).append(BRANCH).append(TEAL).append("Ancestor: ").append(RESET);
            sb.append(node.getAncestor().accept(this));
        }

        // Print descendants
        List<CSSSelectorNode> descendants = node.getDescendants();
        if (!descendants.isEmpty()) {
            sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Descendants:").append(RESET).append("\n");
            indentLevel++;
            for (int i = 0; i < descendants.size(); i++) {
                boolean isLast = (i == descendants.size() - 1);
                sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH);
                sb.append(descendants.get(i).accept(this));
            }
            indentLevel--;
        }

        indentLevel--;

        return sb.toString();
    }

    // ==================== CSS Property Nodes ====================

    @Override
    public String visit(LengthPropertyNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(nodeInfo(node, "(property: " + node.getPropertyName() + ")")).append("\n");

        indentLevel++;
        sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Value: ").append(RESET);
        sb.append(node.getValue().accept(this));
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(MultiLengthPropertyNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(nodeInfo(node, "(property: " + node.getPropertyName() + ", values: " + node.getLengthValues().size() + ")")).append("\n");

        indentLevel++;
        List<CSSLengthValueNode> values = node.getLengthValues();
        for (int i = 0; i < values.size(); i++) {
            boolean isLast = (i == values.size() - 1);
            sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH).append(TEAL).append("Value " + (i + 1) + ": ").append(RESET);
            sb.append(values.get(i).accept(this));
        }
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(ColorPropertyNode node) {
        StringBuilder sb = new StringBuilder();
        String type = node.isColorLiteral() ? "color-literal" : "keyword";
        sb.append(nodeInfo(node, "(property: " + node.getPropertyName() + ", type: " + type + ")")).append("\n");

        indentLevel++;
        sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Value: ").append(RESET);
        sb.append(node.getColorValue().accept(this));
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(KeywordPropertyNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(nodeInfo(node, "(property: " + node.getPropertyName() + ", keyword: " + node.getKeywordValue() + ")")).append("\n");

        indentLevel++;
        sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Value: ").append(RESET);
        sb.append(node.getKeyword().accept(this));
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(BoxShadowPropertyNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(nodeInfo(node, "(property: box-shadow, shadows: " + node.getShadows().size() + ")")).append("\n");

        indentLevel++;
        List<BoxShadowPropertyNode.Shadow> shadows = node.getShadows();
        for (int i = 0; i < shadows.size(); i++) {
            BoxShadowPropertyNode.Shadow shadow = shadows.get(i);
            boolean isLast = (i == shadows.size() - 1);
            sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH).append(TEAL).append("Shadow " + (i + 1) + ":").append(RESET).append("\n");

            indentLevel++;
            sb.append(indent()).append(BRANCH).append(TEAL).append("OffsetX: ").append(RESET);
            sb.append(shadow.offsetX.accept(this));
            sb.append(indent()).append(BRANCH).append(TEAL).append("OffsetY: ").append(RESET);
            sb.append(shadow.offsetY.accept(this));
            sb.append(indent()).append(BRANCH).append(TEAL).append("Blur: ").append(RESET);
            sb.append(shadow.blur.accept(this));
            sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Color: ").append(RESET);
            sb.append(shadow.color.accept(this));
            indentLevel--;
        }
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(BorderPropertyNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(nodeInfo(node, "(property: " + node.getPropertyName() + ")")).append("\n");

        indentLevel++;
        sb.append(indent()).append(BRANCH).append(TEAL).append("Width: ").append(RESET);
        sb.append(node.getWidth().accept(this));
        sb.append(indent()).append(BRANCH).append(TEAL).append("Style: ").append(RESET);
        sb.append(node.getStyle().accept(this));
        sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Color: ").append(RESET);
        sb.append(node.getColor().accept(this));
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(TransitionPropertyNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(nodeInfo(node, "(property: transition)")).append("\n");

        indentLevel++;
        sb.append(indent()).append(BRANCH).append(TEAL).append("Property: ").append(RESET);
        sb.append(node.getProperty().accept(this));
        sb.append(indent()).append(BRANCH).append(TEAL).append("Duration: ").append(RESET);
        sb.append(node.getDuration().accept(this));
        sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Easing: ").append(RESET);
        sb.append(node.getEasing().accept(this));
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(TransformPropertyNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(nodeInfo(node, "(property: transform)")).append("\n");

        indentLevel++;
        sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Function: ").append(RESET);
        sb.append(node.getTransformFunction().accept(this));
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(BackgroundPropertyNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(nodeInfo(node, "(property: background)")).append("\n");

        indentLevel++;
        sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Value: ").append(RESET);
        sb.append(node.getBackgroundValue().accept(this));
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(FontFamilyPropertyNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(nodeInfo(node, "(property: font-family, fonts: " + node.getFontNames().size() + ")")).append("\n");

        indentLevel++;
        List<CSSIdentValueNode> fonts = node.getFonts();
        for (int i = 0; i < fonts.size(); i++) {
            boolean isLast = (i == fonts.size() - 1);
            sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH).append(TEAL).append("Font " + (i + 1) + ": ").append(RESET);
            sb.append(fonts.get(i).accept(this));
        }
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(FontWeightPropertyNode node) {
        StringBuilder sb = new StringBuilder();
        String type = node.isNumeric() ? "numeric" : "keyword";
        sb.append(nodeInfo(node, "(property: font-weight, type: " + type + ")")).append("\n");

        indentLevel++;
        sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Value: ").append(RESET);
        sb.append(node.getWeightValue().accept(this));
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(BoxSizingPropertyNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(nodeInfo(node, "(property: box-sizing, value: " + node.getSizingModelValue() + ")")).append("\n");

        indentLevel++;
        sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Value: ").append(RESET);
        sb.append(node.getSizingModel().accept(this));
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visit(OutlinePropertyNode node) {
        StringBuilder sb = new StringBuilder();
        String type = node.isKeyword() ? "keyword" : "full";
        sb.append(nodeInfo(node, "(property: outline, type: " + type + ")")).append("\n");

        indentLevel++;
        if (node.isKeyword()) {
            sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Keyword: ").append(RESET);
            sb.append(node.getKeywordValue().accept(this));
        } else {
            sb.append(indent()).append(BRANCH).append(TEAL).append("Width: ").append(RESET);
            sb.append(node.getWidth().accept(this));
            sb.append(indent()).append(BRANCH).append(TEAL).append("Style: ").append(RESET);
            sb.append(node.getStyle().accept(this));
            sb.append(indent()).append(LAST_BRANCH).append(TEAL).append("Color: ").append(RESET);
            sb.append(node.getColor().accept(this));
        }
        indentLevel--;

        return sb.toString();
    }

    // ==================== CSS Value Nodes ====================

    @Override
    public String visit(CSSLengthValueNode node) {
        return nodeInfo(node, "(value: " + node.getValueText() + ")") + "\n";
    }

    @Override
    public String visit(CSSColorValueNode node) {
        return nodeInfo(node, "(color: " + node.getColor() + ")") + "\n";
    }

    @Override
    public String visit(CSSKeywordValueNode node) {
        return nodeInfo(node, "(keyword: " + node.getKeyword() + ")") + "\n";
    }

    @Override
    public String visit(CSSNumberValueNode node) {
        return nodeInfo(node, "(number: " + node.getValueText() + ")") + "\n";
    }

    @Override
    public String visit(CSSTimeValueNode node) {
        return nodeInfo(node, "(time: " + node.getValueText() + ")") + "\n";
    }

    @Override
    public String visit(CSSIdentValueNode node) {
        return nodeInfo(node, "(ident: " + node.getIdent() + ")") + "\n";
    }

    @Override
    public String visit(CSSFunctionValueNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(nodeInfo(node, "(function: " + node.getFunctionName() + ", args: " + node.getArguments().size() + ")")).append("\n");

        if (!node.getArguments().isEmpty()) {
            indentLevel++;
            List<CSSValueNode> args = node.getArguments();
            for (int i = 0; i < args.size(); i++) {
                boolean isLast = (i == args.size() - 1);
                sb.append(indent()).append(isLast ? LAST_BRANCH : BRANCH).append(TEAL).append("Arg " + (i + 1) + ": ").append(RESET);
                sb.append(args.get(i).accept(this));
            }
            indentLevel--;
        }

        return sb.toString();
    }
}
