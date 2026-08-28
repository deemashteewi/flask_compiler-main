package antlr.ast.jinja2.expressions;

import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * عقدة استدعاء الدالة (Function Call Expression)
 * تمثل استدعاء دالة أو ماكرو مع وسائط
 *
 * Examples:
 * - range(10)
 * - url_for('home')
 * - my_macro(arg1, arg2)
 * - dict(key="value")
 */
public class FunctionCallExprNode extends JinjaExpressionNode {

    private JinjaExpressionNode callable;  // الدالة المستدعاة (يمكن أن تكون متغير أو تعبير)
    private final List<ArgumentNode> arguments;

    public FunctionCallExprNode(int lineNumber, int columnNumber) {
        super("FunctionCall", lineNumber, columnNumber);
        this.arguments = new ArrayList<>();
    }

    public FunctionCallExprNode(int lineNumber) {
        this(lineNumber, 0);
    }

    // ==================== Getters ====================

    public JinjaExpressionNode getCallable() {
        return callable;
    }

    public void setCallable(JinjaExpressionNode callable) {
        this.callable = callable;
        if (callable != null) callable.setParent(this);
    }

    public List<ArgumentNode> getArguments() {
        return arguments;
    }

    public void addArgument(ArgumentNode arg) {
        if (arg != null) {
            arg.setParent(this);
            arguments.add(arg);
        }
    }

    public boolean hasArguments() {
        return !arguments.isEmpty();
    }

    // ==================== Visitor Pattern ====================
    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    // ==================== Children ====================
    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> children = new ArrayList<>();
        if (callable != null) children.add(callable);
        children.addAll(arguments);
        return children;
    }

    // ==================== Display ====================
    @Override
    protected String getExtraInfo() {
        String funcName = callable != null ? callable.getFullPath() : "?";
        return String.format("(func: %s, args: %d)", funcName, arguments.size());
    }

    @Override
    public String toValueString() {
        StringBuilder sb = new StringBuilder();
        if (callable != null) {
            sb.append(callable.toValueString());
        }
        sb.append("(");
        sb.append(arguments.stream()
            .map(ArgumentNode::toValueString)
            .collect(Collectors.joining(", ")));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public String getFullPath() {
        return toValueString();
    }
}
