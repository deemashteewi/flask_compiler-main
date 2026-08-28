package antlr.ast.jinja2.blocks;

import antlr.ast.jinja2.expressions.ArgumentNode;
import antlr.ast.jinja2.expressions.JinjaExpressionNode;
import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Call block node: {% call (args)? callee %} ... {% endcall %}
 *
 * Grammar:
 * callBlock : CALL (LPAREN callArgs=argList? RPAREN)? callee=expression
 *             templateContent*
 *             ENDCALL;
 *
 * Examples:
 * - {% call my_macro() %}content{% endcall %}
 * - {% call(user) render_dialog('Hello') %}Hello, {{ user.name }}!{% endcall %}
 *
 * The call block invokes a macro and passes body content accessible via caller().
 */
public class CallBlockNode extends ASTNode {

    // Optional call arguments: {% call(user, item) ... %}
    private List<ArgumentNode> callArgs;

    // The macro/function being called: render_dialog('Hello')
    private JinjaExpressionNode callee;

    // Block body content (passed via caller())
    private List<ASTNode> body;

    public CallBlockNode(int lineNumber, int columnNumber) {
        super("CallBlockNode", lineNumber, columnNumber);
        this.body = new ArrayList<>();
        this.callArgs = new ArrayList<>();

    }

    public CallBlockNode(int lineNumber) {
        super("CallBlockNode", lineNumber, 0);
        this.body = new ArrayList<>();
        this.callArgs = new ArrayList<>();
    }

    // ==================== callArgs ====================
    public List<ArgumentNode> getCallArgs() {
        return callArgs;
    }

    public void setCallArgs(List<ArgumentNode> callArgs) {
        this.callArgs = callArgs;
    }

    public void addCallArg(ArgumentNode arg) {
        this.callArgs.add(arg);
    }

    public boolean hasCallArgs() {
        return callArgs != null && !callArgs.isEmpty();
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

    // ==================== Callee ====================
    public JinjaExpressionNode getCallee() {
        return callee;
    }

    public void setCallee(JinjaExpressionNode callee) {
        this.callee = callee;
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
        if (callArgs != null) {
            children.addAll(callArgs);
        }
        if (callee != null) {
            children.add(callee);
        }
        children.addAll(body);
        return children;
    }

    // ==================== Display ====================
    @Override
    protected String getExtraInfo() {
        return String.format("(callArgsCount: %d, hasCallee: %s, bodySize: %d)",
            callArgs.size(), callee != null, body.size());
    }
}
