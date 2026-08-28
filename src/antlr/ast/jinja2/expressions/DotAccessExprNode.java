package antlr.ast.jinja2.expressions;

import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a dot access expression: object.property
 *
 * Examples:
 * - product.name
 * - user.profile.email
 * - request.form.get
 */
public class DotAccessExprNode extends JinjaExpressionNode {

    private JinjaExpressionNode object;
    private String property;

    public DotAccessExprNode(int lineNumber, int columnNumber) {
        super("DotAccessExpr", lineNumber, columnNumber);
    }

    // ==================== Getters/Setters ====================
    public JinjaExpressionNode getObject() {
        return object;
    }

    public void setObject(JinjaExpressionNode object) {
        this.object = object;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    // ==================== Full Path ====================
    @Override
    public String getFullPath() {
        if (object instanceof DotAccessExprNode) {
            return ((DotAccessExprNode) object).getFullPath() + "." + property;
        } else if (object instanceof VariableExprNode) {
            return ((VariableExprNode) object).getName() + "." + property;
        } else if (object != null) {
            return object.getFullPath() + "." + property;
        }
        return property;
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
        if (object != null) {
            children.add(object);
        }
        return children;
    }

    // ==================== Display ====================
    @Override
    protected String getExtraInfo() {
        return String.format("(property: %s)", property);
    }

    @Override
    public String toValueString() {
        return getFullPath();
    }
}
