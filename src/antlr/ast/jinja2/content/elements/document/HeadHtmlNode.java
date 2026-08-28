package antlr.ast.jinja2.content.elements.document;

import antlr.ast.jinja2.content.NormalHtmlElementNode;
import antlr.ast.visitor.ASTVisitor;

/**
 * Represents the HTML head element (&lt;head&gt;).
 * Contains document metadata, links to scripts and stylesheets.
 */
public class HeadHtmlNode extends NormalHtmlElementNode {

    public HeadHtmlNode(int lineNumber, int columnNumber) {
        super(lineNumber, columnNumber);
        this.setTagName("head");
    }

    public HeadHtmlNode(int lineNumber) {
        this(lineNumber, 0);
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
