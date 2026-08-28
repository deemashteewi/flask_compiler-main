package antlr.ast.jinja2.content;

import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Abstract base class for HTML Element nodes.
 *
 * Grammar:
 * htmlElement   : htmlOpenTag htmlContent* htmlCloseTag?   # NormalElement
 *               | htmlVoidTag                               # VoidElement
 *               | htmlSelfClosingTag                        # SelfClosingElement
 *
 * Subclasses:
 * - NormalHtmlElementNode: elements with children (e.g., <div>...</div>)
 * - VoidHtmlElementNode: elements that cannot have children (e.g., <br>, <img>)
 * - SelfClosingHtmlElementNode: explicitly self-closed elements (e.g., <div />)
 *
 * @see NormalHtmlElementNode
 * @see VoidHtmlElementNode
 */
public abstract class HtmlElementNode extends ASTNode {

    // Tag name (lowercase normalized)
    private String tagName;

    // Attributes: class="value", id="id", etc.
    protected List<HtmlAttributeNode> attributes;

    protected HtmlElementNode(String nodeName, int lineNumber, int columnNumber) {
        super(nodeName, lineNumber, columnNumber);
        this.attributes = new ArrayList<>();
    }

    // ==================== Abstract Methods ====================

    /**
     * Whether this element type can have children.
     * Normal elements return true, void and self-closing elements return false.
     */
    public abstract boolean canHaveChildren();

    /**
     * Get the child nodes of this element.
     * For void and self-closing elements, this returns an empty list.
     */
    public abstract List<ASTNode> getChildNodes();

    // ==================== Tag Name ====================

    public String getTagName() {
        return tagName;
    }

    protected void setTagName(String tagName) {
        // Normalize to lowercase (HTML is case-insensitive)
        this.tagName = tagName != null ? tagName.toLowerCase() : null;
    }

    // ==================== Attributes ====================

    public List<HtmlAttributeNode> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<HtmlAttributeNode> attributes) {
        this.attributes = attributes;
    }

    public void addAttribute(HtmlAttributeNode attribute) {
        if (attribute != null) {
            attribute.setParent(this);
            this.attributes.add(attribute);
        }
    }

    public boolean hasAttributes() {
        return attributes != null && !attributes.isEmpty();
    }

    public HtmlAttributeNode getAttribute(String name) {
        if (name == null || attributes == null) return null;
        for (HtmlAttributeNode attr : attributes) {
            if (name.equalsIgnoreCase(attr.getNameAsString())) {
                return attr;
            }
        }
        return null;
    }

    public boolean hasAttribute(String name) {
        return getAttribute(name) != null;
    }

    // ==================== Visitor Pattern ====================

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
