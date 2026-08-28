package antlr.ast.css.properties;

import antlr.ast.css.values.CSSKeywordValueNode;
import antlr.ast.css.values.CSSValueNode;
import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;

import java.util.Collections;
import java.util.List;

/**
 * Represents CSS properties that accept only keyword values.
 * Examples: display, text-align, text-decoration, cursor, overflow, etc.
 */
public class KeywordPropertyNode extends CSSPropertyNode {
    private final CSSKeywordValueNode value;

    public KeywordPropertyNode(String propertyName, CSSKeywordValueNode value, int lineNumber) {
        super("KeywordProperty", propertyName, lineNumber);
        this.value = value;
        if (value != null) {
            value.setParent(this);
        }
    }

    public CSSKeywordValueNode getKeyword() {
        return value;
    }

    public String getKeywordValue() {
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
