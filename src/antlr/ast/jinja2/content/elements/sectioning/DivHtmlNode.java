package antlr.ast.jinja2.content.elements.sectioning;

import antlr.ast.jinja2.content.NormalHtmlElementNode;
import antlr.ast.visitor.ASTVisitor;

/**
 * Represents the HTML div element (&lt;div&gt;).
 * A generic container for flow content with no semantic meaning.
 */
public class DivHtmlNode extends NormalHtmlElementNode {

    public DivHtmlNode(int lineNumber, int columnNumber) {
        super(lineNumber, columnNumber);
        this.setTagName("div");
    }

    public DivHtmlNode(int lineNumber) {
        this(lineNumber, 0);
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
