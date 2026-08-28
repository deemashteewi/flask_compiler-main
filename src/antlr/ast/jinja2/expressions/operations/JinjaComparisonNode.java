package antlr.ast.jinja2.expressions.operations;

import antlr.ast.node.ASTNode;
import antlr.ast.jinja2.expressions.JinjaExpressionNode;
import antlr.ast.visitor.ASTVisitor;
import java.util.ArrayList;
import java.util.List;

/**
 * عقدة المقارنة (Comparison)
 * تمثل: ==, !=, <, >, <=, >=, in, not in
 */
public class JinjaComparisonNode extends JinjaExpressionNode {

    public enum Operator {
        EQ("=="),
        NEQ("!="),
        LT("<"),
        GT(">"),
        LTE("<="),
        GTE(">="),
        IN("in"),
        NOT_IN("not in");

        private final String symbol;

        Operator(String symbol) {
            this.symbol = symbol;
        }

        public String getSymbol() {
            return symbol;
        }

        public static Operator fromString(String op) {
            return switch (op) {
                case "==" -> EQ;
                case "!=" -> NEQ;
                case "<" -> LT;
                case ">" -> GT;
                case "<=" -> LTE;
                case ">=" -> GTE;
                case "in" -> IN;
                case "not in" -> NOT_IN;
                default -> throw new IllegalArgumentException("Unknown comparison operator: " + op);
            };
        }
    }

    private final JinjaExpressionNode left;
    private final Operator operator;
    private final JinjaExpressionNode right;

    public JinjaComparisonNode(JinjaExpressionNode left, Operator operator, JinjaExpressionNode right,
                          int lineNumber, int columnNumber) {
        super("JinjaComparison", lineNumber, columnNumber);
        this.left = left;
        this.operator = operator;
        this.right = right;

        if (left != null) left.setParent(this);
        if (right != null) right.setParent(this);
    }

    public JinjaComparisonNode(JinjaExpressionNode left, String operatorStr, JinjaExpressionNode right,
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
