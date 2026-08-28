package antlr.ast.jinja2.content;

/**
 * Quote style used for HTML attribute values.
 *
 * Examples:
 * - DOUBLE: class="value"
 * - SINGLE: class='value'
 * - UNQUOTED: class=value
 * - NONE: disabled (boolean attribute without value)
 */
public enum QuoteStyle {
    DOUBLE,     // class="value"
    SINGLE,     // class='value'
    UNQUOTED,   // class=value
    NONE        // disabled (boolean attribute)
}
