package antlr.ast.python.statements;

import antlr.ast.node.ASTNode;
import antlr.ast.python.StatementNode;
import antlr.ast.visitor.ASTVisitor;
import antlr.ast.python.expressions.ExpressionNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Return statement node.
 * Represents: return or return expression
 */
public class ReturnNode extends StatementNode {

    private final ExpressionNode value; // nullable for bare return

    public ReturnNode(ExpressionNode value, int lineNumber, int columnNumber) {
        super("Return", lineNumber, columnNumber);
        this.value = value;

        if (value != null) {
            value.setParent(this);
        }
    }

    public ReturnNode(int lineNumber, int columnNumber) {
        this(null, lineNumber, columnNumber);
    }

    // ==================== Getters ====================

    public ExpressionNode getValue() {
        return value;
    }

    public boolean hasValue() {
        return value != null;
    }

    // ==================== Interface Implementation ====================

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> children = new ArrayList<>();
        if (value != null) {
            children.add(value);
        }
        return children;
    }

    @Override
    protected String getExtraInfo() {
        return hasValue() ? "(has value)" : "(bare return)";
    }
}
