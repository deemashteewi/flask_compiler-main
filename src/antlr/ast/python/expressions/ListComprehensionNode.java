package antlr.ast.python.expressions;

import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;
import java.util.ArrayList;
import java.util.List;

/**
 * عقدة List Comprehension
 * تمثل: [element for target in iterable] أو [element for target in iterable if filter]
 */
public class ListComprehensionNode extends ExpressionNode {

    private final ExpressionNode element;
    private final String targetVariable;
    private final ExpressionNode iterable;
    private final ExpressionNode filterCondition;  // يمكن أن يكون null

    public ListComprehensionNode(ExpressionNode element, String targetVariable,
                                  ExpressionNode iterable, ExpressionNode filterCondition,
                                  int lineNumber, int columnNumber) {
        super("ListComprehension", lineNumber, columnNumber);

        this.element = element;
        this.targetVariable = targetVariable;
        this.iterable = iterable;
        this.filterCondition = filterCondition;

        // Set parent references
        if (element != null) element.setParent(this);
        if (iterable != null) iterable.setParent(this);
        if (filterCondition != null) filterCondition.setParent(this);
    }

    // ==================== Getters ====================

    public ExpressionNode getElement() {
        return element;
    }

    public String getTargetVariable() {
        return targetVariable;
    }

    public ExpressionNode getIterable() {
        return iterable;
    }

    public ExpressionNode getFilterCondition() {
        return filterCondition;
    }

    public boolean hasFilter() {
        return filterCondition != null;
    }

    // ==================== Interface Implementation ====================

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> children = new ArrayList<>();
        if (element != null) children.add(element);
        if (iterable != null) children.add(iterable);
        if (filterCondition != null) children.add(filterCondition);
        return children;
    }

    @Override
    protected String getExtraInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("(target: ").append(targetVariable);
        if (hasFilter()) {
            sb.append(", filtered");
        }
        sb.append(")");
        return sb.toString();
    }

    @Override
    public String toValueString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if (element != null) sb.append(element.toValueString());
        sb.append(" for ").append(targetVariable).append(" in ");
        if (iterable != null) sb.append(iterable.toValueString());
        if (filterCondition != null) {
            sb.append(" if ").append(filterCondition.toValueString());
        }
        sb.append("]");
        return sb.toString();
    }
}
