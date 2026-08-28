package antlr.ast.jinja2.blocks;

import java.util.ArrayList;
import java.util.List;

import antlr.ast.jinja2.expressions.JinjaExpressionNode;
import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;

/**
 * If block node: {% if condition %} ... {% elif %} ... {% else %} ... {% endif %}
 *
 * Grammar:
 * ifBlock     : ifStart templateContent* elifBranch* elseBranch? ifEnd;
 * ifStart     : IF condition=expression;
 * elifBranch  : ELIF condition=expression templateContent*;
 * elseBranch  : ELSE templateContent*;
 *
 * Examples:
 * - {% if user.is_admin %}...{% endif %}
 * - {% if x > 0 %}positive{% elif x < 0 %}negative{% else %}zero{% endif %}
 */
public class IfBlockNode extends ASTNode {

    // Required condition: {% if condition %}
    private JinjaExpressionNode condition;

    // If body content
    private List<ASTNode> body;

    // Optional elif branches: {% elif condition %}
    private List<ElifBranchNode> elifBranches;

    // Optional else branch: {% else %}
    private ElseBranchNode elseBranch;

    public IfBlockNode(int lineNumber, int columnNumber) {
        super("IfBlockNode", lineNumber, columnNumber);
        this.body = new ArrayList<>();
        this.elifBranches = new ArrayList<>();
    }

    public IfBlockNode(int lineNumber) {
        super("IfBlockNode", lineNumber, 0);
        this.body = new ArrayList<>();
        this.elifBranches = new ArrayList<>();
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

    // ==================== Elif Branches ====================
    public List<ElifBranchNode> getElifBranches() {
        return elifBranches;
    }

    public void setElifBranches(List<ElifBranchNode> elifBranches) {
        this.elifBranches = elifBranches;
    }

    public void addElifBranch(ElifBranchNode elifBranch) {
        this.elifBranches.add(elifBranch);
    }

    public boolean hasElifBranches() {
        return elifBranches != null && !elifBranches.isEmpty();
    }

    // ==================== Else Branch ====================
    public ElseBranchNode getElseBranch() {
        return elseBranch;
    }

    public void setElseBranch(ElseBranchNode elseBranch) {
        this.elseBranch = elseBranch;
    }

    public boolean hasElseBranch() {
        return elseBranch != null;
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
        children.addAll(elifBranches);
        if (elseBranch != null) {
            children.add(elseBranch);
        }
        return children;
    }

    // ==================== Display ====================
    @Override
    protected String getExtraInfo() {
        return String.format("(elifCount: %d, hasElse: %s)",
            elifBranches.size(), hasElseBranch());
    }
}
