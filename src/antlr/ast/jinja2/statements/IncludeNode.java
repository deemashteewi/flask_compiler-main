package antlr.ast.jinja2.statements;

import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;

import java.util.Collections;
import java.util.List;

public class IncludeNode extends ASTNode {

    private String includedTemplateName;
    private boolean ignoreMissing;
    private ContextMode contextMode;

    public IncludeNode(int lineNumber, int columnNumber) {
        super("IncludeNode", lineNumber, columnNumber);
        this.ignoreMissing = false;
        this.contextMode = ContextMode.DEFAULT;
    }

    public IncludeNode(int lineNumber) {
        super("IncludeNode", lineNumber, 0);
        this.ignoreMissing = false;
        this.contextMode = ContextMode.DEFAULT;
    }

    // ==================== Getters & Setters ====================
    public String getIncludedTemplateName() {
        return includedTemplateName;
    }

    public void setIncludedTemplateName(String includedTemplateName) {
        this.includedTemplateName = includedTemplateName;
    }

    public boolean isIgnoreMissing() {
        return ignoreMissing;
    }

    public void setIgnoreMissing(boolean ignoreMissing) {
        this.ignoreMissing = ignoreMissing;
    }

    public ContextMode getContextMode() {
        return contextMode;
    }

    public void setContextMode(ContextMode contextMode) {
        this.contextMode = contextMode;
    }

    // ==================== Visitor Pattern ====================
    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    // ==================== Children ====================
    @Override
    public List<ASTNode> getChildren() {
        return Collections.emptyList();
    }

    // ==================== Display ====================
    @Override
    protected String getExtraInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("(template: ").append(includedTemplateName);
        if (ignoreMissing) {
            sb.append(", ignore missing");
        }
        if (contextMode != ContextMode.DEFAULT) {
            sb.append(", ").append(contextMode == ContextMode.WITH_CONTEXT ? "with" : "without").append(" context");
        }
        sb.append(")");
        return sb.toString();
    }
}
