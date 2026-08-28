package antlr.ast.python.expressions.access;

import java.util.ArrayList;
import java.util.List;

import antlr.ast.node.ASTNode;
import antlr.ast.python.expressions.ExpressionNode;
import antlr.ast.visitor.ASTVisitor;

/**
 * عقدة المتغير (Variable Reference) تمثل استخدام متغير في تعبير
 */
public class KeywordArgumentNode extends ExpressionNode {

    private String name;
    private ExpressionNode value;

    public KeywordArgumentNode(int lineNumber, int columnNumber) {
        super("Keyword_Argument", lineNumber, columnNumber);  // ✅ List not Variable
    }

    // Getter
    public String getName() {
        return name;
    }

    public ExpressionNode getValue() {
        return value;
    }

    // Setter
    public void addValue(ExpressionNode node) {  // ✅ void not <T>
        value = node;
    }

    public void addName(String name) {  // ✅ void not <T>
        this.name = name;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> children = new ArrayList<>();
        if (value != null) {
            children.add(value);
        }
        return children;
    }

    @Override
    protected String getExtraInfo() {
        return String.format(
                "(Name=%s, value=%s)",
                name != null ? "ok" : "null",
                value != null ? "ok" : "null"
        );
    }

    @Override
    public String toValueString() {
        if (name != null) {
            return name + "=" + (value != null ? value.toValueString() : "null");
        }
        return value != null ? value.toValueString() : "null";
    }

}
