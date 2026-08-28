package antlr.ast.python.statements;

import antlr.ast.node.ASTNode;
import antlr.ast.python.parameters.ParameterNode;
import antlr.ast.visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import antlr.ast.python.StatementNode;

/**
 * Class definition node representing: class ClassName: body
 *
 * Example: class User: ... Example: class Product: ...
 */
public class FunctionDefinitionNode extends StatementNode {

    private final String functionName;
    private final List<ParameterNode> parameters;
    private final List<StatementNode> bodyStatements;

    public FunctionDefinitionNode(String functionName, int lineNumber, int columnNumber) {
        super("FunctionDefinition", lineNumber, columnNumber);
        this.functionName = functionName;
        this.bodyStatements = new ArrayList<>();
        this.parameters = new ArrayList<>();
    }

    public FunctionDefinitionNode(String functionName, List<StatementNode> statements, List<ParameterNode> paramerters, int lineNumber, int columnNumber) {
        super("FunctionDefinition", lineNumber, columnNumber);
        this.functionName = functionName;
        this.bodyStatements = new ArrayList<>(statements);
        this.parameters = new ArrayList<>(paramerters);
        for (StatementNode stmt : this.bodyStatements) {
            if (stmt != null) {
                stmt.setParent(this);
            }
        }
        for (ParameterNode stmt : this.parameters) {
            if (stmt != null) {
                stmt.setParent(this);
            }
        }
    }

    public String getFunctionName() {
        return functionName;
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

    // public boolean isEmpty() {
    //     return bodyStatements.isEmpty();
    // }

    // ==================== إدارة المتحولات ====================
    public void addParameter(ParameterNode node) {
        if (node != null) {
            node.setParent(this);
            parameters.add(node);
        }
    }

    public List<ParameterNode> getParameters() {
        return Collections.unmodifiableList(parameters);
    }

    public int getParametersCount() {
        return parameters.size();
    }

    public boolean isEmpty() {
        return bodyStatements.isEmpty()&&parameters.isEmpty();
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
        return String.format("(functionName: %s, bodyStatements: %d)", functionName, bodyStatements.size());
    }
}
