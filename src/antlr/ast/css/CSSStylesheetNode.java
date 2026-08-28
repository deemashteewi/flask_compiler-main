package antlr.ast.css;

import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;
import java.util.ArrayList;
import java.util.List;

/**
 * Root node for CSS stylesheet containing CSS rules
 */
public class CSSStylesheetNode extends CSSNode {
    private final List<CSSRuleNode> rules;

    public CSSStylesheetNode(int lineNumber, int columnNumber) {
        super("CSSStylesheet", lineNumber, columnNumber);
        this.rules = new ArrayList<>();
    }

    public CSSStylesheetNode(int lineNumber) {
        this(lineNumber, 0);
    }

    public void addRule(CSSRuleNode rule) {
        if (rule != null) {
            rules.add(rule);
            rule.setParent(this);
        }
    }

    public List<CSSRuleNode> getRules() {
        return rules;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public List<ASTNode> getChildren() {
        return new ArrayList<>(rules);
    }

    @Override
    protected String getExtraInfo() {
        return String.format("(%d rules)", rules.size());
    }
}
