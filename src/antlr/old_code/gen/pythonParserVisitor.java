// Generated from C:/Users/HP/IdeaProjects/antlr_course/grammars/pythonParser.g4 by ANTLR 4.13.2

   package antlr.old_code.gen;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link pythonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface pythonParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link pythonParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(pythonParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportStatement}
	 * labeled alternative in {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(pythonParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignStatement}
	 * labeled alternative in {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStatement(pythonParser.AssignStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintStatement}
	 * labeled alternative in {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(pythonParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(pythonParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(pythonParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForStmt}
	 * labeled alternative in {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(pythonParser.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(pythonParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BreakStmt}
	 * labeled alternative in {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStmt(pythonParser.BreakStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ContinueStmt}
	 * labeled alternative in {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStmt(pythonParser.ContinueStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassDefStatement}
	 * labeled alternative in {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDefStatement(pythonParser.ClassDefStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionDefStatement}
	 * labeled alternative in {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefStatement(pythonParser.FunctionDefStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprStatement}
	 * labeled alternative in {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStatement(pythonParser.ExprStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(pythonParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#importHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportHeader(pythonParser.ImportHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#importedClasses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportedClasses(pythonParser.ImportedClassesContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(pythonParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#printAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintAction(pythonParser.PrintActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(pythonParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(pythonParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(pythonParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(pythonParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(pythonParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(pythonParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotCondition}
	 * labeled alternative in {@link pythonParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotCondition(pythonParser.NotConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenCondition}
	 * labeled alternative in {@link pythonParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenCondition(pythonParser.ParenConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FalseCondition}
	 * labeled alternative in {@link pythonParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseCondition(pythonParser.FalseConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompareCondition}
	 * labeled alternative in {@link pythonParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareCondition(pythonParser.CompareConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrueCondition}
	 * labeled alternative in {@link pythonParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueCondition(pythonParser.TrueConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrCondition}
	 * labeled alternative in {@link pythonParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrCondition(pythonParser.OrConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndCondition}
	 * labeled alternative in {@link pythonParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndCondition(pythonParser.AndConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#comparisonOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOp(pythonParser.ComparisonOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#decorator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorator(pythonParser.DecoratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#classDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDefinition(pythonParser.ClassDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#functionDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDef(pythonParser.FunctionDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(pythonParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#regularParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularParams(pythonParser.RegularParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#starParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarParam(pythonParser.StarParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#kwOnlyParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKwOnlyParams(pythonParser.KwOnlyParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#kwargsParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKwargsParam(pythonParser.KwargsParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#kwParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKwParam(pythonParser.KwParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(pythonParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#dict}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDict(pythonParser.DictContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#dictEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictEntry(pythonParser.DictEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#listComprehension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListComprehension(pythonParser.ListComprehensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(pythonParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(pythonParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AdditivePassThrough}
	 * labeled alternative in {@link pythonParser#additiveExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditivePassThrough(pythonParser.AdditivePassThroughContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SUM_SUB_OP}
	 * labeled alternative in {@link pythonParser#additiveExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSUM_SUB_OP(pythonParser.SUM_SUB_OPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MUL_DIV_OP}
	 * labeled alternative in {@link pythonParser#multiplicativeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMUL_DIV_OP(pythonParser.MUL_DIV_OPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiplicativePassThrough}
	 * labeled alternative in {@link pythonParser#multiplicativeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativePassThrough(pythonParser.MultiplicativePassThroughContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EXPONENT_OP}
	 * labeled alternative in {@link pythonParser#powerExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEXPONENT_OP(pythonParser.EXPONENT_OPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PowerPassThrough}
	 * labeled alternative in {@link pythonParser#powerExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowerPassThrough(pythonParser.PowerPassThroughContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CallExpr}
	 * labeled alternative in {@link pythonParser#postfixExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallExpr(pythonParser.CallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DotAccessExpr}
	 * labeled alternative in {@link pythonParser#postfixExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotAccessExpr(pythonParser.DotAccessExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code INDEX_ACCESS}
	 * labeled alternative in {@link pythonParser#postfixExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitINDEX_ACCESS(pythonParser.INDEX_ACCESSContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PostfixPassThrough}
	 * labeled alternative in {@link pythonParser#postfixExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixPassThrough(pythonParser.PostfixPassThroughContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NUM}
	 * labeled alternative in {@link pythonParser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNUM(pythonParser.NUMContext ctx);
	/**
	 * Visit a parse tree produced by the {@code STRING_LITERAL}
	 * labeled alternative in {@link pythonParser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSTRING_LITERAL(pythonParser.STRING_LITERALContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrueLiteral}
	 * labeled alternative in {@link pythonParser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueLiteral(pythonParser.TrueLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FalseLiteral}
	 * labeled alternative in {@link pythonParser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseLiteral(pythonParser.FalseLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NoneLiteral}
	 * labeled alternative in {@link pythonParser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoneLiteral(pythonParser.NoneLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VAR}
	 * labeled alternative in {@link pythonParser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVAR(pythonParser.VARContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListExpr}
	 * labeled alternative in {@link pythonParser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListExpr(pythonParser.ListExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DICTIONARY}
	 * labeled alternative in {@link pythonParser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDICTIONARY(pythonParser.DICTIONARYContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListCompExpr}
	 * labeled alternative in {@link pythonParser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListCompExpr(pythonParser.ListCompExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link pythonParser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(pythonParser.ParenExprContext ctx);
}