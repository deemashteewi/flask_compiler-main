package antlr.ast.python.expressions.access;

import antlr.ast.node.ASTNode;
import antlr.ast.python.expressions.ExpressionNode;
import antlr.ast.visitor.ASTVisitor;
import java.util.Collections;
import java.util.List;

/**
 * عقدة المتغير (Variable Reference)
 * تمثل استخدام متغير في تعبير
 */
public class VariableNode extends ExpressionNode {

    private final String name;

    public VariableNode(String name, int lineNumber, int columnNumber) {
        super("Variable", lineNumber, columnNumber);
        this.name = name;
    }

    public VariableNode(String name, int lineNumber) {
        this(name, lineNumber, 0);
    }

    // ==================== Getters ====================

    public String getName() {
        return name;
    }

    // ==================== تطبيق الواجهات ====================

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public List<ASTNode> getChildren() {
        return Collections.emptyList();  // عقدة ورقة - لا أبناء
    }

    @Override
    protected String getExtraInfo() {
        return String.format("(name: %s)", name);
    }

    @Override
    public String toValueString() {
        return name;
    }
}
