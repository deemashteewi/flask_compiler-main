package antlr.ast.jinja2.content.elements.form;

import antlr.ast.jinja2.content.NormalHtmlElementNode;
import antlr.ast.visitor.ASTVisitor;

/**
 * Represents the HTML label element (&lt;label&gt;).
 * Defines a label for form elements.
 */
public class LabelHtmlNode extends NormalHtmlElementNode {

    public LabelHtmlNode(int lineNumber, int columnNumber) {
        super(lineNumber, columnNumber);
        this.setTagName("label");
    }

    public LabelHtmlNode(int lineNumber) {
        this(lineNumber, 0);
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
