package antlr.ast.python.expressions.literals;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import antlr.ast.node.ASTNode;
import antlr.ast.python.expressions.ExpressionNode;
import antlr.ast.visitor.ASTVisitor;

/**
 * عقدة المتغير (Variable Reference)
 * تمثل استخدام متغير في تعبير
 */
public class DictNode extends ExpressionNode {

    private final List<DictEntryNode> elements = new ArrayList<>();

    public DictNode(int lineNumber, int columnNumber) {
        super("Dict", lineNumber, columnNumber);  // ✅ List not Variable
    }

    // Getter
    public List<DictEntryNode> getElements() {
        return elements;
    }

    // Setter
    public void addElement(DictEntryNode node) {  // ✅ void not <T>
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
            .map(DictEntryNode::toValueString)
            .collect(Collectors.joining(", ")) + "]";
    }
}