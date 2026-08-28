package antlr.ast.css.properties;

import antlr.ast.css.values.CSSLengthValueNode;
import antlr.ast.css.values.CSSKeywordValueNode;
import antlr.ast.css.values.CSSValueNode;
import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;

import java.util.Arrays;
import java.util.List;

/**
 * Represents CSS border shorthand properties.
 * Examples: border, border-top
 * Format: width style color
 * Example: border: 1px solid #d1d5db;
 */
public class BorderPropertyNode extends CSSPropertyNode {
    private final CSSLengthValueNode width;
    private final CSSKeywordValueNode style;
    private final CSSValueNode color; // Can be CSSColorValueNode or CSSKeywordValueNode

    public BorderPropertyNode(String propertyName, CSSLengthValueNode width,
                              CSSKeywordValueNode style, CSSValueNode color, int lineNumber) {
        super("BorderProperty", propertyName, lineNumber);
        this.width = width;
        this.style = style;
        this.color = color;

        if (width != null) width.setParent(this);
        if (style != null) style.setParent(this);
        if (color != null) color.setParent(this);
    }

    public CSSLengthValueNode getWidth() {
        return width;
    }

    public CSSKeywordValueNode getStyle() {
        return style;
    }

    public CSSValueNode getColor() {
        return color;
    }

    @Override
    public List<CSSValueNode> getValues() {
        return Arrays.asList(width, style, color);
    }

    @Override
    public List<ASTNode> getChildren() {
        return Arrays.asList(width, style, color);
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
