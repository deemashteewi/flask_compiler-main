package antlr.ast.jinja2.content;

import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;
import java.util.Collections;
import java.util.List;

/**
 * Represents raw HTML text content in a Jinja2 template.
 * This node holds plain text that appears between HTML tags and Jinja2 constructs.
 *
 * Example:
 * ```
 * <p>This is text content</p>
 *     ^^^^^^^^^^^^^^^^^^^^
 *         HtmlTextNode
 * ```
 */
public class HtmlTextNode extends ASTNode {

    private String text;

    public HtmlTextNode(String text, int lineNumber, int columnNumber) {
        super("HtmlTextNode", lineNumber, columnNumber);
        this.text = text;
    }

    // ==================== Text ====================

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    // ==================== Children ====================

    @Override
    public List<ASTNode> getChildren() {
        return Collections.emptyList();
    }

    // ==================== Visitor Pattern ====================

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    // ==================== Display ====================

    @Override
    protected String getExtraInfo() {
        // Truncate long text for display
        String preview = text;
        if (preview.length() > 30) {
            preview = preview.substring(0, 30) + "...";
        }
        // Escape newlines and carriage returns for display
        preview = preview.replace("\n", "\\n").replace("\r", "\\r");
        return "(text: \"" + preview + "\")";
    }
}
