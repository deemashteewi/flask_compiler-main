package antlr.ast.jinja2.targets;

import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Simple target node for single variable assignment.
 * Example: x in {% set x = 1 %} or {% for x in items %}
 */
public class SimpleTargetNode extends TargetNode {

    private String target;

    public SimpleTargetNode(int lineNumber, int columnNumber) {
        super("SimpleTargetNode", lineNumber, columnNumber);
    }

    public SimpleTargetNode(int lineNumber) {
        super("SimpleTargetNode", lineNumber, 0);
    }

    // ==================== Getters ====================
    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public List<ASTNode> getChildren() {
        return new ArrayList<>();
    }

    @Override
    protected String getExtraInfo() {
        return String.format("(target: %s)", target);
    }
}
