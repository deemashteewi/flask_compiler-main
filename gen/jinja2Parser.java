// Generated from C:/Users/HP/IdeaProjects/antlr_course/grammars/jinja2Parser.g4 by ANTLR 4.13.2
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
		STMT_OPEN=1, EXPR_OPEN=2, COMMENT_OPEN=3, HTML_TEXT=4, STMT_CLOSE=5, FOR=6, 
		ENDFOR=7, IN=8, IF=9, ELIF=10, ELSE=11, ENDIF=12, BLOCK=13, ENDBLOCK=14, 
		EXTENDS=15, INCLUDE=16, SET=17, MACRO=18, ENDMACRO=19, DOT=20, COMMA=21, 
		COLON=22, LPAREN=23, RPAREN=24, LBRACK=25, RBRACK=26, EQ=27, NEQ=28, LT=29, 
		GT=30, LTE=31, GTE=32, ASSIGN=33, PIPE=34, AND=35, OR=36, NOT=37, STRING=38, 
		NUMBER=39, NAME=40, STMT_WS=41, EXPR_CLOSE=42, EXPR_WS=43, COMMENT_CLOSE=44, 
		COMMENT_TEXT=45;
	public static final int
		RULE_template = 0, RULE_templateContent = 1, RULE_htmlText = 2, RULE_expressionBlock = 3, 
		RULE_expression = 4, RULE_primary = 5, RULE_argList = 6, RULE_filter = 7, 
		RULE_forBlock = 8, RULE_forStart = 9, RULE_forEnd = 10, RULE_ifBlock = 11, 
		RULE_ifStart = 12, RULE_elifBranch = 13, RULE_elseBranch = 14, RULE_ifEnd = 15, 
		RULE_condition = 16, RULE_compOp = 17, RULE_extendsStatement = 18, RULE_includeStatement = 19, 
		RULE_blockDefinition = 20, RULE_setStatement = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"template", "templateContent", "htmlText", "expressionBlock", "expression", 
			"primary", "argList", "filter", "forBlock", "forStart", "forEnd", "ifBlock", 
			"ifStart", "elifBranch", "elseBranch", "ifEnd", "condition", "compOp", 
			"extendsStatement", "includeStatement", "blockDefinition", "setStatement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{%'", "'{{'", "'{#'", null, "'%}'", "'for'", "'endfor'", "'in'", 
			"'if'", "'elif'", "'else'", "'endif'", "'block'", "'endblock'", "'extends'", 
			"'include'", "'set'", "'macro'", "'endmacro'", null, null, "':'", null, 
			null, null, null, "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'='", 
			null, "'&&'", "'||'", "'!'", null, null, null, null, "'}}'", null, "'#}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "STMT_OPEN", "EXPR_OPEN", "COMMENT_OPEN", "HTML_TEXT", "STMT_CLOSE", 
			"FOR", "ENDFOR", "IN", "IF", "ELIF", "ELSE", "ENDIF", "BLOCK", "ENDBLOCK", 
			"EXTENDS", "INCLUDE", "SET", "MACRO", "ENDMACRO", "DOT", "COMMA", "COLON", 
			"LPAREN", "RPAREN", "LBRACK", "RBRACK", "EQ", "NEQ", "LT", "GT", "LTE", 
			"GTE", "ASSIGN", "PIPE", "AND", "OR", "NOT", "STRING", "NUMBER", "NAME", 
			"STMT_WS", "EXPR_CLOSE", "EXPR_WS", "COMMENT_CLOSE", "COMMENT_TEXT"
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
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 22L) != 0)) {
				{
				{
				setState(44);
				templateContent();
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
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
		public HtmlTextContext htmlText() {
			return getRuleContext(HtmlTextContext.class,0);
		}
		public ExpressionBlockContext expressionBlock() {
			return getRuleContext(ExpressionBlockContext.class,0);
		}
		public ForBlockContext forBlock() {
			return getRuleContext(ForBlockContext.class,0);
		}
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public ExtendsStatementContext extendsStatement() {
			return getRuleContext(ExtendsStatementContext.class,0);
		}
		public IncludeStatementContext includeStatement() {
			return getRuleContext(IncludeStatementContext.class,0);
		}
		public BlockDefinitionContext blockDefinition() {
			return getRuleContext(BlockDefinitionContext.class,0);
		}
		public SetStatementContext setStatement() {
			return getRuleContext(SetStatementContext.class,0);
		}
		public TemplateContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterTemplateContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitTemplateContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitTemplateContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateContentContext templateContent() throws RecognitionException {
		TemplateContentContext _localctx = new TemplateContentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_templateContent);
		try {
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				htmlText();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				expressionBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				forBlock();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(55);
				ifBlock();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(56);
				extendsStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(57);
				includeStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(58);
				blockDefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(59);
				setStatement();
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
	public static class HtmlTextContext extends ParserRuleContext {
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
		enterRule(_localctx, 4, RULE_htmlText);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(63); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(62);
					match(HTML_TEXT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(65); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
		public TerminalNode EXPR_OPEN() { return getToken(jinja2Parser.EXPR_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EXPR_CLOSE() { return getToken(jinja2Parser.EXPR_CLOSE, 0); }
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
		enterRule(_localctx, 6, RULE_expressionBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(EXPR_OPEN);
			setState(68);
			expression();
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PIPE) {
				{
				{
				setState(69);
				match(PIPE);
				setState(70);
				filter();
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
			match(EXPR_CLOSE);
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
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(jinja2Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(jinja2Parser.DOT, i);
		}
		public List<TerminalNode> NAME() { return getTokens(jinja2Parser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(jinja2Parser.NAME, i);
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
		enterRule(_localctx, 8, RULE_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			primary();
			setState(83);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(79);
					match(DOT);
					setState(80);
					match(NAME);
					}
					} 
				}
				setState(85);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(jinja2Parser.NAME, 0); }
		public TerminalNode STRING() { return getToken(jinja2Parser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(jinja2Parser.NUMBER, 0); }
		public TerminalNode LPAREN() { return getToken(jinja2Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(jinja2Parser.RPAREN, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_primary);
		int _la;
		try {
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				match(NAME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				match(NUMBER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
				match(NAME);
				setState(90);
				match(LPAREN);
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1924153737216L) != 0)) {
					{
					setState(91);
					argList();
					}
				}

				setState(94);
				match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(95);
				match(LPAREN);
				setState(96);
				expression();
				setState(97);
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
	public static class ArgListContext extends ParserRuleContext {
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
		enterRule(_localctx, 12, RULE_argList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			expression();
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(102);
				match(COMMA);
				setState(103);
				expression();
				}
				}
				setState(108);
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
	public static class FilterContext extends ParserRuleContext {
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
		enterRule(_localctx, 14, RULE_filter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(NAME);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(110);
				match(LPAREN);
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1924153737216L) != 0)) {
					{
					setState(111);
					argList();
					}
				}

				setState(114);
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
	public static class ForBlockContext extends ParserRuleContext {
		public ForStartContext forStart() {
			return getRuleContext(ForStartContext.class,0);
		}
		public ForEndContext forEnd() {
			return getRuleContext(ForEndContext.class,0);
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
		enterRule(_localctx, 16, RULE_forBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			forStart();
			setState(121);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(118);
					templateContent();
					}
					} 
				}
				setState(123);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(124);
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
		public Token target;
		public ExpressionContext iterable;
		public TerminalNode STMT_OPEN() { return getToken(jinja2Parser.STMT_OPEN, 0); }
		public TerminalNode FOR() { return getToken(jinja2Parser.FOR, 0); }
		public TerminalNode IN() { return getToken(jinja2Parser.IN, 0); }
		public TerminalNode STMT_CLOSE() { return getToken(jinja2Parser.STMT_CLOSE, 0); }
		public TerminalNode NAME() { return getToken(jinja2Parser.NAME, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		enterRule(_localctx, 18, RULE_forStart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(STMT_OPEN);
			setState(127);
			match(FOR);
			setState(128);
			((ForStartContext)_localctx).target = match(NAME);
			setState(129);
			match(IN);
			setState(130);
			((ForStartContext)_localctx).iterable = expression();
			setState(131);
			match(STMT_CLOSE);
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
		public TerminalNode STMT_OPEN() { return getToken(jinja2Parser.STMT_OPEN, 0); }
		public TerminalNode ENDFOR() { return getToken(jinja2Parser.ENDFOR, 0); }
		public TerminalNode STMT_CLOSE() { return getToken(jinja2Parser.STMT_CLOSE, 0); }
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
		enterRule(_localctx, 20, RULE_forEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(STMT_OPEN);
			setState(134);
			match(ENDFOR);
			setState(135);
			match(STMT_CLOSE);
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
		public IfStartContext ifStart() {
			return getRuleContext(IfStartContext.class,0);
		}
		public IfEndContext ifEnd() {
			return getRuleContext(IfEndContext.class,0);
		}
		public List<TemplateContentContext> templateContent() {
			return getRuleContexts(TemplateContentContext.class);
		}
		public TemplateContentContext templateContent(int i) {
			return getRuleContext(TemplateContentContext.class,i);
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
		enterRule(_localctx, 22, RULE_ifBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			ifStart();
			setState(141);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(138);
					templateContent();
					}
					} 
				}
				setState(143);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(147);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(144);
					elifBranch();
					}
					} 
				}
				setState(149);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(150);
				elseBranch();
				}
				break;
			}
			setState(153);
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
		public TerminalNode STMT_OPEN() { return getToken(jinja2Parser.STMT_OPEN, 0); }
		public TerminalNode IF() { return getToken(jinja2Parser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode STMT_CLOSE() { return getToken(jinja2Parser.STMT_CLOSE, 0); }
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
		enterRule(_localctx, 24, RULE_ifStart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(STMT_OPEN);
			setState(156);
			match(IF);
			setState(157);
			condition(0);
			setState(158);
			match(STMT_CLOSE);
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
		public TerminalNode STMT_OPEN() { return getToken(jinja2Parser.STMT_OPEN, 0); }
		public TerminalNode ELIF() { return getToken(jinja2Parser.ELIF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode STMT_CLOSE() { return getToken(jinja2Parser.STMT_CLOSE, 0); }
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
		enterRule(_localctx, 26, RULE_elifBranch);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(STMT_OPEN);
			setState(161);
			match(ELIF);
			setState(162);
			condition(0);
			setState(163);
			match(STMT_CLOSE);
			setState(167);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(164);
					templateContent();
					}
					} 
				}
				setState(169);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		public TerminalNode STMT_OPEN() { return getToken(jinja2Parser.STMT_OPEN, 0); }
		public TerminalNode ELSE() { return getToken(jinja2Parser.ELSE, 0); }
		public TerminalNode STMT_CLOSE() { return getToken(jinja2Parser.STMT_CLOSE, 0); }
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
		enterRule(_localctx, 28, RULE_elseBranch);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(STMT_OPEN);
			setState(171);
			match(ELSE);
			setState(172);
			match(STMT_CLOSE);
			setState(176);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(173);
					templateContent();
					}
					} 
				}
				setState(178);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		public TerminalNode STMT_OPEN() { return getToken(jinja2Parser.STMT_OPEN, 0); }
		public TerminalNode ENDIF() { return getToken(jinja2Parser.ENDIF, 0); }
		public TerminalNode STMT_CLOSE() { return getToken(jinja2Parser.STMT_CLOSE, 0); }
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
		enterRule(_localctx, 30, RULE_ifEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(STMT_OPEN);
			setState(180);
			match(ENDIF);
			setState(181);
			match(STMT_CLOSE);
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
	public static class ConditionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CompOpContext compOp() {
			return getRuleContext(CompOpContext.class,0);
		}
		public TerminalNode NOT() { return getToken(jinja2Parser.NOT, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode AND() { return getToken(jinja2Parser.AND, 0); }
		public TerminalNode OR() { return getToken(jinja2Parser.OR, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		return condition(0);
	}

	private ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
		ConditionContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_condition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
			case STRING:
			case NUMBER:
			case NAME:
				{
				setState(184);
				expression();
				setState(188);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(185);
					compOp();
					setState(186);
					expression();
					}
					break;
				}
				}
				break;
			case NOT:
				{
				setState(190);
				match(NOT);
				setState(191);
				condition(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(202);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(200);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(194);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(195);
						match(AND);
						setState(196);
						condition(4);
						}
						break;
					case 2:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(197);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(198);
						match(OR);
						setState(199);
						condition(3);
						}
						break;
					}
					} 
				}
				setState(204);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompOpContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(jinja2Parser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(jinja2Parser.NEQ, 0); }
		public TerminalNode LT() { return getToken(jinja2Parser.LT, 0); }
		public TerminalNode GT() { return getToken(jinja2Parser.GT, 0); }
		public TerminalNode LTE() { return getToken(jinja2Parser.LTE, 0); }
		public TerminalNode GTE() { return getToken(jinja2Parser.GTE, 0); }
		public CompOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).enterCompOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinja2ParserListener ) ((jinja2ParserListener)listener).exitCompOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinja2ParserVisitor ) return ((jinja2ParserVisitor<? extends T>)visitor).visitCompOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompOpContext compOp() throws RecognitionException {
		CompOpContext _localctx = new CompOpContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_compOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8455716864L) != 0)) ) {
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
		public TerminalNode STMT_OPEN() { return getToken(jinja2Parser.STMT_OPEN, 0); }
		public TerminalNode EXTENDS() { return getToken(jinja2Parser.EXTENDS, 0); }
		public TerminalNode STRING() { return getToken(jinja2Parser.STRING, 0); }
		public TerminalNode STMT_CLOSE() { return getToken(jinja2Parser.STMT_CLOSE, 0); }
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
		enterRule(_localctx, 36, RULE_extendsStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(STMT_OPEN);
			setState(208);
			match(EXTENDS);
			setState(209);
			match(STRING);
			setState(210);
			match(STMT_CLOSE);
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
		public TerminalNode STMT_OPEN() { return getToken(jinja2Parser.STMT_OPEN, 0); }
		public TerminalNode INCLUDE() { return getToken(jinja2Parser.INCLUDE, 0); }
		public TerminalNode STRING() { return getToken(jinja2Parser.STRING, 0); }
		public TerminalNode STMT_CLOSE() { return getToken(jinja2Parser.STMT_CLOSE, 0); }
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
		enterRule(_localctx, 38, RULE_includeStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(STMT_OPEN);
			setState(213);
			match(INCLUDE);
			setState(214);
			match(STRING);
			setState(215);
			match(STMT_CLOSE);
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
		public List<TerminalNode> STMT_OPEN() { return getTokens(jinja2Parser.STMT_OPEN); }
		public TerminalNode STMT_OPEN(int i) {
			return getToken(jinja2Parser.STMT_OPEN, i);
		}
		public TerminalNode BLOCK() { return getToken(jinja2Parser.BLOCK, 0); }
		public TerminalNode NAME() { return getToken(jinja2Parser.NAME, 0); }
		public List<TerminalNode> STMT_CLOSE() { return getTokens(jinja2Parser.STMT_CLOSE); }
		public TerminalNode STMT_CLOSE(int i) {
			return getToken(jinja2Parser.STMT_CLOSE, i);
		}
		public TerminalNode ENDBLOCK() { return getToken(jinja2Parser.ENDBLOCK, 0); }
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
		enterRule(_localctx, 40, RULE_blockDefinition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(STMT_OPEN);
			setState(218);
			match(BLOCK);
			setState(219);
			match(NAME);
			setState(220);
			match(STMT_CLOSE);
			setState(224);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(221);
					templateContent();
					}
					} 
				}
				setState(226);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(227);
			match(STMT_OPEN);
			setState(228);
			match(ENDBLOCK);
			setState(229);
			match(STMT_CLOSE);
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
		public TerminalNode STMT_OPEN() { return getToken(jinja2Parser.STMT_OPEN, 0); }
		public TerminalNode SET() { return getToken(jinja2Parser.SET, 0); }
		public TerminalNode NAME() { return getToken(jinja2Parser.NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(jinja2Parser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode STMT_CLOSE() { return getToken(jinja2Parser.STMT_CLOSE, 0); }
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
		enterRule(_localctx, 42, RULE_setStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(STMT_OPEN);
			setState(232);
			match(SET);
			setState(233);
			match(NAME);
			setState(234);
			match(ASSIGN);
			setState(235);
			expression();
			setState(236);
			match(STMT_CLOSE);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001-\u00ef\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0001\u0000\u0005\u0000.\b\u0000\n\u0000\f\u00001\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001=\b\u0001\u0001\u0002"+
		"\u0004\u0002@\b\u0002\u000b\u0002\f\u0002A\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003H\b\u0003\n\u0003\f\u0003K\t\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004R\b"+
		"\u0004\n\u0004\f\u0004U\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005]\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005d\b\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0005\u0006i\b\u0006\n\u0006\f\u0006l\t"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007q\b\u0007\u0001"+
		"\u0007\u0003\u0007t\b\u0007\u0001\b\u0001\b\u0005\bx\b\b\n\b\f\b{\t\b"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0005\u000b"+
		"\u008c\b\u000b\n\u000b\f\u000b\u008f\t\u000b\u0001\u000b\u0005\u000b\u0092"+
		"\b\u000b\n\u000b\f\u000b\u0095\t\u000b\u0001\u000b\u0003\u000b\u0098\b"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00a6\b\r\n\r\f\r\u00a9"+
		"\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00af"+
		"\b\u000e\n\u000e\f\u000e\u00b2\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u00bd\b\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00c1\b"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0005\u0010\u00c9\b\u0010\n\u0010\f\u0010\u00cc\t\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u00df\b\u0014"+
		"\n\u0014\f\u0014\u00e2\t\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0000\u0001 \u0016\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*\u0000"+
		"\u0001\u0001\u0000\u001b \u00f6\u0000/\u0001\u0000\u0000\u0000\u0002<"+
		"\u0001\u0000\u0000\u0000\u0004?\u0001\u0000\u0000\u0000\u0006C\u0001\u0000"+
		"\u0000\u0000\bN\u0001\u0000\u0000\u0000\nc\u0001\u0000\u0000\u0000\fe"+
		"\u0001\u0000\u0000\u0000\u000em\u0001\u0000\u0000\u0000\u0010u\u0001\u0000"+
		"\u0000\u0000\u0012~\u0001\u0000\u0000\u0000\u0014\u0085\u0001\u0000\u0000"+
		"\u0000\u0016\u0089\u0001\u0000\u0000\u0000\u0018\u009b\u0001\u0000\u0000"+
		"\u0000\u001a\u00a0\u0001\u0000\u0000\u0000\u001c\u00aa\u0001\u0000\u0000"+
		"\u0000\u001e\u00b3\u0001\u0000\u0000\u0000 \u00c0\u0001\u0000\u0000\u0000"+
		"\"\u00cd\u0001\u0000\u0000\u0000$\u00cf\u0001\u0000\u0000\u0000&\u00d4"+
		"\u0001\u0000\u0000\u0000(\u00d9\u0001\u0000\u0000\u0000*\u00e7\u0001\u0000"+
		"\u0000\u0000,.\u0003\u0002\u0001\u0000-,\u0001\u0000\u0000\u0000.1\u0001"+
		"\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u0000"+
		"02\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000023\u0005\u0000\u0000"+
		"\u00013\u0001\u0001\u0000\u0000\u00004=\u0003\u0004\u0002\u00005=\u0003"+
		"\u0006\u0003\u00006=\u0003\u0010\b\u00007=\u0003\u0016\u000b\u00008=\u0003"+
		"$\u0012\u00009=\u0003&\u0013\u0000:=\u0003(\u0014\u0000;=\u0003*\u0015"+
		"\u0000<4\u0001\u0000\u0000\u0000<5\u0001\u0000\u0000\u0000<6\u0001\u0000"+
		"\u0000\u0000<7\u0001\u0000\u0000\u0000<8\u0001\u0000\u0000\u0000<9\u0001"+
		"\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000<;\u0001\u0000\u0000\u0000"+
		"=\u0003\u0001\u0000\u0000\u0000>@\u0005\u0004\u0000\u0000?>\u0001\u0000"+
		"\u0000\u0000@A\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000AB\u0001"+
		"\u0000\u0000\u0000B\u0005\u0001\u0000\u0000\u0000CD\u0005\u0002\u0000"+
		"\u0000DI\u0003\b\u0004\u0000EF\u0005\"\u0000\u0000FH\u0003\u000e\u0007"+
		"\u0000GE\u0001\u0000\u0000\u0000HK\u0001\u0000\u0000\u0000IG\u0001\u0000"+
		"\u0000\u0000IJ\u0001\u0000\u0000\u0000JL\u0001\u0000\u0000\u0000KI\u0001"+
		"\u0000\u0000\u0000LM\u0005*\u0000\u0000M\u0007\u0001\u0000\u0000\u0000"+
		"NS\u0003\n\u0005\u0000OP\u0005\u0014\u0000\u0000PR\u0005(\u0000\u0000"+
		"QO\u0001\u0000\u0000\u0000RU\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000"+
		"\u0000ST\u0001\u0000\u0000\u0000T\t\u0001\u0000\u0000\u0000US\u0001\u0000"+
		"\u0000\u0000Vd\u0005(\u0000\u0000Wd\u0005&\u0000\u0000Xd\u0005\'\u0000"+
		"\u0000YZ\u0005(\u0000\u0000Z\\\u0005\u0017\u0000\u0000[]\u0003\f\u0006"+
		"\u0000\\[\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]^\u0001\u0000"+
		"\u0000\u0000^d\u0005\u0018\u0000\u0000_`\u0005\u0017\u0000\u0000`a\u0003"+
		"\b\u0004\u0000ab\u0005\u0018\u0000\u0000bd\u0001\u0000\u0000\u0000cV\u0001"+
		"\u0000\u0000\u0000cW\u0001\u0000\u0000\u0000cX\u0001\u0000\u0000\u0000"+
		"cY\u0001\u0000\u0000\u0000c_\u0001\u0000\u0000\u0000d\u000b\u0001\u0000"+
		"\u0000\u0000ej\u0003\b\u0004\u0000fg\u0005\u0015\u0000\u0000gi\u0003\b"+
		"\u0004\u0000hf\u0001\u0000\u0000\u0000il\u0001\u0000\u0000\u0000jh\u0001"+
		"\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000k\r\u0001\u0000\u0000\u0000"+
		"lj\u0001\u0000\u0000\u0000ms\u0005(\u0000\u0000np\u0005\u0017\u0000\u0000"+
		"oq\u0003\f\u0006\u0000po\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000"+
		"qr\u0001\u0000\u0000\u0000rt\u0005\u0018\u0000\u0000sn\u0001\u0000\u0000"+
		"\u0000st\u0001\u0000\u0000\u0000t\u000f\u0001\u0000\u0000\u0000uy\u0003"+
		"\u0012\t\u0000vx\u0003\u0002\u0001\u0000wv\u0001\u0000\u0000\u0000x{\u0001"+
		"\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000"+
		"z|\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000|}\u0003\u0014\n\u0000"+
		"}\u0011\u0001\u0000\u0000\u0000~\u007f\u0005\u0001\u0000\u0000\u007f\u0080"+
		"\u0005\u0006\u0000\u0000\u0080\u0081\u0005(\u0000\u0000\u0081\u0082\u0005"+
		"\b\u0000\u0000\u0082\u0083\u0003\b\u0004\u0000\u0083\u0084\u0005\u0005"+
		"\u0000\u0000\u0084\u0013\u0001\u0000\u0000\u0000\u0085\u0086\u0005\u0001"+
		"\u0000\u0000\u0086\u0087\u0005\u0007\u0000\u0000\u0087\u0088\u0005\u0005"+
		"\u0000\u0000\u0088\u0015\u0001\u0000\u0000\u0000\u0089\u008d\u0003\u0018"+
		"\f\u0000\u008a\u008c\u0003\u0002\u0001\u0000\u008b\u008a\u0001\u0000\u0000"+
		"\u0000\u008c\u008f\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000"+
		"\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u0093\u0001\u0000\u0000"+
		"\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u0090\u0092\u0003\u001a\r\u0000"+
		"\u0091\u0090\u0001\u0000\u0000\u0000\u0092\u0095\u0001\u0000\u0000\u0000"+
		"\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000"+
		"\u0094\u0097\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000"+
		"\u0096\u0098\u0003\u001c\u000e\u0000\u0097\u0096\u0001\u0000\u0000\u0000"+
		"\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000"+
		"\u0099\u009a\u0003\u001e\u000f\u0000\u009a\u0017\u0001\u0000\u0000\u0000"+
		"\u009b\u009c\u0005\u0001\u0000\u0000\u009c\u009d\u0005\t\u0000\u0000\u009d"+
		"\u009e\u0003 \u0010\u0000\u009e\u009f\u0005\u0005\u0000\u0000\u009f\u0019"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005\u0001\u0000\u0000\u00a1\u00a2"+
		"\u0005\n\u0000\u0000\u00a2\u00a3\u0003 \u0010\u0000\u00a3\u00a7\u0005"+
		"\u0005\u0000\u0000\u00a4\u00a6\u0003\u0002\u0001\u0000\u00a5\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a9\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u001b\u0001"+
		"\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005"+
		"\u0001\u0000\u0000\u00ab\u00ac\u0005\u000b\u0000\u0000\u00ac\u00b0\u0005"+
		"\u0005\u0000\u0000\u00ad\u00af\u0003\u0002\u0001\u0000\u00ae\u00ad\u0001"+
		"\u0000\u0000\u0000\u00af\u00b2\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u001d\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005"+
		"\u0001\u0000\u0000\u00b4\u00b5\u0005\f\u0000\u0000\u00b5\u00b6\u0005\u0005"+
		"\u0000\u0000\u00b6\u001f\u0001\u0000\u0000\u0000\u00b7\u00b8\u0006\u0010"+
		"\uffff\uffff\u0000\u00b8\u00bc\u0003\b\u0004\u0000\u00b9\u00ba\u0003\""+
		"\u0011\u0000\u00ba\u00bb\u0003\b\u0004\u0000\u00bb\u00bd\u0001\u0000\u0000"+
		"\u0000\u00bc\u00b9\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000"+
		"\u0000\u00bd\u00c1\u0001\u0000\u0000\u0000\u00be\u00bf\u0005%\u0000\u0000"+
		"\u00bf\u00c1\u0003 \u0010\u0001\u00c0\u00b7\u0001\u0000\u0000\u0000\u00c0"+
		"\u00be\u0001\u0000\u0000\u0000\u00c1\u00ca\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c3\n\u0003\u0000\u0000\u00c3\u00c4\u0005#\u0000\u0000\u00c4\u00c9"+
		"\u0003 \u0010\u0004\u00c5\u00c6\n\u0002\u0000\u0000\u00c6\u00c7\u0005"+
		"$\u0000\u0000\u00c7\u00c9\u0003 \u0010\u0003\u00c8\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c5\u0001\u0000\u0000\u0000\u00c9\u00cc\u0001\u0000\u0000"+
		"\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000"+
		"\u0000\u00cb!\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000"+
		"\u00cd\u00ce\u0007\u0000\u0000\u0000\u00ce#\u0001\u0000\u0000\u0000\u00cf"+
		"\u00d0\u0005\u0001\u0000\u0000\u00d0\u00d1\u0005\u000f\u0000\u0000\u00d1"+
		"\u00d2\u0005&\u0000\u0000\u00d2\u00d3\u0005\u0005\u0000\u0000\u00d3%\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d5\u0005\u0001\u0000\u0000\u00d5\u00d6\u0005"+
		"\u0010\u0000\u0000\u00d6\u00d7\u0005&\u0000\u0000\u00d7\u00d8\u0005\u0005"+
		"\u0000\u0000\u00d8\'\u0001\u0000\u0000\u0000\u00d9\u00da\u0005\u0001\u0000"+
		"\u0000\u00da\u00db\u0005\r\u0000\u0000\u00db\u00dc\u0005(\u0000\u0000"+
		"\u00dc\u00e0\u0005\u0005\u0000\u0000\u00dd\u00df\u0003\u0002\u0001\u0000"+
		"\u00de\u00dd\u0001\u0000\u0000\u0000\u00df\u00e2\u0001\u0000\u0000\u0000"+
		"\u00e0\u00de\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000"+
		"\u00e1\u00e3\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000"+
		"\u00e3\u00e4\u0005\u0001\u0000\u0000\u00e4\u00e5\u0005\u000e\u0000\u0000"+
		"\u00e5\u00e6\u0005\u0005\u0000\u0000\u00e6)\u0001\u0000\u0000\u0000\u00e7"+
		"\u00e8\u0005\u0001\u0000\u0000\u00e8\u00e9\u0005\u0011\u0000\u0000\u00e9"+
		"\u00ea\u0005(\u0000\u0000\u00ea\u00eb\u0005!\u0000\u0000\u00eb\u00ec\u0003"+
		"\b\u0004\u0000\u00ec\u00ed\u0005\u0005\u0000\u0000\u00ed+\u0001\u0000"+
		"\u0000\u0000\u0015/<AIS\\cjpsy\u008d\u0093\u0097\u00a7\u00b0\u00bc\u00c0"+
		"\u00c8\u00ca\u00e0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}