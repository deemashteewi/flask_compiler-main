package antlr.ast.css;

import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;
import java.util.Collections;
import java.util.List;

// TODO: Uncomment these CSS node classes when CSS support is fully implemented in ASTVisitor

// // ==================== CSS Rule ====================
// class CssRuleNode extends ASTNode {
//     public CssRuleNode(int lineNumber) { super("CssRule", lineNumber, 0); }
//     @Override public <T> T accept(ASTVisitor<T> visitor) { return visitor.visit(this); }
//     @Override public List<ASTNode> getChildren() { return Collections.emptyList(); }
// }

// // ==================== Selector ====================
// class SelectorNode extends ASTNode {
//     public SelectorNode(int lineNumber) { super("Selector", lineNumber, 0); }
//     @Override public <T> T accept(ASTVisitor<T> visitor) { return visitor.visit(this); }
//     @Override public List<ASTNode> getChildren() { return Collections.emptyList(); }
// }

// // ==================== Declaration ====================
// class DeclarationNode extends ASTNode {
//     public DeclarationNode(int lineNumber) { super("Declaration", lineNumber, 0); }
//     @Override public <T> T accept(ASTVisitor<T> visitor) { return visitor.visit(this); }
//     @Override public List<ASTNode> getChildren() { return Collections.emptyList(); }
// }

// // ==================== CSS Value ====================
// class CssValueNode extends ASTNode {
//     public CssValueNode(int lineNumber) { super("CssValue", lineNumber, 0); }
//     @Override public <T> T accept(ASTVisitor<T> visitor) { return visitor.visit(this); }
//     @Override public List<ASTNode> getChildren() { return Collections.emptyList(); }
// }
