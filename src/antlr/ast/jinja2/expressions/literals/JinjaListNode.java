package antlr.ast.jinja2.expressions.literals;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import antlr.ast.node.ASTNode;
import antlr.ast.jinja2.expressions.JinjaExpressionNode;
import antlr.ast.visitor.ASTVisitor;

/**
 * عقدة القائمة (List Literal)
 * تمثل قائمة من العناصر
 */
public class JinjaListNode extends JinjaExpressionNode {

    private final List<JinjaExpressionNode> elements = new ArrayList<>();

    public JinjaListNode(int lineNumber, int columnNumber) {
        super("JinjaList", lineNumber, columnNumber);
    }

    // Getter
    public List<JinjaExpressionNode> getElements() {
        return elements;
    }

    // Setter
    public void addElement(JinjaExpressionNode node) {
        elements.add(node);
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public List<ASTNode> getChildren() {
        return new ArrayList<>(elements);  // ✅ Java syntax
    }

    @Override
    protected String getExtraInfo() {
        return String.format("(elements: %d)", elements.size());
    }

    @Override
    public String toValueString() {
        return "[" + elements.stream()
            .map(JinjaExpressionNode::toValueString)
            .collect(Collectors.joining(", ")) + "]";
    }
}