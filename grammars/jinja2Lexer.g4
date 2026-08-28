lexer grammar jinja2Lexer;

@header {
   package antlr.gen.jinja2;
}

// ==================== MODES ====================
// Default mode: HTML content
// HTML_TAG mode: Inside <tag ...>
// STYLE_TAG_MODE mode: Inside <style ...> (enters CSS_CONTENT after close)
// ATTR_DQUOTE mode: Inside "..."
// ATTR_SQUOTE mode: Inside '...'
// CSS_CONTENT mode: Inside <style>...</style> (CSS rules)
// JINJA_STMT mode: Inside {% ... %}
// JINJA_EXPR mode: Inside {{ ... }}
// JINJA_COMMENT mode: Inside {# ... #}

// ==================== DEFAULT MODE (HTML CONTENT) ====================

// Jinja2 openers (must come before HTML patterns - highest priority)
STMT_OPEN_TRIM  : '{%-' -> pushMode(JINJA_STMT);
EXPR_OPEN_TRIM  : '{{-' -> pushMode(JINJA_EXPR);
STMT_OPEN       : '{%' -> pushMode(JINJA_STMT);
EXPR_OPEN       : '{{' -> pushMode(JINJA_EXPR);
COMMENT_OPEN    : '{#' -> pushMode(JINJA_COMMENT);

// HTML5 DOCTYPE (must come before TAG_OPEN)
HTML_DOCTYPE    : '<!' [Dd][Oo][Cc][Tt][Yy][Pp][Ee] ~[>]* '>';

// HTML Comments (must come before TAG_OPEN)
HTML_COMMENT    : '<!--' .*? '-->';

// CDATA sections
CDATA           : '<![CDATA[' .*? ']]>';

// HTML Tag patterns
TAG_CLOSE_SLASH : '</' -> pushMode(HTML_TAG);
TAG_OPEN        : '<' -> pushMode(HTML_TAG);

// Entity references
ENTITY          : '&' ( '#' [0-9]+ | '#' [xX] [0-9a-fA-F]+ | [a-zA-Z]+ ) ';';

// Raw HTML text (anything not starting a tag or Jinja2)
HTML_TEXT       : ~[<{&]+ | '{' ~[%#{] | '<' ~[!a-zA-Z/] | '&' ~[#a-zA-Z];

// ==================== HTML TAG MODE ====================
mode HTML_TAG;

// Jinja2 can appear in tags (for dynamic attributes)
TAG_STMT_OPEN   : '{%' -> pushMode(JINJA_STMT);
TAG_EXPR_OPEN   : '{{' -> pushMode(JINJA_EXPR);

// Tag close patterns
TAG_SELF_CLOSE  : '/>' -> popMode;
TAG_CLOSE       : '>' -> popMode;

// Attribute value delimiters
TAG_DQUOTE      : '"' -> pushMode(ATTR_DQUOTE);
TAG_SQUOTE      : '\'' -> pushMode(ATTR_SQUOTE);

// Tag structure
TAG_EQUALS      : '=';

// ==================== SPECIFIC HTML TAG NAMES ====================
// Only tags used in tests/flask/templates/*.html
// These must come BEFORE the generic TAG_NAME rule
// Case-insensitive matching for HTML compatibility

// Document structure tags
HTMLROOT_TAG : [Hh] [Tt] [Mm] [Ll];
HEAD_TAG     : [Hh] [Ee] [Aa] [Dd];
BODY_TAG     : [Bb] [Oo] [Dd] [Yy];
TITLE_TAG    : [Tt] [Ii] [Tt] [Ll] [Ee];

// Style tag - enters STYLE_TAG_MODE for special handling
STYLE_TAG : [Ss] [Tt] [Yy] [Ll] [Ee] -> mode(STYLE_TAG_MODE);

// Container tag
DIV_TAG   : [Dd] [Ii] [Vv];

// Heading tag
H1_TAG    : [Hh] '1';

// Text tag
P_TAG     : [Pp];

// Form tags
FORM_TAG    : [Ff] [Oo] [Rr] [Mm];
LABEL_TAG   : [Ll] [Aa] [Bb] [Ee] [Ll];
TEXTAREA_TAG: [Tt] [Ee] [Xx] [Tt] [Aa] [Rr] [Ee] [Aa];
BUTTON_TAG  : [Bb] [Uu] [Tt] [Tt] [Oo] [Nn];

// Interactive tag
A_TAG     : [Aa];

// Void element tags
INPUT_TAG : [Ii] [Nn] [Pp] [Uu] [Tt];
IMG_TAG   : [Ii] [Mm] [Gg];

// Generic fallback for unknown/custom tags (MUST BE LAST)
TAG_NAME : [a-zA-Z_] [a-zA-Z0-9_:-]*;

// Unquoted attribute values
TAG_UNQUOTED_VALUE : ~[ \t\r\n"'=<>`/]+ ;

// Whitespace (skip in tag mode)
TAG_WS          : [ \t\r\n]+ -> skip;

// ==================== STYLE TAG MODE (handles style tag attributes) ====================
mode STYLE_TAG_MODE;

// Jinja2 can appear in style tags (for dynamic attributes)
STYLE_STMT_OPEN : '{%' -> type(TAG_STMT_OPEN), pushMode(JINJA_STMT);
STYLE_EXPR_OPEN : '{{' -> type(TAG_EXPR_OPEN), pushMode(JINJA_EXPR);

// Tag close patterns - enters CSS_CONTENT mode instead of returning to DEFAULT
STYLE_SELF_CLOSE: '/>' -> type(TAG_SELF_CLOSE), popMode;  // Self-closing style tag (no CSS content)
STYLE_TAG_CLOSE : '>' -> type(TAG_CLOSE), popMode, pushMode(CSS_CONTENT);  // Enter CSS mode

// Attribute value delimiters
STYLE_DQUOTE    : '"' -> type(TAG_DQUOTE), pushMode(ATTR_DQUOTE);
STYLE_SQUOTE    : '\'' -> type(TAG_SQUOTE), pushMode(ATTR_SQUOTE);

// Tag structure
STYLE_EQUALS    : '=' -> type(TAG_EQUALS);

// Attribute name (reuse TAG_NAME type)
STYLE_ATTR_NAME : [a-zA-Z_] [a-zA-Z0-9_:-]* -> type(TAG_NAME);

// Unquoted attribute values
STYLE_UNQUOTED  : ~[ \t\r\n"'=<>`/]+ -> type(TAG_UNQUOTED_VALUE);

// Whitespace (skip in style tag mode)
STYLE_WS        : [ \t\r\n]+ -> skip;

// ==================== ATTRIBUTE DOUBLE QUOTE MODE ====================
mode ATTR_DQUOTE;

// Jinja2 expressions in attribute values
ATTR_DQ_STMT_OPEN : '{%' -> pushMode(JINJA_STMT);
ATTR_DQ_EXPR_OPEN : '{{' -> pushMode(JINJA_EXPR);

// Close quote
ATTR_DQ_CLOSE   : '"' -> popMode;

// Attribute text content
ATTR_DQ_TEXT    : ~["{%]+ | '{' ~[%{];

// ==================== ATTRIBUTE SINGLE QUOTE MODE ====================
mode ATTR_SQUOTE;

// Jinja2 expressions in attribute values
ATTR_SQ_STMT_OPEN : '{%' -> pushMode(JINJA_STMT);
ATTR_SQ_EXPR_OPEN : '{{' -> pushMode(JINJA_EXPR);

// Close quote
ATTR_SQ_CLOSE   : '\'' -> popMode;

// Attribute text content
ATTR_SQ_TEXT    : ~['{%]+ | '{' ~[%{];

// ==================== CSS CONTENT MODE (inside <style> tags) ====================
mode CSS_CONTENT;

// Jinja2 can appear in CSS (common pattern in Flask)
CSS_STMT_OPEN   : '{%' -> pushMode(JINJA_STMT);
CSS_EXPR_OPEN   : '{{' -> pushMode(JINJA_EXPR);

// Close tag for style element
CSS_STYLE_CLOSE : '</' [Ss][Tt][Yy][Ll][Ee] [ \t]* '>' -> popMode;

// ==================== CSS ELEMENT SELECTORS (must match HTML elements) ====================
// These match the 15 HTML elements we kept
CSS_BODY_SEL    : 'body';
CSS_H1_SEL      : 'h1';
CSS_P_SEL       : 'p';
CSS_DIV_SEL     : 'div';
CSS_FORM_SEL    : 'form';
CSS_LABEL_SEL   : 'label';
CSS_INPUT_SEL   : 'input';
CSS_TEXTAREA_SEL: 'textarea';
CSS_BUTTON_SEL  : 'button';
CSS_A_SEL       : 'a';
CSS_IMG_SEL     : 'img';

// ==================== CSS PSEUDO-CLASSES ====================
CSS_HOVER       : ':' 'hover';
CSS_FOCUS       : ':' 'focus';
CSS_ACTIVE      : ':' 'active';
CSS_DISABLED    : ':' 'disabled';
CSS_FIRST_CHILD : ':' 'first-child';
CSS_LAST_CHILD  : ':' 'last-child';

// ==================== CSS PROPERTY NAMES ====================
// Typography
CSS_FONT_FAMILY     : 'font-family';
CSS_FONT_SIZE       : 'font-size';
CSS_FONT_WEIGHT     : 'font-weight';
CSS_LETTER_SPACING  : 'letter-spacing';
CSS_TEXT_ALIGN      : 'text-align';
CSS_TEXT_DECORATION : 'text-decoration';
CSS_TEXT_TRANSFORM  : 'text-transform';
CSS_LINE_HEIGHT     : 'line-height';

// Box Model
CSS_MARGIN          : 'margin';
CSS_MARGIN_TOP      : 'margin-top';
CSS_MARGIN_BOTTOM   : 'margin-bottom';
CSS_PADDING         : 'padding';
CSS_WIDTH           : 'width';
CSS_HEIGHT          : 'height';
CSS_MAX_WIDTH       : 'max-width';
CSS_MAX_HEIGHT      : 'max-height';
CSS_MIN_HEIGHT      : 'min-height';
CSS_BOX_SIZING      : 'box-sizing';

// Colors & Background
CSS_COLOR           : 'color';
CSS_BACKGROUND      : 'background';
CSS_BACKGROUND_COLOR: 'background-color';

// Borders & Shadows
CSS_BORDER          : 'border';
CSS_BORDER_RADIUS   : 'border-radius';
CSS_BORDER_TOP      : 'border-top';
CSS_BORDER_COLOR    : 'border-color';
CSS_BOX_SHADOW      : 'box-shadow';

// Display & Layout
CSS_DISPLAY         : 'display';
CSS_FLEX_WRAP       : 'flex-wrap';
CSS_JUSTIFY_CONTENT : 'justify-content';
CSS_ALIGN_ITEMS     : 'align-items';
CSS_GAP             : 'gap';
CSS_OVERFLOW        : 'overflow';

// Interactions
CSS_CURSOR          : 'cursor';
CSS_TRANSITION      : 'transition';
CSS_OUTLINE         : 'outline';
CSS_RESIZE          : 'resize';
CSS_TRANSFORM       : 'transform';

// Visual
CSS_OBJECT_FIT      : 'object-fit';

// ==================== CSS KEYWORDS ====================
// Display values
CSS_FLEX            : 'flex';
CSS_BLOCK           : 'block';
CSS_INLINE_BLOCK    : 'inline-block';
CSS_NONE            : 'none';

// Position/Alignment
CSS_CENTER          : 'center';
CSS_AUTO            : 'auto';

// Text
CSS_UPPERCASE       : 'uppercase';
CSS_INHERIT         : 'inherit';

// Other
CSS_POINTER         : 'pointer';
CSS_VERTICAL        : 'vertical';
CSS_CONTAIN         : 'contain';
CSS_EASE            : 'ease';
CSS_HIDDEN          : 'hidden';
CSS_WRAP            : 'wrap';
CSS_SOLID           : 'solid';
CSS_BORDER_BOX      : 'border-box';
CSS_CONTENT_BOX     : 'content-box';

// Colors
CSS_WHITE           : 'white';

// ==================== CSS FUNCTIONS ====================
CSS_RGBA            : 'rgba';
CSS_TRANSLATEY      : 'translateY';

// ==================== CSS UNITS ====================
CSS_VH              : [0-9]+ 'vh';
CSS_EM              : '-'? [0-9]+ ('.' [0-9]+)? 'em';
CSS_PERCENT         : [0-9]+ ('.' [0-9]+)? '%';
CSS_PX              : '-'? [0-9]+ ('.' [0-9]+)? 'px';
CSS_TIME            : [0-9]+ ('.' [0-9]+)? 's';

// ==================== CSS VALUES ====================
// Hex color (must come before CSS_IDENT)
CSS_HEX_COLOR       : '#' [0-9a-fA-F]+;

// Number (for font-weight, opacity, etc.)
CSS_NUMBER          : '-'? [0-9]+ ('.' [0-9]+)?;

// Identifier (for class names, font names, etc.)
CSS_IDENT           : '-'? [a-zA-Z_] [a-zA-Z0-9_-]*;

// ==================== CSS STRUCTURAL TOKENS ====================
CSS_LBRACE          : '{';
CSS_RBRACE          : '}';
CSS_LPAREN          : '(';
CSS_RPAREN          : ')';
CSS_SEMI            : ';';
CSS_COLON           : ':';
CSS_COMMA           : ',';
CSS_DOT             : '.';

// Whitespace (skip in CSS mode)
CSS_WS              : [ \t\r\n]+ -> skip;

// ==================== JINJA STATEMENT MODE ====================
mode JINJA_STMT;

// Close tags (trim version must come first)
STMT_CLOSE_TRIM : '-%}' -> popMode;
STMT_CLOSE      : '%}' -> popMode;

// ==================== Keywords ====================
// Control flow
FOR             : 'for';
ENDFOR          : 'endfor';
IF              : 'if';
ELIF            : 'elif';
ELSE            : 'else';
ENDIF           : 'endif';

// Template inheritance
BLOCK           : 'block';
ENDBLOCK        : 'endblock';
EXTENDS         : 'extends';
INCLUDE         : 'include';

// Variables
SET             : 'set';
ENDSET          : 'endset';
WITH            : 'with';
ENDWITH         : 'endwith';

// Macros
MACRO           : 'macro';
ENDMACRO        : 'endmacro';
CALL            : 'call';
ENDCALL         : 'endcall';

// Imports
IMPORT          : 'import';
FROM            : 'from';
AS              : 'as';

// Filter/Raw blocks
FILTER          : 'filter';
ENDFILTER       : 'endfilter';
RAW             : 'raw';
ENDRAW          : 'endraw';

// Other statements
DO              : 'do';
AUTOESCAPE      : 'autoescape';
ENDAUTOESCAPE   : 'endautoescape';

// Include/Import modifiers
IGNORE          : 'ignore';
MISSING         : 'missing';
CONTEXT         : 'context';
WITHOUT         : 'without';
SCOPED          : 'scoped';

// ==================== Operators ====================
// Logical (Python-style)
AND             : 'and';
OR              : 'or';
NOT             : 'not';
IN              : 'in';
IS              : 'is';

// Comparison
EQ              : '==';
NEQ             : '!=';
LTE             : '<=';
GTE             : '>=';
LT              : '<';
GT              : '>';

// Arithmetic (POW must come before STAR)
POW             : '**';
PLUS            : '+';
MINUS           : '-';
STAR            : '*';
SLASH           : '/';
FLOORDIV        : '//';
MOD             : '%';
TILDE           : '~';

// Punctuation
DOT             : '.';
COMMA           : ',';
COLON           : ':';
PIPE            : '|';
ASSIGN          : '=';
LPAREN          : '(';
RPAREN          : ')';
LBRACK          : '[';
RBRACK          : ']';
LBRACE          : '{';
RBRACE          : '}';

// ==================== Literals ====================
TRUE            : 'true' | 'True';
FALSE           : 'false' | 'False';
NONE            : 'none' | 'None';

// String literals (double or single quoted)
STRING          : '"' (~["\r\n\\] | '\\' .)* '"'
                | '\'' (~['\r\n\\] | '\\' .)* '\'';

// Number literals (integer or float)
NUMBER          : [0-9]+ ('.' [0-9]+)?;

// Identifiers
NAME            : [a-zA-Z_][a-zA-Z0-9_]*;

// Whitespace (skip in statement mode)
STMT_WS         : [ \t\r\n]+ -> skip;

// ==================== JINJA EXPRESSION MODE ====================
mode JINJA_EXPR;

// Close tags (trim version must come first)
EXPR_CLOSE_TRIM : '-}}' -> popMode;
EXPR_CLOSE      : '}}' -> popMode;

// All tokens mirrored with type() to share with STMT mode
// Comparison (longer patterns first)
EXPR_EQ         : '==' -> type(EQ);
EXPR_NEQ        : '!=' -> type(NEQ);
EXPR_LTE        : '<=' -> type(LTE);
EXPR_GTE        : '>=' -> type(GTE);
EXPR_LT         : '<' -> type(LT);
EXPR_GT         : '>' -> type(GT);

// Arithmetic (POW must come before STAR)
EXPR_POW        : '**' -> type(POW);
EXPR_FLOORDIV   : '//' -> type(FLOORDIV);
EXPR_PLUS       : '+' -> type(PLUS);
EXPR_MINUS      : '-' -> type(MINUS);
EXPR_STAR       : '*' -> type(STAR);
EXPR_SLASH      : '/' -> type(SLASH);
EXPR_MOD        : '%' -> type(MOD);
EXPR_TILDE      : '~' -> type(TILDE);

// Punctuation
EXPR_DOT        : '.' -> type(DOT);
EXPR_COMMA      : ',' -> type(COMMA);
EXPR_COLON      : ':' -> type(COLON);
EXPR_PIPE       : '|' -> type(PIPE);
EXPR_ASSIGN     : '=' -> type(ASSIGN);
EXPR_LPAREN     : '(' -> type(LPAREN);
EXPR_RPAREN     : ')' -> type(RPAREN);
EXPR_LBRACK     : '[' -> type(LBRACK);
EXPR_RBRACK     : ']' -> type(RBRACK);
EXPR_LBRACE     : '{' -> type(LBRACE);
EXPR_RBRACE     : '}' -> type(RBRACE);

// Keywords (must check before NAME)
EXPR_AND        : 'and' -> type(AND);
EXPR_OR         : 'or' -> type(OR);
EXPR_NOT        : 'not' -> type(NOT);
EXPR_IN         : 'in' -> type(IN);
EXPR_IS         : 'is' -> type(IS);
EXPR_IF         : 'if' -> type(IF);
EXPR_ELSE       : 'else' -> type(ELSE);
EXPR_TRUE       : ('true' | 'True') -> type(TRUE);
EXPR_FALSE      : ('false' | 'False') -> type(FALSE);
EXPR_NONE       : ('none' | 'None') -> type(NONE);

// Literals
EXPR_STRING_DQ  : '"' (~["\r\n\\] | '\\' .)* '"' -> type(STRING);
EXPR_STRING_SQ  : '\'' (~['\r\n\\] | '\\' .)* '\'' -> type(STRING);
EXPR_NUMBER     : [0-9]+ ('.' [0-9]+)? -> type(NUMBER);

// Identifiers
EXPR_NAME       : [a-zA-Z_][a-zA-Z0-9_]* -> type(NAME);

// Whitespace
EXPR_WS         : [ \t\r\n]+ -> skip;

// ==================== JINJA COMMENT MODE ====================
mode JINJA_COMMENT;

COMMENT_CLOSE   : '#}' -> popMode;
COMMENT_TEXT    : . -> skip;
