package antlr.ast.python.expressions.access;

import antlr.ast.node.ASTNode;
import antlr.ast.python.expressions.ExpressionNode;
import antlr.ast.visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * عقدة المتغير (Variable Reference) تمثل استخدام متغير في تعبير
 */
public class FunctionCallNode extends ExpressionNode {

    private ExpressionNode callee;
    private final List<ExpressionNode> parameters;

    public FunctionCallNode(int lineNumber, int columnNumber) {
        super("Function Call", lineNumber, columnNumber);
        this.parameters = new ArrayList<>();
    }

    public FunctionCallNode(ExpressionNode callee, int lineNumber, int columnNumber) {
        super("Function Call", lineNumber, columnNumber);
        this.callee = callee;
        this.parameters = new ArrayList<>();
    }

    public FunctionCallNode(ExpressionNode callee, List<ExpressionNode> statements, int lineNumber, int columnNumber) {
        super("Function Call", lineNumber, columnNumber);
        this.callee = callee;
        this.parameters = new ArrayList<>(statements);
        for (ExpressionNode stmt : this.parameters) {
            if (stmt != null) {
                stmt.setParent(this);
            }
        }
    }

    public ExpressionNode getCallee() {
        return callee;
    }

    public void setCallee(ExpressionNode callee) {
        this.callee = callee;
    }

    // ==================== إدارة العبارات ====================
    public void addParameter(ExpressionNode node) {
        if (node != null) {
            node.setParent(this);
            parameters.add(node);
        }
    }

    public List<ExpressionNode> getParameters() {
        return Collections.unmodifiableList(parameters);
    }

    public int getParametersCount() {
        return parameters.size();
    }

    public boolean isEmpty() {
        return parameters.isEmpty();
    }

    // ==================== تطبيق الواجهات ====================
    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public List<ASTNode> getChildren() {
        return new ArrayList<>(parameters);
    }

    @Override
    protected String getExtraInfo() {
        return String.format("(callee: %s  parameters: %d )", callee.toValueString(), parameters.size());
    }

    @Override
    public String toValueString() {
        return callee.toValueString() + "[" + parameters.stream()
                .map(ExpressionNode::toValueString)
                .collect(Collectors.joining(", ")) + "]";
    }
}
