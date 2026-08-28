package antlr.ast.jinja2.expressions;

import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a slice expression: object[start:stop:step]
 *
 * Examples:
 * - items[1:3]
 * - items[:5]
 * - items[::2]
 * - items[1:10:2]
 */
public class SliceExprNode extends JinjaExpressionNode {

    private JinjaExpressionNode object;
    private JinjaExpressionNode start;
    private JinjaExpressionNode stop;
    private JinjaExpressionNode step;

    public SliceExprNode(int lineNumber, int columnNumber) {
        super("SliceExpr", lineNumber, columnNumber);
    }

    // ==================== Getters/Setters ====================
    public JinjaExpressionNode getObject() {
        return object;
    }

    public void setObject(JinjaExpressionNode object) {
        this.object = object;
    }

    public JinjaExpressionNode getStart() {
        return start;
    }

    public void setStart(JinjaExpressionNode start) {
        this.start = start;
    }

    public JinjaExpressionNode getStop() {
        return stop;
    }

    public void setStop(JinjaExpressionNode stop) {
        this.stop = stop;
    }

    public JinjaExpressionNode getStep() {
        return step;
    }

    public void setStep(JinjaExpressionNode step) {
        this.step = step;
    }

    public boolean hasStart() {
        return start != null;
    }

    public boolean hasStop() {
        return stop != null;
    }

    public boolean hasStep() {
        return step != null;
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
        if (object != null) {
            children.add(object);
        }
        if (start != null) {
            children.add(start);
        }
        if (stop != null) {
            children.add(stop);
        }
        if (step != null) {
            children.add(step);
        }
        return children;
    }

    // ==================== Display ====================
    @Override
    protected String getExtraInfo() {
        StringBuilder sb = new StringBuilder("(slice: ");
        sb.append(start != null ? "start" : "_");
        sb.append(":");
        sb.append(stop != null ? "stop" : "_");
        if (step != null) {
            sb.append(":step");
        }
        sb.append(")");
        return sb.toString();
    }

    @Override
    public String toValueString() {
        StringBuilder sb = new StringBuilder();
        if (object != null) sb.append(object.toValueString());
        sb.append("[");
        if (start != null) sb.append(start.toValueString());
        sb.append(":");
        if (stop != null) sb.append(stop.toValueString());
        if (step != null) {
            sb.append(":").append(step.toValueString());
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public String getFullPath() {
        return toValueString();
    }
}
