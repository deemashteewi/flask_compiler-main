package antlr.ast.jinja2.expressions;

import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a Jinja2 ternary expression: value if condition else other
 *
 * Examples:
 * - "yes" if is_active else "no"
 * - user.name if user else "Anonymous"
 */
public class TernaryExprNode extends JinjaExpressionNode {

    private JinjaExpressionNode trueValue;      // value before 'if'
    private JinjaExpressionNode condition;       // condition after 'if'
    private JinjaExpressionNode falseValue;      // value after 'else'

    public TernaryExprNode(int lineNumber, int columnNumber) {
        super("TernaryExprNode", lineNumber, columnNumber);
    }

    // ==================== Getters & Setters ====================
    public JinjaExpressionNode getTrueValue() {
        return trueValue;
    }

    public void setTrueValue(JinjaExpressionNode trueValue) {
        this.trueValue = trueValue;
    }

    public JinjaExpressionNode getCondition() {
        return condition;
    }

    public void setCondition(JinjaExpressionNode condition) {
        this.condition = condition;
    }

    public JinjaExpressionNode getFalseValue() {
        return falseValue;
    }

    public void setFalseValue(JinjaExpressionNode falseValue) {
        this.falseValue = falseValue;
    }

    // ==================== Visitor Pattern ====================
    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    // ==================== Children ====================
    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> children = new ArrayList<>();
        if (trueValue != null) children.add(trueValue);
        if (condition != null) children.add(condition);
        if (falseValue != null) children.add(falseValue);
        return children;
    }

    // ==================== Display ====================
    @Override
    protected String getExtraInfo() {
        return "(ternary)";
    }

    @Override
    public String toValueString() {
        StringBuilder sb = new StringBuilder();
        if (trueValue != null) sb.append(trueValue.toValueString());
        sb.append(" if ");
        if (condition != null) sb.append(condition.toValueString());
        sb.append(" else ");
        if (falseValue != null) sb.append(falseValue.toValueString());
        return sb.toString();
    }

    @Override
    public String getFullPath() {
        return toValueString();
    }
}
