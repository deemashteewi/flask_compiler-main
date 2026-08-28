package antlr.ast.python.statements;

import java.util.ArrayList;
import java.util.List;

import antlr.ast.node.ASTNode;
import antlr.ast.python.StatementNode;
import antlr.ast.python.expressions.ExpressionNode;
import antlr.ast.python.expressions.access.DotAccessNode;
import antlr.ast.python.expressions.access.IndexAccessNode;
import antlr.ast.python.expressions.access.VariableNode;
import antlr.ast.visitor.ASTVisitor;

/**
 * عقدة الإسناد (Assignment)
 * تمثل: target = expression
 * Supports simple variables, dot access, and index access as targets
 *
 * مثال: x = 5 + 3
 * مثال: obj.prop = 42
 * مثال: list[0] = 100
 */
public class AssignmentNode extends StatementNode {

    private final ExpressionNode target;  // Can be VariableNode, DotAccessNode, or IndexAccessNode
    private final String variableName;    // Kept for backward compatibility (deprecated)
    private final ExpressionNode value;

    public AssignmentNode(ExpressionNode target, ExpressionNode value,
                          int lineNumber, int columnNumber) {
        super("Assignment", lineNumber, columnNumber);
        validateTarget(target);  // Semantic validation
        this.target = target;
        this.value = value;

        // Extract variable name for backward compatibility
        if (target instanceof VariableNode) {
            this.variableName = ((VariableNode) target).getName();
        } else {
            this.variableName = null;  // Complex target (obj.prop or list[i])
        }

        if (target != null) {
            target.setParent(this);
        }
        if (value != null) {
            value.setParent(this);
        }
    }

    // Old constructor: for backward compatibility (deprecated)
    public AssignmentNode(String variableName, ExpressionNode value,
                          int lineNumber, int columnNumber) {
        super("Assignment", lineNumber, columnNumber);
        this.variableName = variableName;
        this.target = new VariableNode(variableName, lineNumber, columnNumber);
        this.value = value;

        if (target != null) {
            target.setParent(this);
        }
        if (value != null) {
            value.setParent(this);
        }
    }

    public AssignmentNode(String variableName, ExpressionNode value, int lineNumber) {
        this(variableName, value, lineNumber, 0);
    }

    // Semantic validation: ensure target is assignable
    private void validateTarget(ExpressionNode target) {
        if (!(target instanceof VariableNode ||
              target instanceof DotAccessNode ||
              target instanceof IndexAccessNode)) {
            throw new RuntimeException(
                "Invalid assignment target: " + target.getClass().getSimpleName() +
                " at line " + target.getLineNumber() +
                ". Only variables, property access (obj.prop), and index access (list[i]) are allowed."
            );
        }
    }

    // ==================== Getters ====================

    public ExpressionNode getTarget() {
        return target;
    }

    public String getVariableName() {
        return variableName;
    }

    public ExpressionNode getValue() {
        return value;
    }

    // ==================== تطبيق الواجهات ====================

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> children = new ArrayList<>();
        if (target != null) {
            children.add(target);
        }
        if (value != null) {
            children.add(value);
        }
        return children;
    }

    @Override
    protected String getExtraInfo() {
        if (variableName != null) {
            return String.format("(var: %s)", variableName);
        } else {
            return "(complex target)";
        }
    }
}
