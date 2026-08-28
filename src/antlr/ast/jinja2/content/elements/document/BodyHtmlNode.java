package antlr.ast.jinja2.content.elements.document;

import antlr.ast.jinja2.content.NormalHtmlElementNode;
import antlr.ast.visitor.ASTVisitor;

/**
 * Represents the HTML body element (&lt;body&gt;).
 * Contains the visible content of the HTML document.
 */
public class BodyHtmlNode extends NormalHtmlElementNode {

    public BodyHtmlNode(int lineNumber, int columnNumber) {
        super(lineNumber, columnNumber);
        this.setTagName("body");
    }

    public BodyHtmlNode(int lineNumber) {
        this(lineNumber, 0);
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
