package antlr.ast.jinja2.expressions;

import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a Jinja2 filter: | filtername(arg1, arg2)
 *
 * Examples:
 * - | upper
 * - | truncate(50)
 * - | default('N/A')
 */
public class FilterNode extends ASTNode {

    private String name;
    private List<JinjaExpressionNode> args;

    public FilterNode(int lineNumber, int columnNumber) {
        super("FilterNode", lineNumber, columnNumber);  // FIXED
        this.args = new ArrayList<>();
    }

    public FilterNode(int lineNumber) {
        super("FilterNode", lineNumber, 0);  // FIXED
        this.args = new ArrayList<>();
    }

    // ==================== Getters ====================
    public List<JinjaExpressionNode> getArgs() {
        return args;
    }

    public void addArg(JinjaExpressionNode expression) {
        this.args.add(expression);
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
            children.addAll(args);  // FIXED: addAll instead of add
        }
        return children;
    }

    // ==================== Display ====================
    @Override
    protected String getExtraInfo() {
        if (name != null) {
            if (hasArgs()) {
                return String.format("(name: %s, args: %d)", name, args.size());  // FIXED: "args" not "filters"
            }
            return String.format("(name: %s)", name);
        }
        return "";
    }
}
