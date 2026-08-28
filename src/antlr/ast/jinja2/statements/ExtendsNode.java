package antlr.ast.jinja2.statements;

import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class ExtendsNode extends ASTNode {

    private String parentTemplateName;

    public ExtendsNode(int lineNumber, int columnNumber) {
        super("ExtendsNode", lineNumber, columnNumber);
    }

    public ExtendsNode(int lineNumber) {
        super("ExtendsNode", lineNumber, 0);
    }

    // ==================== Getters ====================
    public String getParentTemplateName() {
        return parentTemplateName;
    }

    public void setParentTemplateName(String parentTemplateName) {
        this.parentTemplateName = parentTemplateName;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public List<ASTNode> getChildren() {
        return new ArrayList<>();
    }

    @Override
    protected String getExtraInfo() {
        return String.format("(Parent Template Name: %s)", parentTemplateName);
    }
}
