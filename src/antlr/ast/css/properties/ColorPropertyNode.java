package antlr.ast.css.properties;

import antlr.ast.css.values.CSSColorValueNode;
import antlr.ast.css.values.CSSKeywordValueNode;
import antlr.ast.css.values.CSSValueNode;
import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;

import java.util.Collections;
import java.util.List;

/**
 * Represents CSS color properties.
 * Examples: color, background-color, border-color
 * Accepts: color values or keywords (inherit, auto, etc.)
 */
public class ColorPropertyNode extends CSSPropertyNode {
    private final CSSValueNode value; // Can be CSSColorValueNode or CSSKeywordValueNode

    public ColorPropertyNode(String propertyName, CSSValueNode value, int lineNumber) {
        super("ColorProperty", propertyName, lineNumber);
        this.value = value;
        if (value != null) {
            value.setParent(this);
        }
    }

    public CSSValueNode getColorValue() {
        return value;
    }

    /**
     * Check if this is a color literal (hex, rgb, etc.) vs a keyword
     */
    public boolean isColorLiteral() {
        return value instanceof CSSColorValueNode;
    }

    /**
     * Check if this is a keyword value (inherit, auto, etc.)
     */
    public boolean isKeyword() {
        return value instanceof CSSKeywordValueNode;
    }

    @Override
    public List<CSSValueNode> getValues() {
        return value != null ? Collections.singletonList(value) : Collections.emptyList();
    }

    @Override
    public List<ASTNode> getChildren() {
        return value != null ? Collections.singletonList(value) : Collections.emptyList();
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
