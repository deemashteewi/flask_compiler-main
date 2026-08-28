package antlr.ast.jinja2.blocks;

import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Macro definition node: {% macro name(params) %} ... {% endmacro %}
 *
 * Grammar:
 * macroStatement : MACRO name=NAME LPAREN params=macroParams? RPAREN templateContent* ENDMACRO;
 *
 * Examples:
 * - {% macro button(text) %}<button>{{ text }}</button>{% endmacro %}
 * - {% macro input(name, value="", type="text") %}...{% endmacro %}
 */
public class MacroNode extends ASTNode {

    private String name;
    private List<MacroParamNode> params;
    private List<ASTNode> body;

    public MacroNode(int lineNumber, int columnNumber) {
        super("MacroNode", lineNumber, columnNumber);
        this.params = new ArrayList<>();
        this.body = new ArrayList<>();
    }

    public MacroNode(int lineNumber) {
        super("MacroNode", lineNumber, 0);
        this.params = new ArrayList<>();
        this.body = new ArrayList<>();
    }

    // ==================== Name ====================
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // ==================== Params ====================
    public List<MacroParamNode> getParams() {
        return params;
    }

    public void setParams(List<MacroParamNode> params) {
        this.params = params;
    }

    public void addParam(MacroParamNode param) {
        this.params.add(param);
    }

    public boolean hasParams() {
        return params != null && !params.isEmpty();
    }

    // ==================== Body ====================
    public List<ASTNode> getBody() {
        return body;
    }

    public void setBody(List<ASTNode> body) {
        this.body = body;
    }

    public void addToBody(ASTNode node) {
        this.body.add(node);
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
        children.addAll(params);
        children.addAll(body);
        return children;
    }

    // ==================== Display ====================
    @Override
    protected String getExtraInfo() {
        return String.format("(name: %s, paramsCount: %d, bodySize: %d)",
            name, params.size(), body.size());
    }
}
