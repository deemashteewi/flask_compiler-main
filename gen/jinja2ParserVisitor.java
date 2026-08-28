// Generated from C:/Users/HP/IdeaProjects/antlr_course/grammars/jinja2Parser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link jinja2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface jinja2ParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#template}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate(jinja2Parser.TemplateContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateContent(jinja2Parser.TemplateContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#htmlText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlText(jinja2Parser.HtmlTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#expressionBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionBlock(jinja2Parser.ExpressionBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(jinja2Parser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(jinja2Parser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#argList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgList(jinja2Parser.ArgListContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter(jinja2Parser.FilterContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#forBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForBlock(jinja2Parser.ForBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#forStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStart(jinja2Parser.ForStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#forEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForEnd(jinja2Parser.ForEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(jinja2Parser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#ifStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStart(jinja2Parser.IfStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#elifBranch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElifBranch(jinja2Parser.ElifBranchContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#elseBranch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseBranch(jinja2Parser.ElseBranchContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#ifEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfEnd(jinja2Parser.IfEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(jinja2Parser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#compOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompOp(jinja2Parser.CompOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#extendsStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendsStatement(jinja2Parser.ExtendsStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#includeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncludeStatement(jinja2Parser.IncludeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#blockDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockDefinition(jinja2Parser.BlockDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#setStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetStatement(jinja2Parser.SetStatementContext ctx);
}