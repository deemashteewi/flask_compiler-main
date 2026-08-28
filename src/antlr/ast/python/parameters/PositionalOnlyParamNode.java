package antlr.ast.python.parameters;

import antlr.ast.visitor.ASTVisitor;
import antlr.ast.python.expressions.ExpressionNode;

/**
 * Positional-only parameter (before /).
 * 
 * Example: def foo(x, y, /): ...
 * x and y must be passed positionally, not as x=value
 */
public class PositionalOnlyParamNode extends ParameterNode {

    public PositionalOnlyParamNode(String name, int lineNumber, int columnNumber) {
        super("PositionalOnlyParam", name, null, lineNumber, columnNumber);
    }

    public PositionalOnlyParamNode(String name, ExpressionNode defaultValue,
                                   int lineNumber, int columnNumber) {
        super("PositionalOnlyParam", name, defaultValue, lineNumber, columnNumber);
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    protected String getExtraInfo() {
        if (hasDefault()) {
            return String.format("(name: %s, default: yes, positional-only)", name);
        }
        return String.format("(name: %s, positional-only)", name);
    }
}
