package antlr.ast.css.values;

import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;
import java.util.Collections;
import java.util.List;

/**
 * CSS number value node (e.g., 500, 1.7, 0.1)
 */
public class CSSNumberValueNode extends CSSValueNode {
    private final String number;

    public CSSNumberValueNode(String number, int lineNumber, int columnNumber) {
        super("CSSNumberValue", lineNumber, columnNumber);
        this.number = number;
    }

    public CSSNumberValueNode(String number, int lineNumber) {
        this(number, lineNumber, 0);
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String getValueText() {
        return number;
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
        return String.format("'%s'", number);
    }
}
