package antlr.ast.css.selectors;

import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Descendant combinator selector node (e.g., .product-card img, div p)
 * Represents ancestor descendant relationships
 */
public class CSSDescendantSelectorNode extends CSSSelectorNode {
    private final CSSSelectorNode ancestor;
    private final List<CSSSelectorNode> descendants;

    public CSSDescendantSelectorNode(CSSSelectorNode ancestor, int lineNumber, int columnNumber) {
        super("CSSDescendantSelector", lineNumber, columnNumber);
        this.ancestor = ancestor;
        this.descendants = new ArrayList<>();
        if (ancestor != null) {
            ancestor.setParent(this);
        }
    }

    public CSSDescendantSelectorNode(CSSSelectorNode ancestor, int lineNumber) {
        this(ancestor, lineNumber, 0);
    }

    public void addDescendant(CSSSelectorNode descendant) {
        if (descendant != null) {
            descendants.add(descendant);
            descendant.setParent(this);
        }
    }

    public CSSSelectorNode getAncestor() {
        return ancestor;
    }

    public List<CSSSelectorNode> getDescendants() {
        return descendants;
    }

    @Override
    public String getSelectorText() {
        String ancestorText = ancestor != null ? ancestor.getSelectorText() : "";
        String descendantsText = descendants.stream()
                .map(CSSSelectorNode::getSelectorText)
                .collect(Collectors.joining(" "));
        return ancestorText + " " + descendantsText;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> children = new ArrayList<>();
        if (ancestor != null) {
            children.add(ancestor);
        }
        children.addAll(descendants);
        return children;
    }

    @Override
    protected String getExtraInfo() {
        return String.format("'%s'", getSelectorText());
    }
}
