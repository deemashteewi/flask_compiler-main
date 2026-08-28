package antlr.ast.jinja2.statements;

/**
 * Shared enum for context mode used by include, import, and from-import statements.
 *
 * Examples:
 * - {% include "x.html" with context %}
 * - {% import "x.html" as x without context %}
 * - {% from "x.html" import macro with context %}
 */
public enum ContextMode {
    WITH_CONTEXT,      // with context
    WITHOUT_CONTEXT,   // without context
    DEFAULT            // not specified - uses default behavior
}
