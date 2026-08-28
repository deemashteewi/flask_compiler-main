//package antlr;
//
//public class CalcEvaluator extends pythonParserBaseVisitor<Integer> {
//
//    @Override
//    public Integer visitRoot(pythonParser.RootContext ctx) {
//        // assuming rule: root: expr EOF
//        return visit(ctx.expr());
//    }
//
//    @Override
//    public Integer visitExpr(pythonParser.ExprContext ctx) {
//        // example grammar: expr: expr '+' expr | INT ;
//        if (ctx.NUM() != null) {
//            return Integer.parseInt(ctx.NUM().getText());
//        }
//        int left  = visit(ctx.expr(0));
//        int right = visit(ctx.expr(1));
//        if(ctx.SUB()!=null){
//            return left - right;
//        }
//        return left + right;
//    }
//}
