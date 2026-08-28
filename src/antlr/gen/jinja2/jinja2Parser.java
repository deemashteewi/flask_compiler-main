// Generated from C:/Users/HP/IdeaProjects/antlr_course/grammars/jinja2Parser.g4 by ANTLR 4.13.2

   package antlr.gen.jinja2;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class jinja2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STMT_OPEN_TRIM=1, EXPR_OPEN_TRIM=2, STMT_OPEN=3, EXPR_OPEN=4, COMMENT_OPEN=5, 
		HTML_DOCTYPE=6, HTML_COMMENT=7, CDATA=8, TAG_CLOSE_SLASH=9, TAG_OPEN=10, 
		ENTITY=11, HTML_TEXT=12, TAG_STMT_OPEN=13, TAG_EXPR_OPEN=14, TAG_SELF_CLOSE=15, 
		TAG_CLOSE=16, TAG_DQUOTE=17, TAG_SQUOTE=18, TAG_EQUALS=19, HTMLROOT_TAG=20, 
		HEAD_TAG=21, BODY_TAG=22, TITLE_TAG=23, STYLE_TAG=24, DIV_TAG=25, H1_TAG=26, 
		P_TAG=27, FORM_TAG=28, LABEL_TAG=29, TEXTAREA_TAG=30, BUTTON_TAG=31, A_TAG=32, 
		INPUT_TAG=33, IMG_TAG=34, TAG_NAME=35, TAG_UNQUOTED_VALUE=36, TAG_WS=37, 
		STYLE_WS=38, ATTR_DQ_STMT_OPEN=39, ATTR_DQ_EXPR_OPEN=40, ATTR_DQ_CLOSE=41, 
		ATTR_DQ_TEXT=42, ATTR_SQ_STMT_OPEN=43, ATTR_SQ_EXPR_OPEN=44, ATTR_SQ_CLOSE=45, 
		ATTR_SQ_TEXT=46, CSS_STMT_OPEN=47, CSS_EXPR_OPEN=48, CSS_STYLE_CLOSE=49, 
		CSS_BODY_SEL=50, CSS_H1_SEL=51, CSS_P_SEL=52, CSS_DIV_SEL=53, CSS_FORM_SEL=54, 
		CSS_LABEL_SEL=55, CSS_INPUT_SEL=56, CSS_TEXTAREA_SEL=57, CSS_BUTTON_SEL=58, 
		CSS_A_SEL=59, CSS_IMG_SEL=60, CSS_HOVER=61, CSS_FOCUS=62, CSS_ACTIVE=63, 
		CSS_DISABLED=64, CSS_FIRST_CHILD=65, CSS_LAST_CHILD=66, CSS_FONT_FAMILY=67, 
		CSS_FONT_SIZE=68, CSS_FONT_WEIGHT=69, CSS_LETTER_SPACING=70, CSS_TEXT_ALIGN=71, 
		CSS_TEXT_DECORATION=72, CSS_TEXT_TRANSFORM=73, CSS_LINE_HEIGHT=74, CSS_MARGIN=75, 
		CSS_MARGIN_TOP=76, CSS_MARGIN_BOTTOM=77, CSS_PADDING=78, CSS_WIDTH=79, 
		CSS_HEIGHT=80, CSS_MAX_WIDTH=81, CSS_MAX_HEIGHT=82, CSS_MIN_HEIGHT=83, 
		CSS_BOX_SIZING=84, CSS_COLOR=85, CSS_BACKGROUND=86, CSS_BACKGROUND_COLOR=87, 
		CSS_BORDER=88, CSS_BORDER_RADIUS=89, CSS_BORDER_TOP=90, CSS_BORDER_COLOR=91, 
		CSS_BOX_SHADOW=92, CSS_DISPLAY=93, CSS_FLEX_WRAP=94, CSS_JUSTIFY_CONTENT=95, 
		CSS_ALIGN_ITEMS=96, CSS_GAP=97, CSS_OVERFLOW=98, CSS_CURSOR=99, CSS_TRANSITION=100, 
		CSS_OUTLINE=101, CSS_RESIZE=102, CSS_TRANSFORM=103, CSS_OBJECT_FIT=104, 
		CSS_FLEX=105, CSS_BLOCK=106, CSS_INLINE_BLOCK=107, CSS_NONE=108, CSS_CENTER=109, 
		CSS_AUTO=110, CSS_UPPERCASE=111, CSS_INHERIT=112, CSS_POINTER=113, CSS_VERTICAL=114, 
		CSS_CONTAIN=115, CSS_EASE=116, CSS_HIDDEN=117, CSS_WRAP=118, CSS_SOLID=119, 
		CSS_BORDER_BOX=120, CSS_CONTENT_BOX=121, CSS_WHITE=122, CSS_RGBA=123, 
		CSS_TRANSLATEY=124, CSS_VH=125, CSS_EM=126, CSS_PERCENT=127, CSS_PX=128, 
		CSS_TIME=129, CSS_HEX_COLOR=130, CSS_NUMBER=131, CSS_IDENT=132, CSS_LBRACE=133, 
		CSS_RBRACE=134, CSS_LPAREN=135, CSS_RPAREN=136, CSS_SEMI=137, CSS_COLON=138, 
		CSS_COMMA=139, CSS_DOT=140, CSS_WS=141, STMT_CLOSE_TRIM=142, STMT_CLOSE=143, 
		FOR=144, ENDFOR=145, IF=146, ELIF=147, ELSE=148, ENDIF=149, BLOCK=150, 
		ENDBLOCK=151, EXTENDS=152, INCLUDE=153, SET=154, ENDSET=155, WITH=156, 
		ENDWITH=157, MACRO=158, ENDMACRO=159, CALL=160, ENDCALL=161, IMPORT=162, 
		FROM=163, AS=164, FILTER=165, ENDFILTER=166, RAW=167, ENDRAW=168, DO=169, 
		AUTOESCAPE=170, ENDAUTOESCAPE=171, IGNORE=172, MISSING=173, CONTEXT=174, 
		WITHOUT=175, SCOPED=176, AND=177, OR=178, NOT=179, IN=180, IS=181, EQ=182, 
		NEQ=183, LTE=184, GTE=185, LT=186, GT=187, POW=188, PLUS=189, MINUS=190, 
		STAR=191, SLASH=192, FLOORDIV=193, MOD=194, TILDE=195, DOT=196, COMMA=197, 
		COLON=198, PIPE=199, ASSIGN=200, LPAREN=201, RPAREN=202, LBRACK=203, RBRACK=204, 
		LBRACE=205, RBRACE=206, TRUE=207, FALSE=208, NONE=209, STRING=210, NUMBER=211, 
		NAME=212, STMT_WS=213, EXPR_CLOSE_TRIM=214, EXPR_CLOSE=215, EXPR_WS=216, 
		COMMENT_CLOSE=217, COMMENT_TEXT=218;
	public static final int
		RULE_template = 0, RULE_templateContent = 1, RULE_htmlElement = 2, RULE_htmlRootElement = 3, 
		RULE_headElement = 4, RULE_bodyElement = 5, RULE_titleElement = 6, RULE_styleElement = 7, 
		RULE_divElement = 8, RULE_h1Element = 9, RULE_paragraphElement = 10, RULE_formElement = 11, 
		RULE_labelElement = 12, RULE_textareaElement = 13, RULE_buttonElement = 14, 
		RULE_anchorElement = 15, RULE_inputElement = 16, RULE_imgElement = 17, 
		RULE_genericElement = 18, RULE_htmlContent = 19, RULE_htmlAttribute = 20, 
		RULE_attrName = 21, RULE_attrValue = 22, RULE_attrDqContent = 23, RULE_attrSqContent = 24, 
		RULE_htmlDoctype = 25, RULE_htmlCommentBlock = 26, RULE_htmlCdata = 27, 
		RULE_htmlEntity = 28, RULE_htmlText = 29, RULE_expressionBlock = 30, RULE_filter = 31, 
		RULE_expression = 32, RULE_ternaryExpr = 33, RULE_orExpr = 34, RULE_andExpr = 35, 
		RULE_notExpr = 36, RULE_comparisonExpr = 37, RULE_compOp = 38, RULE_testOp = 39, 
		RULE_testName = 40, RULE_additiveExpr = 41, RULE_multiplicativeExpr = 42, 
		RULE_powerExpr = 43, RULE_unaryExpr = 44, RULE_postfixExpr = 45, RULE_postfixOp = 46, 
		RULE_primaryExpr = 47, RULE_list = 48, RULE_dict = 49, RULE_dictEntry = 50, 
		RULE_argList = 51, RULE_argument = 52, RULE_forBlock = 53, RULE_forStart = 54, 
		RULE_forTarget = 55, RULE_elseForBranch = 56, RULE_forEnd = 57, RULE_ifBlock = 58, 
		RULE_ifStart = 59, RULE_elifBranch = 60, RULE_elseBranch = 61, RULE_ifEnd = 62, 
		RULE_extendsStatement = 63, RULE_includeStatement = 64, RULE_blockDefinition = 65, 
		RULE_setTarget = 66, RULE_setStatement = 67, RULE_setBlockStatement = 68, 
		RULE_macroStatement = 69, RULE_macroParams = 70, RULE_macroParam = 71, 
		RULE_callBlock = 72, RULE_importStatement = 73, RULE_fromImportStatement = 74, 
		RULE_importList = 75, RULE_importItem = 76, RULE_withBlock = 77, RULE_assignments = 78, 
		RULE_withAssignment = 79, RULE_filterBlock = 80, RULE_doStatement = 81, 
		RULE_autoescapeBlock = 82, RULE_cssStylesheet = 83, RULE_cssRule = 84, 
		RULE_cssSelector = 85, RULE_cssElementSelector = 86, RULE_cssClassSelector = 87, 
		RULE_cssClassName = 88, RULE_cssPseudoClass = 89, RULE_cssDescendantSelector = 90, 
		RULE_cssSelectorSimple = 91, RULE_cssDeclaration = 92, RULE_singleLengthDecl = 93, 
		RULE_singleLengthProp = 94, RULE_multipleLengthDecl = 95, RULE_multiLengthProp = 96, 
		RULE_cssMultiLengthValue = 97, RULE_colorDecl = 98, RULE_colorProp = 99, 
		RULE_cssColorValue = 100, RULE_keywordDecl = 101, RULE_keywordProp = 102, 
		RULE_boxShadowDecl = 103, RULE_boxShadowValue = 104, RULE_cssColorOrFunction = 105, 
		RULE_borderDecl = 106, RULE_borderProp = 107, RULE_transitionDecl = 108, 
		RULE_cssTransitionProperty = 109, RULE_transformDecl = 110, RULE_backgroundDecl = 111, 
		RULE_cssBackgroundValue = 112, RULE_fontFamilyDecl = 113, RULE_cssFontName = 114, 
		RULE_cssFontToken = 115, RULE_fontWeightDecl = 116, RULE_cssFontWeightValue = 117, 
		RULE_boxSizingDecl = 118, RULE_outlineDecl = 119, RULE_cssOutlineValue = 120, 
		RULE_outlineValue = 121, RULE_cssLength = 122, RULE_cssColor = 123, RULE_cssKeyword = 124, 
		RULE_cssNumber = 125, RULE_cssTime = 126, RULE_cssIdent = 127, RULE_cssFunction = 128, 
		RULE_cssRgbaFunction = 129, RULE_cssTransformFunction = 130, RULE_cssValue = 131;
	private static String[] makeRuleNames() {
		return new String[] {
			"template", "templateContent", "htmlElement", "htmlRootElement", "headElement", 
			"bodyElement", "titleElement", "styleElement", "divElement", "h1Element", 
			"paragraphElement", "formElement", "labelElement", "textareaElement", 
			"buttonElement", "anchorElement", "inputElement", "imgElement", "genericElement", 
			"htmlContent", "htmlAttribute", "attrName", "attrValue", "attrDqContent", 
			"attrSqContent", "htmlDoctype", "htmlCommentBlock", "htmlCdata", "htmlEntity", 
			"htmlText", "expressionBlock", "filter", "expression", "ternaryExpr", 
			"orExpr", "andExpr", "notExpr", "comparisonExpr", "compOp", "testOp", 
			"testName", "additiveExpr", "multiplicativeExpr", "powerExpr", "unaryExpr", 
			"postfixExpr", "postfixOp", "primaryExpr", "list", "dict", "dictEntry", 
			"argList", "argument", "forBlock", "forStart", "forTarget", "elseForBranch", 
			"forEnd", "ifBlock", "ifStart", "elifBranch", "elseBranch", "ifEnd", 
			"extendsStatement", "includeStatement", "blockDefinition", "setTarget", 
			"setStatement", "setBlockStatement", "macroStatement", "macroParams", 
			"macroParam", "callBlock", "importStatement", "fromImportStatement", 
			"importList", "importItem", "withBlock", "assignments", "withAssignment", 
			"filterBlock", "doStatement", "autoescapeBlock", "cssStylesheet", "cssRule", 
			"cssSelector", "cssElementSelector", "cssClassSelector", "cssClassName", 
			"cssPseudoClass", "cssDescendantSelector", "cssSelectorSimple", "cssDeclaration", 
			"singleLengthDecl", "singleLengthProp", "multipleLengthDecl", "multiLengthProp", 
			"cssMultiLengthValue", "colorDecl", "colorProp", "cssColorValue", "keywordDecl", 
			"keywordProp", "boxShadowDecl", "boxShadowValue", "cssColorOrFunction", 
			"borderDecl", "borderProp", "transitionDecl", "cssTransitionProperty", 
			"transformDecl", "backgroundDecl", "cssBackgroundValue", "fontFamilyDecl", 
			"cssFontName", "cssFontToken", "fontWeightDecl", "cssFontWeightValue", 
			"boxSizingDecl", "outlineDecl", "cssOutlineValue", "outlineValue", "cssLength", 
			"cssColor", "cssKeyword", "cssNumber", "cssTime", "cssIdent", "cssFunction", 
			"cssRgbaFunction", "cssTransformFunction", "cssValue"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{%-'", "'{{-'", null, null, "'{#'", null, null, null, "'</'", 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "'body'", "'h1'", "'p'", "'div'", "'form'", "'label'", 
			"'input'", "'textarea'", "'button'", "'a'", "'img'", null, null, null, 
			null, null, null, "'font-family'", "'font-size'", "'font-weight'", "'letter-spacing'", 
			"'text-align'", "'text-decoration'", "'text-transform'", "'line-height'", 
			"'margin'", "'margin-top'", "'margin-bottom'", "'padding'", "'width'", 
			"'height'", "'max-width'", "'max-height'", "'min-height'", "'box-sizing'", 
			"'color'", "'background'", "'background-color'", "'border'", "'border-radius'", 
			"'border-top'", "'border-color'", "'box-shadow'", "'display'", "'flex-wrap'", 
			"'justify-content'", "'align-items'", "'gap'", "'overflow'", "'cursor'", 
			"'transition'", "'outline'", "'resize'", "'transform'", "'object-fit'", 
			"'flex'", null, "'inline-block'", "'none'", "'center'", "'auto'", "'uppercase'", 
			"'inherit'", "'pointer'", "'vertical'", "'contain'", "'ease'", "'hidden'", 
			"'wrap'", "'solid'", "'border-box'", "'content-box'", "'white'", "'rgba'", 
			"'translateY'", null, null, null, null, null, null, null, null, null, 
			null, null, null, "';'", null, null, null, null, "'-%}'", "'%}'", "'for'", 
			"'endfor'", null, "'elif'", null, "'endif'", null, "'endblock'", "'extends'", 
			"'include'", "'set'", "'endset'", "'with'", "'endwith'", "'macro'", "'endmacro'", 
			"'call'", "'endcall'", "'import'", "'from'", "'as'", "'filter'", "'endfilter'", 
			"'raw'", "'endraw'", "'do'", "'autoescape'", "'endautoescape'", "'ignore'", 
			"'missing'", "'context'", "'without'", "'scoped'", null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "'-}}'", 
			"'}}'", null, "'#}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "STMT_OPEN_TRIM", "EXPR_OPEN_TRIM", "STMT_OPEN", "EXPR_OPEN", "COMMENT_OPEN", 
			"HTML_DOCTYPE", "HTML_COMMENT", "CDATA", "TAG_CLOSE_SLASH", "TAG_OPEN", 
			"ENTITY", "HTML_TEXT", "TAG_STMT_OPEN", "TAG_EXPR_OPEN", "TAG_SELF_CLOSE", 
			"TAG_CLOSE", "TAG_DQUOTE", "TAG_SQUOTE", "TAG_EQUALS", "HTMLROOT_TAG", 
			"HEAD_TAG", "BODY_TAG", "TITLE_TAG", "STYLE_TAG", "DIV_TAG", "H1_TAG", 
			"P_TAG", "FORM_TAG", "LABEL_TAG", "TEXTAREA_TAG", "BUTTON_TAG", "A_TAG", 
			"INPUT_TAG", "IMG_TAG", "TAG_NAME", "TAG_UNQUOTED_VALUE", "TAG_WS", "STYLE_WS", 
			"ATTR_DQ_STMT_OPEN", "ATTR_DQ_EXPR_OPEN", "ATTR_DQ_CLOSE", "ATTR_DQ_TEXT", 
			"ATTR_SQ_STMT_OPEN", "ATTR_SQ_EXPR_OPEN", "ATTR_SQ_CLOSE", "ATTR_SQ_TEXT", 
			"CSS_STMT_OPEN", "CSS_EXPR_OPEN", "CSS_STYLE_CLOSE", "CSS_BODY_SEL", 
			"CSS_H1_SEL", "CSS_P_SEL", "CSS_DIV_SEL", "CSS_FORM_SEL", "CSS_LABEL_SEL", 
			"CSS_INPUT_SEL", "CSS_TEXTAREA_SEL", "CSS_BUTTON_SEL", "CSS_A_SEL", "CSS_IMG_SEL", 
			"CSS_HOVER", "CSS_FOCUS", "CSS_ACTIVE", "CSS_DISABLED", "CSS_FIRST_CHILD", 
			"CSS_LAST_CHILD", "CSS_FONT_FAMILY", "CSS_FONT_SIZE", "CSS_FONT_WEIGHT", 
			"CSS_LETTER_SPACING", "CSS_TEXT_ALIGN", "CSS_TEXT_DECORATION", "CSS_TEXT_TRANSFORM", 
			"CSS_LINE_HEIGHT", "CSS_MARGIN", "CSS_MARGIN_TOP", "CSS_MARGIN_BOTTOM", 
			"CSS_PADDING", "CSS_WIDTH", "CSS_HEIGHT", "CSS_MAX_WIDTH", "CSS_MAX_HEIGHT", 
			"CSS_MIN_HEIGHT", "CSS_BOX_SIZING", "CSS_COLOR", "CSS_BACKGROUND", "CSS_BACKGROUND_COLOR", 
			"CSS_BORDER", "CSS_BORDER_RADIUS", "CSS_BORDER_TOP", "CSS_BORDER_COLOR", 
			"CSS_BOX_SHADOW", "CSS_DISPLAY", "CSS_FLEX_WRAP", "CSS_JUSTIFY_CONTENT", 
			"CSS_ALIGN_ITEMS", "CSS_GAP", "CSS_OVERFLOW", "CSS_CURSOR", "CSS_TRANSITION", 
			"CSS_OUTLINE", "CSS_RESIZE", "CSS_TRANSFORM", "CSS_OBJECT_FIT", "CSS_FLEX", 
			"CSS_BLOCK", "CSS_INLINE_BLOCK", "CSS_NONE", "CSS_CENTER", "CSS_AUTO", 
			"CSS_UPPERCASE", "CSS_INHERIT", "CSS_POINTER", "CSS_VERTICAL", "CSS_CONTAIN", 
			"CSS_EASE", "CSS_HIDDEN", "CSS_WRAP", "CSS_SOLID", "CSS_BORDER_BOX", 
			"CSS_CONTENT_BOX", "CSS_WHITE", "CSS_RGBA", "CSS_TRANSLATEY", "CSS_VH", 
			"CSS_EM", "CSS_PERCENT", "CSS_PX", "CSS_TIME", "CSS_HEX_COLOR", "CSS_NUMBER", 
			"CSS_IDENT", "CSS_LBRACE", "CSS_RBRACE", "CSS_LPAREN", "CSS_RPAREN", 
			"CSS_SEMI", "CSS_COLON", "CSS_COMMA", "CSS_DOT", "CSS_WS", "STMT_CLOSE_TRIM", 
			"STMT_CLOSE", "FOR", "ENDFOR", "IF", "ELIF", "ELSE", "ENDIF", "BLOCK", 
			"ENDBLOCK", "EXTENDS", "INCLUDE", "SET", "ENDSET", "WITH", "ENDWITH", 
			"MACRO", "ENDMACRO", "CALL", "ENDCALL", "IMPORT", "FROM", "AS", "FILTER", 
			"ENDFILTER", "RAW", "ENDRAW", "DO", "AUTOESCAPE", "ENDAUTOESCAPE", "IGNORE", 
			"MISSING", "CONTEXT", "WITHOUT", "SCOPED", "AND", "OR", "NOT", "IN", 
			"IS", "EQ", "NEQ", "LTE", "GTE", "LT", "GT", "POW", "PLUS", "MINUS", 
			"STAR", "SLASH", "FLOORDIV", "MOD", "TILDE", "DOT", "COMMA", "COLON", 
			"PIPE", "ASSIGN", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "LBRACE", "RBRACE", 
			"TRUE", "FALSE", "NONE", "STRING", "NUMBER", "NAME", "STMT_WS", "EXPR_CLOSE_TRIM", 
			"EXPR_CLOSE", "EXPR_WS", "COMMENT_CLOSE", "COMMENT_TEXT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "jinja2Parser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public jinja2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TemplateContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(jinja2Parser.EOF, 0); }
		public List<TemplateContentContext> templateContent() {
			return getRuleContexts(TemplateContentContext.class);
		}
		public TemplateContentContext templateContent(int i) {
			return getRuleContext(TemplateContentContext.class,i);
		}
		public TemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitTemplate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitTemplate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateContext template() throws RecognitionException {
		TemplateContext _localctx = new TemplateContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_template);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7646L) != 0)) {
				{
				{
				setState(264);
				templateContent();
				}
				}
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(270);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TemplateContentContext extends ParserRuleContext {
		public TemplateContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateContent; }
	 
		public TemplateContentContext() { }
		public void copyFrom(TemplateContentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AutoescapeStmtContext extends TemplateContentContext {
		public AutoescapeBlockContext autoescapeBlock() {
			return getRuleContext(AutoescapeBlockContext.class,0);
		}
		public AutoescapeStmtContext(TemplateContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterAutoescapeStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitAutoescapeStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitAutoescapeStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetStmtContext extends TemplateContentContext {
		public SetStatementContext setStatement() {
			return getRuleContext(SetStatementContext.class,0);
		}
		public SetStmtContext(TemplateContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterSetStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitSetStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitSetStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CallMacroBlockContext extends TemplateContentContext {
		public CallBlockContext callBlock() {
			return getRuleContext(CallBlockContext.class,0);
		}
		public CallMacroBlockContext(TemplateContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterCallMacroBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitCallMacroBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitCallMacroBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementPartContext extends TemplateContentContext {
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public HtmlElementPartContext(TemplateContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterHtmlElementPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitHtmlElementPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitHtmlElementPart(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlEntityPartContext extends TemplateContentContext {
		public HtmlEntityContext htmlEntity() {
			return getRuleContext(HtmlEntityContext.class,0);
		}
		public HtmlEntityPartContext(TemplateContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterHtmlEntityPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitHtmlEntityPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitHtmlEntityPart(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WithScopeBlockContext extends TemplateContentContext {
		public WithBlockContext withBlock() {
			return getRuleContext(WithBlockContext.class,0);
		}
		public WithScopeBlockContext(TemplateContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterWithScopeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitWithScopeBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitWithScopeBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlTextPartContext extends TemplateContentContext {
		public HtmlTextContext htmlText() {
			return getRuleContext(HtmlTextContext.class,0);
		}
		public HtmlTextPartContext(TemplateContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterHtmlTextPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitHtmlTextPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitHtmlTextPart(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionOutputContext extends TemplateContentContext {
		public ExpressionBlockContext expressionBlock() {
			return getRuleContext(ExpressionBlockContext.class,0);
		}
		public ExpressionOutputContext(TemplateContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterExpressionOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitExpressionOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitExpressionOutput(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfConditionBlockContext extends TemplateContentContext {
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public IfConditionBlockContext(TemplateContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterIfConditionBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitIfConditionBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitIfConditionBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlCdataPartContext extends TemplateContentContext {
		public HtmlCdataContext htmlCdata() {
			return getRuleContext(HtmlCdataContext.class,0);
		}
		public HtmlCdataPartContext(TemplateContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterHtmlCdataPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitHtmlCdataPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitHtmlCdataPart(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForLoopBlockContext extends TemplateContentContext {
		public ForBlockContext forBlock() {
			return getRuleContext(ForBlockContext.class,0);
		}
		public ForLoopBlockContext(TemplateContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterForLoopBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitForLoopBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitForLoopBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportStmtContext extends TemplateContentContext {
		public ImportStatementContext importStatement() {
			return getRuleContext(ImportStatementContext.class,0);
		}
		public ImportStmtContext(TemplateContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterImportStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitImportStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitImportStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FromImportStmtContext extends TemplateContentContext {
		public FromImportStatementContext fromImportStatement() {
			return getRuleContext(FromImportStatementContext.class,0);
		}
		public FromImportStmtContext(TemplateContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterFromImportStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitFromImportStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitFromImportStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlDoctypePartContext extends TemplateContentContext {
		public HtmlDoctypeContext htmlDoctype() {
			return getRuleContext(HtmlDoctypeContext.class,0);
		}
		public HtmlDoctypePartContext(TemplateContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterHtmlDoctypePart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitHtmlDoctypePart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitHtmlDoctypePart(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExtendsStmtContext extends TemplateContentContext {
		public ExtendsStatementContext extendsStatement() {
			return getRuleContext(ExtendsStatementContext.class,0);
		}
		public ExtendsStmtContext(TemplateContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterExtendsStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitExtendsStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitExtendsStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockDefStmtContext extends TemplateContentContext {
		public BlockDefinitionContext blockDefinition() {
			return getRuleContext(BlockDefinitionContext.class,0);
		}
		public BlockDefStmtContext(TemplateContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterBlockDefStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitBlockDefStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitBlockDefStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlCommentPartContext extends TemplateContentContext {
		public HtmlCommentBlockContext htmlCommentBlock() {
			return getRuleContext(HtmlCommentBlockContext.class,0);
		}
		public HtmlCommentPartContext(TemplateContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterHtmlCommentPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitHtmlCommentPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitHtmlCommentPart(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MacroDefStmtContext extends TemplateContentContext {
		public MacroStatementContext macroStatement() {
			return getRuleContext(MacroStatementContext.class,0);
		}
		public MacroDefStmtContext(TemplateContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterMacroDefStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitMacroDefStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitMacroDefStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FilterApplyBlockContext extends TemplateContentContext {
		public FilterBlockContext filterBlock() {
			return getRuleContext(FilterBlockContext.class,0);
		}
		public FilterApplyBlockContext(TemplateContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterFilterApplyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitFilterApplyBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitFilterApplyBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoStmtContext extends TemplateContentContext {
		public DoStatementContext doStatement() {
			return getRuleContext(DoStatementContext.class,0);
		}
		public DoStmtContext(TemplateContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterDoStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitDoStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitDoStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IncludeStmtContext extends TemplateContentContext {
		public IncludeStatementContext includeStatement() {
			return getRuleContext(IncludeStatementContext.class,0);
		}
		public IncludeStmtContext(TemplateContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterIncludeStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitIncludeStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitIncludeStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetBlockStmtContext extends TemplateContentContext {
		public SetBlockStatementContext setBlockStatement() {
			return getRuleContext(SetBlockStatementContext.class,0);
		}
		public SetBlockStmtContext(TemplateContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterSetBlockStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitSetBlockStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitSetBlockStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateContentContext templateContent() throws RecognitionException {
		TemplateContentContext _localctx = new TemplateContentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_templateContent);
		try {
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new HtmlElementPartContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				htmlElement();
				}
				break;
			case 2:
				_localctx = new HtmlTextPartContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				htmlText();
				}
				break;
			case 3:
				_localctx = new HtmlDoctypePartContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(274);
				htmlDoctype();
				}
				break;
			case 4:
				_localctx = new HtmlCommentPartContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(275);
				htmlCommentBlock();
				}
				break;
			case 5:
				_localctx = new HtmlCdataPartContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(276);
				htmlCdata();
				}
				break;
			case 6:
				_localctx = new HtmlEntityPartContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(277);
				htmlEntity();
				}
				break;
			case 7:
				_localctx = new ExpressionOutputContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(278);
				expressionBlock();
				}
				break;
			case 8:
				_localctx = new ForLoopBlockContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(279);
				forBlock();
				}
				break;
			case 9:
				_localctx = new IfConditionBlockContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(280);
				ifBlock();
				}
				break;
			case 10:
				_localctx = new ExtendsStmtContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(281);
				extendsStatement();
				}
				break;
			case 11:
				_localctx = new IncludeStmtContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(282);
				includeStatement();
				}
				break;
			case 12:
				_localctx = new BlockDefStmtContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(283);
				blockDefinition();
				}
				break;
			case 13:
				_localctx = new SetStmtContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(284);
				setStatement();
				}
				break;
			case 14:
				_localctx = new SetBlockStmtContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(285);
				setBlockStatement();
				}
				break;
			case 15:
				_localctx = new MacroDefStmtContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(286);
				macroStatement();
				}
				break;
			case 16:
				_localctx = new ImportStmtContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(287);
				importStatement();
				}
				break;
			case 17:
				_localctx = new FromImportStmtContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(288);
				fromImportStatement();
				}
				break;
			case 18:
				_localctx = new WithScopeBlockContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(289);
				withBlock();
				}
				break;
			case 19:
				_localctx = new FilterApplyBlockContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(290);
				filterBlock();
				}
				break;
			case 20:
				_localctx = new DoStmtContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(291);
				doStatement();
				}
				break;
			case 21:
				_localctx = new CallMacroBlockContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(292);
				callBlock();
				}
				break;
			case 22:
				_localctx = new AutoescapeStmtContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(293);
				autoescapeBlock();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementContext extends ParserRuleContext {
		public HtmlRootElementContext htmlRootElement() {
			return getRuleContext(HtmlRootElementContext.class,0);
		}
		public HeadElementContext headElement() {
			return getRuleContext(HeadElementContext.class,0);
		}
		public BodyElementContext bodyElement() {
			return getRuleContext(BodyElementContext.class,0);
		}
		public TitleElementContext titleElement() {
			return getRuleContext(TitleElementContext.class,0);
		}
		public StyleElementContext styleElement() {
			return getRuleContext(StyleElementContext.class,0);
		}
		public DivElementContext divElement() {
			return getRuleContext(DivElementContext.class,0);
		}
		public H1ElementContext h1Element() {
			return getRuleContext(H1ElementContext.class,0);
		}
		public ParagraphElementContext paragraphElement() {
			return getRuleContext(ParagraphElementContext.class,0);
		}
		public FormElementContext formElement() {
			return getRuleContext(FormElementContext.class,0);
		}
		public LabelElementContext labelElement() {
			return getRuleContext(LabelElementContext.class,0);
		}
		public TextareaElementContext textareaElement() {
			return getRuleContext(TextareaElementContext.class,0);
		}
		public ButtonElementContext buttonElement() {
			return getRuleContext(ButtonElementContext.class,0);
		}
		public AnchorElementContext anchorElement() {
			return getRuleContext(AnchorElementContext.class,0);
		}
		public InputElementContext inputElement() {
			return getRuleContext(InputElementContext.class,0);
		}
		public ImgElementContext imgElement() {
			return getRuleContext(ImgElementContext.class,0);
		}
		public GenericElementContext genericElement() {
			return getRuleContext(GenericElementContext.class,0);
		}
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterHtmlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitHtmlElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitHtmlElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_htmlElement);
		try {
			setState(312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				htmlRootElement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				headElement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(298);
				bodyElement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(299);
				titleElement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(300);
				styleElement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(301);
				divElement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(302);
				h1Element();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(303);
				paragraphElement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(304);
				formElement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(305);
				labelElement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(306);
				textareaElement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(307);
				buttonElement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(308);
				anchorElement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(309);
				inputElement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(310);
				imgElement();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(311);
				genericElement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlRootElementContext extends ParserRuleContext {
		public HtmlAttributeContext htmlAttribute;
		public List<HtmlAttributeContext> attrs = new ArrayList<HtmlAttributeContext>();
		public HtmlContentContext htmlContent;
		public List<HtmlContentContext> content = new ArrayList<HtmlContentContext>();
		public TerminalNode TAG_OPEN() { return getToken(jinja2Parser.TAG_OPEN, 0); }
		public List<TerminalNode> HTMLROOT_TAG() { return getTokens(jinja2Parser.HTMLROOT_TAG); }
		public TerminalNode HTMLROOT_TAG(int i) {
			return getToken(jinja2Parser.HTMLROOT_TAG, i);
		}
		public List<TerminalNode> TAG_CLOSE() { return getTokens(jinja2Parser.TAG_CLOSE); }
		public TerminalNode TAG_CLOSE(int i) {
			return getToken(jinja2Parser.TAG_CLOSE, i);
		}
		public TerminalNode TAG_CLOSE_SLASH() { return getToken(jinja2Parser.TAG_CLOSE_SLASH, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public List<HtmlContentContext> htmlContent() {
			return getRuleContexts(HtmlContentContext.class);
		}
		public HtmlContentContext htmlContent(int i) {
			return getRuleContext(HtmlContentContext.class,i);
		}
		public HtmlRootElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlRootElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterHtmlRootElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitHtmlRootElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitHtmlRootElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlRootElementContext htmlRootElement() throws RecognitionException {
		HtmlRootElementContext _localctx = new HtmlRootElementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_htmlRootElement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(TAG_OPEN);
			setState(315);
			match(HTMLROOT_TAG);
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAG_EXPR_OPEN || _la==TAG_NAME) {
				{
				{
				setState(316);
				((HtmlRootElementContext)_localctx).htmlAttribute = htmlAttribute();
				((HtmlRootElementContext)_localctx).attrs.add(((HtmlRootElementContext)_localctx).htmlAttribute);
				}
				}
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(322);
			match(TAG_CLOSE);
			setState(326);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(323);
					((HtmlRootElementContext)_localctx).htmlContent = htmlContent();
					((HtmlRootElementContext)_localctx).content.add(((HtmlRootElementContext)_localctx).htmlContent);
					}
					} 
				}
				setState(328);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(329);
				match(TAG_CLOSE_SLASH);
				setState(330);
				match(HTMLROOT_TAG);
				setState(331);
				match(TAG_CLOSE);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HeadElementContext extends ParserRuleContext {
		public HtmlAttributeContext htmlAttribute;
		public List<HtmlAttributeContext> attrs = new ArrayList<HtmlAttributeContext>();
		public HtmlContentContext htmlContent;
		public List<HtmlContentContext> content = new ArrayList<HtmlContentContext>();
		public TerminalNode TAG_OPEN() { return getToken(jinja2Parser.TAG_OPEN, 0); }
		public List<TerminalNode> HEAD_TAG() { return getTokens(jinja2Parser.HEAD_TAG); }
		public TerminalNode HEAD_TAG(int i) {
			return getToken(jinja2Parser.HEAD_TAG, i);
		}
		public List<TerminalNode> TAG_CLOSE() { return getTokens(jinja2Parser.TAG_CLOSE); }
		public TerminalNode TAG_CLOSE(int i) {
			return getToken(jinja2Parser.TAG_CLOSE, i);
		}
		public TerminalNode TAG_CLOSE_SLASH() { return getToken(jinja2Parser.TAG_CLOSE_SLASH, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public List<HtmlContentContext> htmlContent() {
			return getRuleContexts(HtmlContentContext.class);
		}
		public HtmlContentContext htmlContent(int i) {
			return getRuleContext(HtmlContentContext.class,i);
		}
		public HeadElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterHeadElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitHeadElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitHeadElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeadElementContext headElement() throws RecognitionException {
		HeadElementContext _localctx = new HeadElementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_headElement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(TAG_OPEN);
			setState(335);
			match(HEAD_TAG);
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAG_EXPR_OPEN || _la==TAG_NAME) {
				{
				{
				setState(336);
				((HeadElementContext)_localctx).htmlAttribute = htmlAttribute();
				((HeadElementContext)_localctx).attrs.add(((HeadElementContext)_localctx).htmlAttribute);
				}
				}
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(342);
			match(TAG_CLOSE);
			setState(346);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(343);
					((HeadElementContext)_localctx).htmlContent = htmlContent();
					((HeadElementContext)_localctx).content.add(((HeadElementContext)_localctx).htmlContent);
					}
					} 
				}
				setState(348);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(349);
				match(TAG_CLOSE_SLASH);
				setState(350);
				match(HEAD_TAG);
				setState(351);
				match(TAG_CLOSE);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BodyElementContext extends ParserRuleContext {
		public HtmlAttributeContext htmlAttribute;
		public List<HtmlAttributeContext> attrs = new ArrayList<HtmlAttributeContext>();
		public HtmlContentContext htmlContent;
		public List<HtmlContentContext> content = new ArrayList<HtmlContentContext>();
		public TerminalNode TAG_OPEN() { return getToken(jinja2Parser.TAG_OPEN, 0); }
		public List<TerminalNode> BODY_TAG() { return getTokens(jinja2Parser.BODY_TAG); }
		public TerminalNode BODY_TAG(int i) {
			return getToken(jinja2Parser.BODY_TAG, i);
		}
		public List<TerminalNode> TAG_CLOSE() { return getTokens(jinja2Parser.TAG_CLOSE); }
		public TerminalNode TAG_CLOSE(int i) {
			return getToken(jinja2Parser.TAG_CLOSE, i);
		}
		public TerminalNode TAG_CLOSE_SLASH() { return getToken(jinja2Parser.TAG_CLOSE_SLASH, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public List<HtmlContentContext> htmlContent() {
			return getRuleContexts(HtmlContentContext.class);
		}
		public HtmlContentContext htmlContent(int i) {
			return getRuleContext(HtmlContentContext.class,i);
		}
		public BodyElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterBodyElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitBodyElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitBodyElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyElementContext bodyElement() throws RecognitionException {
		BodyElementContext _localctx = new BodyElementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_bodyElement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(TAG_OPEN);
			setState(355);
			match(BODY_TAG);
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAG_EXPR_OPEN || _la==TAG_NAME) {
				{
				{
				setState(356);
				((BodyElementContext)_localctx).htmlAttribute = htmlAttribute();
				((BodyElementContext)_localctx).attrs.add(((BodyElementContext)_localctx).htmlAttribute);
				}
				}
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(362);
			match(TAG_CLOSE);
			setState(366);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(363);
					((BodyElementContext)_localctx).htmlContent = htmlContent();
					((BodyElementContext)_localctx).content.add(((BodyElementContext)_localctx).htmlContent);
					}
					} 
				}
				setState(368);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(372);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(369);
				match(TAG_CLOSE_SLASH);
				setState(370);
				match(BODY_TAG);
				setState(371);
				match(TAG_CLOSE);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TitleElementContext extends ParserRuleContext {
		public HtmlAttributeContext htmlAttribute;
		public List<HtmlAttributeContext> attrs = new ArrayList<HtmlAttributeContext>();
		public HtmlContentContext htmlContent;
		public List<HtmlContentContext> content = new ArrayList<HtmlContentContext>();
		public TerminalNode TAG_OPEN() { return getToken(jinja2Parser.TAG_OPEN, 0); }
		public List<TerminalNode> TITLE_TAG() { return getTokens(jinja2Parser.TITLE_TAG); }
		public TerminalNode TITLE_TAG(int i) {
			return getToken(jinja2Parser.TITLE_TAG, i);
		}
		public List<TerminalNode> TAG_CLOSE() { return getTokens(jinja2Parser.TAG_CLOSE); }
		public TerminalNode TAG_CLOSE(int i) {
			return getToken(jinja2Parser.TAG_CLOSE, i);
		}
		public TerminalNode TAG_CLOSE_SLASH() { return getToken(jinja2Parser.TAG_CLOSE_SLASH, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public List<HtmlContentContext> htmlContent() {
			return getRuleContexts(HtmlContentContext.class);
		}
		public HtmlContentContext htmlContent(int i) {
			return getRuleContext(HtmlContentContext.class,i);
		}
		public TitleElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_titleElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterTitleElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitTitleElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitTitleElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TitleElementContext titleElement() throws RecognitionException {
		TitleElementContext _localctx = new TitleElementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_titleElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(TAG_OPEN);
			setState(375);
			match(TITLE_TAG);
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAG_EXPR_OPEN || _la==TAG_NAME) {
				{
				{
				setState(376);
				((TitleElementContext)_localctx).htmlAttribute = htmlAttribute();
				((TitleElementContext)_localctx).attrs.add(((TitleElementContext)_localctx).htmlAttribute);
				}
				}
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(382);
			match(TAG_CLOSE);
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7646L) != 0)) {
				{
				{
				setState(383);
				((TitleElementContext)_localctx).htmlContent = htmlContent();
				((TitleElementContext)_localctx).content.add(((TitleElementContext)_localctx).htmlContent);
				}
				}
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(389);
			match(TAG_CLOSE_SLASH);
			setState(390);
			match(TITLE_TAG);
			setState(391);
			match(TAG_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StyleElementContext extends ParserRuleContext {
		public HtmlAttributeContext htmlAttribute;
		public List<HtmlAttributeContext> attrs = new ArrayList<HtmlAttributeContext>();
		public CssStylesheetContext css;
		public TerminalNode TAG_OPEN() { return getToken(jinja2Parser.TAG_OPEN, 0); }
		public TerminalNode STYLE_TAG() { return getToken(jinja2Parser.STYLE_TAG, 0); }
		public TerminalNode TAG_CLOSE() { return getToken(jinja2Parser.TAG_CLOSE, 0); }
		public TerminalNode CSS_STYLE_CLOSE() { return getToken(jinja2Parser.CSS_STYLE_CLOSE, 0); }
		public CssStylesheetContext cssStylesheet() {
			return getRuleContext(CssStylesheetContext.class,0);
		}
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public StyleElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterStyleElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitStyleElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitStyleElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleElementContext styleElement() throws RecognitionException {
		StyleElementContext _localctx = new StyleElementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_styleElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			match(TAG_OPEN);
			setState(394);
			match(STYLE_TAG);
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAG_EXPR_OPEN || _la==TAG_NAME) {
				{
				{
				setState(395);
				((StyleElementContext)_localctx).htmlAttribute = htmlAttribute();
				((StyleElementContext)_localctx).attrs.add(((StyleElementContext)_localctx).htmlAttribute);
				}
				}
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(401);
			match(TAG_CLOSE);
			setState(402);
			((StyleElementContext)_localctx).css = cssStylesheet();
			setState(403);
			match(CSS_STYLE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DivElementContext extends ParserRuleContext {
		public HtmlAttributeContext htmlAttribute;
		public List<HtmlAttributeContext> attrs = new ArrayList<HtmlAttributeContext>();
		public HtmlContentContext htmlContent;
		public List<HtmlContentContext> content = new ArrayList<HtmlContentContext>();
		public TerminalNode TAG_OPEN() { return getToken(jinja2Parser.TAG_OPEN, 0); }
		public List<TerminalNode> DIV_TAG() { return getTokens(jinja2Parser.DIV_TAG); }
		public TerminalNode DIV_TAG(int i) {
			return getToken(jinja2Parser.DIV_TAG, i);
		}
		public List<TerminalNode> TAG_CLOSE() { return getTokens(jinja2Parser.TAG_CLOSE); }
		public TerminalNode TAG_CLOSE(int i) {
			return getToken(jinja2Parser.TAG_CLOSE, i);
		}
		public TerminalNode TAG_CLOSE_SLASH() { return getToken(jinja2Parser.TAG_CLOSE_SLASH, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public List<HtmlContentContext> htmlContent() {
			return getRuleContexts(HtmlContentContext.class);
		}
		public HtmlContentContext htmlContent(int i) {
			return getRuleContext(HtmlContentContext.class,i);
		}
		public DivElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterDivElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitDivElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitDivElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivElementContext divElement() throws RecognitionException {
		DivElementContext _localctx = new DivElementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_divElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(TAG_OPEN);
			setState(406);
			match(DIV_TAG);
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAG_EXPR_OPEN || _la==TAG_NAME) {
				{
				{
				setState(407);
				((DivElementContext)_localctx).htmlAttribute = htmlAttribute();
				((DivElementContext)_localctx).attrs.add(((DivElementContext)_localctx).htmlAttribute);
				}
				}
				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(413);
			match(TAG_CLOSE);
			setState(417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7646L) != 0)) {
				{
				{
				setState(414);
				((DivElementContext)_localctx).htmlContent = htmlContent();
				((DivElementContext)_localctx).content.add(((DivElementContext)_localctx).htmlContent);
				}
				}
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(420);
			match(TAG_CLOSE_SLASH);
			setState(421);
			match(DIV_TAG);
			setState(422);
			match(TAG_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class H1ElementContext extends ParserRuleContext {
		public HtmlAttributeContext htmlAttribute;
		public List<HtmlAttributeContext> attrs = new ArrayList<HtmlAttributeContext>();
		public HtmlContentContext htmlContent;
		public List<HtmlContentContext> content = new ArrayList<HtmlContentContext>();
		public TerminalNode TAG_OPEN() { return getToken(jinja2Parser.TAG_OPEN, 0); }
		public List<TerminalNode> H1_TAG() { return getTokens(jinja2Parser.H1_TAG); }
		public TerminalNode H1_TAG(int i) {
			return getToken(jinja2Parser.H1_TAG, i);
		}
		public List<TerminalNode> TAG_CLOSE() { return getTokens(jinja2Parser.TAG_CLOSE); }
		public TerminalNode TAG_CLOSE(int i) {
			return getToken(jinja2Parser.TAG_CLOSE, i);
		}
		public TerminalNode TAG_CLOSE_SLASH() { return getToken(jinja2Parser.TAG_CLOSE_SLASH, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public List<HtmlContentContext> htmlContent() {
			return getRuleContexts(HtmlContentContext.class);
		}
		public HtmlContentContext htmlContent(int i) {
			return getRuleContext(HtmlContentContext.class,i);
		}
		public H1ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_h1Element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterH1Element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitH1Element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitH1Element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final H1ElementContext h1Element() throws RecognitionException {
		H1ElementContext _localctx = new H1ElementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_h1Element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(TAG_OPEN);
			setState(425);
			match(H1_TAG);
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAG_EXPR_OPEN || _la==TAG_NAME) {
				{
				{
				setState(426);
				((H1ElementContext)_localctx).htmlAttribute = htmlAttribute();
				((H1ElementContext)_localctx).attrs.add(((H1ElementContext)_localctx).htmlAttribute);
				}
				}
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(432);
			match(TAG_CLOSE);
			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7646L) != 0)) {
				{
				{
				setState(433);
				((H1ElementContext)_localctx).htmlContent = htmlContent();
				((H1ElementContext)_localctx).content.add(((H1ElementContext)_localctx).htmlContent);
				}
				}
				setState(438);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(439);
			match(TAG_CLOSE_SLASH);
			setState(440);
			match(H1_TAG);
			setState(441);
			match(TAG_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParagraphElementContext extends ParserRuleContext {
		public HtmlAttributeContext htmlAttribute;
		public List<HtmlAttributeContext> attrs = new ArrayList<HtmlAttributeContext>();
		public HtmlContentContext htmlContent;
		public List<HtmlContentContext> content = new ArrayList<HtmlContentContext>();
		public TerminalNode TAG_OPEN() { return getToken(jinja2Parser.TAG_OPEN, 0); }
		public List<TerminalNode> P_TAG() { return getTokens(jinja2Parser.P_TAG); }
		public TerminalNode P_TAG(int i) {
			return getToken(jinja2Parser.P_TAG, i);
		}
		public List<TerminalNode> TAG_CLOSE() { return getTokens(jinja2Parser.TAG_CLOSE); }
		public TerminalNode TAG_CLOSE(int i) {
			return getToken(jinja2Parser.TAG_CLOSE, i);
		}
		public TerminalNode TAG_CLOSE_SLASH() { return getToken(jinja2Parser.TAG_CLOSE_SLASH, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public List<HtmlContentContext> htmlContent() {
			return getRuleContexts(HtmlContentContext.class);
		}
		public HtmlContentContext htmlContent(int i) {
			return getRuleContext(HtmlContentContext.class,i);
		}
		public ParagraphElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paragraphElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterParagraphElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitParagraphElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitParagraphElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParagraphElementContext paragraphElement() throws RecognitionException {
		ParagraphElementContext _localctx = new ParagraphElementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_paragraphElement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			match(TAG_OPEN);
			setState(444);
			match(P_TAG);
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAG_EXPR_OPEN || _la==TAG_NAME) {
				{
				{
				setState(445);
				((ParagraphElementContext)_localctx).htmlAttribute = htmlAttribute();
				((ParagraphElementContext)_localctx).attrs.add(((ParagraphElementContext)_localctx).htmlAttribute);
				}
				}
				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(451);
			match(TAG_CLOSE);
			setState(455);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(452);
					((ParagraphElementContext)_localctx).htmlContent = htmlContent();
					((ParagraphElementContext)_localctx).content.add(((ParagraphElementContext)_localctx).htmlContent);
					}
					} 
				}
				setState(457);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(461);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(458);
				match(TAG_CLOSE_SLASH);
				setState(459);
				match(P_TAG);
				setState(460);
				match(TAG_CLOSE);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FormElementContext extends ParserRuleContext {
		public HtmlAttributeContext htmlAttribute;
		public List<HtmlAttributeContext> attrs = new ArrayList<HtmlAttributeContext>();
		public HtmlContentContext htmlContent;
		public List<HtmlContentContext> content = new ArrayList<HtmlContentContext>();
		public TerminalNode TAG_OPEN() { return getToken(jinja2Parser.TAG_OPEN, 0); }
		public List<TerminalNode> FORM_TAG() { return getTokens(jinja2Parser.FORM_TAG); }
		public TerminalNode FORM_TAG(int i) {
			return getToken(jinja2Parser.FORM_TAG, i);
		}
		public List<TerminalNode> TAG_CLOSE() { return getTokens(jinja2Parser.TAG_CLOSE); }
		public TerminalNode TAG_CLOSE(int i) {
			return getToken(jinja2Parser.TAG_CLOSE, i);
		}
		public TerminalNode TAG_CLOSE_SLASH() { return getToken(jinja2Parser.TAG_CLOSE_SLASH, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public List<HtmlContentContext> htmlContent() {
			return getRuleContexts(HtmlContentContext.class);
		}
		public HtmlContentContext htmlContent(int i) {
			return getRuleContext(HtmlContentContext.class,i);
		}
		public FormElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterFormElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitFormElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitFormElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormElementContext formElement() throws RecognitionException {
		FormElementContext _localctx = new FormElementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_formElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			match(TAG_OPEN);
			setState(464);
			match(FORM_TAG);
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAG_EXPR_OPEN || _la==TAG_NAME) {
				{
				{
				setState(465);
				((FormElementContext)_localctx).htmlAttribute = htmlAttribute();
				((FormElementContext)_localctx).attrs.add(((FormElementContext)_localctx).htmlAttribute);
				}
				}
				setState(470);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(471);
			match(TAG_CLOSE);
			setState(475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7646L) != 0)) {
				{
				{
				setState(472);
				((FormElementContext)_localctx).htmlContent = htmlContent();
				((FormElementContext)_localctx).content.add(((FormElementContext)_localctx).htmlContent);
				}
				}
				setState(477);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(478);
			match(TAG_CLOSE_SLASH);
			setState(479);
			match(FORM_TAG);
			setState(480);
			match(TAG_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LabelElementContext extends ParserRuleContext {
		public HtmlAttributeContext htmlAttribute;
		public List<HtmlAttributeContext> attrs = new ArrayList<HtmlAttributeContext>();
		public HtmlContentContext htmlContent;
		public List<HtmlContentContext> content = new ArrayList<HtmlContentContext>();
		public TerminalNode TAG_OPEN() { return getToken(jinja2Parser.TAG_OPEN, 0); }
		public List<TerminalNode> LABEL_TAG() { return getTokens(jinja2Parser.LABEL_TAG); }
		public TerminalNode LABEL_TAG(int i) {
			return getToken(jinja2Parser.LABEL_TAG, i);
		}
		public List<TerminalNode> TAG_CLOSE() { return getTokens(jinja2Parser.TAG_CLOSE); }
		public TerminalNode TAG_CLOSE(int i) {
			return getToken(jinja2Parser.TAG_CLOSE, i);
		}
		public TerminalNode TAG_CLOSE_SLASH() { return getToken(jinja2Parser.TAG_CLOSE_SLASH, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public List<HtmlContentContext> htmlContent() {
			return getRuleContexts(HtmlContentContext.class);
		}
		public HtmlContentContext htmlContent(int i) {
			return getRuleContext(HtmlContentContext.class,i);
		}
		public LabelElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterLabelElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitLabelElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitLabelElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelElementContext labelElement() throws RecognitionException {
		LabelElementContext _localctx = new LabelElementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_labelElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			match(TAG_OPEN);
			setState(483);
			match(LABEL_TAG);
			setState(487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAG_EXPR_OPEN || _la==TAG_NAME) {
				{
				{
				setState(484);
				((LabelElementContext)_localctx).htmlAttribute = htmlAttribute();
				((LabelElementContext)_localctx).attrs.add(((LabelElementContext)_localctx).htmlAttribute);
				}
				}
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(490);
			match(TAG_CLOSE);
			setState(494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7646L) != 0)) {
				{
				{
				setState(491);
				((LabelElementContext)_localctx).htmlContent = htmlContent();
				((LabelElementContext)_localctx).content.add(((LabelElementContext)_localctx).htmlContent);
				}
				}
				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(497);
			match(TAG_CLOSE_SLASH);
			setState(498);
			match(LABEL_TAG);
			setState(499);
			match(TAG_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TextareaElementContext extends ParserRuleContext {
		public HtmlAttributeContext htmlAttribute;
		public List<HtmlAttributeContext> attrs = new ArrayList<HtmlAttributeContext>();
		public HtmlContentContext htmlContent;
		public List<HtmlContentContext> content = new ArrayList<HtmlContentContext>();
		public TerminalNode TAG_OPEN() { return getToken(jinja2Parser.TAG_OPEN, 0); }
		public List<TerminalNode> TEXTAREA_TAG() { return getTokens(jinja2Parser.TEXTAREA_TAG); }
		public TerminalNode TEXTAREA_TAG(int i) {
			return getToken(jinja2Parser.TEXTAREA_TAG, i);
		}
		public List<TerminalNode> TAG_CLOSE() { return getTokens(jinja2Parser.TAG_CLOSE); }
		public TerminalNode TAG_CLOSE(int i) {
			return getToken(jinja2Parser.TAG_CLOSE, i);
		}
		public TerminalNode TAG_CLOSE_SLASH() { return getToken(jinja2Parser.TAG_CLOSE_SLASH, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public List<HtmlContentContext> htmlContent() {
			return getRuleContexts(HtmlContentContext.class);
		}
		public HtmlContentContext htmlContent(int i) {
			return getRuleContext(HtmlContentContext.class,i);
		}
		public TextareaElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textareaElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterTextareaElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitTextareaElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitTextareaElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextareaElementContext textareaElement() throws RecognitionException {
		TextareaElementContext _localctx = new TextareaElementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_textareaElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			match(TAG_OPEN);
			setState(502);
			match(TEXTAREA_TAG);
			setState(506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAG_EXPR_OPEN || _la==TAG_NAME) {
				{
				{
				setState(503);
				((TextareaElementContext)_localctx).htmlAttribute = htmlAttribute();
				((TextareaElementContext)_localctx).attrs.add(((TextareaElementContext)_localctx).htmlAttribute);
				}
				}
				setState(508);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(509);
			match(TAG_CLOSE);
			setState(513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7646L) != 0)) {
				{
				{
				setState(510);
				((TextareaElementContext)_localctx).htmlContent = htmlContent();
				((TextareaElementContext)_localctx).content.add(((TextareaElementContext)_localctx).htmlContent);
				}
				}
				setState(515);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(516);
			match(TAG_CLOSE_SLASH);
			setState(517);
			match(TEXTAREA_TAG);
			setState(518);
			match(TAG_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ButtonElementContext extends ParserRuleContext {
		public HtmlAttributeContext htmlAttribute;
		public List<HtmlAttributeContext> attrs = new ArrayList<HtmlAttributeContext>();
		public HtmlContentContext htmlContent;
		public List<HtmlContentContext> content = new ArrayList<HtmlContentContext>();
		public TerminalNode TAG_OPEN() { return getToken(jinja2Parser.TAG_OPEN, 0); }
		public List<TerminalNode> BUTTON_TAG() { return getTokens(jinja2Parser.BUTTON_TAG); }
		public TerminalNode BUTTON_TAG(int i) {
			return getToken(jinja2Parser.BUTTON_TAG, i);
		}
		public List<TerminalNode> TAG_CLOSE() { return getTokens(jinja2Parser.TAG_CLOSE); }
		public TerminalNode TAG_CLOSE(int i) {
			return getToken(jinja2Parser.TAG_CLOSE, i);
		}
		public TerminalNode TAG_CLOSE_SLASH() { return getToken(jinja2Parser.TAG_CLOSE_SLASH, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public List<HtmlContentContext> htmlContent() {
			return getRuleContexts(HtmlContentContext.class);
		}
		public HtmlContentContext htmlContent(int i) {
			return getRuleContext(HtmlContentContext.class,i);
		}
		public ButtonElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buttonElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterButtonElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitButtonElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitButtonElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ButtonElementContext buttonElement() throws RecognitionException {
		ButtonElementContext _localctx = new ButtonElementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_buttonElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			match(TAG_OPEN);
			setState(521);
			match(BUTTON_TAG);
			setState(525);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAG_EXPR_OPEN || _la==TAG_NAME) {
				{
				{
				setState(522);
				((ButtonElementContext)_localctx).htmlAttribute = htmlAttribute();
				((ButtonElementContext)_localctx).attrs.add(((ButtonElementContext)_localctx).htmlAttribute);
				}
				}
				setState(527);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(528);
			match(TAG_CLOSE);
			setState(532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7646L) != 0)) {
				{
				{
				setState(529);
				((ButtonElementContext)_localctx).htmlContent = htmlContent();
				((ButtonElementContext)_localctx).content.add(((ButtonElementContext)_localctx).htmlContent);
				}
				}
				setState(534);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(535);
			match(TAG_CLOSE_SLASH);
			setState(536);
			match(BUTTON_TAG);
			setState(537);
			match(TAG_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnchorElementContext extends ParserRuleContext {
		public HtmlAttributeContext htmlAttribute;
		public List<HtmlAttributeContext> attrs = new ArrayList<HtmlAttributeContext>();
		public HtmlContentContext htmlContent;
		public List<HtmlContentContext> content = new ArrayList<HtmlContentContext>();
		public TerminalNode TAG_OPEN() { return getToken(jinja2Parser.TAG_OPEN, 0); }
		public List<TerminalNode> A_TAG() { return getTokens(jinja2Parser.A_TAG); }
		public TerminalNode A_TAG(int i) {
			return getToken(jinja2Parser.A_TAG, i);
		}
		public List<TerminalNode> TAG_CLOSE() { return getTokens(jinja2Parser.TAG_CLOSE); }
		public TerminalNode TAG_CLOSE(int i) {
			return getToken(jinja2Parser.TAG_CLOSE, i);
		}
		public TerminalNode TAG_CLOSE_SLASH() { return getToken(jinja2Parser.TAG_CLOSE_SLASH, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public List<HtmlContentContext> htmlContent() {
			return getRuleContexts(HtmlContentContext.class);
		}
		public HtmlContentContext htmlContent(int i) {
			return getRuleContext(HtmlContentContext.class,i);
		}
		public AnchorElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anchorElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterAnchorElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitAnchorElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitAnchorElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnchorElementContext anchorElement() throws RecognitionException {
		AnchorElementContext _localctx = new AnchorElementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_anchorElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			match(TAG_OPEN);
			setState(540);
			match(A_TAG);
			setState(544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAG_EXPR_OPEN || _la==TAG_NAME) {
				{
				{
				setState(541);
				((AnchorElementContext)_localctx).htmlAttribute = htmlAttribute();
				((AnchorElementContext)_localctx).attrs.add(((AnchorElementContext)_localctx).htmlAttribute);
				}
				}
				setState(546);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(547);
			match(TAG_CLOSE);
			setState(551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7646L) != 0)) {
				{
				{
				setState(548);
				((AnchorElementContext)_localctx).htmlContent = htmlContent();
				((AnchorElementContext)_localctx).content.add(((AnchorElementContext)_localctx).htmlContent);
				}
				}
				setState(553);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(554);
			match(TAG_CLOSE_SLASH);
			setState(555);
			match(A_TAG);
			setState(556);
			match(TAG_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InputElementContext extends ParserRuleContext {
		public HtmlAttributeContext htmlAttribute;
		public List<HtmlAttributeContext> attrs = new ArrayList<HtmlAttributeContext>();
		public TerminalNode TAG_OPEN() { return getToken(jinja2Parser.TAG_OPEN, 0); }
		public TerminalNode INPUT_TAG() { return getToken(jinja2Parser.INPUT_TAG, 0); }
		public TerminalNode TAG_CLOSE() { return getToken(jinja2Parser.TAG_CLOSE, 0); }
		public TerminalNode TAG_SELF_CLOSE() { return getToken(jinja2Parser.TAG_SELF_CLOSE, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public InputElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterInputElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitInputElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitInputElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputElementContext inputElement() throws RecognitionException {
		InputElementContext _localctx = new InputElementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_inputElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			match(TAG_OPEN);
			setState(559);
			match(INPUT_TAG);
			setState(563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAG_EXPR_OPEN || _la==TAG_NAME) {
				{
				{
				setState(560);
				((InputElementContext)_localctx).htmlAttribute = htmlAttribute();
				((InputElementContext)_localctx).attrs.add(((InputElementContext)_localctx).htmlAttribute);
				}
				}
				setState(565);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(566);
			_la = _input.LA(1);
			if ( !(_la==TAG_SELF_CLOSE || _la==TAG_CLOSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImgElementContext extends ParserRuleContext {
		public HtmlAttributeContext htmlAttribute;
		public List<HtmlAttributeContext> attrs = new ArrayList<HtmlAttributeContext>();
		public TerminalNode TAG_OPEN() { return getToken(jinja2Parser.TAG_OPEN, 0); }
		public TerminalNode IMG_TAG() { return getToken(jinja2Parser.IMG_TAG, 0); }
		public TerminalNode TAG_CLOSE() { return getToken(jinja2Parser.TAG_CLOSE, 0); }
		public TerminalNode TAG_SELF_CLOSE() { return getToken(jinja2Parser.TAG_SELF_CLOSE, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public ImgElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imgElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterImgElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitImgElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitImgElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImgElementContext imgElement() throws RecognitionException {
		ImgElementContext _localctx = new ImgElementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_imgElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			match(TAG_OPEN);
			setState(569);
			match(IMG_TAG);
			setState(573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAG_EXPR_OPEN || _la==TAG_NAME) {
				{
				{
				setState(570);
				((ImgElementContext)_localctx).htmlAttribute = htmlAttribute();
				((ImgElementContext)_localctx).attrs.add(((ImgElementContext)_localctx).htmlAttribute);
				}
				}
				setState(575);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(576);
			_la = _input.LA(1);
			if ( !(_la==TAG_SELF_CLOSE || _la==TAG_CLOSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GenericElementContext extends ParserRuleContext {
		public Token name;
		public HtmlAttributeContext htmlAttribute;
		public List<HtmlAttributeContext> attrs = new ArrayList<HtmlAttributeContext>();
		public HtmlContentContext htmlContent;
		public List<HtmlContentContext> content = new ArrayList<HtmlContentContext>();
		public TerminalNode TAG_OPEN() { return getToken(jinja2Parser.TAG_OPEN, 0); }
		public List<TerminalNode> TAG_CLOSE() { return getTokens(jinja2Parser.TAG_CLOSE); }
		public TerminalNode TAG_CLOSE(int i) {
			return getToken(jinja2Parser.TAG_CLOSE, i);
		}
		public List<TerminalNode> TAG_NAME() { return getTokens(jinja2Parser.TAG_NAME); }
		public TerminalNode TAG_NAME(int i) {
			return getToken(jinja2Parser.TAG_NAME, i);
		}
		public TerminalNode TAG_CLOSE_SLASH() { return getToken(jinja2Parser.TAG_CLOSE_SLASH, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public List<HtmlContentContext> htmlContent() {
			return getRuleContexts(HtmlContentContext.class);
		}
		public HtmlContentContext htmlContent(int i) {
			return getRuleContext(HtmlContentContext.class,i);
		}
		public TerminalNode TAG_SELF_CLOSE() { return getToken(jinja2Parser.TAG_SELF_CLOSE, 0); }
		public GenericElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterGenericElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitGenericElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitGenericElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericElementContext genericElement() throws RecognitionException {
		GenericElementContext _localctx = new GenericElementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_genericElement);
		int _la;
		try {
			int _alt;
			setState(607);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(578);
				match(TAG_OPEN);
				setState(579);
				((GenericElementContext)_localctx).name = match(TAG_NAME);
				setState(583);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TAG_EXPR_OPEN || _la==TAG_NAME) {
					{
					{
					setState(580);
					((GenericElementContext)_localctx).htmlAttribute = htmlAttribute();
					((GenericElementContext)_localctx).attrs.add(((GenericElementContext)_localctx).htmlAttribute);
					}
					}
					setState(585);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(586);
				match(TAG_CLOSE);
				setState(590);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(587);
						((GenericElementContext)_localctx).htmlContent = htmlContent();
						((GenericElementContext)_localctx).content.add(((GenericElementContext)_localctx).htmlContent);
						}
						} 
					}
					setState(592);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				}
				setState(596);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(593);
					match(TAG_CLOSE_SLASH);
					setState(594);
					match(TAG_NAME);
					setState(595);
					match(TAG_CLOSE);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(598);
				match(TAG_OPEN);
				setState(599);
				((GenericElementContext)_localctx).name = match(TAG_NAME);
				setState(603);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TAG_EXPR_OPEN || _la==TAG_NAME) {
					{
					{
					setState(600);
					((GenericElementContext)_localctx).htmlAttribute = htmlAttribute();
					((GenericElementContext)_localctx).attrs.add(((GenericElementContext)_localctx).htmlAttribute);
					}
					}
					setState(605);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(606);
				match(TAG_SELF_CLOSE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContentContext extends ParserRuleContext {
		public TemplateContentContext templateContent() {
			return getRuleContext(TemplateContentContext.class,0);
		}
		public HtmlContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterHtmlContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitHtmlContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitHtmlContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContentContext htmlContent() throws RecognitionException {
		HtmlContentContext _localctx = new HtmlContentContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_htmlContent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			templateContent();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttributeContext extends ParserRuleContext {
		public HtmlAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttribute; }
	 
		public HtmlAttributeContext() { }
		public void copyFrom(HtmlAttributeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttributeWithValueContext extends HtmlAttributeContext {
		public AttrNameContext name;
		public AttrValueContext value;
		public AttrNameContext attrName() {
			return getRuleContext(AttrNameContext.class,0);
		}
		public TerminalNode TAG_EQUALS() { return getToken(jinja2Parser.TAG_EQUALS, 0); }
		public AttrValueContext attrValue() {
			return getRuleContext(AttrValueContext.class,0);
		}
		public AttributeWithValueContext(HtmlAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterAttributeWithValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitAttributeWithValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitAttributeWithValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributeContext htmlAttribute() throws RecognitionException {
		HtmlAttributeContext _localctx = new HtmlAttributeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_htmlAttribute);
		int _la;
		try {
			_localctx = new AttributeWithValueContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			((AttributeWithValueContext)_localctx).name = attrName();
			setState(614);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TAG_EQUALS) {
				{
				setState(612);
				match(TAG_EQUALS);
				setState(613);
				((AttributeWithValueContext)_localctx).value = attrValue();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttrNameContext extends ParserRuleContext {
		public AttrNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrName; }
	 
		public AttrNameContext() { }
		public void copyFrom(AttrNameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StaticAttrNameContext extends AttrNameContext {
		public Token staticName;
		public TerminalNode TAG_NAME() { return getToken(jinja2Parser.TAG_NAME, 0); }
		public StaticAttrNameContext(AttrNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterStaticAttrName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitStaticAttrName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitStaticAttrName(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DynamicAttrNameContext extends AttrNameContext {
		public ExpressionContext dynamicExpr;
		public TerminalNode TAG_EXPR_OPEN() { return getToken(jinja2Parser.TAG_EXPR_OPEN, 0); }
		public TerminalNode EXPR_CLOSE() { return getToken(jinja2Parser.EXPR_CLOSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DynamicAttrNameContext(AttrNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterDynamicAttrName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitDynamicAttrName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitDynamicAttrName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrNameContext attrName() throws RecognitionException {
		AttrNameContext _localctx = new AttrNameContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_attrName);
		try {
			setState(621);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAG_NAME:
				_localctx = new StaticAttrNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(616);
				((StaticAttrNameContext)_localctx).staticName = match(TAG_NAME);
				}
				break;
			case TAG_EXPR_OPEN:
				_localctx = new DynamicAttrNameContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(617);
				match(TAG_EXPR_OPEN);
				setState(618);
				((DynamicAttrNameContext)_localctx).dynamicExpr = expression();
				setState(619);
				match(EXPR_CLOSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttrValueContext extends ParserRuleContext {
		public AttrValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrValue; }
	 
		public AttrValueContext() { }
		public void copyFrom(AttrValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnquotedValueContext extends AttrValueContext {
		public Token value;
		public TerminalNode TAG_UNQUOTED_VALUE() { return getToken(jinja2Parser.TAG_UNQUOTED_VALUE, 0); }
		public UnquotedValueContext(AttrValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterUnquotedValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitUnquotedValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitUnquotedValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionValueContext extends AttrValueContext {
		public ExpressionContext expr;
		public TerminalNode TAG_EXPR_OPEN() { return getToken(jinja2Parser.TAG_EXPR_OPEN, 0); }
		public TerminalNode EXPR_CLOSE() { return getToken(jinja2Parser.EXPR_CLOSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionValueContext(AttrValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterExpressionValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitExpressionValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitExpressionValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoubleQuotedValueContext extends AttrValueContext {
		public AttrDqContentContext attrDqContent;
		public List<AttrDqContentContext> parts = new ArrayList<AttrDqContentContext>();
		public TerminalNode TAG_DQUOTE() { return getToken(jinja2Parser.TAG_DQUOTE, 0); }
		public TerminalNode ATTR_DQ_CLOSE() { return getToken(jinja2Parser.ATTR_DQ_CLOSE, 0); }
		public List<AttrDqContentContext> attrDqContent() {
			return getRuleContexts(AttrDqContentContext.class);
		}
		public AttrDqContentContext attrDqContent(int i) {
			return getRuleContext(AttrDqContentContext.class,i);
		}
		public DoubleQuotedValueContext(AttrValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterDoubleQuotedValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitDoubleQuotedValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitDoubleQuotedValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SingleQuotedValueContext extends AttrValueContext {
		public AttrSqContentContext attrSqContent;
		public List<AttrSqContentContext> parts = new ArrayList<AttrSqContentContext>();
		public TerminalNode TAG_SQUOTE() { return getToken(jinja2Parser.TAG_SQUOTE, 0); }
		public TerminalNode ATTR_SQ_CLOSE() { return getToken(jinja2Parser.ATTR_SQ_CLOSE, 0); }
		public List<AttrSqContentContext> attrSqContent() {
			return getRuleContexts(AttrSqContentContext.class);
		}
		public AttrSqContentContext attrSqContent(int i) {
			return getRuleContext(AttrSqContentContext.class,i);
		}
		public SingleQuotedValueContext(AttrValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterSingleQuotedValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitSingleQuotedValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitSingleQuotedValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrValueContext attrValue() throws RecognitionException {
		AttrValueContext _localctx = new AttrValueContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_attrValue);
		int _la;
		try {
			setState(644);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAG_DQUOTE:
				_localctx = new DoubleQuotedValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(623);
				match(TAG_DQUOTE);
				setState(627);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6047313952768L) != 0)) {
					{
					{
					setState(624);
					((DoubleQuotedValueContext)_localctx).attrDqContent = attrDqContent();
					((DoubleQuotedValueContext)_localctx).parts.add(((DoubleQuotedValueContext)_localctx).attrDqContent);
					}
					}
					setState(629);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(630);
				match(ATTR_DQ_CLOSE);
				}
				break;
			case TAG_SQUOTE:
				_localctx = new SingleQuotedValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(631);
				match(TAG_SQUOTE);
				setState(635);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 96757023244288L) != 0)) {
					{
					{
					setState(632);
					((SingleQuotedValueContext)_localctx).attrSqContent = attrSqContent();
					((SingleQuotedValueContext)_localctx).parts.add(((SingleQuotedValueContext)_localctx).attrSqContent);
					}
					}
					setState(637);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(638);
				match(ATTR_SQ_CLOSE);
				}
				break;
			case TAG_UNQUOTED_VALUE:
				_localctx = new UnquotedValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(639);
				((UnquotedValueContext)_localctx).value = match(TAG_UNQUOTED_VALUE);
				}
				break;
			case TAG_EXPR_OPEN:
				_localctx = new ExpressionValueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(640);
				match(TAG_EXPR_OPEN);
				setState(641);
				((ExpressionValueContext)_localctx).expr = expression();
				setState(642);
				match(EXPR_CLOSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttrDqContentContext extends ParserRuleContext {
		public AttrDqContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrDqContent; }
	 
		public AttrDqContentContext() { }
		public void copyFrom(AttrDqContentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttrDqStmtContext extends AttrDqContentContext {
		public ForStartContext stmt;
		public TerminalNode ATTR_DQ_STMT_OPEN() { return getToken(jinja2Parser.ATTR_DQ_STMT_OPEN, 0); }
		public ForStartContext forStart() {
			return getRuleContext(ForStartContext.class,0);
		}
		public AttrDqStmtContext(AttrDqContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterAttrDqStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitAttrDqStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitAttrDqStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttrDqExprContext extends AttrDqContentContext {
		public ExpressionContext expr;
		public TerminalNode ATTR_DQ_EXPR_OPEN() { return getToken(jinja2Parser.ATTR_DQ_EXPR_OPEN, 0); }
		public TerminalNode EXPR_CLOSE() { return getToken(jinja2Parser.EXPR_CLOSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AttrDqExprContext(AttrDqContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterAttrDqExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitAttrDqExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitAttrDqExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttrDqTextContext extends AttrDqContentContext {
		public Token text;
		public TerminalNode ATTR_DQ_TEXT() { return getToken(jinja2Parser.ATTR_DQ_TEXT, 0); }
		public AttrDqTextContext(AttrDqContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterAttrDqText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitAttrDqText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitAttrDqText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrDqContentContext attrDqContent() throws RecognitionException {
		AttrDqContentContext _localctx = new AttrDqContentContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_attrDqContent);
		try {
			setState(653);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ATTR_DQ_TEXT:
				_localctx = new AttrDqTextContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(646);
				((AttrDqTextContext)_localctx).text = match(ATTR_DQ_TEXT);
				}
				break;
			case ATTR_DQ_EXPR_OPEN:
				_localctx = new AttrDqExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(647);
				match(ATTR_DQ_EXPR_OPEN);
				setState(648);
				((AttrDqExprContext)_localctx).expr = expression();
				setState(649);
				match(EXPR_CLOSE);
				}
				break;
			case ATTR_DQ_STMT_OPEN:
				_localctx = new AttrDqStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(651);
				match(ATTR_DQ_STMT_OPEN);
				setState(652);
				((AttrDqStmtContext)_localctx).stmt = forStart();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttrSqContentContext extends ParserRuleContext {
		public AttrSqContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrSqContent; }
	 
		public AttrSqContentContext() { }
		public void copyFrom(AttrSqContentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttrSqTextContext extends AttrSqContentContext {
		public Token text;
		public TerminalNode ATTR_SQ_TEXT() { return getToken(jinja2Parser.ATTR_SQ_TEXT, 0); }
		public AttrSqTextContext(AttrSqContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterAttrSqText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitAttrSqText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitAttrSqText(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttrSqExprContext extends AttrSqContentContext {
		public ExpressionContext expr;
		public TerminalNode ATTR_SQ_EXPR_OPEN() { return getToken(jinja2Parser.ATTR_SQ_EXPR_OPEN, 0); }
		public TerminalNode EXPR_CLOSE() { return getToken(jinja2Parser.EXPR_CLOSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AttrSqExprContext(AttrSqContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterAttrSqExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitAttrSqExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitAttrSqExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttrSqStmtContext extends AttrSqContentContext {
		public ForStartContext stmt;
		public TerminalNode ATTR_SQ_STMT_OPEN() { return getToken(jinja2Parser.ATTR_SQ_STMT_OPEN, 0); }
		public ForStartContext forStart() {
			return getRuleContext(ForStartContext.class,0);
		}
		public AttrSqStmtContext(AttrSqContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterAttrSqStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitAttrSqStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitAttrSqStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrSqContentContext attrSqContent() throws RecognitionException {
		AttrSqContentContext _localctx = new AttrSqContentContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_attrSqContent);
		try {
			setState(662);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ATTR_SQ_TEXT:
				_localctx = new AttrSqTextContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(655);
				((AttrSqTextContext)_localctx).text = match(ATTR_SQ_TEXT);
				}
				break;
			case ATTR_SQ_EXPR_OPEN:
				_localctx = new AttrSqExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(656);
				match(ATTR_SQ_EXPR_OPEN);
				setState(657);
				((AttrSqExprContext)_localctx).expr = expression();
				setState(658);
				match(EXPR_CLOSE);
				}
				break;
			case ATTR_SQ_STMT_OPEN:
				_localctx = new AttrSqStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(660);
				match(ATTR_SQ_STMT_OPEN);
				setState(661);
				((AttrSqStmtContext)_localctx).stmt = forStart();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlDoctypeContext extends ParserRuleContext {
		public TerminalNode HTML_DOCTYPE() { return getToken(jinja2Parser.HTML_DOCTYPE, 0); }
		public HtmlDoctypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlDoctype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterHtmlDoctype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitHtmlDoctype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitHtmlDoctype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlDoctypeContext htmlDoctype() throws RecognitionException {
		HtmlDoctypeContext _localctx = new HtmlDoctypeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_htmlDoctype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(664);
			match(HTML_DOCTYPE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlCommentBlockContext extends ParserRuleContext {
		public TerminalNode HTML_COMMENT() { return getToken(jinja2Parser.HTML_COMMENT, 0); }
		public HtmlCommentBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlCommentBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterHtmlCommentBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitHtmlCommentBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitHtmlCommentBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlCommentBlockContext htmlCommentBlock() throws RecognitionException {
		HtmlCommentBlockContext _localctx = new HtmlCommentBlockContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_htmlCommentBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			match(HTML_COMMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlCdataContext extends ParserRuleContext {
		public TerminalNode CDATA() { return getToken(jinja2Parser.CDATA, 0); }
		public HtmlCdataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlCdata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterHtmlCdata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitHtmlCdata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitHtmlCdata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlCdataContext htmlCdata() throws RecognitionException {
		HtmlCdataContext _localctx = new HtmlCdataContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_htmlCdata);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			match(CDATA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlEntityContext extends ParserRuleContext {
		public TerminalNode ENTITY() { return getToken(jinja2Parser.ENTITY, 0); }
		public HtmlEntityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlEntity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterHtmlEntity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitHtmlEntity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitHtmlEntity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlEntityContext htmlEntity() throws RecognitionException {
		HtmlEntityContext _localctx = new HtmlEntityContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_htmlEntity);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			match(ENTITY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlTextContext extends ParserRuleContext {
		public Token HTML_TEXT;
		public List<Token> parts = new ArrayList<Token>();
		public List<TerminalNode> HTML_TEXT() { return getTokens(jinja2Parser.HTML_TEXT); }
		public TerminalNode HTML_TEXT(int i) {
			return getToken(jinja2Parser.HTML_TEXT, i);
		}
		public HtmlTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterHtmlText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitHtmlText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitHtmlText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlTextContext htmlText() throws RecognitionException {
		HtmlTextContext _localctx = new HtmlTextContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_htmlText);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(673); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(672);
					((HtmlTextContext)_localctx).HTML_TEXT = match(HTML_TEXT);
					((HtmlTextContext)_localctx).parts.add(((HtmlTextContext)_localctx).HTML_TEXT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(675); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionBlockContext extends ParserRuleContext {
		public ExpressionContext expr;
		public TerminalNode EXPR_OPEN() { return getToken(jinja2Parser.EXPR_OPEN, 0); }
		public TerminalNode EXPR_OPEN_TRIM() { return getToken(jinja2Parser.EXPR_OPEN_TRIM, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EXPR_CLOSE() { return getToken(jinja2Parser.EXPR_CLOSE, 0); }
		public TerminalNode EXPR_CLOSE_TRIM() { return getToken(jinja2Parser.EXPR_CLOSE_TRIM, 0); }
		public List<TerminalNode> PIPE() { return getTokens(jinja2Parser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(jinja2Parser.PIPE, i);
		}
		public List<FilterContext> filter() {
			return getRuleContexts(FilterContext.class);
		}
		public FilterContext filter(int i) {
			return getRuleContext(FilterContext.class,i);
		}
		public ExpressionBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterExpressionBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitExpressionBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitExpressionBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionBlockContext expressionBlock() throws RecognitionException {
		ExpressionBlockContext _localctx = new ExpressionBlockContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_expressionBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			_la = _input.LA(1);
			if ( !(_la==EXPR_OPEN_TRIM || _la==EXPR_OPEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(678);
			((ExpressionBlockContext)_localctx).expr = expression();
			setState(683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PIPE) {
				{
				{
				setState(679);
				match(PIPE);
				setState(680);
				filter();
				}
				}
				setState(685);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(686);
			_la = _input.LA(1);
			if ( !(_la==EXPR_CLOSE_TRIM || _la==EXPR_CLOSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FilterContext extends ParserRuleContext {
		public Token name;
		public TerminalNode NAME() { return getToken(jinja2Parser.NAME, 0); }
		public TerminalNode LPAREN() { return getToken(jinja2Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(jinja2Parser.RPAREN, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public FilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitFilter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterContext filter() throws RecognitionException {
		FilterContext _localctx = new FilterContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_filter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			((FilterContext)_localctx).name = match(NAME);
			setState(694);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(689);
				match(LPAREN);
				setState(691);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 179)) & ~0x3f) == 0 && ((1L << (_la - 179)) & 16999517185L) != 0)) {
					{
					setState(690);
					argList();
					}
				}

				setState(693);
				match(RPAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public TernaryExprContext ternaryExpr() {
			return getRuleContext(TernaryExprContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
			ternaryExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TernaryExprContext extends ParserRuleContext {
		public OrExprContext value;
		public OrExprContext condition;
		public OrExprContext elseValue;
		public List<OrExprContext> orExpr() {
			return getRuleContexts(OrExprContext.class);
		}
		public OrExprContext orExpr(int i) {
			return getRuleContext(OrExprContext.class,i);
		}
		public TerminalNode IF() { return getToken(jinja2Parser.IF, 0); }
		public TerminalNode ELSE() { return getToken(jinja2Parser.ELSE, 0); }
		public TernaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternaryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterTernaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitTernaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitTernaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TernaryExprContext ternaryExpr() throws RecognitionException {
		TernaryExprContext _localctx = new TernaryExprContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_ternaryExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			((TernaryExprContext)_localctx).value = orExpr();
			setState(704);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(699);
				match(IF);
				setState(700);
				((TernaryExprContext)_localctx).condition = orExpr();
				setState(701);
				match(ELSE);
				setState(702);
				((TernaryExprContext)_localctx).elseValue = orExpr();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OrExprContext extends ParserRuleContext {
		public AndExprContext left;
		public AndExprContext right;
		public List<AndExprContext> andExpr() {
			return getRuleContexts(AndExprContext.class);
		}
		public AndExprContext andExpr(int i) {
			return getRuleContext(AndExprContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(jinja2Parser.OR); }
		public TerminalNode OR(int i) {
			return getToken(jinja2Parser.OR, i);
		}
		public OrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitOrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrExprContext orExpr() throws RecognitionException {
		OrExprContext _localctx = new OrExprContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_orExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			((OrExprContext)_localctx).left = andExpr();
			setState(711);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(707);
				match(OR);
				setState(708);
				((OrExprContext)_localctx).right = andExpr();
				}
				}
				setState(713);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AndExprContext extends ParserRuleContext {
		public NotExprContext left;
		public NotExprContext right;
		public List<NotExprContext> notExpr() {
			return getRuleContexts(NotExprContext.class);
		}
		public NotExprContext notExpr(int i) {
			return getRuleContext(NotExprContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(jinja2Parser.AND); }
		public TerminalNode AND(int i) {
			return getToken(jinja2Parser.AND, i);
		}
		public AndExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitAndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExprContext andExpr() throws RecognitionException {
		AndExprContext _localctx = new AndExprContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_andExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(714);
			((AndExprContext)_localctx).left = notExpr();
			setState(719);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(715);
				match(AND);
				setState(716);
				((AndExprContext)_localctx).right = notExpr();
				}
				}
				setState(721);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NotExprContext extends ParserRuleContext {
		public NotExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notExpr; }
	 
		public NotExprContext() { }
		public void copyFrom(NotExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotPassThroughContext extends NotExprContext {
		public ComparisonExprContext comparisonExpr() {
			return getRuleContext(ComparisonExprContext.class,0);
		}
		public NotPassThroughContext(NotExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterNotPassThrough(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitNotPassThrough(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitNotPassThrough(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotExpressionContext extends NotExprContext {
		public NotExprContext operand;
		public TerminalNode NOT() { return getToken(jinja2Parser.NOT, 0); }
		public NotExprContext notExpr() {
			return getRuleContext(NotExprContext.class,0);
		}
		public NotExpressionContext(NotExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotExprContext notExpr() throws RecognitionException {
		NotExprContext _localctx = new NotExprContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_notExpr);
		try {
			setState(725);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				_localctx = new NotExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(722);
				match(NOT);
				setState(723);
				((NotExpressionContext)_localctx).operand = notExpr();
				}
				break;
			case PLUS:
			case MINUS:
			case LPAREN:
			case LBRACK:
			case LBRACE:
			case TRUE:
			case FALSE:
			case NONE:
			case STRING:
			case NUMBER:
			case NAME:
				_localctx = new NotPassThroughContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(724);
				comparisonExpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonExprContext extends ParserRuleContext {
		public ComparisonExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonExpr; }
	 
		public ComparisonExprContext() { }
		public void copyFrom(ComparisonExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TestExpressionContext extends ComparisonExprContext {
		public AdditiveExprContext additiveExpr() {
			return getRuleContext(AdditiveExprContext.class,0);
		}
		public TestOpContext testOp() {
			return getRuleContext(TestOpContext.class,0);
		}
		public TestExpressionContext(ComparisonExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterTestExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitTestExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitTestExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompareExpressionContext extends ComparisonExprContext {
		public AdditiveExprContext left;
		public AdditiveExprContext right;
		public List<AdditiveExprContext> additiveExpr() {
			return getRuleContexts(AdditiveExprContext.class);
		}
		public AdditiveExprContext additiveExpr(int i) {
			return getRuleContext(AdditiveExprContext.class,i);
		}
		public CompOpContext compOp() {
			return getRuleContext(CompOpContext.class,0);
		}
		public CompareExpressionContext(ComparisonExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterCompareExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitCompareExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitCompareExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonExprContext comparisonExpr() throws RecognitionException {
		ComparisonExprContext _localctx = new ComparisonExprContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_comparisonExpr);
		int _la;
		try {
			setState(736);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				_localctx = new CompareExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(727);
				((CompareExpressionContext)_localctx).left = additiveExpr();
				setState(731);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 179)) & ~0x3f) == 0 && ((1L << (_la - 179)) & 507L) != 0)) {
					{
					setState(728);
					compOp();
					setState(729);
					((CompareExpressionContext)_localctx).right = additiveExpr();
					}
				}

				}
				break;
			case 2:
				_localctx = new TestExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(733);
				additiveExpr();
				setState(734);
				testOp();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompOpContext extends ParserRuleContext {
		public CompOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compOp; }
	 
		public CompOpContext() { }
		public void copyFrom(CompOpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NeqOpContext extends CompOpContext {
		public TerminalNode NEQ() { return getToken(jinja2Parser.NEQ, 0); }
		public NeqOpContext(CompOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterNeqOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitNeqOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitNeqOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InOpContext extends CompOpContext {
		public TerminalNode IN() { return getToken(jinja2Parser.IN, 0); }
		public InOpContext(CompOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterInOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitInOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitInOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GteOpContext extends CompOpContext {
		public TerminalNode GTE() { return getToken(jinja2Parser.GTE, 0); }
		public GteOpContext(CompOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterGteOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitGteOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitGteOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LteOpContext extends CompOpContext {
		public TerminalNode LTE() { return getToken(jinja2Parser.LTE, 0); }
		public LteOpContext(CompOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterLteOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitLteOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitLteOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqOpContext extends CompOpContext {
		public TerminalNode EQ() { return getToken(jinja2Parser.EQ, 0); }
		public EqOpContext(CompOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterEqOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitEqOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitEqOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GtOpContext extends CompOpContext {
		public TerminalNode GT() { return getToken(jinja2Parser.GT, 0); }
		public GtOpContext(CompOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterGtOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitGtOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitGtOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotInOpContext extends CompOpContext {
		public TerminalNode NOT() { return getToken(jinja2Parser.NOT, 0); }
		public TerminalNode IN() { return getToken(jinja2Parser.IN, 0); }
		public NotInOpContext(CompOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterNotInOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitNotInOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitNotInOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LtOpContext extends CompOpContext {
		public TerminalNode LT() { return getToken(jinja2Parser.LT, 0); }
		public LtOpContext(CompOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterLtOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitLtOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitLtOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompOpContext compOp() throws RecognitionException {
		CompOpContext _localctx = new CompOpContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_compOp);
		try {
			setState(747);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQ:
				_localctx = new EqOpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(738);
				match(EQ);
				}
				break;
			case NEQ:
				_localctx = new NeqOpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(739);
				match(NEQ);
				}
				break;
			case LT:
				_localctx = new LtOpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(740);
				match(LT);
				}
				break;
			case GT:
				_localctx = new GtOpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(741);
				match(GT);
				}
				break;
			case LTE:
				_localctx = new LteOpContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(742);
				match(LTE);
				}
				break;
			case GTE:
				_localctx = new GteOpContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(743);
				match(GTE);
				}
				break;
			case IN:
				_localctx = new InOpContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(744);
				match(IN);
				}
				break;
			case NOT:
				_localctx = new NotInOpContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(745);
				match(NOT);
				setState(746);
				match(IN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TestOpContext extends ParserRuleContext {
		public TerminalNode IS() { return getToken(jinja2Parser.IS, 0); }
		public TestNameContext testName() {
			return getRuleContext(TestNameContext.class,0);
		}
		public TerminalNode NOT() { return getToken(jinja2Parser.NOT, 0); }
		public TerminalNode LPAREN() { return getToken(jinja2Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(jinja2Parser.RPAREN, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public TestOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterTestOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitTestOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitTestOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TestOpContext testOp() throws RecognitionException {
		TestOpContext _localctx = new TestOpContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_testOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
			match(IS);
			setState(751);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(750);
				match(NOT);
				}
			}

			setState(753);
			testName();
			setState(759);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(754);
				match(LPAREN);
				setState(756);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 179)) & ~0x3f) == 0 && ((1L << (_la - 179)) & 16999517185L) != 0)) {
					{
					setState(755);
					argList();
					}
				}

				setState(758);
				match(RPAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TestNameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(jinja2Parser.NAME, 0); }
		public TestNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterTestName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitTestName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitTestName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TestNameContext testName() throws RecognitionException {
		TestNameContext _localctx = new TestNameContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_testName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(761);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveExprContext extends ParserRuleContext {
		public Token PLUS;
		public List<Token> op = new ArrayList<Token>();
		public Token MINUS;
		public Token TILDE;
		public Token _tset1324;
		public List<MultiplicativeExprContext> multiplicativeExpr() {
			return getRuleContexts(MultiplicativeExprContext.class);
		}
		public MultiplicativeExprContext multiplicativeExpr(int i) {
			return getRuleContext(MultiplicativeExprContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(jinja2Parser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(jinja2Parser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(jinja2Parser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(jinja2Parser.MINUS, i);
		}
		public List<TerminalNode> TILDE() { return getTokens(jinja2Parser.TILDE); }
		public TerminalNode TILDE(int i) {
			return getToken(jinja2Parser.TILDE, i);
		}
		public AdditiveExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterAdditiveExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitAdditiveExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitAdditiveExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExprContext additiveExpr() throws RecognitionException {
		AdditiveExprContext _localctx = new AdditiveExprContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_additiveExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(763);
			multiplicativeExpr();
			setState(768);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 189)) & ~0x3f) == 0 && ((1L << (_la - 189)) & 67L) != 0)) {
				{
				{
				{
				setState(764);
				((AdditiveExprContext)_localctx)._tset1324 = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 189)) & ~0x3f) == 0 && ((1L << (_la - 189)) & 67L) != 0)) ) {
					((AdditiveExprContext)_localctx)._tset1324 = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				((AdditiveExprContext)_localctx).op.add(((AdditiveExprContext)_localctx)._tset1324);
				}
				setState(765);
				multiplicativeExpr();
				}
				}
				setState(770);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeExprContext extends ParserRuleContext {
		public Token STAR;
		public List<Token> op = new ArrayList<Token>();
		public Token SLASH;
		public Token FLOORDIV;
		public Token MOD;
		public Token _tset1354;
		public List<PowerExprContext> powerExpr() {
			return getRuleContexts(PowerExprContext.class);
		}
		public PowerExprContext powerExpr(int i) {
			return getRuleContext(PowerExprContext.class,i);
		}
		public List<TerminalNode> STAR() { return getTokens(jinja2Parser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(jinja2Parser.STAR, i);
		}
		public List<TerminalNode> SLASH() { return getTokens(jinja2Parser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(jinja2Parser.SLASH, i);
		}
		public List<TerminalNode> FLOORDIV() { return getTokens(jinja2Parser.FLOORDIV); }
		public TerminalNode FLOORDIV(int i) {
			return getToken(jinja2Parser.FLOORDIV, i);
		}
		public List<TerminalNode> MOD() { return getTokens(jinja2Parser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(jinja2Parser.MOD, i);
		}
		public MultiplicativeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterMultiplicativeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitMultiplicativeExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitMultiplicativeExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExprContext multiplicativeExpr() throws RecognitionException {
		MultiplicativeExprContext _localctx = new MultiplicativeExprContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_multiplicativeExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(771);
			powerExpr();
			setState(776);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 191)) & ~0x3f) == 0 && ((1L << (_la - 191)) & 15L) != 0)) {
				{
				{
				{
				setState(772);
				((MultiplicativeExprContext)_localctx)._tset1354 = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 191)) & ~0x3f) == 0 && ((1L << (_la - 191)) & 15L) != 0)) ) {
					((MultiplicativeExprContext)_localctx)._tset1354 = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				((MultiplicativeExprContext)_localctx).op.add(((MultiplicativeExprContext)_localctx)._tset1354);
				}
				setState(773);
				powerExpr();
				}
				}
				setState(778);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PowerExprContext extends ParserRuleContext {
		public UnaryExprContext base;
		public PowerExprContext exponent;
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public TerminalNode POW() { return getToken(jinja2Parser.POW, 0); }
		public PowerExprContext powerExpr() {
			return getRuleContext(PowerExprContext.class,0);
		}
		public PowerExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_powerExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterPowerExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitPowerExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitPowerExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PowerExprContext powerExpr() throws RecognitionException {
		PowerExprContext _localctx = new PowerExprContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_powerExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(779);
			((PowerExprContext)_localctx).base = unaryExpr();
			setState(782);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POW) {
				{
				setState(780);
				match(POW);
				setState(781);
				((PowerExprContext)_localctx).exponent = powerExpr();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExprContext extends ParserRuleContext {
		public UnaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpr; }
	 
		public UnaryExprContext() { }
		public void copyFrom(UnaryExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExpressionContext extends UnaryExprContext {
		public Token op;
		public UnaryExprContext operand;
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(jinja2Parser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(jinja2Parser.PLUS, 0); }
		public UnaryExpressionContext(UnaryExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryPassThroughContext extends UnaryExprContext {
		public PostfixExprContext postfixExpr() {
			return getRuleContext(PostfixExprContext.class,0);
		}
		public UnaryPassThroughContext(UnaryExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterUnaryPassThrough(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitUnaryPassThrough(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitUnaryPassThrough(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExprContext unaryExpr() throws RecognitionException {
		UnaryExprContext _localctx = new UnaryExprContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_unaryExpr);
		int _la;
		try {
			setState(787);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
				_localctx = new UnaryExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(784);
				((UnaryExpressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((UnaryExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(785);
				((UnaryExpressionContext)_localctx).operand = unaryExpr();
				}
				break;
			case LPAREN:
			case LBRACK:
			case LBRACE:
			case TRUE:
			case FALSE:
			case NONE:
			case STRING:
			case NUMBER:
			case NAME:
				_localctx = new UnaryPassThroughContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(786);
				postfixExpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PostfixExprContext extends ParserRuleContext {
		public PrimaryExprContext object;
		public PostfixOpContext postfixOp;
		public List<PostfixOpContext> ops = new ArrayList<PostfixOpContext>();
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public List<PostfixOpContext> postfixOp() {
			return getRuleContexts(PostfixOpContext.class);
		}
		public PostfixOpContext postfixOp(int i) {
			return getRuleContext(PostfixOpContext.class,i);
		}
		public PostfixExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterPostfixExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitPostfixExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitPostfixExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixExprContext postfixExpr() throws RecognitionException {
		PostfixExprContext _localctx = new PostfixExprContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_postfixExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(789);
			((PostfixExprContext)_localctx).object = primaryExpr();
			setState(793);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 196)) & ~0x3f) == 0 && ((1L << (_la - 196)) & 161L) != 0)) {
				{
				{
				setState(790);
				((PostfixExprContext)_localctx).postfixOp = postfixOp();
				((PostfixExprContext)_localctx).ops.add(((PostfixExprContext)_localctx).postfixOp);
				}
				}
				setState(795);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PostfixOpContext extends ParserRuleContext {
		public PostfixOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixOp; }
	 
		public PostfixOpContext() { }
		public void copyFrom(PostfixOpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CallOpContext extends PostfixOpContext {
		public ArgListContext args;
		public TerminalNode LPAREN() { return getToken(jinja2Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(jinja2Parser.RPAREN, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public CallOpContext(PostfixOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterCallOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitCallOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitCallOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IndexAccessOpContext extends PostfixOpContext {
		public ExpressionContext index;
		public TerminalNode LBRACK() { return getToken(jinja2Parser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(jinja2Parser.RBRACK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IndexAccessOpContext(PostfixOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterIndexAccessOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitIndexAccessOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitIndexAccessOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DotAccessOpContext extends PostfixOpContext {
		public Token name;
		public TerminalNode DOT() { return getToken(jinja2Parser.DOT, 0); }
		public TerminalNode NAME() { return getToken(jinja2Parser.NAME, 0); }
		public DotAccessOpContext(PostfixOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterDotAccessOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitDotAccessOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitDotAccessOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SliceAccessOpContext extends PostfixOpContext {
		public ExpressionContext start;
		public ExpressionContext stop;
		public ExpressionContext step;
		public TerminalNode LBRACK() { return getToken(jinja2Parser.LBRACK, 0); }
		public List<TerminalNode> COLON() { return getTokens(jinja2Parser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(jinja2Parser.COLON, i);
		}
		public TerminalNode RBRACK() { return getToken(jinja2Parser.RBRACK, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SliceAccessOpContext(PostfixOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterSliceAccessOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitSliceAccessOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitSliceAccessOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixOpContext postfixOp() throws RecognitionException {
		PostfixOpContext _localctx = new PostfixOpContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_postfixOp);
		int _la;
		try {
			setState(822);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				_localctx = new DotAccessOpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(796);
				match(DOT);
				setState(797);
				((DotAccessOpContext)_localctx).name = match(NAME);
				}
				break;
			case 2:
				_localctx = new IndexAccessOpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(798);
				match(LBRACK);
				setState(799);
				((IndexAccessOpContext)_localctx).index = expression();
				setState(800);
				match(RBRACK);
				}
				break;
			case 3:
				_localctx = new SliceAccessOpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(802);
				match(LBRACK);
				setState(804);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 179)) & ~0x3f) == 0 && ((1L << (_la - 179)) & 16999517185L) != 0)) {
					{
					setState(803);
					((SliceAccessOpContext)_localctx).start = expression();
					}
				}

				setState(806);
				match(COLON);
				setState(808);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 179)) & ~0x3f) == 0 && ((1L << (_la - 179)) & 16999517185L) != 0)) {
					{
					setState(807);
					((SliceAccessOpContext)_localctx).stop = expression();
					}
				}

				setState(814);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(810);
					match(COLON);
					setState(812);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 179)) & ~0x3f) == 0 && ((1L << (_la - 179)) & 16999517185L) != 0)) {
						{
						setState(811);
						((SliceAccessOpContext)_localctx).step = expression();
						}
					}

					}
				}

				setState(816);
				match(RBRACK);
				}
				break;
			case 4:
				_localctx = new CallOpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(817);
				match(LPAREN);
				setState(819);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 179)) & ~0x3f) == 0 && ((1L << (_la - 179)) & 16999517185L) != 0)) {
					{
					setState(818);
					((CallOpContext)_localctx).args = argList();
					}
				}

				setState(821);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExprContext extends ParserRuleContext {
		public PrimaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpr; }
	 
		public PrimaryExprContext() { }
		public void copyFrom(PrimaryExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralContext extends PrimaryExprContext {
		public TerminalNode STRING() { return getToken(jinja2Parser.STRING, 0); }
		public StringLiteralContext(PrimaryExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TrueLiteralContext extends PrimaryExprContext {
		public TerminalNode TRUE() { return getToken(jinja2Parser.TRUE, 0); }
		public TrueLiteralContext(PrimaryExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterTrueLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitTrueLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitTrueLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NoneLiteralContext extends PrimaryExprContext {
		public TerminalNode NONE() { return getToken(jinja2Parser.NONE, 0); }
		public NoneLiteralContext(PrimaryExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterNoneLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitNoneLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitNoneLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableExprContext extends PrimaryExprContext {
		public TerminalNode NAME() { return getToken(jinja2Parser.NAME, 0); }
		public VariableExprContext(PrimaryExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterVariableExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitVariableExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitVariableExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DictExprContext extends PrimaryExprContext {
		public DictContext dict() {
			return getRuleContext(DictContext.class,0);
		}
		public DictExprContext(PrimaryExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterDictExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitDictExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitDictExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListExprContext extends PrimaryExprContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ListExprContext(PrimaryExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterListExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitListExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitListExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenExprContext extends PrimaryExprContext {
		public TerminalNode LPAREN() { return getToken(jinja2Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(jinja2Parser.RPAREN, 0); }
		public ParenExprContext(PrimaryExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitParenExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberLiteralContext extends PrimaryExprContext {
		public TerminalNode NUMBER() { return getToken(jinja2Parser.NUMBER, 0); }
		public NumberLiteralContext(PrimaryExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterNumberLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitNumberLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitNumberLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FalseLiteralContext extends PrimaryExprContext {
		public TerminalNode FALSE() { return getToken(jinja2Parser.FALSE, 0); }
		public FalseLiteralContext(PrimaryExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterFalseLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitFalseLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitFalseLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExprContext primaryExpr() throws RecognitionException {
		PrimaryExprContext _localctx = new PrimaryExprContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_primaryExpr);
		try {
			setState(836);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new NumberLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(824);
				match(NUMBER);
				}
				break;
			case STRING:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(825);
				match(STRING);
				}
				break;
			case TRUE:
				_localctx = new TrueLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(826);
				match(TRUE);
				}
				break;
			case FALSE:
				_localctx = new FalseLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(827);
				match(FALSE);
				}
				break;
			case NONE:
				_localctx = new NoneLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(828);
				match(NONE);
				}
				break;
			case NAME:
				_localctx = new VariableExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(829);
				match(NAME);
				}
				break;
			case LBRACK:
				_localctx = new ListExprContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(830);
				list();
				}
				break;
			case LBRACE:
				_localctx = new DictExprContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(831);
				dict();
				}
				break;
			case LPAREN:
				_localctx = new ParenExprContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(832);
				match(LPAREN);
				setState(833);
				expression();
				setState(834);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> elements = new ArrayList<ExpressionContext>();
		public TerminalNode LBRACK() { return getToken(jinja2Parser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(jinja2Parser.RBRACK, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(jinja2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(jinja2Parser.COMMA, i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(838);
			match(LBRACK);
			setState(850);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 179)) & ~0x3f) == 0 && ((1L << (_la - 179)) & 16999517185L) != 0)) {
				{
				setState(839);
				((ListContext)_localctx).expression = expression();
				((ListContext)_localctx).elements.add(((ListContext)_localctx).expression);
				setState(844);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(840);
						match(COMMA);
						setState(841);
						((ListContext)_localctx).expression = expression();
						((ListContext)_localctx).elements.add(((ListContext)_localctx).expression);
						}
						} 
					}
					setState(846);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				}
				setState(848);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(847);
					match(COMMA);
					}
				}

				}
			}

			setState(852);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DictContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(jinja2Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(jinja2Parser.RBRACE, 0); }
		public List<DictEntryContext> dictEntry() {
			return getRuleContexts(DictEntryContext.class);
		}
		public DictEntryContext dictEntry(int i) {
			return getRuleContext(DictEntryContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(jinja2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(jinja2Parser.COMMA, i);
		}
		public DictContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dict; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterDict(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitDict(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitDict(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictContext dict() throws RecognitionException {
		DictContext _localctx = new DictContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_dict);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(854);
			match(LBRACE);
			setState(866);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 179)) & ~0x3f) == 0 && ((1L << (_la - 179)) & 16999517185L) != 0)) {
				{
				setState(855);
				dictEntry();
				setState(860);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(856);
						match(COMMA);
						setState(857);
						dictEntry();
						}
						} 
					}
					setState(862);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
				}
				setState(864);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(863);
					match(COMMA);
					}
				}

				}
			}

			setState(868);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DictEntryContext extends ParserRuleContext {
		public ExpressionContext key;
		public ExpressionContext value;
		public TerminalNode COLON() { return getToken(jinja2Parser.COLON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public DictEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictEntry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterDictEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitDictEntry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitDictEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictEntryContext dictEntry() throws RecognitionException {
		DictEntryContext _localctx = new DictEntryContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_dictEntry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(870);
			((DictEntryContext)_localctx).key = expression();
			setState(871);
			match(COLON);
			setState(872);
			((DictEntryContext)_localctx).value = expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgListContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(jinja2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(jinja2Parser.COMMA, i);
		}
		public ArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitArgList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitArgList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgListContext argList() throws RecognitionException {
		ArgListContext _localctx = new ArgListContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_argList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(874);
			argument();
			setState(879);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(875);
				match(COMMA);
				setState(876);
				argument();
				}
				}
				setState(881);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentContext extends ParserRuleContext {
		public Token name;
		public ExpressionContext value;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(jinja2Parser.ASSIGN, 0); }
		public TerminalNode NAME() { return getToken(jinja2Parser.NAME, 0); }
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(884);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(882);
				((ArgumentContext)_localctx).name = match(NAME);
				setState(883);
				match(ASSIGN);
				}
				break;
			}
			setState(886);
			((ArgumentContext)_localctx).value = expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForBlockContext extends ParserRuleContext {
		public TemplateContentContext templateContent;
		public List<TemplateContentContext> body = new ArrayList<TemplateContentContext>();
		public ForStartContext forStart() {
			return getRuleContext(ForStartContext.class,0);
		}
		public ForEndContext forEnd() {
			return getRuleContext(ForEndContext.class,0);
		}
		public ElseForBranchContext elseForBranch() {
			return getRuleContext(ElseForBranchContext.class,0);
		}
		public List<TemplateContentContext> templateContent() {
			return getRuleContexts(TemplateContentContext.class);
		}
		public TemplateContentContext templateContent(int i) {
			return getRuleContext(TemplateContentContext.class,i);
		}
		public ForBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterForBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitForBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitForBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForBlockContext forBlock() throws RecognitionException {
		ForBlockContext _localctx = new ForBlockContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_forBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(888);
			forStart();
			setState(892);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(889);
					((ForBlockContext)_localctx).templateContent = templateContent();
					((ForBlockContext)_localctx).body.add(((ForBlockContext)_localctx).templateContent);
					}
					} 
				}
				setState(894);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			}
			setState(896);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(895);
				elseForBranch();
				}
				break;
			}
			setState(898);
			forEnd();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForStartContext extends ParserRuleContext {
		public ForTargetContext target;
		public ExpressionContext iterable;
		public ExpressionContext condition;
		public TerminalNode FOR() { return getToken(jinja2Parser.FOR, 0); }
		public TerminalNode IN() { return getToken(jinja2Parser.IN, 0); }
		public TerminalNode STMT_OPEN() { return getToken(jinja2Parser.STMT_OPEN, 0); }
		public TerminalNode STMT_OPEN_TRIM() { return getToken(jinja2Parser.STMT_OPEN_TRIM, 0); }
		public ForTargetContext forTarget() {
			return getRuleContext(ForTargetContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode STMT_CLOSE() { return getToken(jinja2Parser.STMT_CLOSE, 0); }
		public TerminalNode STMT_CLOSE_TRIM() { return getToken(jinja2Parser.STMT_CLOSE_TRIM, 0); }
		public TerminalNode IF() { return getToken(jinja2Parser.IF, 0); }
		public ForStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterForStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitForStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitForStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStartContext forStart() throws RecognitionException {
		ForStartContext _localctx = new ForStartContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_forStart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(900);
			_la = _input.LA(1);
			if ( !(_la==STMT_OPEN_TRIM || _la==STMT_OPEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(901);
			match(FOR);
			setState(902);
			((ForStartContext)_localctx).target = forTarget();
			setState(903);
			match(IN);
			setState(904);
			((ForStartContext)_localctx).iterable = expression();
			setState(907);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(905);
				match(IF);
				setState(906);
				((ForStartContext)_localctx).condition = expression();
				}
			}

			setState(909);
			_la = _input.LA(1);
			if ( !(_la==STMT_CLOSE_TRIM || _la==STMT_CLOSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForTargetContext extends ParserRuleContext {
		public ForTargetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forTarget; }
	 
		public ForTargetContext() { }
		public void copyFrom(ForTargetContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TupleTargetContext extends ForTargetContext {
		public List<TerminalNode> NAME() { return getTokens(jinja2Parser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(jinja2Parser.NAME, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(jinja2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(jinja2Parser.COMMA, i);
		}
		public TupleTargetContext(ForTargetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterTupleTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitTupleTarget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitTupleTarget(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SingleTargetContext extends ForTargetContext {
		public TerminalNode NAME() { return getToken(jinja2Parser.NAME, 0); }
		public SingleTargetContext(ForTargetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterSingleTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitSingleTarget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitSingleTarget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForTargetContext forTarget() throws RecognitionException {
		ForTargetContext _localctx = new ForTargetContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_forTarget);
		int _la;
		try {
			setState(919);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				_localctx = new SingleTargetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(911);
				match(NAME);
				}
				break;
			case 2:
				_localctx = new TupleTargetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(912);
				match(NAME);
				setState(915); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(913);
					match(COMMA);
					setState(914);
					match(NAME);
					}
					}
					setState(917); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElseForBranchContext extends ParserRuleContext {
		public TemplateContentContext templateContent;
		public List<TemplateContentContext> body = new ArrayList<TemplateContentContext>();
		public TerminalNode ELSE() { return getToken(jinja2Parser.ELSE, 0); }
		public TerminalNode STMT_OPEN() { return getToken(jinja2Parser.STMT_OPEN, 0); }
		public TerminalNode STMT_OPEN_TRIM() { return getToken(jinja2Parser.STMT_OPEN_TRIM, 0); }
		public TerminalNode STMT_CLOSE() { return getToken(jinja2Parser.STMT_CLOSE, 0); }
		public TerminalNode STMT_CLOSE_TRIM() { return getToken(jinja2Parser.STMT_CLOSE_TRIM, 0); }
		public List<TemplateContentContext> templateContent() {
			return getRuleContexts(TemplateContentContext.class);
		}
		public TemplateContentContext templateContent(int i) {
			return getRuleContext(TemplateContentContext.class,i);
		}
		public ElseForBranchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseForBranch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterElseForBranch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitElseForBranch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitElseForBranch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseForBranchContext elseForBranch() throws RecognitionException {
		ElseForBranchContext _localctx = new ElseForBranchContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_elseForBranch);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(921);
			_la = _input.LA(1);
			if ( !(_la==STMT_OPEN_TRIM || _la==STMT_OPEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(922);
			match(ELSE);
			setState(923);
			_la = _input.LA(1);
			if ( !(_la==STMT_CLOSE_TRIM || _la==STMT_CLOSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(927);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(924);
					((ElseForBranchContext)_localctx).templateContent = templateContent();
					((ElseForBranchContext)_localctx).body.add(((ElseForBranchContext)_localctx).templateContent);
					}
					} 
				}
				setState(929);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForEndContext extends ParserRuleContext {
		public TerminalNode ENDFOR() { return getToken(jinja2Parser.ENDFOR, 0); }
		public TerminalNode STMT_OPEN() { return getToken(jinja2Parser.STMT_OPEN, 0); }
		public TerminalNode STMT_OPEN_TRIM() { return getToken(jinja2Parser.STMT_OPEN_TRIM, 0); }
		public TerminalNode STMT_CLOSE() { return getToken(jinja2Parser.STMT_CLOSE, 0); }
		public TerminalNode STMT_CLOSE_TRIM() { return getToken(jinja2Parser.STMT_CLOSE_TRIM, 0); }
		public ForEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterForEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitForEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitForEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForEndContext forEnd() throws RecognitionException {
		ForEndContext _localctx = new ForEndContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_forEnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(930);
			_la = _input.LA(1);
			if ( !(_la==STMT_OPEN_TRIM || _la==STMT_OPEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(931);
			match(ENDFOR);
			setState(932);
			_la = _input.LA(1);
			if ( !(_la==STMT_CLOSE_TRIM || _la==STMT_CLOSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfBlockContext extends ParserRuleContext {
		public TemplateContentContext templateContent;
		public List<TemplateContentContext> body = new ArrayList<TemplateContentContext>();
		public IfStartContext ifStart() {
			return getRuleContext(IfStartContext.class,0);
		}
		public IfEndContext ifEnd() {
			return getRuleContext(IfEndContext.class,0);
		}
		public List<ElifBranchContext> elifBranch() {
			return getRuleContexts(ElifBranchContext.class);
		}
		public ElifBranchContext elifBranch(int i) {
			return getRuleContext(ElifBranchContext.class,i);
		}
		public ElseBranchContext elseBranch() {
			return getRuleContext(ElseBranchContext.class,0);
		}
		public List<TemplateContentContext> templateContent() {
			return getRuleContexts(TemplateContentContext.class);
		}
		public TemplateContentContext templateContent(int i) {
			return getRuleContext(TemplateContentContext.class,i);
		}
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitIfBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_ifBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(934);
			ifStart();
			setState(938);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(935);
					((IfBlockContext)_localctx).templateContent = templateContent();
					((IfBlockContext)_localctx).body.add(((IfBlockContext)_localctx).templateContent);
					}
					} 
				}
				setState(940);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			}
			setState(944);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(941);
					elifBranch();
					}
					} 
				}
				setState(946);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			}
			setState(948);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(947);
				elseBranch();
				}
				break;
			}
			setState(950);
			ifEnd();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStartContext extends ParserRuleContext {
		public ExpressionContext condition;
		public TerminalNode IF() { return getToken(jinja2Parser.IF, 0); }
		public TerminalNode STMT_OPEN() { return getToken(jinja2Parser.STMT_OPEN, 0); }
		public TerminalNode STMT_OPEN_TRIM() { return getToken(jinja2Parser.STMT_OPEN_TRIM, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode STMT_CLOSE() { return getToken(jinja2Parser.STMT_CLOSE, 0); }
		public TerminalNode STMT_CLOSE_TRIM() { return getToken(jinja2Parser.STMT_CLOSE_TRIM, 0); }
		public IfStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterIfStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitIfStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitIfStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStartContext ifStart() throws RecognitionException {
		IfStartContext _localctx = new IfStartContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_ifStart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(952);
			_la = _input.LA(1);
			if ( !(_la==STMT_OPEN_TRIM || _la==STMT_OPEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(953);
			match(IF);
			setState(954);
			((IfStartContext)_localctx).condition = expression();
			setState(955);
			_la = _input.LA(1);
			if ( !(_la==STMT_CLOSE_TRIM || _la==STMT_CLOSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElifBranchContext extends ParserRuleContext {
		public ExpressionContext condition;
		public TemplateContentContext templateContent;
		public List<TemplateContentContext> body = new ArrayList<TemplateContentContext>();
		public TerminalNode ELIF() { return getToken(jinja2Parser.ELIF, 0); }
		public TerminalNode STMT_OPEN() { return getToken(jinja2Parser.STMT_OPEN, 0); }
		public TerminalNode STMT_OPEN_TRIM() { return getToken(jinja2Parser.STMT_OPEN_TRIM, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode STMT_CLOSE() { return getToken(jinja2Parser.STMT_CLOSE, 0); }
		public TerminalNode STMT_CLOSE_TRIM() { return getToken(jinja2Parser.STMT_CLOSE_TRIM, 0); }
		public List<TemplateContentContext> templateContent() {
			return getRuleContexts(TemplateContentContext.class);
		}
		public TemplateContentContext templateContent(int i) {
			return getRuleContext(TemplateContentContext.class,i);
		}
		public ElifBranchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elifBranch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterElifBranch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitElifBranch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitElifBranch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElifBranchContext elifBranch() throws RecognitionException {
		ElifBranchContext _localctx = new ElifBranchContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_elifBranch);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(957);
			_la = _input.LA(1);
			if ( !(_la==STMT_OPEN_TRIM || _la==STMT_OPEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(958);
			match(ELIF);
			setState(959);
			((ElifBranchContext)_localctx).condition = expression();
			setState(960);
			_la = _input.LA(1);
			if ( !(_la==STMT_CLOSE_TRIM || _la==STMT_CLOSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(964);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(961);
					((ElifBranchContext)_localctx).templateContent = templateContent();
					((ElifBranchContext)_localctx).body.add(((ElifBranchContext)_localctx).templateContent);
					}
					} 
				}
				setState(966);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElseBranchContext extends ParserRuleContext {
		public TemplateContentContext templateContent;
		public List<TemplateContentContext> body = new ArrayList<TemplateContentContext>();
		public TerminalNode ELSE() { return getToken(jinja2Parser.ELSE, 0); }
		public TerminalNode STMT_OPEN() { return getToken(jinja2Parser.STMT_OPEN, 0); }
		public TerminalNode STMT_OPEN_TRIM() { return getToken(jinja2Parser.STMT_OPEN_TRIM, 0); }
		public TerminalNode STMT_CLOSE() { return getToken(jinja2Parser.STMT_CLOSE, 0); }
		public TerminalNode STMT_CLOSE_TRIM() { return getToken(jinja2Parser.STMT_CLOSE_TRIM, 0); }
		public List<TemplateContentContext> templateContent() {
			return getRuleContexts(TemplateContentContext.class);
		}
		public TemplateContentContext templateContent(int i) {
			return getRuleContext(TemplateContentContext.class,i);
		}
		public ElseBranchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseBranch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterElseBranch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitElseBranch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitElseBranch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseBranchContext elseBranch() throws RecognitionException {
		ElseBranchContext _localctx = new ElseBranchContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_elseBranch);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(967);
			_la = _input.LA(1);
			if ( !(_la==STMT_OPEN_TRIM || _la==STMT_OPEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(968);
			match(ELSE);
			setState(969);
			_la = _input.LA(1);
			if ( !(_la==STMT_CLOSE_TRIM || _la==STMT_CLOSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(973);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(970);
					((ElseBranchContext)_localctx).templateContent = templateContent();
					((ElseBranchContext)_localctx).body.add(((ElseBranchContext)_localctx).templateContent);
					}
					} 
				}
				setState(975);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfEndContext extends ParserRuleContext {
		public TerminalNode ENDIF() { return getToken(jinja2Parser.ENDIF, 0); }
		public TerminalNode STMT_OPEN() { return getToken(jinja2Parser.STMT_OPEN, 0); }
		public TerminalNode STMT_OPEN_TRIM() { return getToken(jinja2Parser.STMT_OPEN_TRIM, 0); }
		public TerminalNode STMT_CLOSE() { return getToken(jinja2Parser.STMT_CLOSE, 0); }
		public TerminalNode STMT_CLOSE_TRIM() { return getToken(jinja2Parser.STMT_CLOSE_TRIM, 0); }
		public IfEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterIfEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitIfEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitIfEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfEndContext ifEnd() throws RecognitionException {
		IfEndContext _localctx = new IfEndContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_ifEnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(976);
			_la = _input.LA(1);
			if ( !(_la==STMT_OPEN_TRIM || _la==STMT_OPEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(977);
			match(ENDIF);
			setState(978);
			_la = _input.LA(1);
			if ( !(_la==STMT_CLOSE_TRIM || _la==STMT_CLOSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExtendsStatementContext extends ParserRuleContext {
		public Token templateName;
		public TerminalNode EXTENDS() { return getToken(jinja2Parser.EXTENDS, 0); }
		public TerminalNode STMT_OPEN() { return getToken(jinja2Parser.STMT_OPEN, 0); }
		public TerminalNode STMT_OPEN_TRIM() { return getToken(jinja2Parser.STMT_OPEN_TRIM, 0); }
		public TerminalNode STRING() { return getToken(jinja2Parser.STRING, 0); }
		public TerminalNode STMT_CLOSE() { return getToken(jinja2Parser.STMT_CLOSE, 0); }
		public TerminalNode STMT_CLOSE_TRIM() { return getToken(jinja2Parser.STMT_CLOSE_TRIM, 0); }
		public ExtendsStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendsStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterExtendsStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitExtendsStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitExtendsStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtendsStatementContext extendsStatement() throws RecognitionException {
		ExtendsStatementContext _localctx = new ExtendsStatementContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_extendsStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(980);
			_la = _input.LA(1);
			if ( !(_la==STMT_OPEN_TRIM || _la==STMT_OPEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(981);
			match(EXTENDS);
			setState(982);
			((ExtendsStatementContext)_localctx).templateName = match(STRING);
			setState(983);
			_la = _input.LA(1);
			if ( !(_la==STMT_CLOSE_TRIM || _la==STMT_CLOSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IncludeStatementContext extends ParserRuleContext {
		public Token templateName;
		public Token ignoreMissing;
		public Token contextMode;
		public TerminalNode INCLUDE() { return getToken(jinja2Parser.INCLUDE, 0); }
		public TerminalNode STMT_OPEN() { return getToken(jinja2Parser.STMT_OPEN, 0); }
		public TerminalNode STMT_OPEN_TRIM() { return getToken(jinja2Parser.STMT_OPEN_TRIM, 0); }
		public TerminalNode STRING() { return getToken(jinja2Parser.STRING, 0); }
		public TerminalNode STMT_CLOSE() { return getToken(jinja2Parser.STMT_CLOSE, 0); }
		public TerminalNode STMT_CLOSE_TRIM() { return getToken(jinja2Parser.STMT_CLOSE_TRIM, 0); }
		public TerminalNode MISSING() { return getToken(jinja2Parser.MISSING, 0); }
		public TerminalNode CONTEXT() { return getToken(jinja2Parser.CONTEXT, 0); }
		public TerminalNode IGNORE() { return getToken(jinja2Parser.IGNORE, 0); }
		public TerminalNode WITH() { return getToken(jinja2Parser.WITH, 0); }
		public TerminalNode WITHOUT() { return getToken(jinja2Parser.WITHOUT, 0); }
		public IncludeStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_includeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterIncludeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitIncludeStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitIncludeStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncludeStatementContext includeStatement() throws RecognitionException {
		IncludeStatementContext _localctx = new IncludeStatementContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_includeStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(985);
			_la = _input.LA(1);
			if ( !(_la==STMT_OPEN_TRIM || _la==STMT_OPEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(986);
			match(INCLUDE);
			setState(987);
			((IncludeStatementContext)_localctx).templateName = match(STRING);
			setState(990);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IGNORE) {
				{
				setState(988);
				((IncludeStatementContext)_localctx).ignoreMissing = match(IGNORE);
				setState(989);
				match(MISSING);
				}
			}

			setState(994);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH || _la==WITHOUT) {
				{
				setState(992);
				((IncludeStatementContext)_localctx).contextMode = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==WITH || _la==WITHOUT) ) {
					((IncludeStatementContext)_localctx).contextMode = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(993);
				match(CONTEXT);
				}
			}

			setState(996);
			_la = _input.LA(1);
			if ( !(_la==STMT_CLOSE_TRIM || _la==STMT_CLOSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockDefinitionContext extends ParserRuleContext {
		public Token name;
		public Token scoped;
		public TemplateContentContext templateContent;
		public List<TemplateContentContext> body = new ArrayList<TemplateContentContext>();
		public TerminalNode BLOCK() { return getToken(jinja2Parser.BLOCK, 0); }
		public TerminalNode ENDBLOCK() { return getToken(jinja2Parser.ENDBLOCK, 0); }
		public List<TerminalNode> STMT_OPEN() { return getTokens(jinja2Parser.STMT_OPEN); }
		public TerminalNode STMT_OPEN(int i) {
			return getToken(jinja2Parser.STMT_OPEN, i);
		}
		public List<TerminalNode> STMT_OPEN_TRIM() { return getTokens(jinja2Parser.STMT_OPEN_TRIM); }
		public TerminalNode STMT_OPEN_TRIM(int i) {
			return getToken(jinja2Parser.STMT_OPEN_TRIM, i);
		}
		public List<TerminalNode> NAME() { return getTokens(jinja2Parser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(jinja2Parser.NAME, i);
		}
		public List<TerminalNode> STMT_CLOSE() { return getTokens(jinja2Parser.STMT_CLOSE); }
		public TerminalNode STMT_CLOSE(int i) {
			return getToken(jinja2Parser.STMT_CLOSE, i);
		}
		public List<TerminalNode> STMT_CLOSE_TRIM() { return getTokens(jinja2Parser.STMT_CLOSE_TRIM); }
		public TerminalNode STMT_CLOSE_TRIM(int i) {
			return getToken(jinja2Parser.STMT_CLOSE_TRIM, i);
		}
		public TerminalNode SCOPED() { return getToken(jinja2Parser.SCOPED, 0); }
		public List<TemplateContentContext> templateContent() {
			return getRuleContexts(TemplateContentContext.class);
		}
		public TemplateContentContext templateContent(int i) {
			return getRuleContext(TemplateContentContext.class,i);
		}
		public BlockDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterBlockDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitBlockDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitBlockDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockDefinitionContext blockDefinition() throws RecognitionException {
		BlockDefinitionContext _localctx = new BlockDefinitionContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_blockDefinition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(998);
			_la = _input.LA(1);
			if ( !(_la==STMT_OPEN_TRIM || _la==STMT_OPEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(999);
			match(BLOCK);
			setState(1000);
			((BlockDefinitionContext)_localctx).name = match(NAME);
			setState(1002);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SCOPED) {
				{
				setState(1001);
				((BlockDefinitionContext)_localctx).scoped = match(SCOPED);
				}
			}

			setState(1004);
			_la = _input.LA(1);
			if ( !(_la==STMT_CLOSE_TRIM || _la==STMT_CLOSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1008);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1005);
					((BlockDefinitionContext)_localctx).templateContent = templateContent();
					((BlockDefinitionContext)_localctx).body.add(((BlockDefinitionContext)_localctx).templateContent);
					}
					} 
				}
				setState(1010);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			}
			setState(1011);
			_la = _input.LA(1);
			if ( !(_la==STMT_OPEN_TRIM || _la==STMT_OPEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1012);
			match(ENDBLOCK);
			setState(1014);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(1013);
				match(NAME);
				}
			}

			setState(1016);
			_la = _input.LA(1);
			if ( !(_la==STMT_CLOSE_TRIM || _la==STMT_CLOSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetTargetContext extends ParserRuleContext {
		public SetTargetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setTarget; }
	 
		public SetTargetContext() { }
		public void copyFrom(SetTargetContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleTargetContext extends SetTargetContext {
		public Token name;
		public TerminalNode NAME() { return getToken(jinja2Parser.NAME, 0); }
		public SimpleTargetContext(SetTargetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterSimpleTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitSimpleTarget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitSimpleTarget(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NamespaceTargetContext extends SetTargetContext {
		public Token namespace;
		public Token NAME;
		public List<Token> attributes = new ArrayList<Token>();
		public List<TerminalNode> NAME() { return getTokens(jinja2Parser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(jinja2Parser.NAME, i);
		}
		public List<TerminalNode> DOT() { return getTokens(jinja2Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(jinja2Parser.DOT, i);
		}
		public NamespaceTargetContext(SetTargetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterNamespaceTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitNamespaceTarget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitNamespaceTarget(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TupleSetTargetContext extends SetTargetContext {
		public Token first;
		public Token NAME;
		public List<Token> rest = new ArrayList<Token>();
		public List<TerminalNode> NAME() { return getTokens(jinja2Parser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(jinja2Parser.NAME, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(jinja2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(jinja2Parser.COMMA, i);
		}
		public TupleSetTargetContext(SetTargetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterTupleSetTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitTupleSetTarget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitTupleSetTarget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetTargetContext setTarget() throws RecognitionException {
		SetTargetContext _localctx = new SetTargetContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_setTarget);
		int _la;
		try {
			setState(1033);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				_localctx = new SimpleTargetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1018);
				((SimpleTargetContext)_localctx).name = match(NAME);
				}
				break;
			case 2:
				_localctx = new TupleSetTargetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1019);
				((TupleSetTargetContext)_localctx).first = match(NAME);
				setState(1022); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1020);
					match(COMMA);
					setState(1021);
					((TupleSetTargetContext)_localctx).NAME = match(NAME);
					((TupleSetTargetContext)_localctx).rest.add(((TupleSetTargetContext)_localctx).NAME);
					}
					}
					setState(1024); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				}
				break;
			case 3:
				_localctx = new NamespaceTargetContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1026);
				((NamespaceTargetContext)_localctx).namespace = match(NAME);
				setState(1029); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1027);
					match(DOT);
					setState(1028);
					((NamespaceTargetContext)_localctx).NAME = match(NAME);
					((NamespaceTargetContext)_localctx).attributes.add(((NamespaceTargetContext)_localctx).NAME);
					}
					}
					setState(1031); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DOT );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetStatementContext extends ParserRuleContext {
		public ExpressionContext value;
		public TerminalNode SET() { return getToken(jinja2Parser.SET, 0); }
		public SetTargetContext setTarget() {
			return getRuleContext(SetTargetContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(jinja2Parser.ASSIGN, 0); }
		public TerminalNode STMT_OPEN() { return getToken(jinja2Parser.STMT_OPEN, 0); }
		public TerminalNode STMT_OPEN_TRIM() { return getToken(jinja2Parser.STMT_OPEN_TRIM, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode STMT_CLOSE() { return getToken(jinja2Parser.STMT_CLOSE, 0); }
		public TerminalNode STMT_CLOSE_TRIM() { return getToken(jinja2Parser.STMT_CLOSE_TRIM, 0); }
		public List<TerminalNode> PIPE() { return getTokens(jinja2Parser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(jinja2Parser.PIPE, i);
		}
		public List<FilterContext> filter() {
			return getRuleContexts(FilterContext.class);
		}
		public FilterContext filter(int i) {
			return getRuleContext(FilterContext.class,i);
		}
		public SetStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterSetStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitSetStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitSetStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetStatementContext setStatement() throws RecognitionException {
		SetStatementContext _localctx = new SetStatementContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_setStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1035);
			_la = _input.LA(1);
			if ( !(_la==STMT_OPEN_TRIM || _la==STMT_OPEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1036);
			match(SET);
			setState(1037);
			setTarget();
			setState(1038);
			match(ASSIGN);
			setState(1039);
			((SetStatementContext)_localctx).value = expression();
			setState(1044);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PIPE) {
				{
				{
				setState(1040);
				match(PIPE);
				setState(1041);
				filter();
				}
				}
				setState(1046);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1047);
			_la = _input.LA(1);
			if ( !(_la==STMT_CLOSE_TRIM || _la==STMT_CLOSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetBlockStatementContext extends ParserRuleContext {
		public Token name;
		public TemplateContentContext templateContent;
		public List<TemplateContentContext> body = new ArrayList<TemplateContentContext>();
		public TerminalNode SET() { return getToken(jinja2Parser.SET, 0); }
		public TerminalNode ENDSET() { return getToken(jinja2Parser.ENDSET, 0); }
		public List<TerminalNode> STMT_OPEN() { return getTokens(jinja2Parser.STMT_OPEN); }
		public TerminalNode STMT_OPEN(int i) {
			return getToken(jinja2Parser.STMT_OPEN, i);
		}
		public List<TerminalNode> STMT_OPEN_TRIM() { return getTokens(jinja2Parser.STMT_OPEN_TRIM); }
		public TerminalNode STMT_OPEN_TRIM(int i) {
			return getToken(jinja2Parser.STMT_OPEN_TRIM, i);
		}
		public TerminalNode NAME() { return getToken(jinja2Parser.NAME, 0); }
		public List<TerminalNode> STMT_CLOSE() { return getTokens(jinja2Parser.STMT_CLOSE); }
		public TerminalNode STMT_CLOSE(int i) {
			return getToken(jinja2Parser.STMT_CLOSE, i);
		}
		public List<TerminalNode> STMT_CLOSE_TRIM() { return getTokens(jinja2Parser.STMT_CLOSE_TRIM); }
		public TerminalNode STMT_CLOSE_TRIM(int i) {
			return getToken(jinja2Parser.STMT_CLOSE_TRIM, i);
		}
		public List<TemplateContentContext> templateContent() {
			return getRuleContexts(TemplateContentContext.class);
		}
		public TemplateContentContext templateContent(int i) {
			return getRuleContext(TemplateContentContext.class,i);
		}
		public SetBlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setBlockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterSetBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitSetBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitSetBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetBlockStatementContext setBlockStatement() throws RecognitionException {
		SetBlockStatementContext _localctx = new SetBlockStatementContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_setBlockStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1049);
			_la = _input.LA(1);
			if ( !(_la==STMT_OPEN_TRIM || _la==STMT_OPEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1050);
			match(SET);
			setState(1051);
			((SetBlockStatementContext)_localctx).name = match(NAME);
			setState(1052);
			_la = _input.LA(1);
			if ( !(_la==STMT_CLOSE_TRIM || _la==STMT_CLOSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1056);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1053);
					((SetBlockStatementContext)_localctx).templateContent = templateContent();
					((SetBlockStatementContext)_localctx).body.add(((SetBlockStatementContext)_localctx).templateContent);
					}
					} 
				}
				setState(1058);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			}
			setState(1059);
			_la = _input.LA(1);
			if ( !(_la==STMT_OPEN_TRIM || _la==STMT_OPEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1060);
			match(ENDSET);
			setState(1061);
			_la = _input.LA(1);
			if ( !(_la==STMT_CLOSE_TRIM || _la==STMT_CLOSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MacroStatementContext extends ParserRuleContext {
		public Token name;
		public MacroParamsContext params;
		public TemplateContentContext templateContent;
		public List<TemplateContentContext> body = new ArrayList<TemplateContentContext>();
		public TerminalNode MACRO() { return getToken(jinja2Parser.MACRO, 0); }
		public TerminalNode LPAREN() { return getToken(jinja2Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(jinja2Parser.RPAREN, 0); }
		public TerminalNode ENDMACRO() { return getToken(jinja2Parser.ENDMACRO, 0); }
		public List<TerminalNode> STMT_OPEN() { return getTokens(jinja2Parser.STMT_OPEN); }
		public TerminalNode STMT_OPEN(int i) {
			return getToken(jinja2Parser.STMT_OPEN, i);
		}
		public List<TerminalNode> STMT_OPEN_TRIM() { return getTokens(jinja2Parser.STMT_OPEN_TRIM); }
		public TerminalNode STMT_OPEN_TRIM(int i) {
			return getToken(jinja2Parser.STMT_OPEN_TRIM, i);
		}
		public TerminalNode NAME() { return getToken(jinja2Parser.NAME, 0); }
		public List<TerminalNode> STMT_CLOSE() { return getTokens(jinja2Parser.STMT_CLOSE); }
		public TerminalNode STMT_CLOSE(int i) {
			return getToken(jinja2Parser.STMT_CLOSE, i);
		}
		public List<TerminalNode> STMT_CLOSE_TRIM() { return getTokens(jinja2Parser.STMT_CLOSE_TRIM); }
		public TerminalNode STMT_CLOSE_TRIM(int i) {
			return getToken(jinja2Parser.STMT_CLOSE_TRIM, i);
		}
		public MacroParamsContext macroParams() {
			return getRuleContext(MacroParamsContext.class,0);
		}
		public List<TemplateContentContext> templateContent() {
			return getRuleContexts(TemplateContentContext.class);
		}
		public TemplateContentContext templateContent(int i) {
			return getRuleContext(TemplateContentContext.class,i);
		}
		public MacroStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterMacroStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitMacroStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitMacroStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroStatementContext macroStatement() throws RecognitionException {
		MacroStatementContext _localctx = new MacroStatementContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_macroStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1063);
			_la = _input.LA(1);
			if ( !(_la==STMT_OPEN_TRIM || _la==STMT_OPEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1064);
			match(MACRO);
			setState(1065);
			((MacroStatementContext)_localctx).name = match(NAME);
			setState(1066);
			match(LPAREN);
			setState(1068);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(1067);
				((MacroStatementContext)_localctx).params = macroParams();
				}
			}

			setState(1070);
			match(RPAREN);
			setState(1071);
			_la = _input.LA(1);
			if ( !(_la==STMT_CLOSE_TRIM || _la==STMT_CLOSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1075);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1072);
					((MacroStatementContext)_localctx).templateContent = templateContent();
					((MacroStatementContext)_localctx).body.add(((MacroStatementContext)_localctx).templateContent);
					}
					} 
				}
				setState(1077);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			}
			setState(1078);
			_la = _input.LA(1);
			if ( !(_la==STMT_OPEN_TRIM || _la==STMT_OPEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1079);
			match(ENDMACRO);
			setState(1080);
			_la = _input.LA(1);
			if ( !(_la==STMT_CLOSE_TRIM || _la==STMT_CLOSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MacroParamsContext extends ParserRuleContext {
		public List<MacroParamContext> macroParam() {
			return getRuleContexts(MacroParamContext.class);
		}
		public MacroParamContext macroParam(int i) {
			return getRuleContext(MacroParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(jinja2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(jinja2Parser.COMMA, i);
		}
		public MacroParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterMacroParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitMacroParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitMacroParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroParamsContext macroParams() throws RecognitionException {
		MacroParamsContext _localctx = new MacroParamsContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_macroParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1082);
			macroParam();
			setState(1087);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1083);
				match(COMMA);
				setState(1084);
				macroParam();
				}
				}
				setState(1089);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MacroParamContext extends ParserRuleContext {
		public Token name;
		public ExpressionContext defaultValue;
		public TerminalNode NAME() { return getToken(jinja2Parser.NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(jinja2Parser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MacroParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterMacroParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitMacroParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitMacroParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroParamContext macroParam() throws RecognitionException {
		MacroParamContext _localctx = new MacroParamContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_macroParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1090);
			((MacroParamContext)_localctx).name = match(NAME);
			setState(1093);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(1091);
				match(ASSIGN);
				setState(1092);
				((MacroParamContext)_localctx).defaultValue = expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CallBlockContext extends ParserRuleContext {
		public ArgListContext callArgs;
		public ExpressionContext callee;
		public TemplateContentContext templateContent;
		public List<TemplateContentContext> body = new ArrayList<TemplateContentContext>();
		public TerminalNode CALL() { return getToken(jinja2Parser.CALL, 0); }
		public TerminalNode ENDCALL() { return getToken(jinja2Parser.ENDCALL, 0); }
		public List<TerminalNode> STMT_OPEN() { return getTokens(jinja2Parser.STMT_OPEN); }
		public TerminalNode STMT_OPEN(int i) {
			return getToken(jinja2Parser.STMT_OPEN, i);
		}
		public List<TerminalNode> STMT_OPEN_TRIM() { return getTokens(jinja2Parser.STMT_OPEN_TRIM); }
		public TerminalNode STMT_OPEN_TRIM(int i) {
			return getToken(jinja2Parser.STMT_OPEN_TRIM, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> STMT_CLOSE() { return getTokens(jinja2Parser.STMT_CLOSE); }
		public TerminalNode STMT_CLOSE(int i) {
			return getToken(jinja2Parser.STMT_CLOSE, i);
		}
		public List<TerminalNode> STMT_CLOSE_TRIM() { return getTokens(jinja2Parser.STMT_CLOSE_TRIM); }
		public TerminalNode STMT_CLOSE_TRIM(int i) {
			return getToken(jinja2Parser.STMT_CLOSE_TRIM, i);
		}
		public TerminalNode LPAREN() { return getToken(jinja2Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(jinja2Parser.RPAREN, 0); }
		public List<TemplateContentContext> templateContent() {
			return getRuleContexts(TemplateContentContext.class);
		}
		public TemplateContentContext templateContent(int i) {
			return getRuleContext(TemplateContentContext.class,i);
		}
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public CallBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterCallBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitCallBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitCallBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallBlockContext callBlock() throws RecognitionException {
		CallBlockContext _localctx = new CallBlockContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_callBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1095);
			_la = _input.LA(1);
			if ( !(_la==STMT_OPEN_TRIM || _la==STMT_OPEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1096);
			match(CALL);
			setState(1102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(1097);
				match(LPAREN);
				setState(1099);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 179)) & ~0x3f) == 0 && ((1L << (_la - 179)) & 16999517185L) != 0)) {
					{
					setState(1098);
					((CallBlockContext)_localctx).callArgs = argList();
					}
				}

				setState(1101);
				match(RPAREN);
				}
				break;
			}
			setState(1104);
			((CallBlockContext)_localctx).callee = expression();
			setState(1105);
			_la = _input.LA(1);
			if ( !(_la==STMT_CLOSE_TRIM || _la==STMT_CLOSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1109);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1106);
					((CallBlockContext)_localctx).templateContent = templateContent();
					((CallBlockContext)_localctx).body.add(((CallBlockContext)_localctx).templateContent);
					}
					} 
				}
				setState(1111);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
			}
			setState(1112);
			_la = _input.LA(1);
			if ( !(_la==STMT_OPEN_TRIM || _la==STMT_OPEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1113);
			match(ENDCALL);
			setState(1114);
			_la = _input.LA(1);
			if ( !(_la==STMT_CLOSE_TRIM || _la==STMT_CLOSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportStatementContext extends ParserRuleContext {
		public Token templateName;
		public Token alias;
		public Token contextMode;
		public TerminalNode IMPORT() { return getToken(jinja2Parser.IMPORT, 0); }
		public TerminalNode AS() { return getToken(jinja2Parser.AS, 0); }
		public TerminalNode STMT_OPEN() { return getToken(jinja2Parser.STMT_OPEN, 0); }
		public TerminalNode STMT_OPEN_TRIM() { return getToken(jinja2Parser.STMT_OPEN_TRIM, 0); }
		public TerminalNode STRING() { return getToken(jinja2Parser.STRING, 0); }
		public TerminalNode NAME() { return getToken(jinja2Parser.NAME, 0); }
		public TerminalNode STMT_CLOSE() { return getToken(jinja2Parser.STMT_CLOSE, 0); }
		public TerminalNode STMT_CLOSE_TRIM() { return getToken(jinja2Parser.STMT_CLOSE_TRIM, 0); }
		public TerminalNode CONTEXT() { return getToken(jinja2Parser.CONTEXT, 0); }
		public TerminalNode WITH() { return getToken(jinja2Parser.WITH, 0); }
		public TerminalNode WITHOUT() { return getToken(jinja2Parser.WITHOUT, 0); }
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_importStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1116);
			_la = _input.LA(1);
			if ( !(_la==STMT_OPEN_TRIM || _la==STMT_OPEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1117);
			match(IMPORT);
			setState(1118);
			((ImportStatementContext)_localctx).templateName = match(STRING);
			setState(1119);
			match(AS);
			setState(1120);
			((ImportStatementContext)_localctx).alias = match(NAME);
			setState(1123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH || _la==WITHOUT) {
				{
				setState(1121);
				((ImportStatementContext)_localctx).contextMode = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==WITH || _la==WITHOUT) ) {
					((ImportStatementContext)_localctx).contextMode = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1122);
				match(CONTEXT);
				}
			}

			setState(1125);
			_la = _input.LA(1);
			if ( !(_la==STMT_CLOSE_TRIM || _la==STMT_CLOSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FromImportStatementContext extends ParserRuleContext {
		public Token templateName;
		public ImportListContext imports;
		public Token contextMode;
		public TerminalNode FROM() { return getToken(jinja2Parser.FROM, 0); }
		public TerminalNode IMPORT() { return getToken(jinja2Parser.IMPORT, 0); }
		public TerminalNode STMT_OPEN() { return getToken(jinja2Parser.STMT_OPEN, 0); }
		public TerminalNode STMT_OPEN_TRIM() { return getToken(jinja2Parser.STMT_OPEN_TRIM, 0); }
		public TerminalNode STRING() { return getToken(jinja2Parser.STRING, 0); }
		public ImportListContext importList() {
			return getRuleContext(ImportListContext.class,0);
		}
		public TerminalNode STMT_CLOSE() { return getToken(jinja2Parser.STMT_CLOSE, 0); }
		public TerminalNode STMT_CLOSE_TRIM() { return getToken(jinja2Parser.STMT_CLOSE_TRIM, 0); }
		public TerminalNode CONTEXT() { return getToken(jinja2Parser.CONTEXT, 0); }
		public TerminalNode WITH() { return getToken(jinja2Parser.WITH, 0); }
		public TerminalNode WITHOUT() { return getToken(jinja2Parser.WITHOUT, 0); }
		public FromImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromImportStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterFromImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitFromImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitFromImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromImportStatementContext fromImportStatement() throws RecognitionException {
		FromImportStatementContext _localctx = new FromImportStatementContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_fromImportStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1127);
			_la = _input.LA(1);
			if ( !(_la==STMT_OPEN_TRIM || _la==STMT_OPEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1128);
			match(FROM);
			setState(1129);
			((FromImportStatementContext)_localctx).templateName = match(STRING);
			setState(1130);
			match(IMPORT);
			setState(1131);
			((FromImportStatementContext)_localctx).imports = importList();
			setState(1134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH || _la==WITHOUT) {
				{
				setState(1132);
				((FromImportStatementContext)_localctx).contextMode = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==WITH || _la==WITHOUT) ) {
					((FromImportStatementContext)_localctx).contextMode = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1133);
				match(CONTEXT);
				}
			}

			setState(1136);
			_la = _input.LA(1);
			if ( !(_la==STMT_CLOSE_TRIM || _la==STMT_CLOSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportListContext extends ParserRuleContext {
		public List<ImportItemContext> importItem() {
			return getRuleContexts(ImportItemContext.class);
		}
		public ImportItemContext importItem(int i) {
			return getRuleContext(ImportItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(jinja2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(jinja2Parser.COMMA, i);
		}
		public ImportListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterImportList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitImportList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitImportList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportListContext importList() throws RecognitionException {
		ImportListContext _localctx = new ImportListContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_importList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1138);
			importItem();
			setState(1143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1139);
				match(COMMA);
				setState(1140);
				importItem();
				}
				}
				setState(1145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportItemContext extends ParserRuleContext {
		public Token name;
		public Token alias;
		public List<TerminalNode> NAME() { return getTokens(jinja2Parser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(jinja2Parser.NAME, i);
		}
		public TerminalNode AS() { return getToken(jinja2Parser.AS, 0); }
		public ImportItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterImportItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitImportItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitImportItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportItemContext importItem() throws RecognitionException {
		ImportItemContext _localctx = new ImportItemContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_importItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1146);
			((ImportItemContext)_localctx).name = match(NAME);
			setState(1149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1147);
				match(AS);
				setState(1148);
				((ImportItemContext)_localctx).alias = match(NAME);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WithBlockContext extends ParserRuleContext {
		public TemplateContentContext templateContent;
		public List<TemplateContentContext> body = new ArrayList<TemplateContentContext>();
		public TerminalNode WITH() { return getToken(jinja2Parser.WITH, 0); }
		public AssignmentsContext assignments() {
			return getRuleContext(AssignmentsContext.class,0);
		}
		public TerminalNode ENDWITH() { return getToken(jinja2Parser.ENDWITH, 0); }
		public List<TerminalNode> STMT_OPEN() { return getTokens(jinja2Parser.STMT_OPEN); }
		public TerminalNode STMT_OPEN(int i) {
			return getToken(jinja2Parser.STMT_OPEN, i);
		}
		public List<TerminalNode> STMT_OPEN_TRIM() { return getTokens(jinja2Parser.STMT_OPEN_TRIM); }
		public TerminalNode STMT_OPEN_TRIM(int i) {
			return getToken(jinja2Parser.STMT_OPEN_TRIM, i);
		}
		public List<TerminalNode> STMT_CLOSE() { return getTokens(jinja2Parser.STMT_CLOSE); }
		public TerminalNode STMT_CLOSE(int i) {
			return getToken(jinja2Parser.STMT_CLOSE, i);
		}
		public List<TerminalNode> STMT_CLOSE_TRIM() { return getTokens(jinja2Parser.STMT_CLOSE_TRIM); }
		public TerminalNode STMT_CLOSE_TRIM(int i) {
			return getToken(jinja2Parser.STMT_CLOSE_TRIM, i);
		}
		public List<TemplateContentContext> templateContent() {
			return getRuleContexts(TemplateContentContext.class);
		}
		public TemplateContentContext templateContent(int i) {
			return getRuleContext(TemplateContentContext.class,i);
		}
		public WithBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterWithBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitWithBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitWithBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithBlockContext withBlock() throws RecognitionException {
		WithBlockContext _localctx = new WithBlockContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_withBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1151);
			_la = _input.LA(1);
			if ( !(_la==STMT_OPEN_TRIM || _la==STMT_OPEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1152);
			match(WITH);
			setState(1153);
			assignments();
			setState(1154);
			_la = _input.LA(1);
			if ( !(_la==STMT_CLOSE_TRIM || _la==STMT_CLOSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1158);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1155);
					((WithBlockContext)_localctx).templateContent = templateContent();
					((WithBlockContext)_localctx).body.add(((WithBlockContext)_localctx).templateContent);
					}
					} 
				}
				setState(1160);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			}
			setState(1161);
			_la = _input.LA(1);
			if ( !(_la==STMT_OPEN_TRIM || _la==STMT_OPEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1162);
			match(ENDWITH);
			setState(1163);
			_la = _input.LA(1);
			if ( !(_la==STMT_CLOSE_TRIM || _la==STMT_CLOSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentsContext extends ParserRuleContext {
		public List<WithAssignmentContext> withAssignment() {
			return getRuleContexts(WithAssignmentContext.class);
		}
		public WithAssignmentContext withAssignment(int i) {
			return getRuleContext(WithAssignmentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(jinja2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(jinja2Parser.COMMA, i);
		}
		public AssignmentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterAssignments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitAssignments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitAssignments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentsContext assignments() throws RecognitionException {
		AssignmentsContext _localctx = new AssignmentsContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_assignments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1165);
			withAssignment();
			setState(1170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1166);
				match(COMMA);
				setState(1167);
				withAssignment();
				}
				}
				setState(1172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WithAssignmentContext extends ParserRuleContext {
		public Token name;
		public ExpressionContext value;
		public TerminalNode ASSIGN() { return getToken(jinja2Parser.ASSIGN, 0); }
		public TerminalNode NAME() { return getToken(jinja2Parser.NAME, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WithAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterWithAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitWithAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitWithAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithAssignmentContext withAssignment() throws RecognitionException {
		WithAssignmentContext _localctx = new WithAssignmentContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_withAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1173);
			((WithAssignmentContext)_localctx).name = match(NAME);
			setState(1174);
			match(ASSIGN);
			setState(1175);
			((WithAssignmentContext)_localctx).value = expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FilterBlockContext extends ParserRuleContext {
		public Token filterName;
		public ArgListContext args;
		public TemplateContentContext templateContent;
		public List<TemplateContentContext> body = new ArrayList<TemplateContentContext>();
		public TerminalNode FILTER() { return getToken(jinja2Parser.FILTER, 0); }
		public TerminalNode ENDFILTER() { return getToken(jinja2Parser.ENDFILTER, 0); }
		public List<TerminalNode> STMT_OPEN() { return getTokens(jinja2Parser.STMT_OPEN); }
		public TerminalNode STMT_OPEN(int i) {
			return getToken(jinja2Parser.STMT_OPEN, i);
		}
		public List<TerminalNode> STMT_OPEN_TRIM() { return getTokens(jinja2Parser.STMT_OPEN_TRIM); }
		public TerminalNode STMT_OPEN_TRIM(int i) {
			return getToken(jinja2Parser.STMT_OPEN_TRIM, i);
		}
		public TerminalNode NAME() { return getToken(jinja2Parser.NAME, 0); }
		public List<TerminalNode> STMT_CLOSE() { return getTokens(jinja2Parser.STMT_CLOSE); }
		public TerminalNode STMT_CLOSE(int i) {
			return getToken(jinja2Parser.STMT_CLOSE, i);
		}
		public List<TerminalNode> STMT_CLOSE_TRIM() { return getTokens(jinja2Parser.STMT_CLOSE_TRIM); }
		public TerminalNode STMT_CLOSE_TRIM(int i) {
			return getToken(jinja2Parser.STMT_CLOSE_TRIM, i);
		}
		public TerminalNode LPAREN() { return getToken(jinja2Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(jinja2Parser.RPAREN, 0); }
		public List<TemplateContentContext> templateContent() {
			return getRuleContexts(TemplateContentContext.class);
		}
		public TemplateContentContext templateContent(int i) {
			return getRuleContext(TemplateContentContext.class,i);
		}
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public FilterBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterFilterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitFilterBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitFilterBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterBlockContext filterBlock() throws RecognitionException {
		FilterBlockContext _localctx = new FilterBlockContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_filterBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1177);
			_la = _input.LA(1);
			if ( !(_la==STMT_OPEN_TRIM || _la==STMT_OPEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1178);
			match(FILTER);
			setState(1179);
			((FilterBlockContext)_localctx).filterName = match(NAME);
			setState(1185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1180);
				match(LPAREN);
				setState(1182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 179)) & ~0x3f) == 0 && ((1L << (_la - 179)) & 16999517185L) != 0)) {
					{
					setState(1181);
					((FilterBlockContext)_localctx).args = argList();
					}
				}

				setState(1184);
				match(RPAREN);
				}
			}

			setState(1187);
			_la = _input.LA(1);
			if ( !(_la==STMT_CLOSE_TRIM || _la==STMT_CLOSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1191);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1188);
					((FilterBlockContext)_localctx).templateContent = templateContent();
					((FilterBlockContext)_localctx).body.add(((FilterBlockContext)_localctx).templateContent);
					}
					} 
				}
				setState(1193);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
			}
			setState(1194);
			_la = _input.LA(1);
			if ( !(_la==STMT_OPEN_TRIM || _la==STMT_OPEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1195);
			match(ENDFILTER);
			setState(1196);
			_la = _input.LA(1);
			if ( !(_la==STMT_CLOSE_TRIM || _la==STMT_CLOSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DoStatementContext extends ParserRuleContext {
		public ExpressionContext expr;
		public TerminalNode DO() { return getToken(jinja2Parser.DO, 0); }
		public TerminalNode STMT_OPEN() { return getToken(jinja2Parser.STMT_OPEN, 0); }
		public TerminalNode STMT_OPEN_TRIM() { return getToken(jinja2Parser.STMT_OPEN_TRIM, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode STMT_CLOSE() { return getToken(jinja2Parser.STMT_CLOSE, 0); }
		public TerminalNode STMT_CLOSE_TRIM() { return getToken(jinja2Parser.STMT_CLOSE_TRIM, 0); }
		public DoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterDoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitDoStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitDoStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoStatementContext doStatement() throws RecognitionException {
		DoStatementContext _localctx = new DoStatementContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_doStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1198);
			_la = _input.LA(1);
			if ( !(_la==STMT_OPEN_TRIM || _la==STMT_OPEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1199);
			match(DO);
			setState(1200);
			((DoStatementContext)_localctx).expr = expression();
			setState(1201);
			_la = _input.LA(1);
			if ( !(_la==STMT_CLOSE_TRIM || _la==STMT_CLOSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AutoescapeBlockContext extends ParserRuleContext {
		public Token escapeMode;
		public TemplateContentContext templateContent;
		public List<TemplateContentContext> body = new ArrayList<TemplateContentContext>();
		public TerminalNode AUTOESCAPE() { return getToken(jinja2Parser.AUTOESCAPE, 0); }
		public TerminalNode ENDAUTOESCAPE() { return getToken(jinja2Parser.ENDAUTOESCAPE, 0); }
		public List<TerminalNode> STMT_OPEN() { return getTokens(jinja2Parser.STMT_OPEN); }
		public TerminalNode STMT_OPEN(int i) {
			return getToken(jinja2Parser.STMT_OPEN, i);
		}
		public List<TerminalNode> STMT_OPEN_TRIM() { return getTokens(jinja2Parser.STMT_OPEN_TRIM); }
		public TerminalNode STMT_OPEN_TRIM(int i) {
			return getToken(jinja2Parser.STMT_OPEN_TRIM, i);
		}
		public List<TerminalNode> STMT_CLOSE() { return getTokens(jinja2Parser.STMT_CLOSE); }
		public TerminalNode STMT_CLOSE(int i) {
			return getToken(jinja2Parser.STMT_CLOSE, i);
		}
		public List<TerminalNode> STMT_CLOSE_TRIM() { return getTokens(jinja2Parser.STMT_CLOSE_TRIM); }
		public TerminalNode STMT_CLOSE_TRIM(int i) {
			return getToken(jinja2Parser.STMT_CLOSE_TRIM, i);
		}
		public TerminalNode TRUE() { return getToken(jinja2Parser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(jinja2Parser.FALSE, 0); }
		public TerminalNode STRING() { return getToken(jinja2Parser.STRING, 0); }
		public List<TemplateContentContext> templateContent() {
			return getRuleContexts(TemplateContentContext.class);
		}
		public TemplateContentContext templateContent(int i) {
			return getRuleContext(TemplateContentContext.class,i);
		}
		public AutoescapeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_autoescapeBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterAutoescapeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitAutoescapeBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitAutoescapeBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AutoescapeBlockContext autoescapeBlock() throws RecognitionException {
		AutoescapeBlockContext _localctx = new AutoescapeBlockContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_autoescapeBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1203);
			_la = _input.LA(1);
			if ( !(_la==STMT_OPEN_TRIM || _la==STMT_OPEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1204);
			match(AUTOESCAPE);
			setState(1205);
			((AutoescapeBlockContext)_localctx).escapeMode = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 207)) & ~0x3f) == 0 && ((1L << (_la - 207)) & 11L) != 0)) ) {
				((AutoescapeBlockContext)_localctx).escapeMode = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1206);
			_la = _input.LA(1);
			if ( !(_la==STMT_CLOSE_TRIM || _la==STMT_CLOSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1210);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1207);
					((AutoescapeBlockContext)_localctx).templateContent = templateContent();
					((AutoescapeBlockContext)_localctx).body.add(((AutoescapeBlockContext)_localctx).templateContent);
					}
					} 
				}
				setState(1212);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			}
			setState(1213);
			_la = _input.LA(1);
			if ( !(_la==STMT_OPEN_TRIM || _la==STMT_OPEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1214);
			match(ENDAUTOESCAPE);
			setState(1215);
			_la = _input.LA(1);
			if ( !(_la==STMT_CLOSE_TRIM || _la==STMT_CLOSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssStylesheetContext extends ParserRuleContext {
		public List<CssRuleContext> cssRule() {
			return getRuleContexts(CssRuleContext.class);
		}
		public CssRuleContext cssRule(int i) {
			return getRuleContext(CssRuleContext.class,i);
		}
		public CssStylesheetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssStylesheet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterCssStylesheet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitCssStylesheet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitCssStylesheet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssStylesheetContext cssStylesheet() throws RecognitionException {
		CssStylesheetContext _localctx = new CssStylesheetContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_cssStylesheet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2304717109306851328L) != 0) || _la==CSS_DOT) {
				{
				{
				setState(1217);
				cssRule();
				}
				}
				setState(1222);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssRuleContext extends ParserRuleContext {
		public CssSelectorContext cssSelector;
		public List<CssSelectorContext> selectors = new ArrayList<CssSelectorContext>();
		public CssDeclarationContext cssDeclaration;
		public List<CssDeclarationContext> declarations = new ArrayList<CssDeclarationContext>();
		public TerminalNode CSS_LBRACE() { return getToken(jinja2Parser.CSS_LBRACE, 0); }
		public TerminalNode CSS_RBRACE() { return getToken(jinja2Parser.CSS_RBRACE, 0); }
		public List<CssSelectorContext> cssSelector() {
			return getRuleContexts(CssSelectorContext.class);
		}
		public CssSelectorContext cssSelector(int i) {
			return getRuleContext(CssSelectorContext.class,i);
		}
		public List<TerminalNode> CSS_COMMA() { return getTokens(jinja2Parser.CSS_COMMA); }
		public TerminalNode CSS_COMMA(int i) {
			return getToken(jinja2Parser.CSS_COMMA, i);
		}
		public List<CssDeclarationContext> cssDeclaration() {
			return getRuleContexts(CssDeclarationContext.class);
		}
		public CssDeclarationContext cssDeclaration(int i) {
			return getRuleContext(CssDeclarationContext.class,i);
		}
		public CssRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterCssRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitCssRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitCssRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssRuleContext cssRule() throws RecognitionException {
		CssRuleContext _localctx = new CssRuleContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_cssRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1223);
			((CssRuleContext)_localctx).cssSelector = cssSelector();
			((CssRuleContext)_localctx).selectors.add(((CssRuleContext)_localctx).cssSelector);
			setState(1228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_COMMA) {
				{
				{
				setState(1224);
				match(CSS_COMMA);
				setState(1225);
				((CssRuleContext)_localctx).cssSelector = cssSelector();
				((CssRuleContext)_localctx).selectors.add(((CssRuleContext)_localctx).cssSelector);
				}
				}
				setState(1230);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1231);
			match(CSS_LBRACE);
			setState(1235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 274877906943L) != 0)) {
				{
				{
				setState(1232);
				((CssRuleContext)_localctx).cssDeclaration = cssDeclaration();
				((CssRuleContext)_localctx).declarations.add(((CssRuleContext)_localctx).cssDeclaration);
				}
				}
				setState(1237);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1238);
			match(CSS_RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssSelectorContext extends ParserRuleContext {
		public CssSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssSelector; }
	 
		public CssSelectorContext() { }
		public void copyFrom(CssSelectorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElementPseudoSelectorContext extends CssSelectorContext {
		public CssElementSelectorContext cssElementSelector() {
			return getRuleContext(CssElementSelectorContext.class,0);
		}
		public CssPseudoClassContext cssPseudoClass() {
			return getRuleContext(CssPseudoClassContext.class,0);
		}
		public ElementPseudoSelectorContext(CssSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterElementPseudoSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitElementPseudoSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitElementPseudoSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassSelectorContext extends CssSelectorContext {
		public CssClassSelectorContext cssClassSelector() {
			return getRuleContext(CssClassSelectorContext.class,0);
		}
		public ClassSelectorContext(CssSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterClassSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitClassSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitClassSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DescendantSelectorContext extends CssSelectorContext {
		public CssDescendantSelectorContext cssDescendantSelector() {
			return getRuleContext(CssDescendantSelectorContext.class,0);
		}
		public DescendantSelectorContext(CssSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterDescendantSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitDescendantSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitDescendantSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElementSelectorContext extends CssSelectorContext {
		public CssElementSelectorContext cssElementSelector() {
			return getRuleContext(CssElementSelectorContext.class,0);
		}
		public ElementSelectorContext(CssSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterElementSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitElementSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitElementSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassPseudoSelectorContext extends CssSelectorContext {
		public CssClassSelectorContext cssClassSelector() {
			return getRuleContext(CssClassSelectorContext.class,0);
		}
		public CssPseudoClassContext cssPseudoClass() {
			return getRuleContext(CssPseudoClassContext.class,0);
		}
		public ClassPseudoSelectorContext(CssSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterClassPseudoSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitClassPseudoSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitClassPseudoSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElementClassSelectorContext extends CssSelectorContext {
		public CssElementSelectorContext cssElementSelector() {
			return getRuleContext(CssElementSelectorContext.class,0);
		}
		public CssClassSelectorContext cssClassSelector() {
			return getRuleContext(CssClassSelectorContext.class,0);
		}
		public ElementClassSelectorContext(CssSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterElementClassSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitElementClassSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitElementClassSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssSelectorContext cssSelector() throws RecognitionException {
		CssSelectorContext _localctx = new CssSelectorContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_cssSelector);
		try {
			setState(1252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				_localctx = new ElementSelectorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1240);
				cssElementSelector();
				}
				break;
			case 2:
				_localctx = new ClassSelectorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1241);
				cssClassSelector();
				}
				break;
			case 3:
				_localctx = new ElementPseudoSelectorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1242);
				cssElementSelector();
				setState(1243);
				cssPseudoClass();
				}
				break;
			case 4:
				_localctx = new ClassPseudoSelectorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1245);
				cssClassSelector();
				setState(1246);
				cssPseudoClass();
				}
				break;
			case 5:
				_localctx = new DescendantSelectorContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1248);
				cssDescendantSelector();
				}
				break;
			case 6:
				_localctx = new ElementClassSelectorContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1249);
				cssElementSelector();
				setState(1250);
				cssClassSelector();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssElementSelectorContext extends ParserRuleContext {
		public TerminalNode CSS_BODY_SEL() { return getToken(jinja2Parser.CSS_BODY_SEL, 0); }
		public TerminalNode CSS_H1_SEL() { return getToken(jinja2Parser.CSS_H1_SEL, 0); }
		public TerminalNode CSS_P_SEL() { return getToken(jinja2Parser.CSS_P_SEL, 0); }
		public TerminalNode CSS_DIV_SEL() { return getToken(jinja2Parser.CSS_DIV_SEL, 0); }
		public TerminalNode CSS_FORM_SEL() { return getToken(jinja2Parser.CSS_FORM_SEL, 0); }
		public TerminalNode CSS_LABEL_SEL() { return getToken(jinja2Parser.CSS_LABEL_SEL, 0); }
		public TerminalNode CSS_INPUT_SEL() { return getToken(jinja2Parser.CSS_INPUT_SEL, 0); }
		public TerminalNode CSS_TEXTAREA_SEL() { return getToken(jinja2Parser.CSS_TEXTAREA_SEL, 0); }
		public TerminalNode CSS_BUTTON_SEL() { return getToken(jinja2Parser.CSS_BUTTON_SEL, 0); }
		public TerminalNode CSS_A_SEL() { return getToken(jinja2Parser.CSS_A_SEL, 0); }
		public TerminalNode CSS_IMG_SEL() { return getToken(jinja2Parser.CSS_IMG_SEL, 0); }
		public CssElementSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssElementSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterCssElementSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitCssElementSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitCssElementSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssElementSelectorContext cssElementSelector() throws RecognitionException {
		CssElementSelectorContext _localctx = new CssElementSelectorContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_cssElementSelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1254);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2304717109306851328L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssClassSelectorContext extends ParserRuleContext {
		public CssClassNameContext className;
		public TerminalNode CSS_DOT() { return getToken(jinja2Parser.CSS_DOT, 0); }
		public CssClassNameContext cssClassName() {
			return getRuleContext(CssClassNameContext.class,0);
		}
		public CssClassSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssClassSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterCssClassSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitCssClassSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitCssClassSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssClassSelectorContext cssClassSelector() throws RecognitionException {
		CssClassSelectorContext _localctx = new CssClassSelectorContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_cssClassSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1256);
			match(CSS_DOT);
			setState(1257);
			((CssClassSelectorContext)_localctx).className = cssClassName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssClassNameContext extends ParserRuleContext {
		public TerminalNode CSS_IDENT() { return getToken(jinja2Parser.CSS_IDENT, 0); }
		public TerminalNode CSS_BUTTON_SEL() { return getToken(jinja2Parser.CSS_BUTTON_SEL, 0); }
		public TerminalNode CSS_FORM_SEL() { return getToken(jinja2Parser.CSS_FORM_SEL, 0); }
		public TerminalNode CSS_INPUT_SEL() { return getToken(jinja2Parser.CSS_INPUT_SEL, 0); }
		public TerminalNode CSS_LABEL_SEL() { return getToken(jinja2Parser.CSS_LABEL_SEL, 0); }
		public TerminalNode CSS_TEXTAREA_SEL() { return getToken(jinja2Parser.CSS_TEXTAREA_SEL, 0); }
		public TerminalNode CSS_DIV_SEL() { return getToken(jinja2Parser.CSS_DIV_SEL, 0); }
		public TerminalNode CSS_BODY_SEL() { return getToken(jinja2Parser.CSS_BODY_SEL, 0); }
		public TerminalNode CSS_A_SEL() { return getToken(jinja2Parser.CSS_A_SEL, 0); }
		public TerminalNode CSS_H1_SEL() { return getToken(jinja2Parser.CSS_H1_SEL, 0); }
		public TerminalNode CSS_P_SEL() { return getToken(jinja2Parser.CSS_P_SEL, 0); }
		public TerminalNode CSS_IMG_SEL() { return getToken(jinja2Parser.CSS_IMG_SEL, 0); }
		public CssClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssClassName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterCssClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitCssClassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitCssClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssClassNameContext cssClassName() throws RecognitionException {
		CssClassNameContext _localctx = new CssClassNameContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_cssClassName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1259);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2304717109306851328L) != 0) || _la==CSS_IDENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssPseudoClassContext extends ParserRuleContext {
		public TerminalNode CSS_HOVER() { return getToken(jinja2Parser.CSS_HOVER, 0); }
		public TerminalNode CSS_FOCUS() { return getToken(jinja2Parser.CSS_FOCUS, 0); }
		public TerminalNode CSS_ACTIVE() { return getToken(jinja2Parser.CSS_ACTIVE, 0); }
		public TerminalNode CSS_DISABLED() { return getToken(jinja2Parser.CSS_DISABLED, 0); }
		public TerminalNode CSS_FIRST_CHILD() { return getToken(jinja2Parser.CSS_FIRST_CHILD, 0); }
		public TerminalNode CSS_LAST_CHILD() { return getToken(jinja2Parser.CSS_LAST_CHILD, 0); }
		public CssPseudoClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssPseudoClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterCssPseudoClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitCssPseudoClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitCssPseudoClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssPseudoClassContext cssPseudoClass() throws RecognitionException {
		CssPseudoClassContext _localctx = new CssPseudoClassContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_cssPseudoClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1261);
			_la = _input.LA(1);
			if ( !(((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & 63L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssDescendantSelectorContext extends ParserRuleContext {
		public CssSelectorSimpleContext ancestor;
		public CssSelectorSimpleContext cssSelectorSimple;
		public List<CssSelectorSimpleContext> descendant = new ArrayList<CssSelectorSimpleContext>();
		public List<CssSelectorSimpleContext> cssSelectorSimple() {
			return getRuleContexts(CssSelectorSimpleContext.class);
		}
		public CssSelectorSimpleContext cssSelectorSimple(int i) {
			return getRuleContext(CssSelectorSimpleContext.class,i);
		}
		public CssDescendantSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssDescendantSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterCssDescendantSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitCssDescendantSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitCssDescendantSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssDescendantSelectorContext cssDescendantSelector() throws RecognitionException {
		CssDescendantSelectorContext _localctx = new CssDescendantSelectorContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_cssDescendantSelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1263);
			((CssDescendantSelectorContext)_localctx).ancestor = cssSelectorSimple();
			setState(1265); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1264);
				((CssDescendantSelectorContext)_localctx).cssSelectorSimple = cssSelectorSimple();
				((CssDescendantSelectorContext)_localctx).descendant.add(((CssDescendantSelectorContext)_localctx).cssSelectorSimple);
				}
				}
				setState(1267); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2304717109306851328L) != 0) || _la==CSS_DOT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssSelectorSimpleContext extends ParserRuleContext {
		public CssSelectorSimpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssSelectorSimple; }
	 
		public CssSelectorSimpleContext() { }
		public void copyFrom(CssSelectorSimpleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssSimpleElementContext extends CssSelectorSimpleContext {
		public CssElementSelectorContext cssElementSelector() {
			return getRuleContext(CssElementSelectorContext.class,0);
		}
		public CssSimpleElementContext(CssSelectorSimpleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterCssSimpleElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitCssSimpleElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitCssSimpleElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssSimpleClassContext extends CssSelectorSimpleContext {
		public CssClassSelectorContext cssClassSelector() {
			return getRuleContext(CssClassSelectorContext.class,0);
		}
		public CssSimpleClassContext(CssSelectorSimpleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterCssSimpleClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitCssSimpleClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitCssSimpleClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssSelectorSimpleContext cssSelectorSimple() throws RecognitionException {
		CssSelectorSimpleContext _localctx = new CssSelectorSimpleContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_cssSelectorSimple);
		try {
			setState(1271);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_BODY_SEL:
			case CSS_H1_SEL:
			case CSS_P_SEL:
			case CSS_DIV_SEL:
			case CSS_FORM_SEL:
			case CSS_LABEL_SEL:
			case CSS_INPUT_SEL:
			case CSS_TEXTAREA_SEL:
			case CSS_BUTTON_SEL:
			case CSS_A_SEL:
			case CSS_IMG_SEL:
				_localctx = new CssSimpleElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1269);
				cssElementSelector();
				}
				break;
			case CSS_DOT:
				_localctx = new CssSimpleClassContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1270);
				cssClassSelector();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssDeclarationContext extends ParserRuleContext {
		public CssDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssDeclaration; }
	 
		public CssDeclarationContext() { }
		public void copyFrom(CssDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssKeywordDeclContext extends CssDeclarationContext {
		public KeywordDeclContext keywordDecl() {
			return getRuleContext(KeywordDeclContext.class,0);
		}
		public CssKeywordDeclContext(CssDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterCssKeywordDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitCssKeywordDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitCssKeywordDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssBoxShadowDeclContext extends CssDeclarationContext {
		public BoxShadowDeclContext boxShadowDecl() {
			return getRuleContext(BoxShadowDeclContext.class,0);
		}
		public CssBoxShadowDeclContext(CssDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterCssBoxShadowDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitCssBoxShadowDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitCssBoxShadowDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssOutlineDeclContext extends CssDeclarationContext {
		public OutlineDeclContext outlineDecl() {
			return getRuleContext(OutlineDeclContext.class,0);
		}
		public CssOutlineDeclContext(CssDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterCssOutlineDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitCssOutlineDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitCssOutlineDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssMultipleLengthDeclContext extends CssDeclarationContext {
		public MultipleLengthDeclContext multipleLengthDecl() {
			return getRuleContext(MultipleLengthDeclContext.class,0);
		}
		public CssMultipleLengthDeclContext(CssDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterCssMultipleLengthDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitCssMultipleLengthDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitCssMultipleLengthDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssFontWeightDeclContext extends CssDeclarationContext {
		public FontWeightDeclContext fontWeightDecl() {
			return getRuleContext(FontWeightDeclContext.class,0);
		}
		public CssFontWeightDeclContext(CssDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterCssFontWeightDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitCssFontWeightDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitCssFontWeightDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssBoxSizingDeclContext extends CssDeclarationContext {
		public BoxSizingDeclContext boxSizingDecl() {
			return getRuleContext(BoxSizingDeclContext.class,0);
		}
		public CssBoxSizingDeclContext(CssDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterCssBoxSizingDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitCssBoxSizingDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitCssBoxSizingDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssTransformDeclContext extends CssDeclarationContext {
		public TransformDeclContext transformDecl() {
			return getRuleContext(TransformDeclContext.class,0);
		}
		public CssTransformDeclContext(CssDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterCssTransformDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitCssTransformDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitCssTransformDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssBackgroundDeclContext extends CssDeclarationContext {
		public BackgroundDeclContext backgroundDecl() {
			return getRuleContext(BackgroundDeclContext.class,0);
		}
		public CssBackgroundDeclContext(CssDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterCssBackgroundDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitCssBackgroundDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitCssBackgroundDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssBorderDeclContext extends CssDeclarationContext {
		public BorderDeclContext borderDecl() {
			return getRuleContext(BorderDeclContext.class,0);
		}
		public CssBorderDeclContext(CssDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterCssBorderDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitCssBorderDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitCssBorderDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssTransitionDeclContext extends CssDeclarationContext {
		public TransitionDeclContext transitionDecl() {
			return getRuleContext(TransitionDeclContext.class,0);
		}
		public CssTransitionDeclContext(CssDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterCssTransitionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitCssTransitionDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitCssTransitionDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssFontFamilyDeclContext extends CssDeclarationContext {
		public FontFamilyDeclContext fontFamilyDecl() {
			return getRuleContext(FontFamilyDeclContext.class,0);
		}
		public CssFontFamilyDeclContext(CssDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterCssFontFamilyDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitCssFontFamilyDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitCssFontFamilyDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssSingleLengthDeclContext extends CssDeclarationContext {
		public SingleLengthDeclContext singleLengthDecl() {
			return getRuleContext(SingleLengthDeclContext.class,0);
		}
		public CssSingleLengthDeclContext(CssDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterCssSingleLengthDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitCssSingleLengthDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitCssSingleLengthDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssColorDeclContext extends CssDeclarationContext {
		public ColorDeclContext colorDecl() {
			return getRuleContext(ColorDeclContext.class,0);
		}
		public CssColorDeclContext(CssDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterCssColorDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitCssColorDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitCssColorDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssDeclarationContext cssDeclaration() throws RecognitionException {
		CssDeclarationContext _localctx = new CssDeclarationContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_cssDeclaration);
		try {
			setState(1286);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_FONT_SIZE:
			case CSS_LETTER_SPACING:
			case CSS_LINE_HEIGHT:
			case CSS_MARGIN_TOP:
			case CSS_MARGIN_BOTTOM:
			case CSS_WIDTH:
			case CSS_HEIGHT:
			case CSS_MAX_WIDTH:
			case CSS_MAX_HEIGHT:
			case CSS_MIN_HEIGHT:
			case CSS_BORDER_RADIUS:
			case CSS_GAP:
				_localctx = new CssSingleLengthDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1273);
				singleLengthDecl();
				}
				break;
			case CSS_MARGIN:
			case CSS_PADDING:
				_localctx = new CssMultipleLengthDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1274);
				multipleLengthDecl();
				}
				break;
			case CSS_COLOR:
			case CSS_BACKGROUND_COLOR:
			case CSS_BORDER_COLOR:
				_localctx = new CssColorDeclContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1275);
				colorDecl();
				}
				break;
			case CSS_TEXT_ALIGN:
			case CSS_TEXT_DECORATION:
			case CSS_TEXT_TRANSFORM:
			case CSS_DISPLAY:
			case CSS_FLEX_WRAP:
			case CSS_JUSTIFY_CONTENT:
			case CSS_ALIGN_ITEMS:
			case CSS_OVERFLOW:
			case CSS_CURSOR:
			case CSS_RESIZE:
			case CSS_OBJECT_FIT:
				_localctx = new CssKeywordDeclContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1276);
				keywordDecl();
				}
				break;
			case CSS_BOX_SHADOW:
				_localctx = new CssBoxShadowDeclContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1277);
				boxShadowDecl();
				}
				break;
			case CSS_BORDER:
			case CSS_BORDER_TOP:
				_localctx = new CssBorderDeclContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1278);
				borderDecl();
				}
				break;
			case CSS_TRANSITION:
				_localctx = new CssTransitionDeclContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1279);
				transitionDecl();
				}
				break;
			case CSS_TRANSFORM:
				_localctx = new CssTransformDeclContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1280);
				transformDecl();
				}
				break;
			case CSS_BACKGROUND:
				_localctx = new CssBackgroundDeclContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1281);
				backgroundDecl();
				}
				break;
			case CSS_FONT_FAMILY:
				_localctx = new CssFontFamilyDeclContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1282);
				fontFamilyDecl();
				}
				break;
			case CSS_FONT_WEIGHT:
				_localctx = new CssFontWeightDeclContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(1283);
				fontWeightDecl();
				}
				break;
			case CSS_BOX_SIZING:
				_localctx = new CssBoxSizingDeclContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(1284);
				boxSizingDecl();
				}
				break;
			case CSS_OUTLINE:
				_localctx = new CssOutlineDeclContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(1285);
				outlineDecl();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SingleLengthDeclContext extends ParserRuleContext {
		public CssLengthContext value;
		public SingleLengthPropContext singleLengthProp() {
			return getRuleContext(SingleLengthPropContext.class,0);
		}
		public TerminalNode CSS_COLON() { return getToken(jinja2Parser.CSS_COLON, 0); }
		public CssLengthContext cssLength() {
			return getRuleContext(CssLengthContext.class,0);
		}
		public TerminalNode CSS_SEMI() { return getToken(jinja2Parser.CSS_SEMI, 0); }
		public SingleLengthDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleLengthDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterSingleLengthDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitSingleLengthDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitSingleLengthDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleLengthDeclContext singleLengthDecl() throws RecognitionException {
		SingleLengthDeclContext _localctx = new SingleLengthDeclContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_singleLengthDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1288);
			singleLengthProp();
			setState(1289);
			match(CSS_COLON);
			setState(1290);
			((SingleLengthDeclContext)_localctx).value = cssLength();
			setState(1292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_SEMI) {
				{
				setState(1291);
				match(CSS_SEMI);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SingleLengthPropContext extends ParserRuleContext {
		public TerminalNode CSS_FONT_SIZE() { return getToken(jinja2Parser.CSS_FONT_SIZE, 0); }
		public TerminalNode CSS_LETTER_SPACING() { return getToken(jinja2Parser.CSS_LETTER_SPACING, 0); }
		public TerminalNode CSS_LINE_HEIGHT() { return getToken(jinja2Parser.CSS_LINE_HEIGHT, 0); }
		public TerminalNode CSS_MARGIN_TOP() { return getToken(jinja2Parser.CSS_MARGIN_TOP, 0); }
		public TerminalNode CSS_MARGIN_BOTTOM() { return getToken(jinja2Parser.CSS_MARGIN_BOTTOM, 0); }
		public TerminalNode CSS_WIDTH() { return getToken(jinja2Parser.CSS_WIDTH, 0); }
		public TerminalNode CSS_HEIGHT() { return getToken(jinja2Parser.CSS_HEIGHT, 0); }
		public TerminalNode CSS_MAX_WIDTH() { return getToken(jinja2Parser.CSS_MAX_WIDTH, 0); }
		public TerminalNode CSS_MAX_HEIGHT() { return getToken(jinja2Parser.CSS_MAX_HEIGHT, 0); }
		public TerminalNode CSS_MIN_HEIGHT() { return getToken(jinja2Parser.CSS_MIN_HEIGHT, 0); }
		public TerminalNode CSS_GAP() { return getToken(jinja2Parser.CSS_GAP, 0); }
		public TerminalNode CSS_BORDER_RADIUS() { return getToken(jinja2Parser.CSS_BORDER_RADIUS, 0); }
		public SingleLengthPropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleLengthProp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterSingleLengthProp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitSingleLengthProp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitSingleLengthProp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleLengthPropContext singleLengthProp() throws RecognitionException {
		SingleLengthPropContext _localctx = new SingleLengthPropContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_singleLengthProp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1294);
			_la = _input.LA(1);
			if ( !(((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 539032389L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultipleLengthDeclContext extends ParserRuleContext {
		public CssMultiLengthValueContext cssMultiLengthValue;
		public List<CssMultiLengthValueContext> values = new ArrayList<CssMultiLengthValueContext>();
		public MultiLengthPropContext multiLengthProp() {
			return getRuleContext(MultiLengthPropContext.class,0);
		}
		public TerminalNode CSS_COLON() { return getToken(jinja2Parser.CSS_COLON, 0); }
		public List<CssMultiLengthValueContext> cssMultiLengthValue() {
			return getRuleContexts(CssMultiLengthValueContext.class);
		}
		public CssMultiLengthValueContext cssMultiLengthValue(int i) {
			return getRuleContext(CssMultiLengthValueContext.class,i);
		}
		public TerminalNode CSS_SEMI() { return getToken(jinja2Parser.CSS_SEMI, 0); }
		public MultipleLengthDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleLengthDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterMultipleLengthDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitMultipleLengthDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitMultipleLengthDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipleLengthDeclContext multipleLengthDecl() throws RecognitionException {
		MultipleLengthDeclContext _localctx = new MultipleLengthDeclContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_multipleLengthDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1296);
			multiLengthProp();
			setState(1297);
			match(CSS_COLON);
			setState(1298);
			((MultipleLengthDeclContext)_localctx).cssMultiLengthValue = cssMultiLengthValue();
			((MultipleLengthDeclContext)_localctx).values.add(((MultipleLengthDeclContext)_localctx).cssMultiLengthValue);
			setState(1302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & 2588673L) != 0)) {
				{
				{
				setState(1299);
				((MultipleLengthDeclContext)_localctx).cssMultiLengthValue = cssMultiLengthValue();
				((MultipleLengthDeclContext)_localctx).values.add(((MultipleLengthDeclContext)_localctx).cssMultiLengthValue);
				}
				}
				setState(1304);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_SEMI) {
				{
				setState(1305);
				match(CSS_SEMI);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultiLengthPropContext extends ParserRuleContext {
		public TerminalNode CSS_MARGIN() { return getToken(jinja2Parser.CSS_MARGIN, 0); }
		public TerminalNode CSS_PADDING() { return getToken(jinja2Parser.CSS_PADDING, 0); }
		public MultiLengthPropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiLengthProp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterMultiLengthProp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitMultiLengthProp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitMultiLengthProp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiLengthPropContext multiLengthProp() throws RecognitionException {
		MultiLengthPropContext _localctx = new MultiLengthPropContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_multiLengthProp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1308);
			_la = _input.LA(1);
			if ( !(_la==CSS_MARGIN || _la==CSS_PADDING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssMultiLengthValueContext extends ParserRuleContext {
		public CssLengthContext cssLength() {
			return getRuleContext(CssLengthContext.class,0);
		}
		public TerminalNode CSS_AUTO() { return getToken(jinja2Parser.CSS_AUTO, 0); }
		public CssMultiLengthValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssMultiLengthValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterCssMultiLengthValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitCssMultiLengthValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitCssMultiLengthValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssMultiLengthValueContext cssMultiLengthValue() throws RecognitionException {
		CssMultiLengthValueContext _localctx = new CssMultiLengthValueContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_cssMultiLengthValue);
		try {
			setState(1312);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_VH:
			case CSS_EM:
			case CSS_PERCENT:
			case CSS_PX:
			case CSS_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1310);
				cssLength();
				}
				break;
			case CSS_AUTO:
				enterOuterAlt(_localctx, 2);
				{
				setState(1311);
				match(CSS_AUTO);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColorDeclContext extends ParserRuleContext {
		public CssColorValueContext value;
		public ColorPropContext colorProp() {
			return getRuleContext(ColorPropContext.class,0);
		}
		public TerminalNode CSS_COLON() { return getToken(jinja2Parser.CSS_COLON, 0); }
		public CssColorValueContext cssColorValue() {
			return getRuleContext(CssColorValueContext.class,0);
		}
		public TerminalNode CSS_SEMI() { return getToken(jinja2Parser.CSS_SEMI, 0); }
		public ColorDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colorDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterColorDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitColorDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitColorDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorDeclContext colorDecl() throws RecognitionException {
		ColorDeclContext _localctx = new ColorDeclContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_colorDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1314);
			colorProp();
			setState(1315);
			match(CSS_COLON);
			setState(1316);
			((ColorDeclContext)_localctx).value = cssColorValue();
			setState(1318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_SEMI) {
				{
				setState(1317);
				match(CSS_SEMI);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColorPropContext extends ParserRuleContext {
		public TerminalNode CSS_COLOR() { return getToken(jinja2Parser.CSS_COLOR, 0); }
		public TerminalNode CSS_BACKGROUND_COLOR() { return getToken(jinja2Parser.CSS_BACKGROUND_COLOR, 0); }
		public TerminalNode CSS_BORDER_COLOR() { return getToken(jinja2Parser.CSS_BORDER_COLOR, 0); }
		public ColorPropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colorProp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterColorProp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitColorProp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitColorProp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorPropContext colorProp() throws RecognitionException {
		ColorPropContext _localctx = new ColorPropContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_colorProp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1320);
			_la = _input.LA(1);
			if ( !(((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & 69L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssColorValueContext extends ParserRuleContext {
		public CssColorValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssColorValue; }
	 
		public CssColorValueContext() { }
		public void copyFrom(CssColorValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssColorKeywordContext extends CssColorValueContext {
		public CssKeywordContext cssKeyword() {
			return getRuleContext(CssKeywordContext.class,0);
		}
		public CssColorKeywordContext(CssColorValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterCssColorKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitCssColorKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitCssColorKeyword(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssColorLiteralContext extends CssColorValueContext {
		public CssColorContext cssColor() {
			return getRuleContext(CssColorContext.class,0);
		}
		public CssColorLiteralContext(CssColorValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterCssColorLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitCssColorLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitCssColorLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssColorValueContext cssColorValue() throws RecognitionException {
		CssColorValueContext _localctx = new CssColorValueContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_cssColorValue);
		try {
			setState(1324);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_WHITE:
			case CSS_HEX_COLOR:
				_localctx = new CssColorLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1322);
				cssColor();
				}
				break;
			case CSS_FLEX:
			case CSS_BLOCK:
			case CSS_INLINE_BLOCK:
			case CSS_NONE:
			case CSS_CENTER:
			case CSS_AUTO:
			case CSS_UPPERCASE:
			case CSS_INHERIT:
			case CSS_POINTER:
			case CSS_VERTICAL:
			case CSS_CONTAIN:
			case CSS_EASE:
			case CSS_HIDDEN:
			case CSS_WRAP:
			case CSS_SOLID:
			case CSS_BORDER_BOX:
			case CSS_CONTENT_BOX:
				_localctx = new CssColorKeywordContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1323);
				cssKeyword();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class KeywordDeclContext extends ParserRuleContext {
		public CssKeywordContext value;
		public KeywordPropContext keywordProp() {
			return getRuleContext(KeywordPropContext.class,0);
		}
		public TerminalNode CSS_COLON() { return getToken(jinja2Parser.CSS_COLON, 0); }
		public CssKeywordContext cssKeyword() {
			return getRuleContext(CssKeywordContext.class,0);
		}
		public TerminalNode CSS_SEMI() { return getToken(jinja2Parser.CSS_SEMI, 0); }
		public KeywordDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywordDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterKeywordDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitKeywordDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitKeywordDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordDeclContext keywordDecl() throws RecognitionException {
		KeywordDeclContext _localctx = new KeywordDeclContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_keywordDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1326);
			keywordProp();
			setState(1327);
			match(CSS_COLON);
			setState(1328);
			((KeywordDeclContext)_localctx).value = cssKeyword();
			setState(1330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_SEMI) {
				{
				setState(1329);
				match(CSS_SEMI);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class KeywordPropContext extends ParserRuleContext {
		public TerminalNode CSS_DISPLAY() { return getToken(jinja2Parser.CSS_DISPLAY, 0); }
		public TerminalNode CSS_TEXT_ALIGN() { return getToken(jinja2Parser.CSS_TEXT_ALIGN, 0); }
		public TerminalNode CSS_TEXT_DECORATION() { return getToken(jinja2Parser.CSS_TEXT_DECORATION, 0); }
		public TerminalNode CSS_TEXT_TRANSFORM() { return getToken(jinja2Parser.CSS_TEXT_TRANSFORM, 0); }
		public TerminalNode CSS_FLEX_WRAP() { return getToken(jinja2Parser.CSS_FLEX_WRAP, 0); }
		public TerminalNode CSS_JUSTIFY_CONTENT() { return getToken(jinja2Parser.CSS_JUSTIFY_CONTENT, 0); }
		public TerminalNode CSS_ALIGN_ITEMS() { return getToken(jinja2Parser.CSS_ALIGN_ITEMS, 0); }
		public TerminalNode CSS_OVERFLOW() { return getToken(jinja2Parser.CSS_OVERFLOW, 0); }
		public TerminalNode CSS_CURSOR() { return getToken(jinja2Parser.CSS_CURSOR, 0); }
		public TerminalNode CSS_RESIZE() { return getToken(jinja2Parser.CSS_RESIZE, 0); }
		public TerminalNode CSS_OBJECT_FIT() { return getToken(jinja2Parser.CSS_OBJECT_FIT, 0); }
		public KeywordPropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywordProp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterKeywordProp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitKeywordProp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitKeywordProp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordPropContext keywordProp() throws RecognitionException {
		KeywordPropContext _localctx = new KeywordPropContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_keywordProp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1332);
			_la = _input.LA(1);
			if ( !(((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 11202985991L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BoxShadowDeclContext extends ParserRuleContext {
		public BoxShadowValueContext boxShadowValue;
		public List<BoxShadowValueContext> shadows = new ArrayList<BoxShadowValueContext>();
		public TerminalNode CSS_BOX_SHADOW() { return getToken(jinja2Parser.CSS_BOX_SHADOW, 0); }
		public TerminalNode CSS_COLON() { return getToken(jinja2Parser.CSS_COLON, 0); }
		public List<BoxShadowValueContext> boxShadowValue() {
			return getRuleContexts(BoxShadowValueContext.class);
		}
		public BoxShadowValueContext boxShadowValue(int i) {
			return getRuleContext(BoxShadowValueContext.class,i);
		}
		public List<TerminalNode> CSS_COMMA() { return getTokens(jinja2Parser.CSS_COMMA); }
		public TerminalNode CSS_COMMA(int i) {
			return getToken(jinja2Parser.CSS_COMMA, i);
		}
		public TerminalNode CSS_SEMI() { return getToken(jinja2Parser.CSS_SEMI, 0); }
		public BoxShadowDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boxShadowDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterBoxShadowDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitBoxShadowDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitBoxShadowDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoxShadowDeclContext boxShadowDecl() throws RecognitionException {
		BoxShadowDeclContext _localctx = new BoxShadowDeclContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_boxShadowDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1334);
			match(CSS_BOX_SHADOW);
			setState(1335);
			match(CSS_COLON);
			setState(1336);
			((BoxShadowDeclContext)_localctx).boxShadowValue = boxShadowValue();
			((BoxShadowDeclContext)_localctx).shadows.add(((BoxShadowDeclContext)_localctx).boxShadowValue);
			setState(1341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_COMMA) {
				{
				{
				setState(1337);
				match(CSS_COMMA);
				setState(1338);
				((BoxShadowDeclContext)_localctx).boxShadowValue = boxShadowValue();
				((BoxShadowDeclContext)_localctx).shadows.add(((BoxShadowDeclContext)_localctx).boxShadowValue);
				}
				}
				setState(1343);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_SEMI) {
				{
				setState(1344);
				match(CSS_SEMI);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BoxShadowValueContext extends ParserRuleContext {
		public CssLengthContext offsetX;
		public CssLengthContext offsetY;
		public CssLengthContext blur;
		public CssLengthContext spread;
		public CssColorOrFunctionContext color;
		public List<CssLengthContext> cssLength() {
			return getRuleContexts(CssLengthContext.class);
		}
		public CssLengthContext cssLength(int i) {
			return getRuleContext(CssLengthContext.class,i);
		}
		public CssColorOrFunctionContext cssColorOrFunction() {
			return getRuleContext(CssColorOrFunctionContext.class,0);
		}
		public BoxShadowValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boxShadowValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterBoxShadowValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitBoxShadowValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitBoxShadowValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoxShadowValueContext boxShadowValue() throws RecognitionException {
		BoxShadowValueContext _localctx = new BoxShadowValueContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_boxShadowValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1347);
			((BoxShadowValueContext)_localctx).offsetX = cssLength();
			setState(1348);
			((BoxShadowValueContext)_localctx).offsetY = cssLength();
			setState(1350);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				{
				setState(1349);
				((BoxShadowValueContext)_localctx).blur = cssLength();
				}
				break;
			}
			setState(1353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 125)) & ~0x3f) == 0 && ((1L << (_la - 125)) & 79L) != 0)) {
				{
				setState(1352);
				((BoxShadowValueContext)_localctx).spread = cssLength();
				}
			}

			setState(1355);
			((BoxShadowValueContext)_localctx).color = cssColorOrFunction();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssColorOrFunctionContext extends ParserRuleContext {
		public CssColorOrFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssColorOrFunction; }
	 
		public CssColorOrFunctionContext() { }
		public void copyFrom(CssColorOrFunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssColorOrFuncFuncContext extends CssColorOrFunctionContext {
		public CssFunctionContext cssFunction() {
			return getRuleContext(CssFunctionContext.class,0);
		}
		public CssColorOrFuncFuncContext(CssColorOrFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterCssColorOrFuncFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitCssColorOrFuncFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitCssColorOrFuncFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssColorOrFuncColorContext extends CssColorOrFunctionContext {
		public CssColorContext cssColor() {
			return getRuleContext(CssColorContext.class,0);
		}
		public CssColorOrFuncColorContext(CssColorOrFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterCssColorOrFuncColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitCssColorOrFuncColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitCssColorOrFuncColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssColorOrFunctionContext cssColorOrFunction() throws RecognitionException {
		CssColorOrFunctionContext _localctx = new CssColorOrFunctionContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_cssColorOrFunction);
		try {
			setState(1359);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_WHITE:
			case CSS_HEX_COLOR:
				_localctx = new CssColorOrFuncColorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1357);
				cssColor();
				}
				break;
			case CSS_RGBA:
			case CSS_TRANSLATEY:
				_localctx = new CssColorOrFuncFuncContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1358);
				cssFunction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BorderDeclContext extends ParserRuleContext {
		public CssKeywordContext keyword;
		public CssLengthContext width;
		public CssKeywordContext style;
		public CssColorValueContext color;
		public BorderPropContext borderProp() {
			return getRuleContext(BorderPropContext.class,0);
		}
		public TerminalNode CSS_COLON() { return getToken(jinja2Parser.CSS_COLON, 0); }
		public CssKeywordContext cssKeyword() {
			return getRuleContext(CssKeywordContext.class,0);
		}
		public CssLengthContext cssLength() {
			return getRuleContext(CssLengthContext.class,0);
		}
		public CssColorValueContext cssColorValue() {
			return getRuleContext(CssColorValueContext.class,0);
		}
		public TerminalNode CSS_SEMI() { return getToken(jinja2Parser.CSS_SEMI, 0); }
		public BorderDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_borderDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterBorderDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitBorderDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitBorderDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BorderDeclContext borderDecl() throws RecognitionException {
		BorderDeclContext _localctx = new BorderDeclContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_borderDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1361);
			borderProp();
			setState(1362);
			match(CSS_COLON);
			setState(1368);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_FLEX:
			case CSS_BLOCK:
			case CSS_INLINE_BLOCK:
			case CSS_NONE:
			case CSS_CENTER:
			case CSS_AUTO:
			case CSS_UPPERCASE:
			case CSS_INHERIT:
			case CSS_POINTER:
			case CSS_VERTICAL:
			case CSS_CONTAIN:
			case CSS_EASE:
			case CSS_HIDDEN:
			case CSS_WRAP:
			case CSS_SOLID:
			case CSS_BORDER_BOX:
			case CSS_CONTENT_BOX:
				{
				setState(1363);
				((BorderDeclContext)_localctx).keyword = cssKeyword();
				}
				break;
			case CSS_VH:
			case CSS_EM:
			case CSS_PERCENT:
			case CSS_PX:
			case CSS_NUMBER:
				{
				setState(1364);
				((BorderDeclContext)_localctx).width = cssLength();
				setState(1365);
				((BorderDeclContext)_localctx).style = cssKeyword();
				setState(1366);
				((BorderDeclContext)_localctx).color = cssColorValue();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_SEMI) {
				{
				setState(1370);
				match(CSS_SEMI);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BorderPropContext extends ParserRuleContext {
		public TerminalNode CSS_BORDER() { return getToken(jinja2Parser.CSS_BORDER, 0); }
		public TerminalNode CSS_BORDER_TOP() { return getToken(jinja2Parser.CSS_BORDER_TOP, 0); }
		public BorderPropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_borderProp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterBorderProp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitBorderProp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitBorderProp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BorderPropContext borderProp() throws RecognitionException {
		BorderPropContext _localctx = new BorderPropContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_borderProp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1373);
			_la = _input.LA(1);
			if ( !(_la==CSS_BORDER || _la==CSS_BORDER_TOP) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TransitionDeclContext extends ParserRuleContext {
		public CssTransitionPropertyContext property;
		public CssTimeContext duration;
		public CssKeywordContext easing;
		public TerminalNode CSS_TRANSITION() { return getToken(jinja2Parser.CSS_TRANSITION, 0); }
		public TerminalNode CSS_COLON() { return getToken(jinja2Parser.CSS_COLON, 0); }
		public CssTransitionPropertyContext cssTransitionProperty() {
			return getRuleContext(CssTransitionPropertyContext.class,0);
		}
		public CssTimeContext cssTime() {
			return getRuleContext(CssTimeContext.class,0);
		}
		public CssKeywordContext cssKeyword() {
			return getRuleContext(CssKeywordContext.class,0);
		}
		public TerminalNode CSS_SEMI() { return getToken(jinja2Parser.CSS_SEMI, 0); }
		public TransitionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transitionDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterTransitionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitTransitionDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitTransitionDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransitionDeclContext transitionDecl() throws RecognitionException {
		TransitionDeclContext _localctx = new TransitionDeclContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_transitionDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1375);
			match(CSS_TRANSITION);
			setState(1376);
			match(CSS_COLON);
			setState(1377);
			((TransitionDeclContext)_localctx).property = cssTransitionProperty();
			setState(1378);
			((TransitionDeclContext)_localctx).duration = cssTime();
			setState(1379);
			((TransitionDeclContext)_localctx).easing = cssKeyword();
			setState(1381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_SEMI) {
				{
				setState(1380);
				match(CSS_SEMI);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssTransitionPropertyContext extends ParserRuleContext {
		public CssIdentContext cssIdent() {
			return getRuleContext(CssIdentContext.class,0);
		}
		public TerminalNode CSS_COLOR() { return getToken(jinja2Parser.CSS_COLOR, 0); }
		public TerminalNode CSS_BACKGROUND() { return getToken(jinja2Parser.CSS_BACKGROUND, 0); }
		public TerminalNode CSS_TRANSFORM() { return getToken(jinja2Parser.CSS_TRANSFORM, 0); }
		public TerminalNode CSS_BORDER_COLOR() { return getToken(jinja2Parser.CSS_BORDER_COLOR, 0); }
		public CssTransitionPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssTransitionProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterCssTransitionProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitCssTransitionProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitCssTransitionProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssTransitionPropertyContext cssTransitionProperty() throws RecognitionException {
		CssTransitionPropertyContext _localctx = new CssTransitionPropertyContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_cssTransitionProperty);
		try {
			setState(1388);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1383);
				cssIdent();
				}
				break;
			case CSS_COLOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1384);
				match(CSS_COLOR);
				}
				break;
			case CSS_BACKGROUND:
				enterOuterAlt(_localctx, 3);
				{
				setState(1385);
				match(CSS_BACKGROUND);
				}
				break;
			case CSS_TRANSFORM:
				enterOuterAlt(_localctx, 4);
				{
				setState(1386);
				match(CSS_TRANSFORM);
				}
				break;
			case CSS_BORDER_COLOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(1387);
				match(CSS_BORDER_COLOR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TransformDeclContext extends ParserRuleContext {
		public CssTransformFunctionContext value;
		public TerminalNode CSS_TRANSFORM() { return getToken(jinja2Parser.CSS_TRANSFORM, 0); }
		public TerminalNode CSS_COLON() { return getToken(jinja2Parser.CSS_COLON, 0); }
		public CssTransformFunctionContext cssTransformFunction() {
			return getRuleContext(CssTransformFunctionContext.class,0);
		}
		public TerminalNode CSS_SEMI() { return getToken(jinja2Parser.CSS_SEMI, 0); }
		public TransformDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transformDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterTransformDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitTransformDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitTransformDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransformDeclContext transformDecl() throws RecognitionException {
		TransformDeclContext _localctx = new TransformDeclContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_transformDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1390);
			match(CSS_TRANSFORM);
			setState(1391);
			match(CSS_COLON);
			setState(1392);
			((TransformDeclContext)_localctx).value = cssTransformFunction();
			setState(1394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_SEMI) {
				{
				setState(1393);
				match(CSS_SEMI);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BackgroundDeclContext extends ParserRuleContext {
		public CssBackgroundValueContext value;
		public TerminalNode CSS_BACKGROUND() { return getToken(jinja2Parser.CSS_BACKGROUND, 0); }
		public TerminalNode CSS_COLON() { return getToken(jinja2Parser.CSS_COLON, 0); }
		public CssBackgroundValueContext cssBackgroundValue() {
			return getRuleContext(CssBackgroundValueContext.class,0);
		}
		public TerminalNode CSS_SEMI() { return getToken(jinja2Parser.CSS_SEMI, 0); }
		public BackgroundDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_backgroundDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterBackgroundDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitBackgroundDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitBackgroundDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BackgroundDeclContext backgroundDecl() throws RecognitionException {
		BackgroundDeclContext _localctx = new BackgroundDeclContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_backgroundDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1396);
			match(CSS_BACKGROUND);
			setState(1397);
			match(CSS_COLON);
			setState(1398);
			((BackgroundDeclContext)_localctx).value = cssBackgroundValue();
			setState(1400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_SEMI) {
				{
				setState(1399);
				match(CSS_SEMI);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssBackgroundValueContext extends ParserRuleContext {
		public CssBackgroundValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssBackgroundValue; }
	 
		public CssBackgroundValueContext() { }
		public void copyFrom(CssBackgroundValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssBgKeywordContext extends CssBackgroundValueContext {
		public CssKeywordContext cssKeyword() {
			return getRuleContext(CssKeywordContext.class,0);
		}
		public CssBgKeywordContext(CssBackgroundValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterCssBgKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitCssBgKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitCssBgKeyword(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssBgFunctionContext extends CssBackgroundValueContext {
		public CssFunctionContext cssFunction() {
			return getRuleContext(CssFunctionContext.class,0);
		}
		public CssBgFunctionContext(CssBackgroundValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterCssBgFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitCssBgFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitCssBgFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssBgColorContext extends CssBackgroundValueContext {
		public CssColorContext cssColor() {
			return getRuleContext(CssColorContext.class,0);
		}
		public CssBgColorContext(CssBackgroundValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterCssBgColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitCssBgColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitCssBgColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssBackgroundValueContext cssBackgroundValue() throws RecognitionException {
		CssBackgroundValueContext _localctx = new CssBackgroundValueContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_cssBackgroundValue);
		try {
			setState(1405);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_WHITE:
			case CSS_HEX_COLOR:
				_localctx = new CssBgColorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1402);
				cssColor();
				}
				break;
			case CSS_FLEX:
			case CSS_BLOCK:
			case CSS_INLINE_BLOCK:
			case CSS_NONE:
			case CSS_CENTER:
			case CSS_AUTO:
			case CSS_UPPERCASE:
			case CSS_INHERIT:
			case CSS_POINTER:
			case CSS_VERTICAL:
			case CSS_CONTAIN:
			case CSS_EASE:
			case CSS_HIDDEN:
			case CSS_WRAP:
			case CSS_SOLID:
			case CSS_BORDER_BOX:
			case CSS_CONTENT_BOX:
				_localctx = new CssBgKeywordContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1403);
				cssKeyword();
				}
				break;
			case CSS_RGBA:
			case CSS_TRANSLATEY:
				_localctx = new CssBgFunctionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1404);
				cssFunction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FontFamilyDeclContext extends ParserRuleContext {
		public CssFontNameContext cssFontName;
		public List<CssFontNameContext> fonts = new ArrayList<CssFontNameContext>();
		public TerminalNode CSS_FONT_FAMILY() { return getToken(jinja2Parser.CSS_FONT_FAMILY, 0); }
		public TerminalNode CSS_COLON() { return getToken(jinja2Parser.CSS_COLON, 0); }
		public List<CssFontNameContext> cssFontName() {
			return getRuleContexts(CssFontNameContext.class);
		}
		public CssFontNameContext cssFontName(int i) {
			return getRuleContext(CssFontNameContext.class,i);
		}
		public List<TerminalNode> CSS_COMMA() { return getTokens(jinja2Parser.CSS_COMMA); }
		public TerminalNode CSS_COMMA(int i) {
			return getToken(jinja2Parser.CSS_COMMA, i);
		}
		public TerminalNode CSS_SEMI() { return getToken(jinja2Parser.CSS_SEMI, 0); }
		public FontFamilyDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontFamilyDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterFontFamilyDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitFontFamilyDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitFontFamilyDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FontFamilyDeclContext fontFamilyDecl() throws RecognitionException {
		FontFamilyDeclContext _localctx = new FontFamilyDeclContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_fontFamilyDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1407);
			match(CSS_FONT_FAMILY);
			setState(1408);
			match(CSS_COLON);
			setState(1409);
			((FontFamilyDeclContext)_localctx).cssFontName = cssFontName();
			((FontFamilyDeclContext)_localctx).fonts.add(((FontFamilyDeclContext)_localctx).cssFontName);
			setState(1414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_COMMA) {
				{
				{
				setState(1410);
				match(CSS_COMMA);
				setState(1411);
				((FontFamilyDeclContext)_localctx).cssFontName = cssFontName();
				((FontFamilyDeclContext)_localctx).fonts.add(((FontFamilyDeclContext)_localctx).cssFontName);
				}
				}
				setState(1416);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_SEMI) {
				{
				setState(1417);
				match(CSS_SEMI);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssFontNameContext extends ParserRuleContext {
		public List<CssFontTokenContext> cssFontToken() {
			return getRuleContexts(CssFontTokenContext.class);
		}
		public CssFontTokenContext cssFontToken(int i) {
			return getRuleContext(CssFontTokenContext.class,i);
		}
		public CssFontNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssFontName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterCssFontName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitCssFontName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitCssFontName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssFontNameContext cssFontName() throws RecognitionException {
		CssFontNameContext _localctx = new CssFontNameContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_cssFontName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1421); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1420);
				cssFontToken();
				}
				}
				setState(1423); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & 16777237L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssFontTokenContext extends ParserRuleContext {
		public TerminalNode CSS_IDENT() { return getToken(jinja2Parser.CSS_IDENT, 0); }
		public TerminalNode CSS_INHERIT() { return getToken(jinja2Parser.CSS_INHERIT, 0); }
		public TerminalNode CSS_AUTO() { return getToken(jinja2Parser.CSS_AUTO, 0); }
		public TerminalNode CSS_NONE() { return getToken(jinja2Parser.CSS_NONE, 0); }
		public CssFontTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssFontToken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterCssFontToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitCssFontToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitCssFontToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssFontTokenContext cssFontToken() throws RecognitionException {
		CssFontTokenContext _localctx = new CssFontTokenContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_cssFontToken);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1425);
			_la = _input.LA(1);
			if ( !(((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & 16777237L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FontWeightDeclContext extends ParserRuleContext {
		public CssFontWeightValueContext value;
		public TerminalNode CSS_FONT_WEIGHT() { return getToken(jinja2Parser.CSS_FONT_WEIGHT, 0); }
		public TerminalNode CSS_COLON() { return getToken(jinja2Parser.CSS_COLON, 0); }
		public CssFontWeightValueContext cssFontWeightValue() {
			return getRuleContext(CssFontWeightValueContext.class,0);
		}
		public TerminalNode CSS_SEMI() { return getToken(jinja2Parser.CSS_SEMI, 0); }
		public FontWeightDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontWeightDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterFontWeightDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitFontWeightDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitFontWeightDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FontWeightDeclContext fontWeightDecl() throws RecognitionException {
		FontWeightDeclContext _localctx = new FontWeightDeclContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_fontWeightDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1427);
			match(CSS_FONT_WEIGHT);
			setState(1428);
			match(CSS_COLON);
			setState(1429);
			((FontWeightDeclContext)_localctx).value = cssFontWeightValue();
			setState(1431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_SEMI) {
				{
				setState(1430);
				match(CSS_SEMI);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssFontWeightValueContext extends ParserRuleContext {
		public CssFontWeightValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssFontWeightValue; }
	 
		public CssFontWeightValueContext() { }
		public void copyFrom(CssFontWeightValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssFontWeightNumContext extends CssFontWeightValueContext {
		public CssNumberContext cssNumber() {
			return getRuleContext(CssNumberContext.class,0);
		}
		public CssFontWeightNumContext(CssFontWeightValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterCssFontWeightNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitCssFontWeightNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitCssFontWeightNum(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssFontWeightKeywordContext extends CssFontWeightValueContext {
		public CssKeywordContext cssKeyword() {
			return getRuleContext(CssKeywordContext.class,0);
		}
		public CssFontWeightKeywordContext(CssFontWeightValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterCssFontWeightKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitCssFontWeightKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitCssFontWeightKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssFontWeightValueContext cssFontWeightValue() throws RecognitionException {
		CssFontWeightValueContext _localctx = new CssFontWeightValueContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_cssFontWeightValue);
		try {
			setState(1435);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_NUMBER:
				_localctx = new CssFontWeightNumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1433);
				cssNumber();
				}
				break;
			case CSS_FLEX:
			case CSS_BLOCK:
			case CSS_INLINE_BLOCK:
			case CSS_NONE:
			case CSS_CENTER:
			case CSS_AUTO:
			case CSS_UPPERCASE:
			case CSS_INHERIT:
			case CSS_POINTER:
			case CSS_VERTICAL:
			case CSS_CONTAIN:
			case CSS_EASE:
			case CSS_HIDDEN:
			case CSS_WRAP:
			case CSS_SOLID:
			case CSS_BORDER_BOX:
			case CSS_CONTENT_BOX:
				_localctx = new CssFontWeightKeywordContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1434);
				cssKeyword();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BoxSizingDeclContext extends ParserRuleContext {
		public CssKeywordContext value;
		public TerminalNode CSS_BOX_SIZING() { return getToken(jinja2Parser.CSS_BOX_SIZING, 0); }
		public TerminalNode CSS_COLON() { return getToken(jinja2Parser.CSS_COLON, 0); }
		public CssKeywordContext cssKeyword() {
			return getRuleContext(CssKeywordContext.class,0);
		}
		public TerminalNode CSS_SEMI() { return getToken(jinja2Parser.CSS_SEMI, 0); }
		public BoxSizingDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boxSizingDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterBoxSizingDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitBoxSizingDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitBoxSizingDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoxSizingDeclContext boxSizingDecl() throws RecognitionException {
		BoxSizingDeclContext _localctx = new BoxSizingDeclContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_boxSizingDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1437);
			match(CSS_BOX_SIZING);
			setState(1438);
			match(CSS_COLON);
			setState(1439);
			((BoxSizingDeclContext)_localctx).value = cssKeyword();
			setState(1441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_SEMI) {
				{
				setState(1440);
				match(CSS_SEMI);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OutlineDeclContext extends ParserRuleContext {
		public CssOutlineValueContext value;
		public TerminalNode CSS_OUTLINE() { return getToken(jinja2Parser.CSS_OUTLINE, 0); }
		public TerminalNode CSS_COLON() { return getToken(jinja2Parser.CSS_COLON, 0); }
		public CssOutlineValueContext cssOutlineValue() {
			return getRuleContext(CssOutlineValueContext.class,0);
		}
		public TerminalNode CSS_SEMI() { return getToken(jinja2Parser.CSS_SEMI, 0); }
		public OutlineDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outlineDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterOutlineDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitOutlineDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitOutlineDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutlineDeclContext outlineDecl() throws RecognitionException {
		OutlineDeclContext _localctx = new OutlineDeclContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_outlineDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1443);
			match(CSS_OUTLINE);
			setState(1444);
			match(CSS_COLON);
			setState(1445);
			((OutlineDeclContext)_localctx).value = cssOutlineValue();
			setState(1447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_SEMI) {
				{
				setState(1446);
				match(CSS_SEMI);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssOutlineValueContext extends ParserRuleContext {
		public CssOutlineValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssOutlineValue; }
	 
		public CssOutlineValueContext() { }
		public void copyFrom(CssOutlineValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssOutlineFullContext extends CssOutlineValueContext {
		public OutlineValueContext outlineValue() {
			return getRuleContext(OutlineValueContext.class,0);
		}
		public CssOutlineFullContext(CssOutlineValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterCssOutlineFull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitCssOutlineFull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitCssOutlineFull(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssOutlineKeywordContext extends CssOutlineValueContext {
		public CssKeywordContext cssKeyword() {
			return getRuleContext(CssKeywordContext.class,0);
		}
		public CssOutlineKeywordContext(CssOutlineValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterCssOutlineKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitCssOutlineKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitCssOutlineKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssOutlineValueContext cssOutlineValue() throws RecognitionException {
		CssOutlineValueContext _localctx = new CssOutlineValueContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_cssOutlineValue);
		try {
			setState(1451);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_FLEX:
			case CSS_BLOCK:
			case CSS_INLINE_BLOCK:
			case CSS_NONE:
			case CSS_CENTER:
			case CSS_AUTO:
			case CSS_UPPERCASE:
			case CSS_INHERIT:
			case CSS_POINTER:
			case CSS_VERTICAL:
			case CSS_CONTAIN:
			case CSS_EASE:
			case CSS_HIDDEN:
			case CSS_WRAP:
			case CSS_SOLID:
			case CSS_BORDER_BOX:
			case CSS_CONTENT_BOX:
				_localctx = new CssOutlineKeywordContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1449);
				cssKeyword();
				}
				break;
			case CSS_VH:
			case CSS_EM:
			case CSS_PERCENT:
			case CSS_PX:
			case CSS_NUMBER:
				_localctx = new CssOutlineFullContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1450);
				outlineValue();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OutlineValueContext extends ParserRuleContext {
		public CssLengthContext width;
		public CssKeywordContext style;
		public CssColorValueContext color;
		public CssLengthContext cssLength() {
			return getRuleContext(CssLengthContext.class,0);
		}
		public CssKeywordContext cssKeyword() {
			return getRuleContext(CssKeywordContext.class,0);
		}
		public CssColorValueContext cssColorValue() {
			return getRuleContext(CssColorValueContext.class,0);
		}
		public OutlineValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outlineValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterOutlineValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitOutlineValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitOutlineValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutlineValueContext outlineValue() throws RecognitionException {
		OutlineValueContext _localctx = new OutlineValueContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_outlineValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1453);
			((OutlineValueContext)_localctx).width = cssLength();
			setState(1454);
			((OutlineValueContext)_localctx).style = cssKeyword();
			setState(1455);
			((OutlineValueContext)_localctx).color = cssColorValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssLengthContext extends ParserRuleContext {
		public TerminalNode CSS_PX() { return getToken(jinja2Parser.CSS_PX, 0); }
		public TerminalNode CSS_PERCENT() { return getToken(jinja2Parser.CSS_PERCENT, 0); }
		public TerminalNode CSS_EM() { return getToken(jinja2Parser.CSS_EM, 0); }
		public TerminalNode CSS_VH() { return getToken(jinja2Parser.CSS_VH, 0); }
		public TerminalNode CSS_NUMBER() { return getToken(jinja2Parser.CSS_NUMBER, 0); }
		public CssLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssLength; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterCssLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitCssLength(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitCssLength(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssLengthContext cssLength() throws RecognitionException {
		CssLengthContext _localctx = new CssLengthContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_cssLength);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1457);
			_la = _input.LA(1);
			if ( !(((((_la - 125)) & ~0x3f) == 0 && ((1L << (_la - 125)) & 79L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssColorContext extends ParserRuleContext {
		public TerminalNode CSS_HEX_COLOR() { return getToken(jinja2Parser.CSS_HEX_COLOR, 0); }
		public TerminalNode CSS_WHITE() { return getToken(jinja2Parser.CSS_WHITE, 0); }
		public CssColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssColor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterCssColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitCssColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitCssColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssColorContext cssColor() throws RecognitionException {
		CssColorContext _localctx = new CssColorContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_cssColor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1459);
			_la = _input.LA(1);
			if ( !(_la==CSS_WHITE || _la==CSS_HEX_COLOR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssKeywordContext extends ParserRuleContext {
		public TerminalNode CSS_FLEX() { return getToken(jinja2Parser.CSS_FLEX, 0); }
		public TerminalNode CSS_BLOCK() { return getToken(jinja2Parser.CSS_BLOCK, 0); }
		public TerminalNode CSS_INLINE_BLOCK() { return getToken(jinja2Parser.CSS_INLINE_BLOCK, 0); }
		public TerminalNode CSS_NONE() { return getToken(jinja2Parser.CSS_NONE, 0); }
		public TerminalNode CSS_CENTER() { return getToken(jinja2Parser.CSS_CENTER, 0); }
		public TerminalNode CSS_AUTO() { return getToken(jinja2Parser.CSS_AUTO, 0); }
		public TerminalNode CSS_UPPERCASE() { return getToken(jinja2Parser.CSS_UPPERCASE, 0); }
		public TerminalNode CSS_INHERIT() { return getToken(jinja2Parser.CSS_INHERIT, 0); }
		public TerminalNode CSS_POINTER() { return getToken(jinja2Parser.CSS_POINTER, 0); }
		public TerminalNode CSS_VERTICAL() { return getToken(jinja2Parser.CSS_VERTICAL, 0); }
		public TerminalNode CSS_CONTAIN() { return getToken(jinja2Parser.CSS_CONTAIN, 0); }
		public TerminalNode CSS_EASE() { return getToken(jinja2Parser.CSS_EASE, 0); }
		public TerminalNode CSS_HIDDEN() { return getToken(jinja2Parser.CSS_HIDDEN, 0); }
		public TerminalNode CSS_WRAP() { return getToken(jinja2Parser.CSS_WRAP, 0); }
		public TerminalNode CSS_SOLID() { return getToken(jinja2Parser.CSS_SOLID, 0); }
		public TerminalNode CSS_BORDER_BOX() { return getToken(jinja2Parser.CSS_BORDER_BOX, 0); }
		public TerminalNode CSS_CONTENT_BOX() { return getToken(jinja2Parser.CSS_CONTENT_BOX, 0); }
		public CssKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterCssKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitCssKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitCssKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssKeywordContext cssKeyword() throws RecognitionException {
		CssKeywordContext _localctx = new CssKeywordContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_cssKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1461);
			_la = _input.LA(1);
			if ( !(((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & 131071L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssNumberContext extends ParserRuleContext {
		public TerminalNode CSS_NUMBER() { return getToken(jinja2Parser.CSS_NUMBER, 0); }
		public CssNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterCssNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitCssNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitCssNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssNumberContext cssNumber() throws RecognitionException {
		CssNumberContext _localctx = new CssNumberContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_cssNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1463);
			match(CSS_NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssTimeContext extends ParserRuleContext {
		public TerminalNode CSS_TIME() { return getToken(jinja2Parser.CSS_TIME, 0); }
		public CssTimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssTime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterCssTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitCssTime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitCssTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssTimeContext cssTime() throws RecognitionException {
		CssTimeContext _localctx = new CssTimeContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_cssTime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1465);
			match(CSS_TIME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssIdentContext extends ParserRuleContext {
		public TerminalNode CSS_IDENT() { return getToken(jinja2Parser.CSS_IDENT, 0); }
		public CssIdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssIdent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterCssIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitCssIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitCssIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssIdentContext cssIdent() throws RecognitionException {
		CssIdentContext _localctx = new CssIdentContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_cssIdent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1467);
			match(CSS_IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssFunctionContext extends ParserRuleContext {
		public CssFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssFunction; }
	 
		public CssFunctionContext() { }
		public void copyFrom(CssFunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssRgbaFuncContext extends CssFunctionContext {
		public CssRgbaFunctionContext cssRgbaFunction() {
			return getRuleContext(CssRgbaFunctionContext.class,0);
		}
		public CssRgbaFuncContext(CssFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterCssRgbaFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitCssRgbaFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitCssRgbaFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssTransformFuncContext extends CssFunctionContext {
		public CssTransformFunctionContext cssTransformFunction() {
			return getRuleContext(CssTransformFunctionContext.class,0);
		}
		public CssTransformFuncContext(CssFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterCssTransformFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitCssTransformFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitCssTransformFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssFunctionContext cssFunction() throws RecognitionException {
		CssFunctionContext _localctx = new CssFunctionContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_cssFunction);
		try {
			setState(1471);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_RGBA:
				_localctx = new CssRgbaFuncContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1469);
				cssRgbaFunction();
				}
				break;
			case CSS_TRANSLATEY:
				_localctx = new CssTransformFuncContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1470);
				cssTransformFunction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssRgbaFunctionContext extends ParserRuleContext {
		public Token r;
		public Token g;
		public Token b;
		public Token a;
		public TerminalNode CSS_RGBA() { return getToken(jinja2Parser.CSS_RGBA, 0); }
		public TerminalNode CSS_LPAREN() { return getToken(jinja2Parser.CSS_LPAREN, 0); }
		public List<TerminalNode> CSS_COMMA() { return getTokens(jinja2Parser.CSS_COMMA); }
		public TerminalNode CSS_COMMA(int i) {
			return getToken(jinja2Parser.CSS_COMMA, i);
		}
		public TerminalNode CSS_RPAREN() { return getToken(jinja2Parser.CSS_RPAREN, 0); }
		public List<TerminalNode> CSS_NUMBER() { return getTokens(jinja2Parser.CSS_NUMBER); }
		public TerminalNode CSS_NUMBER(int i) {
			return getToken(jinja2Parser.CSS_NUMBER, i);
		}
		public CssRgbaFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssRgbaFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterCssRgbaFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitCssRgbaFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitCssRgbaFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssRgbaFunctionContext cssRgbaFunction() throws RecognitionException {
		CssRgbaFunctionContext _localctx = new CssRgbaFunctionContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_cssRgbaFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1473);
			match(CSS_RGBA);
			setState(1474);
			match(CSS_LPAREN);
			setState(1475);
			((CssRgbaFunctionContext)_localctx).r = match(CSS_NUMBER);
			setState(1476);
			match(CSS_COMMA);
			setState(1477);
			((CssRgbaFunctionContext)_localctx).g = match(CSS_NUMBER);
			setState(1478);
			match(CSS_COMMA);
			setState(1479);
			((CssRgbaFunctionContext)_localctx).b = match(CSS_NUMBER);
			setState(1480);
			match(CSS_COMMA);
			setState(1481);
			((CssRgbaFunctionContext)_localctx).a = match(CSS_NUMBER);
			setState(1482);
			match(CSS_RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssTransformFunctionContext extends ParserRuleContext {
		public CssValueContext value;
		public TerminalNode CSS_TRANSLATEY() { return getToken(jinja2Parser.CSS_TRANSLATEY, 0); }
		public TerminalNode CSS_LPAREN() { return getToken(jinja2Parser.CSS_LPAREN, 0); }
		public TerminalNode CSS_RPAREN() { return getToken(jinja2Parser.CSS_RPAREN, 0); }
		public CssValueContext cssValue() {
			return getRuleContext(CssValueContext.class,0);
		}
		public CssTransformFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssTransformFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterCssTransformFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitCssTransformFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitCssTransformFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssTransformFunctionContext cssTransformFunction() throws RecognitionException {
		CssTransformFunctionContext _localctx = new CssTransformFunctionContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_cssTransformFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1484);
			match(CSS_TRANSLATEY);
			setState(1485);
			match(CSS_LPAREN);
			setState(1486);
			((CssTransformFunctionContext)_localctx).value = cssValue();
			setState(1487);
			match(CSS_RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssValueContext extends ParserRuleContext {
		public CssValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssValue; }
	 
		public CssValueContext() { }
		public void copyFrom(CssValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssValueColorContext extends CssValueContext {
		public CssColorContext cssColor() {
			return getRuleContext(CssColorContext.class,0);
		}
		public CssValueColorContext(CssValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterCssValueColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitCssValueColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitCssValueColor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssValueIdentContext extends CssValueContext {
		public CssIdentContext cssIdent() {
			return getRuleContext(CssIdentContext.class,0);
		}
		public CssValueIdentContext(CssValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterCssValueIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitCssValueIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitCssValueIdent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssValueLengthContext extends CssValueContext {
		public CssLengthContext cssLength() {
			return getRuleContext(CssLengthContext.class,0);
		}
		public CssValueLengthContext(CssValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterCssValueLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitCssValueLength(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitCssValueLength(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssValueKeywordContext extends CssValueContext {
		public CssKeywordContext cssKeyword() {
			return getRuleContext(CssKeywordContext.class,0);
		}
		public CssValueKeywordContext(CssValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterCssValueKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitCssValueKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitCssValueKeyword(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssValueTimeContext extends CssValueContext {
		public CssTimeContext cssTime() {
			return getRuleContext(CssTimeContext.class,0);
		}
		public CssValueTimeContext(CssValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterCssValueTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitCssValueTime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitCssValueTime(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssValueFunctionContext extends CssValueContext {
		public CssFunctionContext cssFunction() {
			return getRuleContext(CssFunctionContext.class,0);
		}
		public CssValueFunctionContext(CssValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterCssValueFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitCssValueFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitCssValueFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssValueNumberContext extends CssValueContext {
		public CssNumberContext cssNumber() {
			return getRuleContext(CssNumberContext.class,0);
		}
		public CssValueNumberContext(CssValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterCssValueNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitCssValueNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitCssValueNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssValueContext cssValue() throws RecognitionException {
		CssValueContext _localctx = new CssValueContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_cssValue);
		try {
			setState(1496);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				_localctx = new CssValueLengthContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1489);
				cssLength();
				}
				break;
			case 2:
				_localctx = new CssValueColorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1490);
				cssColor();
				}
				break;
			case 3:
				_localctx = new CssValueKeywordContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1491);
				cssKeyword();
				}
				break;
			case 4:
				_localctx = new CssValueNumberContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1492);
				cssNumber();
				}
				break;
			case 5:
				_localctx = new CssValueFunctionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1493);
				cssFunction();
				}
				break;
			case 6:
				_localctx = new CssValueIdentContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1494);
				cssIdent();
				}
				break;
			case 7:
				_localctx = new CssValueTimeContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1495);
				cssTime();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u00da\u05db\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
		"T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007"+
		"Y\u0002Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007"+
		"^\u0002_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007"+
		"c\u0002d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007"+
		"h\u0002i\u0007i\u0002j\u0007j\u0002k\u0007k\u0002l\u0007l\u0002m\u0007"+
		"m\u0002n\u0007n\u0002o\u0007o\u0002p\u0007p\u0002q\u0007q\u0002r\u0007"+
		"r\u0002s\u0007s\u0002t\u0007t\u0002u\u0007u\u0002v\u0007v\u0002w\u0007"+
		"w\u0002x\u0007x\u0002y\u0007y\u0002z\u0007z\u0002{\u0007{\u0002|\u0007"+
		"|\u0002}\u0007}\u0002~\u0007~\u0002\u007f\u0007\u007f\u0002\u0080\u0007"+
		"\u0080\u0002\u0081\u0007\u0081\u0002\u0082\u0007\u0082\u0002\u0083\u0007"+
		"\u0083\u0001\u0000\u0005\u0000\u010a\b\u0000\n\u0000\f\u0000\u010d\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001\u0127\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002\u0139\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"\u013e\b\u0003\n\u0003\f\u0003\u0141\t\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u0003\u0145\b\u0003\n\u0003\f\u0003\u0148\t\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003\u014d\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004\u0152\b\u0004\n\u0004\f\u0004\u0155\t\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004\u0159\b\u0004\n\u0004\f\u0004\u015c\t\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u0161\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005\u0166\b\u0005\n\u0005\f\u0005\u0169\t\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005\u016d\b\u0005\n\u0005\f\u0005\u0170\t\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0175\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006\u017a\b\u0006\n\u0006\f\u0006\u017d"+
		"\t\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0181\b\u0006\n\u0006\f\u0006"+
		"\u0184\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007\u018d\b\u0007\n\u0007\f\u0007\u0190"+
		"\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0005\b\u0199\b\b\n\b\f\b\u019c\t\b\u0001\b\u0001\b\u0005\b"+
		"\u01a0\b\b\n\b\f\b\u01a3\t\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0005\t\u01ac\b\t\n\t\f\t\u01af\t\t\u0001\t\u0001\t\u0005\t"+
		"\u01b3\b\t\n\t\f\t\u01b6\t\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0005\n\u01bf\b\n\n\n\f\n\u01c2\t\n\u0001\n\u0001\n\u0005\n"+
		"\u01c6\b\n\n\n\f\n\u01c9\t\n\u0001\n\u0001\n\u0001\n\u0003\n\u01ce\b\n"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u01d3\b\u000b\n\u000b"+
		"\f\u000b\u01d6\t\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u01da\b\u000b"+
		"\n\u000b\f\u000b\u01dd\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0005\f\u01e6\b\f\n\f\f\f\u01e9\t\f\u0001"+
		"\f\u0001\f\u0005\f\u01ed\b\f\n\f\f\f\u01f0\t\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\r\u0001\r\u0001\r\u0005\r\u01f9\b\r\n\r\f\r\u01fc\t\r\u0001"+
		"\r\u0001\r\u0005\r\u0200\b\r\n\r\f\r\u0203\t\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u020c\b\u000e"+
		"\n\u000e\f\u000e\u020f\t\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0213"+
		"\b\u000e\n\u000e\f\u000e\u0216\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u021f\b\u000f"+
		"\n\u000f\f\u000f\u0222\t\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0226"+
		"\b\u000f\n\u000f\f\u000f\u0229\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u0232\b\u0010"+
		"\n\u0010\f\u0010\u0235\t\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0005\u0011\u023c\b\u0011\n\u0011\f\u0011\u023f\t\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012"+
		"\u0246\b\u0012\n\u0012\f\u0012\u0249\t\u0012\u0001\u0012\u0001\u0012\u0005"+
		"\u0012\u024d\b\u0012\n\u0012\f\u0012\u0250\t\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u0255\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0005\u0012\u025a\b\u0012\n\u0012\f\u0012\u025d\t\u0012\u0001\u0012\u0003"+
		"\u0012\u0260\b\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u0267\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0003\u0015\u026e\b\u0015\u0001\u0016\u0001\u0016\u0005"+
		"\u0016\u0272\b\u0016\n\u0016\f\u0016\u0275\t\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0005\u0016\u027a\b\u0016\n\u0016\f\u0016\u027d\t\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003"+
		"\u0016\u0285\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u028e\b\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u0297\b\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0004\u001d\u02a2"+
		"\b\u001d\u000b\u001d\f\u001d\u02a3\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0005\u001e\u02aa\b\u001e\n\u001e\f\u001e\u02ad\t\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u02b4"+
		"\b\u001f\u0001\u001f\u0003\u001f\u02b7\b\u001f\u0001 \u0001 \u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0003!\u02c1\b!\u0001\"\u0001\"\u0001\""+
		"\u0005\"\u02c6\b\"\n\"\f\"\u02c9\t\"\u0001#\u0001#\u0001#\u0005#\u02ce"+
		"\b#\n#\f#\u02d1\t#\u0001$\u0001$\u0001$\u0003$\u02d6\b$\u0001%\u0001%"+
		"\u0001%\u0001%\u0003%\u02dc\b%\u0001%\u0001%\u0001%\u0003%\u02e1\b%\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u02ec"+
		"\b&\u0001\'\u0001\'\u0003\'\u02f0\b\'\u0001\'\u0001\'\u0001\'\u0003\'"+
		"\u02f5\b\'\u0001\'\u0003\'\u02f8\b\'\u0001(\u0001(\u0001)\u0001)\u0001"+
		")\u0005)\u02ff\b)\n)\f)\u0302\t)\u0001*\u0001*\u0001*\u0005*\u0307\b*"+
		"\n*\f*\u030a\t*\u0001+\u0001+\u0001+\u0003+\u030f\b+\u0001,\u0001,\u0001"+
		",\u0003,\u0314\b,\u0001-\u0001-\u0005-\u0318\b-\n-\f-\u031b\t-\u0001."+
		"\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0003.\u0325\b.\u0001"+
		".\u0001.\u0003.\u0329\b.\u0001.\u0001.\u0003.\u032d\b.\u0003.\u032f\b"+
		".\u0001.\u0001.\u0001.\u0003.\u0334\b.\u0001.\u0003.\u0337\b.\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0003/\u0345\b/\u00010\u00010\u00010\u00010\u00050\u034b\b0\n0\f0\u034e"+
		"\t0\u00010\u00030\u0351\b0\u00030\u0353\b0\u00010\u00010\u00011\u0001"+
		"1\u00011\u00011\u00051\u035b\b1\n1\f1\u035e\t1\u00011\u00031\u0361\b1"+
		"\u00031\u0363\b1\u00011\u00011\u00012\u00012\u00012\u00012\u00013\u0001"+
		"3\u00013\u00053\u036e\b3\n3\f3\u0371\t3\u00014\u00014\u00034\u0375\b4"+
		"\u00014\u00014\u00015\u00015\u00055\u037b\b5\n5\f5\u037e\t5\u00015\u0003"+
		"5\u0381\b5\u00015\u00015\u00016\u00016\u00016\u00016\u00016\u00016\u0001"+
		"6\u00036\u038c\b6\u00016\u00016\u00017\u00017\u00017\u00017\u00047\u0394"+
		"\b7\u000b7\f7\u0395\u00037\u0398\b7\u00018\u00018\u00018\u00018\u0005"+
		"8\u039e\b8\n8\f8\u03a1\t8\u00019\u00019\u00019\u00019\u0001:\u0001:\u0005"+
		":\u03a9\b:\n:\f:\u03ac\t:\u0001:\u0005:\u03af\b:\n:\f:\u03b2\t:\u0001"+
		":\u0003:\u03b5\b:\u0001:\u0001:\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		"<\u0001<\u0001<\u0001<\u0001<\u0005<\u03c3\b<\n<\f<\u03c6\t<\u0001=\u0001"+
		"=\u0001=\u0001=\u0005=\u03cc\b=\n=\f=\u03cf\t=\u0001>\u0001>\u0001>\u0001"+
		">\u0001?\u0001?\u0001?\u0001?\u0001?\u0001@\u0001@\u0001@\u0001@\u0001"+
		"@\u0003@\u03df\b@\u0001@\u0001@\u0003@\u03e3\b@\u0001@\u0001@\u0001A\u0001"+
		"A\u0001A\u0001A\u0003A\u03eb\bA\u0001A\u0001A\u0005A\u03ef\bA\nA\fA\u03f2"+
		"\tA\u0001A\u0001A\u0001A\u0003A\u03f7\bA\u0001A\u0001A\u0001B\u0001B\u0001"+
		"B\u0001B\u0004B\u03ff\bB\u000bB\fB\u0400\u0001B\u0001B\u0001B\u0004B\u0406"+
		"\bB\u000bB\fB\u0407\u0003B\u040a\bB\u0001C\u0001C\u0001C\u0001C\u0001"+
		"C\u0001C\u0001C\u0005C\u0413\bC\nC\fC\u0416\tC\u0001C\u0001C\u0001D\u0001"+
		"D\u0001D\u0001D\u0001D\u0005D\u041f\bD\nD\fD\u0422\tD\u0001D\u0001D\u0001"+
		"D\u0001D\u0001E\u0001E\u0001E\u0001E\u0001E\u0003E\u042d\bE\u0001E\u0001"+
		"E\u0001E\u0005E\u0432\bE\nE\fE\u0435\tE\u0001E\u0001E\u0001E\u0001E\u0001"+
		"F\u0001F\u0001F\u0005F\u043e\bF\nF\fF\u0441\tF\u0001G\u0001G\u0001G\u0003"+
		"G\u0446\bG\u0001H\u0001H\u0001H\u0001H\u0003H\u044c\bH\u0001H\u0003H\u044f"+
		"\bH\u0001H\u0001H\u0001H\u0005H\u0454\bH\nH\fH\u0457\tH\u0001H\u0001H"+
		"\u0001H\u0001H\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0003"+
		"I\u0464\bI\u0001I\u0001I\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001"+
		"J\u0003J\u046f\bJ\u0001J\u0001J\u0001K\u0001K\u0001K\u0005K\u0476\bK\n"+
		"K\fK\u0479\tK\u0001L\u0001L\u0001L\u0003L\u047e\bL\u0001M\u0001M\u0001"+
		"M\u0001M\u0001M\u0005M\u0485\bM\nM\fM\u0488\tM\u0001M\u0001M\u0001M\u0001"+
		"M\u0001N\u0001N\u0001N\u0005N\u0491\bN\nN\fN\u0494\tN\u0001O\u0001O\u0001"+
		"O\u0001O\u0001P\u0001P\u0001P\u0001P\u0001P\u0003P\u049f\bP\u0001P\u0003"+
		"P\u04a2\bP\u0001P\u0001P\u0005P\u04a6\bP\nP\fP\u04a9\tP\u0001P\u0001P"+
		"\u0001P\u0001P\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001R\u0001R\u0001"+
		"R\u0001R\u0001R\u0005R\u04b9\bR\nR\fR\u04bc\tR\u0001R\u0001R\u0001R\u0001"+
		"R\u0001S\u0005S\u04c3\bS\nS\fS\u04c6\tS\u0001T\u0001T\u0001T\u0005T\u04cb"+
		"\bT\nT\fT\u04ce\tT\u0001T\u0001T\u0005T\u04d2\bT\nT\fT\u04d5\tT\u0001"+
		"T\u0001T\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001"+
		"U\u0001U\u0001U\u0001U\u0003U\u04e5\bU\u0001V\u0001V\u0001W\u0001W\u0001"+
		"W\u0001X\u0001X\u0001Y\u0001Y\u0001Z\u0001Z\u0004Z\u04f2\bZ\u000bZ\fZ"+
		"\u04f3\u0001[\u0001[\u0003[\u04f8\b[\u0001\\\u0001\\\u0001\\\u0001\\\u0001"+
		"\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0003"+
		"\\\u0507\b\\\u0001]\u0001]\u0001]\u0001]\u0003]\u050d\b]\u0001^\u0001"+
		"^\u0001_\u0001_\u0001_\u0001_\u0005_\u0515\b_\n_\f_\u0518\t_\u0001_\u0003"+
		"_\u051b\b_\u0001`\u0001`\u0001a\u0001a\u0003a\u0521\ba\u0001b\u0001b\u0001"+
		"b\u0001b\u0003b\u0527\bb\u0001c\u0001c\u0001d\u0001d\u0003d\u052d\bd\u0001"+
		"e\u0001e\u0001e\u0001e\u0003e\u0533\be\u0001f\u0001f\u0001g\u0001g\u0001"+
		"g\u0001g\u0001g\u0005g\u053c\bg\ng\fg\u053f\tg\u0001g\u0003g\u0542\bg"+
		"\u0001h\u0001h\u0001h\u0003h\u0547\bh\u0001h\u0003h\u054a\bh\u0001h\u0001"+
		"h\u0001i\u0001i\u0003i\u0550\bi\u0001j\u0001j\u0001j\u0001j\u0001j\u0001"+
		"j\u0001j\u0003j\u0559\bj\u0001j\u0003j\u055c\bj\u0001k\u0001k\u0001l\u0001"+
		"l\u0001l\u0001l\u0001l\u0001l\u0003l\u0566\bl\u0001m\u0001m\u0001m\u0001"+
		"m\u0001m\u0003m\u056d\bm\u0001n\u0001n\u0001n\u0001n\u0003n\u0573\bn\u0001"+
		"o\u0001o\u0001o\u0001o\u0003o\u0579\bo\u0001p\u0001p\u0001p\u0003p\u057e"+
		"\bp\u0001q\u0001q\u0001q\u0001q\u0001q\u0005q\u0585\bq\nq\fq\u0588\tq"+
		"\u0001q\u0003q\u058b\bq\u0001r\u0004r\u058e\br\u000br\fr\u058f\u0001s"+
		"\u0001s\u0001t\u0001t\u0001t\u0001t\u0003t\u0598\bt\u0001u\u0001u\u0003"+
		"u\u059c\bu\u0001v\u0001v\u0001v\u0001v\u0003v\u05a2\bv\u0001w\u0001w\u0001"+
		"w\u0001w\u0003w\u05a8\bw\u0001x\u0001x\u0003x\u05ac\bx\u0001y\u0001y\u0001"+
		"y\u0001y\u0001z\u0001z\u0001{\u0001{\u0001|\u0001|\u0001}\u0001}\u0001"+
		"~\u0001~\u0001\u007f\u0001\u007f\u0001\u0080\u0001\u0080\u0003\u0080\u05c0"+
		"\b\u0080\u0001\u0081\u0001\u0081\u0001\u0081\u0001\u0081\u0001\u0081\u0001"+
		"\u0081\u0001\u0081\u0001\u0081\u0001\u0081\u0001\u0081\u0001\u0081\u0001"+
		"\u0082\u0001\u0082\u0001\u0082\u0001\u0082\u0001\u0082\u0001\u0083\u0001"+
		"\u0083\u0001\u0083\u0001\u0083\u0001\u0083\u0001\u0083\u0001\u0083\u0003"+
		"\u0083\u05d9\b\u0083\u0001\u0083\u0000\u0000\u0084\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0"+
		"\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8"+
		"\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0"+
		"\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8"+
		"\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100"+
		"\u0102\u0104\u0106\u0000\u0016\u0001\u0000\u000f\u0010\u0002\u0000\u0002"+
		"\u0002\u0004\u0004\u0001\u0000\u00d6\u00d7\u0002\u0000\u00bd\u00be\u00c3"+
		"\u00c3\u0001\u0000\u00bf\u00c2\u0001\u0000\u00bd\u00be\u0002\u0000\u0001"+
		"\u0001\u0003\u0003\u0001\u0000\u008e\u008f\u0002\u0000\u009c\u009c\u00af"+
		"\u00af\u0002\u0000\u00cf\u00d0\u00d2\u00d2\u0001\u00002<\u0002\u00002"+
		"<\u0084\u0084\u0001\u0000=B\u0007\u0000DDFFJJLMOSYYaa\u0002\u0000KKNN"+
		"\u0003\u0000UUWW[[\u0005\u0000GI]`bcffhh\u0002\u0000XXZZ\u0004\u0000l"+
		"lnnpp\u0084\u0084\u0002\u0000}\u0080\u0083\u0083\u0002\u0000zz\u0082\u0082"+
		"\u0001\u0000iy\u063e\u0000\u010b\u0001\u0000\u0000\u0000\u0002\u0126\u0001"+
		"\u0000\u0000\u0000\u0004\u0138\u0001\u0000\u0000\u0000\u0006\u013a\u0001"+
		"\u0000\u0000\u0000\b\u014e\u0001\u0000\u0000\u0000\n\u0162\u0001\u0000"+
		"\u0000\u0000\f\u0176\u0001\u0000\u0000\u0000\u000e\u0189\u0001\u0000\u0000"+
		"\u0000\u0010\u0195\u0001\u0000\u0000\u0000\u0012\u01a8\u0001\u0000\u0000"+
		"\u0000\u0014\u01bb\u0001\u0000\u0000\u0000\u0016\u01cf\u0001\u0000\u0000"+
		"\u0000\u0018\u01e2\u0001\u0000\u0000\u0000\u001a\u01f5\u0001\u0000\u0000"+
		"\u0000\u001c\u0208\u0001\u0000\u0000\u0000\u001e\u021b\u0001\u0000\u0000"+
		"\u0000 \u022e\u0001\u0000\u0000\u0000\"\u0238\u0001\u0000\u0000\u0000"+
		"$\u025f\u0001\u0000\u0000\u0000&\u0261\u0001\u0000\u0000\u0000(\u0263"+
		"\u0001\u0000\u0000\u0000*\u026d\u0001\u0000\u0000\u0000,\u0284\u0001\u0000"+
		"\u0000\u0000.\u028d\u0001\u0000\u0000\u00000\u0296\u0001\u0000\u0000\u0000"+
		"2\u0298\u0001\u0000\u0000\u00004\u029a\u0001\u0000\u0000\u00006\u029c"+
		"\u0001\u0000\u0000\u00008\u029e\u0001\u0000\u0000\u0000:\u02a1\u0001\u0000"+
		"\u0000\u0000<\u02a5\u0001\u0000\u0000\u0000>\u02b0\u0001\u0000\u0000\u0000"+
		"@\u02b8\u0001\u0000\u0000\u0000B\u02ba\u0001\u0000\u0000\u0000D\u02c2"+
		"\u0001\u0000\u0000\u0000F\u02ca\u0001\u0000\u0000\u0000H\u02d5\u0001\u0000"+
		"\u0000\u0000J\u02e0\u0001\u0000\u0000\u0000L\u02eb\u0001\u0000\u0000\u0000"+
		"N\u02ed\u0001\u0000\u0000\u0000P\u02f9\u0001\u0000\u0000\u0000R\u02fb"+
		"\u0001\u0000\u0000\u0000T\u0303\u0001\u0000\u0000\u0000V\u030b\u0001\u0000"+
		"\u0000\u0000X\u0313\u0001\u0000\u0000\u0000Z\u0315\u0001\u0000\u0000\u0000"+
		"\\\u0336\u0001\u0000\u0000\u0000^\u0344\u0001\u0000\u0000\u0000`\u0346"+
		"\u0001\u0000\u0000\u0000b\u0356\u0001\u0000\u0000\u0000d\u0366\u0001\u0000"+
		"\u0000\u0000f\u036a\u0001\u0000\u0000\u0000h\u0374\u0001\u0000\u0000\u0000"+
		"j\u0378\u0001\u0000\u0000\u0000l\u0384\u0001\u0000\u0000\u0000n\u0397"+
		"\u0001\u0000\u0000\u0000p\u0399\u0001\u0000\u0000\u0000r\u03a2\u0001\u0000"+
		"\u0000\u0000t\u03a6\u0001\u0000\u0000\u0000v\u03b8\u0001\u0000\u0000\u0000"+
		"x\u03bd\u0001\u0000\u0000\u0000z\u03c7\u0001\u0000\u0000\u0000|\u03d0"+
		"\u0001\u0000\u0000\u0000~\u03d4\u0001\u0000\u0000\u0000\u0080\u03d9\u0001"+
		"\u0000\u0000\u0000\u0082\u03e6\u0001\u0000\u0000\u0000\u0084\u0409\u0001"+
		"\u0000\u0000\u0000\u0086\u040b\u0001\u0000\u0000\u0000\u0088\u0419\u0001"+
		"\u0000\u0000\u0000\u008a\u0427\u0001\u0000\u0000\u0000\u008c\u043a\u0001"+
		"\u0000\u0000\u0000\u008e\u0442\u0001\u0000\u0000\u0000\u0090\u0447\u0001"+
		"\u0000\u0000\u0000\u0092\u045c\u0001\u0000\u0000\u0000\u0094\u0467\u0001"+
		"\u0000\u0000\u0000\u0096\u0472\u0001\u0000\u0000\u0000\u0098\u047a\u0001"+
		"\u0000\u0000\u0000\u009a\u047f\u0001\u0000\u0000\u0000\u009c\u048d\u0001"+
		"\u0000\u0000\u0000\u009e\u0495\u0001\u0000\u0000\u0000\u00a0\u0499\u0001"+
		"\u0000\u0000\u0000\u00a2\u04ae\u0001\u0000\u0000\u0000\u00a4\u04b3\u0001"+
		"\u0000\u0000\u0000\u00a6\u04c4\u0001\u0000\u0000\u0000\u00a8\u04c7\u0001"+
		"\u0000\u0000\u0000\u00aa\u04e4\u0001\u0000\u0000\u0000\u00ac\u04e6\u0001"+
		"\u0000\u0000\u0000\u00ae\u04e8\u0001\u0000\u0000\u0000\u00b0\u04eb\u0001"+
		"\u0000\u0000\u0000\u00b2\u04ed\u0001\u0000\u0000\u0000\u00b4\u04ef\u0001"+
		"\u0000\u0000\u0000\u00b6\u04f7\u0001\u0000\u0000\u0000\u00b8\u0506\u0001"+
		"\u0000\u0000\u0000\u00ba\u0508\u0001\u0000\u0000\u0000\u00bc\u050e\u0001"+
		"\u0000\u0000\u0000\u00be\u0510\u0001\u0000\u0000\u0000\u00c0\u051c\u0001"+
		"\u0000\u0000\u0000\u00c2\u0520\u0001\u0000\u0000\u0000\u00c4\u0522\u0001"+
		"\u0000\u0000\u0000\u00c6\u0528\u0001\u0000\u0000\u0000\u00c8\u052c\u0001"+
		"\u0000\u0000\u0000\u00ca\u052e\u0001\u0000\u0000\u0000\u00cc\u0534\u0001"+
		"\u0000\u0000\u0000\u00ce\u0536\u0001\u0000\u0000\u0000\u00d0\u0543\u0001"+
		"\u0000\u0000\u0000\u00d2\u054f\u0001\u0000\u0000\u0000\u00d4\u0551\u0001"+
		"\u0000\u0000\u0000\u00d6\u055d\u0001\u0000\u0000\u0000\u00d8\u055f\u0001"+
		"\u0000\u0000\u0000\u00da\u056c\u0001\u0000\u0000\u0000\u00dc\u056e\u0001"+
		"\u0000\u0000\u0000\u00de\u0574\u0001\u0000\u0000\u0000\u00e0\u057d\u0001"+
		"\u0000\u0000\u0000\u00e2\u057f\u0001\u0000\u0000\u0000\u00e4\u058d\u0001"+
		"\u0000\u0000\u0000\u00e6\u0591\u0001\u0000\u0000\u0000\u00e8\u0593\u0001"+
		"\u0000\u0000\u0000\u00ea\u059b\u0001\u0000\u0000\u0000\u00ec\u059d\u0001"+
		"\u0000\u0000\u0000\u00ee\u05a3\u0001\u0000\u0000\u0000\u00f0\u05ab\u0001"+
		"\u0000\u0000\u0000\u00f2\u05ad\u0001\u0000\u0000\u0000\u00f4\u05b1\u0001"+
		"\u0000\u0000\u0000\u00f6\u05b3\u0001\u0000\u0000\u0000\u00f8\u05b5\u0001"+
		"\u0000\u0000\u0000\u00fa\u05b7\u0001\u0000\u0000\u0000\u00fc\u05b9\u0001"+
		"\u0000\u0000\u0000\u00fe\u05bb\u0001\u0000\u0000\u0000\u0100\u05bf\u0001"+
		"\u0000\u0000\u0000\u0102\u05c1\u0001\u0000\u0000\u0000\u0104\u05cc\u0001"+
		"\u0000\u0000\u0000\u0106\u05d8\u0001\u0000\u0000\u0000\u0108\u010a\u0003"+
		"\u0002\u0001\u0000\u0109\u0108\u0001\u0000\u0000\u0000\u010a\u010d\u0001"+
		"\u0000\u0000\u0000\u010b\u0109\u0001\u0000\u0000\u0000\u010b\u010c\u0001"+
		"\u0000\u0000\u0000\u010c\u010e\u0001\u0000\u0000\u0000\u010d\u010b\u0001"+
		"\u0000\u0000\u0000\u010e\u010f\u0005\u0000\u0000\u0001\u010f\u0001\u0001"+
		"\u0000\u0000\u0000\u0110\u0127\u0003\u0004\u0002\u0000\u0111\u0127\u0003"+
		":\u001d\u0000\u0112\u0127\u00032\u0019\u0000\u0113\u0127\u00034\u001a"+
		"\u0000\u0114\u0127\u00036\u001b\u0000\u0115\u0127\u00038\u001c\u0000\u0116"+
		"\u0127\u0003<\u001e\u0000\u0117\u0127\u0003j5\u0000\u0118\u0127\u0003"+
		"t:\u0000\u0119\u0127\u0003~?\u0000\u011a\u0127\u0003\u0080@\u0000\u011b"+
		"\u0127\u0003\u0082A\u0000\u011c\u0127\u0003\u0086C\u0000\u011d\u0127\u0003"+
		"\u0088D\u0000\u011e\u0127\u0003\u008aE\u0000\u011f\u0127\u0003\u0092I"+
		"\u0000\u0120\u0127\u0003\u0094J\u0000\u0121\u0127\u0003\u009aM\u0000\u0122"+
		"\u0127\u0003\u00a0P\u0000\u0123\u0127\u0003\u00a2Q\u0000\u0124\u0127\u0003"+
		"\u0090H\u0000\u0125\u0127\u0003\u00a4R\u0000\u0126\u0110\u0001\u0000\u0000"+
		"\u0000\u0126\u0111\u0001\u0000\u0000\u0000\u0126\u0112\u0001\u0000\u0000"+
		"\u0000\u0126\u0113\u0001\u0000\u0000\u0000\u0126\u0114\u0001\u0000\u0000"+
		"\u0000\u0126\u0115\u0001\u0000\u0000\u0000\u0126\u0116\u0001\u0000\u0000"+
		"\u0000\u0126\u0117\u0001\u0000\u0000\u0000\u0126\u0118\u0001\u0000\u0000"+
		"\u0000\u0126\u0119\u0001\u0000\u0000\u0000\u0126\u011a\u0001\u0000\u0000"+
		"\u0000\u0126\u011b\u0001\u0000\u0000\u0000\u0126\u011c\u0001\u0000\u0000"+
		"\u0000\u0126\u011d\u0001\u0000\u0000\u0000\u0126\u011e\u0001\u0000\u0000"+
		"\u0000\u0126\u011f\u0001\u0000\u0000\u0000\u0126\u0120\u0001\u0000\u0000"+
		"\u0000\u0126\u0121\u0001\u0000\u0000\u0000\u0126\u0122\u0001\u0000\u0000"+
		"\u0000\u0126\u0123\u0001\u0000\u0000\u0000\u0126\u0124\u0001\u0000\u0000"+
		"\u0000\u0126\u0125\u0001\u0000\u0000\u0000\u0127\u0003\u0001\u0000\u0000"+
		"\u0000\u0128\u0139\u0003\u0006\u0003\u0000\u0129\u0139\u0003\b\u0004\u0000"+
		"\u012a\u0139\u0003\n\u0005\u0000\u012b\u0139\u0003\f\u0006\u0000\u012c"+
		"\u0139\u0003\u000e\u0007\u0000\u012d\u0139\u0003\u0010\b\u0000\u012e\u0139"+
		"\u0003\u0012\t\u0000\u012f\u0139\u0003\u0014\n\u0000\u0130\u0139\u0003"+
		"\u0016\u000b\u0000\u0131\u0139\u0003\u0018\f\u0000\u0132\u0139\u0003\u001a"+
		"\r\u0000\u0133\u0139\u0003\u001c\u000e\u0000\u0134\u0139\u0003\u001e\u000f"+
		"\u0000\u0135\u0139\u0003 \u0010\u0000\u0136\u0139\u0003\"\u0011\u0000"+
		"\u0137\u0139\u0003$\u0012\u0000\u0138\u0128\u0001\u0000\u0000\u0000\u0138"+
		"\u0129\u0001\u0000\u0000\u0000\u0138\u012a\u0001\u0000\u0000\u0000\u0138"+
		"\u012b\u0001\u0000\u0000\u0000\u0138\u012c\u0001\u0000\u0000\u0000\u0138"+
		"\u012d\u0001\u0000\u0000\u0000\u0138\u012e\u0001\u0000\u0000\u0000\u0138"+
		"\u012f\u0001\u0000\u0000\u0000\u0138\u0130\u0001\u0000\u0000\u0000\u0138"+
		"\u0131\u0001\u0000\u0000\u0000\u0138\u0132\u0001\u0000\u0000\u0000\u0138"+
		"\u0133\u0001\u0000\u0000\u0000\u0138\u0134\u0001\u0000\u0000\u0000\u0138"+
		"\u0135\u0001\u0000\u0000\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0138"+
		"\u0137\u0001\u0000\u0000\u0000\u0139\u0005\u0001\u0000\u0000\u0000\u013a"+
		"\u013b\u0005\n\u0000\u0000\u013b\u013f\u0005\u0014\u0000\u0000\u013c\u013e"+
		"\u0003(\u0014\u0000\u013d\u013c\u0001\u0000\u0000\u0000\u013e\u0141\u0001"+
		"\u0000\u0000\u0000\u013f\u013d\u0001\u0000\u0000\u0000\u013f\u0140\u0001"+
		"\u0000\u0000\u0000\u0140\u0142\u0001\u0000\u0000\u0000\u0141\u013f\u0001"+
		"\u0000\u0000\u0000\u0142\u0146\u0005\u0010\u0000\u0000\u0143\u0145\u0003"+
		"&\u0013\u0000\u0144\u0143\u0001\u0000\u0000\u0000\u0145\u0148\u0001\u0000"+
		"\u0000\u0000\u0146\u0144\u0001\u0000\u0000\u0000\u0146\u0147\u0001\u0000"+
		"\u0000\u0000\u0147\u014c\u0001\u0000\u0000\u0000\u0148\u0146\u0001\u0000"+
		"\u0000\u0000\u0149\u014a\u0005\t\u0000\u0000\u014a\u014b\u0005\u0014\u0000"+
		"\u0000\u014b\u014d\u0005\u0010\u0000\u0000\u014c\u0149\u0001\u0000\u0000"+
		"\u0000\u014c\u014d\u0001\u0000\u0000\u0000\u014d\u0007\u0001\u0000\u0000"+
		"\u0000\u014e\u014f\u0005\n\u0000\u0000\u014f\u0153\u0005\u0015\u0000\u0000"+
		"\u0150\u0152\u0003(\u0014\u0000\u0151\u0150\u0001\u0000\u0000\u0000\u0152"+
		"\u0155\u0001\u0000\u0000\u0000\u0153\u0151\u0001\u0000\u0000\u0000\u0153"+
		"\u0154\u0001\u0000\u0000\u0000\u0154\u0156\u0001\u0000\u0000\u0000\u0155"+
		"\u0153\u0001\u0000\u0000\u0000\u0156\u015a\u0005\u0010\u0000\u0000\u0157"+
		"\u0159\u0003&\u0013\u0000\u0158\u0157\u0001\u0000\u0000\u0000\u0159\u015c"+
		"\u0001\u0000\u0000\u0000\u015a\u0158\u0001\u0000\u0000\u0000\u015a\u015b"+
		"\u0001\u0000\u0000\u0000\u015b\u0160\u0001\u0000\u0000\u0000\u015c\u015a"+
		"\u0001\u0000\u0000\u0000\u015d\u015e\u0005\t\u0000\u0000\u015e\u015f\u0005"+
		"\u0015\u0000\u0000\u015f\u0161\u0005\u0010\u0000\u0000\u0160\u015d\u0001"+
		"\u0000\u0000\u0000\u0160\u0161\u0001\u0000\u0000\u0000\u0161\t\u0001\u0000"+
		"\u0000\u0000\u0162\u0163\u0005\n\u0000\u0000\u0163\u0167\u0005\u0016\u0000"+
		"\u0000\u0164\u0166\u0003(\u0014\u0000\u0165\u0164\u0001\u0000\u0000\u0000"+
		"\u0166\u0169\u0001\u0000\u0000\u0000\u0167\u0165\u0001\u0000\u0000\u0000"+
		"\u0167\u0168\u0001\u0000\u0000\u0000\u0168\u016a\u0001\u0000\u0000\u0000"+
		"\u0169\u0167\u0001\u0000\u0000\u0000\u016a\u016e\u0005\u0010\u0000\u0000"+
		"\u016b\u016d\u0003&\u0013\u0000\u016c\u016b\u0001\u0000\u0000\u0000\u016d"+
		"\u0170\u0001\u0000\u0000\u0000\u016e\u016c\u0001\u0000\u0000\u0000\u016e"+
		"\u016f\u0001\u0000\u0000\u0000\u016f\u0174\u0001\u0000\u0000\u0000\u0170"+
		"\u016e\u0001\u0000\u0000\u0000\u0171\u0172\u0005\t\u0000\u0000\u0172\u0173"+
		"\u0005\u0016\u0000\u0000\u0173\u0175\u0005\u0010\u0000\u0000\u0174\u0171"+
		"\u0001\u0000\u0000\u0000\u0174\u0175\u0001\u0000\u0000\u0000\u0175\u000b"+
		"\u0001\u0000\u0000\u0000\u0176\u0177\u0005\n\u0000\u0000\u0177\u017b\u0005"+
		"\u0017\u0000\u0000\u0178\u017a\u0003(\u0014\u0000\u0179\u0178\u0001\u0000"+
		"\u0000\u0000\u017a\u017d\u0001\u0000\u0000\u0000\u017b\u0179\u0001\u0000"+
		"\u0000\u0000\u017b\u017c\u0001\u0000\u0000\u0000\u017c\u017e\u0001\u0000"+
		"\u0000\u0000\u017d\u017b\u0001\u0000\u0000\u0000\u017e\u0182\u0005\u0010"+
		"\u0000\u0000\u017f\u0181\u0003&\u0013\u0000\u0180\u017f\u0001\u0000\u0000"+
		"\u0000\u0181\u0184\u0001\u0000\u0000\u0000\u0182\u0180\u0001\u0000\u0000"+
		"\u0000\u0182\u0183\u0001\u0000\u0000\u0000\u0183\u0185\u0001\u0000\u0000"+
		"\u0000\u0184\u0182\u0001\u0000\u0000\u0000\u0185\u0186\u0005\t\u0000\u0000"+
		"\u0186\u0187\u0005\u0017\u0000\u0000\u0187\u0188\u0005\u0010\u0000\u0000"+
		"\u0188\r\u0001\u0000\u0000\u0000\u0189\u018a\u0005\n\u0000\u0000\u018a"+
		"\u018e\u0005\u0018\u0000\u0000\u018b\u018d\u0003(\u0014\u0000\u018c\u018b"+
		"\u0001\u0000\u0000\u0000\u018d\u0190\u0001\u0000\u0000\u0000\u018e\u018c"+
		"\u0001\u0000\u0000\u0000\u018e\u018f\u0001\u0000\u0000\u0000\u018f\u0191"+
		"\u0001\u0000\u0000\u0000\u0190\u018e\u0001\u0000\u0000\u0000\u0191\u0192"+
		"\u0005\u0010\u0000\u0000\u0192\u0193\u0003\u00a6S\u0000\u0193\u0194\u0005"+
		"1\u0000\u0000\u0194\u000f\u0001\u0000\u0000\u0000\u0195\u0196\u0005\n"+
		"\u0000\u0000\u0196\u019a\u0005\u0019\u0000\u0000\u0197\u0199\u0003(\u0014"+
		"\u0000\u0198\u0197\u0001\u0000\u0000\u0000\u0199\u019c\u0001\u0000\u0000"+
		"\u0000\u019a\u0198\u0001\u0000\u0000\u0000\u019a\u019b\u0001\u0000\u0000"+
		"\u0000\u019b\u019d\u0001\u0000\u0000\u0000\u019c\u019a\u0001\u0000\u0000"+
		"\u0000\u019d\u01a1\u0005\u0010\u0000\u0000\u019e\u01a0\u0003&\u0013\u0000"+
		"\u019f\u019e\u0001\u0000\u0000\u0000\u01a0\u01a3\u0001\u0000\u0000\u0000"+
		"\u01a1\u019f\u0001\u0000\u0000\u0000\u01a1\u01a2\u0001\u0000\u0000\u0000"+
		"\u01a2\u01a4\u0001\u0000\u0000\u0000\u01a3\u01a1\u0001\u0000\u0000\u0000"+
		"\u01a4\u01a5\u0005\t\u0000\u0000\u01a5\u01a6\u0005\u0019\u0000\u0000\u01a6"+
		"\u01a7\u0005\u0010\u0000\u0000\u01a7\u0011\u0001\u0000\u0000\u0000\u01a8"+
		"\u01a9\u0005\n\u0000\u0000\u01a9\u01ad\u0005\u001a\u0000\u0000\u01aa\u01ac"+
		"\u0003(\u0014\u0000\u01ab\u01aa\u0001\u0000\u0000\u0000\u01ac\u01af\u0001"+
		"\u0000\u0000\u0000\u01ad\u01ab\u0001\u0000\u0000\u0000\u01ad\u01ae\u0001"+
		"\u0000\u0000\u0000\u01ae\u01b0\u0001\u0000\u0000\u0000\u01af\u01ad\u0001"+
		"\u0000\u0000\u0000\u01b0\u01b4\u0005\u0010\u0000\u0000\u01b1\u01b3\u0003"+
		"&\u0013\u0000\u01b2\u01b1\u0001\u0000\u0000\u0000\u01b3\u01b6\u0001\u0000"+
		"\u0000\u0000\u01b4\u01b2\u0001\u0000\u0000\u0000\u01b4\u01b5\u0001\u0000"+
		"\u0000\u0000\u01b5\u01b7\u0001\u0000\u0000\u0000\u01b6\u01b4\u0001\u0000"+
		"\u0000\u0000\u01b7\u01b8\u0005\t\u0000\u0000\u01b8\u01b9\u0005\u001a\u0000"+
		"\u0000\u01b9\u01ba\u0005\u0010\u0000\u0000\u01ba\u0013\u0001\u0000\u0000"+
		"\u0000\u01bb\u01bc\u0005\n\u0000\u0000\u01bc\u01c0\u0005\u001b\u0000\u0000"+
		"\u01bd\u01bf\u0003(\u0014\u0000\u01be\u01bd\u0001\u0000\u0000\u0000\u01bf"+
		"\u01c2\u0001\u0000\u0000\u0000\u01c0\u01be\u0001\u0000\u0000\u0000\u01c0"+
		"\u01c1\u0001\u0000\u0000\u0000\u01c1\u01c3\u0001\u0000\u0000\u0000\u01c2"+
		"\u01c0\u0001\u0000\u0000\u0000\u01c3\u01c7\u0005\u0010\u0000\u0000\u01c4"+
		"\u01c6\u0003&\u0013\u0000\u01c5\u01c4\u0001\u0000\u0000\u0000\u01c6\u01c9"+
		"\u0001\u0000\u0000\u0000\u01c7\u01c5\u0001\u0000\u0000\u0000\u01c7\u01c8"+
		"\u0001\u0000\u0000\u0000\u01c8\u01cd\u0001\u0000\u0000\u0000\u01c9\u01c7"+
		"\u0001\u0000\u0000\u0000\u01ca\u01cb\u0005\t\u0000\u0000\u01cb\u01cc\u0005"+
		"\u001b\u0000\u0000\u01cc\u01ce\u0005\u0010\u0000\u0000\u01cd\u01ca\u0001"+
		"\u0000\u0000\u0000\u01cd\u01ce\u0001\u0000\u0000\u0000\u01ce\u0015\u0001"+
		"\u0000\u0000\u0000\u01cf\u01d0\u0005\n\u0000\u0000\u01d0\u01d4\u0005\u001c"+
		"\u0000\u0000\u01d1\u01d3\u0003(\u0014\u0000\u01d2\u01d1\u0001\u0000\u0000"+
		"\u0000\u01d3\u01d6\u0001\u0000\u0000\u0000\u01d4\u01d2\u0001\u0000\u0000"+
		"\u0000\u01d4\u01d5\u0001\u0000\u0000\u0000\u01d5\u01d7\u0001\u0000\u0000"+
		"\u0000\u01d6\u01d4\u0001\u0000\u0000\u0000\u01d7\u01db\u0005\u0010\u0000"+
		"\u0000\u01d8\u01da\u0003&\u0013\u0000\u01d9\u01d8\u0001\u0000\u0000\u0000"+
		"\u01da\u01dd\u0001\u0000\u0000\u0000\u01db\u01d9\u0001\u0000\u0000\u0000"+
		"\u01db\u01dc\u0001\u0000\u0000\u0000\u01dc\u01de\u0001\u0000\u0000\u0000"+
		"\u01dd\u01db\u0001\u0000\u0000\u0000\u01de\u01df\u0005\t\u0000\u0000\u01df"+
		"\u01e0\u0005\u001c\u0000\u0000\u01e0\u01e1\u0005\u0010\u0000\u0000\u01e1"+
		"\u0017\u0001\u0000\u0000\u0000\u01e2\u01e3\u0005\n\u0000\u0000\u01e3\u01e7"+
		"\u0005\u001d\u0000\u0000\u01e4\u01e6\u0003(\u0014\u0000\u01e5\u01e4\u0001"+
		"\u0000\u0000\u0000\u01e6\u01e9\u0001\u0000\u0000\u0000\u01e7\u01e5\u0001"+
		"\u0000\u0000\u0000\u01e7\u01e8\u0001\u0000\u0000\u0000\u01e8\u01ea\u0001"+
		"\u0000\u0000\u0000\u01e9\u01e7\u0001\u0000\u0000\u0000\u01ea\u01ee\u0005"+
		"\u0010\u0000\u0000\u01eb\u01ed\u0003&\u0013\u0000\u01ec\u01eb\u0001\u0000"+
		"\u0000\u0000\u01ed\u01f0\u0001\u0000\u0000\u0000\u01ee\u01ec\u0001\u0000"+
		"\u0000\u0000\u01ee\u01ef\u0001\u0000\u0000\u0000\u01ef\u01f1\u0001\u0000"+
		"\u0000\u0000\u01f0\u01ee\u0001\u0000\u0000\u0000\u01f1\u01f2\u0005\t\u0000"+
		"\u0000\u01f2\u01f3\u0005\u001d\u0000\u0000\u01f3\u01f4\u0005\u0010\u0000"+
		"\u0000\u01f4\u0019\u0001\u0000\u0000\u0000\u01f5\u01f6\u0005\n\u0000\u0000"+
		"\u01f6\u01fa\u0005\u001e\u0000\u0000\u01f7\u01f9\u0003(\u0014\u0000\u01f8"+
		"\u01f7\u0001\u0000\u0000\u0000\u01f9\u01fc\u0001\u0000\u0000\u0000\u01fa"+
		"\u01f8\u0001\u0000\u0000\u0000\u01fa\u01fb\u0001\u0000\u0000\u0000\u01fb"+
		"\u01fd\u0001\u0000\u0000\u0000\u01fc\u01fa\u0001\u0000\u0000\u0000\u01fd"+
		"\u0201\u0005\u0010\u0000\u0000\u01fe\u0200\u0003&\u0013\u0000\u01ff\u01fe"+
		"\u0001\u0000\u0000\u0000\u0200\u0203\u0001\u0000\u0000\u0000\u0201\u01ff"+
		"\u0001\u0000\u0000\u0000\u0201\u0202\u0001\u0000\u0000\u0000\u0202\u0204"+
		"\u0001\u0000\u0000\u0000\u0203\u0201\u0001\u0000\u0000\u0000\u0204\u0205"+
		"\u0005\t\u0000\u0000\u0205\u0206\u0005\u001e\u0000\u0000\u0206\u0207\u0005"+
		"\u0010\u0000\u0000\u0207\u001b\u0001\u0000\u0000\u0000\u0208\u0209\u0005"+
		"\n\u0000\u0000\u0209\u020d\u0005\u001f\u0000\u0000\u020a\u020c\u0003("+
		"\u0014\u0000\u020b\u020a\u0001\u0000\u0000\u0000\u020c\u020f\u0001\u0000"+
		"\u0000\u0000\u020d\u020b\u0001\u0000\u0000\u0000\u020d\u020e\u0001\u0000"+
		"\u0000\u0000\u020e\u0210\u0001\u0000\u0000\u0000\u020f\u020d\u0001\u0000"+
		"\u0000\u0000\u0210\u0214\u0005\u0010\u0000\u0000\u0211\u0213\u0003&\u0013"+
		"\u0000\u0212\u0211\u0001\u0000\u0000\u0000\u0213\u0216\u0001\u0000\u0000"+
		"\u0000\u0214\u0212\u0001\u0000\u0000\u0000\u0214\u0215\u0001\u0000\u0000"+
		"\u0000\u0215\u0217\u0001\u0000\u0000\u0000\u0216\u0214\u0001\u0000\u0000"+
		"\u0000\u0217\u0218\u0005\t\u0000\u0000\u0218\u0219\u0005\u001f\u0000\u0000"+
		"\u0219\u021a\u0005\u0010\u0000\u0000\u021a\u001d\u0001\u0000\u0000\u0000"+
		"\u021b\u021c\u0005\n\u0000\u0000\u021c\u0220\u0005 \u0000\u0000\u021d"+
		"\u021f\u0003(\u0014\u0000\u021e\u021d\u0001\u0000\u0000\u0000\u021f\u0222"+
		"\u0001\u0000\u0000\u0000\u0220\u021e\u0001\u0000\u0000\u0000\u0220\u0221"+
		"\u0001\u0000\u0000\u0000\u0221\u0223\u0001\u0000\u0000\u0000\u0222\u0220"+
		"\u0001\u0000\u0000\u0000\u0223\u0227\u0005\u0010\u0000\u0000\u0224\u0226"+
		"\u0003&\u0013\u0000\u0225\u0224\u0001\u0000\u0000\u0000\u0226\u0229\u0001"+
		"\u0000\u0000\u0000\u0227\u0225\u0001\u0000\u0000\u0000\u0227\u0228\u0001"+
		"\u0000\u0000\u0000\u0228\u022a\u0001\u0000\u0000\u0000\u0229\u0227\u0001"+
		"\u0000\u0000\u0000\u022a\u022b\u0005\t\u0000\u0000\u022b\u022c\u0005 "+
		"\u0000\u0000\u022c\u022d\u0005\u0010\u0000\u0000\u022d\u001f\u0001\u0000"+
		"\u0000\u0000\u022e\u022f\u0005\n\u0000\u0000\u022f\u0233\u0005!\u0000"+
		"\u0000\u0230\u0232\u0003(\u0014\u0000\u0231\u0230\u0001\u0000\u0000\u0000"+
		"\u0232\u0235\u0001\u0000\u0000\u0000\u0233\u0231\u0001\u0000\u0000\u0000"+
		"\u0233\u0234\u0001\u0000\u0000\u0000\u0234\u0236\u0001\u0000\u0000\u0000"+
		"\u0235\u0233\u0001\u0000\u0000\u0000\u0236\u0237\u0007\u0000\u0000\u0000"+
		"\u0237!\u0001\u0000\u0000\u0000\u0238\u0239\u0005\n\u0000\u0000\u0239"+
		"\u023d\u0005\"\u0000\u0000\u023a\u023c\u0003(\u0014\u0000\u023b\u023a"+
		"\u0001\u0000\u0000\u0000\u023c\u023f\u0001\u0000\u0000\u0000\u023d\u023b"+
		"\u0001\u0000\u0000\u0000\u023d\u023e\u0001\u0000\u0000\u0000\u023e\u0240"+
		"\u0001\u0000\u0000\u0000\u023f\u023d\u0001\u0000\u0000\u0000\u0240\u0241"+
		"\u0007\u0000\u0000\u0000\u0241#\u0001\u0000\u0000\u0000\u0242\u0243\u0005"+
		"\n\u0000\u0000\u0243\u0247\u0005#\u0000\u0000\u0244\u0246\u0003(\u0014"+
		"\u0000\u0245\u0244\u0001\u0000\u0000\u0000\u0246\u0249\u0001\u0000\u0000"+
		"\u0000\u0247\u0245\u0001\u0000\u0000\u0000\u0247\u0248\u0001\u0000\u0000"+
		"\u0000\u0248\u024a\u0001\u0000\u0000\u0000\u0249\u0247\u0001\u0000\u0000"+
		"\u0000\u024a\u024e\u0005\u0010\u0000\u0000\u024b\u024d\u0003&\u0013\u0000"+
		"\u024c\u024b\u0001\u0000\u0000\u0000\u024d\u0250\u0001\u0000\u0000\u0000"+
		"\u024e\u024c\u0001\u0000\u0000\u0000\u024e\u024f\u0001\u0000\u0000\u0000"+
		"\u024f\u0254\u0001\u0000\u0000\u0000\u0250\u024e\u0001\u0000\u0000\u0000"+
		"\u0251\u0252\u0005\t\u0000\u0000\u0252\u0253\u0005#\u0000\u0000\u0253"+
		"\u0255\u0005\u0010\u0000\u0000\u0254\u0251\u0001\u0000\u0000\u0000\u0254"+
		"\u0255\u0001\u0000\u0000\u0000\u0255\u0260\u0001\u0000\u0000\u0000\u0256"+
		"\u0257\u0005\n\u0000\u0000\u0257\u025b\u0005#\u0000\u0000\u0258\u025a"+
		"\u0003(\u0014\u0000\u0259\u0258\u0001\u0000\u0000\u0000\u025a\u025d\u0001"+
		"\u0000\u0000\u0000\u025b\u0259\u0001\u0000\u0000\u0000\u025b\u025c\u0001"+
		"\u0000\u0000\u0000\u025c\u025e\u0001\u0000\u0000\u0000\u025d\u025b\u0001"+
		"\u0000\u0000\u0000\u025e\u0260\u0005\u000f\u0000\u0000\u025f\u0242\u0001"+
		"\u0000\u0000\u0000\u025f\u0256\u0001\u0000\u0000\u0000\u0260%\u0001\u0000"+
		"\u0000\u0000\u0261\u0262\u0003\u0002\u0001\u0000\u0262\'\u0001\u0000\u0000"+
		"\u0000\u0263\u0266\u0003*\u0015\u0000\u0264\u0265\u0005\u0013\u0000\u0000"+
		"\u0265\u0267\u0003,\u0016\u0000\u0266\u0264\u0001\u0000\u0000\u0000\u0266"+
		"\u0267\u0001\u0000\u0000\u0000\u0267)\u0001\u0000\u0000\u0000\u0268\u026e"+
		"\u0005#\u0000\u0000\u0269\u026a\u0005\u000e\u0000\u0000\u026a\u026b\u0003"+
		"@ \u0000\u026b\u026c\u0005\u00d7\u0000\u0000\u026c\u026e\u0001\u0000\u0000"+
		"\u0000\u026d\u0268\u0001\u0000\u0000\u0000\u026d\u0269\u0001\u0000\u0000"+
		"\u0000\u026e+\u0001\u0000\u0000\u0000\u026f\u0273\u0005\u0011\u0000\u0000"+
		"\u0270\u0272\u0003.\u0017\u0000\u0271\u0270\u0001\u0000\u0000\u0000\u0272"+
		"\u0275\u0001\u0000\u0000\u0000\u0273\u0271\u0001\u0000\u0000\u0000\u0273"+
		"\u0274\u0001\u0000\u0000\u0000\u0274\u0276\u0001\u0000\u0000\u0000\u0275"+
		"\u0273\u0001\u0000\u0000\u0000\u0276\u0285\u0005)\u0000\u0000\u0277\u027b"+
		"\u0005\u0012\u0000\u0000\u0278\u027a\u00030\u0018\u0000\u0279\u0278\u0001"+
		"\u0000\u0000\u0000\u027a\u027d\u0001\u0000\u0000\u0000\u027b\u0279\u0001"+
		"\u0000\u0000\u0000\u027b\u027c\u0001\u0000\u0000\u0000\u027c\u027e\u0001"+
		"\u0000\u0000\u0000\u027d\u027b\u0001\u0000\u0000\u0000\u027e\u0285\u0005"+
		"-\u0000\u0000\u027f\u0285\u0005$\u0000\u0000\u0280\u0281\u0005\u000e\u0000"+
		"\u0000\u0281\u0282\u0003@ \u0000\u0282\u0283\u0005\u00d7\u0000\u0000\u0283"+
		"\u0285\u0001\u0000\u0000\u0000\u0284\u026f\u0001\u0000\u0000\u0000\u0284"+
		"\u0277\u0001\u0000\u0000\u0000\u0284\u027f\u0001\u0000\u0000\u0000\u0284"+
		"\u0280\u0001\u0000\u0000\u0000\u0285-\u0001\u0000\u0000\u0000\u0286\u028e"+
		"\u0005*\u0000\u0000\u0287\u0288\u0005(\u0000\u0000\u0288\u0289\u0003@"+
		" \u0000\u0289\u028a\u0005\u00d7\u0000\u0000\u028a\u028e\u0001\u0000\u0000"+
		"\u0000\u028b\u028c\u0005\'\u0000\u0000\u028c\u028e\u0003l6\u0000\u028d"+
		"\u0286\u0001\u0000\u0000\u0000\u028d\u0287\u0001\u0000\u0000\u0000\u028d"+
		"\u028b\u0001\u0000\u0000\u0000\u028e/\u0001\u0000\u0000\u0000\u028f\u0297"+
		"\u0005.\u0000\u0000\u0290\u0291\u0005,\u0000\u0000\u0291\u0292\u0003@"+
		" \u0000\u0292\u0293\u0005\u00d7\u0000\u0000\u0293\u0297\u0001\u0000\u0000"+
		"\u0000\u0294\u0295\u0005+\u0000\u0000\u0295\u0297\u0003l6\u0000\u0296"+
		"\u028f\u0001\u0000\u0000\u0000\u0296\u0290\u0001\u0000\u0000\u0000\u0296"+
		"\u0294\u0001\u0000\u0000\u0000\u02971\u0001\u0000\u0000\u0000\u0298\u0299"+
		"\u0005\u0006\u0000\u0000\u02993\u0001\u0000\u0000\u0000\u029a\u029b\u0005"+
		"\u0007\u0000\u0000\u029b5\u0001\u0000\u0000\u0000\u029c\u029d\u0005\b"+
		"\u0000\u0000\u029d7\u0001\u0000\u0000\u0000\u029e\u029f\u0005\u000b\u0000"+
		"\u0000\u029f9\u0001\u0000\u0000\u0000\u02a0\u02a2\u0005\f\u0000\u0000"+
		"\u02a1\u02a0\u0001\u0000\u0000\u0000\u02a2\u02a3\u0001\u0000\u0000\u0000"+
		"\u02a3\u02a1\u0001\u0000\u0000\u0000\u02a3\u02a4\u0001\u0000\u0000\u0000"+
		"\u02a4;\u0001\u0000\u0000\u0000\u02a5\u02a6\u0007\u0001\u0000\u0000\u02a6"+
		"\u02ab\u0003@ \u0000\u02a7\u02a8\u0005\u00c7\u0000\u0000\u02a8\u02aa\u0003"+
		">\u001f\u0000\u02a9\u02a7\u0001\u0000\u0000\u0000\u02aa\u02ad\u0001\u0000"+
		"\u0000\u0000\u02ab\u02a9\u0001\u0000\u0000\u0000\u02ab\u02ac\u0001\u0000"+
		"\u0000\u0000\u02ac\u02ae\u0001\u0000\u0000\u0000\u02ad\u02ab\u0001\u0000"+
		"\u0000\u0000\u02ae\u02af\u0007\u0002\u0000\u0000\u02af=\u0001\u0000\u0000"+
		"\u0000\u02b0\u02b6\u0005\u00d4\u0000\u0000\u02b1\u02b3\u0005\u00c9\u0000"+
		"\u0000\u02b2\u02b4\u0003f3\u0000\u02b3\u02b2\u0001\u0000\u0000\u0000\u02b3"+
		"\u02b4\u0001\u0000\u0000\u0000\u02b4\u02b5\u0001\u0000\u0000\u0000\u02b5"+
		"\u02b7\u0005\u00ca\u0000\u0000\u02b6\u02b1\u0001\u0000\u0000\u0000\u02b6"+
		"\u02b7\u0001\u0000\u0000\u0000\u02b7?\u0001\u0000\u0000\u0000\u02b8\u02b9"+
		"\u0003B!\u0000\u02b9A\u0001\u0000\u0000\u0000\u02ba\u02c0\u0003D\"\u0000"+
		"\u02bb\u02bc\u0005\u0092\u0000\u0000\u02bc\u02bd\u0003D\"\u0000\u02bd"+
		"\u02be\u0005\u0094\u0000\u0000\u02be\u02bf\u0003D\"\u0000\u02bf\u02c1"+
		"\u0001\u0000\u0000\u0000\u02c0\u02bb\u0001\u0000\u0000\u0000\u02c0\u02c1"+
		"\u0001\u0000\u0000\u0000\u02c1C\u0001\u0000\u0000\u0000\u02c2\u02c7\u0003"+
		"F#\u0000\u02c3\u02c4\u0005\u00b2\u0000\u0000\u02c4\u02c6\u0003F#\u0000"+
		"\u02c5\u02c3\u0001\u0000\u0000\u0000\u02c6\u02c9\u0001\u0000\u0000\u0000"+
		"\u02c7\u02c5\u0001\u0000\u0000\u0000\u02c7\u02c8\u0001\u0000\u0000\u0000"+
		"\u02c8E\u0001\u0000\u0000\u0000\u02c9\u02c7\u0001\u0000\u0000\u0000\u02ca"+
		"\u02cf\u0003H$\u0000\u02cb\u02cc\u0005\u00b1\u0000\u0000\u02cc\u02ce\u0003"+
		"H$\u0000\u02cd\u02cb\u0001\u0000\u0000\u0000\u02ce\u02d1\u0001\u0000\u0000"+
		"\u0000\u02cf\u02cd\u0001\u0000\u0000\u0000\u02cf\u02d0\u0001\u0000\u0000"+
		"\u0000\u02d0G\u0001\u0000\u0000\u0000\u02d1\u02cf\u0001\u0000\u0000\u0000"+
		"\u02d2\u02d3\u0005\u00b3\u0000\u0000\u02d3\u02d6\u0003H$\u0000\u02d4\u02d6"+
		"\u0003J%\u0000\u02d5\u02d2\u0001\u0000\u0000\u0000\u02d5\u02d4\u0001\u0000"+
		"\u0000\u0000\u02d6I\u0001\u0000\u0000\u0000\u02d7\u02db\u0003R)\u0000"+
		"\u02d8\u02d9\u0003L&\u0000\u02d9\u02da\u0003R)\u0000\u02da\u02dc\u0001"+
		"\u0000\u0000\u0000\u02db\u02d8\u0001\u0000\u0000\u0000\u02db\u02dc\u0001"+
		"\u0000\u0000\u0000\u02dc\u02e1\u0001\u0000\u0000\u0000\u02dd\u02de\u0003"+
		"R)\u0000\u02de\u02df\u0003N\'\u0000\u02df\u02e1\u0001\u0000\u0000\u0000"+
		"\u02e0\u02d7\u0001\u0000\u0000\u0000\u02e0\u02dd\u0001\u0000\u0000\u0000"+
		"\u02e1K\u0001\u0000\u0000\u0000\u02e2\u02ec\u0005\u00b6\u0000\u0000\u02e3"+
		"\u02ec\u0005\u00b7\u0000\u0000\u02e4\u02ec\u0005\u00ba\u0000\u0000\u02e5"+
		"\u02ec\u0005\u00bb\u0000\u0000\u02e6\u02ec\u0005\u00b8\u0000\u0000\u02e7"+
		"\u02ec\u0005\u00b9\u0000\u0000\u02e8\u02ec\u0005\u00b4\u0000\u0000\u02e9"+
		"\u02ea\u0005\u00b3\u0000\u0000\u02ea\u02ec\u0005\u00b4\u0000\u0000\u02eb"+
		"\u02e2\u0001\u0000\u0000\u0000\u02eb\u02e3\u0001\u0000\u0000\u0000\u02eb"+
		"\u02e4\u0001\u0000\u0000\u0000\u02eb\u02e5\u0001\u0000\u0000\u0000\u02eb"+
		"\u02e6\u0001\u0000\u0000\u0000\u02eb\u02e7\u0001\u0000\u0000\u0000\u02eb"+
		"\u02e8\u0001\u0000\u0000\u0000\u02eb\u02e9\u0001\u0000\u0000\u0000\u02ec"+
		"M\u0001\u0000\u0000\u0000\u02ed\u02ef\u0005\u00b5\u0000\u0000\u02ee\u02f0"+
		"\u0005\u00b3\u0000\u0000\u02ef\u02ee\u0001\u0000\u0000\u0000\u02ef\u02f0"+
		"\u0001\u0000\u0000\u0000\u02f0\u02f1\u0001\u0000\u0000\u0000\u02f1\u02f7"+
		"\u0003P(\u0000\u02f2\u02f4\u0005\u00c9\u0000\u0000\u02f3\u02f5\u0003f"+
		"3\u0000\u02f4\u02f3\u0001\u0000\u0000\u0000\u02f4\u02f5\u0001\u0000\u0000"+
		"\u0000\u02f5\u02f6\u0001\u0000\u0000\u0000\u02f6\u02f8\u0005\u00ca\u0000"+
		"\u0000\u02f7\u02f2\u0001\u0000\u0000\u0000\u02f7\u02f8\u0001\u0000\u0000"+
		"\u0000\u02f8O\u0001\u0000\u0000\u0000\u02f9\u02fa\u0005\u00d4\u0000\u0000"+
		"\u02faQ\u0001\u0000\u0000\u0000\u02fb\u0300\u0003T*\u0000\u02fc\u02fd"+
		"\u0007\u0003\u0000\u0000\u02fd\u02ff\u0003T*\u0000\u02fe\u02fc\u0001\u0000"+
		"\u0000\u0000\u02ff\u0302\u0001\u0000\u0000\u0000\u0300\u02fe\u0001\u0000"+
		"\u0000\u0000\u0300\u0301\u0001\u0000\u0000\u0000\u0301S\u0001\u0000\u0000"+
		"\u0000\u0302\u0300\u0001\u0000\u0000\u0000\u0303\u0308\u0003V+\u0000\u0304"+
		"\u0305\u0007\u0004\u0000\u0000\u0305\u0307\u0003V+\u0000\u0306\u0304\u0001"+
		"\u0000\u0000\u0000\u0307\u030a\u0001\u0000\u0000\u0000\u0308\u0306\u0001"+
		"\u0000\u0000\u0000\u0308\u0309\u0001\u0000\u0000\u0000\u0309U\u0001\u0000"+
		"\u0000\u0000\u030a\u0308\u0001\u0000\u0000\u0000\u030b\u030e\u0003X,\u0000"+
		"\u030c\u030d\u0005\u00bc\u0000\u0000\u030d\u030f\u0003V+\u0000\u030e\u030c"+
		"\u0001\u0000\u0000\u0000\u030e\u030f\u0001\u0000\u0000\u0000\u030fW\u0001"+
		"\u0000\u0000\u0000\u0310\u0311\u0007\u0005\u0000\u0000\u0311\u0314\u0003"+
		"X,\u0000\u0312\u0314\u0003Z-\u0000\u0313\u0310\u0001\u0000\u0000\u0000"+
		"\u0313\u0312\u0001\u0000\u0000\u0000\u0314Y\u0001\u0000\u0000\u0000\u0315"+
		"\u0319\u0003^/\u0000\u0316\u0318\u0003\\.\u0000\u0317\u0316\u0001\u0000"+
		"\u0000\u0000\u0318\u031b\u0001\u0000\u0000\u0000\u0319\u0317\u0001\u0000"+
		"\u0000\u0000\u0319\u031a\u0001\u0000\u0000\u0000\u031a[\u0001\u0000\u0000"+
		"\u0000\u031b\u0319\u0001\u0000\u0000\u0000\u031c\u031d\u0005\u00c4\u0000"+
		"\u0000\u031d\u0337\u0005\u00d4\u0000\u0000\u031e\u031f\u0005\u00cb\u0000"+
		"\u0000\u031f\u0320\u0003@ \u0000\u0320\u0321\u0005\u00cc\u0000\u0000\u0321"+
		"\u0337\u0001\u0000\u0000\u0000\u0322\u0324\u0005\u00cb\u0000\u0000\u0323"+
		"\u0325\u0003@ \u0000\u0324\u0323\u0001\u0000\u0000\u0000\u0324\u0325\u0001"+
		"\u0000\u0000\u0000\u0325\u0326\u0001\u0000\u0000\u0000\u0326\u0328\u0005"+
		"\u00c6\u0000\u0000\u0327\u0329\u0003@ \u0000\u0328\u0327\u0001\u0000\u0000"+
		"\u0000\u0328\u0329\u0001\u0000\u0000\u0000\u0329\u032e\u0001\u0000\u0000"+
		"\u0000\u032a\u032c\u0005\u00c6\u0000\u0000\u032b\u032d\u0003@ \u0000\u032c"+
		"\u032b\u0001\u0000\u0000\u0000\u032c\u032d\u0001\u0000\u0000\u0000\u032d"+
		"\u032f\u0001\u0000\u0000\u0000\u032e\u032a\u0001\u0000\u0000\u0000\u032e"+
		"\u032f\u0001\u0000\u0000\u0000\u032f\u0330\u0001\u0000\u0000\u0000\u0330"+
		"\u0337\u0005\u00cc\u0000\u0000\u0331\u0333\u0005\u00c9\u0000\u0000\u0332"+
		"\u0334\u0003f3\u0000\u0333\u0332\u0001\u0000\u0000\u0000\u0333\u0334\u0001"+
		"\u0000\u0000\u0000\u0334\u0335\u0001\u0000\u0000\u0000\u0335\u0337\u0005"+
		"\u00ca\u0000\u0000\u0336\u031c\u0001\u0000\u0000\u0000\u0336\u031e\u0001"+
		"\u0000\u0000\u0000\u0336\u0322\u0001\u0000\u0000\u0000\u0336\u0331\u0001"+
		"\u0000\u0000\u0000\u0337]\u0001\u0000\u0000\u0000\u0338\u0345\u0005\u00d3"+
		"\u0000\u0000\u0339\u0345\u0005\u00d2\u0000\u0000\u033a\u0345\u0005\u00cf"+
		"\u0000\u0000\u033b\u0345\u0005\u00d0\u0000\u0000\u033c\u0345\u0005\u00d1"+
		"\u0000\u0000\u033d\u0345\u0005\u00d4\u0000\u0000\u033e\u0345\u0003`0\u0000"+
		"\u033f\u0345\u0003b1\u0000\u0340\u0341\u0005\u00c9\u0000\u0000\u0341\u0342"+
		"\u0003@ \u0000\u0342\u0343\u0005\u00ca\u0000\u0000\u0343\u0345\u0001\u0000"+
		"\u0000\u0000\u0344\u0338\u0001\u0000\u0000\u0000\u0344\u0339\u0001\u0000"+
		"\u0000\u0000\u0344\u033a\u0001\u0000\u0000\u0000\u0344\u033b\u0001\u0000"+
		"\u0000\u0000\u0344\u033c\u0001\u0000\u0000\u0000\u0344\u033d\u0001\u0000"+
		"\u0000\u0000\u0344\u033e\u0001\u0000\u0000\u0000\u0344\u033f\u0001\u0000"+
		"\u0000\u0000\u0344\u0340\u0001\u0000\u0000\u0000\u0345_\u0001\u0000\u0000"+
		"\u0000\u0346\u0352\u0005\u00cb\u0000\u0000\u0347\u034c\u0003@ \u0000\u0348"+
		"\u0349\u0005\u00c5\u0000\u0000\u0349\u034b\u0003@ \u0000\u034a\u0348\u0001"+
		"\u0000\u0000\u0000\u034b\u034e\u0001\u0000\u0000\u0000\u034c\u034a\u0001"+
		"\u0000\u0000\u0000\u034c\u034d\u0001\u0000\u0000\u0000\u034d\u0350\u0001"+
		"\u0000\u0000\u0000\u034e\u034c\u0001\u0000\u0000\u0000\u034f\u0351\u0005"+
		"\u00c5\u0000\u0000\u0350\u034f\u0001\u0000\u0000\u0000\u0350\u0351\u0001"+
		"\u0000\u0000\u0000\u0351\u0353\u0001\u0000\u0000\u0000\u0352\u0347\u0001"+
		"\u0000\u0000\u0000\u0352\u0353\u0001\u0000\u0000\u0000\u0353\u0354\u0001"+
		"\u0000\u0000\u0000\u0354\u0355\u0005\u00cc\u0000\u0000\u0355a\u0001\u0000"+
		"\u0000\u0000\u0356\u0362\u0005\u00cd\u0000\u0000\u0357\u035c\u0003d2\u0000"+
		"\u0358\u0359\u0005\u00c5\u0000\u0000\u0359\u035b\u0003d2\u0000\u035a\u0358"+
		"\u0001\u0000\u0000\u0000\u035b\u035e\u0001\u0000\u0000\u0000\u035c\u035a"+
		"\u0001\u0000\u0000\u0000\u035c\u035d\u0001\u0000\u0000\u0000\u035d\u0360"+
		"\u0001\u0000\u0000\u0000\u035e\u035c\u0001\u0000\u0000\u0000\u035f\u0361"+
		"\u0005\u00c5\u0000\u0000\u0360\u035f\u0001\u0000\u0000\u0000\u0360\u0361"+
		"\u0001\u0000\u0000\u0000\u0361\u0363\u0001\u0000\u0000\u0000\u0362\u0357"+
		"\u0001\u0000\u0000\u0000\u0362\u0363\u0001\u0000\u0000\u0000\u0363\u0364"+
		"\u0001\u0000\u0000\u0000\u0364\u0365\u0005\u00ce\u0000\u0000\u0365c\u0001"+
		"\u0000\u0000\u0000\u0366\u0367\u0003@ \u0000\u0367\u0368\u0005\u00c6\u0000"+
		"\u0000\u0368\u0369\u0003@ \u0000\u0369e\u0001\u0000\u0000\u0000\u036a"+
		"\u036f\u0003h4\u0000\u036b\u036c\u0005\u00c5\u0000\u0000\u036c\u036e\u0003"+
		"h4\u0000\u036d\u036b\u0001\u0000\u0000\u0000\u036e\u0371\u0001\u0000\u0000"+
		"\u0000\u036f\u036d\u0001\u0000\u0000\u0000\u036f\u0370\u0001\u0000\u0000"+
		"\u0000\u0370g\u0001\u0000\u0000\u0000\u0371\u036f\u0001\u0000\u0000\u0000"+
		"\u0372\u0373\u0005\u00d4\u0000\u0000\u0373\u0375\u0005\u00c8\u0000\u0000"+
		"\u0374\u0372\u0001\u0000\u0000\u0000\u0374\u0375\u0001\u0000\u0000\u0000"+
		"\u0375\u0376\u0001\u0000\u0000\u0000\u0376\u0377\u0003@ \u0000\u0377i"+
		"\u0001\u0000\u0000\u0000\u0378\u037c\u0003l6\u0000\u0379\u037b\u0003\u0002"+
		"\u0001\u0000\u037a\u0379\u0001\u0000\u0000\u0000\u037b\u037e\u0001\u0000"+
		"\u0000\u0000\u037c\u037a\u0001\u0000\u0000\u0000\u037c\u037d\u0001\u0000"+
		"\u0000\u0000\u037d\u0380\u0001\u0000\u0000\u0000\u037e\u037c\u0001\u0000"+
		"\u0000\u0000\u037f\u0381\u0003p8\u0000\u0380\u037f\u0001\u0000\u0000\u0000"+
		"\u0380\u0381\u0001\u0000\u0000\u0000\u0381\u0382\u0001\u0000\u0000\u0000"+
		"\u0382\u0383\u0003r9\u0000\u0383k\u0001\u0000\u0000\u0000\u0384\u0385"+
		"\u0007\u0006\u0000\u0000\u0385\u0386\u0005\u0090\u0000\u0000\u0386\u0387"+
		"\u0003n7\u0000\u0387\u0388\u0005\u00b4\u0000\u0000\u0388\u038b\u0003@"+
		" \u0000\u0389\u038a\u0005\u0092\u0000\u0000\u038a\u038c\u0003@ \u0000"+
		"\u038b\u0389\u0001\u0000\u0000\u0000\u038b\u038c\u0001\u0000\u0000\u0000"+
		"\u038c\u038d\u0001\u0000\u0000\u0000\u038d\u038e\u0007\u0007\u0000\u0000"+
		"\u038em\u0001\u0000\u0000\u0000\u038f\u0398\u0005\u00d4\u0000\u0000\u0390"+
		"\u0393\u0005\u00d4\u0000\u0000\u0391\u0392\u0005\u00c5\u0000\u0000\u0392"+
		"\u0394\u0005\u00d4\u0000\u0000\u0393\u0391\u0001\u0000\u0000\u0000\u0394"+
		"\u0395\u0001\u0000\u0000\u0000\u0395\u0393\u0001\u0000\u0000\u0000\u0395"+
		"\u0396\u0001\u0000\u0000\u0000\u0396\u0398\u0001\u0000\u0000\u0000\u0397"+
		"\u038f\u0001\u0000\u0000\u0000\u0397\u0390\u0001\u0000\u0000\u0000\u0398"+
		"o\u0001\u0000\u0000\u0000\u0399\u039a\u0007\u0006\u0000\u0000\u039a\u039b"+
		"\u0005\u0094\u0000\u0000\u039b\u039f\u0007\u0007\u0000\u0000\u039c\u039e"+
		"\u0003\u0002\u0001\u0000\u039d\u039c\u0001\u0000\u0000\u0000\u039e\u03a1"+
		"\u0001\u0000\u0000\u0000\u039f\u039d\u0001\u0000\u0000\u0000\u039f\u03a0"+
		"\u0001\u0000\u0000\u0000\u03a0q\u0001\u0000\u0000\u0000\u03a1\u039f\u0001"+
		"\u0000\u0000\u0000\u03a2\u03a3\u0007\u0006\u0000\u0000\u03a3\u03a4\u0005"+
		"\u0091\u0000\u0000\u03a4\u03a5\u0007\u0007\u0000\u0000\u03a5s\u0001\u0000"+
		"\u0000\u0000\u03a6\u03aa\u0003v;\u0000\u03a7\u03a9\u0003\u0002\u0001\u0000"+
		"\u03a8\u03a7\u0001\u0000\u0000\u0000\u03a9\u03ac\u0001\u0000\u0000\u0000"+
		"\u03aa\u03a8\u0001\u0000\u0000\u0000\u03aa\u03ab\u0001\u0000\u0000\u0000"+
		"\u03ab\u03b0\u0001\u0000\u0000\u0000\u03ac\u03aa\u0001\u0000\u0000\u0000"+
		"\u03ad\u03af\u0003x<\u0000\u03ae\u03ad\u0001\u0000\u0000\u0000\u03af\u03b2"+
		"\u0001\u0000\u0000\u0000\u03b0\u03ae\u0001\u0000\u0000\u0000\u03b0\u03b1"+
		"\u0001\u0000\u0000\u0000\u03b1\u03b4\u0001\u0000\u0000\u0000\u03b2\u03b0"+
		"\u0001\u0000\u0000\u0000\u03b3\u03b5\u0003z=\u0000\u03b4\u03b3\u0001\u0000"+
		"\u0000\u0000\u03b4\u03b5\u0001\u0000\u0000\u0000\u03b5\u03b6\u0001\u0000"+
		"\u0000\u0000\u03b6\u03b7\u0003|>\u0000\u03b7u\u0001\u0000\u0000\u0000"+
		"\u03b8\u03b9\u0007\u0006\u0000\u0000\u03b9\u03ba\u0005\u0092\u0000\u0000"+
		"\u03ba\u03bb\u0003@ \u0000\u03bb\u03bc\u0007\u0007\u0000\u0000\u03bcw"+
		"\u0001\u0000\u0000\u0000\u03bd\u03be\u0007\u0006\u0000\u0000\u03be\u03bf"+
		"\u0005\u0093\u0000\u0000\u03bf\u03c0\u0003@ \u0000\u03c0\u03c4\u0007\u0007"+
		"\u0000\u0000\u03c1\u03c3\u0003\u0002\u0001\u0000\u03c2\u03c1\u0001\u0000"+
		"\u0000\u0000\u03c3\u03c6\u0001\u0000\u0000\u0000\u03c4\u03c2\u0001\u0000"+
		"\u0000\u0000\u03c4\u03c5\u0001\u0000\u0000\u0000\u03c5y\u0001\u0000\u0000"+
		"\u0000\u03c6\u03c4\u0001\u0000\u0000\u0000\u03c7\u03c8\u0007\u0006\u0000"+
		"\u0000\u03c8\u03c9\u0005\u0094\u0000\u0000\u03c9\u03cd\u0007\u0007\u0000"+
		"\u0000\u03ca\u03cc\u0003\u0002\u0001\u0000\u03cb\u03ca\u0001\u0000\u0000"+
		"\u0000\u03cc\u03cf\u0001\u0000\u0000\u0000\u03cd\u03cb\u0001\u0000\u0000"+
		"\u0000\u03cd\u03ce\u0001\u0000\u0000\u0000\u03ce{\u0001\u0000\u0000\u0000"+
		"\u03cf\u03cd\u0001\u0000\u0000\u0000\u03d0\u03d1\u0007\u0006\u0000\u0000"+
		"\u03d1\u03d2\u0005\u0095\u0000\u0000\u03d2\u03d3\u0007\u0007\u0000\u0000"+
		"\u03d3}\u0001\u0000\u0000\u0000\u03d4\u03d5\u0007\u0006\u0000\u0000\u03d5"+
		"\u03d6\u0005\u0098\u0000\u0000\u03d6\u03d7\u0005\u00d2\u0000\u0000\u03d7"+
		"\u03d8\u0007\u0007\u0000\u0000\u03d8\u007f\u0001\u0000\u0000\u0000\u03d9"+
		"\u03da\u0007\u0006\u0000\u0000\u03da\u03db\u0005\u0099\u0000\u0000\u03db"+
		"\u03de\u0005\u00d2\u0000\u0000\u03dc\u03dd\u0005\u00ac\u0000\u0000\u03dd"+
		"\u03df\u0005\u00ad\u0000\u0000\u03de\u03dc\u0001\u0000\u0000\u0000\u03de"+
		"\u03df\u0001\u0000\u0000\u0000\u03df\u03e2\u0001\u0000\u0000\u0000\u03e0"+
		"\u03e1\u0007\b\u0000\u0000\u03e1\u03e3\u0005\u00ae\u0000\u0000\u03e2\u03e0"+
		"\u0001\u0000\u0000\u0000\u03e2\u03e3\u0001\u0000\u0000\u0000\u03e3\u03e4"+
		"\u0001\u0000\u0000\u0000\u03e4\u03e5\u0007\u0007\u0000\u0000\u03e5\u0081"+
		"\u0001\u0000\u0000\u0000\u03e6\u03e7\u0007\u0006\u0000\u0000\u03e7\u03e8"+
		"\u0005\u0096\u0000\u0000\u03e8\u03ea\u0005\u00d4\u0000\u0000\u03e9\u03eb"+
		"\u0005\u00b0\u0000\u0000\u03ea\u03e9\u0001\u0000\u0000\u0000\u03ea\u03eb"+
		"\u0001\u0000\u0000\u0000\u03eb\u03ec\u0001\u0000\u0000\u0000\u03ec\u03f0"+
		"\u0007\u0007\u0000\u0000\u03ed\u03ef\u0003\u0002\u0001\u0000\u03ee\u03ed"+
		"\u0001\u0000\u0000\u0000\u03ef\u03f2\u0001\u0000\u0000\u0000\u03f0\u03ee"+
		"\u0001\u0000\u0000\u0000\u03f0\u03f1\u0001\u0000\u0000\u0000\u03f1\u03f3"+
		"\u0001\u0000\u0000\u0000\u03f2\u03f0\u0001\u0000\u0000\u0000\u03f3\u03f4"+
		"\u0007\u0006\u0000\u0000\u03f4\u03f6\u0005\u0097\u0000\u0000\u03f5\u03f7"+
		"\u0005\u00d4\u0000\u0000\u03f6\u03f5\u0001\u0000\u0000\u0000\u03f6\u03f7"+
		"\u0001\u0000\u0000\u0000\u03f7\u03f8\u0001\u0000\u0000\u0000\u03f8\u03f9"+
		"\u0007\u0007\u0000\u0000\u03f9\u0083\u0001\u0000\u0000\u0000\u03fa\u040a"+
		"\u0005\u00d4\u0000\u0000\u03fb\u03fe\u0005\u00d4\u0000\u0000\u03fc\u03fd"+
		"\u0005\u00c5\u0000\u0000\u03fd\u03ff\u0005\u00d4\u0000\u0000\u03fe\u03fc"+
		"\u0001\u0000\u0000\u0000\u03ff\u0400\u0001\u0000\u0000\u0000\u0400\u03fe"+
		"\u0001\u0000\u0000\u0000\u0400\u0401\u0001\u0000\u0000\u0000\u0401\u040a"+
		"\u0001\u0000\u0000\u0000\u0402\u0405\u0005\u00d4\u0000\u0000\u0403\u0404"+
		"\u0005\u00c4\u0000\u0000\u0404\u0406\u0005\u00d4\u0000\u0000\u0405\u0403"+
		"\u0001\u0000\u0000\u0000\u0406\u0407\u0001\u0000\u0000\u0000\u0407\u0405"+
		"\u0001\u0000\u0000\u0000\u0407\u0408\u0001\u0000\u0000\u0000\u0408\u040a"+
		"\u0001\u0000\u0000\u0000\u0409\u03fa\u0001\u0000\u0000\u0000\u0409\u03fb"+
		"\u0001\u0000\u0000\u0000\u0409\u0402\u0001\u0000\u0000\u0000\u040a\u0085"+
		"\u0001\u0000\u0000\u0000\u040b\u040c\u0007\u0006\u0000\u0000\u040c\u040d"+
		"\u0005\u009a\u0000\u0000\u040d\u040e\u0003\u0084B\u0000\u040e\u040f\u0005"+
		"\u00c8\u0000\u0000\u040f\u0414\u0003@ \u0000\u0410\u0411\u0005\u00c7\u0000"+
		"\u0000\u0411\u0413\u0003>\u001f\u0000\u0412\u0410\u0001\u0000\u0000\u0000"+
		"\u0413\u0416\u0001\u0000\u0000\u0000\u0414\u0412\u0001\u0000\u0000\u0000"+
		"\u0414\u0415\u0001\u0000\u0000\u0000\u0415\u0417\u0001\u0000\u0000\u0000"+
		"\u0416\u0414\u0001\u0000\u0000\u0000\u0417\u0418\u0007\u0007\u0000\u0000"+
		"\u0418\u0087\u0001\u0000\u0000\u0000\u0419\u041a\u0007\u0006\u0000\u0000"+
		"\u041a\u041b\u0005\u009a\u0000\u0000\u041b\u041c\u0005\u00d4\u0000\u0000"+
		"\u041c\u0420\u0007\u0007\u0000\u0000\u041d\u041f\u0003\u0002\u0001\u0000"+
		"\u041e\u041d\u0001\u0000\u0000\u0000\u041f\u0422\u0001\u0000\u0000\u0000"+
		"\u0420\u041e\u0001\u0000\u0000\u0000\u0420\u0421\u0001\u0000\u0000\u0000"+
		"\u0421\u0423\u0001\u0000\u0000\u0000\u0422\u0420\u0001\u0000\u0000\u0000"+
		"\u0423\u0424\u0007\u0006\u0000\u0000\u0424\u0425\u0005\u009b\u0000\u0000"+
		"\u0425\u0426\u0007\u0007\u0000\u0000\u0426\u0089\u0001\u0000\u0000\u0000"+
		"\u0427\u0428\u0007\u0006\u0000\u0000\u0428\u0429\u0005\u009e\u0000\u0000"+
		"\u0429\u042a\u0005\u00d4\u0000\u0000\u042a\u042c\u0005\u00c9\u0000\u0000"+
		"\u042b\u042d\u0003\u008cF\u0000\u042c\u042b\u0001\u0000\u0000\u0000\u042c"+
		"\u042d\u0001\u0000\u0000\u0000\u042d\u042e\u0001\u0000\u0000\u0000\u042e"+
		"\u042f\u0005\u00ca\u0000\u0000\u042f\u0433\u0007\u0007\u0000\u0000\u0430"+
		"\u0432\u0003\u0002\u0001\u0000\u0431\u0430\u0001\u0000\u0000\u0000\u0432"+
		"\u0435\u0001\u0000\u0000\u0000\u0433\u0431\u0001\u0000\u0000\u0000\u0433"+
		"\u0434\u0001\u0000\u0000\u0000\u0434\u0436\u0001\u0000\u0000\u0000\u0435"+
		"\u0433\u0001\u0000\u0000\u0000\u0436\u0437\u0007\u0006\u0000\u0000\u0437"+
		"\u0438\u0005\u009f\u0000\u0000\u0438\u0439\u0007\u0007\u0000\u0000\u0439"+
		"\u008b\u0001\u0000\u0000\u0000\u043a\u043f\u0003\u008eG\u0000\u043b\u043c"+
		"\u0005\u00c5\u0000\u0000\u043c\u043e\u0003\u008eG\u0000\u043d\u043b\u0001"+
		"\u0000\u0000\u0000\u043e\u0441\u0001\u0000\u0000\u0000\u043f\u043d\u0001"+
		"\u0000\u0000\u0000\u043f\u0440\u0001\u0000\u0000\u0000\u0440\u008d\u0001"+
		"\u0000\u0000\u0000\u0441\u043f\u0001\u0000\u0000\u0000\u0442\u0445\u0005"+
		"\u00d4\u0000\u0000\u0443\u0444\u0005\u00c8\u0000\u0000\u0444\u0446\u0003"+
		"@ \u0000\u0445\u0443\u0001\u0000\u0000\u0000\u0445\u0446\u0001\u0000\u0000"+
		"\u0000\u0446\u008f\u0001\u0000\u0000\u0000\u0447\u0448\u0007\u0006\u0000"+
		"\u0000\u0448\u044e\u0005\u00a0\u0000\u0000\u0449\u044b\u0005\u00c9\u0000"+
		"\u0000\u044a\u044c\u0003f3\u0000\u044b\u044a\u0001\u0000\u0000\u0000\u044b"+
		"\u044c\u0001\u0000\u0000\u0000\u044c\u044d\u0001\u0000\u0000\u0000\u044d"+
		"\u044f\u0005\u00ca\u0000\u0000\u044e\u0449\u0001\u0000\u0000\u0000\u044e"+
		"\u044f\u0001\u0000\u0000\u0000\u044f\u0450\u0001\u0000\u0000\u0000\u0450"+
		"\u0451\u0003@ \u0000\u0451\u0455\u0007\u0007\u0000\u0000\u0452\u0454\u0003"+
		"\u0002\u0001\u0000\u0453\u0452\u0001\u0000\u0000\u0000\u0454\u0457\u0001"+
		"\u0000\u0000\u0000\u0455\u0453\u0001\u0000\u0000\u0000\u0455\u0456\u0001"+
		"\u0000\u0000\u0000\u0456\u0458\u0001\u0000\u0000\u0000\u0457\u0455\u0001"+
		"\u0000\u0000\u0000\u0458\u0459\u0007\u0006\u0000\u0000\u0459\u045a\u0005"+
		"\u00a1\u0000\u0000\u045a\u045b\u0007\u0007\u0000\u0000\u045b\u0091\u0001"+
		"\u0000\u0000\u0000\u045c\u045d\u0007\u0006\u0000\u0000\u045d\u045e\u0005"+
		"\u00a2\u0000\u0000\u045e\u045f\u0005\u00d2\u0000\u0000\u045f\u0460\u0005"+
		"\u00a4\u0000\u0000\u0460\u0463\u0005\u00d4\u0000\u0000\u0461\u0462\u0007"+
		"\b\u0000\u0000\u0462\u0464\u0005\u00ae\u0000\u0000\u0463\u0461\u0001\u0000"+
		"\u0000\u0000\u0463\u0464\u0001\u0000\u0000\u0000\u0464\u0465\u0001\u0000"+
		"\u0000\u0000\u0465\u0466\u0007\u0007\u0000\u0000\u0466\u0093\u0001\u0000"+
		"\u0000\u0000\u0467\u0468\u0007\u0006\u0000\u0000\u0468\u0469\u0005\u00a3"+
		"\u0000\u0000\u0469\u046a\u0005\u00d2\u0000\u0000\u046a\u046b\u0005\u00a2"+
		"\u0000\u0000\u046b\u046e\u0003\u0096K\u0000\u046c\u046d\u0007\b\u0000"+
		"\u0000\u046d\u046f\u0005\u00ae\u0000\u0000\u046e\u046c\u0001\u0000\u0000"+
		"\u0000\u046e\u046f\u0001\u0000\u0000\u0000\u046f\u0470\u0001\u0000\u0000"+
		"\u0000\u0470\u0471\u0007\u0007\u0000\u0000\u0471\u0095\u0001\u0000\u0000"+
		"\u0000\u0472\u0477\u0003\u0098L\u0000\u0473\u0474\u0005\u00c5\u0000\u0000"+
		"\u0474\u0476\u0003\u0098L\u0000\u0475\u0473\u0001\u0000\u0000\u0000\u0476"+
		"\u0479\u0001\u0000\u0000\u0000\u0477\u0475\u0001\u0000\u0000\u0000\u0477"+
		"\u0478\u0001\u0000\u0000\u0000\u0478\u0097\u0001\u0000\u0000\u0000\u0479"+
		"\u0477\u0001\u0000\u0000\u0000\u047a\u047d\u0005\u00d4\u0000\u0000\u047b"+
		"\u047c\u0005\u00a4\u0000\u0000\u047c\u047e\u0005\u00d4\u0000\u0000\u047d"+
		"\u047b\u0001\u0000\u0000\u0000\u047d\u047e\u0001\u0000\u0000\u0000\u047e"+
		"\u0099\u0001\u0000\u0000\u0000\u047f\u0480\u0007\u0006\u0000\u0000\u0480"+
		"\u0481\u0005\u009c\u0000\u0000\u0481\u0482\u0003\u009cN\u0000\u0482\u0486"+
		"\u0007\u0007\u0000\u0000\u0483\u0485\u0003\u0002\u0001\u0000\u0484\u0483"+
		"\u0001\u0000\u0000\u0000\u0485\u0488\u0001\u0000\u0000\u0000\u0486\u0484"+
		"\u0001\u0000\u0000\u0000\u0486\u0487\u0001\u0000\u0000\u0000\u0487\u0489"+
		"\u0001\u0000\u0000\u0000\u0488\u0486\u0001\u0000\u0000\u0000\u0489\u048a"+
		"\u0007\u0006\u0000\u0000\u048a\u048b\u0005\u009d\u0000\u0000\u048b\u048c"+
		"\u0007\u0007\u0000\u0000\u048c\u009b\u0001\u0000\u0000\u0000\u048d\u0492"+
		"\u0003\u009eO\u0000\u048e\u048f\u0005\u00c5\u0000\u0000\u048f\u0491\u0003"+
		"\u009eO\u0000\u0490\u048e\u0001\u0000\u0000\u0000\u0491\u0494\u0001\u0000"+
		"\u0000\u0000\u0492\u0490\u0001\u0000\u0000\u0000\u0492\u0493\u0001\u0000"+
		"\u0000\u0000\u0493\u009d\u0001\u0000\u0000\u0000\u0494\u0492\u0001\u0000"+
		"\u0000\u0000\u0495\u0496\u0005\u00d4\u0000\u0000\u0496\u0497\u0005\u00c8"+
		"\u0000\u0000\u0497\u0498\u0003@ \u0000\u0498\u009f\u0001\u0000\u0000\u0000"+
		"\u0499\u049a\u0007\u0006\u0000\u0000\u049a\u049b\u0005\u00a5\u0000\u0000"+
		"\u049b\u04a1\u0005\u00d4\u0000\u0000\u049c\u049e\u0005\u00c9\u0000\u0000"+
		"\u049d\u049f\u0003f3\u0000\u049e\u049d\u0001\u0000\u0000\u0000\u049e\u049f"+
		"\u0001\u0000\u0000\u0000\u049f\u04a0\u0001\u0000\u0000\u0000\u04a0\u04a2"+
		"\u0005\u00ca\u0000\u0000\u04a1\u049c\u0001\u0000\u0000\u0000\u04a1\u04a2"+
		"\u0001\u0000\u0000\u0000\u04a2\u04a3\u0001\u0000\u0000\u0000\u04a3\u04a7"+
		"\u0007\u0007\u0000\u0000\u04a4\u04a6\u0003\u0002\u0001\u0000\u04a5\u04a4"+
		"\u0001\u0000\u0000\u0000\u04a6\u04a9\u0001\u0000\u0000\u0000\u04a7\u04a5"+
		"\u0001\u0000\u0000\u0000\u04a7\u04a8\u0001\u0000\u0000\u0000\u04a8\u04aa"+
		"\u0001\u0000\u0000\u0000\u04a9\u04a7\u0001\u0000\u0000\u0000\u04aa\u04ab"+
		"\u0007\u0006\u0000\u0000\u04ab\u04ac\u0005\u00a6\u0000\u0000\u04ac\u04ad"+
		"\u0007\u0007\u0000\u0000\u04ad\u00a1\u0001\u0000\u0000\u0000\u04ae\u04af"+
		"\u0007\u0006\u0000\u0000\u04af\u04b0\u0005\u00a9\u0000\u0000\u04b0\u04b1"+
		"\u0003@ \u0000\u04b1\u04b2\u0007\u0007\u0000\u0000\u04b2\u00a3\u0001\u0000"+
		"\u0000\u0000\u04b3\u04b4\u0007\u0006\u0000\u0000\u04b4\u04b5\u0005\u00aa"+
		"\u0000\u0000\u04b5\u04b6\u0007\t\u0000\u0000\u04b6\u04ba\u0007\u0007\u0000"+
		"\u0000\u04b7\u04b9\u0003\u0002\u0001\u0000\u04b8\u04b7\u0001\u0000\u0000"+
		"\u0000\u04b9\u04bc\u0001\u0000\u0000\u0000\u04ba\u04b8\u0001\u0000\u0000"+
		"\u0000\u04ba\u04bb\u0001\u0000\u0000\u0000\u04bb\u04bd\u0001\u0000\u0000"+
		"\u0000\u04bc\u04ba\u0001\u0000\u0000\u0000\u04bd\u04be\u0007\u0006\u0000"+
		"\u0000\u04be\u04bf\u0005\u00ab\u0000\u0000\u04bf\u04c0\u0007\u0007\u0000"+
		"\u0000\u04c0\u00a5\u0001\u0000\u0000\u0000\u04c1\u04c3\u0003\u00a8T\u0000"+
		"\u04c2\u04c1\u0001\u0000\u0000\u0000\u04c3\u04c6\u0001\u0000\u0000\u0000"+
		"\u04c4\u04c2\u0001\u0000\u0000\u0000\u04c4\u04c5\u0001\u0000\u0000\u0000"+
		"\u04c5\u00a7\u0001\u0000\u0000\u0000\u04c6\u04c4\u0001\u0000\u0000\u0000"+
		"\u04c7\u04cc\u0003\u00aaU\u0000\u04c8\u04c9\u0005\u008b\u0000\u0000\u04c9"+
		"\u04cb\u0003\u00aaU\u0000\u04ca\u04c8\u0001\u0000\u0000\u0000\u04cb\u04ce"+
		"\u0001\u0000\u0000\u0000\u04cc\u04ca\u0001\u0000\u0000\u0000\u04cc\u04cd"+
		"\u0001\u0000\u0000\u0000\u04cd\u04cf\u0001\u0000\u0000\u0000\u04ce\u04cc"+
		"\u0001\u0000\u0000\u0000\u04cf\u04d3\u0005\u0085\u0000\u0000\u04d0\u04d2"+
		"\u0003\u00b8\\\u0000\u04d1\u04d0\u0001\u0000\u0000\u0000\u04d2\u04d5\u0001"+
		"\u0000\u0000\u0000\u04d3\u04d1\u0001\u0000\u0000\u0000\u04d3\u04d4\u0001"+
		"\u0000\u0000\u0000\u04d4\u04d6\u0001\u0000\u0000\u0000\u04d5\u04d3\u0001"+
		"\u0000\u0000\u0000\u04d6\u04d7\u0005\u0086\u0000\u0000\u04d7\u00a9\u0001"+
		"\u0000\u0000\u0000\u04d8\u04e5\u0003\u00acV\u0000\u04d9\u04e5\u0003\u00ae"+
		"W\u0000\u04da\u04db\u0003\u00acV\u0000\u04db\u04dc\u0003\u00b2Y\u0000"+
		"\u04dc\u04e5\u0001\u0000\u0000\u0000\u04dd\u04de\u0003\u00aeW\u0000\u04de"+
		"\u04df\u0003\u00b2Y\u0000\u04df\u04e5\u0001\u0000\u0000\u0000\u04e0\u04e5"+
		"\u0003\u00b4Z\u0000\u04e1\u04e2\u0003\u00acV\u0000\u04e2\u04e3\u0003\u00ae"+
		"W\u0000\u04e3\u04e5\u0001\u0000\u0000\u0000\u04e4\u04d8\u0001\u0000\u0000"+
		"\u0000\u04e4\u04d9\u0001\u0000\u0000\u0000\u04e4\u04da\u0001\u0000\u0000"+
		"\u0000\u04e4\u04dd\u0001\u0000\u0000\u0000\u04e4\u04e0\u0001\u0000\u0000"+
		"\u0000\u04e4\u04e1\u0001\u0000\u0000\u0000\u04e5\u00ab\u0001\u0000\u0000"+
		"\u0000\u04e6\u04e7\u0007\n\u0000\u0000\u04e7\u00ad\u0001\u0000\u0000\u0000"+
		"\u04e8\u04e9\u0005\u008c\u0000\u0000\u04e9\u04ea\u0003\u00b0X\u0000\u04ea"+
		"\u00af\u0001\u0000\u0000\u0000\u04eb\u04ec\u0007\u000b\u0000\u0000\u04ec"+
		"\u00b1\u0001\u0000\u0000\u0000\u04ed\u04ee\u0007\f\u0000\u0000\u04ee\u00b3"+
		"\u0001\u0000\u0000\u0000\u04ef\u04f1\u0003\u00b6[\u0000\u04f0\u04f2\u0003"+
		"\u00b6[\u0000\u04f1\u04f0\u0001\u0000\u0000\u0000\u04f2\u04f3\u0001\u0000"+
		"\u0000\u0000\u04f3\u04f1\u0001\u0000\u0000\u0000\u04f3\u04f4\u0001\u0000"+
		"\u0000\u0000\u04f4\u00b5\u0001\u0000\u0000\u0000\u04f5\u04f8\u0003\u00ac"+
		"V\u0000\u04f6\u04f8\u0003\u00aeW\u0000\u04f7\u04f5\u0001\u0000\u0000\u0000"+
		"\u04f7\u04f6\u0001\u0000\u0000\u0000\u04f8\u00b7\u0001\u0000\u0000\u0000"+
		"\u04f9\u0507\u0003\u00ba]\u0000\u04fa\u0507\u0003\u00be_\u0000\u04fb\u0507"+
		"\u0003\u00c4b\u0000\u04fc\u0507\u0003\u00cae\u0000\u04fd\u0507\u0003\u00ce"+
		"g\u0000\u04fe\u0507\u0003\u00d4j\u0000\u04ff\u0507\u0003\u00d8l\u0000"+
		"\u0500\u0507\u0003\u00dcn\u0000\u0501\u0507\u0003\u00deo\u0000\u0502\u0507"+
		"\u0003\u00e2q\u0000\u0503\u0507\u0003\u00e8t\u0000\u0504\u0507\u0003\u00ec"+
		"v\u0000\u0505\u0507\u0003\u00eew\u0000\u0506\u04f9\u0001\u0000\u0000\u0000"+
		"\u0506\u04fa\u0001\u0000\u0000\u0000\u0506\u04fb\u0001\u0000\u0000\u0000"+
		"\u0506\u04fc\u0001\u0000\u0000\u0000\u0506\u04fd\u0001\u0000\u0000\u0000"+
		"\u0506\u04fe\u0001\u0000\u0000\u0000\u0506\u04ff\u0001\u0000\u0000\u0000"+
		"\u0506\u0500\u0001\u0000\u0000\u0000\u0506\u0501\u0001\u0000\u0000\u0000"+
		"\u0506\u0502\u0001\u0000\u0000\u0000\u0506\u0503\u0001\u0000\u0000\u0000"+
		"\u0506\u0504\u0001\u0000\u0000\u0000\u0506\u0505\u0001\u0000\u0000\u0000"+
		"\u0507\u00b9\u0001\u0000\u0000\u0000\u0508\u0509\u0003\u00bc^\u0000\u0509"+
		"\u050a\u0005\u008a\u0000\u0000\u050a\u050c\u0003\u00f4z\u0000\u050b\u050d"+
		"\u0005\u0089\u0000\u0000\u050c\u050b\u0001\u0000\u0000\u0000\u050c\u050d"+
		"\u0001\u0000\u0000\u0000\u050d\u00bb\u0001\u0000\u0000\u0000\u050e\u050f"+
		"\u0007\r\u0000\u0000\u050f\u00bd\u0001\u0000\u0000\u0000\u0510\u0511\u0003"+
		"\u00c0`\u0000\u0511\u0512\u0005\u008a\u0000\u0000\u0512\u0516\u0003\u00c2"+
		"a\u0000\u0513\u0515\u0003\u00c2a\u0000\u0514\u0513\u0001\u0000\u0000\u0000"+
		"\u0515\u0518\u0001\u0000\u0000\u0000\u0516\u0514\u0001\u0000\u0000\u0000"+
		"\u0516\u0517\u0001\u0000\u0000\u0000\u0517\u051a\u0001\u0000\u0000\u0000"+
		"\u0518\u0516\u0001\u0000\u0000\u0000\u0519\u051b\u0005\u0089\u0000\u0000"+
		"\u051a\u0519\u0001\u0000\u0000\u0000\u051a\u051b\u0001\u0000\u0000\u0000"+
		"\u051b\u00bf\u0001\u0000\u0000\u0000\u051c\u051d\u0007\u000e\u0000\u0000"+
		"\u051d\u00c1\u0001\u0000\u0000\u0000\u051e\u0521\u0003\u00f4z\u0000\u051f"+
		"\u0521\u0005n\u0000\u0000\u0520\u051e\u0001\u0000\u0000\u0000\u0520\u051f"+
		"\u0001\u0000\u0000\u0000\u0521\u00c3\u0001\u0000\u0000\u0000\u0522\u0523"+
		"\u0003\u00c6c\u0000\u0523\u0524\u0005\u008a\u0000\u0000\u0524\u0526\u0003"+
		"\u00c8d\u0000\u0525\u0527\u0005\u0089\u0000\u0000\u0526\u0525\u0001\u0000"+
		"\u0000\u0000\u0526\u0527\u0001\u0000\u0000\u0000\u0527\u00c5\u0001\u0000"+
		"\u0000\u0000\u0528\u0529\u0007\u000f\u0000\u0000\u0529\u00c7\u0001\u0000"+
		"\u0000\u0000\u052a\u052d\u0003\u00f6{\u0000\u052b\u052d\u0003\u00f8|\u0000"+
		"\u052c\u052a\u0001\u0000\u0000\u0000\u052c\u052b\u0001\u0000\u0000\u0000"+
		"\u052d\u00c9\u0001\u0000\u0000\u0000\u052e\u052f\u0003\u00ccf\u0000\u052f"+
		"\u0530\u0005\u008a\u0000\u0000\u0530\u0532\u0003\u00f8|\u0000\u0531\u0533"+
		"\u0005\u0089\u0000\u0000\u0532\u0531\u0001\u0000\u0000\u0000\u0532\u0533"+
		"\u0001\u0000\u0000\u0000\u0533\u00cb\u0001\u0000\u0000\u0000\u0534\u0535"+
		"\u0007\u0010\u0000\u0000\u0535\u00cd\u0001\u0000\u0000\u0000\u0536\u0537"+
		"\u0005\\\u0000\u0000\u0537\u0538\u0005\u008a\u0000\u0000\u0538\u053d\u0003"+
		"\u00d0h\u0000\u0539\u053a\u0005\u008b\u0000\u0000\u053a\u053c\u0003\u00d0"+
		"h\u0000\u053b\u0539\u0001\u0000\u0000\u0000\u053c\u053f\u0001\u0000\u0000"+
		"\u0000\u053d\u053b\u0001\u0000\u0000\u0000\u053d\u053e\u0001\u0000\u0000"+
		"\u0000\u053e\u0541\u0001\u0000\u0000\u0000\u053f\u053d\u0001\u0000\u0000"+
		"\u0000\u0540\u0542\u0005\u0089\u0000\u0000\u0541\u0540\u0001\u0000\u0000"+
		"\u0000\u0541\u0542\u0001\u0000\u0000\u0000\u0542\u00cf\u0001\u0000\u0000"+
		"\u0000\u0543\u0544\u0003\u00f4z\u0000\u0544\u0546\u0003\u00f4z\u0000\u0545"+
		"\u0547\u0003\u00f4z\u0000\u0546\u0545\u0001\u0000\u0000\u0000\u0546\u0547"+
		"\u0001\u0000\u0000\u0000\u0547\u0549\u0001\u0000\u0000\u0000\u0548\u054a"+
		"\u0003\u00f4z\u0000\u0549\u0548\u0001\u0000\u0000\u0000\u0549\u054a\u0001"+
		"\u0000\u0000\u0000\u054a\u054b\u0001\u0000\u0000\u0000\u054b\u054c\u0003"+
		"\u00d2i\u0000\u054c\u00d1\u0001\u0000\u0000\u0000\u054d\u0550\u0003\u00f6"+
		"{\u0000\u054e\u0550\u0003\u0100\u0080\u0000\u054f\u054d\u0001\u0000\u0000"+
		"\u0000\u054f\u054e\u0001\u0000\u0000\u0000\u0550\u00d3\u0001\u0000\u0000"+
		"\u0000\u0551\u0552\u0003\u00d6k\u0000\u0552\u0558\u0005\u008a\u0000\u0000"+
		"\u0553\u0559\u0003\u00f8|\u0000\u0554\u0555\u0003\u00f4z\u0000\u0555\u0556"+
		"\u0003\u00f8|\u0000\u0556\u0557\u0003\u00c8d\u0000\u0557\u0559\u0001\u0000"+
		"\u0000\u0000\u0558\u0553\u0001\u0000\u0000\u0000\u0558\u0554\u0001\u0000"+
		"\u0000\u0000\u0559\u055b\u0001\u0000\u0000\u0000\u055a\u055c\u0005\u0089"+
		"\u0000\u0000\u055b\u055a\u0001\u0000\u0000\u0000\u055b\u055c\u0001\u0000"+
		"\u0000\u0000\u055c\u00d5\u0001\u0000\u0000\u0000\u055d\u055e\u0007\u0011"+
		"\u0000\u0000\u055e\u00d7\u0001\u0000\u0000\u0000\u055f\u0560\u0005d\u0000"+
		"\u0000\u0560\u0561\u0005\u008a\u0000\u0000\u0561\u0562\u0003\u00dam\u0000"+
		"\u0562\u0563\u0003\u00fc~\u0000\u0563\u0565\u0003\u00f8|\u0000\u0564\u0566"+
		"\u0005\u0089\u0000\u0000\u0565\u0564\u0001\u0000\u0000\u0000\u0565\u0566"+
		"\u0001\u0000\u0000\u0000\u0566\u00d9\u0001\u0000\u0000\u0000\u0567\u056d"+
		"\u0003\u00fe\u007f\u0000\u0568\u056d\u0005U\u0000\u0000\u0569\u056d\u0005"+
		"V\u0000\u0000\u056a\u056d\u0005g\u0000\u0000\u056b\u056d\u0005[\u0000"+
		"\u0000\u056c\u0567\u0001\u0000\u0000\u0000\u056c\u0568\u0001\u0000\u0000"+
		"\u0000\u056c\u0569\u0001\u0000\u0000\u0000\u056c\u056a\u0001\u0000\u0000"+
		"\u0000\u056c\u056b\u0001\u0000\u0000\u0000\u056d\u00db\u0001\u0000\u0000"+
		"\u0000\u056e\u056f\u0005g\u0000\u0000\u056f\u0570\u0005\u008a\u0000\u0000"+
		"\u0570\u0572\u0003\u0104\u0082\u0000\u0571\u0573\u0005\u0089\u0000\u0000"+
		"\u0572\u0571\u0001\u0000\u0000\u0000\u0572\u0573\u0001\u0000\u0000\u0000"+
		"\u0573\u00dd\u0001\u0000\u0000\u0000\u0574\u0575\u0005V\u0000\u0000\u0575"+
		"\u0576\u0005\u008a\u0000\u0000\u0576\u0578\u0003\u00e0p\u0000\u0577\u0579"+
		"\u0005\u0089\u0000\u0000\u0578\u0577\u0001\u0000\u0000\u0000\u0578\u0579"+
		"\u0001\u0000\u0000\u0000\u0579\u00df\u0001\u0000\u0000\u0000\u057a\u057e"+
		"\u0003\u00f6{\u0000\u057b\u057e\u0003\u00f8|\u0000\u057c\u057e\u0003\u0100"+
		"\u0080\u0000\u057d\u057a\u0001\u0000\u0000\u0000\u057d\u057b\u0001\u0000"+
		"\u0000\u0000\u057d\u057c\u0001\u0000\u0000\u0000\u057e\u00e1\u0001\u0000"+
		"\u0000\u0000\u057f\u0580\u0005C\u0000\u0000\u0580\u0581\u0005\u008a\u0000"+
		"\u0000\u0581\u0586\u0003\u00e4r\u0000\u0582\u0583\u0005\u008b\u0000\u0000"+
		"\u0583\u0585\u0003\u00e4r\u0000\u0584\u0582\u0001\u0000\u0000\u0000\u0585"+
		"\u0588\u0001\u0000\u0000\u0000\u0586\u0584\u0001\u0000\u0000\u0000\u0586"+
		"\u0587\u0001\u0000\u0000\u0000\u0587\u058a\u0001\u0000\u0000\u0000\u0588"+
		"\u0586\u0001\u0000\u0000\u0000\u0589\u058b\u0005\u0089\u0000\u0000\u058a"+
		"\u0589\u0001\u0000\u0000\u0000\u058a\u058b\u0001\u0000\u0000\u0000\u058b"+
		"\u00e3\u0001\u0000\u0000\u0000\u058c\u058e\u0003\u00e6s\u0000\u058d\u058c"+
		"\u0001\u0000\u0000\u0000\u058e\u058f\u0001\u0000\u0000\u0000\u058f\u058d"+
		"\u0001\u0000\u0000\u0000\u058f\u0590\u0001\u0000\u0000\u0000\u0590\u00e5"+
		"\u0001\u0000\u0000\u0000\u0591\u0592\u0007\u0012\u0000\u0000\u0592\u00e7"+
		"\u0001\u0000\u0000\u0000\u0593\u0594\u0005E\u0000\u0000\u0594\u0595\u0005"+
		"\u008a\u0000\u0000\u0595\u0597\u0003\u00eau\u0000\u0596\u0598\u0005\u0089"+
		"\u0000\u0000\u0597\u0596\u0001\u0000\u0000\u0000\u0597\u0598\u0001\u0000"+
		"\u0000\u0000\u0598\u00e9\u0001\u0000\u0000\u0000\u0599\u059c\u0003\u00fa"+
		"}\u0000\u059a\u059c\u0003\u00f8|\u0000\u059b\u0599\u0001\u0000\u0000\u0000"+
		"\u059b\u059a\u0001\u0000\u0000\u0000\u059c\u00eb\u0001\u0000\u0000\u0000"+
		"\u059d\u059e\u0005T\u0000\u0000\u059e\u059f\u0005\u008a\u0000\u0000\u059f"+
		"\u05a1\u0003\u00f8|\u0000\u05a0\u05a2\u0005\u0089\u0000\u0000\u05a1\u05a0"+
		"\u0001\u0000\u0000\u0000\u05a1\u05a2\u0001\u0000\u0000\u0000\u05a2\u00ed"+
		"\u0001\u0000\u0000\u0000\u05a3\u05a4\u0005e\u0000\u0000\u05a4\u05a5\u0005"+
		"\u008a\u0000\u0000\u05a5\u05a7\u0003\u00f0x\u0000\u05a6\u05a8\u0005\u0089"+
		"\u0000\u0000\u05a7\u05a6\u0001\u0000\u0000\u0000\u05a7\u05a8\u0001\u0000"+
		"\u0000\u0000\u05a8\u00ef\u0001\u0000\u0000\u0000\u05a9\u05ac\u0003\u00f8"+
		"|\u0000\u05aa\u05ac\u0003\u00f2y\u0000\u05ab\u05a9\u0001\u0000\u0000\u0000"+
		"\u05ab\u05aa\u0001\u0000\u0000\u0000\u05ac\u00f1\u0001\u0000\u0000\u0000"+
		"\u05ad\u05ae\u0003\u00f4z\u0000\u05ae\u05af\u0003\u00f8|\u0000\u05af\u05b0"+
		"\u0003\u00c8d\u0000\u05b0\u00f3\u0001\u0000\u0000\u0000\u05b1\u05b2\u0007"+
		"\u0013\u0000\u0000\u05b2\u00f5\u0001\u0000\u0000\u0000\u05b3\u05b4\u0007"+
		"\u0014\u0000\u0000\u05b4\u00f7\u0001\u0000\u0000\u0000\u05b5\u05b6\u0007"+
		"\u0015\u0000\u0000\u05b6\u00f9\u0001\u0000\u0000\u0000\u05b7\u05b8\u0005"+
		"\u0083\u0000\u0000\u05b8\u00fb\u0001\u0000\u0000\u0000\u05b9\u05ba\u0005"+
		"\u0081\u0000\u0000\u05ba\u00fd\u0001\u0000\u0000\u0000\u05bb\u05bc\u0005"+
		"\u0084\u0000\u0000\u05bc\u00ff\u0001\u0000\u0000\u0000\u05bd\u05c0\u0003"+
		"\u0102\u0081\u0000\u05be\u05c0\u0003\u0104\u0082\u0000\u05bf\u05bd\u0001"+
		"\u0000\u0000\u0000\u05bf\u05be\u0001\u0000\u0000\u0000\u05c0\u0101\u0001"+
		"\u0000\u0000\u0000\u05c1\u05c2\u0005{\u0000\u0000\u05c2\u05c3\u0005\u0087"+
		"\u0000\u0000\u05c3\u05c4\u0005\u0083\u0000\u0000\u05c4\u05c5\u0005\u008b"+
		"\u0000\u0000\u05c5\u05c6\u0005\u0083\u0000\u0000\u05c6\u05c7\u0005\u008b"+
		"\u0000\u0000\u05c7\u05c8\u0005\u0083\u0000\u0000\u05c8\u05c9\u0005\u008b"+
		"\u0000\u0000\u05c9\u05ca\u0005\u0083\u0000\u0000\u05ca\u05cb\u0005\u0088"+
		"\u0000\u0000\u05cb\u0103\u0001\u0000\u0000\u0000\u05cc\u05cd\u0005|\u0000"+
		"\u0000\u05cd\u05ce\u0005\u0087\u0000\u0000\u05ce\u05cf\u0003\u0106\u0083"+
		"\u0000\u05cf\u05d0\u0005\u0088\u0000\u0000\u05d0\u0105\u0001\u0000\u0000"+
		"\u0000\u05d1\u05d9\u0003\u00f4z\u0000\u05d2\u05d9\u0003\u00f6{\u0000\u05d3"+
		"\u05d9\u0003\u00f8|\u0000\u05d4\u05d9\u0003\u00fa}\u0000\u05d5\u05d9\u0003"+
		"\u0100\u0080\u0000\u05d6\u05d9\u0003\u00fe\u007f\u0000\u05d7\u05d9\u0003"+
		"\u00fc~\u0000\u05d8\u05d1\u0001\u0000\u0000\u0000\u05d8\u05d2\u0001\u0000"+
		"\u0000\u0000\u05d8\u05d3\u0001\u0000\u0000\u0000\u05d8\u05d4\u0001\u0000"+
		"\u0000\u0000\u05d8\u05d5\u0001\u0000\u0000\u0000\u05d8\u05d6\u0001\u0000"+
		"\u0000\u0000\u05d8\u05d7\u0001\u0000\u0000\u0000\u05d9\u0107\u0001\u0000"+
		"\u0000\u0000\u009a\u010b\u0126\u0138\u013f\u0146\u014c\u0153\u015a\u0160"+
		"\u0167\u016e\u0174\u017b\u0182\u018e\u019a\u01a1\u01ad\u01b4\u01c0\u01c7"+
		"\u01cd\u01d4\u01db\u01e7\u01ee\u01fa\u0201\u020d\u0214\u0220\u0227\u0233"+
		"\u023d\u0247\u024e\u0254\u025b\u025f\u0266\u026d\u0273\u027b\u0284\u028d"+
		"\u0296\u02a3\u02ab\u02b3\u02b6\u02c0\u02c7\u02cf\u02d5\u02db\u02e0\u02eb"+
		"\u02ef\u02f4\u02f7\u0300\u0308\u030e\u0313\u0319\u0324\u0328\u032c\u032e"+
		"\u0333\u0336\u0344\u034c\u0350\u0352\u035c\u0360\u0362\u036f\u0374\u037c"+
		"\u0380\u038b\u0395\u0397\u039f\u03aa\u03b0\u03b4\u03c4\u03cd\u03de\u03e2"+
		"\u03ea\u03f0\u03f6\u0400\u0407\u0409\u0414\u0420\u042c\u0433\u043f\u0445"+
		"\u044b\u044e\u0455\u0463\u046e\u0477\u047d\u0486\u0492\u049e\u04a1\u04a7"+
		"\u04ba\u04c4\u04cc\u04d3\u04e4\u04f3\u04f7\u0506\u050c\u0516\u051a\u0520"+
		"\u0526\u052c\u0532\u053d\u0541\u0546\u0549\u054f\u0558\u055b\u0565\u056c"+
		"\u0572\u0578\u057d\u0586\u058a\u058f\u0597\u059b\u05a1\u05a7\u05ab\u05bf"+
		"\u05d8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}