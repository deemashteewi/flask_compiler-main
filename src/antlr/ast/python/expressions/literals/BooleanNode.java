package antlr.ast.python.expressions.literals;

import antlr.ast.node.ASTNode;
import antlr.ast.python.expressions.ExpressionNode;
import antlr.ast.visitor.ASTVisitor;
import java.util.Collections;
import java.util.List;

/**
 * عقدة القيمة المنطقية (Boolean Literal)
 * تمثل True أو False
 */
public class BooleanNode extends ExpressionNode {

    private final boolean value;

    public BooleanNode(boolean value, int lineNumber, int columnNumber) {
        super("Boolean", lineNumber, columnNumber);
        this.value = value;
    }

    public BooleanNode(boolean value, int lineNumber) {
        this(value, lineNumber, 0);
    }

    // ==================== Getters ====================

    public boolean getValue() {
        return value;
    }

    // ==================== تطبيق الواجهات ====================

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public List<ASTNode> getChildren() {
        return Collections.emptyList();
    }

    @Override
    protected String getExtraInfo() {
        return String.format("(value: %s)", value ? "True" : "False");
    }

    @Override
    public String toValueString() {
        return value ? "True" : "False";
    }
}
