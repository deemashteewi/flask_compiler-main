package antlr.ast.visitor;

import antlr.ast.css.*;
import antlr.ast.css.properties.*;
import antlr.ast.css.selectors.*;
import antlr.ast.css.values.*;
import antlr.ast.jinja2.TemplateNode;
import antlr.ast.jinja2.blocks.*;
import antlr.ast.jinja2.content.*;
import antlr.ast.jinja2.content.elements.*;
import antlr.ast.jinja2.content.elements.document.*;
import antlr.ast.jinja2.content.elements.sectioning.*;
import antlr.ast.jinja2.content.elements.text.*;
import antlr.ast.jinja2.content.elements.form.*;
import antlr.ast.jinja2.content.elements.media.*;
import antlr.ast.jinja2.content.elements.embedded.*;
import antlr.ast.jinja2.expressions.*;
import antlr.ast.jinja2.expressions.literals.*;
import antlr.ast.jinja2.expressions.operations.*;
import antlr.ast.jinja2.statements.*;
import antlr.ast.jinja2.targets.*;
import antlr.ast.jinja2.*;


import antlr.ast.python.ProgramNode;
import antlr.ast.python.expressions.access.DotAccessNode;
import antlr.ast.python.expressions.access.FunctionCallNode;
import antlr.ast.python.expressions.access.IndexAccessNode;
import antlr.ast.python.expressions.access.KeywordArgumentNode;
import antlr.ast.python.expressions.access.VariableNode;
import antlr.ast.python.expressions.literals.BooleanNode;
import antlr.ast.python.expressions.literals.DictEntryNode;
import antlr.ast.python.expressions.literals.DictNode;
import antlr.ast.python.expressions.literals.ListNode;
import antlr.ast.python.expressions.literals.NumberDoubleNode;
import antlr.ast.python.expressions.literals.NumberIntegerNode;
import antlr.ast.python.expressions.literals.StringNode;
import antlr.ast.python.expressions.operations.BinaryOpNode;
import antlr.ast.python.expressions.operations.ComparisonNode;
import antlr.ast.python.expressions.operations.LogicalOpNode;
import antlr.ast.python.expressions.operations.UnaryOpNode;
import antlr.ast.python.parameters.KeywordOnlyParamNode;
import antlr.ast.python.parameters.KeywordOnlySeparator;
import antlr.ast.python.parameters.KwargsNode;
import antlr.ast.python.parameters.ParameterNode;
import antlr.ast.python.parameters.PositionalOnlyParamNode;
import antlr.ast.python.parameters.RegularParamNode;
import antlr.ast.python.parameters.StarArgsNode;
import antlr.ast.python.expressions.ListComprehensionNode;
import antlr.ast.python.expressions.literals.NoneNode;
import antlr.ast.python.statements.AssignmentNode;
import antlr.ast.python.statements.BlockNode;
import antlr.ast.python.statements.BreakNode;
import antlr.ast.python.statements.ClassDefinitionNode;
import antlr.ast.python.statements.ContinueNode;
import antlr.ast.python.statements.ExpressionStatementNode;
import antlr.ast.python.statements.ForStatementNode;
import antlr.ast.python.statements.FunctionDefinitionNode;
import antlr.ast.python.statements.IfStatementNode;
import antlr.ast.python.statements.ImportStatement;
import antlr.ast.python.statements.ImportedClassNode;
import antlr.ast.python.statements.PrintNode;
import antlr.ast.python.statements.ReturnNode;
import antlr.ast.python.statements.WhileStatementNode;

/**
 * واجهة الزائر (Visitor Interface) تطبيق نمط Visitor Pattern للتعامل مع الشجرة
 *
 * @param <T> نوع القيمة المُرجعة من كل زيارة
 */
public interface ASTVisitor<T> {

    // ==================== Python Nodes ====================
    T visit(ProgramNode node);

    T visit(BlockNode node);

    T visit(AssignmentNode node);

    T visit(PrintNode node);

    T visit(ReturnNode node);

    T visit(IfStatementNode node);

    T visit(ForStatementNode node);

    T visit(WhileStatementNode node);

    T visit(BreakNode node);

    T visit(ContinueNode node);

    T visit(ExpressionStatementNode node);

    T visit(ImportedClassNode node);

    T visit(ImportStatement node);

    T visit(KeywordOnlyParamNode node);

    T visit(KwargsNode node);

    T visit(ParameterNode node);

    T visit(PositionalOnlyParamNode node);

    T visit(RegularParamNode node);

    T visit(StarArgsNode node);

    T visit(KeywordOnlySeparator node);

    T visit(FunctionDefinitionNode node);

    T visit(ClassDefinitionNode node);

    // ==================== Expression Nodes ====================
    T visit(BinaryOpNode node);

    T visit(UnaryOpNode node);

    T visit(NumberIntegerNode node);

    T visit(NumberDoubleNode node);

    T visit(VariableNode node);

    T visit(BooleanNode node);

    T visit(NoneNode node);

    T visit(ListNode node);

    T visit(ListComprehensionNode node);

    T visit(StringNode node);

    T visit(DictNode node);

    T visit(DictEntryNode node);

    T visit(IndexAccessNode node);

    T visit(DotAccessNode node);

    T visit(FunctionCallNode node);

    T visit(KeywordArgumentNode node);
    // ==================== Condition Nodes ====================

    T visit(ComparisonNode node);

    T visit(LogicalOpNode node);

    // ==================== Jinja2 Nodes ====================
    T visit(TemplateNode node);           // exists

    T visit(HtmlTextNode node);

    T visit(ExpressionBlockNode node);

    T visit(ForBlockNode node);

    T visit(IfBlockNode node);

    T visit(ElifBranchNode node);

    T visit(ElseBranchNode node);

    T visit(JinjaExpressionNode node);

    T visit(FilterNode node);

    T visit(ExtendsNode node);

    T visit(IncludeNode node);

    T visit(BlockDefinitionNode node);

    T visit(SetStatementNode node);

    T visit(SetBlockNode node);

    T visit(DoStatementNode node);

    T visit(ImportNode node);

    T visit(FromImportNode node);

    T visit(FromImportItemNode node);

    // Jinja2 Blocks
    T visit(MacroNode node);

    T visit(MacroParamNode node);

    T visit(WithBlockNode node);

    T visit(WithAssignmentNode node);

    T visit(FilterBlockNode node);

    T visit(CallBlockNode node);

    T visit(AutoescapeBlockNode node);

    T visit(EscapeModeNode node);

    T visit(BooleanEscapeModeNode node);

    T visit(StringEscapeModeNode node);

    // Jinja2 Expressions
    T visit(VariableExprNode node);

    T visit(DotAccessExprNode node);

    T visit(IndexAccessExprNode node);

    T visit(FunctionCallExprNode node);

    T visit(ParenExprNode node);

    T visit(SliceExprNode node);

    T visit(TernaryExprNode node);

    T visit(TestExprNode node);

    T visit(ArgumentNode node);

    // Jinja2 Literals
    T visit(JinjaBooleanNode node);

    T visit(JinjaStringNode node);

    T visit(JinjaNumberIntegerNode node);

    T visit(JinjaNumberDoubleNode node);

    T visit(JinjaNoneNode node);

    T visit(JinjaListNode node);

    T visit(JinjaDictNode node);

    T visit(JinjaDictEntryNode node);

    // Jinja2 Operations
    T visit(JinjaBinaryOpNode node);

    T visit(JinjaUnaryOpNode node);

    T visit(JinjaComparisonNode node);

    T visit(JinjaLogicalOpNode node);

    // Jinja2 Targets
    T visit(TargetNode node);

    T visit(SimpleTargetNode node);

    T visit(TupleTargetNode node);

    T visit(NamespaceTargetNode node);

    // ==================== HTML Nodes ====================

    // HTML Base Nodes
    T visit(HtmlElementNode node);

    T visit(HtmlAttributeValueNode node);

    // ==================== Specific HTML Element Nodes ====================

    // Document structure
    T visit(HtmlRootHtmlNode node);

    T visit(HeadHtmlNode node);

    T visit(BodyHtmlNode node);

    T visit(TitleHtmlNode node);

    // Sectioning
    T visit(DivHtmlNode node);

    T visit(H1HtmlNode node);

    // Text
    T visit(ParagraphHtmlNode node);

    T visit(AnchorHtmlNode node);

    // Forms
    T visit(FormHtmlNode node);

    T visit(LabelHtmlNode node);

    T visit(TextareaHtmlNode node);

    T visit(ButtonHtmlNode node);

    T visit(InputHtmlNode node);

    // Media
    T visit(ImgHtmlNode node);

    // Embedded
    T visit(StyleHtmlNode node);

    // Generic
    T visit(GenericHtmlNode node);

    // HTML Attribute
    T visit(HtmlAttributeNode node);

    // ==================== CSS Nodes ====================

    // CSS Structure
    T visit(StylesheetNode node);

    T visit(CSSStylesheetNode node);

    T visit(CSSRuleNode node);

    T visit(CSSDeclarationNode node);

    // CSS Selectors
    T visit(CSSElementSelectorNode node);

    T visit(CSSClassSelectorNode node);

    T visit(CSSPseudoClassSelectorNode node);

    T visit(CSSDescendantSelectorNode node);

    // CSS Property Nodes
    T visit(LengthPropertyNode node);

    T visit(MultiLengthPropertyNode node);

    T visit(ColorPropertyNode node);

    T visit(KeywordPropertyNode node);

    T visit(BoxShadowPropertyNode node);

    T visit(BorderPropertyNode node);

    T visit(TransitionPropertyNode node);

    T visit(TransformPropertyNode node);

    T visit(BackgroundPropertyNode node);

    T visit(FontFamilyPropertyNode node);

    T visit(FontWeightPropertyNode node);

    T visit(BoxSizingPropertyNode node);

    T visit(OutlinePropertyNode node);

    // CSS Value Nodes
    T visit(CSSLengthValueNode node);

    T visit(CSSColorValueNode node);

    T visit(CSSKeywordValueNode node);

    T visit(CSSNumberValueNode node);

    T visit(CSSTimeValueNode node);

    T visit(CSSIdentValueNode node);

    T visit(CSSFunctionValueNode node);

}
