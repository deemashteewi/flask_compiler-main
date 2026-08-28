package antlr.ast.jinja2.expressions.operations;

import antlr.ast.node.ASTNode;
import antlr.ast.jinja2.expressions.JinjaExpressionNode;
import antlr.ast.visitor.ASTVisitor;
import java.util.ArrayList;
import java.util.List;

/**
 * عقدة العمليات الأحادية (Unary Operation)
 * تمثل: not, -, +
 */
public class JinjaUnaryOpNode extends JinjaExpressionNode {

    public enum Operator {
        NOT("not"),
        NEGATE("-"),
        POSITIVE("+");

        private final String symbol;

        Operator(String symbol) {
            this.symbol = symbol;
        }

        public String getSymbol() {
            return symbol;
        }

        public static Operator fromString(String op) {
            return switch (op) {
                case "not" -> NOT;
                case "-" -> NEGATE;
                case "+" -> POSITIVE;
                default -> throw new IllegalArgumentException("Unknown unary operator: " + op);
            };
        }
    }

    private final Operator operator;
    private final JinjaExpressionNode operand;

    public JinjaUnaryOpNode(Operator operator, JinjaExpressionNode operand,
                       int lineNumber, int columnNumber) {
        super("JinjaUnaryOp", lineNumber, columnNumber);
        this.operator = operator;
        this.operand = operand;

        if (operand != null) operand.setParent(this);
    }

    // ==================== Getters ====================

    public Operator getOperator() {
        return operator;
    }

    public JinjaExpressionNode getOperand() {
        return operand;
    }

    // ==================== تطبيق الواجهات ====================

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> children = new ArrayList<>();
        if (operand != null) children.add(operand);
        return children;
    }

    @Override
    protected String getExtraInfo() {
        return String.format("(op: %s)", operator.getSymbol());
    }

    @Override
    public String toValueString() {
        String operandStr = operand != null ? operand.toValueString() : "null";
        return operator.getSymbol() + " " + operandStr;
    }
}
