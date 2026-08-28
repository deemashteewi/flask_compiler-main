package antlr.ast.python.expressions.literals;

import java.util.ArrayList;
import java.util.List;
import antlr.ast.node.ASTNode;
import antlr.ast.python.expressions.ExpressionNode;
import antlr.ast.visitor.ASTVisitor;

/**
 * عقدة المتغير (Variable Reference) تمثل استخدام متغير في تعبير
 */
public class DictEntryNode extends ExpressionNode {

    private ExpressionNode key;
    private ExpressionNode value;

    public DictEntryNode(int lineNumber, int columnNumber) {
        super("DictEntry", lineNumber, columnNumber);  // ✅ List not Variable
    }

    // Getter
    public ExpressionNode getKey() {
        return key;
    }

    public ExpressionNode getValue() {
        return value;
    }

    // Setter
    public void addKey(ExpressionNode node) {  // ✅ void not <T>
        key = node;
    }

    public void addValue(ExpressionNode node) {  // ✅ void not <T>
        value = node;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> children = new ArrayList<>();
        if (key != null) {
            children.add(key);
        }
        if (value != null) {
            children.add(value);
        }
        return children;
    }

    @Override
    protected String getExtraInfo() {
        return String.format(
                "(key=%s, value=%s)",
                key != null ? "ok" : "null",
                value != null ? "ok" : "null"
        );
    }

    @Override
    public String toValueString() {
        return key.toValueString() + ":" + value.toValueString();
    }
}
