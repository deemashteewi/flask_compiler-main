package antlr.ast.css;

import antlr.ast.node.ASTNode;

/**
 * Base class for all CSS AST nodes
 */
public abstract class CSSNode extends ASTNode {

    public CSSNode(String nodeName, int lineNumber, int columnNumber) {
        super(nodeName, lineNumber, columnNumber);
    }

    public CSSNode(String nodeName, int lineNumber) {
        super(nodeName, lineNumber, 0);
    }
}
