package antlr.ast.python.statements;

import antlr.ast.node.ASTNode;
import antlr.ast.python.StatementNode;
import antlr.ast.visitor.ASTVisitor;
import antlr.ast.python.expressions.ExpressionNode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * عقدة عبارة If
 * تمثل: if condition: block (elif condition: block)* (else: block)?
 *
 * البنية:
 * - condition: شرط if الرئيسي
 * - ifBlock: كتلة if
 * - elifConditions: قائمة شروط elif
 * - elifBlocks: قائمة كتل elif
 * - elseBlock: كتلة else (اختياري)
 */
public class IfStatementNode extends StatementNode {

    private final ExpressionNode condition;
    private final BlockNode ifBlock;
    private final List<ExpressionNode> elifConditions;
    private final List<BlockNode> elifBlocks;
    private final BlockNode elseBlock;  // يمكن أن يكون null

    /**
     * Constructor كامل
     */
    public IfStatementNode(ExpressionNode condition, BlockNode ifBlock,
                           List<ExpressionNode> elifConditions,
                           List<BlockNode> elifBlocks,
                           BlockNode elseBlock,
                           int lineNumber, int columnNumber) {
        super("IfStatement", lineNumber, columnNumber);

        this.condition = condition;
        this.ifBlock = ifBlock;
        this.elifConditions = elifConditions != null ? new ArrayList<>(elifConditions) : new ArrayList<>();
        this.elifBlocks = elifBlocks != null ? new ArrayList<>(elifBlocks) : new ArrayList<>();
        this.elseBlock = elseBlock;

        // تعيين الأب
        if (condition != null) condition.setParent(this);
        if (ifBlock != null) ifBlock.setParent(this);
        for (ExpressionNode ec : this.elifConditions) {
            if (ec != null) ec.setParent(this);
        }
        for (BlockNode eb : this.elifBlocks) {
            if (eb != null) eb.setParent(this);
        }
        if (elseBlock != null) elseBlock.setParent(this);
    }

    /**
     * Constructor مبسط (if فقط)
     */
    public IfStatementNode(ExpressionNode condition, BlockNode ifBlock,
                           int lineNumber, int columnNumber) {
        this(condition, ifBlock, null, null, null, lineNumber, columnNumber);
    }

    // ==================== Getters ====================

    public ExpressionNode getCondition() {
        return condition;
    }

    public BlockNode getIfBlock() {
        return ifBlock;
    }

    public List<ExpressionNode> getElifConditions() {
        return Collections.unmodifiableList(elifConditions);
    }

    public List<BlockNode> getElifBlocks() {
        return Collections.unmodifiableList(elifBlocks);
    }

    public BlockNode getElseBlock() {
        return elseBlock;
    }

    public boolean hasElif() {
        return !elifConditions.isEmpty();
    }

    public boolean hasElse() {
        return elseBlock != null;
    }

    public int getElifCount() {
        return elifConditions.size();
    }

    // ==================== تطبيق الواجهات ====================

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> children = new ArrayList<>();

        if (condition != null) children.add(condition);
        if (ifBlock != null) children.add(ifBlock);

        children.addAll(elifConditions);
        children.addAll(elifBlocks);

        if (elseBlock != null) children.add(elseBlock);

        return children;
    }

    @Override
    protected String getExtraInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        if (hasElif()) {
            sb.append("elif: ").append(getElifCount());
        }
        if (hasElse()) {
            if (hasElif()) sb.append(", ");
            sb.append("has else");
        }
        sb.append(")");
        return sb.toString();
    }

    /**
     * طباعة مخصصة لعقدة if
     */
    @Override
    public String toString(int indent) {
        StringBuilder sb = new StringBuilder();
        String indentStr = getIndent(indent);

        // طباعة if
        sb.append(indentStr).append("├── IfStatement [Line: ")
          .append(lineNumber).append("]\n");

        // شرط if
        sb.append(getIndent(indent + 1)).append("├── Condition:\n");
        if (condition != null) {
            sb.append(condition.toString(indent + 2));
        }

        // كتلة if
        sb.append(getIndent(indent + 1)).append("├── Then Block:\n");
        if (ifBlock != null) {
            sb.append(ifBlock.toString(indent + 2));
        }

        // elif blocks
        for (int i = 0; i < elifConditions.size(); i++) {
            sb.append(getIndent(indent + 1)).append("├── Elif ").append(i + 1).append(":\n");
            sb.append(getIndent(indent + 2)).append("├── Condition:\n");
            sb.append(elifConditions.get(i).toString(indent + 3));
            sb.append(getIndent(indent + 2)).append("├── Block:\n");
            sb.append(elifBlocks.get(i).toString(indent + 3));
        }

        // else block
        if (elseBlock != null) {
            sb.append(getIndent(indent + 1)).append("├── Else Block:\n");
            sb.append(elseBlock.toString(indent + 2));
        }

        return sb.toString();
    }
}
