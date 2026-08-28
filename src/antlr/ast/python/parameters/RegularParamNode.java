package antlr.ast.python.parameters;

import antlr.ast.visitor.ASTVisitor;
import antlr.ast.python.expressions.ExpressionNode;

/**
 * Regular parameter (positional or keyword).
 * 
 * Example: def foo(x, y=10): ...
 * Can be passed as foo(1, 2) or foo(1, y=2)
 */
public class RegularParamNode extends ParameterNode {

    public RegularParamNode(String name, int lineNumber, int columnNumber) {
        super("RegularParam", name, null, lineNumber, columnNumber);
    }

    public RegularParamNode(String name, ExpressionNode defaultValue,
                            int lineNumber, int columnNumber) {
        super("RegularParam", name, defaultValue, lineNumber, columnNumber);
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    protected String getExtraInfo() {
        if (hasDefault()) {
            return String.format("(name: %s, default: yes)", name);
        }
        return String.format("(name: %s)", name);
    }
}
