package antlr.ast.css.properties;

import antlr.ast.css.values.CSSKeywordValueNode;
import antlr.ast.css.values.CSSLengthValueNode;
import antlr.ast.css.values.CSSValueNode;
import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Represents CSS outline property.
 * Accepts: keyword (none) OR width style color
 * Example: outline: none; or outline: 2px solid blue;
 */
public class OutlinePropertyNode extends CSSPropertyNode {
    private final CSSKeywordValueNode keywordValue; // For "none"
    private final CSSLengthValueNode width;
    private final CSSKeywordValueNode style;
    private final CSSValueNode color;

    // Constructor for keyword value (outline: none;)
    public OutlinePropertyNode(CSSKeywordValueNode keyword, int lineNumber) {
        super("OutlineProperty", "outline", lineNumber);
        this.keywordValue = keyword;
        this.width = null;
        this.style = null;
        this.color = null;
        if (keyword != null) {
            keyword.setParent(this);
        }
    }

    // Constructor for full outline (outline: 2px solid blue;)
    public OutlinePropertyNode(CSSLengthValueNode width, CSSKeywordValueNode style,
                               CSSValueNode color, int lineNumber) {
        super("OutlineProperty", "outline", lineNumber);
        this.keywordValue = null;
        this.width = width;
        this.style = style;
        this.color = color;

        if (width != null) width.setParent(this);
        if (style != null) style.setParent(this);
        if (color != null) color.setParent(this);
    }

    public boolean isKeyword() {
        return keywordValue != null;
    }

    public CSSKeywordValueNode getKeywordValue() {
        return keywordValue;
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
        if (isKeyword()) {
            return Collections.singletonList(keywordValue);
        } else {
            List<CSSValueNode> values = new ArrayList<>();
            if (width != null) values.add(width);
            if (style != null) values.add(style);
            if (color != null) values.add(color);
            return values;
        }
    }

    @Override
    public List<ASTNode> getChildren() {
        return new ArrayList<>(getValues());
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
