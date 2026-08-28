package antlr.ast.jinja2.content.elements.form;

import antlr.ast.jinja2.content.VoidHtmlElementNode;
import antlr.ast.visitor.ASTVisitor;

/**
 * Represents the HTML input element (&lt;input&gt;).
 * Defines an input control (void element - cannot have children).
 */
public class InputHtmlNode extends VoidHtmlElementNode {

    public InputHtmlNode(int lineNumber, int columnNumber) {
        super(lineNumber, columnNumber);
        this.setTagName("input");
    }

    public InputHtmlNode(int lineNumber) {
        this(lineNumber, 0);
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
