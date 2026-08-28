package antlr.ast.python.parameters;

import antlr.ast.visitor.ASTVisitor;

/**
 * Variadic positional parameter (*args).
 * Collects extra positional arguments into a tuple.
 * <p>
 * Example: def foo(*args): ...
 */
public class StarArgsNode extends ParameterNode {

    public StarArgsNode(String name, int lineNumber, int columnNumber) {
        super("StarArgs", name, null, lineNumber, columnNumber);
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    protected String getExtraInfo() {
        return String.format("(*%s)", name);
    }
}
