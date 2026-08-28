package antlr.ast.python.statements;

import antlr.ast.node.ASTNode;
import antlr.ast.python.StatementNode;
import antlr.ast.python.expressions.ExpressionNode;
import antlr.ast.visitor.ASTVisitor;
import java.util.ArrayList;
import java.util.List;

/**
 * عقدة حلقة While
 * تمثل: while condition: block
 */
public class WhileStatementNode extends StatementNode {

    private final ExpressionNode condition;
    private final BlockNode body;

    public WhileStatementNode(ExpressionNode condition, BlockNode body,
                              int lineNumber, int columnNumber) {
        super("WhileStatement", lineNumber, columnNumber);

        this.condition = condition;
        this.body = body;

        // Set parent references
        if (condition != null) condition.setParent(this);
        if (body != null) body.setParent(this);
    }

    // ==================== Getters ====================

    public ExpressionNode getCondition() {
        return condition;
    }

    public BlockNode getBody() {
        return body;
    }

    // ==================== Interface Implementation ====================

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> children = new ArrayList<>();
        if (condition != null) children.add(condition);
        if (body != null) children.add(body);
        return children;
    }

    @Override
    protected String getExtraInfo() {
        return "";
    }

    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder();
        String indentStr = getIndent(indent);

        sb.append(indentStr).append("├── WhileStatement [Line: ")
          .append(lineNumber).append("]\n");

        sb.append(getIndent(indent + 1)).append("├── Condition:\n");
        if (condition != null) {
            sb.append(condition.toString(indent + 2));
        }

        sb.append(getIndent(indent + 1)).append("├── Body:\n");
        if (body != null) {
            sb.append(body.toString(indent + 2));
        }

        return sb.toString();
    }
}
