package antlr.ast.jinja2.expressions.literals;

import antlr.ast.node.ASTNode;
import antlr.ast.jinja2.expressions.JinjaExpressionNode;
import antlr.ast.visitor.ASTVisitor;
import java.util.Collections;
import java.util.List;

/**
 * عقدة الرقم العشري (Double Number Literal)
 * تمثل قيمة عددية عشرية ثابتة
 */
public class JinjaNumberDoubleNode extends JinjaExpressionNode {

    private final double value;

    public JinjaNumberDoubleNode(double value, int lineNumber, int columnNumber) {
        super("JinjaNumberDouble", lineNumber, columnNumber);
        this.value = value;
    }

    public JinjaNumberDoubleNode(double value, int lineNumber) {
        this(value, lineNumber, 0);
    }

    public JinjaNumberDoubleNode(String valueStr, int lineNumber, int columnNumber) {
        super("JinjaNumberDouble", lineNumber, columnNumber);
        this.value = Double.parseDouble(valueStr);
    }

    // ==================== Getters ====================

    public double getValue() {
        return value;
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
        return String.format("(value: %s)", value);
    }

    @Override
    public String toValueString() {
        return String.valueOf(value);
    }
}
