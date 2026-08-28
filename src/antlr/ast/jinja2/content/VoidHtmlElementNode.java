package antlr.ast.jinja2.content;

import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Void HTML element that cannot have children.
 *
 * Void elements are self-closing by definition in HTML5.
 * They don't require (and shouldn't have) a closing tag.
 *
 * Examples:
 * - <br>
 * - <hr>
 * - <img src="image.png" alt="text">
 * - <input type="text" name="field">
 * - <meta charset="UTF-8">
 * - <link rel="stylesheet" href="style.css">
 * - <area>, <base>, <col>, <embed>, <param>, <source>, <track>, <wbr>
 */
public class VoidHtmlElementNode extends HtmlElementNode {

    public VoidHtmlElementNode(int lineNumber, int columnNumber) {
        super("VoidHtmlElement", lineNumber, columnNumber);
    }

    public VoidHtmlElementNode(int lineNumber) {
        this(lineNumber, 0);
    }

    // ==================== Children ====================

    @Override
    public List<ASTNode> getChildNodes() {
        return Collections.emptyList();
    }

    @Override
    public boolean canHaveChildren() {
        return false;
    }

    // ==================== Visitor Pattern ====================

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    // ==================== AST Children ====================

    @Override
    public List<ASTNode> getChildren() {
        if (attributes != null && !attributes.isEmpty()) {
            return new ArrayList<>(attributes);
        }
        return Collections.emptyList();
    }

    // ==================== Display ====================

    @Override
    protected String getExtraInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("(tag: ").append(getTagName());
        sb.append(", type: void");
        if (hasAttributes()) {
            sb.append(", attrs: ").append(attributes.size());
        }
        sb.append(")");
        return sb.toString();
    }
}
