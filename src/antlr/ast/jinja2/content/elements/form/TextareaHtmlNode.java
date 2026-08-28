package antlr.ast.jinja2.content.elements.form;

import antlr.ast.jinja2.content.NormalHtmlElementNode;
import antlr.ast.visitor.ASTVisitor;

/**
 * Represents the HTML textarea element (&lt;textarea&gt;).
 * Defines a multi-line text input control.
 */
public class TextareaHtmlNode extends NormalHtmlElementNode {

    public TextareaHtmlNode(int lineNumber, int columnNumber) {
        super(lineNumber, columnNumber);
        this.setTagName("textarea");
    }

    public TextareaHtmlNode(int lineNumber) {
        this(lineNumber, 0);
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
