package antlr.ast.jinja2.statements;

import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Set block node: {% set name %} ... {% endset %}
 *
 * Grammar:
 * setBlockStatement: SET name=NAME templateContent* ENDSET;
 *
 * Examples:
 * - {% set navigation %}<li>Home</li><li>About</li>{% endset %}
 * - {% set sidebar %}{{ render_menu() }}{% endset %}
 *
 * Captures template content into a variable (different from regular set which assigns an expression).
 */
public class SetBlockNode extends ASTNode {

    // Variable name to assign the captured content
    private String name;

    // Template content captured (HTML, expressions, other blocks)
    private List<ASTNode> body;

    public SetBlockNode(int lineNumber, int columnNumber) {
        super("SetBlockNode", lineNumber, columnNumber);
        this.body = new ArrayList<>();
    }

    public SetBlockNode(int lineNumber) {
        super("SetBlockNode", lineNumber, 0);
        this.body = new ArrayList<>();
    }

    // ==================== Getters ====================
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // ==================== Body ====================
    public List<ASTNode> getBody() {
        return body;
    }

    public void setBody(List<ASTNode> body) {
        this.body = body;
    }

    public void addToBody(ASTNode node) {
        this.body.add(node);
    }

    // ==================== Visitor Pattern ====================
    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    // ==================== Children ====================
    @Override
    public List<ASTNode> getChildren() {
        return new ArrayList<>(body);
    }

    // ==================== Display ====================
    @Override
    protected String getExtraInfo() {
        return String.format("(name: %s, bodySize: %d)", name, body.size());
    }
}
