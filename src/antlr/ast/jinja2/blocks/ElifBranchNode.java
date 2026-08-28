package antlr.ast.jinja2.blocks;

import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;
import antlr.ast.jinja2.expressions.JinjaExpressionNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Elif branch node: {% elif condition %} ...
 *
 * Grammar: elifBranch : ELIF condition=expression templateContent*;
 *
 * Example: {% elif user.is_admin %}
 *              <p>Admin content</p>
 *          {% elif user.is_moderator %}
 *              <p>Moderator content</p>
 */
public class ElifBranchNode extends ASTNode {

    // Required condition: {% elif condition %}
    private JinjaExpressionNode condition;

    // Branch body content
    private List<ASTNode> body;

    public ElifBranchNode(int lineNumber, int columnNumber) {
        super("ElifBranchNode", lineNumber, columnNumber);
        this.body = new ArrayList<>();
    }

    public ElifBranchNode(int lineNumber) {
        super("ElifBranchNode", lineNumber, 0);
        this.body = new ArrayList<>();
    }

    // ==================== Condition ====================
    public JinjaExpressionNode getCondition() {
        return condition;
    }

    public void setCondition(JinjaExpressionNode condition) {
        this.condition = condition;
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
        List<ASTNode> children = new ArrayList<>();
        if (condition != null) {
            children.add(condition);
        }
        children.addAll(body);
        return children;
    }

    // ==================== Display ====================
    @Override
    protected String getExtraInfo() {
        return String.format("(condition: %s)", condition != null ? "present" : "null");
    }
}
