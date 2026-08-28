package antlr.ast.python;

import antlr.ast.node.ASTNode;

/**
 */
public abstract class StatementNode extends ASTNode {

    public StatementNode(String nodeName, int lineNumber, int columnNumber) {
        super(nodeName, lineNumber, columnNumber);
    }

    public StatementNode(String nodeName, int lineNumber) {
        super(nodeName, lineNumber, 0);
    }
}
