package antlr.ast.css.properties;

import antlr.ast.css.values.CSSFunctionValueNode;
import antlr.ast.css.values.CSSValueNode;
import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;

import java.util.Collections;
import java.util.List;

/**
 * Represents CSS transform property.
 * Example: transform: translateY(-4px);
 */
public class TransformPropertyNode extends CSSPropertyNode {
    private final CSSFunctionValueNode transformFunction;

    public TransformPropertyNode(CSSFunctionValueNode transformFunction, int lineNumber) {
        super("TransformProperty", "transform", lineNumber);
        this.transformFunction = transformFunction;
        if (transformFunction != null) {
            transformFunction.setParent(this);
        }
    }

    public CSSFunctionValueNode getTransformFunction() {
        return transformFunction;
    }

    public String getFunctionName() {
        return transformFunction != null ? transformFunction.getFunctionName() : null;
    }

    @Override
    public List<CSSValueNode> getValues() {
        return transformFunction != null ? Collections.singletonList(transformFunction) : Collections.emptyList();
    }

    @Override
    public List<ASTNode> getChildren() {
        return transformFunction != null ? Collections.singletonList(transformFunction) : Collections.emptyList();
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
