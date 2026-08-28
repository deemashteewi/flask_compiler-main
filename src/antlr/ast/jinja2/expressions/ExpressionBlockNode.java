package antlr.ast.jinja2.expressions;

import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a Jinja2 expression output block: {{ expression | filter1 | filter2 }}
 *
 * Examples:
 * - {{ product.name }}
 * - {{ user.email | lower }}
 * - {{ title | upper | truncate(50) }}
 */
public class ExpressionBlockNode extends ASTNode {

    private JinjaExpressionNode expression;
    private List<FilterNode> filters;

    public ExpressionBlockNode(int lineNumber, int columnNumber) {
        super("ExpressionBlock", lineNumber, columnNumber);
        this.filters = new ArrayList<>();
    }

    public ExpressionBlockNode(int lineNumber) {
        super("ExpressionBlock", lineNumber, 0);
        this.filters = new ArrayList<>();
    }

    // ==================== Getters ====================
    public JinjaExpressionNode getExpression() {
        return expression;
    }

    public void setExpression(JinjaExpressionNode expression) {
        this.expression = expression;
    }

    public List<FilterNode> getFilters() {
        return filters;
    }

    public void setFilters(List<FilterNode> filters) {
        this.filters = filters;
    }

    public void addFilter(FilterNode filter) {
        this.filters.add(filter);
    }

    public boolean hasFilters() {
        return filters != null && !filters.isEmpty();
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
        if (expression != null) {
            children.add(expression);
        }
        if (filters != null) {
            children.addAll(filters);
        }
        return children;
    }

    // ==================== Display ====================
    @Override
    protected String getExtraInfo() {
        if (expression != null) {
            String exprStr = expression.getFullPath();
            if (hasFilters()) {
                return String.format("(expr: %s, filters: %d)", exprStr, filters.size());
            }
            return String.format("(expr: %s)", exprStr);
        }
        return "";
    }
}
