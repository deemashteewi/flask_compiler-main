package antlr.ast.jinja2.statements;

import antlr.ast.jinja2.expressions.JinjaExpressionNode;
import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Do statement: {% do expression %}
 * Executes an expression without outputting its result.
 *
 * Grammar:
 * doStatement: DO expression;
 *
 * Examples:
 * - {% do items.append(new_item) %}
 * - {% do counter.increment() %}
 */
public class DoStatementNode extends ASTNode {

    private JinjaExpressionNode expression;

    public DoStatementNode(int lineNumber, int columnNumber) {
        super("DoStatement", lineNumber, columnNumber);
    }

    public DoStatementNode(int lineNumber) {
        super("DoStatement", lineNumber, 0);
    }

    // ==================== Getters/Setters ====================
    public JinjaExpressionNode getExpression() {
        return expression;
    }

    public void setExpression(JinjaExpressionNode expression) {
        this.expression = expression;
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
        return children;
    }

    // ==================== Display ====================
    @Override
    protected String getExtraInfo() {
        if (expression != null) {
            return String.format("(expr: %s)", expression.getFullPath());
        }
        return "";
    }
}
