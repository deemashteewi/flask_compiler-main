package antlr.ast.jinja2.statements;

import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

/**
 * From-import statement node: {% from "template" import item1, item2 %}
 *
 * Grammar:
 * fromImportStatement: FROM templateName=STRING IMPORT imports=importList
 *                      (withContext=('with' | 'without') 'context')?;
 * importList: importItem (COMMA importItem)*;
 *
 * Examples:
 * - {% from "forms.html" import input_field %}
 * - {% from "forms.html" import input_field, textarea %}
 * - {% from "forms.html" import input_field as inp, textarea as ta %}
 * - {% from "macros.html" import render_form with context %}
 *
 * Usage: {{ input_field('username') }} or {{ inp('username') }}
 */
public class FromImportNode extends ASTNode {

    // Template path to import from: "forms.html"
    private String templateName;

    // List of imported items: input_field, textarea, etc.
    private List<FromImportItemNode> items;

    // Whether to pass current context to imported template
    private ContextMode contextMode;

    public FromImportNode(int lineNumber, int columnNumber) {
        super("FromImportNode", lineNumber, columnNumber);
        this.items = new ArrayList<>();
        this.contextMode = ContextMode.DEFAULT;
    }

    public FromImportNode(int lineNumber) {
        super("FromImportNode", lineNumber, 0);
        this.items = new ArrayList<>();
        this.contextMode = ContextMode.DEFAULT;
    }

    // ==================== Template Name ====================
    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    // ==================== Items ====================
    public List<FromImportItemNode> getItems() {
        return items;
    }

    public void setItems(List<FromImportItemNode> items) {
        this.items = items;
    }

    public void addItem(FromImportItemNode item) {
        this.items.add(item);
    }

    // ==================== Context ====================
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
        return new ArrayList<>(items);
    }

    // ==================== Display ====================
    @Override
    protected String getExtraInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("(template: ").append(templateName);
        sb.append(", itemsCount: ").append(items.size());
        if (contextMode != ContextMode.DEFAULT) {
            sb.append(", ").append(contextMode == ContextMode.WITH_CONTEXT ? "with" : "without").append(" context");
        }
        sb.append(")");
        return sb.toString();
    }
}
