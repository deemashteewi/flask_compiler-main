package antlr.ast.python.statements;

import java.util.ArrayList;
import java.util.List;

import antlr.ast.node.ASTNode;
import antlr.ast.python.StatementNode;
import antlr.ast.visitor.ASTVisitor;


/**
 * عقدة الكتلة (Block)
 * تمثل مجموعة من العبارات المتتالية داخل if/else/elif/for
 */
public class ImportedClassNode extends StatementNode {

    private String Class;

    public ImportedClassNode(int lineNumber, int columnNumber) {
        super("ImportedClass", lineNumber, columnNumber);
        Class = "";
    }

    public ImportedClassNode(String Class, int lineNumber, int columnNumber) {
        super("ImportedClass", lineNumber, columnNumber);
        this.Class = Class;

    }

    public ImportedClassNode(int lineNumber) {
        this(lineNumber, 0);
    }

    // ==================== إدارة العبارات ====================

    public void addClass(String Class) {
        this.Class = Class;
    }

    public String getClassName() {
        return Class;
    }


    // ==================== تطبيق الواجهات ====================

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public List<ASTNode> getChildren() {
        return new ArrayList<>();
    }


    @Override
    protected String getExtraInfo() {
        return String.format("(class: %s)", Class);
    }
}
