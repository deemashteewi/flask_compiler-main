package antlr.ast.jinja2.content.elements.form;

import antlr.ast.jinja2.content.NormalHtmlElementNode;
import antlr.ast.visitor.ASTVisitor;

/**
 * Represents the HTML form element (&lt;form&gt;).
 * Defines a form for user input.
 */
public class FormHtmlNode extends NormalHtmlElementNode {

    public FormHtmlNode(int lineNumber, int columnNumber) {
        super(lineNumber, columnNumber);
        this.setTagName("form");
    }

    public FormHtmlNode(int lineNumber) {
        this(lineNumber, 0);
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
