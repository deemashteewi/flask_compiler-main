package antlr.ast.jinja2.targets;

import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;
import java.util.ArrayList;
import java.util.List;

/**
 * Abstract base class for assignment targets.
 * Used by both {% set %} and {% for %} statements.
 */
public abstract class TargetNode extends ASTNode {

    public TargetNode(String nodeName, int lineNumber, int columnNumber) {
        super(nodeName, lineNumber, columnNumber);
    }

    public TargetNode(String nodeName, int lineNumber) {
        super(nodeName, lineNumber, 0);
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public List<ASTNode> getChildren() {
        return new ArrayList<>();
    }
}
