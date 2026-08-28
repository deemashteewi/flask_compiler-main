package antlr.ast.css.values;

import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;
import java.util.Collections;
import java.util.List;

/**
 * CSS color value node (e.g., #f3f4f6, white, rgba(0,0,0,0.1))
 */
public class CSSColorValueNode extends CSSValueNode {
    private final String color;

    public CSSColorValueNode(String color, int lineNumber, int columnNumber) {
        super("CSSColorValue", lineNumber, columnNumber);
        this.color = color;
    }

    public CSSColorValueNode(String color, int lineNumber) {
        this(color, lineNumber, 0);
    }

    public String getColor() {
        return color;
    }

    @Override
    public String getValueText() {
        return color;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public List<ASTNode> getChildren() {
        return Collections.emptyList();
    }

    @Override
    protected String getExtraInfo() {
        return String.format("'%s'", color);
    }
}
