package antlr.ast.jinja2.expressions.operations;

import antlr.ast.node.ASTNode;
import antlr.ast.jinja2.expressions.JinjaExpressionNode;
import antlr.ast.visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

/**
 * عقدة العمليات المنطقية (Logical Operation)
 * تمثل: and, or
 */
public class JinjaLogicalOpNode extends JinjaExpressionNode {

    public enum Operator {
        AND("and"),
        OR("or");

        private final String symbol;

        Operator(String symbol) {
            this.symbol = symbol;
        }

        public String getSymbol() {
            return symbol;
        }

        public static Operator fromString(String op) {
            return switch (op.toLowerCase()) {
                case "and" -> AND;
                case "or" -> OR;
                default -> throw new IllegalArgumentException("Unknown logical operator: " + op);
            };
        }
    }

    private JinjaExpressionNode left;
    private Operator operator;
    private JinjaExpressionNode right;

    public JinjaLogicalOpNode(int lineNumber, int columnNumber) {
        super("JinjaLogicalOp", lineNumber, columnNumber);
    }

    public JinjaLogicalOpNode(JinjaExpressionNode left, Operator operator, JinjaExpressionNode right,
                              int lineNumber, int columnNumber) {
        super("JinjaLogicalOp", lineNumber, columnNumber);
        this.left = left;
        this.operator = operator;
        this.right = right;

        if (left != null) left.setParent(this);
        if (right != null) right.setParent(this);
    }

    public JinjaLogicalOpNode(JinjaExpressionNode left, String operatorStr, JinjaExpressionNode right,
                              int lineNumber, int columnNumber) {
        this(left, Operator.fromString(operatorStr), right, lineNumber, columnNumber);
    }

    // ==================== Getters ====================

    public JinjaExpressionNode getLeft() {
        return left;
    }

    public Operator getOperator() {
        return operator;
    }

    public JinjaExpressionNode getRight() {
        return right;
    }

    // ==================== Setters ====================

    public void setLeft(JinjaExpressionNode left) {
        this.left = left;
        if (left != null) left.setParent(this);
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public void setRight(JinjaExpressionNode right) {
        this.right = right;
        if (right != null) right.setParent(this);
    }

    // ==================== تطبيق الواجهات ====================

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> children = new ArrayList<>();
        if (left != null) children.add(left);
        if (right != null) children.add(right);
        return children;
    }

    @Override
    protected String getExtraInfo() {
        return String.format("(op: %s)", operator.getSymbol());
    }

    @Override
    public String toValueString() {
        String leftStr = left != null ? left.toValueString() : "null";
        String rightStr = right != null ? right.toValueString() : "null";
        return leftStr + " " + operator.getSymbol() + " " + rightStr;
    }
}
