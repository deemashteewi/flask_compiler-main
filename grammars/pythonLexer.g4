lexer grammar pythonLexer;

@header {
   package antlr.gen.python;
   import com.yuvalshavit.antlr4.DenterHelper;
}

@members {
  private int bracketDepth = 0;  // Track nested brackets

  private final DenterHelper denter = new DenterHelper(NL,
      pythonParser.INDENT,
      pythonParser.DEDENT)
  {
    @Override
    public Token pullToken() {
      Token token = pythonLexer.super.nextToken();

      // Track bracket depth
      int type = token.getType();
      if (type == LPAREN || type == LBRACK || type == LBRACE) {
        bracketDepth++;
      } else if (type == RPAREN || type == RBRACK || type == RBRACE) {
        bracketDepth--;
        if (bracketDepth < 0) bracketDepth = 0;
      }

      // Skip NL tokens inside brackets - DenterHelper won't see them
      // Parser's NL* rules will match zero NL tokens inside brackets
      while (bracketDepth > 0 && token.getType() == NL) {
        token = pythonLexer.super.nextToken();
        type = token.getType();
        if (type == LPAREN || type == LBRACK || type == LBRACE) {
          bracketDepth++;
        } else if (type == RPAREN || type == RBRACK || type == RBRACE) {
          bracketDepth--;
          if (bracketDepth < 0) bracketDepth = 0;
        }
      }

      return token;
    }
  };

  @Override
  public Token nextToken() {
    return denter.nextToken();
  }
}

COMMENT: '#' ~[\r\n]* -> channel(HIDDEN);

// Numbers
NUM: [0-9]+;
DOUBLE: [0-9]+ ('.' [0-9]*)?;
// Arithmetic operators (POW before MUL to match ** before *)
POW: '**';
STAR: '*';
DIV: '/';
PLUS: '+';
SUB: '-';

// Comparison operators
EQ: '==';
NEQ: '!=';
LT: '<';
GT: '>';
LTE: '<=';
GTE: '>=';

// Boolean operators
AND: 'and';
OR: 'or';
NOT: 'not';

// Keywords (BEFORE NAME!)
IF: 'if';
ELIF: 'elif';
ELSE: 'else';
PRINT: 'print';
RETURN: 'return';
TRUE: 'True';
FALSE: 'False';

// Loop keywords
FOR: 'for';
IN: 'in';
WHILE: 'while';

// Loop control
BREAK: 'break';
CONTINUE: 'continue';

// None literal
NONE: 'None';

// Assignment and punctuation
ASSIGN: '=';
COLON: ':';
LPAREN: '(';
RPAREN: ')';
COMMA: ',';
LBRACK: '[';
RBRACK: ']';
LBRACE: '{';
RBRACE: '}';

DOT: '.';
AT: '@';


CLASS: 'class';
DEF: 'def';

STRING:
	'"' (~["\\] | '\\' .)* '"' // double-quoted strings
	| '\'' (~['\\] | '\\' .)* '\''; // single-quoted strings

FROM: 'from';
IMPORT: 'import';
// Identifiers (LAST!)
NAME: [a-zA-Z_][a-zA-Z0-9_]*;

// Newline with trailing spaces (for indentation detection)
NL: ('\r'? '\n' ' '*);

// Skip spaces and tabs within lines
WS: [ \t]+ -> skip;