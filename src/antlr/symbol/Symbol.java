package antlr.symbol;

/**
 * رمز في جدول الرموز
 * يمثل متغير أو دالة أو أي كيان مسمى
 */
public class Symbol {

    /**
     * أنواع الرموز
     */
    public enum SymbolType {
        VARIABLE,
        FUNCTION,
        PARAMETER,
        TEMPLATE_VARIABLE,
        HTML_ELEMENT,
        CSS_CLASS,
        CSS_ID
    }

    private final String name;
    private final SymbolType type;
    private final int lineNumber;
    private final int columnNumber;
    private Object value;  // القيمة (اختياري)
    private String dataType;  // نوع البيانات (اختياري)

    public Symbol(String name, SymbolType type, int lineNumber, int columnNumber) {
        this.name = name;
        this.type = type;
        this.lineNumber = lineNumber;
        this.columnNumber = columnNumber;
    }

    public Symbol(String name, SymbolType type, int lineNumber) {
        this(name, type, lineNumber, 0);
    }

    // ==================== Getters & Setters ====================

    public String getName() {
        return name;
    }

    public SymbolType getType() {
        return type;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public int getColumnNumber() {
        return columnNumber;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    // ==================== Utility Methods ====================

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-15s", name));
        sb.append(String.format("%-20s", type));
        sb.append(String.format("Line: %-5d", lineNumber));
        sb.append(String.format("Col: %-5d", columnNumber));
        if (dataType != null) {
            sb.append(String.format("Type: %-10s", dataType));
        }
        if (value != null) {
            sb.append(String.format("Value: %s", value));
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Symbol symbol = (Symbol) obj;
        return name.equals(symbol.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
