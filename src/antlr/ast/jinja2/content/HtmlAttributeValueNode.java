package antlr.ast.jinja2.content;

import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents the value of an HTML attribute.
 * Can contain mixed text and Jinja2 expressions.
 *
 * Examples:
 * - "container" (static text)
 * - "btn-{{ size }}" (mixed text and expression)
 * - "{{ dynamic_class }}" (just expression)
 */
public class HtmlAttributeValueNode extends ASTNode {
    private final List<ASTNode> parts; // Can contain HtmlTextNode and ExpressionBlockNode

    public HtmlAttributeValueNode(int lineNumber, int columnNumber) {
        super("HtmlAttributeValue", lineNumber, columnNumber);
        this.parts = new ArrayList<>();
    }

    public HtmlAttributeValueNode(int lineNumber) {
        this(lineNumber, 0);
    }

    public void addPart(ASTNode part) {
        if (part != null) {
            parts.add(part);
            part.setParent(this);
        }
    }

    public List<ASTNode> getParts() {
        return Collections.unmodifiableList(parts);
    }

    @Override
    public List<ASTNode> getChildren() {
        return new ArrayList<>(parts);
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        // For now, return a default string representation
        // This can be updated when a proper visitor method is added
        return null;
    }

    @Override
    protected String getExtraInfo() {
        return "(parts: " + parts.size() + ")";
    }
}
