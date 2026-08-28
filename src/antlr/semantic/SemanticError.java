
package antlr.semantic;

public class SemanticError {

    public enum ErrorType {
        UNDEFINED_VARIABLE,
        REDECLARATION,
        UNDEFINED_FUNCTION,
        ARGUMENT_COUNT_MISMATCH,
        INVALID_LOOP_CONTROL,
        DUPLICATE_PARAMETER,
        INVALID_RETURN,
        DUPLICATE_KEYWORD_ARGUMENT,
        INVALID_CALL,
        UNREACHABLE_CODE,
        MISMATCHED_CLOSING_NAME,
        TYPE_MISMATCH,
        MULTIPLE_EXTENDS

    }

    private final ErrorType type;
    private final String message;
    private final int line;
    private final int column;

    public SemanticError(ErrorType type, String message, int line, int column) {
        this.type = type;
        this.message = message;
        this.line = line;
        this.column = column;
    }

    public ErrorType getType() { return type; }
    public String getMessage() { return message; }
    public int getLine() { return line; }
    public int getColumn() { return column; }

    @Override
    public String toString() {
        return String.format("[%s] Line %d:%d - %s", type, line, column, message);
    }
}
