package antlr.ast.python.parameters;

import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;

import java.util.Collections;
import java.util.List;

/**
 * Variadic keyword parameter (**kwargs).
 * 
 * Example: def foo(**kwargs): ...
 * Collects extra keyword arguments as a dictionary
 */
public class KwargsNode extends ParameterNode {

    public KwargsNode(String name, int lineNumber, int columnNumber) {
        super("Kwargs", name, null, lineNumber, columnNumber);
    }

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
        return String.format("(**%s)", name);
    }
}
