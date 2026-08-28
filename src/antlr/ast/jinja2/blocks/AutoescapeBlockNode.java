package antlr.ast.jinja2.blocks;

import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;
import java.util.ArrayList;
import java.util.List;

/**
 * Autoescape block node: {% autoescape mode %} ... {% endautoescape %}
 *
 * Grammar:
 * autoescapeBlock : AUTOESCAPE escapeMode=(TRUE | FALSE | STRING) templateContent* ENDAUTOESCAPE;
 *
 * Examples:
 * - {% autoescape true %}<p>{{ user_input }}</p>{% endautoescape %}
 * - {% autoescape false %}{{ trusted_html }}{% endautoescape %}
 * - {% autoescape "html" %}<div>{{ content }}</div>{% endautoescape %}
 */
public class AutoescapeBlockNode extends ASTNode {

    private EscapeModeNode escapeMode;
    private List<ASTNode> body;

    public AutoescapeBlockNode(int lineNumber, int columnNumber) {
        super("AutoescapeBlockNode", lineNumber, columnNumber);
        this.body = new ArrayList<>();
    }

    public AutoescapeBlockNode(int lineNumber) {
        super("AutoescapeBlockNode", lineNumber, 0);
        this.body = new ArrayList<>();
    }

    // ==================== EscapeMode ====================
    public EscapeModeNode getEscapeMode() {
        return escapeMode;
    }

    public void setEscapeMode(EscapeModeNode escapeMode) {
        this.escapeMode = escapeMode;
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
        List<ASTNode> children = new ArrayList<>();
        if (escapeMode != null) {
            children.add(escapeMode);
        }
        children.addAll(body);
        return children;
    }

    // ==================== Display ====================
    @Override
    protected String getExtraInfo() {
        return String.format("(bodySize: %d)", body.size());
    }
}
