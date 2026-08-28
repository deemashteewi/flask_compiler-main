package antlr.ast.jinja2.expressions.literals;

import antlr.ast.node.ASTNode;
import antlr.ast.jinja2.expressions.JinjaExpressionNode;
import antlr.ast.visitor.ASTVisitor;
import java.util.Collections;
import java.util.List;

/**
 * عقدة النص (String Literal)
 * تمثل قيمة نصية ثابتة
 */
public class JinjaStringNode extends JinjaExpressionNode {

    private final String value;

    public JinjaStringNode(String value, int lineNumber, int columnNumber) {
        super("JinjaString", lineNumber, columnNumber);
        this.value = value;
    }

    public JinjaStringNode(String value, int lineNumber) {
        this(value, lineNumber, 0);
    }

    // ==================== Getters ====================

    public String getValue() {
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
        return value;
    }
}
