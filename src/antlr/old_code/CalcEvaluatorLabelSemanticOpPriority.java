package antlr;

//public class CalcEvaluatorLabelSemanticOpPriority extends pythonParserBaseVisitor<Integer> {
//    @Override
//    public Integer visitRoot(pythonParser.RootContext ctx) {
//        System.out.println("Root called");
//        return visit(ctx.expr());
//    }
//
//    @Override
//    public Integer visitNUM(pythonParser.NUMContext ctx) {
//        System.out.println("NUM called");
//        return Integer.parseInt(ctx.NUM().getText());
//    }
//
//    @Override
//    public Integer visitMUL_DIV_OP(pythonParser.MUL_DIV_OPContext ctx) {
//        System.out.println("DIV MUL called");
//        var left = super.visit(ctx.left);
//        var right = super.visit(ctx.right);
//        return ctx.MUL() != null ? left * right : left / right;
//    }
//
//    @Override
//    public Integer visitSUM_SUB_OP(pythonParser.SUM_SUB_OPContext ctx) {
//        System.out.println("DIV MUL called");
//        var left = super.visit(ctx.left);
//        var right = super.visit(ctx.right);
//        return ctx.PLUS() != null ? left + right : left - right;
//    }
//
//}
