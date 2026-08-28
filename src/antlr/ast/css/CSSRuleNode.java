package antlr.ast.css;

import antlr.ast.css.selectors.CSSSelectorNode;
import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;
import java.util.ArrayList;
import java.util.List;

/**
 * CSS rule containing selectors and declarations
 * Example: body, h1 { color: red; margin: 0; }
 */
public class CSSRuleNode extends CSSNode {
    private final List<CSSSelectorNode> selectors;
    private final List<CSSDeclarationNode> declarations;

    public CSSRuleNode(int lineNumber, int columnNumber) {
        super("CSSRule", lineNumber, columnNumber);
        this.selectors = new ArrayList<>();
        this.declarations = new ArrayList<>();
    }

    public CSSRuleNode(int lineNumber) {
        this(lineNumber, 0);
    }

    public void addSelector(CSSSelectorNode selector) {
        if (selector != null) {
            selectors.add(selector);
            selector.setParent(this);
        }
    }

    public void addDeclaration(CSSDeclarationNode declaration) {
        if (declaration != null) {
            declarations.add(declaration);
            declaration.setParent(this);
        }
    }

    public List<CSSSelectorNode> getSelectors() {
        return selectors;
    }

    public List<CSSDeclarationNode> getDeclarations() {
        return declarations;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> children = new ArrayList<>();
        children.addAll(selectors);
        children.addAll(declarations);
        return children;
    }

    @Override
    protected String getExtraInfo() {
        return String.format("(%d selectors, %d declarations)", selectors.size(), declarations.size());
    }
}
