package antlr.ast.jinja2.blocks;

import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Else branch node: {% else %} ...
 *
 * Grammar: elseBranch : ELSE templateContent*;
 *
 * Example: {% if user.is_admin %}
 *              <p>Admin content</p>
 *          {% else %}
 *              <p>Regular user content</p>
 *          {% endif %}
 *
 * Note: Else has NO condition (unlike elif)
 */
public class ElseBranchNode extends ASTNode {

    // Branch body content
    private List<ASTNode> body;

    public ElseBranchNode(int lineNumber, int columnNumber) {
        super("ElseBranchNode", lineNumber, columnNumber);
        this.body = new ArrayList<>();
    }

    public ElseBranchNode(int lineNumber) {
        super("ElseBranchNode", lineNumber, 0);
        this.body = new ArrayList<>();
    }

    // ==================== Body ====================
    public List<ASTNode> getBody() {
        return body;
    }

    public void setBody(List<ASTNode> body) {
        this.body = body;
    }

    public void addToBody(ASTNode node) {
        this.body.add(node);
    }

    // ==================== Visitor Pattern ====================
    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    // ==================== Children ====================
    @Override
    public List<ASTNode> getChildren() {
        return new ArrayList<>(body);
    }

    // ==================== Display ====================
    @Override
    protected String getExtraInfo() {
        return String.format("(bodySize: %d)", body.size());
    }
}
