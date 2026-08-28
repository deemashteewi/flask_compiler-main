package antlr.ast.css.values;

import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;

import java.util.Collections;
import java.util.List;

/**
 * Represents a CSS identifier value.
 * Used for font names, custom property names, etc.
 * Example: -apple-system, Roboto, sans-serif, all
 */
public class CSSIdentValueNode extends CSSValueNode {
    private final String ident;

    public CSSIdentValueNode(String ident, int lineNumber, int columnNumber) {
        super("CSSIdentValue", lineNumber, columnNumber);
        this.ident = ident;
    }

    public CSSIdentValueNode(String ident, int lineNumber) {
        this(ident, lineNumber, 0);
    }

    public String getIdent() {
        return ident;
    }

    @Override
    public List<ASTNode> getChildren() {
        return Collections.emptyList();
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public String getValueText() {
        return ident;
    }

    @Override
    protected String getExtraInfo() {
        return String.format("ident='%s'", ident);
    }
}
