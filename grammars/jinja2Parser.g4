parser grammar jinja2Parser;

options {
    tokenVocab = jinja2Lexer;
}

@header {
   package antlr.gen.jinja2;
}

// ==================== ROOT ====================
template        : templateContent* EOF;

templateContent : htmlElement                   # HtmlElementPart
                | htmlText                      # HtmlTextPart
                | htmlDoctype                   # HtmlDoctypePart
                | htmlCommentBlock              # HtmlCommentPart
                | htmlCdata                     # HtmlCdataPart
                | htmlEntity                    # HtmlEntityPart
                | expressionBlock               # ExpressionOutput
                | forBlock                      # ForLoopBlock
                | ifBlock                       # IfConditionBlock
                | extendsStatement              # ExtendsStmt
                | includeStatement              # IncludeStmt
                | blockDefinition               # BlockDefStmt
                | setStatement                  # SetStmt
                | setBlockStatement             # SetBlockStmt
                | macroStatement                # MacroDefStmt
                | importStatement               # ImportStmt
                | fromImportStatement           # FromImportStmt
                | withBlock                     # WithScopeBlock
                | filterBlock                   # FilterApplyBlock
                | doStatement                   # DoStmt
                | callBlock                     # CallMacroBlock
                | autoescapeBlock               # AutoescapeStmt
                ;

// ==================== HTML ELEMENTS ====================

// Main dispatcher - only elements used in tests/flask/templates/*.html
htmlElement     : htmlRootElement
                | headElement
                | bodyElement
                | titleElement
                | styleElement
                | divElement
                | h1Element
                | paragraphElement
                | formElement
                | labelElement
                | textareaElement
                | buttonElement
                | anchorElement
                | inputElement
                | imgElement
                | genericElement
                ;

// ==================== DOCUMENT STRUCTURE ELEMENTS ====================
htmlRootElement : TAG_OPEN HTMLROOT_TAG attrs+=htmlAttribute* TAG_CLOSE
                  content+=htmlContent*
                  (TAG_CLOSE_SLASH HTMLROOT_TAG TAG_CLOSE)?;

headElement : TAG_OPEN HEAD_TAG attrs+=htmlAttribute* TAG_CLOSE
              content+=htmlContent*
              (TAG_CLOSE_SLASH HEAD_TAG TAG_CLOSE)?;

bodyElement : TAG_OPEN BODY_TAG attrs+=htmlAttribute* TAG_CLOSE
              content+=htmlContent*
              (TAG_CLOSE_SLASH BODY_TAG TAG_CLOSE)?;

titleElement : TAG_OPEN TITLE_TAG attrs+=htmlAttribute* TAG_CLOSE
               content+=htmlContent*
               TAG_CLOSE_SLASH TITLE_TAG TAG_CLOSE;

// ==================== STYLE ELEMENT ====================
styleElement : TAG_OPEN STYLE_TAG attrs+=htmlAttribute* TAG_CLOSE
               css=cssStylesheet
               CSS_STYLE_CLOSE;

// ==================== CONTAINER ELEMENT ====================
divElement : TAG_OPEN DIV_TAG attrs+=htmlAttribute* TAG_CLOSE
             content+=htmlContent*
             TAG_CLOSE_SLASH DIV_TAG TAG_CLOSE;

// ==================== HEADING ELEMENT ====================
h1Element : TAG_OPEN H1_TAG attrs+=htmlAttribute* TAG_CLOSE
            content+=htmlContent*
            TAG_CLOSE_SLASH H1_TAG TAG_CLOSE;

// ==================== TEXT ELEMENT ====================
paragraphElement : TAG_OPEN P_TAG attrs+=htmlAttribute* TAG_CLOSE
                   content+=htmlContent*
                   (TAG_CLOSE_SLASH P_TAG TAG_CLOSE)?;  // close tag optional in HTML5

// ==================== FORM ELEMENTS ====================
formElement : TAG_OPEN FORM_TAG attrs+=htmlAttribute* TAG_CLOSE
              content+=htmlContent*
              TAG_CLOSE_SLASH FORM_TAG TAG_CLOSE;

labelElement : TAG_OPEN LABEL_TAG attrs+=htmlAttribute* TAG_CLOSE
               content+=htmlContent*
               TAG_CLOSE_SLASH LABEL_TAG TAG_CLOSE;

textareaElement : TAG_OPEN TEXTAREA_TAG attrs+=htmlAttribute* TAG_CLOSE
                  content+=htmlContent*
                  TAG_CLOSE_SLASH TEXTAREA_TAG TAG_CLOSE;

buttonElement : TAG_OPEN BUTTON_TAG attrs+=htmlAttribute* TAG_CLOSE
                content+=htmlContent*
                TAG_CLOSE_SLASH BUTTON_TAG TAG_CLOSE;

// ==================== INTERACTIVE ELEMENT ====================
anchorElement : TAG_OPEN A_TAG attrs+=htmlAttribute* TAG_CLOSE
                content+=htmlContent*
                TAG_CLOSE_SLASH A_TAG TAG_CLOSE;

// ==================== VOID ELEMENTS (no children) ====================
inputElement : TAG_OPEN INPUT_TAG attrs+=htmlAttribute* (TAG_CLOSE | TAG_SELF_CLOSE);
imgElement   : TAG_OPEN IMG_TAG attrs+=htmlAttribute* (TAG_CLOSE | TAG_SELF_CLOSE);

// ==================== GENERIC FALLBACK ELEMENT ====================
// For unknown tags, custom elements, web components (must be last)
genericElement : TAG_OPEN name=TAG_NAME attrs+=htmlAttribute* TAG_CLOSE
                 content+=htmlContent*
                 (TAG_CLOSE_SLASH TAG_NAME TAG_CLOSE)?
               | TAG_OPEN name=TAG_NAME attrs+=htmlAttribute* TAG_SELF_CLOSE
               ;

// Content inside HTML elements (recursive)
htmlContent     : templateContent;

// ==================== HTML ATTRIBUTES ====================

// Attribute: name="value" or name='value' or name=value or name (boolean)
htmlAttribute   : name=attrName (TAG_EQUALS value=attrValue)?   # AttributeWithValue
                ;

attrName        : staticName=TAG_NAME                                 # StaticAttrName
                | TAG_EXPR_OPEN dynamicExpr=expression EXPR_CLOSE    # DynamicAttrName
                ;

// Attribute value with possible Jinja2 expressions inside
attrValue       : TAG_DQUOTE parts+=attrDqContent* ATTR_DQ_CLOSE    # DoubleQuotedValue
                | TAG_SQUOTE parts+=attrSqContent* ATTR_SQ_CLOSE    # SingleQuotedValue
                | value=TAG_UNQUOTED_VALUE                           # UnquotedValue
                | TAG_EXPR_OPEN expr=expression EXPR_CLOSE          # ExpressionValue
                ;

// Content inside double-quoted attribute value
attrDqContent   : text=ATTR_DQ_TEXT                              # AttrDqText
                | ATTR_DQ_EXPR_OPEN expr=expression EXPR_CLOSE   # AttrDqExpr
                | ATTR_DQ_STMT_OPEN stmt=forStart                # AttrDqStmt  // For dynamic content
                ;

// Content inside single-quoted attribute value
attrSqContent   : text=ATTR_SQ_TEXT                              # AttrSqText
                | ATTR_SQ_EXPR_OPEN expr=expression EXPR_CLOSE   # AttrSqExpr
                | ATTR_SQ_STMT_OPEN stmt=forStart                # AttrSqStmt
                ;

// ==================== HTML SPECIAL CONSTRUCTS ====================

// DOCTYPE declaration
htmlDoctype     : HTML_DOCTYPE;

// HTML comment
htmlCommentBlock: HTML_COMMENT;

// CDATA section
htmlCdata       : CDATA;

// Entity reference
htmlEntity      : ENTITY;

// Raw text (anything not a tag or Jinja2)
htmlText        : parts+=HTML_TEXT+;

// ==================== EXPRESSION OUTPUT {{ ... }} ====================
expressionBlock : (EXPR_OPEN | EXPR_OPEN_TRIM) expr=expression (PIPE filter)* (EXPR_CLOSE | EXPR_CLOSE_TRIM);

filter          : name=NAME (LPAREN argList? RPAREN)?;

// ==================== EXPRESSIONS (Precedence: lowest → highest) ====================

// Entry point for expressions
expression      : ternaryExpr;

// Ternary: value if condition else other  (lowest precedence)
ternaryExpr     : value=orExpr (IF condition=orExpr ELSE elseValue=orExpr)?;

// Logical OR
orExpr          : left=andExpr (OR right=andExpr)*;

// Logical AND
andExpr         : left=notExpr (AND right=notExpr)*;

// Logical NOT
notExpr         : NOT operand=notExpr                           # NotExpression
                | comparisonExpr                                # NotPassThrough
                ;

// Comparison: ==, !=, <, >, <=, >=, in, not in, is, is not
comparisonExpr  : left=additiveExpr (compOp right=additiveExpr)?           # CompareExpression
                | additiveExpr testOp                           # TestExpression
                ;

compOp          : EQ                                            # EqOp
                | NEQ                                           # NeqOp
                | LT                                            # LtOp
                | GT                                            # GtOp
                | LTE                                           # LteOp
                | GTE                                           # GteOp
                | IN                                            # InOp
                | NOT IN                                        # NotInOp
                ;

// Test operators: is defined, is not none, etc.
testOp          : IS NOT? testName (LPAREN argList? RPAREN)?;
testName        : NAME;  // defined, none, iterable, number, string, etc.

// Addition, subtraction, string concatenation (~)
additiveExpr    : multiplicativeExpr ((op+=(PLUS | MINUS | TILDE)) multiplicativeExpr)*;

// Multiplication, division, floor division, modulo
multiplicativeExpr : powerExpr ((op+=(STAR | SLASH | FLOORDIV | MOD)) powerExpr)*;

// Power (right-associative)
powerExpr       : base=unaryExpr (POW exponent=powerExpr)?;

// Unary: -x, +x
unaryExpr       : op=(MINUS | PLUS) operand=unaryExpr           # UnaryExpression
                | postfixExpr                                   # UnaryPassThrough
                ;

// ==================== POSTFIX EXPRESSIONS (Highest Precedence) ====================
// Handles: a.b, a[i], a[1:3], a()
postfixExpr     : object=primaryExpr ops+=postfixOp*;

postfixOp       : DOT name=NAME                                 # DotAccessOp
                | LBRACK index=expression RBRACK                # IndexAccessOp
                | LBRACK start=expression? COLON stop=expression? (COLON step=expression?)? RBRACK  # SliceAccessOp
                | LPAREN args=argList? RPAREN                   # CallOp
                ;

// ==================== PRIMARY EXPRESSIONS (Atoms) ====================
primaryExpr     : NUMBER                                        # NumberLiteral
                | STRING                                        # StringLiteral
                | TRUE                                          # TrueLiteral
                | FALSE                                         # FalseLiteral
                | NONE                                          # NoneLiteral
                | NAME                                          # VariableExpr
                | list                                          # ListExpr
                | dict                                          # DictExpr
                | LPAREN expression RPAREN                      # ParenExpr
                ;

// ==================== DATA STRUCTURES ====================

// List literal: [1, 2, 3] or [1, 2, 3,] (trailing comma allowed)
list            : LBRACK (elements+=expression (COMMA elements+=expression)* COMMA?)? RBRACK;

// Dictionary literal: {"key": value} or {key: value}
dict            : LBRACE (dictEntry (COMMA dictEntry)* COMMA?)? RBRACE;
dictEntry       : key=expression COLON value=expression;

// Argument list (positional and keyword)
argList         : argument (COMMA argument)*;
argument        : (name=NAME ASSIGN)? value=expression;

// ==================== FOR LOOP {% for ... %} ====================
forBlock        : forStart body+=templateContent* elseForBranch? forEnd;

forStart        : (STMT_OPEN | STMT_OPEN_TRIM) FOR target=forTarget IN iterable=expression
                  (IF condition=expression)? (STMT_CLOSE | STMT_CLOSE_TRIM);

// For target can be single name or tuple unpacking
forTarget       : NAME                                          # SingleTarget
                | NAME (COMMA NAME)+                            # TupleTarget
                ;

elseForBranch   : (STMT_OPEN | STMT_OPEN_TRIM) ELSE (STMT_CLOSE | STMT_CLOSE_TRIM) body+=templateContent*;

forEnd          : (STMT_OPEN | STMT_OPEN_TRIM) ENDFOR (STMT_CLOSE | STMT_CLOSE_TRIM);

// ==================== IF STATEMENT {% if ... %} ====================
ifBlock         : ifStart body+=templateContent* elifBranch* elseBranch? ifEnd;

ifStart         : (STMT_OPEN | STMT_OPEN_TRIM) IF condition=expression (STMT_CLOSE | STMT_CLOSE_TRIM);

elifBranch      : (STMT_OPEN | STMT_OPEN_TRIM) ELIF condition=expression (STMT_CLOSE | STMT_CLOSE_TRIM) body+=templateContent*;

elseBranch      : (STMT_OPEN | STMT_OPEN_TRIM) ELSE (STMT_CLOSE | STMT_CLOSE_TRIM) body+=templateContent*;

ifEnd           : (STMT_OPEN | STMT_OPEN_TRIM) ENDIF (STMT_CLOSE | STMT_CLOSE_TRIM);

// ==================== TEMPLATE INHERITANCE ====================
extendsStatement: (STMT_OPEN | STMT_OPEN_TRIM) EXTENDS templateName=STRING (STMT_CLOSE | STMT_CLOSE_TRIM);

includeStatement: (STMT_OPEN | STMT_OPEN_TRIM) INCLUDE templateName=STRING
                  (ignoreMissing=IGNORE MISSING)?
                  (contextMode=(WITH | WITHOUT) CONTEXT)?
                  (STMT_CLOSE | STMT_CLOSE_TRIM);

blockDefinition : (STMT_OPEN | STMT_OPEN_TRIM) BLOCK name=NAME scoped=SCOPED? (STMT_CLOSE | STMT_CLOSE_TRIM)
                  body+=templateContent*
                  (STMT_OPEN | STMT_OPEN_TRIM) ENDBLOCK NAME? (STMT_CLOSE | STMT_CLOSE_TRIM);

// ==================== SET STATEMENT ====================
setTarget       : name=NAME                                     # SimpleTarget
                | first=NAME (COMMA rest+=NAME)+                # TupleSetTarget
                | namespace=NAME (DOT attributes+=NAME)+        # NamespaceTarget
                ;

setStatement    : (STMT_OPEN | STMT_OPEN_TRIM) SET setTarget ASSIGN value=expression
                  (PIPE filter)* (STMT_CLOSE | STMT_CLOSE_TRIM);

setBlockStatement: (STMT_OPEN | STMT_OPEN_TRIM) SET name=NAME (STMT_CLOSE | STMT_CLOSE_TRIM)
                   body+=templateContent*
                   (STMT_OPEN | STMT_OPEN_TRIM) ENDSET (STMT_CLOSE | STMT_CLOSE_TRIM);

// ==================== MACRO STATEMENT ====================
macroStatement  : (STMT_OPEN | STMT_OPEN_TRIM) MACRO name=NAME LPAREN params=macroParams? RPAREN (STMT_CLOSE | STMT_CLOSE_TRIM)
                  body+=templateContent*
                  (STMT_OPEN | STMT_OPEN_TRIM) ENDMACRO (STMT_CLOSE | STMT_CLOSE_TRIM);

macroParams     : macroParam (COMMA macroParam)*;
macroParam      : name=NAME (ASSIGN defaultValue=expression)?;

// ==================== CALL BLOCK ====================
callBlock       : (STMT_OPEN | STMT_OPEN_TRIM) CALL (LPAREN callArgs=argList? RPAREN)? callee=expression (STMT_CLOSE | STMT_CLOSE_TRIM)
                  body+=templateContent*
                  (STMT_OPEN | STMT_OPEN_TRIM) ENDCALL (STMT_CLOSE | STMT_CLOSE_TRIM);

// ==================== IMPORT STATEMENTS ====================
importStatement : (STMT_OPEN | STMT_OPEN_TRIM) IMPORT templateName=STRING AS alias=NAME
                  (contextMode=(WITH | WITHOUT) CONTEXT)?
                  (STMT_CLOSE | STMT_CLOSE_TRIM);

fromImportStatement: (STMT_OPEN | STMT_OPEN_TRIM) FROM templateName=STRING IMPORT imports=importList
                     (contextMode=(WITH | WITHOUT) CONTEXT)?
                     (STMT_CLOSE | STMT_CLOSE_TRIM);

importList      : importItem (COMMA importItem)*;
importItem      : name=NAME (AS alias=NAME)?;

// ==================== WITH BLOCK ====================
withBlock       : (STMT_OPEN | STMT_OPEN_TRIM) WITH assignments (STMT_CLOSE | STMT_CLOSE_TRIM)
                  body+=templateContent*
                  (STMT_OPEN | STMT_OPEN_TRIM) ENDWITH (STMT_CLOSE | STMT_CLOSE_TRIM);

assignments     : withAssignment (COMMA withAssignment)*;
withAssignment  : name=NAME ASSIGN value=expression;

// ==================== FILTER BLOCK ====================
filterBlock     : (STMT_OPEN | STMT_OPEN_TRIM) FILTER filterName=NAME (LPAREN args=argList? RPAREN)? (STMT_CLOSE | STMT_CLOSE_TRIM)
                  body+=templateContent*
                  (STMT_OPEN | STMT_OPEN_TRIM) ENDFILTER (STMT_CLOSE | STMT_CLOSE_TRIM);

// ==================== DO STATEMENT ====================
doStatement     : (STMT_OPEN | STMT_OPEN_TRIM) DO expr=expression (STMT_CLOSE | STMT_CLOSE_TRIM);

// ==================== AUTOESCAPE BLOCK ====================
autoescapeBlock : (STMT_OPEN | STMT_OPEN_TRIM) AUTOESCAPE escapeMode=(TRUE | FALSE | STRING) (STMT_CLOSE | STMT_CLOSE_TRIM)
                  body+=templateContent*
                  (STMT_OPEN | STMT_OPEN_TRIM) ENDAUTOESCAPE (STMT_CLOSE | STMT_CLOSE_TRIM);

// ==================== CSS RULES (inside <style> tags) ====================
cssStylesheet   : cssRule*;

cssRule         : selectors+=cssSelector (CSS_COMMA selectors+=cssSelector)* CSS_LBRACE declarations+=cssDeclaration* CSS_RBRACE;

// ==================== CSS SELECTORS ====================
cssSelector     : cssElementSelector                             # ElementSelector
                | cssClassSelector                               # ClassSelector
                | cssElementSelector cssPseudoClass              # ElementPseudoSelector
                | cssClassSelector cssPseudoClass                # ClassPseudoSelector
                | cssDescendantSelector                          # DescendantSelector
                | cssElementSelector cssClassSelector            # ElementClassSelector
                ;

// Element selectors (matching the 15 HTML elements)
cssElementSelector : CSS_BODY_SEL
                   | CSS_H1_SEL
                   | CSS_P_SEL
                   | CSS_DIV_SEL
                   | CSS_FORM_SEL
                   | CSS_LABEL_SEL
                   | CSS_INPUT_SEL
                   | CSS_TEXTAREA_SEL
                   | CSS_BUTTON_SEL
                   | CSS_A_SEL
                   | CSS_IMG_SEL
                   ;

// Class selector - SPECIAL: Create ClassSelectorNode in AST
// className can be CSS_IDENT or any element selector token (e.g., .button, .form, .input)
cssClassSelector : CSS_DOT className=cssClassName;

cssClassName : CSS_IDENT
             | CSS_BUTTON_SEL | CSS_FORM_SEL | CSS_INPUT_SEL | CSS_LABEL_SEL
             | CSS_TEXTAREA_SEL | CSS_DIV_SEL | CSS_BODY_SEL | CSS_A_SEL
             | CSS_H1_SEL | CSS_P_SEL | CSS_IMG_SEL
             ;

// Pseudo-class selector
cssPseudoClass  : CSS_HOVER | CSS_FOCUS | CSS_ACTIVE | CSS_DISABLED | CSS_FIRST_CHILD | CSS_LAST_CHILD;

// Descendant combinator (e.g., ".product-card img", "div p")
cssDescendantSelector : ancestor=cssSelectorSimple descendant+=cssSelectorSimple+;

// Simple selector (for descendant combinators)
cssSelectorSimple : cssElementSelector # CssSimpleElement
                  | cssClassSelector   # CssSimpleClass
                  ;

// ==================== CSS DECLARATIONS ====================
cssDeclaration  : singleLengthDecl       # CssSingleLengthDecl
                | multipleLengthDecl     # CssMultipleLengthDecl
                | colorDecl              # CssColorDecl
                | keywordDecl            # CssKeywordDecl
                | boxShadowDecl          # CssBoxShadowDecl
                | borderDecl             # CssBorderDecl
                | transitionDecl         # CssTransitionDecl
                | transformDecl          # CssTransformDecl
                | backgroundDecl         # CssBackgroundDecl
                | fontFamilyDecl         # CssFontFamilyDecl
                | fontWeightDecl         # CssFontWeightDecl
                | boxSizingDecl          # CssBoxSizingDecl
                | outlineDecl            # CssOutlineDecl
                ;

// GROUP 1: Single Length Properties
singleLengthDecl : singleLengthProp CSS_COLON value=cssLength CSS_SEMI?;

singleLengthProp : CSS_FONT_SIZE | CSS_LETTER_SPACING | CSS_LINE_HEIGHT
                 | CSS_MARGIN_TOP | CSS_MARGIN_BOTTOM
                 | CSS_WIDTH | CSS_HEIGHT | CSS_MAX_WIDTH | CSS_MAX_HEIGHT | CSS_MIN_HEIGHT
                 | CSS_GAP | CSS_BORDER_RADIUS
                 ;

// GROUP 2: Multiple Length Properties
// Margin/Padding can accept 1-4 values (margin can also use 'auto')
multipleLengthDecl : multiLengthProp CSS_COLON values+=cssMultiLengthValue (values+=cssMultiLengthValue)* CSS_SEMI?;

multiLengthProp : CSS_MARGIN | CSS_PADDING;

cssMultiLengthValue : cssLength | CSS_AUTO;

// GROUP 3: Color Properties
colorDecl : colorProp CSS_COLON value=cssColorValue CSS_SEMI?;

colorProp : CSS_COLOR | CSS_BACKGROUND_COLOR | CSS_BORDER_COLOR;

cssColorValue : cssColor    # CssColorLiteral
              | cssKeyword  # CssColorKeyword
              ;

// GROUP 4: Keyword-Only Properties
keywordDecl : keywordProp CSS_COLON value=cssKeyword CSS_SEMI?;

keywordProp : CSS_DISPLAY | CSS_TEXT_ALIGN | CSS_TEXT_DECORATION | CSS_TEXT_TRANSFORM
            | CSS_FLEX_WRAP | CSS_JUSTIFY_CONTENT | CSS_ALIGN_ITEMS | CSS_OVERFLOW
            | CSS_CURSOR | CSS_RESIZE | CSS_OBJECT_FIT
            ;

// GROUP 5: Box Shadow
// Syntax: offset-x offset-y blur? spread? color
boxShadowDecl : CSS_BOX_SHADOW CSS_COLON shadows+=boxShadowValue (CSS_COMMA shadows+=boxShadowValue)* CSS_SEMI?;

boxShadowValue : offsetX=cssLength offsetY=cssLength blur=cssLength? spread=cssLength? color=cssColorOrFunction;

cssColorOrFunction : cssColor     # CssColorOrFuncColor
                   | cssFunction  # CssColorOrFuncFunc
                   ;

// GROUP 6: Border Shorthand
// Supports both full shorthand (border: 1px solid #d1d5db) and keyword-only (border: none)
borderDecl : borderProp CSS_COLON (keyword=cssKeyword | width=cssLength style=cssKeyword color=cssColorValue) CSS_SEMI?;

borderProp : CSS_BORDER | CSS_BORDER_TOP;

// GROUP 7: Transition
// Property can be an ident (like "all") or a CSS property keyword (like "color", "background")
transitionDecl : CSS_TRANSITION CSS_COLON property=cssTransitionProperty duration=cssTime easing=cssKeyword CSS_SEMI?;

cssTransitionProperty : cssIdent | CSS_COLOR | CSS_BACKGROUND | CSS_TRANSFORM | CSS_BORDER_COLOR;

// GROUP 8: Transform
transformDecl : CSS_TRANSFORM CSS_COLON value=cssTransformFunction CSS_SEMI?;

// GROUP 9: Background
backgroundDecl : CSS_BACKGROUND CSS_COLON value=cssBackgroundValue CSS_SEMI?;

cssBackgroundValue : cssColor    # CssBgColor
                   | cssKeyword  # CssBgKeyword
                   | cssFunction # CssBgFunction
                   ;

// GROUP 10: Font Family
// Allow multiple idents for font names like "Segoe UI" (two separate tokens: Segoe and UI)
// Also allow keywords like 'inherit' which are valid font-family values
fontFamilyDecl : CSS_FONT_FAMILY CSS_COLON fonts+=cssFontName (CSS_COMMA fonts+=cssFontName)* CSS_SEMI?;

cssFontName : cssFontToken+;  // One or more tokens to handle multi-word font names

// Font tokens can be identifiers OR keywords (inherit, sans-serif is often used)
cssFontToken : CSS_IDENT | CSS_INHERIT | CSS_AUTO | CSS_NONE;

// GROUP 11: Font Weight
fontWeightDecl : CSS_FONT_WEIGHT CSS_COLON value=cssFontWeightValue CSS_SEMI?;

cssFontWeightValue : cssNumber  # CssFontWeightNum
                   | cssKeyword # CssFontWeightKeyword
                   ;

// GROUP 12: Box Sizing
boxSizingDecl : CSS_BOX_SIZING CSS_COLON value=cssKeyword CSS_SEMI?;

// GROUP 13: Outline
outlineDecl : CSS_OUTLINE CSS_COLON value=cssOutlineValue CSS_SEMI?;

cssOutlineValue : cssKeyword   # CssOutlineKeyword
                | outlineValue # CssOutlineFull
                ;

outlineValue : width=cssLength style=cssKeyword color=cssColorValue;

// ==================== CSS VALUES ====================
// CSS length - allow unitless 0 (valid in CSS: margin: 0, padding: 0 0, etc.)
cssLength       : CSS_PX | CSS_PERCENT | CSS_EM | CSS_VH | CSS_NUMBER;

cssColor        : CSS_HEX_COLOR | CSS_WHITE;

cssKeyword      : CSS_FLEX | CSS_BLOCK | CSS_INLINE_BLOCK | CSS_NONE | CSS_CENTER | CSS_AUTO
                | CSS_UPPERCASE | CSS_INHERIT | CSS_POINTER | CSS_VERTICAL | CSS_CONTAIN
                | CSS_EASE | CSS_HIDDEN | CSS_WRAP | CSS_SOLID
                | CSS_BORDER_BOX | CSS_CONTENT_BOX
                ;

cssNumber       : CSS_NUMBER;

cssTime         : CSS_TIME;

cssIdent        : CSS_IDENT;

cssFunction     : cssRgbaFunction      # CssRgbaFunc
                | cssTransformFunction # CssTransformFunc
                ;

cssRgbaFunction : CSS_RGBA CSS_LPAREN r=CSS_NUMBER CSS_COMMA g=CSS_NUMBER CSS_COMMA b=CSS_NUMBER CSS_COMMA a=CSS_NUMBER CSS_RPAREN;

cssTransformFunction : CSS_TRANSLATEY CSS_LPAREN value=cssValue CSS_RPAREN;

// Generic CSS value (for use in functions like translateY)
cssValue        : cssLength    # CssValueLength
                | cssColor     # CssValueColor
                | cssKeyword   # CssValueKeyword
                | cssNumber    # CssValueNumber
                | cssFunction  # CssValueFunction
                | cssIdent     # CssValueIdent
                | cssTime      # CssValueTime
                ;
