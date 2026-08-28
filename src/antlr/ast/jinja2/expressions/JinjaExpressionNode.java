package antlr.ast.jinja2.expressions;

import antlr.ast.node.ASTNode;


public abstract class JinjaExpressionNode extends ASTNode {

    public JinjaExpressionNode(String nodeName, int line, int col) {
        super(nodeName, line, col);
    }

    // Override in subclasses that support it
    public String getFullPath() {
        return toString();
    }

    /**
     * Returns a simple string representation of the value
     * for display in the Symbol Table
     */
    public abstract String toValueString();
}

