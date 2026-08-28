//package antlr;
//
//public class CalcEvaluatorLabelSemantic extends pythonParserBaseVisitor<Integer> {
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
//    public Integer visitMINUS(pythonParser.MINUSContext ctx) {
//        System.out.println("MINUS called");
//        var left = super.visit(ctx.left);
//        var right = super.visit(ctx.right);
//        return left - right;
//    }
//
//    @Override
//    public Integer visitSUM(pythonParser.SUMContext ctx) {
//        System.out.println("SUM called");
//        var left = super.visit(ctx.left);
//        var right = super.visit(ctx.right);
//        return left + right;
//    }
//
//}
