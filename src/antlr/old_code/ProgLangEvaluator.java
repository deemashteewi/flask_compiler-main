package antlr;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

// public class ProgLangEvaluator extends pythonParserBaseVisitor<Integer> {

//     private final Map<String, Integer> symbolTable = new HashMap<>();

//     // ==================== ROOT & STATEMENTS ====================

//     @Override
//     public Integer visitRoot(pythonParser.RootContext ctx) {
//         for (pythonParser.StatementContext stmt : ctx.statement()) {
//             visit(stmt);
//         }
//         return null;
//     }

//     @Override
//     public Integer visitStatement(pythonParser.StatementContext ctx) {
//         return visitChildren(ctx);
//     }

//     // ==================== ACTIONS ====================

//     @Override
//     public Integer visitAssignAction(pythonParser.AssignActionContext ctx) {
//         Integer value = visit(ctx.expr());
//         symbolTable.put(ctx.var.getText(), value);
//         return value;
//     }

//     @Override
//     public Integer visitPrintAction(pythonParser.PrintActionContext ctx) {
//         Integer value = visit(ctx.expr());
//         System.out.println(value);
//         return null;
//     }

//     // ==================== IF STATEMENT ====================

//     @Override
//     public Integer visitIfStatement(pythonParser.IfStatementContext ctx) {
//         List<pythonParser.ConditionContext> conditions = ctx.condition();
//         List<pythonParser.BlockContext> blocks = ctx.block();

//         // Check if condition
//         if (evaluateCondition(conditions.getFirst())) {
//             return visit(blocks.getFirst());
//         }

//         // Check elif conditions
//         int elifCount = conditions.size() - 1;
//         for (int i = 0; i < elifCount; i++) {
//             if (evaluateCondition(conditions.get(i + 1))) {
//                 return visit(blocks.get(i + 1));
//             }
//         }

//         // Check else block (if exists, it's the last block when blocks > conditions)
//         if (blocks.size() > conditions.size()) {
//             return visit(blocks.getLast());
//         }

//         return null;
//     }

//     @Override
//     public Integer visitBlock(pythonParser.BlockContext ctx) {
//         for (pythonParser.StatementContext stmt : ctx.statement()) {
//             visit(stmt);
//         }
//         return null;
//     }

//     // ==================== CONDITIONS ====================

//     private boolean evaluateCondition(pythonParser.ConditionContext ctx) {
//         Integer result = visit(ctx);
//         return result != null && result != 0;
//     }

//     @Override
//     public Integer visitAndCondition(pythonParser.AndConditionContext ctx) {
//         boolean left = evaluateCondition(ctx.left);
//         boolean right = evaluateCondition(ctx.right);
//         return (left && right) ? 1 : 0;
//     }

//     @Override
//     public Integer visitOrCondition(pythonParser.OrConditionContext ctx) {
//         boolean left = evaluateCondition(ctx.left);
//         boolean right = evaluateCondition(ctx.right);
//         return (left || right) ? 1 : 0;
//     }

//     @Override
//     public Integer visitNotCondition(pythonParser.NotConditionContext ctx) {
//         boolean value = evaluateCondition(ctx.condition());
//         return value ? 0 : 1;
//     }

//     @Override
//     public Integer visitParenCondition(pythonParser.ParenConditionContext ctx) {
//         return visit(ctx.condition());
//     }

//     @Override
//     public Integer visitCompareCondition(pythonParser.CompareConditionContext ctx) {
//         int left = visit(ctx.left);
//         int right = visit(ctx.right);

//         pythonParser.ComparisonOpContext op = ctx.comparisonOp();

//         if (op.EQ() != null)  return left == right ? 1 : 0;
//         if (op.NEQ() != null) return left != right ? 1 : 0;
//         if (op.LT() != null)  return left < right ? 1 : 0;
//         if (op.GT() != null)  return left > right ? 1 : 0;
//         if (op.LTE() != null) return left <= right ? 1 : 0;
//         if (op.GTE() != null) return left >= right ? 1 : 0;

//         return 0;
//     }

//     @Override
//     public Integer visitTrueCondition(pythonParser.TrueConditionContext ctx) {
//         return 1;
//     }

//     @Override
//     public Integer visitFalseCondition(pythonParser.FalseConditionContext ctx) {
//         return 0;
//     }

//     // ==================== EXPRESSIONS ====================

//     @Override
//     public Integer visitParenExpr(pythonParser.ParenExprContext ctx) {
//         return visit(ctx.expr());
//     }

//     @Override
//     public Integer visitEXPONENT_OP(pythonParser.EXPONENT_OPContext ctx) {
//         int base = visit(ctx.base);
//         int exp = visit(ctx.exp);
//         return (int) Math.pow(base, exp);
//     }

//     @Override
//     public Integer visitMUL_DIV_OP(pythonParser.MUL_DIV_OPContext ctx) {
//         int left = visit(ctx.left);
//         int right = visit(ctx.right);
//         if (ctx.DIV() != null) {
//             if (right == 0) {
//                 throw new RuntimeException("Division by zero");
//             }
//             return left / right;
//         }
//         return left * right;
//     }

//     @Override
//     public Integer visitSUM_SUB_OP(pythonParser.SUM_SUB_OPContext ctx) {
//         int left = visit(ctx.left);
//         int right = visit(ctx.right);
//         return ctx.SUB() != null ? left - right : left + right;
//     }

//     @Override
//     public Integer visitNUM(pythonParser.NUMContext ctx) {
//         return Integer.parseInt(ctx.NUM().getText());
//     }

//     @Override
//     public Integer visitVAR(pythonParser.VARContext ctx) {
//         String name = ctx.NAME().getText();
//         if (!symbolTable.containsKey(name)) {
//             throw new RuntimeException("Undefined variable: " + name);
//         }
//         return symbolTable.get(name);
//     }
// }
