package antlr.ast.jinja2.statements;

import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;

import java.util.Collections;
import java.util.List;

/**
 * Import statement node: {% import "template" as alias %}
 *
 * Grammar:
 * importStatement : IMPORT templateName=STRING AS alias=NAME
 *                   (contextMode=(WITH | WITHOUT) CONTEXT)?;
 *
 * Examples:
 * - {% import "forms.html" as forms %}
 * - {% import "macros/buttons.html" as buttons with context %}
 * - {% import "helpers.html" as helpers without context %}
 *
 * Usage: {{ forms.input('username') }}
 */
public class ImportNode extends ASTNode {

    private String templateName;
    private String alias;
    private ContextMode contextMode;

    public ImportNode(int lineNumber, int columnNumber) {
        super("ImportNode", lineNumber, columnNumber);
        this.contextMode = ContextMode.DEFAULT;
    }

    public ImportNode(int lineNumber) {
        super("ImportNode", lineNumber, 0);
        this.contextMode = ContextMode.DEFAULT;
    }

    // ==================== Getters & Setters ====================
    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
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
        sb.append("(template: ").append(templateName);
        sb.append(", alias: ").append(alias);
        if (contextMode != ContextMode.DEFAULT) {
            sb.append(", ").append(contextMode == ContextMode.WITH_CONTEXT ? "with" : "without").append(" context");
        }
        sb.append(")");
        return sb.toString();
    }
}
