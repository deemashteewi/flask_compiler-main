package antlr.ast.css.properties;

import antlr.ast.css.values.CSSIdentValueNode;
import antlr.ast.css.values.CSSKeywordValueNode;
import antlr.ast.css.values.CSSTimeValueNode;
import antlr.ast.css.values.CSSValueNode;
import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;

import java.util.Arrays;
import java.util.List;

/**
 * Represents CSS transition property.
 * Format: property duration easing
 * Example: transition: all 0.2s ease;
 */
public class TransitionPropertyNode extends CSSPropertyNode {
    private final CSSIdentValueNode property;
    private final CSSTimeValueNode duration;
    private final CSSKeywordValueNode easing;

    public TransitionPropertyNode(CSSIdentValueNode property, CSSTimeValueNode duration,
                                  CSSKeywordValueNode easing, int lineNumber) {
        super("TransitionProperty", "transition", lineNumber);
        this.property = property;
        this.duration = duration;
        this.easing = easing;

        if (property != null) property.setParent(this);
        if (duration != null) duration.setParent(this);
        if (easing != null) easing.setParent(this);
    }

    public CSSIdentValueNode getProperty() {
        return property;
    }

    public CSSTimeValueNode getDuration() {
        return duration;
    }

    public CSSKeywordValueNode getEasing() {
        return easing;
    }

    @Override
    public List<CSSValueNode> getValues() {
        return Arrays.asList(property, duration, easing);
    }

    @Override
    public List<ASTNode> getChildren() {
        return Arrays.asList(property, duration, easing);
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
