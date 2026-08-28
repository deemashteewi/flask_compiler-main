package antlr.ast.python.expressions.access;

import java.util.ArrayList;
import java.util.List;

import antlr.ast.node.ASTNode;
import antlr.ast.python.expressions.ExpressionNode;
import antlr.ast.visitor.ASTVisitor;

/**
 * عقدة المتغير (Variable Reference) تمثل استخدام متغير في تعبير
 */
public class IndexAccessNode extends ExpressionNode {

    private ExpressionNode container;
    private ExpressionNode key;

    public IndexAccessNode(int lineNumber, int columnNumber) {
        super("Index Access", lineNumber, columnNumber);  // ✅ List not Variable
    }

    // Getter
    public ExpressionNode getKey() {
        return key;
    }

    public ExpressionNode getContainer() {
        return container;
    }

    // Setter
    public void addKey(ExpressionNode node) {  // ✅ void not <T>
        key = node;
    }

    public void addContainer(ExpressionNode node) {  // ✅ void not <T>
        container = node;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> children = new ArrayList<>();
        if (container != null) {
            children.add(container);
        }
        if (key != null) {
            children.add(key);
        }
        return children;
    }

    @Override
    protected String getExtraInfo() {
        return String.format(
                "(Container=%s, key=%s)",
                container != null ? "ok" : "null",
                key != null ? "ok" : "null"
        );
    }

    @Override
    public String toValueString() {
        return container.toValueString() + "[" + key.toValueString() + "]";
    }
}
