package antlr.ast.python.expressions.literals;

import antlr.ast.node.ASTNode;
import antlr.ast.python.expressions.ExpressionNode;
import antlr.ast.visitor.ASTVisitor;
import java.util.Collections;
import java.util.List;

/**
 * عقدة None
 * تمثل: None
 */
public class NoneNode extends ExpressionNode {

    public NoneNode(int lineNumber, int columnNumber) {
        super("None", lineNumber, columnNumber);
    }

    public NoneNode(int lineNumber) {
        this(lineNumber, 0);
    }

    // ==================== Interface Implementation ====================

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public List<ASTNode> getChildren() {
        return Collections.emptyList();
    }

    @Override
    protected String getExtraInfo() {
        return "";
    }

    @Override
    public String toValueString() {
        return "None";
    }
}
