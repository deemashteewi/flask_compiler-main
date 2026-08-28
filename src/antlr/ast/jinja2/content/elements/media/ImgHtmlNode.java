package antlr.ast.jinja2.content.elements.media;

import antlr.ast.jinja2.content.VoidHtmlElementNode;
import antlr.ast.visitor.ASTVisitor;

/**
 * Represents the HTML img element (&lt;img&gt;).
 * Embeds an image (void element - cannot have children).
 */
public class ImgHtmlNode extends VoidHtmlElementNode {

    public ImgHtmlNode(int lineNumber, int columnNumber) {
        super(lineNumber, columnNumber);
        this.setTagName("img");
    }

    public ImgHtmlNode(int lineNumber) {
        this(lineNumber, 0);
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
