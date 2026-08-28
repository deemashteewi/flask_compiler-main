package antlr.ast.python.parameters;

import antlr.ast.node.ASTNode;
import antlr.ast.python.expressions.ExpressionNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Abstract base class for all function parameter types.
 */
public abstract class ParameterNode extends ASTNode {

    protected final String name;
    protected ExpressionNode defaultValue;  // nullable

    public ParameterNode(String nodeType, String name, ExpressionNode defaultValue,
                         int lineNumber, int columnNumber) {
        super(nodeType, lineNumber, columnNumber);
        this.name = name;
        this.defaultValue = defaultValue;
        if (defaultValue != null) {
            defaultValue.setParent(this);
        }
    }

    public String getName() {
        return name;
    }

    public boolean hasDefault() {
        return defaultValue != null;
    }

    public void setDefaultValue(ExpressionNode defaultValue) {
        this.defaultValue = defaultValue;
        if (defaultValue != null) {
            defaultValue.setParent(this);
        }
    }

    public ExpressionNode getDefaultValue() {
        return defaultValue;
    }

    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> children = new ArrayList<>();
        if (defaultValue != null) {
            children.add(defaultValue);
        }
        return children;
    }
}
