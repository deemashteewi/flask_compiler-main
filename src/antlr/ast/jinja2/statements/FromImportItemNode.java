package antlr.ast.jinja2.statements;

import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Single import item in a from-import statement.
 *
 * Grammar:
 * importItem : name=NAME (AS alias=NAME)?;
 *
 * Examples:
 * - input_field              → name="input_field", alias=null
 * - input_field as inp       → name="input_field", alias="inp"
 * - render_form as form      → name="render_form", alias="form"
 *
 * Used within: {% from "forms.html" import input_field, textarea as ta %}
 */
public class FromImportItemNode extends ASTNode {

    // The name being imported: input_field, render_form, etc.
    private String name;

    // Optional alias: input_field as inp → alias="inp"
    private String alias;

    public FromImportItemNode(int lineNumber, int columnNumber) {
        super("FromImportItemNode", lineNumber, columnNumber);
    }

    public FromImportItemNode(int lineNumber) {
        super("FromImportItemNode", lineNumber, 0);
    }

    // ==================== Getters ====================
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public boolean hasAlias() {
        return alias != null && !alias.isEmpty();
    }

    // ==================== Visitor Pattern ====================
    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    // ==================== Children ====================
    @Override
    public List<ASTNode> getChildren() {
        return new ArrayList<>();
    }

    // ==================== Display ====================
    @Override
    protected String getExtraInfo() {
        if (hasAlias()) {
            return String.format("(name: %s, alias: %s)", name, alias);
        }
        return String.format("(name: %s)", name);
    }
}
