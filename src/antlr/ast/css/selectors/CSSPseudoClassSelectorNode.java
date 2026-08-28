package antlr.ast.css.selectors;

import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;
import java.util.Collections;
import java.util.List;

/**
 * Pseudo-class selector node (e.g., :hover, :focus)
 */
public class CSSPseudoClassSelectorNode extends CSSSelectorNode {
    private final String pseudoClass;

    public CSSPseudoClassSelectorNode(String pseudoClass, int lineNumber, int columnNumber) {
        super("CSSPseudoClassSelector", lineNumber, columnNumber);
        this.pseudoClass = pseudoClass;
    }

    public CSSPseudoClassSelectorNode(String pseudoClass, int lineNumber) {
        this(pseudoClass, lineNumber, 0);
    }

    public String getPseudoClass() {
        return pseudoClass;
    }

    @Override
    public String getSelectorText() {
        return ":" + pseudoClass;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public List<ASTNode> getChildren() {
        return Collections.emptyList();
    }

    @Override
    protected String getExtraInfo() {
        return String.format("pseudo='%s'", pseudoClass);
    }
}
