package antlr.ast.jinja2.content.elements;

import antlr.ast.jinja2.content.NormalHtmlElementNode;
import antlr.ast.visitor.ASTVisitor;

/**
 * Represents a generic/unknown HTML element (custom elements, web components).
 * Unlike specific element nodes, this accepts a dynamic tag name parameter.
 *
 * Examples:
 * - &lt;my-custom-element&gt;
 * - &lt;web-component&gt;
 * - Any tag not explicitly defined in the grammar
 */
public class GenericHtmlNode extends NormalHtmlElementNode {

    public GenericHtmlNode(String tagName, int lineNumber, int columnNumber) {
        super(lineNumber, columnNumber);
        this.setTagName(tagName);  // Dynamic tag name from parameter
    }

    public GenericHtmlNode(String tagName, int lineNumber) {
        this(tagName, lineNumber, 0);
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
