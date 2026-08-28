package antlr.ast.python.expressions.literals;

import antlr.ast.node.ASTNode;
import antlr.ast.python.expressions.ExpressionNode;
import antlr.ast.visitor.ASTVisitor;
import java.util.Collections;
import java.util.List;

/**
 * عقدة الرقم العشري (Double Number Literal)
 * تمثل قيمة عددية عشرية ثابتة
 */
public class NumberDoubleNode extends ExpressionNode {

    private final double value;

    public NumberDoubleNode(double value, int lineNumber, int columnNumber) {
        super("NumberDouble", lineNumber, columnNumber);
        this.value = value;
    }

    public NumberDoubleNode(double value, int lineNumber) {
        this(value, lineNumber, 0);
    }

    public NumberDoubleNode(String valueStr, int lineNumber, int columnNumber) {
        super("NumberDouble", lineNumber, columnNumber);
        this.value = Double.parseDouble(valueStr);
    }

    // ==================== Getters ====================

    public double getValue() {
        return value;
    }

    // ==================== تطبيق الواجهات ====================

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public List<ASTNode> getChildren() {
        return Collections.emptyList();  // عقدة ورقة - لا أبناء
    }

    @Override
    protected String getExtraInfo() {
        return String.format("(value: %s)", value);
    }

    @Override
    public String toValueString() {
        return String.valueOf(value);
    }
}
