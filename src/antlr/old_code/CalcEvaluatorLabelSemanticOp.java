package antlr;

//public class CalcEvaluatorLabelSemanticOp extends pythonParserBaseVisitor<Integer>{
//        @Override
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
//
//
//    @Override
//    public Integer visitBinaryOp(pythonParser.BinaryOpContext ctx) {
//        System.out.println("SUM called");
//        var left = super.visit(ctx.left);
//        var right = super.visit(ctx.right);
//        return ctx.PLUS()!=null?left+right:left-right;
//    }
//}
