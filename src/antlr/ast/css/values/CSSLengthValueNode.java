package antlr.ast.css.values;

import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;
import java.util.Collections;
import java.util.List;

/**
 * CSS length value node (e.g., 24px, 100%, 1.5em, 100vh)
 */
public class CSSLengthValueNode extends CSSValueNode {
    private final String value;
    private final String unit;

    public CSSLengthValueNode(String value, String unit, int lineNumber, int columnNumber) {
        super("CSSLengthValue", lineNumber, columnNumber);
        this.value = value;
        this.unit = unit;
    }

    public CSSLengthValueNode(String value, String unit, int lineNumber) {
        this(value, unit, lineNumber, 0);
    }

    public String getValue() {
        return value;
    }

    public String getUnit() {
        return unit;
    }

    @Override
    public String getValueText() {
        return value + unit;
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
        return String.format("'%s%s'", value, unit);
    }
}
