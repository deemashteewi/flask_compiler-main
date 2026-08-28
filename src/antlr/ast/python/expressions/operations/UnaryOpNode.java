package antlr.ast.python.expressions.operations;

import antlr.ast.node.ASTNode;
import antlr.ast.python.expressions.ExpressionNode;
import antlr.ast.visitor.ASTVisitor;
import java.util.ArrayList;
import java.util.List;

/**
 * عقدة العمليات الأحادية (Unary Operation)
 * تمثل: not, - (النفي)
 */
public class UnaryOpNode extends ExpressionNode {

    public enum Operator {
        NOT("not"),
        NEGATE("-");

        private final String symbol;

        Operator(String symbol) {
            this.symbol = symbol;
        }

        public String getSymbol() {
            return symbol;
        }
    }

    private final Operator operator;
    private final ExpressionNode operand;

    public UnaryOpNode(Operator operator, ExpressionNode operand,
                       int lineNumber, int columnNumber) {
        super("UnaryOp", lineNumber, columnNumber);
        this.operator = operator;
        this.operand = operand;

        if (operand != null) operand.setParent(this);
    }

    // ==================== Getters ====================

    public Operator getOperator() {
        return operator;
    }

    public ExpressionNode getOperand() {
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
        return operator.getSymbol() + " " + operand.toValueString();
    }
}
