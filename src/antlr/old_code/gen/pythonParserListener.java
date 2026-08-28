// Generated from C:/Users/HP/IdeaProjects/antlr_course/grammars/pythonParser.g4 by ANTLR 4.13.2

   package antlr.old_code.gen;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link pythonParser}.
 */
public interface pythonParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link pythonParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(pythonParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(pythonParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportStatement}
	 * labeled alternative in {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(pythonParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportStatement}
	 * labeled alternative in {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(pythonParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignStatement}
	 * labeled alternative in {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStatement(pythonParser.AssignStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignStatement}
	 * labeled alternative in {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStatement(pythonParser.AssignStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintStatement}
	 * labeled alternative in {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(pythonParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintStatement}
	 * labeled alternative in {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(pythonParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(pythonParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(pythonParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(pythonParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(pythonParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForStmt}
	 * labeled alternative in {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(pythonParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForStmt}
	 * labeled alternative in {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(pythonParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(pythonParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(pythonParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BreakStmt}
	 * labeled alternative in {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStmt(pythonParser.BreakStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BreakStmt}
	 * labeled alternative in {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStmt(pythonParser.BreakStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ContinueStmt}
	 * labeled alternative in {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStmt(pythonParser.ContinueStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContinueStmt}
	 * labeled alternative in {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStmt(pythonParser.ContinueStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassDefStatement}
	 * labeled alternative in {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterClassDefStatement(pythonParser.ClassDefStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassDefStatement}
	 * labeled alternative in {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitClassDefStatement(pythonParser.ClassDefStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionDefStatement}
	 * labeled alternative in {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefStatement(pythonParser.FunctionDefStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionDefStatement}
	 * labeled alternative in {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefStatement(pythonParser.FunctionDefStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprStatement}
	 * labeled alternative in {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExprStatement(pythonParser.ExprStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprStatement}
	 * labeled alternative in {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExprStatement(pythonParser.ExprStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(pythonParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(pythonParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#importHeader}.
	 * @param ctx the parse tree
	 */
	void enterImportHeader(pythonParser.ImportHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#importHeader}.
	 * @param ctx the parse tree
	 */
	void exitImportHeader(pythonParser.ImportHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#importedClasses}.
	 * @param ctx the parse tree
	 */
	void enterImportedClasses(pythonParser.ImportedClassesContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#importedClasses}.
	 * @param ctx the parse tree
	 */
	void exitImportedClasses(pythonParser.ImportedClassesContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(pythonParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(pythonParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#printAction}.
	 * @param ctx the parse tree
	 */
	void enterPrintAction(pythonParser.PrintActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#printAction}.
	 * @param ctx the parse tree
	 */
	void exitPrintAction(pythonParser.PrintActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(pythonParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(pythonParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(pythonParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(pythonParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(pythonParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(pythonParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(pythonParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(pythonParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(pythonParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(pythonParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(pythonParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(pythonParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotCondition}
	 * labeled alternative in {@link pythonParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterNotCondition(pythonParser.NotConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotCondition}
	 * labeled alternative in {@link pythonParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitNotCondition(pythonParser.NotConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenCondition}
	 * labeled alternative in {@link pythonParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterParenCondition(pythonParser.ParenConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenCondition}
	 * labeled alternative in {@link pythonParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitParenCondition(pythonParser.ParenConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FalseCondition}
	 * labeled alternative in {@link pythonParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterFalseCondition(pythonParser.FalseConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FalseCondition}
	 * labeled alternative in {@link pythonParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitFalseCondition(pythonParser.FalseConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompareCondition}
	 * labeled alternative in {@link pythonParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCompareCondition(pythonParser.CompareConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompareCondition}
	 * labeled alternative in {@link pythonParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCompareCondition(pythonParser.CompareConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrueCondition}
	 * labeled alternative in {@link pythonParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterTrueCondition(pythonParser.TrueConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrueCondition}
	 * labeled alternative in {@link pythonParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitTrueCondition(pythonParser.TrueConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrCondition}
	 * labeled alternative in {@link pythonParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterOrCondition(pythonParser.OrConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrCondition}
	 * labeled alternative in {@link pythonParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitOrCondition(pythonParser.OrConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndCondition}
	 * labeled alternative in {@link pythonParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterAndCondition(pythonParser.AndConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndCondition}
	 * labeled alternative in {@link pythonParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitAndCondition(pythonParser.AndConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#comparisonOp}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOp(pythonParser.ComparisonOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#comparisonOp}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOp(pythonParser.ComparisonOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#decorator}.
	 * @param ctx the parse tree
	 */
	void enterDecorator(pythonParser.DecoratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#decorator}.
	 * @param ctx the parse tree
	 */
	void exitDecorator(pythonParser.DecoratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#classDefinition}.
	 * @param ctx the parse tree
	 */
	void enterClassDefinition(pythonParser.ClassDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#classDefinition}.
	 * @param ctx the parse tree
	 */
	void exitClassDefinition(pythonParser.ClassDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDef(pythonParser.FunctionDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDef(pythonParser.FunctionDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(pythonParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(pythonParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#regularParams}.
	 * @param ctx the parse tree
	 */
	void enterRegularParams(pythonParser.RegularParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#regularParams}.
	 * @param ctx the parse tree
	 */
	void exitRegularParams(pythonParser.RegularParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#starParam}.
	 * @param ctx the parse tree
	 */
	void enterStarParam(pythonParser.StarParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#starParam}.
	 * @param ctx the parse tree
	 */
	void exitStarParam(pythonParser.StarParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#kwOnlyParams}.
	 * @param ctx the parse tree
	 */
	void enterKwOnlyParams(pythonParser.KwOnlyParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#kwOnlyParams}.
	 * @param ctx the parse tree
	 */
	void exitKwOnlyParams(pythonParser.KwOnlyParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#kwargsParam}.
	 * @param ctx the parse tree
	 */
	void enterKwargsParam(pythonParser.KwargsParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#kwargsParam}.
	 * @param ctx the parse tree
	 */
	void exitKwargsParam(pythonParser.KwargsParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#kwParam}.
	 * @param ctx the parse tree
	 */
	void enterKwParam(pythonParser.KwParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#kwParam}.
	 * @param ctx the parse tree
	 */
	void exitKwParam(pythonParser.KwParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(pythonParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(pythonParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#dict}.
	 * @param ctx the parse tree
	 */
	void enterDict(pythonParser.DictContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#dict}.
	 * @param ctx the parse tree
	 */
	void exitDict(pythonParser.DictContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#dictEntry}.
	 * @param ctx the parse tree
	 */
	void enterDictEntry(pythonParser.DictEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#dictEntry}.
	 * @param ctx the parse tree
	 */
	void exitDictEntry(pythonParser.DictEntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#listComprehension}.
	 * @param ctx the parse tree
	 */
	void enterListComprehension(pythonParser.ListComprehensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#listComprehension}.
	 * @param ctx the parse tree
	 */
	void exitListComprehension(pythonParser.ListComprehensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(pythonParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(pythonParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(pythonParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(pythonParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AdditivePassThrough}
	 * labeled alternative in {@link pythonParser#additiveExpr}.
	 * @param ctx the parse tree
	 */
	void enterAdditivePassThrough(pythonParser.AdditivePassThroughContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AdditivePassThrough}
	 * labeled alternative in {@link pythonParser#additiveExpr}.
	 * @param ctx the parse tree
	 */
	void exitAdditivePassThrough(pythonParser.AdditivePassThroughContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SUM_SUB_OP}
	 * labeled alternative in {@link pythonParser#additiveExpr}.
	 * @param ctx the parse tree
	 */
	void enterSUM_SUB_OP(pythonParser.SUM_SUB_OPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SUM_SUB_OP}
	 * labeled alternative in {@link pythonParser#additiveExpr}.
	 * @param ctx the parse tree
	 */
	void exitSUM_SUB_OP(pythonParser.SUM_SUB_OPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MUL_DIV_OP}
	 * labeled alternative in {@link pythonParser#multiplicativeExpr}.
	 * @param ctx the parse tree
	 */
	void enterMUL_DIV_OP(pythonParser.MUL_DIV_OPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MUL_DIV_OP}
	 * labeled alternative in {@link pythonParser#multiplicativeExpr}.
	 * @param ctx the parse tree
	 */
	void exitMUL_DIV_OP(pythonParser.MUL_DIV_OPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplicativePassThrough}
	 * labeled alternative in {@link pythonParser#multiplicativeExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativePassThrough(pythonParser.MultiplicativePassThroughContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplicativePassThrough}
	 * labeled alternative in {@link pythonParser#multiplicativeExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativePassThrough(pythonParser.MultiplicativePassThroughContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EXPONENT_OP}
	 * labeled alternative in {@link pythonParser#powerExpr}.
	 * @param ctx the parse tree
	 */
	void enterEXPONENT_OP(pythonParser.EXPONENT_OPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EXPONENT_OP}
	 * labeled alternative in {@link pythonParser#powerExpr}.
	 * @param ctx the parse tree
	 */
	void exitEXPONENT_OP(pythonParser.EXPONENT_OPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PowerPassThrough}
	 * labeled alternative in {@link pythonParser#powerExpr}.
	 * @param ctx the parse tree
	 */
	void enterPowerPassThrough(pythonParser.PowerPassThroughContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PowerPassThrough}
	 * labeled alternative in {@link pythonParser#powerExpr}.
	 * @param ctx the parse tree
	 */
	void exitPowerPassThrough(pythonParser.PowerPassThroughContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallExpr}
	 * labeled alternative in {@link pythonParser#postfixExpr}.
	 * @param ctx the parse tree
	 */
	void enterCallExpr(pythonParser.CallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallExpr}
	 * labeled alternative in {@link pythonParser#postfixExpr}.
	 * @param ctx the parse tree
	 */
	void exitCallExpr(pythonParser.CallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DotAccessExpr}
	 * labeled alternative in {@link pythonParser#postfixExpr}.
	 * @param ctx the parse tree
	 */
	void enterDotAccessExpr(pythonParser.DotAccessExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DotAccessExpr}
	 * labeled alternative in {@link pythonParser#postfixExpr}.
	 * @param ctx the parse tree
	 */
	void exitDotAccessExpr(pythonParser.DotAccessExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code INDEX_ACCESS}
	 * labeled alternative in {@link pythonParser#postfixExpr}.
	 * @param ctx the parse tree
	 */
	void enterINDEX_ACCESS(pythonParser.INDEX_ACCESSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code INDEX_ACCESS}
	 * labeled alternative in {@link pythonParser#postfixExpr}.
	 * @param ctx the parse tree
	 */
	void exitINDEX_ACCESS(pythonParser.INDEX_ACCESSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PostfixPassThrough}
	 * labeled alternative in {@link pythonParser#postfixExpr}.
	 * @param ctx the parse tree
	 */
	void enterPostfixPassThrough(pythonParser.PostfixPassThroughContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostfixPassThrough}
	 * labeled alternative in {@link pythonParser#postfixExpr}.
	 * @param ctx the parse tree
	 */
	void exitPostfixPassThrough(pythonParser.PostfixPassThroughContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NUM}
	 * labeled alternative in {@link pythonParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterNUM(pythonParser.NUMContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NUM}
	 * labeled alternative in {@link pythonParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitNUM(pythonParser.NUMContext ctx);
	/**
	 * Enter a parse tree produced by the {@code STRING_LITERAL}
	 * labeled alternative in {@link pythonParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterSTRING_LITERAL(pythonParser.STRING_LITERALContext ctx);
	/**
	 * Exit a parse tree produced by the {@code STRING_LITERAL}
	 * labeled alternative in {@link pythonParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitSTRING_LITERAL(pythonParser.STRING_LITERALContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrueLiteral}
	 * labeled alternative in {@link pythonParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterTrueLiteral(pythonParser.TrueLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrueLiteral}
	 * labeled alternative in {@link pythonParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitTrueLiteral(pythonParser.TrueLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FalseLiteral}
	 * labeled alternative in {@link pythonParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterFalseLiteral(pythonParser.FalseLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FalseLiteral}
	 * labeled alternative in {@link pythonParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitFalseLiteral(pythonParser.FalseLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NoneLiteral}
	 * labeled alternative in {@link pythonParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterNoneLiteral(pythonParser.NoneLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NoneLiteral}
	 * labeled alternative in {@link pythonParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitNoneLiteral(pythonParser.NoneLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VAR}
	 * labeled alternative in {@link pythonParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterVAR(pythonParser.VARContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VAR}
	 * labeled alternative in {@link pythonParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitVAR(pythonParser.VARContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListExpr}
	 * labeled alternative in {@link pythonParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterListExpr(pythonParser.ListExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListExpr}
	 * labeled alternative in {@link pythonParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitListExpr(pythonParser.ListExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DICTIONARY}
	 * labeled alternative in {@link pythonParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterDICTIONARY(pythonParser.DICTIONARYContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DICTIONARY}
	 * labeled alternative in {@link pythonParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitDICTIONARY(pythonParser.DICTIONARYContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListCompExpr}
	 * labeled alternative in {@link pythonParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterListCompExpr(pythonParser.ListCompExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListCompExpr}
	 * labeled alternative in {@link pythonParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitListCompExpr(pythonParser.ListCompExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link pythonParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(pythonParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link pythonParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(pythonParser.ParenExprContext ctx);
}