package antlr.ast.python.statements;

import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import antlr.ast.python.StatementNode;

/**
 * Class definition node representing: class ClassName: body
 *
 * Example: class User: ...
 * Example: class Product: ...
 */
public class ClassDefinitionNode extends StatementNode {

    private final String className;
    private final List<StatementNode> bodyStatements;

    public ClassDefinitionNode(String className, int lineNumber, int columnNumber) {
        super("ClassDefinition", lineNumber, columnNumber);
        this.className = className;
        this.bodyStatements = new ArrayList<>();
    }

    public ClassDefinitionNode(String className, List<StatementNode> statements, int lineNumber, int columnNumber) {
        super("ClassDefinition", lineNumber, columnNumber);
        this.className = className;
        this.bodyStatements = new ArrayList<>(statements);
        for (StatementNode stmt : this.bodyStatements) {
            if (stmt != null) {
                stmt.setParent(this);
            }
        }
    }

    public String getClassName() {
        return className;
    }

    // ==================== إدارة العبارات ====================
    public void addStatement(StatementNode node) {
        if (node != null) {
            node.setParent(this);
            bodyStatements.add(node);
        }
    }

    public List<StatementNode> getBodyStatements() {
        return Collections.unmodifiableList(bodyStatements);
    }

    public int getBodyStatementsCount() {
        return bodyStatements.size();
    }

    public boolean isEmpty() {
        return bodyStatements.isEmpty();
    }

    // ==================== تطبيق الواجهات ====================
    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public List<ASTNode> getChildren() {
        return new ArrayList<>(bodyStatements);
    }

    @Override
    protected String getExtraInfo() {
        return String.format("(className: %s, bodyStatements: %d)", className, bodyStatements.size());
    }
}
