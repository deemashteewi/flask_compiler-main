package antlr.ast.css.values;

import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;
import java.util.Collections;
import java.util.List;

/**
 * CSS time value node (e.g., 0.2s, 300ms)
 */
public class CSSTimeValueNode extends CSSValueNode {
    private final String time;

    public CSSTimeValueNode(String time, int lineNumber, int columnNumber) {
        super("CSSTimeValue", lineNumber, columnNumber);
        this.time = time;
    }

    public CSSTimeValueNode(String time, int lineNumber) {
        this(time, lineNumber, 0);
    }

    public String getTime() {
        return time;
    }

    @Override
    public String getValueText() {
        return time;
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
        return String.format("'%s'", time);
    }
}
