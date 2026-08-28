package antlr.ast.jinja2.statements;

import antlr.ast.jinja2.expressions.FilterNode;
import antlr.ast.jinja2.expressions.JinjaExpressionNode;
import antlr.ast.jinja2.targets.TargetNode;
import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class SetStatementNode extends ASTNode {

    private TargetNode target;
    private JinjaExpressionNode value;
    private List<FilterNode> filters;

    public SetStatementNode(int lineNumber, int columnNumber) {
        super("SetStatementNode", lineNumber, columnNumber);
        this.filters = new ArrayList<>();
    }

    public SetStatementNode(int lineNumber) {
        super("SetStatementNode", lineNumber, 0);
        this.filters = new ArrayList<>();
    }

    // ==================== Getters & Setters ====================
    public TargetNode getTarget() {
        return target;
    }

    public void setTarget(TargetNode target) {
        this.target = target;
    }

    public JinjaExpressionNode getValue() {
        return value;
    }

    public void setValue(JinjaExpressionNode value) {
        this.value = value;
    }

    public List<FilterNode> getFilters() {
        return filters;
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
        if (target != null) {
            children.add(target);
        }
        if (value != null) {
            children.add(value);
        }
        if (filters != null) {
            children.addAll(filters);
        }
        return children;
    }

    // ==================== Display ====================
    @Override
    protected String getExtraInfo() {
        StringBuilder sb = new StringBuilder();
        if (target != null) {
            sb.append("(var: ").append(target.toString());
        } else {
            sb.append("(complex target");
        }
        if (hasFilters()) {
            sb.append(", filters: ").append(filters.size());
        }
        sb.append(")");
        return sb.toString();
    }
}
