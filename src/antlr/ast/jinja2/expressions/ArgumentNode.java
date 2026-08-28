package antlr.ast.jinja2.expressions;

import java.util.ArrayList;
import java.util.List;

import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;

/**
 * Argument node for function/macro calls.
 * Can be positional (value only) or keyword (name=value).
 *
 * Examples:
 * - Positional: my_func(42) → ArgumentNode with value=42, name=null
 * - Keyword: my_func(x=42) → ArgumentNode with name="x", value=42
 */
public class ArgumentNode extends JinjaExpressionNode {

    private String name;
    private JinjaExpressionNode value;

    public ArgumentNode(int lineNumber, int columnNumber) {
        super("Argument", lineNumber, columnNumber);
    }

    // Getter
    public String getName() {
        return name;
    }

    public JinjaExpressionNode getValue() {
        return value;
    }

    // Setter
    public void setValue(JinjaExpressionNode node) {
        value = node;
    }

    public void setName(String name) {
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

    /**
     * Returns a string representation of the argument.
     * For keyword args: "name=value", for positional: just "value"
     */
    @Override
    public String toValueString() {
        if (name != null) {
            return name + "=" + (value != null ? value.toValueString() : "null");
        }
        return value != null ? value.toValueString() : "null";
    }

}
