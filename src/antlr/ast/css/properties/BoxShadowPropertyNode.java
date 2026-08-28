package antlr.ast.css.properties;

import antlr.ast.css.values.CSSValueNode;
import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents CSS box-shadow property.
 * Format: offsetX offsetY blur color [, offsetX offsetY blur color]*
 * Example: box-shadow: 0 1px 3px rgba(0,0,0,0.1), 0 1px 2px rgba(0,0,0,0.06);
 */
public class BoxShadowPropertyNode extends CSSPropertyNode {

    public static class Shadow {
        public final CSSValueNode offsetX;
        public final CSSValueNode offsetY;
        public final CSSValueNode blur;
        public final CSSValueNode color;

        public Shadow(CSSValueNode offsetX, CSSValueNode offsetY, CSSValueNode blur, CSSValueNode color) {
            this.offsetX = offsetX;
            this.offsetY = offsetY;
            this.blur = blur;
            this.color = color;
        }
    }

    private final List<Shadow> shadows;

    public BoxShadowPropertyNode(List<Shadow> shadows, int lineNumber) {
        super("BoxShadowProperty", "box-shadow", lineNumber);
        this.shadows = new ArrayList<>(shadows);
    }

    public List<Shadow> getShadows() {
        return new ArrayList<>(shadows);
    }

    @Override
    public List<CSSValueNode> getValues() {
        List<CSSValueNode> allValues = new ArrayList<>();
        for (Shadow shadow : shadows) {
            allValues.add(shadow.offsetX);
            allValues.add(shadow.offsetY);
            allValues.add(shadow.blur);
            allValues.add(shadow.color);
        }
        return allValues;
    }

    @Override
    public List<ASTNode> getChildren() {
        return new ArrayList<>(getValues());
    }

    @Override
    protected String getExtraInfo() {
        return String.format("property='%s' (%d shadows)", getPropertyName(), shadows.size());
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
