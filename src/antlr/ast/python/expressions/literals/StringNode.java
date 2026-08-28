package antlr.ast.python.expressions.literals;

import antlr.ast.node.ASTNode;
import antlr.ast.python.expressions.ExpressionNode;
import antlr.ast.visitor.ASTVisitor;
import java.util.Collections;
import java.util.List;

/**
 * عقدة الرقم (Number Literal)
 * تمثل قيمة عددية ثابتة
 */
public class StringNode extends ExpressionNode {

    private final String value;

    public StringNode(String value, int lineNumber, int columnNumber) {
        super("String", lineNumber, columnNumber);
        this.value = value;
    }

    public StringNode(String value, int lineNumber) {
        this(value, lineNumber, 0);
    }

    // ==================== Getters ====================

    public String getValue() {
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
        return value;
    }
}
