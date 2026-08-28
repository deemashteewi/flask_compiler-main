package antlr.ast.css.selectors;

import antlr.ast.css.CSSNode;

/**
 * Base class for all CSS selector nodes
 */
public abstract class CSSSelectorNode extends CSSNode {

    public CSSSelectorNode(String nodeName, int lineNumber, int columnNumber) {
        super(nodeName, lineNumber, columnNumber);
    }

    public CSSSelectorNode(String nodeName, int lineNumber) {
        super(nodeName, lineNumber, 0);
    }

    /**
     * Returns the selector text representation
     */
    public abstract String getSelectorText();
}
