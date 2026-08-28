package antlr.ast.jinja2.content;

import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Normal HTML element that can have children.
 *
 * Examples:
 * - <div class="container">content</div>
 * - <p>Paragraph text</p>
 * - <li>Item (can be implicitly closed by next <li> or </ul>)
 * - <table><tr><td>Cell</td></tr></table>
 */
public class NormalHtmlElementNode extends HtmlElementNode {

    // Children: HTML elements, text, Jinja2 blocks
    private List<ASTNode> children;

    // Was this element implicitly closed by HTML5 rules?
    private boolean implicitlyClosed;

    public NormalHtmlElementNode(int lineNumber, int columnNumber) {
        super("NormalHtmlElement", lineNumber, columnNumber);
        this.children = new ArrayList<>();
        this.implicitlyClosed = false;
    }

    public NormalHtmlElementNode(int lineNumber) {
        this(lineNumber, 0);
    }

    // ==================== Children ====================

    @Override
    public List<ASTNode> getChildNodes() {
        return children;
    }

    public void setChildNodes(List<ASTNode> children) {
        this.children = children;
    }

    public void addChild(ASTNode child) {
        if (child != null) {
            child.setParent(this);
            this.children.add(child);
        }
    }

    public boolean hasChildNodes() {
        return children != null && !children.isEmpty();
    }

    @Override
    public boolean canHaveChildren() {
        return true;
    }

    // ==================== Implicitly Closed ====================

    public boolean isImplicitlyClosed() {
        return implicitlyClosed;
    }

    public void setImplicitlyClosed(boolean implicitlyClosed) {
        this.implicitlyClosed = implicitlyClosed;
    }

    // ==================== Visitor Pattern ====================

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    // ==================== AST Children ====================

    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> allChildren = new ArrayList<>();
        if (attributes != null) {
            allChildren.addAll(attributes);
        }
        if (children != null) {
            allChildren.addAll(children);
        }
        return allChildren;
    }

    // ==================== Display ====================

    @Override
    protected String getExtraInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("(tag: ").append(getTagName());
        sb.append(", type: normal");
        if (hasAttributes()) {
            sb.append(", attrs: ").append(attributes.size());
        }
        if (implicitlyClosed) {
            sb.append(", implicit");
        }
        sb.append(")");
        return sb.toString();
    }
}
