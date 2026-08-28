package antlr.ast.python.statements;

import antlr.ast.node.ASTNode;
import antlr.ast.python.StatementNode;
import antlr.ast.visitor.ASTVisitor;
import java.util.Collections;
import java.util.List;

/**
 * عقدة Break
 * تمثل: break
 */
public class BreakNode extends StatementNode {

    public BreakNode(int lineNumber, int columnNumber) {
        super("Break", lineNumber, columnNumber);
    }

    public BreakNode(int lineNumber) {
        this(lineNumber, 0);
    }

    // ==================== Interface Implementation ====================

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
        return "";
    }
}
