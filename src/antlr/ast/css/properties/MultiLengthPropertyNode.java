package antlr.ast.css.properties;

import antlr.ast.css.values.CSSLengthValueNode;
import antlr.ast.css.values.CSSValueNode;
import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents CSS properties that accept multiple length values.
 * Example: margin: 10px 20px 10px 20px;
 */
public class MultiLengthPropertyNode extends CSSPropertyNode {
    private final List<CSSLengthValueNode> values;

    public MultiLengthPropertyNode(String propertyName, List<CSSLengthValueNode> values, int lineNumber) {
        super("MultiLengthProperty", propertyName, lineNumber);
        this.values = new ArrayList<>(values);
        for (CSSLengthValueNode value : this.values) {
            if (value != null) {
                value.setParent(this);
            }
        }
    }

    public List<CSSLengthValueNode> getLengthValues() {
        return new ArrayList<>(values);
    }

    @Override
    public List<CSSValueNode> getValues() {
        return new ArrayList<>(values);
    }

    @Override
    public List<ASTNode> getChildren() {
        return new ArrayList<>(values);
    }

    /**
     * Expand shorthand margin values according to CSS rules:
     * - 1 value: all sides
     * - 2 values: top/bottom, left/right
     * - 3 values: top, left/right, bottom
     * - 4 values: top, right, bottom, left
     */
    public List<CSSLengthValueNode> expandShorthand() {
        List<CSSLengthValueNode> expanded = new ArrayList<>();
        switch (values.size()) {
            case 1:
                expanded.add(values.get(0)); // top
                expanded.add(values.get(0)); // right
                expanded.add(values.get(0)); // bottom
                expanded.add(values.get(0)); // left
                break;
            case 2:
                expanded.add(values.get(0)); // top
                expanded.add(values.get(1)); // right
                expanded.add(values.get(0)); // bottom
                expanded.add(values.get(1)); // left
                break;
            case 3:
                expanded.add(values.get(0)); // top
                expanded.add(values.get(1)); // right
                expanded.add(values.get(2)); // bottom
                expanded.add(values.get(1)); // left
                break;
            case 4:
                expanded.addAll(values);
                break;
        }
        return expanded;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
