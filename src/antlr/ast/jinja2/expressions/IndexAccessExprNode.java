package antlr.ast.jinja2.expressions;

import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents an index access expression: object[index]
 *
 * Examples:
 * - items[0]
 * - products[i]
 * - data["key"]
 */
public class IndexAccessExprNode extends JinjaExpressionNode {

    private JinjaExpressionNode object;
    private JinjaExpressionNode index;

    public IndexAccessExprNode(int lineNumber, int columnNumber) {
        super("IndexAccessExpr", lineNumber, columnNumber);
    }

    // ==================== Getters/Setters ====================
    public JinjaExpressionNode getObject() {
        return object;
    }

    public void setObject(JinjaExpressionNode object) {
        this.object = object;
    }

    public JinjaExpressionNode getIndex() {
        return index;
    }

    public void setIndex(JinjaExpressionNode index) {
        this.index = index;
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
        if (index != null) {
            children.add(index);
        }
        return children;
    }

    // ==================== Display ====================
    @Override
    protected String getExtraInfo() {
        return "(index access)";
    }

    @Override
    public String toValueString() {
        StringBuilder sb = new StringBuilder();
        if (object != null) sb.append(object.toValueString());
        sb.append("[");
        if (index != null) sb.append(index.toValueString());
        sb.append("]");
        return sb.toString();
    }

    @Override
    public String getFullPath() {
        return toValueString();
    }
}
