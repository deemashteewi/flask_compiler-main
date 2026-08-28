package antlr.ast.jinja2.content.elements.document;

import antlr.ast.jinja2.content.NormalHtmlElementNode;
import antlr.ast.visitor.ASTVisitor;

/**
 * Represents the HTML root element (&lt;html&gt;).
 * This is the top-level container for an HTML document.
 */
public class HtmlRootHtmlNode extends NormalHtmlElementNode {

    public HtmlRootHtmlNode(int lineNumber, int columnNumber) {
        super(lineNumber, columnNumber);
        this.setTagName("html");
    }

    public HtmlRootHtmlNode(int lineNumber) {
        this(lineNumber, 0);
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
