package antlr.ast.css.values;

import antlr.ast.css.CSSNode;

/**
 * Base class for all CSS value nodes
 */
public abstract class CSSValueNode extends CSSNode {

    public CSSValueNode(String nodeName, int lineNumber, int columnNumber) {
        super(nodeName, lineNumber, columnNumber);
    }

    public CSSValueNode(String nodeName, int lineNumber) {
        super(nodeName, lineNumber, 0);
    }

    /**
     * Returns the value as a string representation
     */
    public abstract String getValueText();
}
