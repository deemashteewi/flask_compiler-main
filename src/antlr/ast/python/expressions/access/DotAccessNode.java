package antlr.ast.python.expressions.access;

import java.util.ArrayList;
import java.util.List;

import antlr.ast.node.ASTNode;
import antlr.ast.python.expressions.ExpressionNode;
import antlr.ast.visitor.ASTVisitor;

/**
 * عقدة المتغير (Variable Reference) تمثل استخدام متغير في تعبير
 */
public class DotAccessNode extends ExpressionNode {

    private ExpressionNode object;
    private String property;

    public DotAccessNode(int lineNumber, int columnNumber) {
        super("Dot Access", lineNumber, columnNumber);  // ✅ List not Variable
    }

    // Getter
    public String getProperty() {
        return property;
    }

    public ExpressionNode getObject() {
        return object;
    }

    // Setter
    public void addObject(ExpressionNode node) {  // ✅ void not <T>
        object = node;
    }

    public void addProperty(String node) {  // ✅ void not <T>
        property = node;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> children = new ArrayList<>();
        if (object != null) {
            children.add(object);  // ✅ object فقط
        }
        // ✅ property لا تُضاف لأنها String
        return children;
    }

    @Override
    protected String getExtraInfo() {
        return String.format("(property: %s)", property);
    }

    @Override
    public String toValueString() {
        return object.toValueString() + "." + property;
    }
}
