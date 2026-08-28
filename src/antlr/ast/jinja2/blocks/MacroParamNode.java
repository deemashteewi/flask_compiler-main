package antlr.ast.jinja2.blocks;

import antlr.ast.jinja2.expressions.JinjaExpressionNode;
import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Macro parameter node for macro definitions.
 *
 * Grammar: macroParam : name=NAME (ASSIGN defaultValue=expression)?;
 *
 * Examples:
 * - {% macro greet(name) %}           → name="name", defaultValue=null
 * - {% macro greet(name, msg="Hi") %} → name="msg", defaultValue="Hi"
 */
public class MacroParamNode extends ASTNode {

    private String name;                       // Required
    private JinjaExpressionNode defaultValue;  // Optional

    public MacroParamNode(int lineNumber, int columnNumber) {
        super("MacroParamNode", lineNumber, columnNumber);
    }

    public MacroParamNode(int lineNumber) {
        super("MacroParamNode", lineNumber, 0);
    }

    // ==================== Getters/Setters ====================
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JinjaExpressionNode getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(JinjaExpressionNode defaultValue) {
        this.defaultValue = defaultValue;
    }

    public boolean hasDefaultValue() {
        return defaultValue != null;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> children = new ArrayList<>();
        if (defaultValue != null) {
            children.add(defaultValue);
        }
        return children;
    }

    @Override
    protected String getExtraInfo() {
        if (defaultValue != null) {
            return String.format("(name: %s, hasDefault: true)", name);
        }
        return String.format("(name: %s)", name);
    }
}
