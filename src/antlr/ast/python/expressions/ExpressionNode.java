package antlr.ast.python.expressions;

import antlr.ast.node.ASTNode;


public abstract class ExpressionNode extends ASTNode {

    public ExpressionNode(String nodeName, int lineNumber, int columnNumber) {
        super(nodeName, lineNumber, columnNumber);
    }

    public ExpressionNode(String nodeName, int lineNumber) {
        super(nodeName, lineNumber, 0);
    }

    /**
     * Returns a simple string representation of the value
     * for display in the Symbol Table
     */
    public abstract String toValueString();
}
