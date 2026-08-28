package antlr.ast.jinja2.expressions.literals;

import antlr.ast.node.ASTNode;
import antlr.ast.jinja2.expressions.JinjaExpressionNode;
import antlr.ast.visitor.ASTVisitor;
import java.util.Collections;
import java.util.List;

/**
 * عقدة None
 * تمثل: none
 */
public class JinjaNoneNode extends JinjaExpressionNode {

    public JinjaNoneNode(int lineNumber, int columnNumber) {
        super("JinjaNone", lineNumber, columnNumber);
    }

    public JinjaNoneNode(int lineNumber) {
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
        return "none";
    }
}
