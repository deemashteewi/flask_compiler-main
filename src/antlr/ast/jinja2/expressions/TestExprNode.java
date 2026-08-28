package antlr.ast.jinja2.expressions;

import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;
import java.util.ArrayList;
import java.util.List;

/**
 * عقدة اختبار Jinja2 (Test Expression)
 * تمثل اختبارات مثل: is defined, is not none, is divisibleby
 *
 * Examples:
 * - x is defined
 * - x is not none
 * - x is divisibleby(3)
 * - name is equalto("admin")
 * - items is iterable
 */
public class TestExprNode extends JinjaExpressionNode {

    private final JinjaExpressionNode expression;  // التعبير المختبر
    private final String testName;                  // اسم الاختبار (defined, none, etc.)
    private final boolean negated;                  // هل يوجد not
    private final List<JinjaExpressionNode> arguments;  // وسائط الاختبار (إن وجدت)

    public TestExprNode(JinjaExpressionNode expression, String testName, boolean negated,
                        int lineNumber, int columnNumber) {
        super("TestExpr", lineNumber, columnNumber);
        this.expression = expression;
        this.testName = testName;
        this.negated = negated;
        this.arguments = new ArrayList<>();

        if (expression != null) expression.setParent(this);
    }

    public TestExprNode(JinjaExpressionNode expression, String testName, boolean negated,
                        int lineNumber) {
        this(expression, testName, negated, lineNumber, 0);
    }

    // ==================== Getters ====================

    public JinjaExpressionNode getExpression() {
        return expression;
    }

    public String getTestName() {
        return testName;
    }

    public boolean isNegated() {
        return negated;
    }

    public List<JinjaExpressionNode> getArguments() {
        return arguments;
    }

    // ==================== Setters ====================

    public void addArgument(JinjaExpressionNode arg) {
        if (arg != null) {
            arg.setParent(this);
            arguments.add(arg);
        }
    }

    // ==================== تطبيق الواجهات ====================

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> children = new ArrayList<>();
        if (expression != null) children.add(expression);
        children.addAll(arguments);
        return children;
    }

    @Override
    protected String getExtraInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("(test: ");
        if (negated) sb.append("not ");
        sb.append(testName);
        if (!arguments.isEmpty()) {
            sb.append(", args: ").append(arguments.size());
        }
        sb.append(")");
        return sb.toString();
    }

    @Override
    public String toValueString() {
        StringBuilder sb = new StringBuilder();
        if (expression != null) {
            sb.append(expression.toValueString());
        }
        sb.append(" is ");
        if (negated) sb.append("not ");
        sb.append(testName);
        if (!arguments.isEmpty()) {
            sb.append("(");
            for (int i = 0; i < arguments.size(); i++) {
                if (i > 0) sb.append(", ");
                sb.append(arguments.get(i).toValueString());
            }
            sb.append(")");
        }
        return sb.toString();
    }

    @Override
    public String getFullPath() {
        return toValueString();
    }
}
