package antlr.ast.css.properties;

import antlr.ast.css.values.CSSKeywordValueNode;
import antlr.ast.css.values.CSSValueNode;
import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;

import java.util.Collections;
import java.util.List;

/**
 * Represents CSS box-sizing property.
 * Accepts: border-box, content-box
 * Example: box-sizing: border-box;
 */
public class BoxSizingPropertyNode extends CSSPropertyNode {
    private final CSSKeywordValueNode value;

    public BoxSizingPropertyNode(CSSKeywordValueNode value, int lineNumber) {
        super("BoxSizingProperty", "box-sizing", lineNumber);
        this.value = value;
        if (value != null) {
            value.setParent(this);
        }
    }

    public CSSKeywordValueNode getSizingModel() {
        return value;
    }

    public String getSizingModelValue() {
        return value != null ? value.getKeyword() : null;
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
