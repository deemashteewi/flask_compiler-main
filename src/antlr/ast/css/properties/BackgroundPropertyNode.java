package antlr.ast.css.properties;

import antlr.ast.css.values.CSSValueNode;
import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;

import java.util.Collections;
import java.util.List;

/**
 * Represents CSS background property.
 * Accepts: color, keyword, or function
 * Example: background: #f3f4f6;
 */
public class BackgroundPropertyNode extends CSSPropertyNode {
    private final CSSValueNode value;

    public BackgroundPropertyNode(CSSValueNode value, int lineNumber) {
        super("BackgroundProperty", "background", lineNumber);
        this.value = value;
        if (value != null) {
            value.setParent(this);
        }
    }

    public CSSValueNode getBackgroundValue() {
        return value;
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
