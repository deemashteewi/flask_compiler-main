package antlr.ast.css;

import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;
import java.util.Collections;
import java.util.List;

// ==================== Stylesheet ====================
public class StylesheetNode extends ASTNode {
    public StylesheetNode(int lineNumber) { super("Stylesheet", lineNumber, 0); }
    @Override public <T> T accept(ASTVisitor<T> visitor) { return visitor.visit(this); }
    @Override public List<ASTNode> getChildren() { return Collections.emptyList(); }
}
