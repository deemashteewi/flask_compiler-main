package antlr.ast.css.selectors;

import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;
import java.util.Collections;
import java.util.List;

/**
 * Element selector node (e.g., body, h1, p, div)
 */
public class CSSElementSelectorNode extends CSSSelectorNode {
    private final String elementName;

    public CSSElementSelectorNode(String elementName, int lineNumber, int columnNumber) {
        super("CSSElementSelector", lineNumber, columnNumber);
        this.elementName = elementName;
    }

    public CSSElementSelectorNode(String elementName, int lineNumber) {
        this(elementName, lineNumber, 0);
    }

    public String getElementName() {
        return elementName;
    }

    @Override
    public String getSelectorText() {
        return elementName;
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
        return String.format("element='%s'", elementName);
    }
}
