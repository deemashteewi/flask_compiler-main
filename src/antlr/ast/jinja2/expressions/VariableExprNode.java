package antlr.ast.jinja2.expressions;

import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a simple variable reference in Jinja2 expressions.
 *
 * Examples:
 * - product
 * - user
 * - title
 */
public class VariableExprNode extends JinjaExpressionNode {

    private String name;

    public VariableExprNode(int lineNumber, int columnNumber) {
        super("VariableExprNode", lineNumber, columnNumber);
    }

    public VariableExprNode(int lineNumber) {
        super("VariableExprNode", lineNumber, 0);
    }

    // ==================== Getters ====================
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean hasName() {
        return name != null && !name.isBlank();
    }

    // ==================== Visitor Pattern ====================
    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    // ==================== Children ====================
    @Override
    public List<ASTNode> getChildren() {
        return new ArrayList<>();
    }

    // ==================== Display ====================
    @Override
    protected String getExtraInfo() {
        if (name != null) {
            return String.format("(name: %s)", name);
        }
        return "";
    }

    @Override
    public String toValueString() {
        return name != null ? name : "";
    }

    @Override
    public String getFullPath() {
        return name != null ? name : "";
    }
}
