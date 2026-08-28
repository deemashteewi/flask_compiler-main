package antlr.ast.jinja2;

import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Root node for a Jinja2 template.
 * Contains all template content (HTML text, blocks, expressions, statements).
 *
 * Grammar: template : templateContent* EOF;
 */
public class TemplateNode extends ASTNode {

    private final List<ASTNode> content;

    public TemplateNode(int lineNumber, int columnNumber) {
        super("Template", lineNumber, columnNumber);
        this.content = new ArrayList<>();
    }

    public TemplateNode(int lineNumber) {
        this(lineNumber, 0);

    }

    // ==================== Content Management ====================
    public List<ASTNode> getContent() {
        return content;
    }

    public void addContent(ASTNode node) {
        if (node != null) {
            content.add(node);
            node.setParent(this);
        }
    }

    // ==================== Visitor Pattern ====================
    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public List<ASTNode> getChildren() {
        return new ArrayList<>(content);
    }

    @Override
    protected String getExtraInfo() {
        return String.format("(content: %d items)", content.size());
    }
}
