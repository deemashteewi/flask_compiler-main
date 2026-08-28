package antlr.ast.jinja2.content.elements.document;

import antlr.ast.jinja2.content.NormalHtmlElementNode;
import antlr.ast.visitor.ASTVisitor;

/**
 * Represents the HTML title element (&lt;title&gt;).
 * Defines the document title shown in browser tab.
 */
public class TitleHtmlNode extends NormalHtmlElementNode {

    public TitleHtmlNode(int lineNumber, int columnNumber) {
        super(lineNumber, columnNumber);
        this.setTagName("title");
    }

    public TitleHtmlNode(int lineNumber) {
        this(lineNumber, 0);
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
