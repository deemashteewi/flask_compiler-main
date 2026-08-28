package antlr.ast.jinja2.blocks;

import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;
import java.util.ArrayList;
import java.util.List;

/**
 * Abstract base class for escape mode in autoescape blocks.
 *
 * Grammar: escapeMode=(TRUE | FALSE | STRING)
 *
 * Subclasses:
 * - BooleanEscapeModeNode: for TRUE | FALSE
 * - StringEscapeModeNode: for STRING (e.g., "html", "xml", "latex")
 */
public abstract class EscapeModeNode extends ASTNode {

    public EscapeModeNode(String nodeName, int lineNumber, int columnNumber) {
        super(nodeName, lineNumber, columnNumber);
    }

    public EscapeModeNode(String nodeName, int lineNumber) {
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
