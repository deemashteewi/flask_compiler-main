package antlr.ast.jinja2.expressions;

import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;
import java.util.ArrayList;
import java.util.List;

/**
 * عقدة التعبير بين الأقواس (Parenthesized Expression)
 * تمثل تعبير محاط بأقواس لتغيير أولوية العمليات
 *
 * Examples:
 * - (a + b)
 * - (x * (y + z))
 * - ((1 + 2) * 3)
 */
public class ParenExprNode extends JinjaExpressionNode {

    private final JinjaExpressionNode expression;

    public ParenExprNode(JinjaExpressionNode expression, int lineNumber, int columnNumber) {
        super("ParenExpr", lineNumber, columnNumber);
        this.expression = expression;

        if (expression != null) expression.setParent(this);
    }

    public ParenExprNode(JinjaExpressionNode expression, int lineNumber) {
        this(expression, lineNumber, 0);
    }

    // ==================== Getters ====================

    public JinjaExpressionNode getExpression() {
        return expression;
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
        return children;
    }

    @Override
    protected String getExtraInfo() {
        return "";  // الأقواس واضحة من السياق
    }

    @Override
    public String toValueString() {
        return "(" + (expression != null ? expression.toValueString() : "") + ")";
    }

    @Override
    public String getFullPath() {
        return "(" + (expression != null ? expression.getFullPath() : "") + ")";
    }
}
