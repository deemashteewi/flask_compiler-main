package antlr.ast.python.statements;

import antlr.ast.node.ASTNode;
import antlr.ast.python.StatementNode;
import antlr.ast.visitor.ASTVisitor;
import antlr.ast.python.expressions.ExpressionNode;
import java.util.List;

/**
 * Expression Statement Node
 * Represents a standalone expression used as a statement (e.g., x.property, function calls)
 *
 * Example: x.property
 */
public class ExpressionStatementNode extends StatementNode {
    private final ExpressionNode expression;

    public ExpressionStatementNode(ExpressionNode expression, int lineNumber, int columnNumber) {
        super("ExpressionStatement", lineNumber, columnNumber);
        this.expression = expression;
        if (expression != null) {
            expression.setParent(this);
        }
    }

    public ExpressionNode getExpression() {
        return expression;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public List<ASTNode> getChildren() {
        return expression != null ? List.of(expression) : List.of();
    }
}
