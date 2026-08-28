package antlr.ast.css.properties;

import antlr.ast.css.values.CSSIdentValueNode;
import antlr.ast.css.values.CSSValueNode;
import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Represents CSS font-family property.
 * Format: comma-separated list of font names
 * Example: font-family: -apple-system, BlinkMacSystemFont, Segoe UI, Roboto, sans-serif;
 */
public class FontFamilyPropertyNode extends CSSPropertyNode {
    private final List<CSSIdentValueNode> fonts;

    public FontFamilyPropertyNode(List<CSSIdentValueNode> fonts, int lineNumber) {
        super("FontFamilyProperty", "font-family", lineNumber);
        this.fonts = new ArrayList<>(fonts);
        for (CSSIdentValueNode font : this.fonts) {
            if (font != null) {
                font.setParent(this);
            }
        }
    }

    public List<CSSIdentValueNode> getFonts() {
        return new ArrayList<>(fonts);
    }

    public List<String> getFontNames() {
        return fonts.stream()
                .map(CSSIdentValueNode::getIdent)
                .collect(Collectors.toList());
    }

    @Override
    public List<CSSValueNode> getValues() {
        return new ArrayList<>(fonts);
    }

    @Override
    public List<ASTNode> getChildren() {
        return new ArrayList<>(fonts);
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
