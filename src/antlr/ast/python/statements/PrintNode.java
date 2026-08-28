package antlr.ast.python.statements;

import antlr.ast.node.ASTNode;
import antlr.ast.python.StatementNode;
import antlr.ast.visitor.ASTVisitor;
import antlr.ast.python.expressions.ExpressionNode;
import java.util.ArrayList;
import java.util.List;

/**
 * عقدة الطباعة (Print Statement)
 * تمثل: print(expression)
 */
public class PrintNode extends StatementNode {

    private final ExpressionNode expression;

    public PrintNode(ExpressionNode expression, int lineNumber, int columnNumber) {
        super("Print", lineNumber, columnNumber);
        this.expression = expression;

        if (expression != null) {
            expression.setParent(this);
        }
    }

    public PrintNode(ExpressionNode expression, int lineNumber) {
        this(expression, lineNumber, 0);
    }

    // ==================== Getters ====================

    public ExpressionNode getExpression() {
        return expression;
    }

    // ==================== تطبيق الواجهات ====================

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> children = new ArrayList<>();
        if (expression != null) {
            children.add(expression);
        }
        return children;
    }
}
