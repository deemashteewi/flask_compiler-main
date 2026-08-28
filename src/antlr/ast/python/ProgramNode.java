package antlr.ast.python;

import antlr.ast.node.ASTNode;
import antlr.ast.visitor.ASTVisitor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 */
public class ProgramNode extends ASTNode {

    private final List<StatementNode> statements;

    public ProgramNode(int lineNumber) {
        super("Program", lineNumber, 0);
        this.statements = new ArrayList<>();
    }

    public ProgramNode(List<StatementNode> statements, int lineNumber) {
        super("Program", lineNumber, 0);
        this.statements = new ArrayList<>(statements);
        // تعيين الأب لكل ابن
        for (StatementNode stmt : this.statements) {
            if (stmt != null) {
                stmt.setParent(this);
            }
        }
    }


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
