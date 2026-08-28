package antlr.ast.jinja2.expressions.operations;

import antlr.ast.node.ASTNode;
import antlr.ast.jinja2.expressions.JinjaExpressionNode;
import antlr.ast.visitor.ASTVisitor;
import java.util.ArrayList;
import java.util.List;

/**
 * عقدة العمليات الثنائية (Binary Operation)
 * تمثل العمليات الحسابية: +, -, *, /, **, ~, //, %
 *
 * البنية: left operator right
 * مثال: 5 + 3, x * 2, a ** b, str1 ~ str2
 */
public class JinjaBinaryOpNode extends JinjaExpressionNode {

    /**
     * تعداد أنواع العمليات الحسابية
     */
    public enum Operator {
        ADD("+"),
        SUB("-"),
        MUL("*"),
        DIV("/"),
        POW("**"),
        CONCAT("~"),      // String concatenation
        FLOORDIV("//"),   // Floor division
        MOD("%");         // Modulo

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
                case "~" -> CONCAT;
                case "//" -> FLOORDIV;
                case "%" -> MOD;
                default -> throw new IllegalArgumentException("Unknown operator: " + op);
            };
        }
    }

    private final JinjaExpressionNode left;
    private final Operator operator;
    private final JinjaExpressionNode right;

    public JinjaBinaryOpNode(JinjaExpressionNode left, Operator operator, JinjaExpressionNode right,
                        int lineNumber, int columnNumber) {
        super("JinjaBinaryOp", lineNumber, columnNumber);
        this.left = left;
        this.operator = operator;
        this.right = right;

        if (left != null) left.setParent(this);
        if (right != null) right.setParent(this);
    }

    public JinjaBinaryOpNode(JinjaExpressionNode left, String operatorStr, JinjaExpressionNode right,
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
