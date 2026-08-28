package antlr.ast.jinja2.content.elements.embedded;

import antlr.ast.jinja2.content.NormalHtmlElementNode;
import antlr.ast.visitor.ASTVisitor;

/**
 * Represents the HTML style element (&lt;style&gt;).
 * Contains CSS styling information for the document.
 */
public class StyleHtmlNode extends NormalHtmlElementNode {

    public StyleHtmlNode(int lineNumber, int columnNumber) {
        super(lineNumber, columnNumber);
        this.setTagName("style");
    }

    public StyleHtmlNode(int lineNumber) {
        this(lineNumber, 0);
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
