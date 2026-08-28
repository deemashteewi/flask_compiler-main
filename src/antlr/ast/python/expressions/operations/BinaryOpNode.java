package antlr.ast.python.expressions.operations;

import antlr.ast.node.ASTNode;
import antlr.ast.python.expressions.ExpressionNode;
import antlr.ast.visitor.ASTVisitor;
import java.util.ArrayList;
import java.util.List;

/**
 * عقدة العمليات الثنائية (Binary Operation)
 * تمثل العمليات الحسابية: +, -, *, /, **
 *
 * البنية: left operator right
 * مثال: 5 + 3, x * 2, a ** b
 */
public class BinaryOpNode extends ExpressionNode {

    /**
     * تعداد أنواع العمليات الحسابية
     */
    public enum Operator {
        ADD("+"),
        SUB("-"),
        MUL("*"),
        DIV("/"),
        POW("**");

        private final String symbol;

        Operator(String symbol) {
            this.symbol = symbol;
        }

        public String getSymbol() {
            return symbol;
        }

        public static Operator fromString(String op) {
            return switch (op) {
                case "+" -> ADD;
                case "-" -> SUB;
                case "*" -> MUL;
                case "/" -> DIV;
                case "**" -> POW;
                default -> throw new IllegalArgumentException("Unknown operator: " + op);
            };
        }
    }

    private final ExpressionNode left;
    private final Operator operator;
    private final ExpressionNode right;

    public BinaryOpNode(ExpressionNode left, Operator operator, ExpressionNode right,
                        int lineNumber, int columnNumber) {
        super("BinaryOp", lineNumber, columnNumber);
        this.left = left;
        this.operator = operator;
        this.right = right;

        if (left != null) left.setParent(this);
        if (right != null) right.setParent(this);
    }

    public BinaryOpNode(ExpressionNode left, String operatorStr, ExpressionNode right,
                        int lineNumber, int columnNumber) {
        this(left, Operator.fromString(operatorStr), right, lineNumber, columnNumber);
    }

    // ==================== Getters ====================

    public ExpressionNode getLeft() {
        return left;
    }

    public Operator getOperator() {
        return operator;
    }

    public ExpressionNode getRight() {
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
        return left.toValueString() + " " + operator.getSymbol() + " " + right.toValueString();
    }
}
