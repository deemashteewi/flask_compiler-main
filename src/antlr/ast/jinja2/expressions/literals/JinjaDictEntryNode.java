package antlr.ast.jinja2.expressions.literals;

import java.util.ArrayList;
import java.util.List;
import antlr.ast.node.ASTNode;
import antlr.ast.jinja2.expressions.JinjaExpressionNode;
import antlr.ast.visitor.ASTVisitor;

/**
 * عقدة عنصر القاموس (Dictionary Entry)
 * تمثل زوج مفتاح-قيمة في القاموس
 */
public class JinjaDictEntryNode extends JinjaExpressionNode {

    private JinjaExpressionNode key;
    private JinjaExpressionNode value;

    public JinjaDictEntryNode(int lineNumber, int columnNumber) {
        super("JinjaDictEntry", lineNumber, columnNumber);
    }

    // Getter
    public JinjaExpressionNode getKey() {
        return key;
    }

    public JinjaExpressionNode getValue() {
        return value;
    }

    // Setter
    public void setKey(JinjaExpressionNode node) {
        key = node;
    }

    public void setValue(JinjaExpressionNode node) {
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
        String keyStr = key != null ? key.toValueString() : "null";
        String valueStr = value != null ? value.toValueString() : "null";
        return keyStr + ": " + valueStr;
    }
}
