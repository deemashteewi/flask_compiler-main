package antlr.ast.css.values;

import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a CSS function value.
 * Examples: rgba(0, 0, 0, 0.1), translateY(-4px), calc(100% - 20px)
 */
public class CSSFunctionValueNode extends CSSValueNode {
    private final String functionName;
    private final List<CSSValueNode> arguments;

    public CSSFunctionValueNode(String functionName, List<CSSValueNode> arguments, int lineNumber, int columnNumber) {
        super("CSSFunctionValue", lineNumber, columnNumber);
        this.functionName = functionName;
        this.arguments = new ArrayList<>(arguments);
        for (CSSValueNode arg : this.arguments) {
            if (arg != null) {
                arg.setParent(this);
            }
        }
    }

    public CSSFunctionValueNode(String functionName, List<CSSValueNode> arguments, int lineNumber) {
        this(functionName, arguments, lineNumber, 0);
    }

    public String getFunctionName() {
        return functionName;
    }

    public List<CSSValueNode> getArguments() {
        return new ArrayList<>(arguments);
    }

    @Override
    public List<ASTNode> getChildren() {
        return new ArrayList<>(arguments);
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public String getValueText() {
        StringBuilder sb = new StringBuilder(functionName);
        sb.append("(");
        for (int i = 0; i < arguments.size(); i++) {
            if (i > 0) {
                sb.append(", ");
            }
            CSSValueNode arg = arguments.get(i);
            sb.append(arg != null ? arg.getValueText() : "null");
        }
        sb.append(")");
        return sb.toString();
    }

    @Override
    protected String getExtraInfo() {
        return String.format("function='%s' (%d args)", functionName, arguments.size());
    }
}
