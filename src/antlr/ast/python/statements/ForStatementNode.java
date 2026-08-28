package antlr.ast.python.statements;

import antlr.ast.node.ASTNode;
import antlr.ast.python.StatementNode;
import antlr.ast.python.expressions.ExpressionNode;
import antlr.ast.visitor.ASTVisitor;
import java.util.ArrayList;
import java.util.List;

/**
 * عقدة حلقة For
 * تمثل: for target in iterable: block
 */
public class ForStatementNode extends StatementNode {

    private final String targetVariable;
    private final ExpressionNode iterable;
    private final BlockNode body;

    public ForStatementNode(String targetVariable, ExpressionNode iterable,
                           BlockNode body, int lineNumber, int columnNumber) {
        super("ForStatement", lineNumber, columnNumber);

        this.targetVariable = targetVariable;
        this.iterable = iterable;
        this.body = body;

        // Set parent references
        if (iterable != null) iterable.setParent(this);
        if (body != null) body.setParent(this);
    }

    // ==================== Getters ====================

    public String getTargetVariable() {
        return targetVariable;
    }

    public ExpressionNode getIterable() {
        return iterable;
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
        if (iterable != null) children.add(iterable);
        if (body != null) children.add(body);
        return children;
    }

    @Override
    protected String getExtraInfo() {
        return String.format("(target: %s)", targetVariable);
    }

    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder();
        String indentStr = getIndent(indent);

        sb.append(indentStr).append("├── ForStatement [Line: ")
          .append(lineNumber).append("] target: ").append(targetVariable).append("\n");

        sb.append(getIndent(indent + 1)).append("├── Iterable:\n");
        if (iterable != null) {
            sb.append(iterable.toString(indent + 2));
        }

        sb.append(getIndent(indent + 1)).append("├── Body:\n");
        if (body != null) {
            sb.append(body.toString(indent + 2));
        }

        return sb.toString();
    }
}
