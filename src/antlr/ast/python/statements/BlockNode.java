package antlr.ast.python.statements;

import antlr.ast.node.ASTNode;
import antlr.ast.python.StatementNode;
import antlr.ast.visitor.ASTVisitor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * عقدة الكتلة (Block)
 * تمثل مجموعة من العبارات المتتالية داخل if/else/elif/for
 */
public class BlockNode extends ASTNode {

    private final List<StatementNode> statements;

    public BlockNode(int lineNumber, int columnNumber) {
        super("Block", lineNumber, columnNumber);
        this.statements = new ArrayList<>();
    }

    public BlockNode(List<StatementNode> statements, int lineNumber, int columnNumber) {
        super("Block", lineNumber, columnNumber);
        this.statements = new ArrayList<>(statements);
        for (StatementNode stmt : this.statements) {
            if (stmt != null) {
                stmt.setParent(this);
            }
        }
    }

    public BlockNode(int lineNumber) {
        this(lineNumber, 0);
    }

    // ==================== إدارة العبارات ====================

    public void addStatement(StatementNode statement) {
        if (statement != null) {
            statement.setParent(this);
            statements.add(statement);
        }
    }

    public List<StatementNode> getStatements() {
        return Collections.unmodifiableList(statements);
    }

    public int getStatementCount() {
        return statements.size();
    }

    public boolean isEmpty() {
        return statements.isEmpty();
    }

    // ==================== تطبيق الواجهات ====================

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public List<ASTNode> getChildren() {
        return new ArrayList<>(statements);
    }

    @Override
    protected String getExtraInfo() {
        return String.format("(statements: %d)", statements.size());
    }
}
