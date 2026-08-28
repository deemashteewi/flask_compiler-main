
package antlr.visitor;

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
import antlr.ast.jinja2.expressions.operations.JinjaBinaryOpNode;
import antlr.ast.jinja2.expressions.operations.JinjaComparisonNode;
import antlr.ast.jinja2.expressions.operations.JinjaLogicalOpNode;
import antlr.ast.jinja2.expressions.operations.JinjaUnaryOpNode;
import antlr.ast.jinja2.statements.*;
import antlr.ast.jinja2.targets.NamespaceTargetNode;
import antlr.ast.jinja2.targets.SimpleTargetNode;
import antlr.ast.jinja2.targets.TargetNode;
import antlr.ast.jinja2.targets.TupleTargetNode;
import antlr.ast.node.ASTNode;
import antlr.ast.css.*;
import antlr.ast.css.selectors.*;
import antlr.ast.css.properties.*;
import antlr.ast.css.values.*;
import antlr.ast.python.ProgramNode;
import java.util.ArrayList;
import java.util.List;

import antlr.ast.python.StatementNode;
import antlr.ast.python.expressions.ExpressionNode;
import antlr.gen.jinja2.jinja2Lexer;
import antlr.gen.jinja2.jinja2Parser;
import antlr.gen.jinja2.jinja2ParserBaseVisitor;
import antlr.gen.jinja2.jinja2ParserVisitor;
import antlr.gen.python.pythonParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import antlr.ast.jinja2.statements.FromImportItemNode;
import antlr.symbol.Symbol;
import antlr.symbol.SymbolTable;
import antlr.semantic.SemanticError;

public class JinjaASTBuilder extends jinja2ParserBaseVisitor<ASTNode> {

    private final SymbolTable symbolTable = new SymbolTable();
    private SymbolTable currentScope = symbolTable;
    private final List<SemanticError> semanticErrors = new ArrayList<>();
    private boolean suppressUndefinedCheck = false;
    private int forLoopDepth = 0;
    private boolean extendsSeen = false;

    // أسماء جينجا2 المدمجة (لا تحتاج تعريف)
    private static final java.util.Set<String> JINJA_BUILTINS = java.util.Set.of(
            "loop", "self", "super", "varargs", "kwargs", "range", "dict",
            "lipsum", "cycler", "joiner", "namespace",
            "true", "false", "none", "True", "False", "None"
    );

    public JinjaASTBuilder() {
        // متغيرات السياق المتوقعة من Flask (render_template)
        symbolTable.define("products", Symbol.SymbolType.TEMPLATE_VARIABLE, 0, 0);
        symbolTable.define("product", Symbol.SymbolType.TEMPLATE_VARIABLE, 0, 0);
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }



    public List<SemanticError> getSemanticErrors() {
        return semanticErrors;
    }

    private void addError(SemanticError.ErrorType type, String message, int line, int col) {
        semanticErrors.add(new SemanticError(type, message, line, col));
    }

    private void defineTargetInScope(ASTNode targetNode, int line, int col) {
        if (targetNode instanceof SimpleTargetNode) {
            currentScope.define(((SimpleTargetNode) targetNode).getTarget(),
                    Symbol.SymbolType.TEMPLATE_VARIABLE, line, col);
        } else if (targetNode instanceof TupleTargetNode) {
            for (String t : ((TupleTargetNode) targetNode).getTargets()) {
                currentScope.define(t, Symbol.SymbolType.TEMPLATE_VARIABLE, line, col);
            }
        }
    }

    // أسماء الـ blocks المعرّفة بنفس القالب (لفحص التكرار)
    private final java.util.Set<String> definedBlockNames = new java.util.HashSet<>();


    @Override
    public ASTNode visitTemplate(jinja2Parser.TemplateContext ctx) {
        int line = ctx.getStart() != null ? ctx.getStart().getLine() : 1;

        TemplateNode templateNode = new TemplateNode(line);

        for (jinja2Parser.TemplateContentContext stmtCtx : ctx.templateContent()) {
            ASTNode stmtNode = visit(stmtCtx);
            if (stmtNode instanceof ASTNode) {
                templateNode.addContent((ASTNode) stmtNode);
            }
        }

        return templateNode;
    }


    @Override
    public ASTNode visitHtmlTextPart(jinja2Parser.HtmlTextPartContext ctx) {
        StringBuilder text = new StringBuilder();
        // ctx.htmlText() returns HtmlTextContext
        // HtmlTextContext.HTML_TEXT() returns List<TerminalNode>
        for (TerminalNode token : ctx.htmlText().HTML_TEXT()) {
            text.append(token.getText());
        }
        return new HtmlTextNode(text.toString(),
                safeGetLine(ctx),
                safeGetCol(ctx));
    }

    @Override
    public ASTNode visitExpressionOutput(jinja2Parser.ExpressionOutputContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);
        ExpressionBlockNode blockNode = new ExpressionBlockNode(line, col);

        ASTNode expressionNode = visit(ctx.expressionBlock().expr);
        if (expressionNode instanceof JinjaExpressionNode) {
            blockNode.setExpression((JinjaExpressionNode) expressionNode);
        }
        for (jinja2Parser.FilterContext filterContext : ctx.expressionBlock().filter()) {
            ASTNode filterNode = visit(filterContext);
            if (filterNode instanceof FilterNode) {
                blockNode.addFilter((FilterNode) filterNode);
            }
        }

        return blockNode;
    }


    @Override
    public ASTNode visitForLoopBlock(jinja2Parser.ForLoopBlockContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);

        ForBlockNode forBlockNode = new ForBlockNode(line, col);
        ASTNode targetNode = visit(ctx.forBlock().forStart().target);

        if (targetNode instanceof TargetNode) {
            forBlockNode.setTarget((TargetNode) targetNode);
        }

        ASTNode iterable = visit(ctx.forBlock().forStart().iterable);
        if (iterable instanceof JinjaExpressionNode) {
            forBlockNode.setIterable((JinjaExpressionNode) iterable);
        }

        currentScope = currentScope.enterScope("for_" + line);
        defineTargetInScope(targetNode, line, col);
        forLoopDepth++;

// condition is optional: (IF condition=expression)?
        if (ctx.forBlock().forStart().condition != null) {
            ASTNode condition = visit(ctx.forBlock().forStart().condition);
            if (condition instanceof JinjaExpressionNode) {
                forBlockNode.setCondition((JinjaExpressionNode) condition);
            }
        }

        for (jinja2Parser.TemplateContentContext ctxx : ctx.forBlock().body) {
            ASTNode bodyElement = visit(ctxx);
            forBlockNode.addToBody(bodyElement);
        }

        forLoopDepth--;
        currentScope = currentScope.exitScope();
        // elseForBranch is optional: elseForBranch?
        if (ctx.forBlock().elseForBranch() != null) {
            ASTNode elseBranch = visit(ctx.forBlock().elseForBranch());
            if (elseBranch instanceof ElseBranchNode) {
                forBlockNode.setElseBranch((ElseBranchNode) elseBranch);
            }
        }

        return forBlockNode;
    }


    @Override
    public ASTNode visitIfConditionBlock(jinja2Parser.IfConditionBlockContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);
        IfBlockNode ifBlockNode = new IfBlockNode(line, col);

        ASTNode condition = visit(ctx.ifBlock().ifStart().condition);
        if (condition instanceof JinjaExpressionNode) {
            ifBlockNode.setCondition((JinjaExpressionNode) condition);
        }

        for (jinja2Parser.TemplateContentContext ctxx : ctx.ifBlock().body) {
            ASTNode bodyElement = visit(ctxx);
            ifBlockNode.addToBody(bodyElement);
        }


        for (jinja2Parser.ElifBranchContext ctxx : ctx.ifBlock().elifBranch()) {

            ASTNode elifNode = visit(ctxx);
            if (elifNode instanceof ElifBranchNode) {
                ifBlockNode.addElifBranch((ElifBranchNode) elifNode);
            }
        }

        ElseBranchNode elseBranchNode = (ElseBranchNode) visit(ctx.ifBlock().elseBranch());
        if (elseBranchNode != null) {
            ifBlockNode.setElseBranch(elseBranchNode);
        }
        return ifBlockNode;
    }


    @Override
    public ASTNode visitExtendsStmt(jinja2Parser.ExtendsStmtContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);
        ExtendsNode extendsNode = new ExtendsNode(line, col);

        extendsNode.setParentTemplateName(ctx.extendsStatement().templateName.getText());

        if (extendsSeen) {
            addError(SemanticError.ErrorType.MULTIPLE_EXTENDS,
                    "استخدام {% extends %} أكثر من مرة بنفس القالب (مسموح مرة واحدة بس)", line, col);
        }
        extendsSeen = true;

        return extendsNode;
    }


    @Override
    public ASTNode visitIncludeStmt(jinja2Parser.IncludeStmtContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);
        IncludeNode includeNode = new IncludeNode(line, col);

        // Get template name (remove quotes from string)
        String templateName = ctx.includeStatement().templateName.getText();
        templateName = templateName.substring(1, templateName.length() - 1);  // Remove quotes
        includeNode.setIncludedTemplateName(templateName);

        // Check ignore missing
        if (ctx.includeStatement().ignoreMissing != null) {
            includeNode.setIgnoreMissing(true);
        }

        // Check context mode
        if (ctx.includeStatement().contextMode != null) {
            if (ctx.includeStatement().contextMode.getType() == jinja2Lexer.WITH) {
                includeNode.setContextMode(ContextMode.WITH_CONTEXT);
            } else {
                includeNode.setContextMode(ContextMode.WITHOUT_CONTEXT);
            }
        }

        return includeNode;
    }


    @Override
    public ASTNode visitBlockDefStmt(jinja2Parser.BlockDefStmtContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);

        BlockDefinitionNode blockDefinitionNode = new BlockDefinitionNode(line, col);

        String blockName = ctx.blockDefinition().name.getText();
        blockDefinitionNode.setName(blockName);

        if (!definedBlockNames.add(blockName)) {
            addError(SemanticError.ErrorType.REDECLARATION,
                    "إعادة تعريف الـ block '" + blockName + "' بنفس القالب", line, col);
        }

// إذا كتب اسم بعد {% endblock %} لازم يطابق اسم الـ block نفسه
        java.util.List<org.antlr.v4.runtime.tree.TerminalNode> names = ctx.blockDefinition().NAME();
        if (names.size() > 1) {
            String endName = names.get(1).getText();
            if (!endName.equals(blockName)) {
                addError(SemanticError.ErrorType.MISMATCHED_CLOSING_NAME,
                        "اسم {% endblock " + endName + " %} لا يطابق اسم الـ block '" + blockName + "'",
                        line, col);
            }
        }

        for (jinja2Parser.TemplateContentContext ctxx : ctx.blockDefinition().body) {
            ASTNode bodyElement = visit(ctxx);
            blockDefinitionNode.addChild(bodyElement);
        }

        if (ctx.blockDefinition().scoped != null) {
            blockDefinitionNode.setScoped(true);
        }

        return blockDefinitionNode;
    }


    @Override
    public ASTNode visitSetStmt(jinja2Parser.SetStmtContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);

        SetStatementNode setStatementNode = new SetStatementNode(line, col);
        ASTNode setTarget = visit(ctx.setStatement().setTarget());
        if (setTarget != null && setTarget instanceof TargetNode) {
            setStatementNode.setTarget((TargetNode) setTarget);
        }

        ASTNode value = visit(ctx.setStatement().value);
        if (value != null && value instanceof JinjaExpressionNode) {
            setStatementNode.setValue((JinjaExpressionNode) value);
        }


        for (jinja2Parser.FilterContext filterContext : ctx.setStatement().filter()) {
            ASTNode filterNode = visit(filterContext);
            if (filterNode instanceof FilterNode) {
                setStatementNode.addFilter((FilterNode) filterNode);
            }
        }

        defineTargetInScope(setTarget, line, col);

        return setStatementNode;
    }


    @Override
    public ASTNode visitSetBlockStmt(jinja2Parser.SetBlockStmtContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);
        SetBlockNode setBlockNode = new SetBlockNode(line, col);
        if (ctx.setBlockStatement().name != null) {
            setBlockNode.setName(ctx.setBlockStatement().name.getText());
            currentScope.define(ctx.setBlockStatement().name.getText(),
                    Symbol.SymbolType.TEMPLATE_VARIABLE, line, col);
        }

        for (jinja2Parser.TemplateContentContext ctxx : ctx.setBlockStatement().body) {
            ASTNode bodyElement = visit(ctxx);
            setBlockNode.addToBody(bodyElement);
        }
        return setBlockNode;
    }


    @Override
    public ASTNode visitMacroDefStmt(jinja2Parser.MacroDefStmtContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);
        MacroNode macroNode = new MacroNode(line, col);
        String macroName = ctx.macroStatement().name != null ? ctx.macroStatement().name.getText() : null;

        if (macroName != null) {
            macroNode.setName(macroName);

            if (currentScope.isDefinedLocally(macroName)) {
                addError(SemanticError.ErrorType.REDECLARATION,
                        "إعادة تعريف الـ macro '" + macroName + "' بنفس النطاق", line, col);
            } else {
                int paramCount = 0;
                if (ctx.macroStatement().macroParams() != null) {
                    paramCount = ctx.macroStatement().params.macroParam().size();
                }
                Symbol macroSymbol = new Symbol(macroName, Symbol.SymbolType.FUNCTION, line, col);
                macroSymbol.setValue(String.valueOf(paramCount));
                currentScope.define(macroSymbol);
            }
        }

        currentScope = currentScope.enterScope("macro_" + (macroName != null ? macroName : line));

        if (ctx.macroStatement().macroParams() != null) {
            for (jinja2Parser.MacroParamContext ctxx : ctx.macroStatement().params.macroParam()) {
                ASTNode macroParamNode = visit(ctxx);
                if (macroParamNode instanceof MacroParamNode) {
                    macroNode.addParam((MacroParamNode) macroParamNode);
                    String paramName = ((MacroParamNode) macroParamNode).getName();
                    if (paramName != null) {
                        if (currentScope.isDefinedLocally(paramName)) {
                            addError(SemanticError.ErrorType.DUPLICATE_PARAMETER,
                                    "تكرار اسم المعامل '" + paramName + "' بتعريف الـ macro '"
                                            + (macroName != null ? macroName : "") + "'", line, col);
                        } else {
                            currentScope.define(paramName, Symbol.SymbolType.PARAMETER, line, col);
                        }
                    }
                }
            }
        }

        for (jinja2Parser.TemplateContentContext ctxx : ctx.macroStatement().body) {
            ASTNode bodyElement = visit(ctxx);
            macroNode.addToBody(bodyElement);
        }

        currentScope = currentScope.exitScope();

        return macroNode;
    }


    @Override
    public ASTNode visitImportStmt(jinja2Parser.ImportStmtContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);
        ImportNode importNode = new ImportNode(line, col);

        // Get template name (remove quotes)
        String templateName = ctx.importStatement().templateName.getText();
        templateName = templateName.substring(1, templateName.length() - 1);
        importNode.setTemplateName(templateName);

        // Get alias
        if (ctx.importStatement().alias != null) {
            importNode.setAlias(ctx.importStatement().alias.getText());
            currentScope.define(ctx.importStatement().alias.getText(),
                    Symbol.SymbolType.VARIABLE, line, col);
        }

        // Check context mode
        if (ctx.importStatement().contextMode != null) {
            if (ctx.importStatement().contextMode.getType() == jinja2Lexer.WITH) {
                importNode.setContextMode(ContextMode.WITH_CONTEXT);
            } else {
                importNode.setContextMode(ContextMode.WITHOUT_CONTEXT);
            }
        }

        return importNode;
    }


    @Override
    public ASTNode visitFromImportStmt(jinja2Parser.FromImportStmtContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);
        FromImportNode fromImportNode = new FromImportNode(line, col);
        if (ctx.fromImportStatement().templateName != null) {
            fromImportNode.setTemplateName(ctx.fromImportStatement().templateName.getText());
        }

        for (jinja2Parser.ImportItemContext ctxx : ctx.fromImportStatement().imports.importItem()) {
            ASTNode fromImportItemNode = visit(ctxx);
            if (fromImportItemNode instanceof FromImportItemNode) {
                FromImportItemNode itemNode = (FromImportItemNode) fromImportItemNode;
                fromImportNode.addItem(itemNode);
                String registeredName = itemNode.getAlias() != null ? itemNode.getAlias() : itemNode.getName();
                if (registeredName != null) {
                    currentScope.define(registeredName, Symbol.SymbolType.FUNCTION, line, col);
                }
            }
        }
        if (ctx.fromImportStatement().contextMode != null) {
            if (ctx.fromImportStatement().contextMode.getType() == jinja2Lexer.WITH) {
                fromImportNode.setContextMode(ContextMode.WITH_CONTEXT);
            } else {
                fromImportNode.setContextMode(ContextMode.WITHOUT_CONTEXT);
            }
        }
        return fromImportNode;
    }


    @Override
    public ASTNode visitWithScopeBlock(jinja2Parser.WithScopeBlockContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);
        WithBlockNode withBlockNode = new WithBlockNode(line, col);

        currentScope = currentScope.enterScope("with_" + line);

        if (ctx.withBlock().assignments() != null) {
            for (jinja2Parser.WithAssignmentContext ctxx : ctx.withBlock().assignments().withAssignment()) {
                ASTNode assignmentNode = visit(ctxx);
                if (assignmentNode instanceof WithAssignmentNode) {
                    WithAssignmentNode wa = (WithAssignmentNode) assignmentNode;
                    withBlockNode.addAssignment(wa);
                    if (wa.getName() != null) {
                        currentScope.define(wa.getName(), Symbol.SymbolType.TEMPLATE_VARIABLE, line, col);
                    }
                }
            }
        }

        for (jinja2Parser.TemplateContentContext ctxx : ctx.withBlock().body) {
            ASTNode bodyElement = visit(ctxx);
            withBlockNode.addToBody(bodyElement);
        }

        currentScope = currentScope.exitScope();

        return withBlockNode;
    }


    @Override
    public ASTNode visitFilterApplyBlock(jinja2Parser.FilterApplyBlockContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);

        FilterBlockNode filterBlockNode = new FilterBlockNode(line, col);
        filterBlockNode.setName(ctx.filterBlock().filterName.getText());

        for (jinja2Parser.TemplateContentContext ctxx : ctx.filterBlock().body) {
            ASTNode bodyElement = visit(ctxx);
            filterBlockNode.addToBody(bodyElement);
        }

        if (ctx.filterBlock().args != null) {
            for (jinja2Parser.ArgumentContext ctxx : ctx.filterBlock().args.argument()) {
                ASTNode argumentNode = visit(ctxx);
                if (argumentNode instanceof ArgumentNode) {
                    filterBlockNode.addArg((ArgumentNode) argumentNode);
                }
            }
        }

        return filterBlockNode;
    }


    @Override
    public ASTNode visitDoStmt(jinja2Parser.DoStmtContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);

        DoStatementNode doStatementNode = new DoStatementNode(line, col);
        if (ctx.doStatement().expr != null) {
            ASTNode exprNode = visit(ctx.doStatement().expr);
            if (exprNode instanceof JinjaExpressionNode) {
                doStatementNode.setExpression((JinjaExpressionNode) exprNode);
            }
        }

        return doStatementNode;
    }


    @Override
    public ASTNode visitCallMacroBlock(jinja2Parser.CallMacroBlockContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);

        CallBlockNode callBlockNode = new CallBlockNode(line, col);

        if (!ctx.callBlock().body.isEmpty()) {
            for (jinja2Parser.TemplateContentContext ctxx : ctx.callBlock().body) {
                ASTNode bodyElement = visit(ctxx);
                callBlockNode.addToBody(bodyElement);
            }
        }
        if (ctx.callBlock().callArgs != null && !ctx.callBlock().callArgs.argument().isEmpty()) {
            for (jinja2Parser.ArgumentContext ctxx : ctx.callBlock().callArgs.argument()) {
                ASTNode argumentNode = visit(ctxx);
                if (argumentNode instanceof ArgumentNode) {
                    callBlockNode.addCallArg((ArgumentNode) argumentNode);
                }
            }
        }

        if (ctx.callBlock().callee != null) {
            ASTNode caleeNode = visit(ctx.callBlock().callee);
            if (caleeNode instanceof JinjaExpressionNode) {
                callBlockNode.setCallee((JinjaExpressionNode) caleeNode);
            }
        }

        return callBlockNode;
    }


    @Override
    public ASTNode visitAutoescapeStmt(jinja2Parser.AutoescapeStmtContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);
        AutoescapeBlockNode autoescapeBlockNode = new AutoescapeBlockNode(line, col);

        if (!ctx.autoescapeBlock().body.isEmpty()) {
            for (jinja2Parser.TemplateContentContext ctxx : ctx.autoescapeBlock().body) {
                ASTNode bodyElement = visit(ctxx);
                autoescapeBlockNode.addToBody(bodyElement);
            }
        }

        if (ctx.autoescapeBlock().escapeMode != null) {
            Token escapeModeToken = (Token) ctx.autoescapeBlock().escapeMode;
            int tokenType = escapeModeToken.getType();
            if (tokenType == jinja2Lexer.TRUE) {
                BooleanEscapeModeNode booleanEscapeModeNode = new BooleanEscapeModeNode(line, col);
                booleanEscapeModeNode.setValue(true);
                autoescapeBlockNode.setEscapeMode(booleanEscapeModeNode);
            } else if (tokenType == jinja2Lexer.FALSE) {
                BooleanEscapeModeNode booleanEscapeModeNode = new BooleanEscapeModeNode(line, col);
                booleanEscapeModeNode.setValue(false);
                autoescapeBlockNode.setEscapeMode(booleanEscapeModeNode);
            } else {
                // STRING case
                StringEscapeModeNode stringEscapeModeNode = new StringEscapeModeNode(line, col);
                String rawValue = escapeModeToken.getText();
                // Strip surrounding quotes
                String value = rawValue.substring(1, rawValue.length() - 1);
                stringEscapeModeNode.setValue(value);
                autoescapeBlockNode.setEscapeMode(stringEscapeModeNode);
            }
        }

        return autoescapeBlockNode;
    }


    @Override
    public ASTNode visitFilter(jinja2Parser.FilterContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);
        FilterNode filterNode = new FilterNode(line, col);
        filterNode.setName(ctx.name.getText());

        if (ctx.argList() != null) {
            for (jinja2Parser.ArgumentContext argCtx : ctx.argList().argument()) {
                ASTNode arg = visit(argCtx);
                if (arg instanceof ArgumentNode) {
                    filterNode.addArg(((ArgumentNode) arg).getValue());
                }
            }
        }
        return filterNode;
    }


    @Override
    public ASTNode visitTernaryExpr(jinja2Parser.TernaryExprContext ctx) {
        // If no ternary operator (no IF...ELSE), pass through to the inner expression
        if (ctx.condition == null) {
            return visit(ctx.value);
        }

        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);
        TernaryExprNode ternaryExprNode = new TernaryExprNode(line, col);

        ASTNode conditionNode = visit(ctx.condition);
        if (conditionNode instanceof JinjaExpressionNode) {
            ternaryExprNode.setCondition((JinjaExpressionNode) conditionNode);
        }

        ASTNode valueNode = visit(ctx.value);
        if (valueNode instanceof JinjaExpressionNode) {
            ternaryExprNode.setTrueValue((JinjaExpressionNode) valueNode);
        }

        ASTNode elseValueNode = visit(ctx.elseValue);
        if (elseValueNode instanceof JinjaExpressionNode) {
            ternaryExprNode.setFalseValue((JinjaExpressionNode) elseValueNode);
        }

        return ternaryExprNode;
    }


    @Override
    public ASTNode visitOrExpr(jinja2Parser.OrExprContext ctx) {
        java.util.List<jinja2Parser.AndExprContext> operands = ctx.andExpr();

        // If only one operand, pass through (no OR operator present)
        if (operands.size() == 1) {
            return visit(operands.get(0));
        }

        // Build chain of OR operations left-to-right
        JinjaExpressionNode result = (JinjaExpressionNode) visit(operands.get(0));
        for (int i = 1; i < operands.size(); i++) {
            jinja2Parser.AndExprContext rightCtx = operands.get(i);
            int line = safeGetLine(rightCtx);
            int col = safeGetCol(rightCtx);
            JinjaExpressionNode right = (JinjaExpressionNode) visit(rightCtx);
            result = new JinjaLogicalOpNode(result, JinjaLogicalOpNode.Operator.OR, right, line, col);
        }
        return result;
    }


    @Override
    public ASTNode visitAndExpr(jinja2Parser.AndExprContext ctx) {
        java.util.List<jinja2Parser.NotExprContext> operands = ctx.notExpr();

        // If only one operand, pass through (no AND operator present)
        if (operands.size() == 1) {
            return visit(operands.get(0));
        }

        // Build chain of AND operations left-to-right
        JinjaExpressionNode result = (JinjaExpressionNode) visit(operands.get(0));
        for (int i = 1; i < operands.size(); i++) {
            jinja2Parser.NotExprContext rightCtx = operands.get(i);
            int line = safeGetLine(rightCtx);
            int col = safeGetCol(rightCtx);
            JinjaExpressionNode right = (JinjaExpressionNode) visit(rightCtx);
            result = new JinjaLogicalOpNode(result, JinjaLogicalOpNode.Operator.AND, right, line, col);
        }
        return result;
    }


    @Override
    public ASTNode visitNotExpression(jinja2Parser.NotExpressionContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);
        JinjaExpressionNode operand = (JinjaExpressionNode) visit(ctx.operand);
        return new JinjaUnaryOpNode(JinjaUnaryOpNode.Operator.NOT, operand, line, col);
    }


    @Override
    public ASTNode visitNotPassThrough(jinja2Parser.NotPassThroughContext ctx) {
        return visit(ctx.comparisonExpr());
    }


    @Override
    public ASTNode visitCompareExpression(jinja2Parser.CompareExpressionContext ctx) {
        if (ctx.compOp() == null) {
            return visit(ctx.left);
        }

        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);
        JinjaExpressionNode left = (JinjaExpressionNode) visit(ctx.left);
        JinjaExpressionNode right = (JinjaExpressionNode) visit(ctx.right);
        JinjaComparisonNode.Operator op = getComparisonOperator(ctx.compOp());
        return new JinjaComparisonNode(left, op, right, line, col);
    }

    private JinjaComparisonNode.Operator getComparisonOperator(jinja2Parser.CompOpContext ctx) {
        if (ctx instanceof jinja2Parser.EqOpContext) return JinjaComparisonNode.Operator.EQ;
        if (ctx instanceof jinja2Parser.NeqOpContext) return JinjaComparisonNode.Operator.NEQ;
        if (ctx instanceof jinja2Parser.LtOpContext) return JinjaComparisonNode.Operator.LT;
        if (ctx instanceof jinja2Parser.GtOpContext) return JinjaComparisonNode.Operator.GT;
        if (ctx instanceof jinja2Parser.LteOpContext) return JinjaComparisonNode.Operator.LTE;
        if (ctx instanceof jinja2Parser.GteOpContext) return JinjaComparisonNode.Operator.GTE;
        if (ctx instanceof jinja2Parser.InOpContext) return JinjaComparisonNode.Operator.IN;
        if (ctx instanceof jinja2Parser.NotInOpContext) return JinjaComparisonNode.Operator.NOT_IN;
        return JinjaComparisonNode.Operator.EQ;
    }


    @Override
    public ASTNode visitTestExpression(jinja2Parser.TestExpressionContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);
        JinjaExpressionNode expression = (JinjaExpressionNode) visit(ctx.additiveExpr());

        jinja2Parser.TestOpContext testOp = ctx.testOp();
        String testName = testOp.testName().NAME().getText();
        boolean negated = testOp.NOT() != null;

        TestExprNode testNode = new TestExprNode(expression, testName, negated, line, col);

        if (testOp.argList() != null) {
            for (jinja2Parser.ArgumentContext argCtx : testOp.argList().argument()) {
                ASTNode arg = visit(argCtx);
                if (arg instanceof ArgumentNode) {
                    testNode.addArgument(((ArgumentNode) arg).getValue());
                }
            }
        }
        return testNode;
    }


    @Override
    public ASTNode visitAdditiveExpr(jinja2Parser.AdditiveExprContext ctx) {
        java.util.List<jinja2Parser.MultiplicativeExprContext> exprs = ctx.multiplicativeExpr();
        if (exprs.size() == 1) {
            return visit(exprs.get(0));
        }

        JinjaExpressionNode result = (JinjaExpressionNode) visit(exprs.get(0));
        for (int i = 1; i < exprs.size(); i++) {
            Token opToken = ctx.op.get(i - 1);
            int line = opToken.getLine();
            int col = opToken.getCharPositionInLine();
            JinjaExpressionNode right = (JinjaExpressionNode) visit(exprs.get(i));

            JinjaBinaryOpNode.Operator op = switch (opToken.getType()) {
                case jinja2Lexer.PLUS -> JinjaBinaryOpNode.Operator.ADD;
                case jinja2Lexer.MINUS -> JinjaBinaryOpNode.Operator.SUB;
                case jinja2Lexer.TILDE -> JinjaBinaryOpNode.Operator.CONCAT;
                default -> JinjaBinaryOpNode.Operator.ADD;
            };
            result = new JinjaBinaryOpNode(result, op, right, line, col);
        }
        return result;
    }


    @Override
    public ASTNode visitMultiplicativeExpr(jinja2Parser.MultiplicativeExprContext ctx) {
        java.util.List<jinja2Parser.PowerExprContext> exprs = ctx.powerExpr();
        if (exprs.size() == 1) {
            return visit(exprs.get(0));
        }

        JinjaExpressionNode result = (JinjaExpressionNode) visit(exprs.get(0));
        for (int i = 1; i < exprs.size(); i++) {
            Token opToken = ctx.op.get(i - 1);
            int line = opToken.getLine();
            int col = opToken.getCharPositionInLine();
            JinjaExpressionNode right = (JinjaExpressionNode) visit(exprs.get(i));

            JinjaBinaryOpNode.Operator op = switch (opToken.getType()) {
                case jinja2Lexer.STAR -> JinjaBinaryOpNode.Operator.MUL;
                case jinja2Lexer.SLASH -> JinjaBinaryOpNode.Operator.DIV;
                case jinja2Lexer.FLOORDIV -> JinjaBinaryOpNode.Operator.FLOORDIV;
                case jinja2Lexer.MOD -> JinjaBinaryOpNode.Operator.MOD;
                default -> JinjaBinaryOpNode.Operator.MUL;
            };
            result = new JinjaBinaryOpNode(result, op, right, line, col);
        }
        return result;
    }


    @Override
    public ASTNode visitPowerExpr(jinja2Parser.PowerExprContext ctx) {
        if (ctx.exponent == null) {
            return visit(ctx.base);
        }

        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);
        JinjaExpressionNode base = (JinjaExpressionNode) visit(ctx.base);
        JinjaExpressionNode exponent = (JinjaExpressionNode) visit(ctx.exponent);
        return new JinjaBinaryOpNode(base, JinjaBinaryOpNode.Operator.POW, exponent, line, col);
    }


    @Override
    public ASTNode visitUnaryExpression(jinja2Parser.UnaryExpressionContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);
        JinjaExpressionNode operand = (JinjaExpressionNode) visit(ctx.operand);

        JinjaUnaryOpNode.Operator op = ctx.op.getType() == jinja2Lexer.MINUS
                ? JinjaUnaryOpNode.Operator.NEGATE
                : JinjaUnaryOpNode.Operator.POSITIVE;

        return new JinjaUnaryOpNode(op, operand, line, col);
    }


    @Override
    public ASTNode visitUnaryPassThrough(jinja2Parser.UnaryPassThroughContext ctx) {
        return visit(ctx.postfixExpr());
    }


    @Override
    public ASTNode visitPostfixExpr(jinja2Parser.PostfixExprContext ctx) {
        boolean isDirectCall = !ctx.ops.isEmpty()
                && ctx.ops.get(0) instanceof jinja2Parser.CallOpContext
                && ctx.object instanceof jinja2Parser.VariableExprContext;

        if (isDirectCall) suppressUndefinedCheck = true;
        JinjaExpressionNode result = (JinjaExpressionNode) visit(ctx.object);
        if (isDirectCall) suppressUndefinedCheck = false;

        for (jinja2Parser.PostfixOpContext opCtx : ctx.ops) {
            result = applyPostfixOp(result, opCtx);
        }
        return result;
    }

    private JinjaExpressionNode applyPostfixOp(JinjaExpressionNode object, jinja2Parser.PostfixOpContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);

        if (ctx instanceof jinja2Parser.DotAccessOpContext dotCtx) {
            DotAccessExprNode node = new DotAccessExprNode(line, col);
            node.setObject(object);
            node.setProperty(dotCtx.name.getText());
            return node;
        } else if (ctx instanceof jinja2Parser.IndexAccessOpContext indexCtx) {
            IndexAccessExprNode node = new IndexAccessExprNode(line, col);
            node.setObject(object);
            node.setIndex((JinjaExpressionNode) visit(indexCtx.index));
            return node;
        } else if (ctx instanceof jinja2Parser.SliceAccessOpContext sliceCtx) {
            SliceExprNode node = new SliceExprNode(line, col);
            node.setObject(object);
            if (sliceCtx.start != null) {
                node.setStart((JinjaExpressionNode) visit(sliceCtx.start));
            }
            if (sliceCtx.stop != null) {
                node.setStop((JinjaExpressionNode) visit(sliceCtx.stop));
            }
            if (sliceCtx.step != null) {
                node.setStep((JinjaExpressionNode) visit(sliceCtx.step));
            }
            return node;
        } else if (ctx instanceof jinja2Parser.CallOpContext callCtx) {
            FunctionCallExprNode node = new FunctionCallExprNode(line, col);
            node.setCallable(object);
            int argCount = 0;
            if (callCtx.args != null) {
                java.util.Set<String> seenKwargNames = new java.util.HashSet<>();
                for (jinja2Parser.ArgumentContext argCtx : callCtx.args.argument()) {
                    ASTNode arg = visit(argCtx);
                    if (arg instanceof ArgumentNode) {
                        ArgumentNode argumentNode = (ArgumentNode) arg;
                        node.addArgument(argumentNode);
                        String kwName = argumentNode.getName();
                        if (kwName != null && !seenKwargNames.add(kwName)) {
                            addError(SemanticError.ErrorType.DUPLICATE_KEYWORD_ARGUMENT,
                                    "تكرار keyword argument '" + kwName + "' بنفس الاستدعاء", line, col);
                        }
                    }
                }
                argCount = callCtx.args.argument().size();
            }

            if (object instanceof VariableExprNode) {
                String calleeName = ((VariableExprNode) object).getName();
                Symbol symbol = currentScope.resolve(calleeName);

                if (symbol == null) {
                    if (!JINJA_BUILTINS.contains(calleeName)) {
                        addError(SemanticError.ErrorType.UNDEFINED_FUNCTION,
                                "استدعاء macro/دالة غير معرّفة: '" + calleeName + "'", line, col);
                    }
                } else if (symbol.getType() == Symbol.SymbolType.FUNCTION && symbol.getValue() != null) {
                    int expected = Integer.parseInt(symbol.getValue().toString());
                    if (argCount != expected) {
                        addError(SemanticError.ErrorType.ARGUMENT_COUNT_MISMATCH,
                                "عدد الوسائط غير مطابق عند استدعاء '" + calleeName + "': المتوقع "
                                        + expected + " لكن تم تمرير " + argCount, line, col);
                    }
                } else if (symbol.getType() != Symbol.SymbolType.FUNCTION) {
                    addError(SemanticError.ErrorType.INVALID_CALL,
                            "استدعاء '" + calleeName + "' كـ macro/دالة لكنه ليس كذلك (نوعه: "
                                    + symbol.getType() + ")", line, col);
                }
            }

            return node;
        }
        return object;
    }


    @Override
    public ASTNode visitNumberLiteral(jinja2Parser.NumberLiteralContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);
        String text = ctx.NUMBER().getText();

        if (text.contains(".")) {
            return new JinjaNumberDoubleNode(text, line, col);
        } else {
            return new JinjaNumberIntegerNode(text, line, col);
        }
    }


    @Override
    public ASTNode visitStringLiteral(jinja2Parser.StringLiteralContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);
        String text = ctx.STRING().getText();
        String value = text.substring(1, text.length() - 1);
        return new JinjaStringNode(value, line, col);
    }


    @Override
    public ASTNode visitTrueLiteral(jinja2Parser.TrueLiteralContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);
        return new JinjaBooleanNode(true, line, col);
    }


    @Override
    public ASTNode visitFalseLiteral(jinja2Parser.FalseLiteralContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);
        return new JinjaBooleanNode(false, line, col);
    }


    @Override
    public ASTNode visitNoneLiteral(jinja2Parser.NoneLiteralContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);
        return new JinjaNoneNode(line, col);
    }


    @Override
    public ASTNode visitVariableExpr(jinja2Parser.VariableExprContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);
        String name = ctx.NAME().getText();

        if (!suppressUndefinedCheck && "loop".equals(name) && forLoopDepth == 0) {
            addError(SemanticError.ErrorType.INVALID_LOOP_CONTROL,
                    "استخدام متغير 'loop' خارج حلقة for", line, col);
        } else if (!suppressUndefinedCheck && !JINJA_BUILTINS.contains(name) && currentScope.resolve(name) == null) {
            addError(SemanticError.ErrorType.UNDEFINED_VARIABLE,
                    "استخدام متغير جينجا غير معرّف: '" + name + "'", line, col);
        }

        VariableExprNode node = new VariableExprNode(line, col);
        node.setName(name);
        return node;
    }


    @Override
    public ASTNode visitListExpr(jinja2Parser.ListExprContext ctx) {
        return visit(ctx.list());
    }


    @Override
    public ASTNode visitDictExpr(jinja2Parser.DictExprContext ctx) {
        return visit(ctx.dict());
    }


    @Override
    public ASTNode visitParenExpr(jinja2Parser.ParenExprContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);
        JinjaExpressionNode inner = (JinjaExpressionNode) visit(ctx.expression());
        return new ParenExprNode(inner, line, col);
    }


    @Override
    public ASTNode visitList(jinja2Parser.ListContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);
        JinjaListNode listNode = new JinjaListNode(line, col);

        for (jinja2Parser.ExpressionContext elemCtx : ctx.elements) {
            ASTNode elem = visit(elemCtx);
            if (elem instanceof JinjaExpressionNode) {
                listNode.addElement((JinjaExpressionNode) elem);
            }
        }
        return listNode;
    }


    @Override
    public ASTNode visitDictEntry(jinja2Parser.DictEntryContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);
        JinjaDictEntryNode entryNode = new JinjaDictEntryNode(line, col);

        ASTNode key = visit(ctx.key);
        if (key instanceof JinjaExpressionNode) {
            entryNode.setKey((JinjaExpressionNode) key);
        }

        ASTNode value = visit(ctx.value);
        if (value instanceof JinjaExpressionNode) {
            entryNode.setValue((JinjaExpressionNode) value);
        }

        return entryNode;
    }

    @Override
    public ASTNode visitDict(jinja2Parser.DictContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);
        JinjaDictNode dictNode = new JinjaDictNode(line, col);

        for (jinja2Parser.DictEntryContext entryCtx : ctx.dictEntry()) {
            ASTNode entry = visit(entryCtx);
            if (entry instanceof JinjaDictEntryNode) {
                dictNode.addElement((JinjaDictEntryNode) entry);
            }
        }
        return dictNode;
    }


    @Override
    public ASTNode visitArgument(jinja2Parser.ArgumentContext ctx) {

        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);
        ArgumentNode argumentNode = new ArgumentNode(line, col);
        if (ctx.name != null) {
            argumentNode.setName(ctx.name.getText());
        }

        if (ctx.value != null) {
            ASTNode value = visit(ctx.value);
            if (value instanceof JinjaExpressionNode) {
                argumentNode.setValue((JinjaExpressionNode) value);
            }
        }

        return argumentNode;
    }


    @Override
    public ASTNode visitSingleTarget(jinja2Parser.SingleTargetContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);
        SimpleTargetNode targetNode = new SimpleTargetNode(line, col);
        targetNode.setTarget(ctx.NAME().getText());
        return targetNode;
    }


    @Override
    public ASTNode visitTupleTarget(jinja2Parser.TupleTargetContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);
        TupleTargetNode targetNode = new TupleTargetNode(line, col);

        for (TerminalNode name : ctx.NAME()) {
            targetNode.addTarget(name.getText());
        }
        return targetNode;
    }


    @Override
    public ASTNode visitElseForBranch(jinja2Parser.ElseForBranchContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);
        ElseBranchNode elseBranchNode = new ElseBranchNode(line, col);

        for (jinja2Parser.TemplateContentContext bodyCtx : ctx.body) {
            ASTNode bodyElement = visit(bodyCtx);
            elseBranchNode.addToBody(bodyElement);
        }
        return elseBranchNode;
    }


    @Override
    public ASTNode visitElifBranch(jinja2Parser.ElifBranchContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);
        ElifBranchNode elifBranchNode = new ElifBranchNode(line, col);

        ASTNode condition = visit(ctx.condition);
        if (condition instanceof JinjaExpressionNode) {
            elifBranchNode.setCondition((JinjaExpressionNode) condition);
        }
        for (jinja2Parser.TemplateContentContext ctxx : ctx.body) {
            ASTNode bodyElement = visit(ctxx);
            elifBranchNode.addToBody(bodyElement);
        }

        return elifBranchNode;
    }


    @Override
    public ASTNode visitElseBranch(jinja2Parser.ElseBranchContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);
        ElseBranchNode elseBranchNode = new ElseBranchNode(line, col);
        for (jinja2Parser.TemplateContentContext ctxx : ctx.body) {
            ASTNode bodyElement = visit(ctxx);
            elseBranchNode.addToBody(bodyElement);
        }

        return elseBranchNode;
    }


    @Override
    public ASTNode visitSimpleTarget(jinja2Parser.SimpleTargetContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);
        SimpleTargetNode simpleTargetNode = new SimpleTargetNode(line, col);
        String target = ctx.name.getText();
        simpleTargetNode.setTarget(target);
        return simpleTargetNode;
    }


    @Override
    public ASTNode visitTupleSetTarget(jinja2Parser.TupleSetTargetContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);
        TupleTargetNode targetNode = new TupleTargetNode(line, col);
        targetNode.addTarget(ctx.first.getText());
        if (ctx.rest != null) {
            for (Token text : ctx.rest) {
                targetNode.addTarget(text.getText());
            }
        }
        return targetNode;
    }


    @Override
    public ASTNode visitNamespaceTarget(jinja2Parser.NamespaceTargetContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);
        NamespaceTargetNode namespaceTargetNode = new NamespaceTargetNode(line, col);
        if (ctx.namespace.getText() != null) {
            namespaceTargetNode.setNameSpace(ctx.namespace.getText());
        }
        if (ctx.attributes != null) {
            for (Token text : ctx.attributes) {
                namespaceTargetNode.addAttribute(text.getText());
            }
        }
        return namespaceTargetNode;
    }


    @Override
    public ASTNode visitMacroParam(jinja2Parser.MacroParamContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);
        MacroParamNode macroParamNode = new MacroParamNode(line, col);
        if (ctx.name != null) {
            macroParamNode.setName(ctx.name.getText());
        }
        if (ctx.defaultValue != null) {
            JinjaExpressionNode expressionNode = (JinjaExpressionNode) visit(ctx.defaultValue);
            macroParamNode.setDefaultValue(expressionNode);
        }
        return macroParamNode;
    }


    @Override
    public ASTNode visitImportItem(jinja2Parser.ImportItemContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);
        FromImportItemNode fromImportItemNode = new FromImportItemNode(line, col);
        if (ctx.name != null) {
            fromImportItemNode.setName(ctx.name.getText());

        }
        if (ctx.alias != null) {
            fromImportItemNode.setAlias(ctx.alias.getText());
        }
        return fromImportItemNode;
    }


    @Override
    public ASTNode visitWithAssignment(jinja2Parser.WithAssignmentContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);
        WithAssignmentNode withAssignmentNode = new WithAssignmentNode(line, col);
        if (ctx.name != null) {
            withAssignmentNode.setName(ctx.name.getText());
        }
        if (ctx.value != null) {
            ASTNode valueNode = (ASTNode) visit(ctx.value);
            if (valueNode instanceof JinjaExpressionNode) {
                withAssignmentNode.setValue((JinjaExpressionNode) valueNode);
            }
        }
        return withAssignmentNode;
    }

    // ===========================HTML Elements===============================
    // Note: visitHtmlElementPart() deleted - allows ANTLR to dispatch to specific visitor methods

    // ==================== Document Structure Elements ====================
    @Override
    public ASTNode visitHtmlRootElement(jinja2Parser.HtmlRootElementContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);
        HtmlRootHtmlNode node = new HtmlRootHtmlNode(line, col);

        // Process attributes
        for (jinja2Parser.HtmlAttributeContext attrCtx : ctx.attrs) {
            ASTNode attr = visit(attrCtx);
            if (attr instanceof HtmlAttributeNode) {
                node.addAttribute((HtmlAttributeNode) attr);
            }
        }

        // Process children
        for (jinja2Parser.HtmlContentContext contentCtx : ctx.content) {
            ASTNode child = visit(contentCtx);
            if (child != null) {
                node.addChild(child);
            }
        }

        return node;
    }

    @Override
    public ASTNode visitHeadElement(jinja2Parser.HeadElementContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);
        HeadHtmlNode node = new HeadHtmlNode(line, col);

        // Process attributes
        for (jinja2Parser.HtmlAttributeContext attrCtx : ctx.attrs) {
            ASTNode attr = visit(attrCtx);
            if (attr instanceof HtmlAttributeNode) {
                node.addAttribute((HtmlAttributeNode) attr);
            }
        }

        // Process children
        for (jinja2Parser.HtmlContentContext contentCtx : ctx.content) {
            ASTNode child = visit(contentCtx);
            if (child != null) {
                node.addChild(child);
            }
        }

        return node;
    }

    @Override
    public ASTNode visitBodyElement(jinja2Parser.BodyElementContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);
        BodyHtmlNode node = new BodyHtmlNode(line, col);

        // Process attributes
        for (jinja2Parser.HtmlAttributeContext attrCtx : ctx.attrs) {
            ASTNode attr = visit(attrCtx);
            if (attr instanceof HtmlAttributeNode) {
                node.addAttribute((HtmlAttributeNode) attr);
            }
        }

        // Process children
        for (jinja2Parser.HtmlContentContext contentCtx : ctx.content) {
            ASTNode child = visit(contentCtx);
            if (child != null) {
                node.addChild(child);
            }
        }

        return node;
    }

    @Override
    public ASTNode visitTitleElement(jinja2Parser.TitleElementContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);
        TitleHtmlNode node = new TitleHtmlNode(line, col);

        // Process attributes
        for (jinja2Parser.HtmlAttributeContext attrCtx : ctx.attrs) {
            ASTNode attr = visit(attrCtx);
            if (attr instanceof HtmlAttributeNode) {
                node.addAttribute((HtmlAttributeNode) attr);
            }
        }

        // Process children
        for (jinja2Parser.HtmlContentContext contentCtx : ctx.content) {
            ASTNode child = visit(contentCtx);
            if (child != null) {
                node.addChild(child);
            }
        }

        return node;
    }

    // ==================== Sectioning Elements ====================
    @Override
    public ASTNode visitDivElement(jinja2Parser.DivElementContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);
        DivHtmlNode node = new DivHtmlNode(line, col);

        // Process attributes
        for (jinja2Parser.HtmlAttributeContext attrCtx : ctx.attrs) {
            ASTNode attr = visit(attrCtx);
            if (attr instanceof HtmlAttributeNode) {
                node.addAttribute((HtmlAttributeNode) attr);
            }
        }

        // Process children
        for (jinja2Parser.HtmlContentContext contentCtx : ctx.content) {
            ASTNode child = visit(contentCtx);
            if (child != null) {
                node.addChild(child);
            }
        }

        return node;
    }

    @Override
    public ASTNode visitH1Element(jinja2Parser.H1ElementContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);
        H1HtmlNode node = new H1HtmlNode(line, col);

        // Process attributes
        for (jinja2Parser.HtmlAttributeContext attrCtx : ctx.attrs) {
            ASTNode attr = visit(attrCtx);
            if (attr instanceof HtmlAttributeNode) {
                node.addAttribute((HtmlAttributeNode) attr);
            }
        }

        // Process children
        for (jinja2Parser.HtmlContentContext contentCtx : ctx.content) {
            ASTNode child = visit(contentCtx);
            if (child != null) {
                node.addChild(child);
            }
        }

        return node;
    }

    // ==================== Text Elements ====================
    @Override
    public ASTNode visitParagraphElement(jinja2Parser.ParagraphElementContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);
        ParagraphHtmlNode node = new ParagraphHtmlNode(line, col);

        // Process attributes
        for (jinja2Parser.HtmlAttributeContext attrCtx : ctx.attrs) {
            ASTNode attr = visit(attrCtx);
            if (attr instanceof HtmlAttributeNode) {
                node.addAttribute((HtmlAttributeNode) attr);
            }
        }

        // Process children
        for (jinja2Parser.HtmlContentContext contentCtx : ctx.content) {
            ASTNode child = visit(contentCtx);
            if (child != null) {
                node.addChild(child);
            }
        }

        return node;
    }

    @Override
    public ASTNode visitAnchorElement(jinja2Parser.AnchorElementContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);
        AnchorHtmlNode node = new AnchorHtmlNode(line, col);

        // Process attributes
        for (jinja2Parser.HtmlAttributeContext attrCtx : ctx.attrs) {
            ASTNode attr = visit(attrCtx);
            if (attr instanceof HtmlAttributeNode) {
                node.addAttribute((HtmlAttributeNode) attr);
            }
        }

        // Process children
        for (jinja2Parser.HtmlContentContext contentCtx : ctx.content) {
            ASTNode child = visit(contentCtx);
            if (child != null) {
                node.addChild(child);
            }
        }

        return node;
    }

    // ==================== Form Elements ====================
    @Override
    public ASTNode visitFormElement(jinja2Parser.FormElementContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);
        FormHtmlNode node = new FormHtmlNode(line, col);

        // Process attributes
        for (jinja2Parser.HtmlAttributeContext attrCtx : ctx.attrs) {
            ASTNode attr = visit(attrCtx);
            if (attr instanceof HtmlAttributeNode) {
                node.addAttribute((HtmlAttributeNode) attr);
            }
        }

        // Process children
        for (jinja2Parser.HtmlContentContext contentCtx : ctx.content) {
            ASTNode child = visit(contentCtx);
            if (child != null) {
                node.addChild(child);
            }
        }

        return node;
    }

    @Override
    public ASTNode visitLabelElement(jinja2Parser.LabelElementContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);
        LabelHtmlNode node = new LabelHtmlNode(line, col);

        // Process attributes
        for (jinja2Parser.HtmlAttributeContext attrCtx : ctx.attrs) {
            ASTNode attr = visit(attrCtx);
            if (attr instanceof HtmlAttributeNode) {
                node.addAttribute((HtmlAttributeNode) attr);
            }
        }

        // Process children
        for (jinja2Parser.HtmlContentContext contentCtx : ctx.content) {
            ASTNode child = visit(contentCtx);
            if (child != null) {
                node.addChild(child);
            }
        }

        return node;
    }

    @Override
    public ASTNode visitTextareaElement(jinja2Parser.TextareaElementContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);
        TextareaHtmlNode node = new TextareaHtmlNode(line, col);

        // Process attributes
        for (jinja2Parser.HtmlAttributeContext attrCtx : ctx.attrs) {
            ASTNode attr = visit(attrCtx);
            if (attr instanceof HtmlAttributeNode) {
                node.addAttribute((HtmlAttributeNode) attr);
            }
        }

        // Process children
        for (jinja2Parser.HtmlContentContext contentCtx : ctx.content) {
            ASTNode child = visit(contentCtx);
            if (child != null) {
                node.addChild(child);
            }
        }

        return node;
    }

    @Override
    public ASTNode visitButtonElement(jinja2Parser.ButtonElementContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);
        ButtonHtmlNode node = new ButtonHtmlNode(line, col);

        // Process attributes
        for (jinja2Parser.HtmlAttributeContext attrCtx : ctx.attrs) {
            ASTNode attr = visit(attrCtx);
            if (attr instanceof HtmlAttributeNode) {
                node.addAttribute((HtmlAttributeNode) attr);
            }
        }

        // Process children
        for (jinja2Parser.HtmlContentContext contentCtx : ctx.content) {
            ASTNode child = visit(contentCtx);
            if (child != null) {
                node.addChild(child);
            }
        }

        return node;
    }

    // ==================== Void Elements (no children) ====================
    @Override
    public ASTNode visitInputElement(jinja2Parser.InputElementContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);
        InputHtmlNode node = new InputHtmlNode(line, col);

        // Process attributes only (no children for void elements)
        for (jinja2Parser.HtmlAttributeContext attrCtx : ctx.attrs) {
            ASTNode attr = visit(attrCtx);
            if (attr instanceof HtmlAttributeNode) {
                node.addAttribute((HtmlAttributeNode) attr);
            }
        }

        return node;
    }

    @Override
    public ASTNode visitImgElement(jinja2Parser.ImgElementContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);
        ImgHtmlNode node = new ImgHtmlNode(line, col);

        // Process attributes only (no children for void elements)
        for (jinja2Parser.HtmlAttributeContext attrCtx : ctx.attrs) {
            ASTNode attr = visit(attrCtx);
            if (attr instanceof HtmlAttributeNode) {
                node.addAttribute((HtmlAttributeNode) attr);
            }
        }

        return node;
    }

    // ==================== Embedded Elements ====================
    @Override
    public ASTNode visitStyleElement(jinja2Parser.StyleElementContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);
        StyleHtmlNode node = new StyleHtmlNode(line, col);

        // Process attributes
        for (jinja2Parser.HtmlAttributeContext attrCtx : ctx.attrs) {
            ASTNode attr = visit(attrCtx);
            if (attr instanceof HtmlAttributeNode) {
                node.addAttribute((HtmlAttributeNode) attr);
            }
        }

        // Process CSS stylesheet
        if (ctx.css != null) {
            ASTNode cssNode = visit(ctx.css);
            if (cssNode != null) {
                node.addChild(cssNode);
            }
        }

        return node;
    }

    // ==================== Generic Element ====================
    @Override
    public ASTNode visitGenericElement(jinja2Parser.GenericElementContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);
        String tagName = ctx.name.getText();

        // Create generic element node
        GenericHtmlNode node = new GenericHtmlNode(tagName, line, col);

        // Process attributes
        for (jinja2Parser.HtmlAttributeContext attrCtx : ctx.attrs) {
            ASTNode attr = visit(attrCtx);
            if (attr instanceof HtmlAttributeNode) {
                node.addAttribute((HtmlAttributeNode) attr);
            }
        }

        // Check if it's a self-closing tag
        if (ctx.TAG_SELF_CLOSE() != null) {
            // Mark as implicitly closed to indicate it's self-closing
            node.setImplicitlyClosed(true);
        } else {
            // Process children for normal elements
            for (jinja2Parser.HtmlContentContext contentCtx : ctx.content) {
                ASTNode child = visit(contentCtx);
                if (child != null) {
                    node.addChild(child);
                }
            }
        }

        return node;
    }

    // ==================== HTML ATTRIBUTE VISITORS ====================

    @Override
    public ASTNode visitAttributeWithValue(jinja2Parser.AttributeWithValueContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);

        // Determine attribute name (static or dynamic)
        String attrName = null;
        if (ctx.name instanceof jinja2Parser.StaticAttrNameContext) {
            jinja2Parser.StaticAttrNameContext staticCtx = (jinja2Parser.StaticAttrNameContext) ctx.name;
            attrName = staticCtx.staticName.getText();
        } else if (ctx.name instanceof jinja2Parser.DynamicAttrNameContext) {
            attrName = "(dynamic)";
        }

        final String finalAttrName = attrName;
        HtmlAttributeNode node = new HtmlAttributeNode("HtmlAttribute", line, col) {
            @Override
            public String getNameAsString() {
                return finalAttrName;
            }

            @Override
            public java.util.List<ASTNode> getChildren() {
                java.util.List<ASTNode> children = new java.util.ArrayList<>();
                if (value != null) {
                    children.add(value);
                }
                return children;
            }
        };

        if (ctx.value != null) {
            HtmlAttributeValueNode valueNode = new HtmlAttributeValueNode(line, col);

            if (ctx.value instanceof jinja2Parser.DoubleQuotedValueContext) {
                node.setQuoteStyle(QuoteStyle.DOUBLE);
                jinja2Parser.DoubleQuotedValueContext dq = (jinja2Parser.DoubleQuotedValueContext) ctx.value;
                for (jinja2Parser.AttrDqContentContext part : dq.parts) {
                    if (part instanceof jinja2Parser.AttrDqTextContext) {
                        String text = ((jinja2Parser.AttrDqTextContext) part).text.getText();
                        valueNode.addPart(new HtmlTextNode(text, line, col));
                    } else if (part instanceof jinja2Parser.AttrDqExprContext) {
                        // تعبير جينجا داخل القيمة — نمرّ على الـ expression إن أمكن
                        ASTNode expr = visit(((jinja2Parser.AttrDqExprContext) part).expr);
                        if (expr != null) {
                            valueNode.addPart(expr);
                        }
                    }
                }
            } else if (ctx.value instanceof jinja2Parser.SingleQuotedValueContext) {
                node.setQuoteStyle(QuoteStyle.SINGLE);
                jinja2Parser.SingleQuotedValueContext sq = (jinja2Parser.SingleQuotedValueContext) ctx.value;
                for (jinja2Parser.AttrSqContentContext part : sq.parts) {
                    if (part instanceof jinja2Parser.AttrSqTextContext) {
                        String text = ((jinja2Parser.AttrSqTextContext) part).text.getText();
                        valueNode.addPart(new HtmlTextNode(text, line, col));
                    } else if (part instanceof jinja2Parser.AttrSqExprContext) {
                        ASTNode expr = visit(((jinja2Parser.AttrSqExprContext) part).expr);
                        if (expr != null) {
                            valueNode.addPart(expr);
                        }
                    }
                }
            } else if (ctx.value instanceof jinja2Parser.UnquotedValueContext) {
                node.setQuoteStyle(QuoteStyle.UNQUOTED);
                String text = ((jinja2Parser.UnquotedValueContext) ctx.value).value.getText();
                valueNode.addPart(new HtmlTextNode(text, line, col));
            } else if (ctx.value instanceof jinja2Parser.ExpressionValueContext) {
                node.setQuoteStyle(QuoteStyle.DOUBLE);
                ASTNode expr = visit(((jinja2Parser.ExpressionValueContext) ctx.value).expr);
                if (expr != null) {
                    valueNode.addPart(expr);
                }
            }

            node.setValue(valueNode);
        } else {
            // Boolean attribute (no value)
            node.setQuoteStyle(QuoteStyle.NONE);
        }

        return node;
    }

    // ==================== CSS DECLARATION VISITORS ====================

    @Override
    public ASTNode visitSingleLengthDecl(jinja2Parser.SingleLengthDeclContext ctx) {
        String property = ctx.singleLengthProp().getText();
        int line = safeGetLine(ctx);
        CSSLengthValueNode value = (CSSLengthValueNode) visit(ctx.value);
        return new LengthPropertyNode(property, value, line);
    }

    @Override
    public ASTNode visitMultipleLengthDecl(jinja2Parser.MultipleLengthDeclContext ctx) {
        int line = safeGetLine(ctx);

        // Extract the actual property name (margin or padding) from the multiLengthProp rule
        jinja2Parser.MultiLengthPropContext propCtx = ctx.multiLengthProp();
        String propertyName;
        if (propCtx.CSS_MARGIN() != null) {
            propertyName = propCtx.CSS_MARGIN().getText();
        } else if (propCtx.CSS_PADDING() != null) {
            propertyName = propCtx.CSS_PADDING().getText();
        } else {
            propertyName = "unknown"; // Fallback
        }

        List<CSSLengthValueNode> lengthValues = new ArrayList<>();
        for (var valueCtx : ctx.values) {
            ASTNode valueNode = visit(valueCtx);
            if (valueNode instanceof CSSLengthValueNode) {
                lengthValues.add((CSSLengthValueNode) valueNode);
            } else if (valueNode instanceof CSSKeywordValueNode) {
                // Handle 'auto' keyword - represent as special length value
                CSSKeywordValueNode keyword = (CSSKeywordValueNode) valueNode;
                lengthValues.add(new CSSLengthValueNode(keyword.getKeyword(), "", line));
            }
        }

        return new MultiLengthPropertyNode(propertyName, lengthValues, line);
    }

    @Override
    public ASTNode visitColorDecl(jinja2Parser.ColorDeclContext ctx) {
        String property = ctx.colorProp().getText();
        int line = safeGetLine(ctx);
        CSSValueNode value = (CSSValueNode) visit(ctx.value);
        return new ColorPropertyNode(property, value, line);
    }

    @Override
    public ASTNode visitKeywordDecl(jinja2Parser.KeywordDeclContext ctx) {
        String property = ctx.keywordProp().getText();
        int line = safeGetLine(ctx);
        CSSKeywordValueNode value = (CSSKeywordValueNode) visit(ctx.value);
        return new KeywordPropertyNode(property, value, line);
    }

    @Override
    public ASTNode visitBoxShadowDecl(jinja2Parser.BoxShadowDeclContext ctx) {
        int line = safeGetLine(ctx);
        List<BoxShadowPropertyNode.Shadow> shadows = new ArrayList<>();

        for (var shadowCtx : ctx.shadows) {
            CSSValueNode offsetX = (CSSValueNode) visit(shadowCtx.offsetX);
            CSSValueNode offsetY = (CSSValueNode) visit(shadowCtx.offsetY);
            CSSValueNode blur = (CSSValueNode) visit(shadowCtx.blur);
            CSSValueNode color = (CSSValueNode) visit(shadowCtx.color);
            shadows.add(new BoxShadowPropertyNode.Shadow(offsetX, offsetY, blur, color));
        }

        return new BoxShadowPropertyNode(shadows, line);
    }

    @Override
    public ASTNode visitBorderDecl(jinja2Parser.BorderDeclContext ctx) {
        String property = ctx.borderProp().getText();
        int line = safeGetLine(ctx);

        // Check if it's a keyword-only declaration (e.g., border: none;)
        if (ctx.keyword != null) {
            CSSKeywordValueNode keyword = (CSSKeywordValueNode) visit(ctx.keyword);
            // For keyword-only, use the keyword as the style with null width and color
            return new BorderPropertyNode(property, null, keyword, null, line);
        }

        // Full shorthand: width style color
        CSSLengthValueNode width = (CSSLengthValueNode) visit(ctx.width);
        CSSKeywordValueNode style = (CSSKeywordValueNode) visit(ctx.style);
        CSSValueNode color = (CSSValueNode) visit(ctx.color);
        return new BorderPropertyNode(property, width, style, color, line);
    }

    @Override
    public ASTNode visitTransitionDecl(jinja2Parser.TransitionDeclContext ctx) {
        int line = safeGetLine(ctx);

        // Handle cssTransitionProperty which can be cssIdent OR a property token (CSS_COLOR, etc.)
        CSSIdentValueNode property;
        jinja2Parser.CssTransitionPropertyContext propCtx = ctx.property;
        if (propCtx.cssIdent() != null) {
            // It's an identifier like "all"
            property = (CSSIdentValueNode) visit(propCtx.cssIdent());
        } else {
            // It's a property token like CSS_COLOR, CSS_BACKGROUND, etc.
            // Just get the text directly
            property = new CSSIdentValueNode(propCtx.getText(), line);
        }

        CSSTimeValueNode duration = (CSSTimeValueNode) visit(ctx.duration);
        CSSKeywordValueNode easing = (CSSKeywordValueNode) visit(ctx.easing);
        return new TransitionPropertyNode(property, duration, easing, line);
    }

    @Override
    public ASTNode visitTransformDecl(jinja2Parser.TransformDeclContext ctx) {
        int line = safeGetLine(ctx);
        CSSFunctionValueNode value = (CSSFunctionValueNode) visit(ctx.value);
        return new TransformPropertyNode(value, line);
    }

    @Override
    public ASTNode visitBackgroundDecl(jinja2Parser.BackgroundDeclContext ctx) {
        int line = safeGetLine(ctx);
        CSSValueNode value = (CSSValueNode) visit(ctx.value);
        return new BackgroundPropertyNode(value, line);
    }

    @Override
    public ASTNode visitFontFamilyDecl(jinja2Parser.FontFamilyDeclContext ctx) {
        int line = safeGetLine(ctx);
        List<CSSIdentValueNode> fonts = new ArrayList<>();

        // Each cssFontName can contain multiple cssFontToken tokens (for multi-word fonts like "Segoe UI")
        for (jinja2Parser.CssFontNameContext fontCtx : ctx.fonts) {
            // Combine all tokens in this font name with spaces
            StringBuilder fontName = new StringBuilder();
            List<jinja2Parser.CssFontTokenContext> tokens = fontCtx.cssFontToken();
            for (int i = 0; i < tokens.size(); i++) {
                if (i > 0) {
                    fontName.append(" ");
                }
                fontName.append(tokens.get(i).getText());
            }
            fonts.add(new CSSIdentValueNode(fontName.toString(), line));
        }

        return new FontFamilyPropertyNode(fonts, line);
    }

    @Override
    public ASTNode visitFontWeightDecl(jinja2Parser.FontWeightDeclContext ctx) {
        int line = safeGetLine(ctx);
        CSSValueNode value = (CSSValueNode) visit(ctx.value);
        return new FontWeightPropertyNode(value, line);
    }

    @Override
    public ASTNode visitBoxSizingDecl(jinja2Parser.BoxSizingDeclContext ctx) {
        int line = safeGetLine(ctx);
        CSSKeywordValueNode value = (CSSKeywordValueNode) visit(ctx.value);
        return new BoxSizingPropertyNode(value, line);
    }

    @Override
    public ASTNode visitOutlineDecl(jinja2Parser.OutlineDeclContext ctx) {
        int line = safeGetLine(ctx);
        ASTNode valueNode = visit(ctx.value);

        // Check if it's a keyword (outline: none;) or full outline
        if (valueNode instanceof CSSKeywordValueNode) {
            return new OutlinePropertyNode((CSSKeywordValueNode) valueNode, line);
        } else {
            // This shouldn't happen with the current grammar, but handle it gracefully
            return new OutlinePropertyNode((CSSKeywordValueNode) valueNode, line);
        }
    }

    @Override
    public ASTNode visitOutlineValue(jinja2Parser.OutlineValueContext ctx) {
        // This represents the full outline form: width style color
        // We need to return a composite structure or handle it differently
        // For now, just visit the width (this is a simplified implementation)
        return visit(ctx.width);
    }

    // ==================== CSS VALUE VISITORS ====================

    /**
     * Helper method to parse a length value and extract number and unit parts.
     * Examples: "24px" -> ("24", "px"), "100%" -> ("100", "%"), "-1.5em" -> ("-1.5", "em")
     */
    private String[] parseLengthValue(String lengthText) {
        // Match patterns like: 24px, 100%, 1.5em, 100vh, -4px, -1.5em
        String numberPart = "";
        String unitPart = "";

        // Find where the unit starts (first non-digit, non-dot, non-minus character)
        int i = 0;
        while (i < lengthText.length()) {
            char c = lengthText.charAt(i);
            if (Character.isDigit(c) || c == '.' || c == '-') {
                i++;
            } else {
                break;
            }
        }

        numberPart = lengthText.substring(0, i);
        unitPart = lengthText.substring(i);

        return new String[]{numberPart, unitPart};
    }

    /**
     * Helper method to safely get line number from a context.
     * Returns 0 if the context or its start token is null.
     */
    private int safeGetLine(ParserRuleContext ctx) {
        if (ctx == null || ctx.getStart() == null) {
            return 0;
        }
        return ctx.getStart().getLine();
    }

    /**
     * Helper method to safely get column number from a context.
     * Returns 0 if the context or its start token is null.
     */
    private int safeGetCol(ParserRuleContext ctx) {
        if (ctx == null || ctx.getStart() == null) {
            return 0;
        }
        return ctx.getStart().getCharPositionInLine();
    }

    @Override
    public ASTNode visitCssLength(jinja2Parser.CssLengthContext ctx) {
        int line = safeGetLine(ctx);
        String text = ctx.getText();
        String[] parts = parseLengthValue(text);
        return new CSSLengthValueNode(parts[0], parts[1], line);
    }

    @Override
    public ASTNode visitCssColor(jinja2Parser.CssColorContext ctx) {
        int line = safeGetLine(ctx);
        String text = ctx.getText();
        return new CSSColorValueNode(text, line);
    }

    @Override
    public ASTNode visitCssKeyword(jinja2Parser.CssKeywordContext ctx) {
        int line = safeGetLine(ctx);
        String keyword = ctx.getText();
        return new CSSKeywordValueNode(keyword, line);
    }

    @Override
    public ASTNode visitCssNumber(jinja2Parser.CssNumberContext ctx) {
        int line = safeGetLine(ctx);
        String number = ctx.getText();
        return new CSSNumberValueNode(number, line);
    }

    @Override
    public ASTNode visitCssTime(jinja2Parser.CssTimeContext ctx) {
        int line = safeGetLine(ctx);
        String time = ctx.getText();
        return new CSSTimeValueNode(time, line);
    }

    @Override
    public ASTNode visitCssIdent(jinja2Parser.CssIdentContext ctx) {
        int line = safeGetLine(ctx);
        String ident = ctx.getText();
        return new CSSIdentValueNode(ident, line);
    }

    @Override
    public ASTNode visitCssRgbaFunction(jinja2Parser.CssRgbaFunctionContext ctx) {
        int line = safeGetLine(ctx);
        String r = ctx.r.getText();
        String g = ctx.g.getText();
        String b = ctx.b.getText();
        String a = ctx.a.getText();

        List<CSSValueNode> args = new ArrayList<>();
        args.add(new CSSNumberValueNode(r, line));
        args.add(new CSSNumberValueNode(g, line));
        args.add(new CSSNumberValueNode(b, line));
        args.add(new CSSNumberValueNode(a, line));

        return new CSSFunctionValueNode("rgba", args, line);
    }

    @Override
    public ASTNode visitCssTransformFunction(jinja2Parser.CssTransformFunctionContext ctx) {
        int line = safeGetLine(ctx);
        CSSValueNode value = (CSSValueNode) visit(ctx.value);

        List<CSSValueNode> args = new ArrayList<>();
        args.add(value);

        return new CSSFunctionValueNode("translateY", args, line);
    }

    // ==================== CSS INTERMEDIATE VALUE RULES ====================

    // ==================== CSS STYLESHEET & RULE VISITORS ====================

    @Override
    public ASTNode visitCssStylesheet(jinja2Parser.CssStylesheetContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);
        CSSStylesheetNode stylesheet = new CSSStylesheetNode(line, col);

        // Visit all CSS rules
        for (jinja2Parser.CssRuleContext ruleCtx : ctx.cssRule()) {
            ASTNode ruleNode = visit(ruleCtx);
            if (ruleNode instanceof CSSRuleNode) {
                stylesheet.addRule((CSSRuleNode) ruleNode);
            }
        }

        return stylesheet;
    }

    @Override
    public ASTNode visitCssRule(jinja2Parser.CssRuleContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);
        CSSRuleNode rule = new CSSRuleNode(line, col);

        // Visit selectors
        for (jinja2Parser.CssSelectorContext selectorCtx : ctx.selectors) {
            ASTNode selectorNode = visit(selectorCtx);
            if (selectorNode instanceof CSSSelectorNode) {
                rule.addSelector((CSSSelectorNode) selectorNode);
            }
        }

        // Visit declarations (these are already implemented as specific property nodes)
        for (jinja2Parser.CssDeclarationContext declCtx : ctx.declarations) {
            ASTNode declNode = visit(declCtx);
            if (declNode instanceof CSSPropertyNode) {
                // Wrap CSSPropertyNode in CSSDeclarationNode
                CSSPropertyNode propNode = (CSSPropertyNode) declNode;
                CSSDeclarationNode declaration = new CSSDeclarationNode(propNode.getPropertyName(), line, col);
                // Add values from property node to declaration
                for (CSSValueNode value : propNode.getValues()) {
                    declaration.addValue(value);
                }
                declaration.setParent(rule);
                rule.addDeclaration(declaration);
            }
        }

        return rule;
    }

    // ==================== CSS SELECTOR VISITORS (Labeled Alternatives) ====================

    @Override
    public ASTNode visitElementSelector(jinja2Parser.ElementSelectorContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);
        String elementName = ctx.cssElementSelector().getText();
        return new CSSElementSelectorNode(elementName, line, col);
    }

    @Override
    public ASTNode visitClassSelector(jinja2Parser.ClassSelectorContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);
        String className = ctx.cssClassSelector().className.getText();
        return new CSSClassSelectorNode(className, line, col);
    }

    @Override
    public ASTNode visitElementPseudoSelector(jinja2Parser.ElementPseudoSelectorContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);

        // Create element selector with pseudo-class suffix
        String elementName = ctx.cssElementSelector().getText();
        String pseudoClass = ctx.cssPseudoClass().getText().substring(1); // Remove ':'

        // Create a pseudo-class selector node
        return new CSSPseudoClassSelectorNode(elementName + ":" + pseudoClass, line, col);
    }

    @Override
    public ASTNode visitClassPseudoSelector(jinja2Parser.ClassPseudoSelectorContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);

        // Create class selector with pseudo-class suffix
        String className = ctx.cssClassSelector().className.getText();
        String pseudoClass = ctx.cssPseudoClass().getText().substring(1); // Remove ':'

        // Create a pseudo-class selector node
        return new CSSPseudoClassSelectorNode("." + className + ":" + pseudoClass, line, col);
    }

    @Override
    public ASTNode visitDescendantSelector(jinja2Parser.DescendantSelectorContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);

        // Visit ancestor selector
        ASTNode ancestorNode = visit(ctx.cssDescendantSelector().ancestor);
        CSSSelectorNode ancestor = (ancestorNode instanceof CSSSelectorNode)
                ? (CSSSelectorNode) ancestorNode
                : null;

        CSSDescendantSelectorNode descendantSel = new CSSDescendantSelectorNode(ancestor, line, col);

        // Visit descendant selectors
        for (jinja2Parser.CssSelectorSimpleContext descCtx : ctx.cssDescendantSelector().descendant) {
            ASTNode descNode = visit(descCtx);
            if (descNode instanceof CSSSelectorNode) {
                descendantSel.addDescendant((CSSSelectorNode) descNode);
            }
        }

        return descendantSel;
    }

    @Override
    public ASTNode visitElementClassSelector(jinja2Parser.ElementClassSelectorContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);

        // Create combined element.class selector
        String elementName = ctx.cssElementSelector().getText();
        String className = ctx.cssClassSelector().className.getText();

        // Return as element selector with class suffix (e.g., "div.container")
        return new CSSElementSelectorNode(elementName + "." + className, line, col);
    }

    // ==================== CSS SELECTOR HELPER VISITORS ====================

    // ==================== CSS LABELED ALTERNATIVE WRAPPERS ====================

    // cssDeclaration alternatives (13 wrappers)
    @Override
    public ASTNode visitCssSingleLengthDecl(jinja2Parser.CssSingleLengthDeclContext ctx) {
        return visitSingleLengthDecl(ctx.singleLengthDecl());
    }

    @Override
    public ASTNode visitCssMultipleLengthDecl(jinja2Parser.CssMultipleLengthDeclContext ctx) {
        return visitMultipleLengthDecl(ctx.multipleLengthDecl());
    }

    @Override
    public ASTNode visitCssColorDecl(jinja2Parser.CssColorDeclContext ctx) {
        return visitColorDecl(ctx.colorDecl());
    }

    @Override
    public ASTNode visitCssKeywordDecl(jinja2Parser.CssKeywordDeclContext ctx) {
        return visitKeywordDecl(ctx.keywordDecl());
    }

    @Override
    public ASTNode visitCssBoxShadowDecl(jinja2Parser.CssBoxShadowDeclContext ctx) {
        return visitBoxShadowDecl(ctx.boxShadowDecl());
    }

    @Override
    public ASTNode visitCssBorderDecl(jinja2Parser.CssBorderDeclContext ctx) {
        return visitBorderDecl(ctx.borderDecl());
    }

    @Override
    public ASTNode visitCssTransitionDecl(jinja2Parser.CssTransitionDeclContext ctx) {
        return visitTransitionDecl(ctx.transitionDecl());
    }

    @Override
    public ASTNode visitCssTransformDecl(jinja2Parser.CssTransformDeclContext ctx) {
        return visitTransformDecl(ctx.transformDecl());
    }

    @Override
    public ASTNode visitCssBackgroundDecl(jinja2Parser.CssBackgroundDeclContext ctx) {
        return visitBackgroundDecl(ctx.backgroundDecl());
    }

    @Override
    public ASTNode visitCssFontFamilyDecl(jinja2Parser.CssFontFamilyDeclContext ctx) {
        return visitFontFamilyDecl(ctx.fontFamilyDecl());
    }

    @Override
    public ASTNode visitCssFontWeightDecl(jinja2Parser.CssFontWeightDeclContext ctx) {
        return visitFontWeightDecl(ctx.fontWeightDecl());
    }

    @Override
    public ASTNode visitCssBoxSizingDecl(jinja2Parser.CssBoxSizingDeclContext ctx) {
        return visitBoxSizingDecl(ctx.boxSizingDecl());
    }

    @Override
    public ASTNode visitCssOutlineDecl(jinja2Parser.CssOutlineDeclContext ctx) {
        return visitOutlineDecl(ctx.outlineDecl());
    }

    // cssValue alternatives (7 visitors replace 1 if-else chain)
    @Override
    public ASTNode visitCssValueLength(jinja2Parser.CssValueLengthContext ctx) {
        return visitCssLength(ctx.cssLength());
    }

    @Override
    public ASTNode visitCssValueColor(jinja2Parser.CssValueColorContext ctx) {
        return visitCssColor(ctx.cssColor());
    }

    @Override
    public ASTNode visitCssValueKeyword(jinja2Parser.CssValueKeywordContext ctx) {
        return visitCssKeyword(ctx.cssKeyword());
    }

    @Override
    public ASTNode visitCssValueNumber(jinja2Parser.CssValueNumberContext ctx) {
        return visitCssNumber(ctx.cssNumber());
    }

    @Override
    public ASTNode visitCssValueFunction(jinja2Parser.CssValueFunctionContext ctx) {
        return visit(ctx.cssFunction());
    }

    @Override
    public ASTNode visitCssValueIdent(jinja2Parser.CssValueIdentContext ctx) {
        return visitCssIdent(ctx.cssIdent());
    }

    @Override
    public ASTNode visitCssValueTime(jinja2Parser.CssValueTimeContext ctx) {
        return visitCssTime(ctx.cssTime());
    }

    // cssFunction alternatives (2 visitors)
    @Override
    public ASTNode visitCssRgbaFunc(jinja2Parser.CssRgbaFuncContext ctx) {
        return visitCssRgbaFunction(ctx.cssRgbaFunction());
    }

    @Override
    public ASTNode visitCssTransformFunc(jinja2Parser.CssTransformFuncContext ctx) {
        return visitCssTransformFunction(ctx.cssTransformFunction());
    }

    // cssColorValue alternatives (2 visitors)
    @Override
    public ASTNode visitCssColorLiteral(jinja2Parser.CssColorLiteralContext ctx) {
        return visitCssColor(ctx.cssColor());
    }

    @Override
    public ASTNode visitCssColorKeyword(jinja2Parser.CssColorKeywordContext ctx) {
        return visitCssKeyword(ctx.cssKeyword());
    }

    // cssColorOrFunction alternatives (2 visitors)
    @Override
    public ASTNode visitCssColorOrFuncColor(jinja2Parser.CssColorOrFuncColorContext ctx) {
        return visitCssColor(ctx.cssColor());
    }

    @Override
    public ASTNode visitCssColorOrFuncFunc(jinja2Parser.CssColorOrFuncFuncContext ctx) {
        return visit(ctx.cssFunction());
    }

    // cssBackgroundValue alternatives (3 visitors)
    @Override
    public ASTNode visitCssBgColor(jinja2Parser.CssBgColorContext ctx) {
        return visitCssColor(ctx.cssColor());
    }

    @Override
    public ASTNode visitCssBgKeyword(jinja2Parser.CssBgKeywordContext ctx) {
        return visitCssKeyword(ctx.cssKeyword());
    }

    @Override
    public ASTNode visitCssBgFunction(jinja2Parser.CssBgFunctionContext ctx) {
        return visit(ctx.cssFunction());
    }

    // cssFontWeightValue alternatives (2 visitors)
    @Override
    public ASTNode visitCssFontWeightNum(jinja2Parser.CssFontWeightNumContext ctx) {
        return visitCssNumber(ctx.cssNumber());
    }

    @Override
    public ASTNode visitCssFontWeightKeyword(jinja2Parser.CssFontWeightKeywordContext ctx) {
        return visitCssKeyword(ctx.cssKeyword());
    }

    // cssOutlineValue alternatives (2 visitors)
    @Override
    public ASTNode visitCssOutlineKeyword(jinja2Parser.CssOutlineKeywordContext ctx) {
        return visitCssKeyword(ctx.cssKeyword());
    }

    @Override
    public ASTNode visitCssOutlineFull(jinja2Parser.CssOutlineFullContext ctx) {
        return visitOutlineValue(ctx.outlineValue());
    }

    // cssSelectorSimple alternatives (2 visitors)
    @Override
    public ASTNode visitCssSimpleElement(jinja2Parser.CssSimpleElementContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);
        String elementName = ctx.getText();
        return new CSSElementSelectorNode(elementName, line, col);
    }

    @Override
    public ASTNode visitCssSimpleClass(jinja2Parser.CssSimpleClassContext ctx) {
        int line = safeGetLine(ctx);
        int col = safeGetCol(ctx);
        // Get the class name - remove the leading dot from the full text
        String fullText = ctx.cssClassSelector().getText();
        String className = fullText.startsWith(".") ? fullText.substring(1) : fullText;
        return new CSSClassSelectorNode(className, line, col);
    }

}
