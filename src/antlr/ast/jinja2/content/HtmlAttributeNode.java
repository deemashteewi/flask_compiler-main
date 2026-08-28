package antlr.ast.jinja2.content;

import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;

/**
 * Abstract base class for HTML Attribute nodes.
 *
 * Grammar:
 * htmlAttribute : attrName (TAG_EQUALS attrValue)?
 *
 * Subclasses:
 * - StaticHtmlAttributeNode: attribute with static string name (e.g., class="container")
 * - DynamicHtmlAttributeNode: attribute with dynamic Jinja2 expression name (e.g., {{ attr_name }}="value")
 *
 */
public abstract class HtmlAttributeNode extends ASTNode {

    // Attribute value (can contain mixed text and Jinja2 expressions)
    protected HtmlAttributeValueNode value;

    // Quote style
    protected QuoteStyle quoteStyle;

    protected HtmlAttributeNode(String nodeName, int lineNumber, int columnNumber) {
        super(nodeName, lineNumber, columnNumber);
        this.quoteStyle = QuoteStyle.NONE;
    }

    // ==================== Abstract Methods ====================

    /**
     * Get the attribute name as a string for display purposes.
     * Static attributes return the actual name, dynamic attributes return "(dynamic)".
     */
    public abstract String getNameAsString();

    // ==================== Value ====================

    public HtmlAttributeValueNode getValue() {
        return value;
    }

    public void setValue(HtmlAttributeValueNode value) {
        this.value = value;
        if (value != null) {
            value.setParent(this);
        }
    }

    public boolean hasValue() {
        return value != null;
    }

    /**
     * Boolean attributes are attributes without values: <input disabled>
     */
    public boolean isBooleanAttribute() {
        return value == null && quoteStyle == QuoteStyle.NONE;
    }

    // ==================== Quote Style ====================

    public QuoteStyle getQuoteStyle() {
        return quoteStyle;
    }

    public void setQuoteStyle(QuoteStyle quoteStyle) {
        this.quoteStyle = quoteStyle;
    }

    // ==================== Visitor Pattern ====================

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    // ==================== Display ====================

    @Override
    protected String getExtraInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("(name: ");
        sb.append(getNameAsString());
        if (isBooleanAttribute()) {
            sb.append(", boolean");
        } else {
            sb.append(", quote: ").append(quoteStyle.name().toLowerCase());
        }
        sb.append(")");
        return sb.toString();
    }
}
