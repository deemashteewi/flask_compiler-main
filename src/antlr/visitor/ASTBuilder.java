
package antlr.visitor;


import antlr.ast.node.ASTNode;
import antlr.ast.python.ProgramNode;
import antlr.ast.python.StatementNode;
import antlr.ast.python.expressions.ExpressionNode;
import antlr.ast.python.expressions.ListComprehensionNode;
import antlr.ast.python.expressions.access.*;
import antlr.ast.python.expressions.literals.*;
import antlr.ast.python.expressions.operations.BinaryOpNode;
import antlr.ast.python.expressions.operations.ComparisonNode;
import antlr.ast.python.expressions.operations.LogicalOpNode;
import antlr.ast.python.expressions.operations.UnaryOpNode;
import antlr.ast.python.parameters.*;
import antlr.ast.python.statements.*;
import antlr.gen.python.pythonParser;
import antlr.gen.python.pythonParserBaseVisitor;
import antlr.symbol.Symbol;
import antlr.symbol.SymbolTable;
import antlr.semantic.SemanticError;

import java.util.ArrayList;
import java.util.List;

public class ASTBuilder extends pythonParserBaseVisitor<ASTNode> {

    private final SymbolTable symbolTable;
    private SymbolTable currentScope;
    private final List<SemanticError> semanticErrors = new ArrayList<>();
    private int loopDepth = 0;
    private int functionDepth = 0;
    private boolean suppressUndefinedCheck = false;

    // أسماء بايثون المدمجة (builtins) التي لا تحتاج تعريف
    private static final java.util.Set<String> BUILTINS = java.util.Set.of(
            "name", "file", "doc", "self", "print", "len", "range",
            "str", "int", "float", "bool", "list", "dict", "set", "tuple",
            "input", "type", "isinstance", "super", "open", "enumerate",
            "zip", "map", "filter", "sorted", "sum", "min", "max", "abs", "round"
    );
    private boolean isBuiltinOrDunder(String name) {
        return BUILTINS.contains(name) || (name.startsWith("__") && name.endsWith("__"));
    }
    public ASTBuilder() {
        this.symbolTable = new SymbolTable();
        this.currentScope = symbolTable;
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

    /**
     * تعريف معامل (parameter) بالنطاق الحالي مع كشف التكرار.
     * إذا كان الاسم معرّف مسبقاً بنفس نطاق الدالة (سواء regular/*args/kwonly/**kwargs)
     * يتم تسجيل خطأ DUPLICATE_PARAMETER بدل الكتابة فوق الرمز القديم بصمت.
     */
    private void defineParamChecked(String paramName, String functionName, int line, int col) {
        if (currentScope.isDefinedLocally(paramName)) {
            addError(SemanticError.ErrorType.DUPLICATE_PARAMETER,
                    "تكرار اسم المعامل '" + paramName + "' بتعريف الدالة '" + functionName + "'", line, col);
        } else {
            currentScope.define(paramName, Symbol.SymbolType.PARAMETER, line, col);
        }
    }
    // ==================== ROOT ====================
    @Override
    public ASTNode visitRoot(pythonParser.RootContext ctx) {
        int line = ctx.getStart() != null ? ctx.getStart().getLine() : 1;

        ProgramNode program = new ProgramNode(line);

        for (pythonParser.StatementContext stmtCtx : ctx.statement()) {
            ASTNode stmtNode = visit(stmtCtx);
            if (stmtNode instanceof StatementNode) {
                program.addStatement((StatementNode) stmtNode);
            }
        }

        return program;
    }

    // ==================== STATEMENTS ====================
    @Override
    public ASTNode visitAssignStatement(pythonParser.AssignStatementContext ctx) {
        return visit(ctx.assignment());
    }

    @Override
    public ASTNode visitAssignment(pythonParser.AssignmentContext ctx) {
        int line = ctx.getStart().getLine();
        int col = ctx.getStart().getCharPositionInLine();

        suppressUndefinedCheck = true;
        ExpressionNode targetNode = (ExpressionNode) visit(ctx.target);
        suppressUndefinedCheck = false;
        ExpressionNode valueNode = (ExpressionNode) visit(ctx.value);

        if (targetNode instanceof VariableNode) {
            String varName = ((VariableNode) targetNode).getName();
            Symbol symbol = new Symbol(varName, Symbol.SymbolType.VARIABLE, line, col);
            symbol.setValue(valueNode.toValueString());
            currentScope.define(symbol);
        }

        return new AssignmentNode(targetNode, valueNode, line, col);
    }

    @Override
    public ASTNode visitPrintStatement(pythonParser.PrintStatementContext ctx) {
        return visit(ctx.printAction());
    }

    @Override
    public ASTNode visitPrintAction(pythonParser.PrintActionContext ctx) {
        int line = ctx.getStart().getLine();
        int col = ctx.getStart().getCharPositionInLine();
        ExpressionNode exprNode = (ExpressionNode) visit(ctx.expr());
        return new PrintNode(exprNode, line, col);
    }

    @Override
    public ASTNode visitReturnStmt(pythonParser.ReturnStmtContext ctx) {
        return visit(ctx.returnStatement());
    }

    @Override
    public ASTNode visitReturnStatement(pythonParser.ReturnStatementContext ctx) {
        int line = ctx.getStart().getLine();
        int col = ctx.getStart().getCharPositionInLine();

        if (functionDepth == 0) {
            addError(SemanticError.ErrorType.INVALID_RETURN,
                    "استخدام return خارج أي دالة", line, col);
        }

        ExpressionNode value = null;
        if (ctx.expr() != null) {
            value = (ExpressionNode) visit(ctx.expr());
        }

        return new ReturnNode(value, line, col);
    }

    @Override
    public ASTNode visitExprStatement(pythonParser.ExprStatementContext ctx) {
        int line = ctx.getStart().getLine();
        int col = ctx.getStart().getCharPositionInLine();
        ExpressionNode exprNode = (ExpressionNode) visit(ctx.expr());
        return new ExpressionStatementNode(exprNode, line, col);
    }

    @Override
    public ASTNode visitImportStatement(pythonParser.ImportStatementContext ctx) {
        int line = ctx.getStart().getLine();
        int col = ctx.getStart().getCharPositionInLine();

        String moduleName = ctx.importHeader().module.getText();
        ImportStatement importStmt = new ImportStatement(moduleName, line, col);

        for (pythonParser.ImportedClassesContext classCtx : ctx.importHeader().importedClasses()) {
            String className = classCtx.NAME().getText();
            ImportedClassNode classNode = new ImportedClassNode(className,
                    classCtx.getStart().getLine(),
                    classCtx.getStart().getCharPositionInLine());
            importStmt.addImportedClass(classNode);

            // تسجيل الاسم المستورد بجدول الرموز حتى ما يُعتبر "غير معرّف" لاحقاً
            currentScope.define(className, Symbol.SymbolType.FUNCTION,
                    classCtx.getStart().getLine(), classCtx.getStart().getCharPositionInLine());
        }

        return importStmt;
    }

    @Override
    public ASTNode visitBlock(pythonParser.BlockContext ctx) {
        int line = ctx.getStart().getLine();
        int col = ctx.getStart().getCharPositionInLine();

        BlockNode block = new BlockNode(line, col);

        for (pythonParser.StatementContext stmtCtx : ctx.statement()) {
            ASTNode stmtNode = visit(stmtCtx);
            if (stmtNode instanceof StatementNode) {
                block.addStatement((StatementNode) stmtNode);
            }
        }

        return block;
    }

    // ==================== CONTROL FLOW ====================
    @Override
    public ASTNode visitIfStatement(pythonParser.IfStatementContext ctx) {
        int line = ctx.getStart().getLine();
        int col = ctx.getStart().getCharPositionInLine();

        List<pythonParser.ConditionContext> conditions = ctx.condition();
        List<pythonParser.BlockContext> blocks = ctx.block();

        ExpressionNode mainCondition = (ExpressionNode) visit(conditions.get(0));

        // if/elif/else ببايثون ما بعملوا block scope
        BlockNode ifBlock = (BlockNode) visit(blocks.get(0));

        List<ExpressionNode> elifConditions = new ArrayList<>();
        List<BlockNode> elifBlocks = new ArrayList<>();

        int elifCount = conditions.size() - 1;
        for (int i = 0; i < elifCount; i++) {
            ExpressionNode elifCond = (ExpressionNode) visit(conditions.get(i + 1));
            elifConditions.add(elifCond);
            BlockNode elifBlock = (BlockNode) visit(blocks.get(i + 1));
            elifBlocks.add(elifBlock);
        }

        BlockNode elseBlock = null;
        if (blocks.size() > conditions.size()) {
            elseBlock = (BlockNode) visit(blocks.get(blocks.size() - 1));
        }

        return new IfStatementNode(mainCondition, ifBlock,
                elifConditions, elifBlocks,
                elseBlock, line, col);
    }

    // ==================== LOOP STATEMENTS ====================
    @Override
    public ASTNode visitForStmt(pythonParser.ForStmtContext ctx) {
        return visit(ctx.forStatement());
    }

    @Override
    public ASTNode visitForStatement(pythonParser.ForStatementContext ctx) {
        int line = ctx.getStart().getLine();
        int col = ctx.getStart().getCharPositionInLine();

        String target = ctx.target.getText();
        ExpressionNode iterable = (ExpressionNode) visit(ctx.iterable);

        currentScope = currentScope.enterScope("for_block_" + line);
        currentScope.define(target, Symbol.SymbolType.VARIABLE, line, col);

        loopDepth++;
        BlockNode body = (BlockNode) visit(ctx.block());
        loopDepth--;

        currentScope = currentScope.exitScope();

        return new ForStatementNode(target, iterable, body, line, col);
    }

    @Override
    public ASTNode visitWhileStmt(pythonParser.WhileStmtContext ctx) {
        return visit(ctx.whileStatement());
    }

    @Override
    public ASTNode visitWhileStatement(pythonParser.WhileStatementContext ctx) {
        int line = ctx.getStart().getLine();
        int col = ctx.getStart().getCharPositionInLine();

        ExpressionNode condition = (ExpressionNode) visit(ctx.condition());

        currentScope = currentScope.enterScope("while_block_" + line);

        loopDepth++;
        BlockNode body = (BlockNode) visit(ctx.block());
        loopDepth--;

        currentScope = currentScope.exitScope();

        return new WhileStatementNode(condition, body, line, col);
    }

    @Override
    public ASTNode visitBreakStmt(pythonParser.BreakStmtContext ctx) {
        return visit(ctx.breakStatement());
    }

    @Override
    public ASTNode visitBreakStatement(pythonParser.BreakStatementContext ctx) {
        int line = ctx.getStart().getLine();
        int col = ctx.getStart().getCharPositionInLine();

        if (loopDepth == 0) {
            addError(SemanticError.ErrorType.INVALID_LOOP_CONTROL,
                    "استخدام 'break' خارج حلقة تكرارية (loop)", line, col);
        }

        return new BreakNode(line, col);
    }

    @Override
    public ASTNode visitContinueStmt(pythonParser.ContinueStmtContext ctx) {
        return visit(ctx.continueStatement());
    }

    @Override
    public ASTNode visitContinueStatement(pythonParser.ContinueStatementContext ctx) {
        int line = ctx.getStart().getLine();
        int col = ctx.getStart().getCharPositionInLine();

        if (loopDepth == 0) {
            addError(SemanticError.ErrorType.INVALID_LOOP_CONTROL,
                    "استخدام 'continue' خارج حلقة تكرارية (loop)", line, col);
        }

        return new ContinueNode(line, col);
    }

    // ==================== CONDITIONS ====================
    @Override
    public ASTNode visitAndCondition(pythonParser.AndConditionContext ctx) {
        int line = ctx.getStart().getLine();
        int col = ctx.getStart().getCharPositionInLine();
        ExpressionNode left = (ExpressionNode) visit(ctx.left);
        ExpressionNode right = (ExpressionNode) visit(ctx.right);
        return new LogicalOpNode(left, LogicalOpNode.Operator.AND, right, line, col);
    }

    @Override
    public ASTNode visitOrCondition(pythonParser.OrConditionContext ctx) {
        int line = ctx.getStart().getLine();
        int col = ctx.getStart().getCharPositionInLine();
        ExpressionNode left = (ExpressionNode) visit(ctx.left);
        ExpressionNode right = (ExpressionNode) visit(ctx.right);
        return new LogicalOpNode(left, LogicalOpNode.Operator.OR, right, line, col);
    }

    @Override
    public ASTNode visitNotCondition(pythonParser.NotConditionContext ctx) {
        int line = ctx.getStart().getLine();
        int col = ctx.getStart().getCharPositionInLine();
        ExpressionNode operand = (ExpressionNode) visit(ctx.condition());
        return new UnaryOpNode(UnaryOpNode.Operator.NOT, operand, line, col);
    }

    @Override
    public ASTNode visitParenCondition(pythonParser.ParenConditionContext ctx) {
        return visit(ctx.condition());
    }

    @Override
    public ASTNode visitCompareCondition(pythonParser.CompareConditionContext ctx) {
        int line = ctx.getStart().getLine();
        int col = ctx.getStart().getCharPositionInLine();
        ExpressionNode left = (ExpressionNode) visit(ctx.left);
        ExpressionNode right = (ExpressionNode) visit(ctx.right);
        String opStr = ctx.comparisonOp().getText();
        return new ComparisonNode(left, opStr, right, line, col);
    }

    @Override
    public ASTNode visitTrueCondition(pythonParser.TrueConditionContext ctx) {
        int line = ctx.getStart().getLine();
        int col = ctx.getStart().getCharPositionInLine();
        return new BooleanNode(true, line, col);
    }

    @Override
    public ASTNode visitFalseCondition(pythonParser.FalseConditionContext ctx) {
        int line = ctx.getStart().getLine();
        int col = ctx.getStart().getCharPositionInLine();
        return new BooleanNode(false, line, col);
    }
    @Override
    public ASTNode visitTruthyCondition(pythonParser.TruthyConditionContext ctx) {
        return visit(ctx.expr());
    }


    // ==================== DEFINITIONS ====================
    @Override
    public ASTNode visitClassDefStatement(pythonParser.ClassDefStatementContext ctx) {
        int line = ctx.getStart().getLine();
        int col = ctx.getStart().getCharPositionInLine();
        String className = ctx.classDefinition().name.getText();
        ClassDefinitionNode definitionNode = new ClassDefinitionNode(className, line, col);
        currentScope = currentScope.enterScope("class_" + className);

        // Class body
        for (pythonParser.StatementContext stmtCtx : ctx.classDefinition().block().statement()) {
            ASTNode stmtNode = visit(stmtCtx);
            if (stmtNode instanceof StatementNode) {
                definitionNode.addStatement((StatementNode) stmtNode);
            }
        }
        currentScope = currentScope.exitScope();

        return definitionNode;
    }

    @Override
    public ASTNode visitFunctionDef(pythonParser.FunctionDefContext ctx) {
        int line = ctx.getStart().getLine();
        int col = ctx.getStart().getCharPositionInLine();
        String functionName = ctx.NAME().getText();
        FunctionDefinitionNode definitionNode = new FunctionDefinitionNode(functionName, line, col);

        if (currentScope.isDefinedLocally(functionName)) {
            addError(SemanticError.ErrorType.REDECLARATION,
                    "إعادة تعريف الدالة '" + functionName + "' بنفس النطاق", line, col);
        } else {
            int totalParams = 0;
            int requiredParams = 0;
            boolean hasVarArgsOrKwargs = false;

            if (ctx.params() != null && ctx.params().regularParams() != null) {
                for (pythonParser.KwParamContext p : ctx.params().regularParams().kwParam()) {
                    totalParams++;
                    if (p.defaultVal == null) requiredParams++;
                }
            }
            if (ctx.params() != null && ctx.params().starParam() != null && ctx.params().starParam().starArgs != null) {
                hasVarArgsOrKwargs = true;
            }
            if (ctx.params() != null && ctx.params().kwargsParam() != null) {
                hasVarArgsOrKwargs = true;
            }

            Symbol funcSymbol = new Symbol(functionName, Symbol.SymbolType.FUNCTION, line, col);
            funcSymbol.setValue(requiredParams + "," + totalParams + "," + hasVarArgsOrKwargs);
            currentScope.define(funcSymbol);
        }

        currentScope = currentScope.enterScope("function_" + functionName);

        if (ctx.params() != null && ctx.params().regularParams() != null) {
            for (pythonParser.KwParamContext p : ctx.params().regularParams().kwParam()) {
                defineParamChecked(p.name.getText(), functionName,
                        p.getStart().getLine(), p.getStart().getCharPositionInLine());
            }
        }
        if (ctx.params() != null && ctx.params().starParam() != null && ctx.params().starParam().starArgs != null) {
            pythonParser.StarParamContext sp = ctx.params().starParam();
            defineParamChecked(sp.starArgs.getText(), functionName,
                    sp.getStart().getLine(), sp.getStart().getCharPositionInLine());
        }
        if (ctx.params() != null && ctx.params().kwOnlyParams() != null) {
            for (pythonParser.KwParamContext p : ctx.params().kwOnlyParams().kwParam()) {
                defineParamChecked(p.name.getText(), functionName,
                        p.getStart().getLine(), p.getStart().getCharPositionInLine());
            }
        }
        if (ctx.params() != null && ctx.params().kwargsParam() != null) {
            defineParamChecked(ctx.params().kwargsParam().kwargs.getText(), functionName,
                    ctx.params().kwargsParam().getStart().getLine(),
                    ctx.params().kwargsParam().getStart().getCharPositionInLine());
        }

        // Function body
        functionDepth++;
        boolean seenTerminator = false;
        boolean reportedUnreachable = false;
        for (pythonParser.StatementContext stmtCtx : ctx.block().statement()) {
            ASTNode stmtNode = visit(stmtCtx);
            if (stmtNode instanceof StatementNode) {
                if (seenTerminator && !reportedUnreachable) {
                    addError(SemanticError.ErrorType.UNREACHABLE_CODE,
                            "كود غير قابل للوصول بعد return (لن يُنفَّذ أبداً)",
                            stmtNode.getLineNumber(), stmtNode.getColumnNumber());
                    reportedUnreachable = true;
                }
                if (stmtNode instanceof ReturnNode) {
                    seenTerminator = true;
                }
                definitionNode.addStatement((StatementNode) stmtNode);
            }
        }
        functionDepth--;

        // 1. Regular params
        if (ctx.params() != null && ctx.params().regularParams() != null
                && !ctx.params().regularParams().kwParam().isEmpty()) {
            for (pythonParser.KwParamContext ctxx : ctx.params().regularParams().kwParam()) {
                ASTNode stmtNode = visit(ctxx);
                if (stmtNode instanceof RegularParamNode paramNode) {
                    definitionNode.addParameter(paramNode);
                }
            }
        }

        // 2. *args or bare *
        if (ctx.params() != null && ctx.params().starParam() != null) {
            ASTNode starNode = visit(ctx.params().starParam());
            if (starNode instanceof ParameterNode paramNode) {
                definitionNode.addParameter(paramNode);
            }
        }

        // 3. Keyword-only params
        if (ctx.params() != null && ctx.params().kwOnlyParams() != null) {
            for (pythonParser.KwParamContext kwCtx : ctx.params().kwOnlyParams().kwParam()) {
                int kwline = kwCtx.getStart().getLine();
                int kwcol = kwCtx.getStart().getCharPositionInLine();
                String name = kwCtx.name.getText();
                KeywordOnlyParamNode kwNode = new KeywordOnlyParamNode(name, kwline, kwcol);
                if (kwCtx.defaultVal != null) {
                    ExpressionNode defaultVal = (ExpressionNode) visit(kwCtx.defaultVal);
                    kwNode.setDefaultValue(defaultVal);
                }
                definitionNode.addParameter(kwNode);
            }
        }

        // 4. **kwargs
        if (ctx.params() != null && ctx.params().kwargsParam() != null) {
            ASTNode kwargsNode = visit(ctx.params().kwargsParam());
            if (kwargsNode instanceof ParameterNode paramNode) {
                definitionNode.addParameter(paramNode);
            }
        }
        currentScope = currentScope.exitScope();

        return definitionNode;
    }

    @Override
    public ASTNode visitKwParam(pythonParser.KwParamContext ctx) {
        int line = ctx.getStart().getLine();
        int col = ctx.getStart().getCharPositionInLine();
        String name = ctx.name.getText();
        RegularParamNode regularParamNode = new RegularParamNode(name, line, col);
        if (ctx.defaultVal != null) {
            ExpressionNode defaultValueExpr = (ExpressionNode) visit(ctx.defaultVal);
            regularParamNode.setDefaultValue(defaultValueExpr);
        }
        return regularParamNode;
    }

    @Override
    public ASTNode visitStarParam(pythonParser.StarParamContext ctx) {
        int line = ctx.getStart().getLine();
        int col = ctx.getStart().getCharPositionInLine();

        if (ctx.starArgs != null) {
            String name = ctx.starArgs.getText();
            return new StarArgsNode(name, line, col);
        } else {
            return new KeywordOnlySeparator(line, col);
        }
    }

    @Override
    public ASTNode visitKwargsParam(pythonParser.KwargsParamContext ctx) {
        int line = ctx.getStart().getLine();
        int col = ctx.getStart().getCharPositionInLine();
        String name = ctx.kwargs.getText();
        return new KwargsNode(name, line, col);
    }

    // ==================== DATA STRUCTURES ====================
    @Override
    public ASTNode visitListExpr(pythonParser.ListExprContext ctx) {
        int line = ctx.getStart().getLine();
        int col = ctx.getStart().getCharPositionInLine();

        ListNode listNode = new ListNode(line, col);
        for (pythonParser.ExprContext elem : ctx.list().expr()) {
            listNode.addElement((ExpressionNode) visit(elem));
        }
        return listNode;
    }

    @Override
    public ASTNode visitListCompExpr(pythonParser.ListCompExprContext ctx) {
        return visit(ctx.listComprehension());
    }

    @Override
    public ASTNode visitListComprehension(pythonParser.ListComprehensionContext ctx) {
        int line = ctx.getStart().getLine();
        int col = ctx.getStart().getCharPositionInLine();

        String target = ctx.target.getText();
        ExpressionNode iterable = (ExpressionNode) visit(ctx.iterable);

        currentScope = currentScope.enterScope("comprehension_" + line);
        currentScope.define(target, Symbol.SymbolType.VARIABLE, line, col);

        ExpressionNode element = (ExpressionNode) visit(ctx.element);

        ExpressionNode filter = null;
        if (ctx.filterCondition != null) {
            filter = (ExpressionNode) visit(ctx.filterCondition);
        }

        currentScope = currentScope.exitScope();

        return new ListComprehensionNode(element, target, iterable, filter, line, col);
    }

    @Override
    public ASTNode visitDict(pythonParser.DictContext ctx) {
        int line = ctx.getStart().getLine();
        int col = ctx.getStart().getCharPositionInLine();

        DictNode dictNode = new DictNode(line, col);
        java.util.Set<String> seenKeys = new java.util.HashSet<>();
        for (pythonParser.DictEntryContext elem : ctx.dictEntry()) {
            DictEntryNode entryNode = (DictEntryNode) visit(elem);
            dictNode.addElement(entryNode);

            String keySignature = staticKeySignature(entryNode.getKey());
            if (keySignature != null && !seenKeys.add(keySignature)) {
                addError(SemanticError.ErrorType.REDECLARATION,
                        "تكرار المفتاح " + keySignature + " بنفس تعريف الـ dict", line, col);
            }
        }
        return dictNode;
    }

    /**
     * يرجّع "توقيع" ثابت للمفتاح إذا كان قيمة حرفية بسيطة (نص أو رقم) يمكن مقارنتها،
     * أو null إذا كان المفتاح تعبير ديناميكي (متغير، نداء دالة...) ما ممكن نتأكد من قيمته وقت الترجمة.
     */
    private String staticKeySignature(ExpressionNode key) {
        if (key instanceof StringNode) {
            return "'" + ((StringNode) key).getValue() + "'";
        } else if (key instanceof NumberIntegerNode) {
            return String.valueOf(((NumberIntegerNode) key).getValue());
        }
        return null;
    }

    @Override
    public ASTNode visitDictEntry(pythonParser.DictEntryContext ctx) {
        int line = ctx.getStart().getLine();
        int col = ctx.getStart().getCharPositionInLine();

        DictEntryNode dictEntryNode = new DictEntryNode(line, col);
        ExpressionNode keyExpression = (ExpressionNode) visit(ctx.key);
        ExpressionNode valueExpression = (ExpressionNode) visit(ctx.value);
        dictEntryNode.addKey(keyExpression);
        dictEntryNode.addValue(valueExpression);
        return dictEntryNode;
    }

    @Override
    public ASTNode visitDICTIONARY(pythonParser.DICTIONARYContext ctx) {
        return visit(ctx.dict());
    }

    // ==================== EXPRESSIONS ====================
    // Pass-through rules
    @Override
    public ASTNode visitAdditivePassThrough(pythonParser.AdditivePassThroughContext ctx) {
        return visit(ctx.multiplicativeExpr());
    }

    @Override
    public ASTNode visitMultiplicativePassThrough(pythonParser.MultiplicativePassThroughContext ctx) {
        return visit(ctx.powerExpr());
    }

    @Override
    public ASTNode visitPowerPassThrough(pythonParser.PowerPassThroughContext ctx) {
        return visit(ctx.postfixExpr());
    }

    @Override
    public ASTNode visitPostfixPassThrough(pythonParser.PostfixPassThroughContext ctx) {
        return visit(ctx.primaryExpr());
    }

    // Binary operations
    @Override
    public ASTNode visitEXPONENT_OP(pythonParser.EXPONENT_OPContext ctx) {
        int line = ctx.getStart().getLine();
        int col = ctx.getStart().getCharPositionInLine();
        ExpressionNode base = (ExpressionNode) visit(ctx.base);
        ExpressionNode exp = (ExpressionNode) visit(ctx.exp);
        return new BinaryOpNode(base, BinaryOpNode.Operator.POW, exp, line, col);
    }

    @Override
    public ASTNode visitMUL_DIV_OP(pythonParser.MUL_DIV_OPContext ctx) {
        int line = ctx.getStart().getLine();
        int col = ctx.getStart().getCharPositionInLine();
        ExpressionNode left = (ExpressionNode) visit(ctx.left);
        ExpressionNode right = (ExpressionNode) visit(ctx.right);
        BinaryOpNode.Operator op = ctx.STAR() != null
                ? BinaryOpNode.Operator.MUL : BinaryOpNode.Operator.DIV;
        return new BinaryOpNode(left, op, right, line, col);
    }

    @Override
    public ASTNode visitSUM_SUB_OP(pythonParser.SUM_SUB_OPContext ctx) {
        int line = ctx.getStart().getLine();
        int col = ctx.getStart().getCharPositionInLine();
        ExpressionNode left = (ExpressionNode) visit(ctx.left);
        ExpressionNode right = (ExpressionNode) visit(ctx.right);
        BinaryOpNode.Operator op = ctx.PLUS() != null
                ? BinaryOpNode.Operator.ADD : BinaryOpNode.Operator.SUB;

        if (isStringLiteral(left) != isStringLiteral(right)
                && (isStringLiteral(left) || isNumericLiteral(left))
                && (isStringLiteral(right) || isNumericLiteral(right))) {
            addError(SemanticError.ErrorType.TYPE_MISMATCH,
                    "عملية '" + (op == BinaryOpNode.Operator.ADD ? "+" : "-")
                            + "' بين نص (string) ورقم غير مسموحة", line, col);
        }

        return new BinaryOpNode(left, op, right, line, col);
    }

    private boolean isStringLiteral(ExpressionNode node) {
        return node instanceof StringNode;
    }

    private boolean isNumericLiteral(ExpressionNode node) {
        return node instanceof NumberIntegerNode || node instanceof NumberDoubleNode;
    }

    // Primary & Access expressions
    @Override
    public ASTNode visitNUM(pythonParser.NUMContext ctx) {
        int line = ctx.getStart().getLine();
        int col = ctx.getStart().getCharPositionInLine();

        if (ctx.int_ != null) {
            int value = Integer.parseInt(ctx.int_.getText());
            return new NumberIntegerNode(value, line, col);
        } else {
            double value = Double.parseDouble(ctx.double_.getText());
            return new NumberDoubleNode(value, line, col);
        }
    }

    @Override
    public ASTNode visitSTRING_LITERAL(pythonParser.STRING_LITERALContext ctx) {
        int line = ctx.getStart().getLine();
        int col = ctx.getStart().getCharPositionInLine();
        return new StringNode(ctx.STRING().getText(), line, col);
    }

    @Override
    public ASTNode visitTrueLiteral(pythonParser.TrueLiteralContext ctx) {
        int line = ctx.getStart().getLine();
        int col = ctx.getStart().getCharPositionInLine();
        return new BooleanNode(true, line, col);
    }

    @Override
    public ASTNode visitFalseLiteral(pythonParser.FalseLiteralContext ctx) {
        int line = ctx.getStart().getLine();
        int col = ctx.getStart().getCharPositionInLine();
        return new BooleanNode(false, line, col);
    }

    @Override
    public ASTNode visitNoneLiteral(pythonParser.NoneLiteralContext ctx) {
        int line = ctx.getStart().getLine();
        int col = ctx.getStart().getCharPositionInLine();
        return new NoneNode(line, col);
    }

    @Override
    public ASTNode visitVAR(pythonParser.VARContext ctx) {
        int line = ctx.getStart().getLine();
        int col = ctx.getStart().getCharPositionInLine();
        String name = ctx.NAME().getText();



        if (!suppressUndefinedCheck && !isBuiltinOrDunder(name) && currentScope.resolve(name) == null) {
            addError(SemanticError.ErrorType.UNDEFINED_VARIABLE,
                "استخدام متغير غير معرّف: '" + name + "'", line, col);
        }

        return new VariableNode(name, line, col);
    }

    @Override
    public ASTNode visitParenExpr(pythonParser.ParenExprContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public ASTNode visitINDEX_ACCESS(pythonParser.INDEX_ACCESSContext ctx) {
        int line = ctx.getStart().getLine();
        int col = ctx.getStart().getCharPositionInLine();

        ExpressionNode container = (ExpressionNode) visit(ctx.container);
        ExpressionNode key = (ExpressionNode) visit(ctx.key);

        IndexAccessNode node = new IndexAccessNode(line, col);
        node.addContainer(container);
        node.addKey(key);
        return node;
    }

    @Override
    public ASTNode visitDotAccessExpr(pythonParser.DotAccessExprContext ctx) {
        int line = ctx.getStart().getLine();
        int col = ctx.getStart().getCharPositionInLine();

        ExpressionNode object = (ExpressionNode) visit(ctx.object);
        String property = ctx.property.getText();

        DotAccessNode node = new DotAccessNode(line, col);
        node.addObject(object);
        node.addProperty(property);
        return node;
    }

    @Override
    public ASTNode visitCallExpr(pythonParser.CallExprContext ctx) {
        int line = ctx.getStart().getLine();
        int col = ctx.getStart().getCharPositionInLine();

        FunctionCallNode node = new FunctionCallNode(line, col);
        suppressUndefinedCheck = true;
        ExpressionNode callee = (ExpressionNode) visit(ctx.callee);
        suppressUndefinedCheck = false;
        node.setCallee(callee);

        java.util.Set<String> seenKwargNames = new java.util.HashSet<>();
        for (pythonParser.ArgumentContext argCtx : ctx.argument()) {
            ExpressionNode arg = (ExpressionNode) visit(argCtx);
            node.addParameter(arg);
            if (argCtx.name != null) {
                String kwName = argCtx.name.getText();
                if (!seenKwargNames.add(kwName)) {
                    addError(SemanticError.ErrorType.DUPLICATE_KEYWORD_ARGUMENT,
                            "تكرار keyword argument '" + kwName + "' بنفس الاستدعاء", line, col);
                }
            }
        }

        if (callee instanceof VariableNode) {
            String calleeName = ((VariableNode) callee).getName();
            Symbol symbol = currentScope.resolve(calleeName);

            if (symbol == null) {
                if (!BUILTINS.contains(calleeName)) {
                    addError(SemanticError.ErrorType.UNDEFINED_FUNCTION,
                            "استدعاء دالة غير معرّفة: '" + calleeName + "'", line, col);
                }
            } else if (symbol.getType() == Symbol.SymbolType.FUNCTION && symbol.getValue() != null) {
                String[] arity = symbol.getValue().toString().split(",");
                int required = Integer.parseInt(arity[0]);
                int total = Integer.parseInt(arity[1]);
                boolean hasVarArgsOrKwargs = Boolean.parseBoolean(arity[2]);
                int actual = ctx.argument().size();

                if (actual < required) {
                    addError(SemanticError.ErrorType.ARGUMENT_COUNT_MISMATCH,
                            "عدد الوسائط غير كافٍ عند استدعاء '" + calleeName + "': المطلوب على الأقل "
                                    + required + " لكن تم تمرير " + actual, line, col);
                } else if (!hasVarArgsOrKwargs && actual > total) {
                    addError(SemanticError.ErrorType.ARGUMENT_COUNT_MISMATCH,
                            "عدد الوسائط أكبر من المسموح عند استدعاء '" + calleeName + "': الحد الأقصى "
                                    + total + " لكن تم تمرير " + actual, line, col);
                }
            } else if (symbol.getType() != Symbol.SymbolType.FUNCTION) {
                addError(SemanticError.ErrorType.INVALID_CALL,
                        "استدعاء '" + calleeName + "' كدالة لكنه ليس كذلك (نوعه: "
                                + symbol.getType() + ")", line, col);
            }
        }

        return node;
    }

    @Override
    public ASTNode visitArgument(pythonParser.ArgumentContext ctx) {
        int line = ctx.getStart().getLine();
        int col = ctx.getStart().getCharPositionInLine();

        KeywordArgumentNode node = new KeywordArgumentNode(line, col);
        if (ctx.name != null) {
            node.addName(ctx.name.getText());
        }
        if (ctx.value != null) {
            ExpressionNode arg = (ExpressionNode) visit(ctx.value);
            node.addValue(arg);
        }
        return node;
    }
}
