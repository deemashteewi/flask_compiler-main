package antlr.ast.python.expressions.literals;

import antlr.ast.node.ASTNode;
import antlr.ast.python.expressions.ExpressionNode;
import antlr.ast.visitor.ASTVisitor;
import java.util.Collections;
import java.util.List;

/**
 * عقدة الرقم الصحيح (Integer Number Literal)
 * تمثل قيمة عددية صحيحة ثابتة
 */
public class NumberIntegerNode extends ExpressionNode {

    private final int value;

    public NumberIntegerNode(int value, int lineNumber, int columnNumber) {
        super("NumberInteger", lineNumber, columnNumber);
        this.value = value;
    }

    public NumberIntegerNode(int value, int lineNumber) {
        this(value, lineNumber, 0);
    }

    public NumberIntegerNode(String valueStr, int lineNumber, int columnNumber) {
        super("NumberInteger", lineNumber, columnNumber);
        this.value = Integer.parseInt(valueStr);
    }

    // ==================== Getters ====================

    public int getValue() {
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
        return String.format("(value: %d)", value);
    }

    @Override
    public String toValueString() {
        return String.valueOf(value);
    }
}
