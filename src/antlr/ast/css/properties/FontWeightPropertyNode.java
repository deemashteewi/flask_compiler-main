package antlr.ast.css.properties;

import antlr.ast.css.values.CSSKeywordValueNode;
import antlr.ast.css.values.CSSNumberValueNode;
import antlr.ast.css.values.CSSValueNode;
import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;

import java.util.Collections;
import java.util.List;

/**
 * Represents CSS font-weight property.
 * Accepts: number (100-900) or keyword (bold, normal, etc.)
 * Example: font-weight: 600; or font-weight: bold;
 */
public class FontWeightPropertyNode extends CSSPropertyNode {
    private final CSSValueNode value; // Can be CSSNumberValueNode or CSSKeywordValueNode

    public FontWeightPropertyNode(CSSValueNode value, int lineNumber) {
        super("FontWeightProperty", "font-weight", lineNumber);
        this.value = value;
        if (value != null) {
            value.setParent(this);
        }
    }

    public CSSValueNode getWeightValue() {
        return value;
    }

    public boolean isNumeric() {
        return value instanceof CSSNumberValueNode;
    }

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
