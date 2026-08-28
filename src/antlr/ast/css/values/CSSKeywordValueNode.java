package antlr.ast.css.values;

import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;
import java.util.Collections;
import java.util.List;

/**
 * CSS keyword value node (e.g., center, flex, block, none, auto)
 */
public class CSSKeywordValueNode extends CSSValueNode {
    private final String keyword;

    public CSSKeywordValueNode(String keyword, int lineNumber, int columnNumber) {
        super("CSSKeywordValue", lineNumber, columnNumber);
        this.keyword = keyword;
    }

    public CSSKeywordValueNode(String keyword, int lineNumber) {
        this(keyword, lineNumber, 0);
    }

    public String getKeyword() {
        return keyword;
    }

    @Override
    public String getValueText() {
        return keyword;
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
        return String.format("'%s'", keyword);
    }
}
