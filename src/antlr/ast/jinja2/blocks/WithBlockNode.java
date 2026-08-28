package antlr.ast.jinja2.blocks;

import java.util.ArrayList;
import java.util.List;

import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;

/**
 * With block node: {% with x = 1, y = 2 %} ... {% endwith %}
 *
 * Grammar:
 * withBlock      : WITH assignments templateContent* ENDWITH;
 * assignments    : withAssignment (COMMA withAssignment)*;
 * withAssignment : name=NAME ASSIGN value=expression;
 *
 * Examples:
 * - {% with x = 1 %}...{% endwith %}
 * - {% with name = user.name, age = user.age %}...{% endwith %}
 */
public class WithBlockNode extends ASTNode {

    // Assignments: x = 1, y = 2, ...
    private List<WithAssignmentNode> assignments;

    // Block body content
    private List<ASTNode> body;

    public WithBlockNode(int lineNumber, int columnNumber) {
        super("WithBlockNode", lineNumber, columnNumber);
        this.assignments = new ArrayList<>();
        this.body = new ArrayList<>();
    }

    public WithBlockNode(int lineNumber) {
        super("WithBlockNode", lineNumber, 0);
        this.assignments = new ArrayList<>();
        this.body = new ArrayList<>();
    }

    // ==================== Assignments ====================
    public List<WithAssignmentNode> getAssignments() {
        return assignments;
    }

    public void setAssignments(List<WithAssignmentNode> assignments) {
        this.assignments = assignments;
    }

    public void addAssignment(WithAssignmentNode assignment) {
        this.assignments.add(assignment);
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
        children.addAll(assignments);
        children.addAll(body);
        return children;
    }

    // ==================== Display ====================
    @Override
    protected String getExtraInfo() {
        return String.format("(assignmentCount: %d)", assignments.size());
    }
}
