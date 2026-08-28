package antlr.ast.jinja2.expressions.literals;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import antlr.ast.node.ASTNode;
import antlr.ast.jinja2.expressions.JinjaExpressionNode;
import antlr.ast.visitor.ASTVisitor;

/**
 * عقدة القاموس (Dictionary Literal)
 * تمثل قاموس من المفاتيح والقيم
 */
public class JinjaDictNode extends JinjaExpressionNode {

    private final List<JinjaDictEntryNode> elements = new ArrayList<>();

    public JinjaDictNode(int lineNumber, int columnNumber) {
        super("JinjaDict", lineNumber, columnNumber);
    }

    // Getter
    public List<JinjaDictEntryNode> getElements() {
        return elements;
    }

    // Setter
    public void addElement(JinjaDictEntryNode node) {
        elements.add(node);
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public List<ASTNode> getChildren() {
        return new ArrayList<>(elements);
    }

    @Override
    protected String getExtraInfo() {
        return String.format("(elements: %d)", elements.size());
    }

    @Override
    public String toValueString() {
        return "{" + elements.stream()
            .map(JinjaDictEntryNode::toValueString)
            .collect(Collectors.joining(", ")) + "}";
    }
}
