package antlr.ast.jinja2.targets;

import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Tuple target node for tuple unpacking.
 * Example: a, b in {% set a, b = [1, 2] %} or {% for key, value in dict.items() %}
 */
public class TupleTargetNode extends TargetNode {

    private List<String> targets;

    public TupleTargetNode(int lineNumber, int columnNumber) {
        super("TupleTargetNode", lineNumber, columnNumber);
        targets = new ArrayList<>();
    }

    public TupleTargetNode(int lineNumber) {
        super("TupleTargetNode", lineNumber, 0);
        targets = new ArrayList<>();
    }

    // ==================== Getters ====================
    public List<String> getTargets() {
        return targets;
    }

    public void addTarget(String target) {
        this.targets.add(target);
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
        return String.format("(targets: %s)", String.join(", ", targets));
    }
}
