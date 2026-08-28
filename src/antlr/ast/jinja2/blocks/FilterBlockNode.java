package antlr.ast.jinja2.blocks;

import antlr.ast.jinja2.expressions.ArgumentNode;
import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Filter block node: {% filter filtername(args) %} ... {% endfilter %}
 *
 * Grammar:
 * filterBlock : FILTER filterName=NAME (LPAREN args=argList? RPAREN)? body+=templateContent* ENDFILTER;
 * argList     : argument (COMMA argument)*;
 * argument    : (name=NAME ASSIGN)? value=expression;
 *
 * Examples:
 * - {% filter upper %}hello{% endfilter %}  → HELLO
 * - {% filter truncate(50) %}long text...{% endfilter %}
 * - {% filter truncate(length=50) %}long text...{% endfilter %}
 * - {% filter escape %}{{ user_input }}{% endfilter %}
 *
 * Note: This is different from inline filters like {{ value | upper }}
 *       Filter blocks apply the filter to the entire block content.
 */
public class FilterBlockNode extends ASTNode {

    // Filter name: upper, truncate, escape, etc.
    private String name;

    // Optional filter arguments: truncate(50) or truncate(length=50)
    private List<ArgumentNode> args;

    // Block body content that the filter is applied to
    private List<ASTNode> body;

    public FilterBlockNode(int lineNumber, int columnNumber) {
        super("FilterBlockNode", lineNumber, columnNumber);
        this.args = new ArrayList<>();
        this.body = new ArrayList<>();
    }

    public FilterBlockNode(int lineNumber) {
        super("FilterBlockNode", lineNumber, 0);
        this.args = new ArrayList<>();
        this.body = new ArrayList<>();
    }

    // ==================== Getters ====================
    public List<ArgumentNode> getArgs() {
        return args;
    }

    public void addArg(ArgumentNode argument) {
        this.args.add(argument);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean hasArgs() {
        return args != null && !args.isEmpty();
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
        if (args != null) {
            children.addAll(args);
        }
        children.addAll(body);
        return children;
    }

    // ==================== Display ====================
    @Override
    protected String getExtraInfo() {
        if (name != null) {
            if (hasArgs()) {
                return String.format("(name: %s, argsCount: %d, bodySize: %d)", name, args.size(), body.size());
            }
            return String.format("(name: %s, bodySize: %d)", name, body.size());
        }
        return "";
    }
}
