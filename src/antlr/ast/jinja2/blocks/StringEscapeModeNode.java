package antlr.ast.jinja2.blocks;

import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

/**
 * String escape mode node for named escape strategies.
 *
 * Examples:
 * - {% autoescape "html" %} ... {% endautoescape %}
 * - {% autoescape "xml" %} ... {% endautoescape %}
 * - {% autoescape "latex" %} ... {% endautoescape %}
 */
public class StringEscapeModeNode extends EscapeModeNode {

    private String value;

    public StringEscapeModeNode(int lineNumber, int columnNumber) {
        super("StringEscapeModeNode", lineNumber, columnNumber);
    }

    public StringEscapeModeNode(int lineNumber) {
        super("StringEscapeModeNode", lineNumber, 0);
    }

    // ==================== Getters ====================
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
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
        return String.format("(value: \"%s\")", value);
    }
}
