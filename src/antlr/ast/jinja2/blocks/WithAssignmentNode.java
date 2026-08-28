package antlr.ast.jinja2.blocks;

import java.util.ArrayList;
import java.util.List;

import antlr.ast.jinja2.expressions.JinjaExpressionNode;
import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;

/**
 * With assignment node: name = expression
 *
 * Grammar: withAssignment : name=NAME ASSIGN value=expression;
 *
 * Example: {% with x = 1, name = user.name %}
 *          x = 1 and name = user.name are each a WithAssignmentNode
 */
public class WithAssignmentNode extends ASTNode {

    private String name;
    private JinjaExpressionNode value;

    public WithAssignmentNode(int lineNumber, int columnNumber) {
        super("WithAssignmentNode", lineNumber, columnNumber);
    }

    public WithAssignmentNode(int lineNumber) {
        super("WithAssignmentNode", lineNumber, 0);
    }

    // ==================== Name ====================
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // ==================== Value ====================
    public JinjaExpressionNode getValue() {
        return value;
    }

    public void setValue(JinjaExpressionNode value) {
        this.value = value;
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
        if (value != null) {
            children.add(value);
        }
        return children;
    }

    // ==================== Display ====================
    @Override
    protected String getExtraInfo() {
        return String.format("(name: %s)", name);
    }
}
