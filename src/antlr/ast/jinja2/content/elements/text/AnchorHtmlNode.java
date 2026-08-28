package antlr.ast.jinja2.content.elements.text;

import antlr.ast.jinja2.content.NormalHtmlElementNode;
import antlr.ast.visitor.ASTVisitor;

/**
 * Represents the HTML anchor element (&lt;a&gt;).
 * Creates a hyperlink to other pages, locations, or resources.
 */
public class AnchorHtmlNode extends NormalHtmlElementNode {

    public AnchorHtmlNode(int lineNumber, int columnNumber) {
        super(lineNumber, columnNumber);
        this.setTagName("a");
    }

    public AnchorHtmlNode(int lineNumber) {
        this(lineNumber, 0);
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
