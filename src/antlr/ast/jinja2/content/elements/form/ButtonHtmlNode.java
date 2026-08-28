package antlr.ast.jinja2.content.elements.form;

import antlr.ast.jinja2.content.NormalHtmlElementNode;
import antlr.ast.visitor.ASTVisitor;

/**
 * Represents the HTML button element (&lt;button&gt;).
 * Defines a clickable button.
 */
public class ButtonHtmlNode extends NormalHtmlElementNode {

    public ButtonHtmlNode(int lineNumber, int columnNumber) {
        super(lineNumber, columnNumber);
        this.setTagName("button");
    }

    public ButtonHtmlNode(int lineNumber) {
        this(lineNumber, 0);
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
