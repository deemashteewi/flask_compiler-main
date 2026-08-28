package antlr.ast.jinja2.targets;

import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Namespace target for set statements.
 * Example: ns.attr in {% set ns.attr = value %}
 * Only used by set statements, not for loops.
 */
public class NamespaceTargetNode extends TargetNode {

    private String nameSpace;
    private final List<String> attributes;

    public NamespaceTargetNode(int lineNumber, int columnNumber) {
        super("NamespaceTarget", lineNumber, columnNumber);
        attributes = new ArrayList<>();
    }

    public NamespaceTargetNode(int lineNumber) {
        this(lineNumber, 0);
    }

    // ==================== Getters/Setters ====================
    public String getNameSpace() {
        return nameSpace;
    }

    public void setNameSpace(String nameSpace) {
        this.nameSpace = nameSpace;
    }

    public List<String> getAttributes() {
        return attributes;
    }

    public void addAttribute(String attribute) {
        this.attributes.add(attribute);
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public List<ASTNode> getChildren() {
        return Collections.emptyList();
    }

    @Override
    protected String getExtraInfo() {
        return String.format("(namespace: %s, attributes: %s)", nameSpace, String.join(".", attributes));
    }
}
