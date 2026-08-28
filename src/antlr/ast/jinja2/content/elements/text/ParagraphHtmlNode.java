package antlr.ast.jinja2.content.elements.text;

import antlr.ast.jinja2.content.NormalHtmlElementNode;
import antlr.ast.visitor.ASTVisitor;

/**
 * Represents the HTML p element (&lt;p&gt;).
 * Defines a paragraph of text.
 */
public class ParagraphHtmlNode extends NormalHtmlElementNode {

    public ParagraphHtmlNode(int lineNumber, int columnNumber) {
        super(lineNumber, columnNumber);
        this.setTagName("p");
    }

    public ParagraphHtmlNode(int lineNumber) {
        this(lineNumber, 0);
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
