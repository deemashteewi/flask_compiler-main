// Generated from C:/Users/HP/IdeaProjects/antlr_course/grammars/jinja2Parser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link jinja2Parser}.
 */
public interface jinja2ParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#template}.
	 * @param ctx the parse tree
	 */
	void enterTemplate(jinja2Parser.TemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#template}.
	 * @param ctx the parse tree
	 */
	void exitTemplate(jinja2Parser.TemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 */
	void enterTemplateContent(jinja2Parser.TemplateContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 */
	void exitTemplateContent(jinja2Parser.TemplateContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#htmlText}.
	 * @param ctx the parse tree
	 */
	void enterHtmlText(jinja2Parser.HtmlTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#htmlText}.
	 * @param ctx the parse tree
	 */
	void exitHtmlText(jinja2Parser.HtmlTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#expressionBlock}.
	 * @param ctx the parse tree
	 */
	void enterExpressionBlock(jinja2Parser.ExpressionBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#expressionBlock}.
	 * @param ctx the parse tree
	 */
	void exitExpressionBlock(jinja2Parser.ExpressionBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(jinja2Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(jinja2Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(jinja2Parser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(jinja2Parser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgList(jinja2Parser.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgList(jinja2Parser.ArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter(jinja2Parser.FilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter(jinja2Parser.FilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#forBlock}.
	 * @param ctx the parse tree
	 */
	void enterForBlock(jinja2Parser.ForBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#forBlock}.
	 * @param ctx the parse tree
	 */
	void exitForBlock(jinja2Parser.ForBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#forStart}.
	 * @param ctx the parse tree
	 */
	void enterForStart(jinja2Parser.ForStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#forStart}.
	 * @param ctx the parse tree
	 */
	void exitForStart(jinja2Parser.ForStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#forEnd}.
	 * @param ctx the parse tree
	 */
	void enterForEnd(jinja2Parser.ForEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#forEnd}.
	 * @param ctx the parse tree
	 */
	void exitForEnd(jinja2Parser.ForEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(jinja2Parser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(jinja2Parser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#ifStart}.
	 * @param ctx the parse tree
	 */
	void enterIfStart(jinja2Parser.IfStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#ifStart}.
	 * @param ctx the parse tree
	 */
	void exitIfStart(jinja2Parser.IfStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#elifBranch}.
	 * @param ctx the parse tree
	 */
	void enterElifBranch(jinja2Parser.ElifBranchContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#elifBranch}.
	 * @param ctx the parse tree
	 */
	void exitElifBranch(jinja2Parser.ElifBranchContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#elseBranch}.
	 * @param ctx the parse tree
	 */
	void enterElseBranch(jinja2Parser.ElseBranchContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#elseBranch}.
	 * @param ctx the parse tree
	 */
	void exitElseBranch(jinja2Parser.ElseBranchContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#ifEnd}.
	 * @param ctx the parse tree
	 */
	void enterIfEnd(jinja2Parser.IfEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#ifEnd}.
	 * @param ctx the parse tree
	 */
	void exitIfEnd(jinja2Parser.IfEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(jinja2Parser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(jinja2Parser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#compOp}.
	 * @param ctx the parse tree
	 */
	void enterCompOp(jinja2Parser.CompOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#compOp}.
	 * @param ctx the parse tree
	 */
	void exitCompOp(jinja2Parser.CompOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#extendsStatement}.
	 * @param ctx the parse tree
	 */
	void enterExtendsStatement(jinja2Parser.ExtendsStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#extendsStatement}.
	 * @param ctx the parse tree
	 */
	void exitExtendsStatement(jinja2Parser.ExtendsStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#includeStatement}.
	 * @param ctx the parse tree
	 */
	void enterIncludeStatement(jinja2Parser.IncludeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#includeStatement}.
	 * @param ctx the parse tree
	 */
	void exitIncludeStatement(jinja2Parser.IncludeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#blockDefinition}.
	 * @param ctx the parse tree
	 */
	void enterBlockDefinition(jinja2Parser.BlockDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#blockDefinition}.
	 * @param ctx the parse tree
	 */
	void exitBlockDefinition(jinja2Parser.BlockDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#setStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetStatement(jinja2Parser.SetStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#setStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetStatement(jinja2Parser.SetStatementContext ctx);
}