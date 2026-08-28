package antlr.ast.python.parameters;

import antlr.ast.visitor.ASTVisitor;
import antlr.ast.python.expressions.ExpressionNode;

/**
 * Keyword-only parameter (after * or *args).
 * <p>
 * Example: def foo(*, x, y=10): ...
 * Must be passed as foo(x=1, y=2), not positionally
 */
public class KeywordOnlyParamNode extends ParameterNode {

    public KeywordOnlyParamNode(String name, int lineNumber, int columnNumber) {
        super("KeywordOnlyParam", name, null, lineNumber, columnNumber);
    }

    public KeywordOnlyParamNode(String name, ExpressionNode defaultValue,
                                int lineNumber, int columnNumber) {
        super("KeywordOnlyParam", name, defaultValue, lineNumber, columnNumber);
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    protected String getExtraInfo() {
        if (hasDefault()) {
            return String.format("(name: %s, default: yes, keyword-only)", name);
        }
        return String.format("(name: %s, keyword-only)", name);
    }
}
