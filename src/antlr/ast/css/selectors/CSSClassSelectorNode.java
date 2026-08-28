package antlr.ast.css.selectors;

import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;
import java.util.Collections;
import java.util.List;

/**
 * SPECIAL: Class selector node (e.g., .container, .button, .form-group)
 * This node type has dedicated handling for easier transformation to React/Vue
 */
public class CSSClassSelectorNode extends CSSSelectorNode {
    private final String className;

    public CSSClassSelectorNode(String className, int lineNumber, int columnNumber) {
        super("CSSClassSelector", lineNumber, columnNumber);
        this.className = className;
    }

    public CSSClassSelectorNode(String className, int lineNumber) {
        this(className, lineNumber, 0);
    }

    public String getClassName() {
        return className;
    }

    @Override
    public String getSelectorText() {
        return "." + className;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public List<ASTNode> getChildren() {
        return Collections.emptyList();
    }

    @Override
    protected String getExtraInfo() {
        return String.format("class='%s'", className);
    }
}
