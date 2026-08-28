package antlr.ast.jinja2.content.elements.sectioning;

import antlr.ast.jinja2.content.NormalHtmlElementNode;
import antlr.ast.visitor.ASTVisitor;

/**
 * Represents the HTML h1 element (&lt;h1&gt;).
 * The highest level heading element.
 */
public class H1HtmlNode extends NormalHtmlElementNode {

    public H1HtmlNode(int lineNumber, int columnNumber) {
        super(lineNumber, columnNumber);
        this.setTagName("h1");
    }

    public H1HtmlNode(int lineNumber) {
        this(lineNumber, 0);
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
