package antlr.ast.jinja2.blocks;

import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;
import antlr.ast.jinja2.expressions.JinjaExpressionNode;
import antlr.ast.jinja2.targets.TargetNode;

import java.util.ArrayList;
import java.util.List;

/**
 * For loop block: {% for target in iterable if condition %} ... {% else %} ... {% endfor %}
 *
 * Grammar:
 * forBlock     : forStart templateContent* elseForBranch? forEnd;
 * forStart     : FOR target=forTarget IN iterable=expression (IF condition=expression)?;
 * forTarget    : NAME                    # SingleTarget
 *              | NAME (COMMA NAME)+      # TupleTarget
 * elseForBranch: ELSE templateContent*;
 *
 * Examples:
 * - {% for item in items %}...{% endfor %}
 * - {% for key, value in dict.items() %}...{% endfor %}
 * - {% for item in items if item.active %}...{% else %}No items{% endfor %}
 */
public class ForBlockNode extends ASTNode {

    // Target variable(s) - SimpleTargetNode or TupleTargetNode
    private TargetNode target;

    // The collection being iterated
    private JinjaExpressionNode iterable;

    // Optional condition: {% for x in items if x.active %}
    private JinjaExpressionNode condition;

    // Loop body content
    private List<ASTNode> body;

    // Optional else branch: {% else %} when loop is empty
    private ElseBranchNode elseBranch;

    public ForBlockNode(int lineNumber, int columnNumber) {
        super("ForBlock", lineNumber, columnNumber);
        this.body = new ArrayList<>();
    }

    public ForBlockNode(int lineNumber) {
        this(lineNumber, 0);
    }

    // ==================== Target ====================
    public TargetNode getTarget() {
        return target;
    }

    public void setTarget(TargetNode target) {
        this.target = target;
    }

    // ==================== Iterable ====================
    public JinjaExpressionNode getIterable() {
        return iterable;
    }

    public void setIterable(JinjaExpressionNode iterable) {
        this.iterable = iterable;
    }

    // ==================== Condition ====================
    public JinjaExpressionNode getCondition() {
        return condition;
    }

    public void setCondition(JinjaExpressionNode condition) {
        this.condition = condition;
    }

    public boolean hasCondition() {
        return condition != null;
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
        if (target != null) {
            children.add(target);
        }
        if (iterable != null) {
            children.add(iterable);
        }
        if (condition != null) {
            children.add(condition);
        }
        children.addAll(body);
        if (elseBranch != null) {
            children.add(elseBranch);
        }
        return children;
    }

    // ==================== Display ====================
    @Override
    protected String getExtraInfo() {
        return String.format("(hasCondition: %s, hasElse: %s)", hasCondition(), hasElseBranch());
    }
}
