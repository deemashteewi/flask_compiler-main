package antlr.ast.css.properties;

import antlr.ast.css.CSSNode;
import antlr.ast.css.values.CSSValueNode;
import antlr.ast.visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Abstract base class for all CSS property nodes.
 * Each property type has its own strongly-typed subclass with appropriate value types.
 */
public abstract class CSSPropertyNode extends CSSNode {
    private final String propertyName;

    protected CSSPropertyNode(String nodeName, String propertyName, int lineNumber, int columnNumber) {
        super(nodeName, lineNumber, columnNumber);
        this.propertyName = propertyName;
    }

    protected CSSPropertyNode(String nodeName, String propertyName, int lineNumber) {
        this(nodeName, propertyName, lineNumber, 0);
    }

    /**
     * Get the CSS property name (e.g., "color", "margin", "display")
     */
    public String getPropertyName() {
        return propertyName;
    }

    /**
     * Get all values associated with this property.
     * Subclasses should override to return their specific value types.
     */
    public abstract List<CSSValueNode> getValues();

    @Override
    protected String getExtraInfo() {
        return String.format("property='%s' (%d values)", propertyName, getValues().size());
    }
}
