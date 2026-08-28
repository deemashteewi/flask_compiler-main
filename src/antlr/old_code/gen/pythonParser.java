// Generated from C:/Users/HP/IdeaProjects/antlr_course/grammars/pythonParser.g4 by ANTLR 4.13.2

   package antlr.old_code.gen;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class pythonParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, NUM=2, DOUBLE=3, POW=4, STAR=5, DIV=6, PLUS=7, SUB=8, EQ=9, 
		NEQ=10, LT=11, GT=12, LTE=13, GTE=14, AND=15, OR=16, NOT=17, IF=18, ELIF=19, 
		ELSE=20, PRINT=21, RETURN=22, TRUE=23, FALSE=24, FOR=25, IN=26, WHILE=27, 
		BREAK=28, CONTINUE=29, NONE=30, ASSIGN=31, COLON=32, LPAREN=33, RPAREN=34, 
		COMMA=35, LBRACK=36, RBRACK=37, LBRACE=38, RBRACE=39, DOT=40, AT=41, CLASS=42, 
		DEF=43, STRING=44, FROM=45, IMPORT=46, NAME=47, NL=48, WS=49, INDENT=50, 
		DEDENT=51;
	public static final int
		RULE_root = 0, RULE_statement = 1, RULE_returnStatement = 2, RULE_importHeader = 3, 
		RULE_importedClasses = 4, RULE_assignment = 5, RULE_printAction = 6, RULE_block = 7, 
		RULE_ifStatement = 8, RULE_forStatement = 9, RULE_whileStatement = 10, 
		RULE_breakStatement = 11, RULE_continueStatement = 12, RULE_condition = 13, 
		RULE_comparisonOp = 14, RULE_decorator = 15, RULE_classDefinition = 16, 
		RULE_functionDef = 17, RULE_params = 18, RULE_regularParams = 19, RULE_starParam = 20, 
		RULE_kwOnlyParams = 21, RULE_kwargsParam = 22, RULE_kwParam = 23, RULE_list = 24, 
		RULE_dict = 25, RULE_dictEntry = 26, RULE_listComprehension = 27, RULE_argument = 28, 
		RULE_expr = 29, RULE_additiveExpr = 30, RULE_multiplicativeExpr = 31, 
		RULE_powerExpr = 32, RULE_postfixExpr = 33, RULE_primaryExpr = 34;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "statement", "returnStatement", "importHeader", "importedClasses", 
			"assignment", "printAction", "block", "ifStatement", "forStatement", 
			"whileStatement", "breakStatement", "continueStatement", "condition", 
			"comparisonOp", "decorator", "classDefinition", "functionDef", "params", 
			"regularParams", "starParam", "kwOnlyParams", "kwargsParam", "kwParam", 
			"list", "dict", "dictEntry", "listComprehension", "argument", "expr", 
			"additiveExpr", "multiplicativeExpr", "powerExpr", "postfixExpr", "primaryExpr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'**'", "'*'", "'/'", "'+'", "'-'", "'=='", "'!='", 
			"'<'", "'>'", "'<='", "'>='", "'and'", "'or'", "'not'", "'if'", "'elif'", 
			"'else'", "'print'", "'return'", "'True'", "'False'", "'for'", "'in'", 
			"'while'", "'break'", "'continue'", "'None'", "'='", "':'", "'('", "')'", 
			"','", "'['", "']'", "'{'", "'}'", "'.'", "'@'", "'class'", "'def'", 
			null, "'from'", "'import'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT", "NUM", "DOUBLE", "POW", "STAR", "DIV", "PLUS", "SUB", 
			"EQ", "NEQ", "LT", "GT", "LTE", "GTE", "AND", "OR", "NOT", "IF", "ELIF", 
			"ELSE", "PRINT", "RETURN", "TRUE", "FALSE", "FOR", "IN", "WHILE", "BREAK", 
			"CONTINUE", "NONE", "ASSIGN", "COLON", "LPAREN", "RPAREN", "COMMA", "LBRACK", 
			"RBRACK", "LBRACE", "RBRACE", "DOT", "AT", "CLASS", "DEF", "STRING", 
			"FROM", "IMPORT", "NAME", "NL", "WS", "INDENT", "DEDENT"
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
	public String getGrammarFileName() { return "pythonParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public pythonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RootContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(pythonParser.EOF, 0); }
		public List<TerminalNode> NL() { return getTokens(pythonParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(pythonParser.NL, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(70);
				match(NL);
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 209261475135500L) != 0)) {
				{
				{
				setState(76);
				statement();
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(77);
					match(NL);
					}
					}
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88);
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
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ContinueStmtContext extends StatementContext {
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public ContinueStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterContinueStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitContinueStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitContinueStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStmtContext extends StatementContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public IfStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassDefStatementContext extends StatementContext {
		public ClassDefinitionContext classDefinition() {
			return getRuleContext(ClassDefinitionContext.class,0);
		}
		public ClassDefStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterClassDefStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitClassDefStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitClassDefStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileStmtContext extends StatementContext {
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public WhileStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BreakStmtContext extends StatementContext {
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public BreakStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterBreakStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitBreakStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitBreakStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDefStatementContext extends StatementContext {
		public FunctionDefContext functionDef() {
			return getRuleContext(FunctionDefContext.class,0);
		}
		public FunctionDefStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterFunctionDefStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitFunctionDefStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitFunctionDefStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintStatementContext extends StatementContext {
		public PrintActionContext printAction() {
			return getRuleContext(PrintActionContext.class,0);
		}
		public PrintStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprStatementContext extends StatementContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterExprStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitExprStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitExprStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportStatementContext extends StatementContext {
		public ImportHeaderContext importHeader() {
			return getRuleContext(ImportHeaderContext.class,0);
		}
		public ImportStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignStatementContext extends StatementContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterAssignStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitAssignStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitAssignStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStmtContext extends StatementContext {
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ReturnStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitReturnStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForStmtContext extends StatementContext {
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public ForStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitForStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitForStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new ImportStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				importHeader();
				}
				break;
			case 2:
				_localctx = new AssignStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				assignment();
				}
				break;
			case 3:
				_localctx = new PrintStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				printAction();
				}
				break;
			case 4:
				_localctx = new ReturnStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(93);
				returnStatement();
				}
				break;
			case 5:
				_localctx = new IfStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(94);
				ifStatement();
				}
				break;
			case 6:
				_localctx = new ForStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(95);
				forStatement();
				}
				break;
			case 7:
				_localctx = new WhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(96);
				whileStatement();
				}
				break;
			case 8:
				_localctx = new BreakStmtContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(97);
				breakStatement();
				}
				break;
			case 9:
				_localctx = new ContinueStmtContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(98);
				continueStatement();
				}
				break;
			case 10:
				_localctx = new ClassDefStatementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(99);
				classDefinition();
				}
				break;
			case 11:
				_localctx = new FunctionDefStatementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(100);
				functionDef();
				}
				break;
			case 12:
				_localctx = new ExprStatementContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(101);
				expr();
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
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(pythonParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(RETURN);
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(105);
				expr();
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
	public static class ImportHeaderContext extends ParserRuleContext {
		public Token module;
		public TerminalNode FROM() { return getToken(pythonParser.FROM, 0); }
		public TerminalNode IMPORT() { return getToken(pythonParser.IMPORT, 0); }
		public List<ImportedClassesContext> importedClasses() {
			return getRuleContexts(ImportedClassesContext.class);
		}
		public ImportedClassesContext importedClasses(int i) {
			return getRuleContext(ImportedClassesContext.class,i);
		}
		public TerminalNode NAME() { return getToken(pythonParser.NAME, 0); }
		public List<TerminalNode> COMMA() { return getTokens(pythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pythonParser.COMMA, i);
		}
		public ImportHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterImportHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitImportHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitImportHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportHeaderContext importHeader() throws RecognitionException {
		ImportHeaderContext _localctx = new ImportHeaderContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(FROM);
			setState(109);
			((ImportHeaderContext)_localctx).module = match(NAME);
			setState(110);
			match(IMPORT);
			setState(111);
			importedClasses();
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(112);
				match(COMMA);
				setState(113);
				importedClasses();
				}
				}
				setState(118);
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
	public static class ImportedClassesContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(pythonParser.NAME, 0); }
		public ImportedClassesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importedClasses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterImportedClasses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitImportedClasses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitImportedClasses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportedClassesContext importedClasses() throws RecognitionException {
		ImportedClassesContext _localctx = new ImportedClassesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_importedClasses);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
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
	public static class AssignmentContext extends ParserRuleContext {
		public ExprContext target;
		public ExprContext value;
		public TerminalNode ASSIGN() { return getToken(pythonParser.ASSIGN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			((AssignmentContext)_localctx).target = expr();
			setState(122);
			match(ASSIGN);
			setState(123);
			((AssignmentContext)_localctx).value = expr();
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
	public static class PrintActionContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(pythonParser.PRINT, 0); }
		public TerminalNode LPAREN() { return getToken(pythonParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(pythonParser.RPAREN, 0); }
		public PrintActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterPrintAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitPrintAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitPrintAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintActionContext printAction() throws RecognitionException {
		PrintActionContext _localctx = new PrintActionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_printAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(PRINT);
			setState(126);
			match(LPAREN);
			setState(127);
			expr();
			setState(128);
			match(RPAREN);
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
	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(pythonParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(pythonParser.NL, i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(130);
				statement();
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(131);
					match(NL);
					}
					}
					setState(136);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(139); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 209261475135500L) != 0) );
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
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(pythonParser.IF, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(pythonParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(pythonParser.COLON, i);
		}
		public List<TerminalNode> INDENT() { return getTokens(pythonParser.INDENT); }
		public TerminalNode INDENT(int i) {
			return getToken(pythonParser.INDENT, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> DEDENT() { return getTokens(pythonParser.DEDENT); }
		public TerminalNode DEDENT(int i) {
			return getToken(pythonParser.DEDENT, i);
		}
		public List<TerminalNode> ELIF() { return getTokens(pythonParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(pythonParser.ELIF, i);
		}
		public TerminalNode ELSE() { return getToken(pythonParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(IF);
			setState(142);
			condition(0);
			setState(143);
			match(COLON);
			setState(144);
			match(INDENT);
			setState(145);
			block();
			setState(146);
			match(DEDENT);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(147);
				match(ELIF);
				setState(148);
				condition(0);
				setState(149);
				match(COLON);
				setState(150);
				match(INDENT);
				setState(151);
				block();
				setState(152);
				match(DEDENT);
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(159);
				match(ELSE);
				setState(160);
				match(COLON);
				setState(161);
				match(INDENT);
				setState(162);
				block();
				setState(163);
				match(DEDENT);
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
	public static class ForStatementContext extends ParserRuleContext {
		public Token target;
		public ExprContext iterable;
		public TerminalNode FOR() { return getToken(pythonParser.FOR, 0); }
		public TerminalNode IN() { return getToken(pythonParser.IN, 0); }
		public TerminalNode COLON() { return getToken(pythonParser.COLON, 0); }
		public TerminalNode INDENT() { return getToken(pythonParser.INDENT, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(pythonParser.DEDENT, 0); }
		public TerminalNode NAME() { return getToken(pythonParser.NAME, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(FOR);
			setState(168);
			((ForStatementContext)_localctx).target = match(NAME);
			setState(169);
			match(IN);
			setState(170);
			((ForStatementContext)_localctx).iterable = expr();
			setState(171);
			match(COLON);
			setState(172);
			match(INDENT);
			setState(173);
			block();
			setState(174);
			match(DEDENT);
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
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(pythonParser.WHILE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(pythonParser.COLON, 0); }
		public TerminalNode INDENT() { return getToken(pythonParser.INDENT, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(pythonParser.DEDENT, 0); }
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(WHILE);
			setState(177);
			condition(0);
			setState(178);
			match(COLON);
			setState(179);
			match(INDENT);
			setState(180);
			block();
			setState(181);
			match(DEDENT);
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
	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(pythonParser.BREAK, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(BREAK);
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
	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(pythonParser.CONTINUE, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitContinueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(CONTINUE);
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
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotConditionContext extends ConditionContext {
		public TerminalNode NOT() { return getToken(pythonParser.NOT, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public NotConditionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterNotCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitNotCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitNotCondition(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenConditionContext extends ConditionContext {
		public TerminalNode LPAREN() { return getToken(pythonParser.LPAREN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(pythonParser.RPAREN, 0); }
		public ParenConditionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterParenCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitParenCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitParenCondition(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FalseConditionContext extends ConditionContext {
		public TerminalNode FALSE() { return getToken(pythonParser.FALSE, 0); }
		public FalseConditionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterFalseCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitFalseCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitFalseCondition(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompareConditionContext extends ConditionContext {
		public ExprContext left;
		public ComparisonOpContext op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ComparisonOpContext comparisonOp() {
			return getRuleContext(ComparisonOpContext.class,0);
		}
		public CompareConditionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterCompareCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitCompareCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitCompareCondition(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TrueConditionContext extends ConditionContext {
		public TerminalNode TRUE() { return getToken(pythonParser.TRUE, 0); }
		public TrueConditionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterTrueCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitTrueCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitTrueCondition(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrConditionContext extends ConditionContext {
		public ConditionContext left;
		public Token op;
		public ConditionContext right;
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode OR() { return getToken(pythonParser.OR, 0); }
		public OrConditionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterOrCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitOrCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitOrCondition(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndConditionContext extends ConditionContext {
		public ConditionContext left;
		public Token op;
		public ConditionContext right;
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode AND() { return getToken(pythonParser.AND, 0); }
		public AndConditionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterAndCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitAndCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitAndCondition(this);
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_condition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				_localctx = new NotConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(188);
				match(NOT);
				setState(189);
				condition(5);
				}
				break;
			case 2:
				{
				_localctx = new ParenConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(190);
				match(LPAREN);
				setState(191);
				condition(0);
				setState(192);
				match(RPAREN);
				}
				break;
			case 3:
				{
				_localctx = new CompareConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(194);
				((CompareConditionContext)_localctx).left = expr();
				setState(195);
				((CompareConditionContext)_localctx).op = comparisonOp();
				setState(196);
				((CompareConditionContext)_localctx).right = expr();
				}
				break;
			case 4:
				{
				_localctx = new TrueConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(198);
				match(TRUE);
				}
				break;
			case 5:
				{
				_localctx = new FalseConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(199);
				match(FALSE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(210);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(208);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new AndConditionContext(new ConditionContext(_parentctx, _parentState));
						((AndConditionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(202);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(203);
						((AndConditionContext)_localctx).op = match(AND);
						setState(204);
						((AndConditionContext)_localctx).right = condition(8);
						}
						break;
					case 2:
						{
						_localctx = new OrConditionContext(new ConditionContext(_parentctx, _parentState));
						((OrConditionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(205);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(206);
						((OrConditionContext)_localctx).op = match(OR);
						setState(207);
						((OrConditionContext)_localctx).right = condition(7);
						}
						break;
					}
					} 
				}
				setState(212);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
	public static class ComparisonOpContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(pythonParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(pythonParser.NEQ, 0); }
		public TerminalNode LT() { return getToken(pythonParser.LT, 0); }
		public TerminalNode GT() { return getToken(pythonParser.GT, 0); }
		public TerminalNode LTE() { return getToken(pythonParser.LTE, 0); }
		public TerminalNode GTE() { return getToken(pythonParser.GTE, 0); }
		public ComparisonOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterComparisonOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitComparisonOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitComparisonOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOpContext comparisonOp() throws RecognitionException {
		ComparisonOpContext _localctx = new ComparisonOpContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_comparisonOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 32256L) != 0)) ) {
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
	public static class DecoratorContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(pythonParser.AT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NL() { return getToken(pythonParser.NL, 0); }
		public DecoratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decorator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterDecorator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitDecorator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitDecorator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoratorContext decorator() throws RecognitionException {
		DecoratorContext _localctx = new DecoratorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_decorator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(AT);
			setState(216);
			expr();
			setState(217);
			match(NL);
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
	public static class ClassDefinitionContext extends ParserRuleContext {
		public Token name;
		public TerminalNode CLASS() { return getToken(pythonParser.CLASS, 0); }
		public TerminalNode COLON() { return getToken(pythonParser.COLON, 0); }
		public TerminalNode INDENT() { return getToken(pythonParser.INDENT, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(pythonParser.DEDENT, 0); }
		public TerminalNode NAME() { return getToken(pythonParser.NAME, 0); }
		public List<DecoratorContext> decorator() {
			return getRuleContexts(DecoratorContext.class);
		}
		public DecoratorContext decorator(int i) {
			return getRuleContext(DecoratorContext.class,i);
		}
		public ClassDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterClassDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitClassDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitClassDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDefinitionContext classDefinition() throws RecognitionException {
		ClassDefinitionContext _localctx = new ClassDefinitionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_classDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(219);
				decorator();
				}
				}
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(225);
			match(CLASS);
			setState(226);
			((ClassDefinitionContext)_localctx).name = match(NAME);
			setState(227);
			match(COLON);
			setState(228);
			match(INDENT);
			setState(229);
			block();
			setState(230);
			match(DEDENT);
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
	public static class FunctionDefContext extends ParserRuleContext {
		public ParamsContext parameters;
		public TerminalNode DEF() { return getToken(pythonParser.DEF, 0); }
		public TerminalNode NAME() { return getToken(pythonParser.NAME, 0); }
		public TerminalNode LPAREN() { return getToken(pythonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(pythonParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(pythonParser.COLON, 0); }
		public TerminalNode INDENT() { return getToken(pythonParser.INDENT, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(pythonParser.DEDENT, 0); }
		public List<DecoratorContext> decorator() {
			return getRuleContexts(DecoratorContext.class);
		}
		public DecoratorContext decorator(int i) {
			return getRuleContext(DecoratorContext.class,i);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public FunctionDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterFunctionDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitFunctionDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitFunctionDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefContext functionDef() throws RecognitionException {
		FunctionDefContext _localctx = new FunctionDefContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_functionDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(232);
				decorator();
				}
				}
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(238);
			match(DEF);
			setState(239);
			match(NAME);
			setState(240);
			match(LPAREN);
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(241);
				((FunctionDefContext)_localctx).parameters = params();
				}
			}

			setState(244);
			match(RPAREN);
			setState(245);
			match(COLON);
			setState(246);
			match(INDENT);
			setState(247);
			block();
			setState(248);
			match(DEDENT);
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
	public static class ParamsContext extends ParserRuleContext {
		public RegularParamsContext regularParams() {
			return getRuleContext(RegularParamsContext.class,0);
		}
		public StarParamContext starParam() {
			return getRuleContext(StarParamContext.class,0);
		}
		public KwOnlyParamsContext kwOnlyParams() {
			return getRuleContext(KwOnlyParamsContext.class,0);
		}
		public KwargsParamContext kwargsParam() {
			return getRuleContext(KwargsParamContext.class,0);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			regularParams();
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(251);
				starParam();
				}
				break;
			}
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(254);
				kwOnlyParams();
				}
				break;
			}
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(257);
				kwargsParam();
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
	public static class RegularParamsContext extends ParserRuleContext {
		public List<KwParamContext> kwParam() {
			return getRuleContexts(KwParamContext.class);
		}
		public KwParamContext kwParam(int i) {
			return getRuleContext(KwParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(pythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pythonParser.COMMA, i);
		}
		public RegularParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regularParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterRegularParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitRegularParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitRegularParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegularParamsContext regularParams() throws RecognitionException {
		RegularParamsContext _localctx = new RegularParamsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_regularParams);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			kwParam();
			setState(265);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(261);
					match(COMMA);
					setState(262);
					kwParam();
					}
					} 
				}
				setState(267);
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
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StarParamContext extends ParserRuleContext {
		public Token starArgs;
		public TerminalNode COMMA() { return getToken(pythonParser.COMMA, 0); }
		public TerminalNode STAR() { return getToken(pythonParser.STAR, 0); }
		public TerminalNode NAME() { return getToken(pythonParser.NAME, 0); }
		public StarParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_starParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterStarParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitStarParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitStarParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StarParamContext starParam() throws RecognitionException {
		StarParamContext _localctx = new StarParamContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_starParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(COMMA);
			setState(269);
			match(STAR);
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(270);
				((StarParamContext)_localctx).starArgs = match(NAME);
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
	public static class KwOnlyParamsContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(pythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pythonParser.COMMA, i);
		}
		public List<KwParamContext> kwParam() {
			return getRuleContexts(KwParamContext.class);
		}
		public KwParamContext kwParam(int i) {
			return getRuleContext(KwParamContext.class,i);
		}
		public KwOnlyParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwOnlyParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterKwOnlyParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitKwOnlyParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitKwOnlyParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KwOnlyParamsContext kwOnlyParams() throws RecognitionException {
		KwOnlyParamsContext _localctx = new KwOnlyParamsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_kwOnlyParams);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(275); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(273);
					match(COMMA);
					setState(274);
					kwParam();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(277); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
	public static class KwargsParamContext extends ParserRuleContext {
		public Token kwargs;
		public TerminalNode COMMA() { return getToken(pythonParser.COMMA, 0); }
		public TerminalNode POW() { return getToken(pythonParser.POW, 0); }
		public TerminalNode NAME() { return getToken(pythonParser.NAME, 0); }
		public KwargsParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwargsParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterKwargsParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitKwargsParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitKwargsParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KwargsParamContext kwargsParam() throws RecognitionException {
		KwargsParamContext _localctx = new KwargsParamContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_kwargsParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(COMMA);
			setState(280);
			match(POW);
			setState(281);
			((KwargsParamContext)_localctx).kwargs = match(NAME);
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
	public static class KwParamContext extends ParserRuleContext {
		public Token name;
		public ExprContext defaultVal;
		public TerminalNode NAME() { return getToken(pythonParser.NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(pythonParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public KwParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterKwParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitKwParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitKwParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KwParamContext kwParam() throws RecognitionException {
		KwParamContext _localctx = new KwParamContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_kwParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			((KwParamContext)_localctx).name = match(NAME);
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(284);
				match(ASSIGN);
				setState(285);
				((KwParamContext)_localctx).defaultVal = expr();
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
	public static class ListContext extends ParserRuleContext {
		public Token lbrack;
		public Token trcomma;
		public Token rbrack;
		public TerminalNode LBRACK() { return getToken(pythonParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(pythonParser.RBRACK, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(pythonParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(pythonParser.NL, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(pythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pythonParser.COMMA, i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			((ListContext)_localctx).lbrack = match(LBRACK);
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 440157937336332L) != 0)) {
				{
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(289);
					match(NL);
					}
					}
					setState(294);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(295);
				expr();
				setState(312);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(299);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(296);
							match(NL);
							}
							}
							setState(301);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(302);
						match(COMMA);
						setState(306);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(303);
							match(NL);
							}
							}
							setState(308);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(309);
						expr();
						}
						} 
					}
					setState(314);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				}
				setState(318);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(315);
						match(NL);
						}
						} 
					}
					setState(320);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				}
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(321);
					((ListContext)_localctx).trcomma = match(COMMA);
					}
				}

				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(324);
					match(NL);
					}
					}
					setState(329);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(332);
			((ListContext)_localctx).rbrack = match(RBRACK);
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
		public TerminalNode LBRACE() { return getToken(pythonParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(pythonParser.RBRACE, 0); }
		public List<DictEntryContext> dictEntry() {
			return getRuleContexts(DictEntryContext.class);
		}
		public DictEntryContext dictEntry(int i) {
			return getRuleContext(DictEntryContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(pythonParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(pythonParser.NL, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(pythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pythonParser.COMMA, i);
		}
		public DictContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dict; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterDict(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitDict(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitDict(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictContext dict() throws RecognitionException {
		DictContext _localctx = new DictContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_dict);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(LBRACE);
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 440157937336332L) != 0)) {
				{
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(335);
					match(NL);
					}
					}
					setState(340);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(341);
				dictEntry();
				setState(358);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(345);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(342);
							match(NL);
							}
							}
							setState(347);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(348);
						match(COMMA);
						setState(352);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(349);
							match(NL);
							}
							}
							setState(354);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(355);
						dictEntry();
						}
						} 
					}
					setState(360);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				setState(364);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(361);
						match(NL);
						}
						} 
					}
					setState(366);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				}
				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(367);
					match(COMMA);
					}
				}

				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(370);
					match(NL);
					}
					}
					setState(375);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(378);
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
		public ExprContext key;
		public ExprContext value;
		public TerminalNode COLON() { return getToken(pythonParser.COLON, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public DictEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictEntry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterDictEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitDictEntry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitDictEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictEntryContext dictEntry() throws RecognitionException {
		DictEntryContext _localctx = new DictEntryContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_dictEntry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			((DictEntryContext)_localctx).key = expr();
			setState(381);
			match(COLON);
			setState(382);
			((DictEntryContext)_localctx).value = expr();
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
	public static class ListComprehensionContext extends ParserRuleContext {
		public ExprContext element;
		public Token target;
		public ExprContext iterable;
		public ConditionContext filterCondition;
		public TerminalNode LBRACK() { return getToken(pythonParser.LBRACK, 0); }
		public TerminalNode FOR() { return getToken(pythonParser.FOR, 0); }
		public TerminalNode IN() { return getToken(pythonParser.IN, 0); }
		public TerminalNode RBRACK() { return getToken(pythonParser.RBRACK, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode NAME() { return getToken(pythonParser.NAME, 0); }
		public TerminalNode IF() { return getToken(pythonParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ListComprehensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listComprehension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterListComprehension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitListComprehension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitListComprehension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListComprehensionContext listComprehension() throws RecognitionException {
		ListComprehensionContext _localctx = new ListComprehensionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_listComprehension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(LBRACK);
			setState(385);
			((ListComprehensionContext)_localctx).element = expr();
			setState(386);
			match(FOR);
			setState(387);
			((ListComprehensionContext)_localctx).target = match(NAME);
			setState(388);
			match(IN);
			setState(389);
			((ListComprehensionContext)_localctx).iterable = expr();
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(390);
				match(IF);
				setState(391);
				((ListComprehensionContext)_localctx).filterCondition = condition(0);
				}
			}

			setState(394);
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
	public static class ArgumentContext extends ParserRuleContext {
		public Token name;
		public ExprContext value;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(pythonParser.ASSIGN, 0); }
		public TerminalNode NAME() { return getToken(pythonParser.NAME, 0); }
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(396);
				((ArgumentContext)_localctx).name = match(NAME);
				setState(397);
				match(ASSIGN);
				}
				break;
			}
			setState(400);
			((ArgumentContext)_localctx).value = expr();
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
	public static class ExprContext extends ParserRuleContext {
		public AdditiveExprContext additiveExpr() {
			return getRuleContext(AdditiveExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			additiveExpr(0);
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
		public AdditiveExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpr; }
	 
		public AdditiveExprContext() { }
		public void copyFrom(AdditiveExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AdditivePassThroughContext extends AdditiveExprContext {
		public MultiplicativeExprContext multiplicativeExpr() {
			return getRuleContext(MultiplicativeExprContext.class,0);
		}
		public AdditivePassThroughContext(AdditiveExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterAdditivePassThrough(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitAdditivePassThrough(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitAdditivePassThrough(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SUM_SUB_OPContext extends AdditiveExprContext {
		public AdditiveExprContext left;
		public Token op;
		public MultiplicativeExprContext right;
		public AdditiveExprContext additiveExpr() {
			return getRuleContext(AdditiveExprContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(pythonParser.PLUS, 0); }
		public MultiplicativeExprContext multiplicativeExpr() {
			return getRuleContext(MultiplicativeExprContext.class,0);
		}
		public TerminalNode SUB() { return getToken(pythonParser.SUB, 0); }
		public SUM_SUB_OPContext(AdditiveExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterSUM_SUB_OP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitSUM_SUB_OP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitSUM_SUB_OP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExprContext additiveExpr() throws RecognitionException {
		return additiveExpr(0);
	}

	private AdditiveExprContext additiveExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExprContext _localctx = new AdditiveExprContext(_ctx, _parentState);
		AdditiveExprContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_additiveExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AdditivePassThroughContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(405);
			multiplicativeExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(415);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(413);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
					case 1:
						{
						_localctx = new SUM_SUB_OPContext(new AdditiveExprContext(_parentctx, _parentState));
						((SUM_SUB_OPContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpr);
						setState(407);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(408);
						((SUM_SUB_OPContext)_localctx).op = match(PLUS);
						setState(409);
						((SUM_SUB_OPContext)_localctx).right = multiplicativeExpr(0);
						}
						break;
					case 2:
						{
						_localctx = new SUM_SUB_OPContext(new AdditiveExprContext(_parentctx, _parentState));
						((SUM_SUB_OPContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpr);
						setState(410);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(411);
						((SUM_SUB_OPContext)_localctx).op = match(SUB);
						setState(412);
						((SUM_SUB_OPContext)_localctx).right = multiplicativeExpr(0);
						}
						break;
					}
					} 
				}
				setState(417);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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
	public static class MultiplicativeExprContext extends ParserRuleContext {
		public MultiplicativeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpr; }
	 
		public MultiplicativeExprContext() { }
		public void copyFrom(MultiplicativeExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MUL_DIV_OPContext extends MultiplicativeExprContext {
		public MultiplicativeExprContext left;
		public Token op;
		public PowerExprContext right;
		public MultiplicativeExprContext multiplicativeExpr() {
			return getRuleContext(MultiplicativeExprContext.class,0);
		}
		public TerminalNode STAR() { return getToken(pythonParser.STAR, 0); }
		public PowerExprContext powerExpr() {
			return getRuleContext(PowerExprContext.class,0);
		}
		public TerminalNode DIV() { return getToken(pythonParser.DIV, 0); }
		public MUL_DIV_OPContext(MultiplicativeExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterMUL_DIV_OP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitMUL_DIV_OP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitMUL_DIV_OP(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativePassThroughContext extends MultiplicativeExprContext {
		public PowerExprContext powerExpr() {
			return getRuleContext(PowerExprContext.class,0);
		}
		public MultiplicativePassThroughContext(MultiplicativeExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterMultiplicativePassThrough(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitMultiplicativePassThrough(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitMultiplicativePassThrough(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExprContext multiplicativeExpr() throws RecognitionException {
		return multiplicativeExpr(0);
	}

	private MultiplicativeExprContext multiplicativeExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeExprContext _localctx = new MultiplicativeExprContext(_ctx, _parentState);
		MultiplicativeExprContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_multiplicativeExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new MultiplicativePassThroughContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(419);
			powerExpr();
			}
			_ctx.stop = _input.LT(-1);
			setState(429);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(427);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
					case 1:
						{
						_localctx = new MUL_DIV_OPContext(new MultiplicativeExprContext(_parentctx, _parentState));
						((MUL_DIV_OPContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpr);
						setState(421);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(422);
						((MUL_DIV_OPContext)_localctx).op = match(STAR);
						setState(423);
						((MUL_DIV_OPContext)_localctx).right = powerExpr();
						}
						break;
					case 2:
						{
						_localctx = new MUL_DIV_OPContext(new MultiplicativeExprContext(_parentctx, _parentState));
						((MUL_DIV_OPContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpr);
						setState(424);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(425);
						((MUL_DIV_OPContext)_localctx).op = match(DIV);
						setState(426);
						((MUL_DIV_OPContext)_localctx).right = powerExpr();
						}
						break;
					}
					} 
				}
				setState(431);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
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
	public static class PowerExprContext extends ParserRuleContext {
		public PowerExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_powerExpr; }
	 
		public PowerExprContext() { }
		public void copyFrom(PowerExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PowerPassThroughContext extends PowerExprContext {
		public PostfixExprContext postfixExpr() {
			return getRuleContext(PostfixExprContext.class,0);
		}
		public PowerPassThroughContext(PowerExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterPowerPassThrough(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitPowerPassThrough(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitPowerPassThrough(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EXPONENT_OPContext extends PowerExprContext {
		public PostfixExprContext base;
		public Token op;
		public PowerExprContext exp;
		public PostfixExprContext postfixExpr() {
			return getRuleContext(PostfixExprContext.class,0);
		}
		public TerminalNode POW() { return getToken(pythonParser.POW, 0); }
		public PowerExprContext powerExpr() {
			return getRuleContext(PowerExprContext.class,0);
		}
		public EXPONENT_OPContext(PowerExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterEXPONENT_OP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitEXPONENT_OP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitEXPONENT_OP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PowerExprContext powerExpr() throws RecognitionException {
		PowerExprContext _localctx = new PowerExprContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_powerExpr);
		try {
			setState(437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				_localctx = new EXPONENT_OPContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(432);
				((EXPONENT_OPContext)_localctx).base = postfixExpr(0);
				setState(433);
				((EXPONENT_OPContext)_localctx).op = match(POW);
				setState(434);
				((EXPONENT_OPContext)_localctx).exp = powerExpr();
				}
				break;
			case 2:
				_localctx = new PowerPassThroughContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(436);
				postfixExpr(0);
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
	public static class PostfixExprContext extends ParserRuleContext {
		public PostfixExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpr; }
	 
		public PostfixExprContext() { }
		public void copyFrom(PostfixExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CallExprContext extends PostfixExprContext {
		public PostfixExprContext callee;
		public TerminalNode LPAREN() { return getToken(pythonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(pythonParser.RPAREN, 0); }
		public PostfixExprContext postfixExpr() {
			return getRuleContext(PostfixExprContext.class,0);
		}
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(pythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pythonParser.COMMA, i);
		}
		public CallExprContext(PostfixExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitCallExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DotAccessExprContext extends PostfixExprContext {
		public PostfixExprContext object;
		public Token property;
		public TerminalNode DOT() { return getToken(pythonParser.DOT, 0); }
		public PostfixExprContext postfixExpr() {
			return getRuleContext(PostfixExprContext.class,0);
		}
		public TerminalNode NAME() { return getToken(pythonParser.NAME, 0); }
		public DotAccessExprContext(PostfixExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterDotAccessExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitDotAccessExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitDotAccessExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class INDEX_ACCESSContext extends PostfixExprContext {
		public PostfixExprContext container;
		public ExprContext key;
		public TerminalNode LBRACK() { return getToken(pythonParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(pythonParser.RBRACK, 0); }
		public PostfixExprContext postfixExpr() {
			return getRuleContext(PostfixExprContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public INDEX_ACCESSContext(PostfixExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterINDEX_ACCESS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitINDEX_ACCESS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitINDEX_ACCESS(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PostfixPassThroughContext extends PostfixExprContext {
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public PostfixPassThroughContext(PostfixExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterPostfixPassThrough(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitPostfixPassThrough(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitPostfixPassThrough(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixExprContext postfixExpr() throws RecognitionException {
		return postfixExpr(0);
	}

	private PostfixExprContext postfixExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PostfixExprContext _localctx = new PostfixExprContext(_ctx, _parentState);
		PostfixExprContext _prevctx = _localctx;
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_postfixExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PostfixPassThroughContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(440);
			primaryExpr();
			}
			_ctx.stop = _input.LT(-1);
			setState(465);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(463);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
					case 1:
						{
						_localctx = new CallExprContext(new PostfixExprContext(_parentctx, _parentState));
						((CallExprContext)_localctx).callee = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpr);
						setState(442);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(443);
						match(LPAREN);
						setState(452);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 158682960625676L) != 0)) {
							{
							setState(444);
							argument();
							setState(449);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==COMMA) {
								{
								{
								setState(445);
								match(COMMA);
								setState(446);
								argument();
								}
								}
								setState(451);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(454);
						match(RPAREN);
						}
						break;
					case 2:
						{
						_localctx = new DotAccessExprContext(new PostfixExprContext(_parentctx, _parentState));
						((DotAccessExprContext)_localctx).object = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpr);
						setState(455);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(456);
						match(DOT);
						setState(457);
						((DotAccessExprContext)_localctx).property = match(NAME);
						}
						break;
					case 3:
						{
						_localctx = new INDEX_ACCESSContext(new PostfixExprContext(_parentctx, _parentState));
						((INDEX_ACCESSContext)_localctx).container = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpr);
						setState(458);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(459);
						match(LBRACK);
						setState(460);
						((INDEX_ACCESSContext)_localctx).key = expr();
						setState(461);
						match(RBRACK);
						}
						break;
					}
					} 
				}
				setState(467);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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
	public static class TrueLiteralContext extends PrimaryExprContext {
		public TerminalNode TRUE() { return getToken(pythonParser.TRUE, 0); }
		public TrueLiteralContext(PrimaryExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterTrueLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitTrueLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitTrueLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VARContext extends PrimaryExprContext {
		public TerminalNode NAME() { return getToken(pythonParser.NAME, 0); }
		public VARContext(PrimaryExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterVAR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitVAR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitVAR(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NUMContext extends PrimaryExprContext {
		public Token int_;
		public Token double_;
		public TerminalNode NUM() { return getToken(pythonParser.NUM, 0); }
		public TerminalNode DOUBLE() { return getToken(pythonParser.DOUBLE, 0); }
		public NUMContext(PrimaryExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterNUM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitNUM(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitNUM(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DICTIONARYContext extends PrimaryExprContext {
		public DictContext dict() {
			return getRuleContext(DictContext.class,0);
		}
		public DICTIONARYContext(PrimaryExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterDICTIONARY(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitDICTIONARY(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitDICTIONARY(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class STRING_LITERALContext extends PrimaryExprContext {
		public TerminalNode STRING() { return getToken(pythonParser.STRING, 0); }
		public STRING_LITERALContext(PrimaryExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterSTRING_LITERAL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitSTRING_LITERAL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitSTRING_LITERAL(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NoneLiteralContext extends PrimaryExprContext {
		public TerminalNode NONE() { return getToken(pythonParser.NONE, 0); }
		public NoneLiteralContext(PrimaryExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterNoneLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitNoneLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitNoneLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListCompExprContext extends PrimaryExprContext {
		public ListComprehensionContext listComprehension() {
			return getRuleContext(ListComprehensionContext.class,0);
		}
		public ListCompExprContext(PrimaryExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterListCompExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitListCompExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitListCompExpr(this);
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
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterListExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitListExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitListExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenExprContext extends PrimaryExprContext {
		public TerminalNode LPAREN() { return getToken(pythonParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(pythonParser.RPAREN, 0); }
		public ParenExprContext(PrimaryExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitParenExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FalseLiteralContext extends PrimaryExprContext {
		public TerminalNode FALSE() { return getToken(pythonParser.FALSE, 0); }
		public FalseLiteralContext(PrimaryExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterFalseLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitFalseLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitFalseLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExprContext primaryExpr() throws RecognitionException {
		PrimaryExprContext _localctx = new PrimaryExprContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_primaryExpr);
		try {
			setState(484);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				_localctx = new NUMContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(470);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUM:
					{
					setState(468);
					((NUMContext)_localctx).int_ = match(NUM);
					}
					break;
				case DOUBLE:
					{
					setState(469);
					((NUMContext)_localctx).double_ = match(DOUBLE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				_localctx = new STRING_LITERALContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(472);
				match(STRING);
				}
				break;
			case 3:
				_localctx = new TrueLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(473);
				match(TRUE);
				}
				break;
			case 4:
				_localctx = new FalseLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(474);
				match(FALSE);
				}
				break;
			case 5:
				_localctx = new NoneLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(475);
				match(NONE);
				}
				break;
			case 6:
				_localctx = new VARContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(476);
				match(NAME);
				}
				break;
			case 7:
				_localctx = new ListExprContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(477);
				list();
				}
				break;
			case 8:
				_localctx = new DICTIONARYContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(478);
				dict();
				}
				break;
			case 9:
				_localctx = new ListCompExprContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(479);
				listComprehension();
				}
				break;
			case 10:
				_localctx = new ParenExprContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(480);
				match(LPAREN);
				setState(481);
				expr();
				setState(482);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		case 30:
			return additiveExpr_sempred((AdditiveExprContext)_localctx, predIndex);
		case 31:
			return multiplicativeExpr_sempred((MultiplicativeExprContext)_localctx, predIndex);
		case 33:
			return postfixExpr_sempred((PostfixExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean additiveExpr_sempred(AdditiveExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean multiplicativeExpr_sempred(MultiplicativeExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean postfixExpr_sempred(PostfixExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 4);
		case 7:
			return precpred(_ctx, 3);
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00013\u01e7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0001"+
		"\u0000\u0005\u0000H\b\u0000\n\u0000\f\u0000K\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0005\u0000O\b\u0000\n\u0000\f\u0000R\t\u0000\u0005\u0000T\b\u0000"+
		"\n\u0000\f\u0000W\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001g\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0003\u0002k\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003s\b\u0003"+
		"\n\u0003\f\u0003v\t\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0005\u0007\u0085\b\u0007\n\u0007"+
		"\f\u0007\u0088\t\u0007\u0004\u0007\u008a\b\u0007\u000b\u0007\f\u0007\u008b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u009b\b\b\n\b\f\b\u009e\t\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00a6\b\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00c9\b\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00d1\b\r\n\r\f\r\u00d4"+
		"\t\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0005\u0010\u00dd\b\u0010\n\u0010\f\u0010\u00e0\t\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0005\u0011\u00ea\b\u0011\n\u0011\f\u0011\u00ed"+
		"\t\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00f3"+
		"\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0003\u0012\u00fd\b\u0012\u0001\u0012\u0003"+
		"\u0012\u0100\b\u0012\u0001\u0012\u0003\u0012\u0103\b\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0005\u0013\u0108\b\u0013\n\u0013\f\u0013\u010b"+
		"\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0110\b\u0014"+
		"\u0001\u0015\u0001\u0015\u0004\u0015\u0114\b\u0015\u000b\u0015\f\u0015"+
		"\u0115\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0003\u0017\u011f\b\u0017\u0001\u0018\u0001\u0018\u0005"+
		"\u0018\u0123\b\u0018\n\u0018\f\u0018\u0126\t\u0018\u0001\u0018\u0001\u0018"+
		"\u0005\u0018\u012a\b\u0018\n\u0018\f\u0018\u012d\t\u0018\u0001\u0018\u0001"+
		"\u0018\u0005\u0018\u0131\b\u0018\n\u0018\f\u0018\u0134\t\u0018\u0001\u0018"+
		"\u0005\u0018\u0137\b\u0018\n\u0018\f\u0018\u013a\t\u0018\u0001\u0018\u0005"+
		"\u0018\u013d\b\u0018\n\u0018\f\u0018\u0140\t\u0018\u0001\u0018\u0003\u0018"+
		"\u0143\b\u0018\u0001\u0018\u0005\u0018\u0146\b\u0018\n\u0018\f\u0018\u0149"+
		"\t\u0018\u0003\u0018\u014b\b\u0018\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0005\u0019\u0151\b\u0019\n\u0019\f\u0019\u0154\t\u0019\u0001"+
		"\u0019\u0001\u0019\u0005\u0019\u0158\b\u0019\n\u0019\f\u0019\u015b\t\u0019"+
		"\u0001\u0019\u0001\u0019\u0005\u0019\u015f\b\u0019\n\u0019\f\u0019\u0162"+
		"\t\u0019\u0001\u0019\u0005\u0019\u0165\b\u0019\n\u0019\f\u0019\u0168\t"+
		"\u0019\u0001\u0019\u0005\u0019\u016b\b\u0019\n\u0019\f\u0019\u016e\t\u0019"+
		"\u0001\u0019\u0003\u0019\u0171\b\u0019\u0001\u0019\u0005\u0019\u0174\b"+
		"\u0019\n\u0019\f\u0019\u0177\t\u0019\u0003\u0019\u0179\b\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0003\u001b\u0189\b\u001b\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0003\u001c\u018f\b\u001c\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u019e\b\u001e"+
		"\n\u001e\f\u001e\u01a1\t\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0005"+
		"\u001f\u01ac\b\u001f\n\u001f\f\u001f\u01af\t\u001f\u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0003 \u01b6\b \u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0005!\u01c0\b!\n!\f!\u01c3\t!\u0003!\u01c5\b!\u0001!"+
		"\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0005!\u01d0"+
		"\b!\n!\f!\u01d3\t!\u0001\"\u0001\"\u0003\"\u01d7\b\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0003\"\u01e5\b\"\u0001\"\u0000\u0004\u001a<>B#\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>@BD\u0000\u0001\u0001\u0000\t\u000e\u020d\u0000I\u0001\u0000\u0000"+
		"\u0000\u0002f\u0001\u0000\u0000\u0000\u0004h\u0001\u0000\u0000\u0000\u0006"+
		"l\u0001\u0000\u0000\u0000\bw\u0001\u0000\u0000\u0000\ny\u0001\u0000\u0000"+
		"\u0000\f}\u0001\u0000\u0000\u0000\u000e\u0089\u0001\u0000\u0000\u0000"+
		"\u0010\u008d\u0001\u0000\u0000\u0000\u0012\u00a7\u0001\u0000\u0000\u0000"+
		"\u0014\u00b0\u0001\u0000\u0000\u0000\u0016\u00b7\u0001\u0000\u0000\u0000"+
		"\u0018\u00b9\u0001\u0000\u0000\u0000\u001a\u00c8\u0001\u0000\u0000\u0000"+
		"\u001c\u00d5\u0001\u0000\u0000\u0000\u001e\u00d7\u0001\u0000\u0000\u0000"+
		" \u00de\u0001\u0000\u0000\u0000\"\u00eb\u0001\u0000\u0000\u0000$\u00fa"+
		"\u0001\u0000\u0000\u0000&\u0104\u0001\u0000\u0000\u0000(\u010c\u0001\u0000"+
		"\u0000\u0000*\u0113\u0001\u0000\u0000\u0000,\u0117\u0001\u0000\u0000\u0000"+
		".\u011b\u0001\u0000\u0000\u00000\u0120\u0001\u0000\u0000\u00002\u014e"+
		"\u0001\u0000\u0000\u00004\u017c\u0001\u0000\u0000\u00006\u0180\u0001\u0000"+
		"\u0000\u00008\u018e\u0001\u0000\u0000\u0000:\u0192\u0001\u0000\u0000\u0000"+
		"<\u0194\u0001\u0000\u0000\u0000>\u01a2\u0001\u0000\u0000\u0000@\u01b5"+
		"\u0001\u0000\u0000\u0000B\u01b7\u0001\u0000\u0000\u0000D\u01e4\u0001\u0000"+
		"\u0000\u0000FH\u00050\u0000\u0000GF\u0001\u0000\u0000\u0000HK\u0001\u0000"+
		"\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JU\u0001"+
		"\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000LP\u0003\u0002\u0001\u0000"+
		"MO\u00050\u0000\u0000NM\u0001\u0000\u0000\u0000OR\u0001\u0000\u0000\u0000"+
		"PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QT\u0001\u0000\u0000"+
		"\u0000RP\u0001\u0000\u0000\u0000SL\u0001\u0000\u0000\u0000TW\u0001\u0000"+
		"\u0000\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VX\u0001"+
		"\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000XY\u0005\u0000\u0000\u0001"+
		"Y\u0001\u0001\u0000\u0000\u0000Zg\u0003\u0006\u0003\u0000[g\u0003\n\u0005"+
		"\u0000\\g\u0003\f\u0006\u0000]g\u0003\u0004\u0002\u0000^g\u0003\u0010"+
		"\b\u0000_g\u0003\u0012\t\u0000`g\u0003\u0014\n\u0000ag\u0003\u0016\u000b"+
		"\u0000bg\u0003\u0018\f\u0000cg\u0003 \u0010\u0000dg\u0003\"\u0011\u0000"+
		"eg\u0003:\u001d\u0000fZ\u0001\u0000\u0000\u0000f[\u0001\u0000\u0000\u0000"+
		"f\\\u0001\u0000\u0000\u0000f]\u0001\u0000\u0000\u0000f^\u0001\u0000\u0000"+
		"\u0000f_\u0001\u0000\u0000\u0000f`\u0001\u0000\u0000\u0000fa\u0001\u0000"+
		"\u0000\u0000fb\u0001\u0000\u0000\u0000fc\u0001\u0000\u0000\u0000fd\u0001"+
		"\u0000\u0000\u0000fe\u0001\u0000\u0000\u0000g\u0003\u0001\u0000\u0000"+
		"\u0000hj\u0005\u0016\u0000\u0000ik\u0003:\u001d\u0000ji\u0001\u0000\u0000"+
		"\u0000jk\u0001\u0000\u0000\u0000k\u0005\u0001\u0000\u0000\u0000lm\u0005"+
		"-\u0000\u0000mn\u0005/\u0000\u0000no\u0005.\u0000\u0000ot\u0003\b\u0004"+
		"\u0000pq\u0005#\u0000\u0000qs\u0003\b\u0004\u0000rp\u0001\u0000\u0000"+
		"\u0000sv\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000tu\u0001\u0000"+
		"\u0000\u0000u\u0007\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000"+
		"wx\u0005/\u0000\u0000x\t\u0001\u0000\u0000\u0000yz\u0003:\u001d\u0000"+
		"z{\u0005\u001f\u0000\u0000{|\u0003:\u001d\u0000|\u000b\u0001\u0000\u0000"+
		"\u0000}~\u0005\u0015\u0000\u0000~\u007f\u0005!\u0000\u0000\u007f\u0080"+
		"\u0003:\u001d\u0000\u0080\u0081\u0005\"\u0000\u0000\u0081\r\u0001\u0000"+
		"\u0000\u0000\u0082\u0086\u0003\u0002\u0001\u0000\u0083\u0085\u00050\u0000"+
		"\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0085\u0088\u0001\u0000\u0000"+
		"\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000"+
		"\u0000\u0087\u008a\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000"+
		"\u0000\u0089\u0082\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000"+
		"\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000"+
		"\u0000\u008c\u000f\u0001\u0000\u0000\u0000\u008d\u008e\u0005\u0012\u0000"+
		"\u0000\u008e\u008f\u0003\u001a\r\u0000\u008f\u0090\u0005 \u0000\u0000"+
		"\u0090\u0091\u00052\u0000\u0000\u0091\u0092\u0003\u000e\u0007\u0000\u0092"+
		"\u009c\u00053\u0000\u0000\u0093\u0094\u0005\u0013\u0000\u0000\u0094\u0095"+
		"\u0003\u001a\r\u0000\u0095\u0096\u0005 \u0000\u0000\u0096\u0097\u0005"+
		"2\u0000\u0000\u0097\u0098\u0003\u000e\u0007\u0000\u0098\u0099\u00053\u0000"+
		"\u0000\u0099\u009b\u0001\u0000\u0000\u0000\u009a\u0093\u0001\u0000\u0000"+
		"\u0000\u009b\u009e\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000"+
		"\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u00a5\u0001\u0000\u0000"+
		"\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\u0014\u0000"+
		"\u0000\u00a0\u00a1\u0005 \u0000\u0000\u00a1\u00a2\u00052\u0000\u0000\u00a2"+
		"\u00a3\u0003\u000e\u0007\u0000\u00a3\u00a4\u00053\u0000\u0000\u00a4\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a5\u009f\u0001\u0000\u0000\u0000\u00a5\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a6\u0011\u0001\u0000\u0000\u0000\u00a7\u00a8"+
		"\u0005\u0019\u0000\u0000\u00a8\u00a9\u0005/\u0000\u0000\u00a9\u00aa\u0005"+
		"\u001a\u0000\u0000\u00aa\u00ab\u0003:\u001d\u0000\u00ab\u00ac\u0005 \u0000"+
		"\u0000\u00ac\u00ad\u00052\u0000\u0000\u00ad\u00ae\u0003\u000e\u0007\u0000"+
		"\u00ae\u00af\u00053\u0000\u0000\u00af\u0013\u0001\u0000\u0000\u0000\u00b0"+
		"\u00b1\u0005\u001b\u0000\u0000\u00b1\u00b2\u0003\u001a\r\u0000\u00b2\u00b3"+
		"\u0005 \u0000\u0000\u00b3\u00b4\u00052\u0000\u0000\u00b4\u00b5\u0003\u000e"+
		"\u0007\u0000\u00b5\u00b6\u00053\u0000\u0000\u00b6\u0015\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b8\u0005\u001c\u0000\u0000\u00b8\u0017\u0001\u0000\u0000"+
		"\u0000\u00b9\u00ba\u0005\u001d\u0000\u0000\u00ba\u0019\u0001\u0000\u0000"+
		"\u0000\u00bb\u00bc\u0006\r\uffff\uffff\u0000\u00bc\u00bd\u0005\u0011\u0000"+
		"\u0000\u00bd\u00c9\u0003\u001a\r\u0005\u00be\u00bf\u0005!\u0000\u0000"+
		"\u00bf\u00c0\u0003\u001a\r\u0000\u00c0\u00c1\u0005\"\u0000\u0000\u00c1"+
		"\u00c9\u0001\u0000\u0000\u0000\u00c2\u00c3\u0003:\u001d\u0000\u00c3\u00c4"+
		"\u0003\u001c\u000e\u0000\u00c4\u00c5\u0003:\u001d\u0000\u00c5\u00c9\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c9\u0005\u0017\u0000\u0000\u00c7\u00c9\u0005"+
		"\u0018\u0000\u0000\u00c8\u00bb\u0001\u0000\u0000\u0000\u00c8\u00be\u0001"+
		"\u0000\u0000\u0000\u00c8\u00c2\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001"+
		"\u0000\u0000\u0000\u00c8\u00c7\u0001\u0000\u0000\u0000\u00c9\u00d2\u0001"+
		"\u0000\u0000\u0000\u00ca\u00cb\n\u0007\u0000\u0000\u00cb\u00cc\u0005\u000f"+
		"\u0000\u0000\u00cc\u00d1\u0003\u001a\r\b\u00cd\u00ce\n\u0006\u0000\u0000"+
		"\u00ce\u00cf\u0005\u0010\u0000\u0000\u00cf\u00d1\u0003\u001a\r\u0007\u00d0"+
		"\u00ca\u0001\u0000\u0000\u0000\u00d0\u00cd\u0001\u0000\u0000\u0000\u00d1"+
		"\u00d4\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2"+
		"\u00d3\u0001\u0000\u0000\u0000\u00d3\u001b\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d2\u0001\u0000\u0000\u0000\u00d5\u00d6\u0007\u0000\u0000\u0000\u00d6"+
		"\u001d\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005)\u0000\u0000\u00d8\u00d9"+
		"\u0003:\u001d\u0000\u00d9\u00da\u00050\u0000\u0000\u00da\u001f\u0001\u0000"+
		"\u0000\u0000\u00db\u00dd\u0003\u001e\u000f\u0000\u00dc\u00db\u0001\u0000"+
		"\u0000\u0000\u00dd\u00e0\u0001\u0000\u0000\u0000\u00de\u00dc\u0001\u0000"+
		"\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e1\u0001\u0000"+
		"\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005*\u0000"+
		"\u0000\u00e2\u00e3\u0005/\u0000\u0000\u00e3\u00e4\u0005 \u0000\u0000\u00e4"+
		"\u00e5\u00052\u0000\u0000\u00e5\u00e6\u0003\u000e\u0007\u0000\u00e6\u00e7"+
		"\u00053\u0000\u0000\u00e7!\u0001\u0000\u0000\u0000\u00e8\u00ea\u0003\u001e"+
		"\u000f\u0000\u00e9\u00e8\u0001\u0000\u0000\u0000\u00ea\u00ed\u0001\u0000"+
		"\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000"+
		"\u0000\u0000\u00ec\u00ee\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000"+
		"\u0000\u0000\u00ee\u00ef\u0005+\u0000\u0000\u00ef\u00f0\u0005/\u0000\u0000"+
		"\u00f0\u00f2\u0005!\u0000\u0000\u00f1\u00f3\u0003$\u0012\u0000\u00f2\u00f1"+
		"\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\u00f4"+
		"\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005\"\u0000\u0000\u00f5\u00f6\u0005"+
		" \u0000\u0000\u00f6\u00f7\u00052\u0000\u0000\u00f7\u00f8\u0003\u000e\u0007"+
		"\u0000\u00f8\u00f9\u00053\u0000\u0000\u00f9#\u0001\u0000\u0000\u0000\u00fa"+
		"\u00fc\u0003&\u0013\u0000\u00fb\u00fd\u0003(\u0014\u0000\u00fc\u00fb\u0001"+
		"\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd\u00ff\u0001"+
		"\u0000\u0000\u0000\u00fe\u0100\u0003*\u0015\u0000\u00ff\u00fe\u0001\u0000"+
		"\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u0102\u0001\u0000"+
		"\u0000\u0000\u0101\u0103\u0003,\u0016\u0000\u0102\u0101\u0001\u0000\u0000"+
		"\u0000\u0102\u0103\u0001\u0000\u0000\u0000\u0103%\u0001\u0000\u0000\u0000"+
		"\u0104\u0109\u0003.\u0017\u0000\u0105\u0106\u0005#\u0000\u0000\u0106\u0108"+
		"\u0003.\u0017\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0108\u010b\u0001"+
		"\u0000\u0000\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u0109\u010a\u0001"+
		"\u0000\u0000\u0000\u010a\'\u0001\u0000\u0000\u0000\u010b\u0109\u0001\u0000"+
		"\u0000\u0000\u010c\u010d\u0005#\u0000\u0000\u010d\u010f\u0005\u0005\u0000"+
		"\u0000\u010e\u0110\u0005/\u0000\u0000\u010f\u010e\u0001\u0000\u0000\u0000"+
		"\u010f\u0110\u0001\u0000\u0000\u0000\u0110)\u0001\u0000\u0000\u0000\u0111"+
		"\u0112\u0005#\u0000\u0000\u0112\u0114\u0003.\u0017\u0000\u0113\u0111\u0001"+
		"\u0000\u0000\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0115\u0113\u0001"+
		"\u0000\u0000\u0000\u0115\u0116\u0001\u0000\u0000\u0000\u0116+\u0001\u0000"+
		"\u0000\u0000\u0117\u0118\u0005#\u0000\u0000\u0118\u0119\u0005\u0004\u0000"+
		"\u0000\u0119\u011a\u0005/\u0000\u0000\u011a-\u0001\u0000\u0000\u0000\u011b"+
		"\u011e\u0005/\u0000\u0000\u011c\u011d\u0005\u001f\u0000\u0000\u011d\u011f"+
		"\u0003:\u001d\u0000\u011e\u011c\u0001\u0000\u0000\u0000\u011e\u011f\u0001"+
		"\u0000\u0000\u0000\u011f/\u0001\u0000\u0000\u0000\u0120\u014a\u0005$\u0000"+
		"\u0000\u0121\u0123\u00050\u0000\u0000\u0122\u0121\u0001\u0000\u0000\u0000"+
		"\u0123\u0126\u0001\u0000\u0000\u0000\u0124\u0122\u0001\u0000\u0000\u0000"+
		"\u0124\u0125\u0001\u0000\u0000\u0000\u0125\u0127\u0001\u0000\u0000\u0000"+
		"\u0126\u0124\u0001\u0000\u0000\u0000\u0127\u0138\u0003:\u001d\u0000\u0128"+
		"\u012a\u00050\u0000\u0000\u0129\u0128\u0001\u0000\u0000\u0000\u012a\u012d"+
		"\u0001\u0000\u0000\u0000\u012b\u0129\u0001\u0000\u0000\u0000\u012b\u012c"+
		"\u0001\u0000\u0000\u0000\u012c\u012e\u0001\u0000\u0000\u0000\u012d\u012b"+
		"\u0001\u0000\u0000\u0000\u012e\u0132\u0005#\u0000\u0000\u012f\u0131\u0005"+
		"0\u0000\u0000\u0130\u012f\u0001\u0000\u0000\u0000\u0131\u0134\u0001\u0000"+
		"\u0000\u0000\u0132\u0130\u0001\u0000\u0000\u0000\u0132\u0133\u0001\u0000"+
		"\u0000\u0000\u0133\u0135\u0001\u0000\u0000\u0000\u0134\u0132\u0001\u0000"+
		"\u0000\u0000\u0135\u0137\u0003:\u001d\u0000\u0136\u012b\u0001\u0000\u0000"+
		"\u0000\u0137\u013a\u0001\u0000\u0000\u0000\u0138\u0136\u0001\u0000\u0000"+
		"\u0000\u0138\u0139\u0001\u0000\u0000\u0000\u0139\u013e\u0001\u0000\u0000"+
		"\u0000\u013a\u0138\u0001\u0000\u0000\u0000\u013b\u013d\u00050\u0000\u0000"+
		"\u013c\u013b\u0001\u0000\u0000\u0000\u013d\u0140\u0001\u0000\u0000\u0000"+
		"\u013e\u013c\u0001\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000"+
		"\u013f\u0142\u0001\u0000\u0000\u0000\u0140\u013e\u0001\u0000\u0000\u0000"+
		"\u0141\u0143\u0005#\u0000\u0000\u0142\u0141\u0001\u0000\u0000\u0000\u0142"+
		"\u0143\u0001\u0000\u0000\u0000\u0143\u0147\u0001\u0000\u0000\u0000\u0144"+
		"\u0146\u00050\u0000\u0000\u0145\u0144\u0001\u0000\u0000\u0000\u0146\u0149"+
		"\u0001\u0000\u0000\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0147\u0148"+
		"\u0001\u0000\u0000\u0000\u0148\u014b\u0001\u0000\u0000\u0000\u0149\u0147"+
		"\u0001\u0000\u0000\u0000\u014a\u0124\u0001\u0000\u0000\u0000\u014a\u014b"+
		"\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000\u0000\u0000\u014c\u014d"+
		"\u0005%\u0000\u0000\u014d1\u0001\u0000\u0000\u0000\u014e\u0178\u0005&"+
		"\u0000\u0000\u014f\u0151\u00050\u0000\u0000\u0150\u014f\u0001\u0000\u0000"+
		"\u0000\u0151\u0154\u0001\u0000\u0000\u0000\u0152\u0150\u0001\u0000\u0000"+
		"\u0000\u0152\u0153\u0001\u0000\u0000\u0000\u0153\u0155\u0001\u0000\u0000"+
		"\u0000\u0154\u0152\u0001\u0000\u0000\u0000\u0155\u0166\u00034\u001a\u0000"+
		"\u0156\u0158\u00050\u0000\u0000\u0157\u0156\u0001\u0000\u0000\u0000\u0158"+
		"\u015b\u0001\u0000\u0000\u0000\u0159\u0157\u0001\u0000\u0000\u0000\u0159"+
		"\u015a\u0001\u0000\u0000\u0000\u015a\u015c\u0001\u0000\u0000\u0000\u015b"+
		"\u0159\u0001\u0000\u0000\u0000\u015c\u0160\u0005#\u0000\u0000\u015d\u015f"+
		"\u00050\u0000\u0000\u015e\u015d\u0001\u0000\u0000\u0000\u015f\u0162\u0001"+
		"\u0000\u0000\u0000\u0160\u015e\u0001\u0000\u0000\u0000\u0160\u0161\u0001"+
		"\u0000\u0000\u0000\u0161\u0163\u0001\u0000\u0000\u0000\u0162\u0160\u0001"+
		"\u0000\u0000\u0000\u0163\u0165\u00034\u001a\u0000\u0164\u0159\u0001\u0000"+
		"\u0000\u0000\u0165\u0168\u0001\u0000\u0000\u0000\u0166\u0164\u0001\u0000"+
		"\u0000\u0000\u0166\u0167\u0001\u0000\u0000\u0000\u0167\u016c\u0001\u0000"+
		"\u0000\u0000\u0168\u0166\u0001\u0000\u0000\u0000\u0169\u016b\u00050\u0000"+
		"\u0000\u016a\u0169\u0001\u0000\u0000\u0000\u016b\u016e\u0001\u0000\u0000"+
		"\u0000\u016c\u016a\u0001\u0000\u0000\u0000\u016c\u016d\u0001\u0000\u0000"+
		"\u0000\u016d\u0170\u0001\u0000\u0000\u0000\u016e\u016c\u0001\u0000\u0000"+
		"\u0000\u016f\u0171\u0005#\u0000\u0000\u0170\u016f\u0001\u0000\u0000\u0000"+
		"\u0170\u0171\u0001\u0000\u0000\u0000\u0171\u0175\u0001\u0000\u0000\u0000"+
		"\u0172\u0174\u00050\u0000\u0000\u0173\u0172\u0001\u0000\u0000\u0000\u0174"+
		"\u0177\u0001\u0000\u0000\u0000\u0175\u0173\u0001\u0000\u0000\u0000\u0175"+
		"\u0176\u0001\u0000\u0000\u0000\u0176\u0179\u0001\u0000\u0000\u0000\u0177"+
		"\u0175\u0001\u0000\u0000\u0000\u0178\u0152\u0001\u0000\u0000\u0000\u0178"+
		"\u0179\u0001\u0000\u0000\u0000\u0179\u017a\u0001\u0000\u0000\u0000\u017a"+
		"\u017b\u0005\'\u0000\u0000\u017b3\u0001\u0000\u0000\u0000\u017c\u017d"+
		"\u0003:\u001d\u0000\u017d\u017e\u0005 \u0000\u0000\u017e\u017f\u0003:"+
		"\u001d\u0000\u017f5\u0001\u0000\u0000\u0000\u0180\u0181\u0005$\u0000\u0000"+
		"\u0181\u0182\u0003:\u001d\u0000\u0182\u0183\u0005\u0019\u0000\u0000\u0183"+
		"\u0184\u0005/\u0000\u0000\u0184\u0185\u0005\u001a\u0000\u0000\u0185\u0188"+
		"\u0003:\u001d\u0000\u0186\u0187\u0005\u0012\u0000\u0000\u0187\u0189\u0003"+
		"\u001a\r\u0000\u0188\u0186\u0001\u0000\u0000\u0000\u0188\u0189\u0001\u0000"+
		"\u0000\u0000\u0189\u018a\u0001\u0000\u0000\u0000\u018a\u018b\u0005%\u0000"+
		"\u0000\u018b7\u0001\u0000\u0000\u0000\u018c\u018d\u0005/\u0000\u0000\u018d"+
		"\u018f\u0005\u001f\u0000\u0000\u018e\u018c\u0001\u0000\u0000\u0000\u018e"+
		"\u018f\u0001\u0000\u0000\u0000\u018f\u0190\u0001\u0000\u0000\u0000\u0190"+
		"\u0191\u0003:\u001d\u0000\u01919\u0001\u0000\u0000\u0000\u0192\u0193\u0003"+
		"<\u001e\u0000\u0193;\u0001\u0000\u0000\u0000\u0194\u0195\u0006\u001e\uffff"+
		"\uffff\u0000\u0195\u0196\u0003>\u001f\u0000\u0196\u019f\u0001\u0000\u0000"+
		"\u0000\u0197\u0198\n\u0003\u0000\u0000\u0198\u0199\u0005\u0007\u0000\u0000"+
		"\u0199\u019e\u0003>\u001f\u0000\u019a\u019b\n\u0002\u0000\u0000\u019b"+
		"\u019c\u0005\b\u0000\u0000\u019c\u019e\u0003>\u001f\u0000\u019d\u0197"+
		"\u0001\u0000\u0000\u0000\u019d\u019a\u0001\u0000\u0000\u0000\u019e\u01a1"+
		"\u0001\u0000\u0000\u0000\u019f\u019d\u0001\u0000\u0000\u0000\u019f\u01a0"+
		"\u0001\u0000\u0000\u0000\u01a0=\u0001\u0000\u0000\u0000\u01a1\u019f\u0001"+
		"\u0000\u0000\u0000\u01a2\u01a3\u0006\u001f\uffff\uffff\u0000\u01a3\u01a4"+
		"\u0003@ \u0000\u01a4\u01ad\u0001\u0000\u0000\u0000\u01a5\u01a6\n\u0003"+
		"\u0000\u0000\u01a6\u01a7\u0005\u0005\u0000\u0000\u01a7\u01ac\u0003@ \u0000"+
		"\u01a8\u01a9\n\u0002\u0000\u0000\u01a9\u01aa\u0005\u0006\u0000\u0000\u01aa"+
		"\u01ac\u0003@ \u0000\u01ab\u01a5\u0001\u0000\u0000\u0000\u01ab\u01a8\u0001"+
		"\u0000\u0000\u0000\u01ac\u01af\u0001\u0000\u0000\u0000\u01ad\u01ab\u0001"+
		"\u0000\u0000\u0000\u01ad\u01ae\u0001\u0000\u0000\u0000\u01ae?\u0001\u0000"+
		"\u0000\u0000\u01af\u01ad\u0001\u0000\u0000\u0000\u01b0\u01b1\u0003B!\u0000"+
		"\u01b1\u01b2\u0005\u0004\u0000\u0000\u01b2\u01b3\u0003@ \u0000\u01b3\u01b6"+
		"\u0001\u0000\u0000\u0000\u01b4\u01b6\u0003B!\u0000\u01b5\u01b0\u0001\u0000"+
		"\u0000\u0000\u01b5\u01b4\u0001\u0000\u0000\u0000\u01b6A\u0001\u0000\u0000"+
		"\u0000\u01b7\u01b8\u0006!\uffff\uffff\u0000\u01b8\u01b9\u0003D\"\u0000"+
		"\u01b9\u01d1\u0001\u0000\u0000\u0000\u01ba\u01bb\n\u0004\u0000\u0000\u01bb"+
		"\u01c4\u0005!\u0000\u0000\u01bc\u01c1\u00038\u001c\u0000\u01bd\u01be\u0005"+
		"#\u0000\u0000\u01be\u01c0\u00038\u001c\u0000\u01bf\u01bd\u0001\u0000\u0000"+
		"\u0000\u01c0\u01c3\u0001\u0000\u0000\u0000\u01c1\u01bf\u0001\u0000\u0000"+
		"\u0000\u01c1\u01c2\u0001\u0000\u0000\u0000\u01c2\u01c5\u0001\u0000\u0000"+
		"\u0000\u01c3\u01c1\u0001\u0000\u0000\u0000\u01c4\u01bc\u0001\u0000\u0000"+
		"\u0000\u01c4\u01c5\u0001\u0000\u0000\u0000\u01c5\u01c6\u0001\u0000\u0000"+
		"\u0000\u01c6\u01d0\u0005\"\u0000\u0000\u01c7\u01c8\n\u0003\u0000\u0000"+
		"\u01c8\u01c9\u0005(\u0000\u0000\u01c9\u01d0\u0005/\u0000\u0000\u01ca\u01cb"+
		"\n\u0002\u0000\u0000\u01cb\u01cc\u0005$\u0000\u0000\u01cc\u01cd\u0003"+
		":\u001d\u0000\u01cd\u01ce\u0005%\u0000\u0000\u01ce\u01d0\u0001\u0000\u0000"+
		"\u0000\u01cf\u01ba\u0001\u0000\u0000\u0000\u01cf\u01c7\u0001\u0000\u0000"+
		"\u0000\u01cf\u01ca\u0001\u0000\u0000\u0000\u01d0\u01d3\u0001\u0000\u0000"+
		"\u0000\u01d1\u01cf\u0001\u0000\u0000\u0000\u01d1\u01d2\u0001\u0000\u0000"+
		"\u0000\u01d2C\u0001\u0000\u0000\u0000\u01d3\u01d1\u0001\u0000\u0000\u0000"+
		"\u01d4\u01d7\u0005\u0002\u0000\u0000\u01d5\u01d7\u0005\u0003\u0000\u0000"+
		"\u01d6\u01d4\u0001\u0000\u0000\u0000\u01d6\u01d5\u0001\u0000\u0000\u0000"+
		"\u01d7\u01e5\u0001\u0000\u0000\u0000\u01d8\u01e5\u0005,\u0000\u0000\u01d9"+
		"\u01e5\u0005\u0017\u0000\u0000\u01da\u01e5\u0005\u0018\u0000\u0000\u01db"+
		"\u01e5\u0005\u001e\u0000\u0000\u01dc\u01e5\u0005/\u0000\u0000\u01dd\u01e5"+
		"\u00030\u0018\u0000\u01de\u01e5\u00032\u0019\u0000\u01df\u01e5\u00036"+
		"\u001b\u0000\u01e0\u01e1\u0005!\u0000\u0000\u01e1\u01e2\u0003:\u001d\u0000"+
		"\u01e2\u01e3\u0005\"\u0000\u0000\u01e3\u01e5\u0001\u0000\u0000\u0000\u01e4"+
		"\u01d6\u0001\u0000\u0000\u0000\u01e4\u01d8\u0001\u0000\u0000\u0000\u01e4"+
		"\u01d9\u0001\u0000\u0000\u0000\u01e4\u01da\u0001\u0000\u0000\u0000\u01e4"+
		"\u01db\u0001\u0000\u0000\u0000\u01e4\u01dc\u0001\u0000\u0000\u0000\u01e4"+
		"\u01dd\u0001\u0000\u0000\u0000\u01e4\u01de\u0001\u0000\u0000\u0000\u01e4"+
		"\u01df\u0001\u0000\u0000\u0000\u01e4\u01e0\u0001\u0000\u0000\u0000\u01e5"+
		"E\u0001\u0000\u0000\u00004IPUfjt\u0086\u008b\u009c\u00a5\u00c8\u00d0\u00d2"+
		"\u00de\u00eb\u00f2\u00fc\u00ff\u0102\u0109\u010f\u0115\u011e\u0124\u012b"+
		"\u0132\u0138\u013e\u0142\u0147\u014a\u0152\u0159\u0160\u0166\u016c\u0170"+
		"\u0175\u0178\u0188\u018e\u019d\u019f\u01ab\u01ad\u01b5\u01c1\u01c4\u01cf"+
		"\u01d1\u01d6\u01e4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}