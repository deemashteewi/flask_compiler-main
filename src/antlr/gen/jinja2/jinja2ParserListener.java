// Generated from C:/Users/HP/IdeaProjects/antlr_course/grammars/jinja2Parser.g4 by ANTLR 4.13.2

   package antlr.gen.jinja2;

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
	 * Enter a parse tree produced by the {@code HtmlElementPart}
	 * labeled alternative in {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElementPart(jinja2Parser.HtmlElementPartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlElementPart}
	 * labeled alternative in {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElementPart(jinja2Parser.HtmlElementPartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlTextPart}
	 * labeled alternative in {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlTextPart(jinja2Parser.HtmlTextPartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlTextPart}
	 * labeled alternative in {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlTextPart(jinja2Parser.HtmlTextPartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlDoctypePart}
	 * labeled alternative in {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlDoctypePart(jinja2Parser.HtmlDoctypePartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlDoctypePart}
	 * labeled alternative in {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlDoctypePart(jinja2Parser.HtmlDoctypePartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlCommentPart}
	 * labeled alternative in {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlCommentPart(jinja2Parser.HtmlCommentPartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlCommentPart}
	 * labeled alternative in {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlCommentPart(jinja2Parser.HtmlCommentPartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlCdataPart}
	 * labeled alternative in {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlCdataPart(jinja2Parser.HtmlCdataPartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlCdataPart}
	 * labeled alternative in {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlCdataPart(jinja2Parser.HtmlCdataPartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlEntityPart}
	 * labeled alternative in {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlEntityPart(jinja2Parser.HtmlEntityPartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlEntityPart}
	 * labeled alternative in {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlEntityPart(jinja2Parser.HtmlEntityPartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionOutput}
	 * labeled alternative in {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 */
	void enterExpressionOutput(jinja2Parser.ExpressionOutputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionOutput}
	 * labeled alternative in {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 */
	void exitExpressionOutput(jinja2Parser.ExpressionOutputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForLoopBlock}
	 * labeled alternative in {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 */
	void enterForLoopBlock(jinja2Parser.ForLoopBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForLoopBlock}
	 * labeled alternative in {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 */
	void exitForLoopBlock(jinja2Parser.ForLoopBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfConditionBlock}
	 * labeled alternative in {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 */
	void enterIfConditionBlock(jinja2Parser.IfConditionBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfConditionBlock}
	 * labeled alternative in {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 */
	void exitIfConditionBlock(jinja2Parser.IfConditionBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExtendsStmt}
	 * labeled alternative in {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 */
	void enterExtendsStmt(jinja2Parser.ExtendsStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExtendsStmt}
	 * labeled alternative in {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 */
	void exitExtendsStmt(jinja2Parser.ExtendsStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IncludeStmt}
	 * labeled alternative in {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 */
	void enterIncludeStmt(jinja2Parser.IncludeStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IncludeStmt}
	 * labeled alternative in {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 */
	void exitIncludeStmt(jinja2Parser.IncludeStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlockDefStmt}
	 * labeled alternative in {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 */
	void enterBlockDefStmt(jinja2Parser.BlockDefStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlockDefStmt}
	 * labeled alternative in {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 */
	void exitBlockDefStmt(jinja2Parser.BlockDefStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SetStmt}
	 * labeled alternative in {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 */
	void enterSetStmt(jinja2Parser.SetStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SetStmt}
	 * labeled alternative in {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 */
	void exitSetStmt(jinja2Parser.SetStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SetBlockStmt}
	 * labeled alternative in {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 */
	void enterSetBlockStmt(jinja2Parser.SetBlockStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SetBlockStmt}
	 * labeled alternative in {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 */
	void exitSetBlockStmt(jinja2Parser.SetBlockStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MacroDefStmt}
	 * labeled alternative in {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 */
	void enterMacroDefStmt(jinja2Parser.MacroDefStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MacroDefStmt}
	 * labeled alternative in {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 */
	void exitMacroDefStmt(jinja2Parser.MacroDefStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportStmt}
	 * labeled alternative in {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 */
	void enterImportStmt(jinja2Parser.ImportStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportStmt}
	 * labeled alternative in {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 */
	void exitImportStmt(jinja2Parser.ImportStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FromImportStmt}
	 * labeled alternative in {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 */
	void enterFromImportStmt(jinja2Parser.FromImportStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FromImportStmt}
	 * labeled alternative in {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 */
	void exitFromImportStmt(jinja2Parser.FromImportStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WithScopeBlock}
	 * labeled alternative in {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 */
	void enterWithScopeBlock(jinja2Parser.WithScopeBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WithScopeBlock}
	 * labeled alternative in {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 */
	void exitWithScopeBlock(jinja2Parser.WithScopeBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilterApplyBlock}
	 * labeled alternative in {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 */
	void enterFilterApplyBlock(jinja2Parser.FilterApplyBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilterApplyBlock}
	 * labeled alternative in {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 */
	void exitFilterApplyBlock(jinja2Parser.FilterApplyBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoStmt}
	 * labeled alternative in {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 */
	void enterDoStmt(jinja2Parser.DoStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoStmt}
	 * labeled alternative in {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 */
	void exitDoStmt(jinja2Parser.DoStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallMacroBlock}
	 * labeled alternative in {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 */
	void enterCallMacroBlock(jinja2Parser.CallMacroBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallMacroBlock}
	 * labeled alternative in {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 */
	void exitCallMacroBlock(jinja2Parser.CallMacroBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AutoescapeStmt}
	 * labeled alternative in {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 */
	void enterAutoescapeStmt(jinja2Parser.AutoescapeStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AutoescapeStmt}
	 * labeled alternative in {@link jinja2Parser#templateContent}.
	 * @param ctx the parse tree
	 */
	void exitAutoescapeStmt(jinja2Parser.AutoescapeStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElement(jinja2Parser.HtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElement(jinja2Parser.HtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#htmlRootElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlRootElement(jinja2Parser.HtmlRootElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#htmlRootElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlRootElement(jinja2Parser.HtmlRootElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#headElement}.
	 * @param ctx the parse tree
	 */
	void enterHeadElement(jinja2Parser.HeadElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#headElement}.
	 * @param ctx the parse tree
	 */
	void exitHeadElement(jinja2Parser.HeadElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#bodyElement}.
	 * @param ctx the parse tree
	 */
	void enterBodyElement(jinja2Parser.BodyElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#bodyElement}.
	 * @param ctx the parse tree
	 */
	void exitBodyElement(jinja2Parser.BodyElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#titleElement}.
	 * @param ctx the parse tree
	 */
	void enterTitleElement(jinja2Parser.TitleElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#titleElement}.
	 * @param ctx the parse tree
	 */
	void exitTitleElement(jinja2Parser.TitleElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#styleElement}.
	 * @param ctx the parse tree
	 */
	void enterStyleElement(jinja2Parser.StyleElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#styleElement}.
	 * @param ctx the parse tree
	 */
	void exitStyleElement(jinja2Parser.StyleElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#divElement}.
	 * @param ctx the parse tree
	 */
	void enterDivElement(jinja2Parser.DivElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#divElement}.
	 * @param ctx the parse tree
	 */
	void exitDivElement(jinja2Parser.DivElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#h1Element}.
	 * @param ctx the parse tree
	 */
	void enterH1Element(jinja2Parser.H1ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#h1Element}.
	 * @param ctx the parse tree
	 */
	void exitH1Element(jinja2Parser.H1ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#paragraphElement}.
	 * @param ctx the parse tree
	 */
	void enterParagraphElement(jinja2Parser.ParagraphElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#paragraphElement}.
	 * @param ctx the parse tree
	 */
	void exitParagraphElement(jinja2Parser.ParagraphElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#formElement}.
	 * @param ctx the parse tree
	 */
	void enterFormElement(jinja2Parser.FormElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#formElement}.
	 * @param ctx the parse tree
	 */
	void exitFormElement(jinja2Parser.FormElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#labelElement}.
	 * @param ctx the parse tree
	 */
	void enterLabelElement(jinja2Parser.LabelElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#labelElement}.
	 * @param ctx the parse tree
	 */
	void exitLabelElement(jinja2Parser.LabelElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#textareaElement}.
	 * @param ctx the parse tree
	 */
	void enterTextareaElement(jinja2Parser.TextareaElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#textareaElement}.
	 * @param ctx the parse tree
	 */
	void exitTextareaElement(jinja2Parser.TextareaElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#buttonElement}.
	 * @param ctx the parse tree
	 */
	void enterButtonElement(jinja2Parser.ButtonElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#buttonElement}.
	 * @param ctx the parse tree
	 */
	void exitButtonElement(jinja2Parser.ButtonElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#anchorElement}.
	 * @param ctx the parse tree
	 */
	void enterAnchorElement(jinja2Parser.AnchorElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#anchorElement}.
	 * @param ctx the parse tree
	 */
	void exitAnchorElement(jinja2Parser.AnchorElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#inputElement}.
	 * @param ctx the parse tree
	 */
	void enterInputElement(jinja2Parser.InputElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#inputElement}.
	 * @param ctx the parse tree
	 */
	void exitInputElement(jinja2Parser.InputElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#imgElement}.
	 * @param ctx the parse tree
	 */
	void enterImgElement(jinja2Parser.ImgElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#imgElement}.
	 * @param ctx the parse tree
	 */
	void exitImgElement(jinja2Parser.ImgElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#genericElement}.
	 * @param ctx the parse tree
	 */
	void enterGenericElement(jinja2Parser.GenericElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#genericElement}.
	 * @param ctx the parse tree
	 */
	void exitGenericElement(jinja2Parser.GenericElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContent(jinja2Parser.HtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContent(jinja2Parser.HtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AttributeWithValue}
	 * labeled alternative in {@link jinja2Parser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterAttributeWithValue(jinja2Parser.AttributeWithValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AttributeWithValue}
	 * labeled alternative in {@link jinja2Parser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitAttributeWithValue(jinja2Parser.AttributeWithValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StaticAttrName}
	 * labeled alternative in {@link jinja2Parser#attrName}.
	 * @param ctx the parse tree
	 */
	void enterStaticAttrName(jinja2Parser.StaticAttrNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StaticAttrName}
	 * labeled alternative in {@link jinja2Parser#attrName}.
	 * @param ctx the parse tree
	 */
	void exitStaticAttrName(jinja2Parser.StaticAttrNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DynamicAttrName}
	 * labeled alternative in {@link jinja2Parser#attrName}.
	 * @param ctx the parse tree
	 */
	void enterDynamicAttrName(jinja2Parser.DynamicAttrNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DynamicAttrName}
	 * labeled alternative in {@link jinja2Parser#attrName}.
	 * @param ctx the parse tree
	 */
	void exitDynamicAttrName(jinja2Parser.DynamicAttrNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoubleQuotedValue}
	 * labeled alternative in {@link jinja2Parser#attrValue}.
	 * @param ctx the parse tree
	 */
	void enterDoubleQuotedValue(jinja2Parser.DoubleQuotedValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoubleQuotedValue}
	 * labeled alternative in {@link jinja2Parser#attrValue}.
	 * @param ctx the parse tree
	 */
	void exitDoubleQuotedValue(jinja2Parser.DoubleQuotedValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SingleQuotedValue}
	 * labeled alternative in {@link jinja2Parser#attrValue}.
	 * @param ctx the parse tree
	 */
	void enterSingleQuotedValue(jinja2Parser.SingleQuotedValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SingleQuotedValue}
	 * labeled alternative in {@link jinja2Parser#attrValue}.
	 * @param ctx the parse tree
	 */
	void exitSingleQuotedValue(jinja2Parser.SingleQuotedValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnquotedValue}
	 * labeled alternative in {@link jinja2Parser#attrValue}.
	 * @param ctx the parse tree
	 */
	void enterUnquotedValue(jinja2Parser.UnquotedValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnquotedValue}
	 * labeled alternative in {@link jinja2Parser#attrValue}.
	 * @param ctx the parse tree
	 */
	void exitUnquotedValue(jinja2Parser.UnquotedValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionValue}
	 * labeled alternative in {@link jinja2Parser#attrValue}.
	 * @param ctx the parse tree
	 */
	void enterExpressionValue(jinja2Parser.ExpressionValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionValue}
	 * labeled alternative in {@link jinja2Parser#attrValue}.
	 * @param ctx the parse tree
	 */
	void exitExpressionValue(jinja2Parser.ExpressionValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AttrDqText}
	 * labeled alternative in {@link jinja2Parser#attrDqContent}.
	 * @param ctx the parse tree
	 */
	void enterAttrDqText(jinja2Parser.AttrDqTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AttrDqText}
	 * labeled alternative in {@link jinja2Parser#attrDqContent}.
	 * @param ctx the parse tree
	 */
	void exitAttrDqText(jinja2Parser.AttrDqTextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AttrDqExpr}
	 * labeled alternative in {@link jinja2Parser#attrDqContent}.
	 * @param ctx the parse tree
	 */
	void enterAttrDqExpr(jinja2Parser.AttrDqExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AttrDqExpr}
	 * labeled alternative in {@link jinja2Parser#attrDqContent}.
	 * @param ctx the parse tree
	 */
	void exitAttrDqExpr(jinja2Parser.AttrDqExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AttrDqStmt}
	 * labeled alternative in {@link jinja2Parser#attrDqContent}.
	 * @param ctx the parse tree
	 */
	void enterAttrDqStmt(jinja2Parser.AttrDqStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AttrDqStmt}
	 * labeled alternative in {@link jinja2Parser#attrDqContent}.
	 * @param ctx the parse tree
	 */
	void exitAttrDqStmt(jinja2Parser.AttrDqStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AttrSqText}
	 * labeled alternative in {@link jinja2Parser#attrSqContent}.
	 * @param ctx the parse tree
	 */
	void enterAttrSqText(jinja2Parser.AttrSqTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AttrSqText}
	 * labeled alternative in {@link jinja2Parser#attrSqContent}.
	 * @param ctx the parse tree
	 */
	void exitAttrSqText(jinja2Parser.AttrSqTextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AttrSqExpr}
	 * labeled alternative in {@link jinja2Parser#attrSqContent}.
	 * @param ctx the parse tree
	 */
	void enterAttrSqExpr(jinja2Parser.AttrSqExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AttrSqExpr}
	 * labeled alternative in {@link jinja2Parser#attrSqContent}.
	 * @param ctx the parse tree
	 */
	void exitAttrSqExpr(jinja2Parser.AttrSqExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AttrSqStmt}
	 * labeled alternative in {@link jinja2Parser#attrSqContent}.
	 * @param ctx the parse tree
	 */
	void enterAttrSqStmt(jinja2Parser.AttrSqStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AttrSqStmt}
	 * labeled alternative in {@link jinja2Parser#attrSqContent}.
	 * @param ctx the parse tree
	 */
	void exitAttrSqStmt(jinja2Parser.AttrSqStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#htmlDoctype}.
	 * @param ctx the parse tree
	 */
	void enterHtmlDoctype(jinja2Parser.HtmlDoctypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#htmlDoctype}.
	 * @param ctx the parse tree
	 */
	void exitHtmlDoctype(jinja2Parser.HtmlDoctypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#htmlCommentBlock}.
	 * @param ctx the parse tree
	 */
	void enterHtmlCommentBlock(jinja2Parser.HtmlCommentBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#htmlCommentBlock}.
	 * @param ctx the parse tree
	 */
	void exitHtmlCommentBlock(jinja2Parser.HtmlCommentBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#htmlCdata}.
	 * @param ctx the parse tree
	 */
	void enterHtmlCdata(jinja2Parser.HtmlCdataContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#htmlCdata}.
	 * @param ctx the parse tree
	 */
	void exitHtmlCdata(jinja2Parser.HtmlCdataContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#htmlEntity}.
	 * @param ctx the parse tree
	 */
	void enterHtmlEntity(jinja2Parser.HtmlEntityContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#htmlEntity}.
	 * @param ctx the parse tree
	 */
	void exitHtmlEntity(jinja2Parser.HtmlEntityContext ctx);
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
	 * Enter a parse tree produced by {@link jinja2Parser#ternaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExpr(jinja2Parser.TernaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#ternaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExpr(jinja2Parser.TernaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#orExpr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(jinja2Parser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#orExpr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(jinja2Parser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#andExpr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(jinja2Parser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#andExpr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(jinja2Parser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link jinja2Parser#notExpr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(jinja2Parser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link jinja2Parser#notExpr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(jinja2Parser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotPassThrough}
	 * labeled alternative in {@link jinja2Parser#notExpr}.
	 * @param ctx the parse tree
	 */
	void enterNotPassThrough(jinja2Parser.NotPassThroughContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotPassThrough}
	 * labeled alternative in {@link jinja2Parser#notExpr}.
	 * @param ctx the parse tree
	 */
	void exitNotPassThrough(jinja2Parser.NotPassThroughContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompareExpression}
	 * labeled alternative in {@link jinja2Parser#comparisonExpr}.
	 * @param ctx the parse tree
	 */
	void enterCompareExpression(jinja2Parser.CompareExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompareExpression}
	 * labeled alternative in {@link jinja2Parser#comparisonExpr}.
	 * @param ctx the parse tree
	 */
	void exitCompareExpression(jinja2Parser.CompareExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TestExpression}
	 * labeled alternative in {@link jinja2Parser#comparisonExpr}.
	 * @param ctx the parse tree
	 */
	void enterTestExpression(jinja2Parser.TestExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TestExpression}
	 * labeled alternative in {@link jinja2Parser#comparisonExpr}.
	 * @param ctx the parse tree
	 */
	void exitTestExpression(jinja2Parser.TestExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqOp}
	 * labeled alternative in {@link jinja2Parser#compOp}.
	 * @param ctx the parse tree
	 */
	void enterEqOp(jinja2Parser.EqOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqOp}
	 * labeled alternative in {@link jinja2Parser#compOp}.
	 * @param ctx the parse tree
	 */
	void exitEqOp(jinja2Parser.EqOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NeqOp}
	 * labeled alternative in {@link jinja2Parser#compOp}.
	 * @param ctx the parse tree
	 */
	void enterNeqOp(jinja2Parser.NeqOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NeqOp}
	 * labeled alternative in {@link jinja2Parser#compOp}.
	 * @param ctx the parse tree
	 */
	void exitNeqOp(jinja2Parser.NeqOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LtOp}
	 * labeled alternative in {@link jinja2Parser#compOp}.
	 * @param ctx the parse tree
	 */
	void enterLtOp(jinja2Parser.LtOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LtOp}
	 * labeled alternative in {@link jinja2Parser#compOp}.
	 * @param ctx the parse tree
	 */
	void exitLtOp(jinja2Parser.LtOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GtOp}
	 * labeled alternative in {@link jinja2Parser#compOp}.
	 * @param ctx the parse tree
	 */
	void enterGtOp(jinja2Parser.GtOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GtOp}
	 * labeled alternative in {@link jinja2Parser#compOp}.
	 * @param ctx the parse tree
	 */
	void exitGtOp(jinja2Parser.GtOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LteOp}
	 * labeled alternative in {@link jinja2Parser#compOp}.
	 * @param ctx the parse tree
	 */
	void enterLteOp(jinja2Parser.LteOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LteOp}
	 * labeled alternative in {@link jinja2Parser#compOp}.
	 * @param ctx the parse tree
	 */
	void exitLteOp(jinja2Parser.LteOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GteOp}
	 * labeled alternative in {@link jinja2Parser#compOp}.
	 * @param ctx the parse tree
	 */
	void enterGteOp(jinja2Parser.GteOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GteOp}
	 * labeled alternative in {@link jinja2Parser#compOp}.
	 * @param ctx the parse tree
	 */
	void exitGteOp(jinja2Parser.GteOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InOp}
	 * labeled alternative in {@link jinja2Parser#compOp}.
	 * @param ctx the parse tree
	 */
	void enterInOp(jinja2Parser.InOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InOp}
	 * labeled alternative in {@link jinja2Parser#compOp}.
	 * @param ctx the parse tree
	 */
	void exitInOp(jinja2Parser.InOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotInOp}
	 * labeled alternative in {@link jinja2Parser#compOp}.
	 * @param ctx the parse tree
	 */
	void enterNotInOp(jinja2Parser.NotInOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotInOp}
	 * labeled alternative in {@link jinja2Parser#compOp}.
	 * @param ctx the parse tree
	 */
	void exitNotInOp(jinja2Parser.NotInOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#testOp}.
	 * @param ctx the parse tree
	 */
	void enterTestOp(jinja2Parser.TestOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#testOp}.
	 * @param ctx the parse tree
	 */
	void exitTestOp(jinja2Parser.TestOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#testName}.
	 * @param ctx the parse tree
	 */
	void enterTestName(jinja2Parser.TestNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#testName}.
	 * @param ctx the parse tree
	 */
	void exitTestName(jinja2Parser.TestNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#additiveExpr}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpr(jinja2Parser.AdditiveExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#additiveExpr}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpr(jinja2Parser.AdditiveExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#multiplicativeExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpr(jinja2Parser.MultiplicativeExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#multiplicativeExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpr(jinja2Parser.MultiplicativeExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#powerExpr}.
	 * @param ctx the parse tree
	 */
	void enterPowerExpr(jinja2Parser.PowerExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#powerExpr}.
	 * @param ctx the parse tree
	 */
	void exitPowerExpr(jinja2Parser.PowerExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryExpression}
	 * labeled alternative in {@link jinja2Parser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(jinja2Parser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryExpression}
	 * labeled alternative in {@link jinja2Parser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(jinja2Parser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryPassThrough}
	 * labeled alternative in {@link jinja2Parser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryPassThrough(jinja2Parser.UnaryPassThroughContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryPassThrough}
	 * labeled alternative in {@link jinja2Parser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryPassThrough(jinja2Parser.UnaryPassThroughContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#postfixExpr}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpr(jinja2Parser.PostfixExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#postfixExpr}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpr(jinja2Parser.PostfixExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DotAccessOp}
	 * labeled alternative in {@link jinja2Parser#postfixOp}.
	 * @param ctx the parse tree
	 */
	void enterDotAccessOp(jinja2Parser.DotAccessOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DotAccessOp}
	 * labeled alternative in {@link jinja2Parser#postfixOp}.
	 * @param ctx the parse tree
	 */
	void exitDotAccessOp(jinja2Parser.DotAccessOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IndexAccessOp}
	 * labeled alternative in {@link jinja2Parser#postfixOp}.
	 * @param ctx the parse tree
	 */
	void enterIndexAccessOp(jinja2Parser.IndexAccessOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IndexAccessOp}
	 * labeled alternative in {@link jinja2Parser#postfixOp}.
	 * @param ctx the parse tree
	 */
	void exitIndexAccessOp(jinja2Parser.IndexAccessOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SliceAccessOp}
	 * labeled alternative in {@link jinja2Parser#postfixOp}.
	 * @param ctx the parse tree
	 */
	void enterSliceAccessOp(jinja2Parser.SliceAccessOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SliceAccessOp}
	 * labeled alternative in {@link jinja2Parser#postfixOp}.
	 * @param ctx the parse tree
	 */
	void exitSliceAccessOp(jinja2Parser.SliceAccessOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallOp}
	 * labeled alternative in {@link jinja2Parser#postfixOp}.
	 * @param ctx the parse tree
	 */
	void enterCallOp(jinja2Parser.CallOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallOp}
	 * labeled alternative in {@link jinja2Parser#postfixOp}.
	 * @param ctx the parse tree
	 */
	void exitCallOp(jinja2Parser.CallOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberLiteral}
	 * labeled alternative in {@link jinja2Parser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterNumberLiteral(jinja2Parser.NumberLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberLiteral}
	 * labeled alternative in {@link jinja2Parser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitNumberLiteral(jinja2Parser.NumberLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link jinja2Parser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(jinja2Parser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link jinja2Parser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(jinja2Parser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrueLiteral}
	 * labeled alternative in {@link jinja2Parser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterTrueLiteral(jinja2Parser.TrueLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrueLiteral}
	 * labeled alternative in {@link jinja2Parser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitTrueLiteral(jinja2Parser.TrueLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FalseLiteral}
	 * labeled alternative in {@link jinja2Parser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterFalseLiteral(jinja2Parser.FalseLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FalseLiteral}
	 * labeled alternative in {@link jinja2Parser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitFalseLiteral(jinja2Parser.FalseLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NoneLiteral}
	 * labeled alternative in {@link jinja2Parser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterNoneLiteral(jinja2Parser.NoneLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NoneLiteral}
	 * labeled alternative in {@link jinja2Parser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitNoneLiteral(jinja2Parser.NoneLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableExpr}
	 * labeled alternative in {@link jinja2Parser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterVariableExpr(jinja2Parser.VariableExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableExpr}
	 * labeled alternative in {@link jinja2Parser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitVariableExpr(jinja2Parser.VariableExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListExpr}
	 * labeled alternative in {@link jinja2Parser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterListExpr(jinja2Parser.ListExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListExpr}
	 * labeled alternative in {@link jinja2Parser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitListExpr(jinja2Parser.ListExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DictExpr}
	 * labeled alternative in {@link jinja2Parser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterDictExpr(jinja2Parser.DictExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DictExpr}
	 * labeled alternative in {@link jinja2Parser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitDictExpr(jinja2Parser.DictExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link jinja2Parser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(jinja2Parser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link jinja2Parser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(jinja2Parser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(jinja2Parser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(jinja2Parser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#dict}.
	 * @param ctx the parse tree
	 */
	void enterDict(jinja2Parser.DictContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#dict}.
	 * @param ctx the parse tree
	 */
	void exitDict(jinja2Parser.DictContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#dictEntry}.
	 * @param ctx the parse tree
	 */
	void enterDictEntry(jinja2Parser.DictEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#dictEntry}.
	 * @param ctx the parse tree
	 */
	void exitDictEntry(jinja2Parser.DictEntryContext ctx);
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
	 * Enter a parse tree produced by {@link jinja2Parser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(jinja2Parser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(jinja2Parser.ArgumentContext ctx);
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
	 * Enter a parse tree produced by the {@code SingleTarget}
	 * labeled alternative in {@link jinja2Parser#forTarget}.
	 * @param ctx the parse tree
	 */
	void enterSingleTarget(jinja2Parser.SingleTargetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SingleTarget}
	 * labeled alternative in {@link jinja2Parser#forTarget}.
	 * @param ctx the parse tree
	 */
	void exitSingleTarget(jinja2Parser.SingleTargetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TupleTarget}
	 * labeled alternative in {@link jinja2Parser#forTarget}.
	 * @param ctx the parse tree
	 */
	void enterTupleTarget(jinja2Parser.TupleTargetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TupleTarget}
	 * labeled alternative in {@link jinja2Parser#forTarget}.
	 * @param ctx the parse tree
	 */
	void exitTupleTarget(jinja2Parser.TupleTargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#elseForBranch}.
	 * @param ctx the parse tree
	 */
	void enterElseForBranch(jinja2Parser.ElseForBranchContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#elseForBranch}.
	 * @param ctx the parse tree
	 */
	void exitElseForBranch(jinja2Parser.ElseForBranchContext ctx);
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
	 * Enter a parse tree produced by the {@code SimpleTarget}
	 * labeled alternative in {@link jinja2Parser#setTarget}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTarget(jinja2Parser.SimpleTargetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleTarget}
	 * labeled alternative in {@link jinja2Parser#setTarget}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTarget(jinja2Parser.SimpleTargetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TupleSetTarget}
	 * labeled alternative in {@link jinja2Parser#setTarget}.
	 * @param ctx the parse tree
	 */
	void enterTupleSetTarget(jinja2Parser.TupleSetTargetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TupleSetTarget}
	 * labeled alternative in {@link jinja2Parser#setTarget}.
	 * @param ctx the parse tree
	 */
	void exitTupleSetTarget(jinja2Parser.TupleSetTargetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NamespaceTarget}
	 * labeled alternative in {@link jinja2Parser#setTarget}.
	 * @param ctx the parse tree
	 */
	void enterNamespaceTarget(jinja2Parser.NamespaceTargetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NamespaceTarget}
	 * labeled alternative in {@link jinja2Parser#setTarget}.
	 * @param ctx the parse tree
	 */
	void exitNamespaceTarget(jinja2Parser.NamespaceTargetContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#setBlockStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetBlockStatement(jinja2Parser.SetBlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#setBlockStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetBlockStatement(jinja2Parser.SetBlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#macroStatement}.
	 * @param ctx the parse tree
	 */
	void enterMacroStatement(jinja2Parser.MacroStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#macroStatement}.
	 * @param ctx the parse tree
	 */
	void exitMacroStatement(jinja2Parser.MacroStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#macroParams}.
	 * @param ctx the parse tree
	 */
	void enterMacroParams(jinja2Parser.MacroParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#macroParams}.
	 * @param ctx the parse tree
	 */
	void exitMacroParams(jinja2Parser.MacroParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#macroParam}.
	 * @param ctx the parse tree
	 */
	void enterMacroParam(jinja2Parser.MacroParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#macroParam}.
	 * @param ctx the parse tree
	 */
	void exitMacroParam(jinja2Parser.MacroParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#callBlock}.
	 * @param ctx the parse tree
	 */
	void enterCallBlock(jinja2Parser.CallBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#callBlock}.
	 * @param ctx the parse tree
	 */
	void exitCallBlock(jinja2Parser.CallBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(jinja2Parser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(jinja2Parser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#fromImportStatement}.
	 * @param ctx the parse tree
	 */
	void enterFromImportStatement(jinja2Parser.FromImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#fromImportStatement}.
	 * @param ctx the parse tree
	 */
	void exitFromImportStatement(jinja2Parser.FromImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#importList}.
	 * @param ctx the parse tree
	 */
	void enterImportList(jinja2Parser.ImportListContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#importList}.
	 * @param ctx the parse tree
	 */
	void exitImportList(jinja2Parser.ImportListContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#importItem}.
	 * @param ctx the parse tree
	 */
	void enterImportItem(jinja2Parser.ImportItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#importItem}.
	 * @param ctx the parse tree
	 */
	void exitImportItem(jinja2Parser.ImportItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#withBlock}.
	 * @param ctx the parse tree
	 */
	void enterWithBlock(jinja2Parser.WithBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#withBlock}.
	 * @param ctx the parse tree
	 */
	void exitWithBlock(jinja2Parser.WithBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#assignments}.
	 * @param ctx the parse tree
	 */
	void enterAssignments(jinja2Parser.AssignmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#assignments}.
	 * @param ctx the parse tree
	 */
	void exitAssignments(jinja2Parser.AssignmentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#withAssignment}.
	 * @param ctx the parse tree
	 */
	void enterWithAssignment(jinja2Parser.WithAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#withAssignment}.
	 * @param ctx the parse tree
	 */
	void exitWithAssignment(jinja2Parser.WithAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#filterBlock}.
	 * @param ctx the parse tree
	 */
	void enterFilterBlock(jinja2Parser.FilterBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#filterBlock}.
	 * @param ctx the parse tree
	 */
	void exitFilterBlock(jinja2Parser.FilterBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#doStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(jinja2Parser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#doStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(jinja2Parser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#autoescapeBlock}.
	 * @param ctx the parse tree
	 */
	void enterAutoescapeBlock(jinja2Parser.AutoescapeBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#autoescapeBlock}.
	 * @param ctx the parse tree
	 */
	void exitAutoescapeBlock(jinja2Parser.AutoescapeBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#cssStylesheet}.
	 * @param ctx the parse tree
	 */
	void enterCssStylesheet(jinja2Parser.CssStylesheetContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#cssStylesheet}.
	 * @param ctx the parse tree
	 */
	void exitCssStylesheet(jinja2Parser.CssStylesheetContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#cssRule}.
	 * @param ctx the parse tree
	 */
	void enterCssRule(jinja2Parser.CssRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#cssRule}.
	 * @param ctx the parse tree
	 */
	void exitCssRule(jinja2Parser.CssRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ElementSelector}
	 * labeled alternative in {@link jinja2Parser#cssSelector}.
	 * @param ctx the parse tree
	 */
	void enterElementSelector(jinja2Parser.ElementSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ElementSelector}
	 * labeled alternative in {@link jinja2Parser#cssSelector}.
	 * @param ctx the parse tree
	 */
	void exitElementSelector(jinja2Parser.ElementSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassSelector}
	 * labeled alternative in {@link jinja2Parser#cssSelector}.
	 * @param ctx the parse tree
	 */
	void enterClassSelector(jinja2Parser.ClassSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassSelector}
	 * labeled alternative in {@link jinja2Parser#cssSelector}.
	 * @param ctx the parse tree
	 */
	void exitClassSelector(jinja2Parser.ClassSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ElementPseudoSelector}
	 * labeled alternative in {@link jinja2Parser#cssSelector}.
	 * @param ctx the parse tree
	 */
	void enterElementPseudoSelector(jinja2Parser.ElementPseudoSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ElementPseudoSelector}
	 * labeled alternative in {@link jinja2Parser#cssSelector}.
	 * @param ctx the parse tree
	 */
	void exitElementPseudoSelector(jinja2Parser.ElementPseudoSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassPseudoSelector}
	 * labeled alternative in {@link jinja2Parser#cssSelector}.
	 * @param ctx the parse tree
	 */
	void enterClassPseudoSelector(jinja2Parser.ClassPseudoSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassPseudoSelector}
	 * labeled alternative in {@link jinja2Parser#cssSelector}.
	 * @param ctx the parse tree
	 */
	void exitClassPseudoSelector(jinja2Parser.ClassPseudoSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DescendantSelector}
	 * labeled alternative in {@link jinja2Parser#cssSelector}.
	 * @param ctx the parse tree
	 */
	void enterDescendantSelector(jinja2Parser.DescendantSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DescendantSelector}
	 * labeled alternative in {@link jinja2Parser#cssSelector}.
	 * @param ctx the parse tree
	 */
	void exitDescendantSelector(jinja2Parser.DescendantSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ElementClassSelector}
	 * labeled alternative in {@link jinja2Parser#cssSelector}.
	 * @param ctx the parse tree
	 */
	void enterElementClassSelector(jinja2Parser.ElementClassSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ElementClassSelector}
	 * labeled alternative in {@link jinja2Parser#cssSelector}.
	 * @param ctx the parse tree
	 */
	void exitElementClassSelector(jinja2Parser.ElementClassSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#cssElementSelector}.
	 * @param ctx the parse tree
	 */
	void enterCssElementSelector(jinja2Parser.CssElementSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#cssElementSelector}.
	 * @param ctx the parse tree
	 */
	void exitCssElementSelector(jinja2Parser.CssElementSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#cssClassSelector}.
	 * @param ctx the parse tree
	 */
	void enterCssClassSelector(jinja2Parser.CssClassSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#cssClassSelector}.
	 * @param ctx the parse tree
	 */
	void exitCssClassSelector(jinja2Parser.CssClassSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#cssClassName}.
	 * @param ctx the parse tree
	 */
	void enterCssClassName(jinja2Parser.CssClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#cssClassName}.
	 * @param ctx the parse tree
	 */
	void exitCssClassName(jinja2Parser.CssClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#cssPseudoClass}.
	 * @param ctx the parse tree
	 */
	void enterCssPseudoClass(jinja2Parser.CssPseudoClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#cssPseudoClass}.
	 * @param ctx the parse tree
	 */
	void exitCssPseudoClass(jinja2Parser.CssPseudoClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#cssDescendantSelector}.
	 * @param ctx the parse tree
	 */
	void enterCssDescendantSelector(jinja2Parser.CssDescendantSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#cssDescendantSelector}.
	 * @param ctx the parse tree
	 */
	void exitCssDescendantSelector(jinja2Parser.CssDescendantSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssSimpleElement}
	 * labeled alternative in {@link jinja2Parser#cssSelectorSimple}.
	 * @param ctx the parse tree
	 */
	void enterCssSimpleElement(jinja2Parser.CssSimpleElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssSimpleElement}
	 * labeled alternative in {@link jinja2Parser#cssSelectorSimple}.
	 * @param ctx the parse tree
	 */
	void exitCssSimpleElement(jinja2Parser.CssSimpleElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssSimpleClass}
	 * labeled alternative in {@link jinja2Parser#cssSelectorSimple}.
	 * @param ctx the parse tree
	 */
	void enterCssSimpleClass(jinja2Parser.CssSimpleClassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssSimpleClass}
	 * labeled alternative in {@link jinja2Parser#cssSelectorSimple}.
	 * @param ctx the parse tree
	 */
	void exitCssSimpleClass(jinja2Parser.CssSimpleClassContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssSingleLengthDecl}
	 * labeled alternative in {@link jinja2Parser#cssDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterCssSingleLengthDecl(jinja2Parser.CssSingleLengthDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssSingleLengthDecl}
	 * labeled alternative in {@link jinja2Parser#cssDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitCssSingleLengthDecl(jinja2Parser.CssSingleLengthDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssMultipleLengthDecl}
	 * labeled alternative in {@link jinja2Parser#cssDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterCssMultipleLengthDecl(jinja2Parser.CssMultipleLengthDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssMultipleLengthDecl}
	 * labeled alternative in {@link jinja2Parser#cssDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitCssMultipleLengthDecl(jinja2Parser.CssMultipleLengthDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssColorDecl}
	 * labeled alternative in {@link jinja2Parser#cssDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterCssColorDecl(jinja2Parser.CssColorDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssColorDecl}
	 * labeled alternative in {@link jinja2Parser#cssDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitCssColorDecl(jinja2Parser.CssColorDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssKeywordDecl}
	 * labeled alternative in {@link jinja2Parser#cssDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterCssKeywordDecl(jinja2Parser.CssKeywordDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssKeywordDecl}
	 * labeled alternative in {@link jinja2Parser#cssDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitCssKeywordDecl(jinja2Parser.CssKeywordDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssBoxShadowDecl}
	 * labeled alternative in {@link jinja2Parser#cssDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterCssBoxShadowDecl(jinja2Parser.CssBoxShadowDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssBoxShadowDecl}
	 * labeled alternative in {@link jinja2Parser#cssDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitCssBoxShadowDecl(jinja2Parser.CssBoxShadowDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssBorderDecl}
	 * labeled alternative in {@link jinja2Parser#cssDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterCssBorderDecl(jinja2Parser.CssBorderDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssBorderDecl}
	 * labeled alternative in {@link jinja2Parser#cssDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitCssBorderDecl(jinja2Parser.CssBorderDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssTransitionDecl}
	 * labeled alternative in {@link jinja2Parser#cssDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterCssTransitionDecl(jinja2Parser.CssTransitionDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssTransitionDecl}
	 * labeled alternative in {@link jinja2Parser#cssDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitCssTransitionDecl(jinja2Parser.CssTransitionDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssTransformDecl}
	 * labeled alternative in {@link jinja2Parser#cssDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterCssTransformDecl(jinja2Parser.CssTransformDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssTransformDecl}
	 * labeled alternative in {@link jinja2Parser#cssDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitCssTransformDecl(jinja2Parser.CssTransformDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssBackgroundDecl}
	 * labeled alternative in {@link jinja2Parser#cssDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterCssBackgroundDecl(jinja2Parser.CssBackgroundDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssBackgroundDecl}
	 * labeled alternative in {@link jinja2Parser#cssDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitCssBackgroundDecl(jinja2Parser.CssBackgroundDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssFontFamilyDecl}
	 * labeled alternative in {@link jinja2Parser#cssDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterCssFontFamilyDecl(jinja2Parser.CssFontFamilyDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssFontFamilyDecl}
	 * labeled alternative in {@link jinja2Parser#cssDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitCssFontFamilyDecl(jinja2Parser.CssFontFamilyDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssFontWeightDecl}
	 * labeled alternative in {@link jinja2Parser#cssDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterCssFontWeightDecl(jinja2Parser.CssFontWeightDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssFontWeightDecl}
	 * labeled alternative in {@link jinja2Parser#cssDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitCssFontWeightDecl(jinja2Parser.CssFontWeightDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssBoxSizingDecl}
	 * labeled alternative in {@link jinja2Parser#cssDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterCssBoxSizingDecl(jinja2Parser.CssBoxSizingDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssBoxSizingDecl}
	 * labeled alternative in {@link jinja2Parser#cssDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitCssBoxSizingDecl(jinja2Parser.CssBoxSizingDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssOutlineDecl}
	 * labeled alternative in {@link jinja2Parser#cssDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterCssOutlineDecl(jinja2Parser.CssOutlineDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssOutlineDecl}
	 * labeled alternative in {@link jinja2Parser#cssDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitCssOutlineDecl(jinja2Parser.CssOutlineDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#singleLengthDecl}.
	 * @param ctx the parse tree
	 */
	void enterSingleLengthDecl(jinja2Parser.SingleLengthDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#singleLengthDecl}.
	 * @param ctx the parse tree
	 */
	void exitSingleLengthDecl(jinja2Parser.SingleLengthDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#singleLengthProp}.
	 * @param ctx the parse tree
	 */
	void enterSingleLengthProp(jinja2Parser.SingleLengthPropContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#singleLengthProp}.
	 * @param ctx the parse tree
	 */
	void exitSingleLengthProp(jinja2Parser.SingleLengthPropContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#multipleLengthDecl}.
	 * @param ctx the parse tree
	 */
	void enterMultipleLengthDecl(jinja2Parser.MultipleLengthDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#multipleLengthDecl}.
	 * @param ctx the parse tree
	 */
	void exitMultipleLengthDecl(jinja2Parser.MultipleLengthDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#multiLengthProp}.
	 * @param ctx the parse tree
	 */
	void enterMultiLengthProp(jinja2Parser.MultiLengthPropContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#multiLengthProp}.
	 * @param ctx the parse tree
	 */
	void exitMultiLengthProp(jinja2Parser.MultiLengthPropContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#cssMultiLengthValue}.
	 * @param ctx the parse tree
	 */
	void enterCssMultiLengthValue(jinja2Parser.CssMultiLengthValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#cssMultiLengthValue}.
	 * @param ctx the parse tree
	 */
	void exitCssMultiLengthValue(jinja2Parser.CssMultiLengthValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#colorDecl}.
	 * @param ctx the parse tree
	 */
	void enterColorDecl(jinja2Parser.ColorDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#colorDecl}.
	 * @param ctx the parse tree
	 */
	void exitColorDecl(jinja2Parser.ColorDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#colorProp}.
	 * @param ctx the parse tree
	 */
	void enterColorProp(jinja2Parser.ColorPropContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#colorProp}.
	 * @param ctx the parse tree
	 */
	void exitColorProp(jinja2Parser.ColorPropContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssColorLiteral}
	 * labeled alternative in {@link jinja2Parser#cssColorValue}.
	 * @param ctx the parse tree
	 */
	void enterCssColorLiteral(jinja2Parser.CssColorLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssColorLiteral}
	 * labeled alternative in {@link jinja2Parser#cssColorValue}.
	 * @param ctx the parse tree
	 */
	void exitCssColorLiteral(jinja2Parser.CssColorLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssColorKeyword}
	 * labeled alternative in {@link jinja2Parser#cssColorValue}.
	 * @param ctx the parse tree
	 */
	void enterCssColorKeyword(jinja2Parser.CssColorKeywordContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssColorKeyword}
	 * labeled alternative in {@link jinja2Parser#cssColorValue}.
	 * @param ctx the parse tree
	 */
	void exitCssColorKeyword(jinja2Parser.CssColorKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#keywordDecl}.
	 * @param ctx the parse tree
	 */
	void enterKeywordDecl(jinja2Parser.KeywordDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#keywordDecl}.
	 * @param ctx the parse tree
	 */
	void exitKeywordDecl(jinja2Parser.KeywordDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#keywordProp}.
	 * @param ctx the parse tree
	 */
	void enterKeywordProp(jinja2Parser.KeywordPropContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#keywordProp}.
	 * @param ctx the parse tree
	 */
	void exitKeywordProp(jinja2Parser.KeywordPropContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#boxShadowDecl}.
	 * @param ctx the parse tree
	 */
	void enterBoxShadowDecl(jinja2Parser.BoxShadowDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#boxShadowDecl}.
	 * @param ctx the parse tree
	 */
	void exitBoxShadowDecl(jinja2Parser.BoxShadowDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#boxShadowValue}.
	 * @param ctx the parse tree
	 */
	void enterBoxShadowValue(jinja2Parser.BoxShadowValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#boxShadowValue}.
	 * @param ctx the parse tree
	 */
	void exitBoxShadowValue(jinja2Parser.BoxShadowValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssColorOrFuncColor}
	 * labeled alternative in {@link jinja2Parser#cssColorOrFunction}.
	 * @param ctx the parse tree
	 */
	void enterCssColorOrFuncColor(jinja2Parser.CssColorOrFuncColorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssColorOrFuncColor}
	 * labeled alternative in {@link jinja2Parser#cssColorOrFunction}.
	 * @param ctx the parse tree
	 */
	void exitCssColorOrFuncColor(jinja2Parser.CssColorOrFuncColorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssColorOrFuncFunc}
	 * labeled alternative in {@link jinja2Parser#cssColorOrFunction}.
	 * @param ctx the parse tree
	 */
	void enterCssColorOrFuncFunc(jinja2Parser.CssColorOrFuncFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssColorOrFuncFunc}
	 * labeled alternative in {@link jinja2Parser#cssColorOrFunction}.
	 * @param ctx the parse tree
	 */
	void exitCssColorOrFuncFunc(jinja2Parser.CssColorOrFuncFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#borderDecl}.
	 * @param ctx the parse tree
	 */
	void enterBorderDecl(jinja2Parser.BorderDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#borderDecl}.
	 * @param ctx the parse tree
	 */
	void exitBorderDecl(jinja2Parser.BorderDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#borderProp}.
	 * @param ctx the parse tree
	 */
	void enterBorderProp(jinja2Parser.BorderPropContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#borderProp}.
	 * @param ctx the parse tree
	 */
	void exitBorderProp(jinja2Parser.BorderPropContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#transitionDecl}.
	 * @param ctx the parse tree
	 */
	void enterTransitionDecl(jinja2Parser.TransitionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#transitionDecl}.
	 * @param ctx the parse tree
	 */
	void exitTransitionDecl(jinja2Parser.TransitionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#cssTransitionProperty}.
	 * @param ctx the parse tree
	 */
	void enterCssTransitionProperty(jinja2Parser.CssTransitionPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#cssTransitionProperty}.
	 * @param ctx the parse tree
	 */
	void exitCssTransitionProperty(jinja2Parser.CssTransitionPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#transformDecl}.
	 * @param ctx the parse tree
	 */
	void enterTransformDecl(jinja2Parser.TransformDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#transformDecl}.
	 * @param ctx the parse tree
	 */
	void exitTransformDecl(jinja2Parser.TransformDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#backgroundDecl}.
	 * @param ctx the parse tree
	 */
	void enterBackgroundDecl(jinja2Parser.BackgroundDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#backgroundDecl}.
	 * @param ctx the parse tree
	 */
	void exitBackgroundDecl(jinja2Parser.BackgroundDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssBgColor}
	 * labeled alternative in {@link jinja2Parser#cssBackgroundValue}.
	 * @param ctx the parse tree
	 */
	void enterCssBgColor(jinja2Parser.CssBgColorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssBgColor}
	 * labeled alternative in {@link jinja2Parser#cssBackgroundValue}.
	 * @param ctx the parse tree
	 */
	void exitCssBgColor(jinja2Parser.CssBgColorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssBgKeyword}
	 * labeled alternative in {@link jinja2Parser#cssBackgroundValue}.
	 * @param ctx the parse tree
	 */
	void enterCssBgKeyword(jinja2Parser.CssBgKeywordContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssBgKeyword}
	 * labeled alternative in {@link jinja2Parser#cssBackgroundValue}.
	 * @param ctx the parse tree
	 */
	void exitCssBgKeyword(jinja2Parser.CssBgKeywordContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssBgFunction}
	 * labeled alternative in {@link jinja2Parser#cssBackgroundValue}.
	 * @param ctx the parse tree
	 */
	void enterCssBgFunction(jinja2Parser.CssBgFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssBgFunction}
	 * labeled alternative in {@link jinja2Parser#cssBackgroundValue}.
	 * @param ctx the parse tree
	 */
	void exitCssBgFunction(jinja2Parser.CssBgFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#fontFamilyDecl}.
	 * @param ctx the parse tree
	 */
	void enterFontFamilyDecl(jinja2Parser.FontFamilyDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#fontFamilyDecl}.
	 * @param ctx the parse tree
	 */
	void exitFontFamilyDecl(jinja2Parser.FontFamilyDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#cssFontName}.
	 * @param ctx the parse tree
	 */
	void enterCssFontName(jinja2Parser.CssFontNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#cssFontName}.
	 * @param ctx the parse tree
	 */
	void exitCssFontName(jinja2Parser.CssFontNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#cssFontToken}.
	 * @param ctx the parse tree
	 */
	void enterCssFontToken(jinja2Parser.CssFontTokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#cssFontToken}.
	 * @param ctx the parse tree
	 */
	void exitCssFontToken(jinja2Parser.CssFontTokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#fontWeightDecl}.
	 * @param ctx the parse tree
	 */
	void enterFontWeightDecl(jinja2Parser.FontWeightDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#fontWeightDecl}.
	 * @param ctx the parse tree
	 */
	void exitFontWeightDecl(jinja2Parser.FontWeightDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssFontWeightNum}
	 * labeled alternative in {@link jinja2Parser#cssFontWeightValue}.
	 * @param ctx the parse tree
	 */
	void enterCssFontWeightNum(jinja2Parser.CssFontWeightNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssFontWeightNum}
	 * labeled alternative in {@link jinja2Parser#cssFontWeightValue}.
	 * @param ctx the parse tree
	 */
	void exitCssFontWeightNum(jinja2Parser.CssFontWeightNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssFontWeightKeyword}
	 * labeled alternative in {@link jinja2Parser#cssFontWeightValue}.
	 * @param ctx the parse tree
	 */
	void enterCssFontWeightKeyword(jinja2Parser.CssFontWeightKeywordContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssFontWeightKeyword}
	 * labeled alternative in {@link jinja2Parser#cssFontWeightValue}.
	 * @param ctx the parse tree
	 */
	void exitCssFontWeightKeyword(jinja2Parser.CssFontWeightKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#boxSizingDecl}.
	 * @param ctx the parse tree
	 */
	void enterBoxSizingDecl(jinja2Parser.BoxSizingDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#boxSizingDecl}.
	 * @param ctx the parse tree
	 */
	void exitBoxSizingDecl(jinja2Parser.BoxSizingDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#outlineDecl}.
	 * @param ctx the parse tree
	 */
	void enterOutlineDecl(jinja2Parser.OutlineDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#outlineDecl}.
	 * @param ctx the parse tree
	 */
	void exitOutlineDecl(jinja2Parser.OutlineDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssOutlineKeyword}
	 * labeled alternative in {@link jinja2Parser#cssOutlineValue}.
	 * @param ctx the parse tree
	 */
	void enterCssOutlineKeyword(jinja2Parser.CssOutlineKeywordContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssOutlineKeyword}
	 * labeled alternative in {@link jinja2Parser#cssOutlineValue}.
	 * @param ctx the parse tree
	 */
	void exitCssOutlineKeyword(jinja2Parser.CssOutlineKeywordContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssOutlineFull}
	 * labeled alternative in {@link jinja2Parser#cssOutlineValue}.
	 * @param ctx the parse tree
	 */
	void enterCssOutlineFull(jinja2Parser.CssOutlineFullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssOutlineFull}
	 * labeled alternative in {@link jinja2Parser#cssOutlineValue}.
	 * @param ctx the parse tree
	 */
	void exitCssOutlineFull(jinja2Parser.CssOutlineFullContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#outlineValue}.
	 * @param ctx the parse tree
	 */
	void enterOutlineValue(jinja2Parser.OutlineValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#outlineValue}.
	 * @param ctx the parse tree
	 */
	void exitOutlineValue(jinja2Parser.OutlineValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#cssLength}.
	 * @param ctx the parse tree
	 */
	void enterCssLength(jinja2Parser.CssLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#cssLength}.
	 * @param ctx the parse tree
	 */
	void exitCssLength(jinja2Parser.CssLengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#cssColor}.
	 * @param ctx the parse tree
	 */
	void enterCssColor(jinja2Parser.CssColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#cssColor}.
	 * @param ctx the parse tree
	 */
	void exitCssColor(jinja2Parser.CssColorContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#cssKeyword}.
	 * @param ctx the parse tree
	 */
	void enterCssKeyword(jinja2Parser.CssKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#cssKeyword}.
	 * @param ctx the parse tree
	 */
	void exitCssKeyword(jinja2Parser.CssKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#cssNumber}.
	 * @param ctx the parse tree
	 */
	void enterCssNumber(jinja2Parser.CssNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#cssNumber}.
	 * @param ctx the parse tree
	 */
	void exitCssNumber(jinja2Parser.CssNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#cssTime}.
	 * @param ctx the parse tree
	 */
	void enterCssTime(jinja2Parser.CssTimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#cssTime}.
	 * @param ctx the parse tree
	 */
	void exitCssTime(jinja2Parser.CssTimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#cssIdent}.
	 * @param ctx the parse tree
	 */
	void enterCssIdent(jinja2Parser.CssIdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#cssIdent}.
	 * @param ctx the parse tree
	 */
	void exitCssIdent(jinja2Parser.CssIdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssRgbaFunc}
	 * labeled alternative in {@link jinja2Parser#cssFunction}.
	 * @param ctx the parse tree
	 */
	void enterCssRgbaFunc(jinja2Parser.CssRgbaFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssRgbaFunc}
	 * labeled alternative in {@link jinja2Parser#cssFunction}.
	 * @param ctx the parse tree
	 */
	void exitCssRgbaFunc(jinja2Parser.CssRgbaFuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssTransformFunc}
	 * labeled alternative in {@link jinja2Parser#cssFunction}.
	 * @param ctx the parse tree
	 */
	void enterCssTransformFunc(jinja2Parser.CssTransformFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssTransformFunc}
	 * labeled alternative in {@link jinja2Parser#cssFunction}.
	 * @param ctx the parse tree
	 */
	void exitCssTransformFunc(jinja2Parser.CssTransformFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#cssRgbaFunction}.
	 * @param ctx the parse tree
	 */
	void enterCssRgbaFunction(jinja2Parser.CssRgbaFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#cssRgbaFunction}.
	 * @param ctx the parse tree
	 */
	void exitCssRgbaFunction(jinja2Parser.CssRgbaFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinja2Parser#cssTransformFunction}.
	 * @param ctx the parse tree
	 */
	void enterCssTransformFunction(jinja2Parser.CssTransformFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinja2Parser#cssTransformFunction}.
	 * @param ctx the parse tree
	 */
	void exitCssTransformFunction(jinja2Parser.CssTransformFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssValueLength}
	 * labeled alternative in {@link jinja2Parser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterCssValueLength(jinja2Parser.CssValueLengthContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssValueLength}
	 * labeled alternative in {@link jinja2Parser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitCssValueLength(jinja2Parser.CssValueLengthContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssValueColor}
	 * labeled alternative in {@link jinja2Parser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterCssValueColor(jinja2Parser.CssValueColorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssValueColor}
	 * labeled alternative in {@link jinja2Parser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitCssValueColor(jinja2Parser.CssValueColorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssValueKeyword}
	 * labeled alternative in {@link jinja2Parser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterCssValueKeyword(jinja2Parser.CssValueKeywordContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssValueKeyword}
	 * labeled alternative in {@link jinja2Parser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitCssValueKeyword(jinja2Parser.CssValueKeywordContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssValueNumber}
	 * labeled alternative in {@link jinja2Parser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterCssValueNumber(jinja2Parser.CssValueNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssValueNumber}
	 * labeled alternative in {@link jinja2Parser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitCssValueNumber(jinja2Parser.CssValueNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssValueFunction}
	 * labeled alternative in {@link jinja2Parser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterCssValueFunction(jinja2Parser.CssValueFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssValueFunction}
	 * labeled alternative in {@link jinja2Parser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitCssValueFunction(jinja2Parser.CssValueFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssValueIdent}
	 * labeled alternative in {@link jinja2Parser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterCssValueIdent(jinja2Parser.CssValueIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssValueIdent}
	 * labeled alternative in {@link jinja2Parser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitCssValueIdent(jinja2Parser.CssValueIdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssValueTime}
	 * labeled alternative in {@link jinja2Parser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterCssValueTime(jinja2Parser.CssValueTimeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssValueTime}
	 * labeled alternative in {@link jinja2Parser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitCssValueTime(jinja2Parser.CssValueTimeContext ctx);
}