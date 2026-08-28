package antlr.ast.jinja2.blocks;

import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Block definition node for {% block name %} ... {% endblock %}
 */
public class BlockDefinitionNode extends ASTNode {

    private String name;
    private boolean scoped;
    private List<ASTNode> children;

    public BlockDefinitionNode(int lineNumber, int columnNumber) {
        super("BlockDefinitionNode", lineNumber, columnNumber);
        this.children = new ArrayList<>();
    }

    public BlockDefinitionNode(int lineNumber) {
        super("BlockDefinitionNode", lineNumber, 0);
        this.children = new ArrayList<>();
    }

    // ==================== Getters ====================
    public String getName() {
        return name;
    }

    public boolean isScoped() {
        return scoped;
    }

    // ==================== Setters ====================
    public void setName(String name) {
        this.name = name;
    }

    public void setScoped(boolean scoped) {
        this.scoped = scoped;
    }

    public void addChild(ASTNode child) {
        this.children.add(child);
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public List<ASTNode> getChildren() {
        return children;
    }

    @Override
    protected String getExtraInfo() {
        return String.format("(name: %s, scoped: %s)", name, scoped);
    }
}
