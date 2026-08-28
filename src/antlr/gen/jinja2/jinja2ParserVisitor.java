// Generated from C:/Users/HP/IdeaProjects/antlr_course/grammars/jinja2Parser.g4 by ANTLR 4.13.2

   package antlr.gen.jinja2;

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
	 * Visit a parse tree produced by the {@code HtmlElementPart}
	 * labeled alternative in {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElementPart(jinja2Parser.HtmlElementPartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlTextPart}
	 * labeled alternative in {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlTextPart(jinja2Parser.HtmlTextPartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlDoctypePart}
	 * labeled alternative in {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlDoctypePart(jinja2Parser.HtmlDoctypePartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlCommentPart}
	 * labeled alternative in {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlCommentPart(jinja2Parser.HtmlCommentPartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlCdataPart}
	 * labeled alternative in {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlCdataPart(jinja2Parser.HtmlCdataPartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlEntityPart}
	 * labeled alternative in {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlEntityPart(jinja2Parser.HtmlEntityPartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionOutput}
	 * labeled alternative in {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionOutput(jinja2Parser.ExpressionOutputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForLoopBlock}
	 * labeled alternative in {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoopBlock(jinja2Parser.ForLoopBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfConditionBlock}
	 * labeled alternative in {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfConditionBlock(jinja2Parser.IfConditionBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExtendsStmt}
	 * labeled alternative in {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendsStmt(jinja2Parser.ExtendsStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IncludeStmt}
	 * labeled alternative in {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncludeStmt(jinja2Parser.IncludeStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlockDefStmt}
	 * labeled alternative in {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockDefStmt(jinja2Parser.BlockDefStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SetStmt}
	 * labeled alternative in {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetStmt(jinja2Parser.SetStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SetBlockStmt}
	 * labeled alternative in {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetBlockStmt(jinja2Parser.SetBlockStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MacroDefStmt}
	 * labeled alternative in {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacroDefStmt(jinja2Parser.MacroDefStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportStmt}
	 * labeled alternative in {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStmt(jinja2Parser.ImportStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FromImportStmt}
	 * labeled alternative in {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromImportStmt(jinja2Parser.FromImportStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WithScopeBlock}
	 * labeled alternative in {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithScopeBlock(jinja2Parser.WithScopeBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilterApplyBlock}
	 * labeled alternative in {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterApplyBlock(jinja2Parser.FilterApplyBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoStmt}
	 * labeled alternative in {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoStmt(jinja2Parser.DoStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CallMacroBlock}
	 * labeled alternative in {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallMacroBlock(jinja2Parser.CallMacroBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AutoescapeStmt}
	 * labeled alternative in {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAutoescapeStmt(jinja2Parser.AutoescapeStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElement(jinja2Parser.HtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#htmlRootElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlRootElement(jinja2Parser.HtmlRootElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#headElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeadElement(jinja2Parser.HeadElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#bodyElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyElement(jinja2Parser.BodyElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#titleElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitleElement(jinja2Parser.TitleElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#styleElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleElement(jinja2Parser.StyleElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#divElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivElement(jinja2Parser.DivElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#h1Element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH1Element(jinja2Parser.H1ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#paragraphElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParagraphElement(jinja2Parser.ParagraphElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#formElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormElement(jinja2Parser.FormElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#labelElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelElement(jinja2Parser.LabelElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#textareaElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextareaElement(jinja2Parser.TextareaElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#buttonElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitButtonElement(jinja2Parser.ButtonElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#anchorElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnchorElement(jinja2Parser.AnchorElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#inputElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputElement(jinja2Parser.InputElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#imgElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImgElement(jinja2Parser.ImgElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#genericElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericElement(jinja2Parser.GenericElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContent(jinja2Parser.HtmlContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AttributeWithValue}
	 * labeled alternative in {@link jinja2Parser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeWithValue(jinja2Parser.AttributeWithValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StaticAttrName}
	 * labeled alternative in {@link jinja2Parser#attrName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticAttrName(jinja2Parser.StaticAttrNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DynamicAttrName}
	 * labeled alternative in {@link jinja2Parser#attrName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamicAttrName(jinja2Parser.DynamicAttrNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoubleQuotedValue}
	 * labeled alternative in {@link jinja2Parser#attrValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleQuotedValue(jinja2Parser.DoubleQuotedValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SingleQuotedValue}
	 * labeled alternative in {@link jinja2Parser#attrValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleQuotedValue(jinja2Parser.SingleQuotedValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnquotedValue}
	 * labeled alternative in {@link jinja2Parser#attrValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnquotedValue(jinja2Parser.UnquotedValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionValue}
	 * labeled alternative in {@link jinja2Parser#attrValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionValue(jinja2Parser.ExpressionValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AttrDqText}
	 * labeled alternative in {@link jinja2Parser#attrDqContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrDqText(jinja2Parser.AttrDqTextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AttrDqExpr}
	 * labeled alternative in {@link jinja2Parser#attrDqContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrDqExpr(jinja2Parser.AttrDqExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AttrDqStmt}
	 * labeled alternative in {@link jinja2Parser#attrDqContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrDqStmt(jinja2Parser.AttrDqStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AttrSqText}
	 * labeled alternative in {@link jinja2Parser#attrSqContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrSqText(jinja2Parser.AttrSqTextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AttrSqExpr}
	 * labeled alternative in {@link jinja2Parser#attrSqContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrSqExpr(jinja2Parser.AttrSqExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AttrSqStmt}
	 * labeled alternative in {@link jinja2Parser#attrSqContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrSqStmt(jinja2Parser.AttrSqStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#htmlDoctype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlDoctype(jinja2Parser.HtmlDoctypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#htmlCommentBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlCommentBlock(jinja2Parser.HtmlCommentBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#htmlCdata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlCdata(jinja2Parser.HtmlCdataContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#htmlEntity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlEntity(jinja2Parser.HtmlEntityContext ctx);
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
	 * Visit a parse tree produced by {@link jinja2Parser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter(jinja2Parser.FilterContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(jinja2Parser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#ternaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryExpr(jinja2Parser.TernaryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#orExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(jinja2Parser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#andExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(jinja2Parser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link jinja2Parser#notExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(jinja2Parser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotPassThrough}
	 * labeled alternative in {@link jinja2Parser#notExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotPassThrough(jinja2Parser.NotPassThroughContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompareExpression}
	 * labeled alternative in {@link jinja2Parser#comparisonExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareExpression(jinja2Parser.CompareExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TestExpression}
	 * labeled alternative in {@link jinja2Parser#comparisonExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestExpression(jinja2Parser.TestExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqOp}
	 * labeled alternative in {@link jinja2Parser#compOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqOp(jinja2Parser.EqOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NeqOp}
	 * labeled alternative in {@link jinja2Parser#compOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNeqOp(jinja2Parser.NeqOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LtOp}
	 * labeled alternative in {@link jinja2Parser#compOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLtOp(jinja2Parser.LtOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GtOp}
	 * labeled alternative in {@link jinja2Parser#compOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGtOp(jinja2Parser.GtOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LteOp}
	 * labeled alternative in {@link jinja2Parser#compOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLteOp(jinja2Parser.LteOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GteOp}
	 * labeled alternative in {@link jinja2Parser#compOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGteOp(jinja2Parser.GteOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InOp}
	 * labeled alternative in {@link jinja2Parser#compOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInOp(jinja2Parser.InOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotInOp}
	 * labeled alternative in {@link jinja2Parser#compOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotInOp(jinja2Parser.NotInOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#testOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestOp(jinja2Parser.TestOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#testName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestName(jinja2Parser.TestNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#additiveExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpr(jinja2Parser.AdditiveExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#multiplicativeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpr(jinja2Parser.MultiplicativeExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#powerExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowerExpr(jinja2Parser.PowerExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryExpression}
	 * labeled alternative in {@link jinja2Parser#unaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(jinja2Parser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryPassThrough}
	 * labeled alternative in {@link jinja2Parser#unaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryPassThrough(jinja2Parser.UnaryPassThroughContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#postfixExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpr(jinja2Parser.PostfixExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DotAccessOp}
	 * labeled alternative in {@link jinja2Parser#postfixOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotAccessOp(jinja2Parser.DotAccessOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IndexAccessOp}
	 * labeled alternative in {@link jinja2Parser#postfixOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexAccessOp(jinja2Parser.IndexAccessOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SliceAccessOp}
	 * labeled alternative in {@link jinja2Parser#postfixOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSliceAccessOp(jinja2Parser.SliceAccessOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CallOp}
	 * labeled alternative in {@link jinja2Parser#postfixOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallOp(jinja2Parser.CallOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberLiteral}
	 * labeled alternative in {@link jinja2Parser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberLiteral(jinja2Parser.NumberLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link jinja2Parser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(jinja2Parser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrueLiteral}
	 * labeled alternative in {@link jinja2Parser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueLiteral(jinja2Parser.TrueLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FalseLiteral}
	 * labeled alternative in {@link jinja2Parser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseLiteral(jinja2Parser.FalseLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NoneLiteral}
	 * labeled alternative in {@link jinja2Parser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoneLiteral(jinja2Parser.NoneLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableExpr}
	 * labeled alternative in {@link jinja2Parser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableExpr(jinja2Parser.VariableExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListExpr}
	 * labeled alternative in {@link jinja2Parser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListExpr(jinja2Parser.ListExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DictExpr}
	 * labeled alternative in {@link jinja2Parser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictExpr(jinja2Parser.DictExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link jinja2Parser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(jinja2Parser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(jinja2Parser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#dict}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDict(jinja2Parser.DictContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#dictEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictEntry(jinja2Parser.DictEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#argList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgList(jinja2Parser.ArgListContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(jinja2Parser.ArgumentContext ctx);
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
	 * Visit a parse tree produced by the {@code SingleTarget}
	 * labeled alternative in {@link jinja2Parser#forTarget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTarget(jinja2Parser.SingleTargetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TupleTarget}
	 * labeled alternative in {@link jinja2Parser#forTarget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTupleTarget(jinja2Parser.TupleTargetContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#elseForBranch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseForBranch(jinja2Parser.ElseForBranchContext ctx);
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
	 * Visit a parse tree produced by the {@code SimpleTarget}
	 * labeled alternative in {@link jinja2Parser#setTarget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTarget(jinja2Parser.SimpleTargetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TupleSetTarget}
	 * labeled alternative in {@link jinja2Parser#setTarget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTupleSetTarget(jinja2Parser.TupleSetTargetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NamespaceTarget}
	 * labeled alternative in {@link jinja2Parser#setTarget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaceTarget(jinja2Parser.NamespaceTargetContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#setStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetStatement(jinja2Parser.SetStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#setBlockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetBlockStatement(jinja2Parser.SetBlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#macroStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacroStatement(jinja2Parser.MacroStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#macroParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacroParams(jinja2Parser.MacroParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#macroParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacroParam(jinja2Parser.MacroParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#callBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallBlock(jinja2Parser.CallBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(jinja2Parser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#fromImportStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromImportStatement(jinja2Parser.FromImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#importList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportList(jinja2Parser.ImportListContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#importItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportItem(jinja2Parser.ImportItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#withBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithBlock(jinja2Parser.WithBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#assignments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignments(jinja2Parser.AssignmentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#withAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithAssignment(jinja2Parser.WithAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#filterBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterBlock(jinja2Parser.FilterBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#doStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoStatement(jinja2Parser.DoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#autoescapeBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAutoescapeBlock(jinja2Parser.AutoescapeBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#cssStylesheet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssStylesheet(jinja2Parser.CssStylesheetContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#cssRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssRule(jinja2Parser.CssRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ElementSelector}
	 * labeled alternative in {@link jinja2Parser#cssSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementSelector(jinja2Parser.ElementSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassSelector}
	 * labeled alternative in {@link jinja2Parser#cssSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassSelector(jinja2Parser.ClassSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ElementPseudoSelector}
	 * labeled alternative in {@link jinja2Parser#cssSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementPseudoSelector(jinja2Parser.ElementPseudoSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassPseudoSelector}
	 * labeled alternative in {@link jinja2Parser#cssSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassPseudoSelector(jinja2Parser.ClassPseudoSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DescendantSelector}
	 * labeled alternative in {@link jinja2Parser#cssSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescendantSelector(jinja2Parser.DescendantSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ElementClassSelector}
	 * labeled alternative in {@link jinja2Parser#cssSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementClassSelector(jinja2Parser.ElementClassSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#cssElementSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssElementSelector(jinja2Parser.CssElementSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#cssClassSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssClassSelector(jinja2Parser.CssClassSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#cssClassName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssClassName(jinja2Parser.CssClassNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#cssPseudoClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssPseudoClass(jinja2Parser.CssPseudoClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#cssDescendantSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssDescendantSelector(jinja2Parser.CssDescendantSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssSimpleElement}
	 * labeled alternative in {@link jinja2Parser#cssSelectorSimple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssSimpleElement(jinja2Parser.CssSimpleElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssSimpleClass}
	 * labeled alternative in {@link jinja2Parser#cssSelectorSimple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssSimpleClass(jinja2Parser.CssSimpleClassContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssSingleLengthDecl}
	 * labeled alternative in {@link jinja2Parser#cssDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssSingleLengthDecl(jinja2Parser.CssSingleLengthDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssMultipleLengthDecl}
	 * labeled alternative in {@link jinja2Parser#cssDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssMultipleLengthDecl(jinja2Parser.CssMultipleLengthDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssColorDecl}
	 * labeled alternative in {@link jinja2Parser#cssDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssColorDecl(jinja2Parser.CssColorDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssKeywordDecl}
	 * labeled alternative in {@link jinja2Parser#cssDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssKeywordDecl(jinja2Parser.CssKeywordDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssBoxShadowDecl}
	 * labeled alternative in {@link jinja2Parser#cssDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssBoxShadowDecl(jinja2Parser.CssBoxShadowDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssBorderDecl}
	 * labeled alternative in {@link jinja2Parser#cssDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssBorderDecl(jinja2Parser.CssBorderDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssTransitionDecl}
	 * labeled alternative in {@link jinja2Parser#cssDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssTransitionDecl(jinja2Parser.CssTransitionDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssTransformDecl}
	 * labeled alternative in {@link jinja2Parser#cssDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssTransformDecl(jinja2Parser.CssTransformDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssBackgroundDecl}
	 * labeled alternative in {@link jinja2Parser#cssDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssBackgroundDecl(jinja2Parser.CssBackgroundDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssFontFamilyDecl}
	 * labeled alternative in {@link jinja2Parser#cssDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssFontFamilyDecl(jinja2Parser.CssFontFamilyDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssFontWeightDecl}
	 * labeled alternative in {@link jinja2Parser#cssDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssFontWeightDecl(jinja2Parser.CssFontWeightDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssBoxSizingDecl}
	 * labeled alternative in {@link jinja2Parser#cssDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssBoxSizingDecl(jinja2Parser.CssBoxSizingDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssOutlineDecl}
	 * labeled alternative in {@link jinja2Parser#cssDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssOutlineDecl(jinja2Parser.CssOutlineDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#singleLengthDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleLengthDecl(jinja2Parser.SingleLengthDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#singleLengthProp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleLengthProp(jinja2Parser.SingleLengthPropContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#multipleLengthDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleLengthDecl(jinja2Parser.MultipleLengthDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#multiLengthProp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiLengthProp(jinja2Parser.MultiLengthPropContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#cssMultiLengthValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssMultiLengthValue(jinja2Parser.CssMultiLengthValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#colorDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColorDecl(jinja2Parser.ColorDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#colorProp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColorProp(jinja2Parser.ColorPropContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssColorLiteral}
	 * labeled alternative in {@link jinja2Parser#cssColorValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssColorLiteral(jinja2Parser.CssColorLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssColorKeyword}
	 * labeled alternative in {@link jinja2Parser#cssColorValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssColorKeyword(jinja2Parser.CssColorKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#keywordDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeywordDecl(jinja2Parser.KeywordDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#keywordProp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeywordProp(jinja2Parser.KeywordPropContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#boxShadowDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoxShadowDecl(jinja2Parser.BoxShadowDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#boxShadowValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoxShadowValue(jinja2Parser.BoxShadowValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssColorOrFuncColor}
	 * labeled alternative in {@link jinja2Parser#cssColorOrFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssColorOrFuncColor(jinja2Parser.CssColorOrFuncColorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssColorOrFuncFunc}
	 * labeled alternative in {@link jinja2Parser#cssColorOrFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssColorOrFuncFunc(jinja2Parser.CssColorOrFuncFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#borderDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBorderDecl(jinja2Parser.BorderDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#borderProp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBorderProp(jinja2Parser.BorderPropContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#transitionDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransitionDecl(jinja2Parser.TransitionDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#cssTransitionProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssTransitionProperty(jinja2Parser.CssTransitionPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#transformDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransformDecl(jinja2Parser.TransformDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#backgroundDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackgroundDecl(jinja2Parser.BackgroundDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssBgColor}
	 * labeled alternative in {@link jinja2Parser#cssBackgroundValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssBgColor(jinja2Parser.CssBgColorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssBgKeyword}
	 * labeled alternative in {@link jinja2Parser#cssBackgroundValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssBgKeyword(jinja2Parser.CssBgKeywordContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssBgFunction}
	 * labeled alternative in {@link jinja2Parser#cssBackgroundValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssBgFunction(jinja2Parser.CssBgFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#fontFamilyDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFontFamilyDecl(jinja2Parser.FontFamilyDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#cssFontName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssFontName(jinja2Parser.CssFontNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#cssFontToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssFontToken(jinja2Parser.CssFontTokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#fontWeightDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFontWeightDecl(jinja2Parser.FontWeightDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssFontWeightNum}
	 * labeled alternative in {@link jinja2Parser#cssFontWeightValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssFontWeightNum(jinja2Parser.CssFontWeightNumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssFontWeightKeyword}
	 * labeled alternative in {@link jinja2Parser#cssFontWeightValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssFontWeightKeyword(jinja2Parser.CssFontWeightKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#boxSizingDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoxSizingDecl(jinja2Parser.BoxSizingDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#outlineDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutlineDecl(jinja2Parser.OutlineDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssOutlineKeyword}
	 * labeled alternative in {@link jinja2Parser#cssOutlineValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssOutlineKeyword(jinja2Parser.CssOutlineKeywordContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssOutlineFull}
	 * labeled alternative in {@link jinja2Parser#cssOutlineValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssOutlineFull(jinja2Parser.CssOutlineFullContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#outlineValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutlineValue(jinja2Parser.OutlineValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#cssLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssLength(jinja2Parser.CssLengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#cssColor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssColor(jinja2Parser.CssColorContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#cssKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssKeyword(jinja2Parser.CssKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#cssNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssNumber(jinja2Parser.CssNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#cssTime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssTime(jinja2Parser.CssTimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#cssIdent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssIdent(jinja2Parser.CssIdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssRgbaFunc}
	 * labeled alternative in {@link jinja2Parser#cssFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssRgbaFunc(jinja2Parser.CssRgbaFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssTransformFunc}
	 * labeled alternative in {@link jinja2Parser#cssFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssTransformFunc(jinja2Parser.CssTransformFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#cssRgbaFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssRgbaFunction(jinja2Parser.CssRgbaFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinja2Parser#cssTransformFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssTransformFunction(jinja2Parser.CssTransformFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssValueLength}
	 * labeled alternative in {@link jinja2Parser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssValueLength(jinja2Parser.CssValueLengthContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssValueColor}
	 * labeled alternative in {@link jinja2Parser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssValueColor(jinja2Parser.CssValueColorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssValueKeyword}
	 * labeled alternative in {@link jinja2Parser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssValueKeyword(jinja2Parser.CssValueKeywordContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssValueNumber}
	 * labeled alternative in {@link jinja2Parser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssValueNumber(jinja2Parser.CssValueNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssValueFunction}
	 * labeled alternative in {@link jinja2Parser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssValueFunction(jinja2Parser.CssValueFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssValueIdent}
	 * labeled alternative in {@link jinja2Parser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssValueIdent(jinja2Parser.CssValueIdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssValueTime}
	 * labeled alternative in {@link jinja2Parser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssValueTime(jinja2Parser.CssValueTimeContext ctx);
}