package antlr.ast.node;

import antlr.ast.visitor.ASTVisitor;

/**
 *
 */
public abstract class ASTNode {

    protected final String nodeName;
    protected final int lineNumber;
    protected final int columnNumber;

    protected ASTNode parent;

    /**
     */
    public ASTNode(String nodeName, int lineNumber, int columnNumber) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.columnNumber = columnNumber;
    }

    /**
     */
    public ASTNode(String nodeName, int lineNumber) {
        this(nodeName, lineNumber, 0);
    }

    // ==================== Getters ====================

    public String getNodeName() {
        return nodeName;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public int getColumnNumber() {
        return columnNumber;
    }

    public ASTNode getParent() {
        return parent;
    }

    public void setParent(ASTNode parent) {
        this.parent = parent;
    }

    // ==================== Abstract Methods (Polymorphism) ====================

    /**
     */
    public abstract <T> T accept(ASTVisitor<T> visitor);


    public abstract java.util.List<ASTNode> getChildren();



    public String toString(int indent) {
        StringBuilder sb = new StringBuilder();
        String indentStr = getIndent(indent);

        sb.append(indentStr)
          .append("├── ")
          .append(nodeName)
          .append(" [Line: ").append(lineNumber)
          .append(", Col: ").append(columnNumber).append("]");

        String extra = getExtraInfo();
        if (extra != null && !extra.isEmpty()) {
            sb.append(" ").append(extra);
        }
        sb.append("\n");

        java.util.List<ASTNode> children = getChildren();
        for (int i = 0; i < children.size(); i++) {
            ASTNode child = children.get(i);
            if (child != null) {
                sb.append(child.toString(indent + 1));
            }
        }

        return sb.toString();
    }


    protected String getExtraInfo() {
        return "";
    }


    protected String getIndent(int level) {
        return "│   ".repeat(level);
    }


    public void printTree() {
        System.out.println(this.toString(0));
    }

    @Override
    public String toString() {
        return toString(0);
    }
}
