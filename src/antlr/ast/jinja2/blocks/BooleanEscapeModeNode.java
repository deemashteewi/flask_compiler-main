package antlr.ast.jinja2.blocks;

import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Boolean escape mode node for TRUE or FALSE values.
 *
 * Examples:
 * - {% autoescape true %} ... {% endautoescape %}
 * - {% autoescape false %} ... {% endautoescape %}
 */
public class BooleanEscapeModeNode extends EscapeModeNode {

    private boolean value;

    public BooleanEscapeModeNode(int lineNumber, int columnNumber) {
        super("BooleanEscapeModeNode", lineNumber, columnNumber);
    }

    public BooleanEscapeModeNode(int lineNumber) {
        super("BooleanEscapeModeNode", lineNumber, 0);
    }

    // ==================== Getters ====================
    public boolean getValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public List<ASTNode> getChildren() {
        return new ArrayList<>();
    }

    @Override
    protected String getExtraInfo() {
        return String.format("(value: %s)", value);
    }
}
