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
public class ImportStatement extends StatementNode {

    private final String moduleName;
    private final List<ImportedClassNode> importedClassNodes;

    public ImportStatement(String moduleName, int lineNumber, int columnNumber) {
        super("ImportStatement", lineNumber, columnNumber);
        this.moduleName = moduleName;
        this.importedClassNodes = new ArrayList<>();
    }

    public ImportStatement(String moduleName, List<ImportedClassNode> statements, int lineNumber, int columnNumber) {
        super("ImportStatement", lineNumber, columnNumber);
        this.moduleName = moduleName;
        this.importedClassNodes = new ArrayList<>(statements);
        for (ImportedClassNode stmt : this.importedClassNodes) {
            if (stmt != null) {
                stmt.setParent(this);
            }
        }
    }

    public String getModuleName() {
        return moduleName;
    }

    // ==================== إدارة العبارات ====================

    public void addImportedClass(ImportedClassNode node) {
        if (node != null) {
            node.setParent(this);
            importedClassNodes.add(node);
        }
    }

    public List<ImportedClassNode> getImportedClasses() {
        return Collections.unmodifiableList(importedClassNodes);
    }

    public int getImportedClassesCount() {
        return importedClassNodes.size();
    }

    public boolean isEmpty() {
        return importedClassNodes.isEmpty();
    }

    // ==================== تطبيق الواجهات ====================

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public List<ASTNode> getChildren() {
        return new ArrayList<>(importedClassNodes);
    }

    @Override
    protected String getExtraInfo() {
        return String.format("(module: %s, imported classes: %d)", moduleName, importedClassNodes.size());
    }
}
