package antlr.ast.css.properties;

import antlr.ast.css.values.CSSLengthValueNode;
import antlr.ast.css.values.CSSValueNode;
import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;

import java.util.Collections;
import java.util.List;

/**
 * Represents CSS properties that accept a single length value.
 * Examples: font-size, width, height, padding, gap, border-radius, etc.
 */
public class LengthPropertyNode extends CSSPropertyNode {
    private final CSSLengthValueNode value;

    public LengthPropertyNode(String propertyName, CSSLengthValueNode value, int lineNumber) {
        super("LengthProperty", propertyName, lineNumber);
        this.value = value;
        if (value != null) {
            value.setParent(this);
        }
    }

    public CSSLengthValueNode getValue() {
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
