package antlr.ast.python.parameters;

import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;

import java.util.Collections;
import java.util.List;

/**
 * Bare star (*) separator for keyword-only parameters.
 * Forces remaining parameters to be keyword-only.
 * Has no name and no runtime representation.
 * <p>
 * Example: def foo(a, *, b): ...   - b must be passed as keyword
 */
public class KeywordOnlySeparator extends ParameterNode {

    public KeywordOnlySeparator(int lineNumber, int columnNumber) {
        super("KeywordOnlySeparator", null, null, lineNumber, columnNumber);
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
        return "(bare *, keyword-only separator)";
    }
}
