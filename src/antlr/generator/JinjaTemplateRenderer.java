package antlr.generator;

import antlr.ast.css.CSSStylesheetNode;
import antlr.ast.node.ASTNode;
import antlr.ast.jinja2.TemplateNode;
import antlr.ast.jinja2.blocks.ElifBranchNode;
import antlr.ast.jinja2.blocks.ForBlockNode;
import antlr.ast.jinja2.blocks.IfBlockNode;
import antlr.ast.jinja2.content.HtmlAttributeNode;
import antlr.ast.jinja2.content.HtmlAttributeValueNode;
import antlr.ast.jinja2.content.HtmlElementNode;
import antlr.ast.jinja2.content.HtmlTextNode;
import antlr.ast.jinja2.content.QuoteStyle;
import antlr.ast.jinja2.expressions.ArgumentNode;
import antlr.ast.jinja2.expressions.DotAccessExprNode;
import antlr.ast.jinja2.expressions.ExpressionBlockNode;
import antlr.ast.jinja2.expressions.FilterNode;
import antlr.ast.jinja2.expressions.FunctionCallExprNode;
import antlr.ast.jinja2.expressions.IndexAccessExprNode;
import antlr.ast.jinja2.expressions.JinjaExpressionNode;
import antlr.ast.jinja2.expressions.ParenExprNode;
import antlr.ast.jinja2.expressions.TernaryExprNode;
import antlr.ast.jinja2.expressions.TestExprNode;
import antlr.ast.jinja2.expressions.VariableExprNode;
import antlr.ast.jinja2.expressions.literals.JinjaBooleanNode;
import antlr.ast.jinja2.expressions.literals.JinjaDictEntryNode;
import antlr.ast.jinja2.expressions.literals.JinjaDictNode;
import antlr.ast.jinja2.expressions.literals.JinjaListNode;
import antlr.ast.jinja2.expressions.literals.JinjaNoneNode;
import antlr.ast.jinja2.expressions.literals.JinjaNumberDoubleNode;
import antlr.ast.jinja2.expressions.literals.JinjaNumberIntegerNode;
import antlr.ast.jinja2.expressions.literals.JinjaStringNode;
import antlr.ast.jinja2.expressions.operations.JinjaBinaryOpNode;
import antlr.ast.jinja2.expressions.operations.JinjaComparisonNode;
import antlr.ast.jinja2.expressions.operations.JinjaLogicalOpNode;
import antlr.ast.jinja2.expressions.operations.JinjaUnaryOpNode;
import antlr.ast.jinja2.targets.SimpleTargetNode;
import antlr.ast.jinja2.targets.TargetNode;
import antlr.ast.jinja2.targets.TupleTargetNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;


public class JinjaTemplateRenderer {

    private final Deque<Map<String, Object>> scopes = new ArrayDeque<>();

    public String render(TemplateNode template, Map<String, Object> context) {
        StringBuilder sb = new StringBuilder();
        if (template == null) {
            return sb.toString();
        }
        scopes.push(context != null ? context : new HashMap<>());
        try {
            for (ASTNode node : template.getContent()) {
                renderNode(node, sb);
            }
        } finally {
            scopes.pop();
        }
        return sb.toString();
    }


    private void renderNode(ASTNode node, StringBuilder sb) {
        if (node == null) {
            return;
        }
        if (node instanceof HtmlTextNode) {
            sb.append(((HtmlTextNode) node).getText());
        } else if (node instanceof ExpressionBlockNode) {
            renderExpressionBlock((ExpressionBlockNode) node, sb);
        } else if (node instanceof ForBlockNode) {
            renderFor((ForBlockNode) node, sb);
        } else if (node instanceof IfBlockNode) {
            renderIf((IfBlockNode) node, sb);
        } else if (node instanceof CSSStylesheetNode) {
            sb.append(CssRenderer.render((CSSStylesheetNode) node));
        } else if (node instanceof HtmlElementNode) {
            renderHtmlElement((HtmlElementNode) node, sb);
        }
    }

    private void renderExpressionBlock(ExpressionBlockNode block, StringBuilder sb) {
        Object value = evaluate(block.getExpression());
        if (block.hasFilters()) {
            for (FilterNode filter : block.getFilters()) {
                value = applyFilter(filter, value);
            }
        }
        sb.append(stringify(value));
    }

    private void renderFor(ForBlockNode forBlock, StringBuilder sb) {
        Object iterableValue = evaluate(forBlock.getIterable());
        List<Object> items = toIterable(iterableValue);

        if (items.isEmpty()) {
            if (forBlock.hasElseBranch()) {
                for (ASTNode child : forBlock.getElseBranch().getBody()) {
                    renderNode(child, sb);
                }
            }
            return;
        }

        boolean renderedAny = false;
        for (Object item : items) {
            Map<String, Object> loopScope = new HashMap<>();
            bindTarget(forBlock.getTarget(), item, loopScope);

            scopes.push(loopScope);
            try {
                if (forBlock.hasCondition() && !truthy(evaluate(forBlock.getCondition()))) {
                    continue;
                }
                renderedAny = true;
                for (ASTNode child : forBlock.getBody()) {
                    renderNode(child, sb);
                }
            } finally {
                scopes.pop();
            }
        }

        if (!renderedAny && forBlock.hasElseBranch()) {
            for (ASTNode child : forBlock.getElseBranch().getBody()) {
                renderNode(child, sb);
            }
        }
    }

    private void renderIf(IfBlockNode ifBlock, StringBuilder sb) {
        if (truthy(evaluate(ifBlock.getCondition()))) {
            for (ASTNode child : ifBlock.getBody()) {
                renderNode(child, sb);
            }
            return;
        }
        for (ElifBranchNode elif : ifBlock.getElifBranches()) {
            if (truthy(evaluate(elif.getCondition()))) {
                for (ASTNode child : elif.getBody()) {
                    renderNode(child, sb);
                }
                return;
            }
        }
        if (ifBlock.hasElseBranch()) {
            for (ASTNode child : ifBlock.getElseBranch().getBody()) {
                renderNode(child, sb);
            }
        }
    }

    private void renderHtmlElement(HtmlElementNode element, StringBuilder sb) {
        String tag = element.getTagName();
        sb.append('<').append(tag);
        if (element.hasAttributes()) {
            for (HtmlAttributeNode attr : element.getAttributes()) {
                renderAttribute(attr, sb);
            }
        }

        if (!element.canHaveChildren()) {
            sb.append(" />");
            return;
        }
        sb.append('>');

        for (ASTNode child : element.getChildNodes()) {
            renderNode(child, sb);
        }

        sb.append("</").append(tag).append('>');
    }

    private void renderAttribute(HtmlAttributeNode attr, StringBuilder sb) {
        sb.append(' ').append(attr.getNameAsString());
        if (attr.isBooleanAttribute()) {
            return;
        }
        String value = renderAttributeValue(attr.getValue());
        char quote = attr.getQuoteStyle() == QuoteStyle.SINGLE ? '\'' : '"';
        sb.append('=').append(quote).append(value).append(quote);
    }

    private String renderAttributeValue(HtmlAttributeValueNode value) {
        if (value == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (ASTNode part : value.getParts()) {
            if (part instanceof HtmlTextNode) {
                sb.append(((HtmlTextNode) part).getText());
            } else if (part instanceof ExpressionBlockNode) {
                renderExpressionBlock((ExpressionBlockNode) part, sb);
            }
        }
        return sb.toString();
    }


    private void bindTarget(TargetNode target, Object item, Map<String, Object> scope) {
        if (target instanceof SimpleTargetNode) {
            scope.put(((SimpleTargetNode) target).getTarget(), item);
        } else if (target instanceof TupleTargetNode) {
            List<String> names = ((TupleTargetNode) target).getTargets();
            List<Object> values = tupleValues(item);
            for (int i = 0; i < names.size(); i++) {
                scope.put(names.get(i), i < values.size() ? values.get(i) : null);
            }
        }
    }

    @SuppressWarnings("unchecked")
    private List<Object> tupleValues(Object item) {
        if (item instanceof Map.Entry) {
            Map.Entry<Object, Object> entry = (Map.Entry<Object, Object>) item;
            List<Object> values = new ArrayList<>();
            values.add(entry.getKey());
            values.add(entry.getValue());
            return values;
        }
        if (item instanceof List) {
            return (List<Object>) item;
        }
        return Collections.singletonList(item);
    }

    @SuppressWarnings("unchecked")
    private List<Object> toIterable(Object value) {
        if (value instanceof List) {
            return (List<Object>) value;
        }
        if (value instanceof Map) {
            return new ArrayList<>(((Map<Object, Object>) value).entrySet());
        }
        return Collections.emptyList();
    }


    private Object evaluate(JinjaExpressionNode expr) {
        if (expr == null) {
            return null;
        }
        if (expr instanceof JinjaStringNode) {
            return ((JinjaStringNode) expr).getValue();
        }
        if (expr instanceof JinjaNumberIntegerNode) {
            return ((JinjaNumberIntegerNode) expr).getValue();
        }
        if (expr instanceof JinjaNumberDoubleNode) {
            return ((JinjaNumberDoubleNode) expr).getValue();
        }
        if (expr instanceof JinjaBooleanNode) {
            return ((JinjaBooleanNode) expr).getValue();
        }
        if (expr instanceof JinjaNoneNode) {
            return null;
        }
        if (expr instanceof VariableExprNode) {
            return lookup(((VariableExprNode) expr).getName());
        }
        if (expr instanceof ParenExprNode) {
            return evaluate(((ParenExprNode) expr).getExpression());
        }
        if (expr instanceof DotAccessExprNode) {
            DotAccessExprNode dot = (DotAccessExprNode) expr;
            Object obj = evaluate(dot.getObject());
            return access(obj, dot.getProperty());
        }
        if (expr instanceof IndexAccessExprNode) {
            IndexAccessExprNode idx = (IndexAccessExprNode) expr;
            Object obj = evaluate(idx.getObject());
            Object index = evaluate(idx.getIndex());
            return accessIndex(obj, index);
        }
        if (expr instanceof JinjaListNode) {
            List<Object> list = new ArrayList<>();
            for (JinjaExpressionNode e : ((JinjaListNode) expr).getElements()) {
                list.add(evaluate(e));
            }
            return list;
        }
        if (expr instanceof JinjaDictNode) {
            Map<String, Object> map = new LinkedHashMap<>();
            for (JinjaDictEntryNode entry : ((JinjaDictNode) expr).getElements()) {
                Object key = evaluate(entry.getKey());
                map.put(String.valueOf(key), evaluate(entry.getValue()));
            }
            return map;
        }
        if (expr instanceof JinjaComparisonNode) {
            return evalComparison((JinjaComparisonNode) expr);
        }
        if (expr instanceof JinjaLogicalOpNode) {
            return evalLogical((JinjaLogicalOpNode) expr);
        }
        if (expr instanceof JinjaUnaryOpNode) {
            return evalUnary((JinjaUnaryOpNode) expr);
        }
        if (expr instanceof JinjaBinaryOpNode) {
            return evalBinary((JinjaBinaryOpNode) expr);
        }
        if (expr instanceof TernaryExprNode) {
            TernaryExprNode ternary = (TernaryExprNode) expr;
            return truthy(evaluate(ternary.getCondition()))
                    ? evaluate(ternary.getTrueValue())
                    : evaluate(ternary.getFalseValue());
        }
        if (expr instanceof TestExprNode) {
            return evalTest((TestExprNode) expr);
        }
        if (expr instanceof FunctionCallExprNode) {
            return evalFunctionCall((FunctionCallExprNode) expr);
        }
        return expr.toValueString();
    }

    private Object lookup(String name) {
        if (name == null) {
            return null;
        }
        for (Map<String, Object> scope : scopes) {
            if (scope.containsKey(name)) {
                return scope.get(name);
            }
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    private Object access(Object obj, String property) {
        if (obj == null || property == null) {
            return null;
        }
        if (obj instanceof Map) {
            return ((Map<String, Object>) obj).get(property);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry<Object, Object> entry = (Map.Entry<Object, Object>) obj;
            if ("key".equals(property)) return entry.getKey();
            if ("value".equals(property)) return entry.getValue();
        }
        if (obj instanceof List && "length".equals(property)) {
            return ((List<?>) obj).size();
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    private Object accessIndex(Object obj, Object index) {
        if (obj instanceof List) {
            List<Object> list = (List<Object>) obj;
            int i = toInt(index);
            return (i >= 0 && i < list.size()) ? list.get(i) : null;
        }
        if (obj instanceof Map) {
            return ((Map<String, Object>) obj).get(String.valueOf(index));
        }
        return null;
    }


    private Object evalComparison(JinjaComparisonNode node) {
        Object left = evaluate(node.getLeft());
        Object right = evaluate(node.getRight());
        switch (node.getOperator()) {
            case EQ:
                return valuesEqual(left, right);
            case NEQ:
                return !valuesEqual(left, right);
            case LT:
                return compareNumbers(left, right) < 0;
            case GT:
                return compareNumbers(left, right) > 0;
            case LTE:
                return compareNumbers(left, right) <= 0;
            case GTE:
                return compareNumbers(left, right) >= 0;
            case IN:
                return contains(right, left);
            case NOT_IN:
                return !contains(right, left);
            default:
                return false;
        }
    }

    private Object evalLogical(JinjaLogicalOpNode node) {
        boolean leftTruthy = truthy(evaluate(node.getLeft()));
        if (node.getOperator() == JinjaLogicalOpNode.Operator.AND) {
            return leftTruthy && truthy(evaluate(node.getRight()));
        }
        return leftTruthy || truthy(evaluate(node.getRight()));
    }

    private Object evalUnary(JinjaUnaryOpNode node) {
        Object operand = evaluate(node.getOperand());
        switch (node.getOperator()) {
            case NOT:
                return !truthy(operand);
            case NEGATE:
                return -toDouble(operand);
            case POSITIVE:
                return toDouble(operand);
            default:
                return operand;
        }
    }

    private Object evalBinary(JinjaBinaryOpNode node) {
        Object left = evaluate(node.getLeft());
        Object right = evaluate(node.getRight());
        if (node.getOperator() == JinjaBinaryOpNode.Operator.CONCAT
                || (node.getOperator() == JinjaBinaryOpNode.Operator.ADD
                    && (left instanceof String || right instanceof String))) {
            return stringify(left) + stringify(right);
        }
        double l = toDouble(left);
        double r = toDouble(right);
        double result;
        switch (node.getOperator()) {
            case ADD: result = l + r; break;
            case SUB: result = l - r; break;
            case MUL: result = l * r; break;
            case DIV: result = l / r; break;
            case MOD: result = l % r; break;
            case POW: result = Math.pow(l, r); break;
            case FLOORDIV: result = Math.floor(l / r); break;
            default: result = 0;
        }
        return isWhole(result) ? (Object) (int) result : (Object) result;
    }

    private Object evalTest(TestExprNode node) {
        Object value = evaluate(node.getExpression());
        boolean result;
        String testName = node.getTestName() == null ? "" : node.getTestName().toLowerCase(Locale.ROOT);
        switch (testName) {
            case "defined":
                result = value != null;
                break;
            case "undefined":
                result = value == null;
                break;
            case "none":
                result = value == null;
                break;
            case "iterable":
                result = value instanceof List || value instanceof Map;
                break;
            default:
                result = value != null;
        }
        return node.isNegated() != result;
    }

    private Object evalFunctionCall(FunctionCallExprNode call) {
        String name = call.getCallable() != null ? call.getCallable().getFullPath() : "";
        List<Object> args = new ArrayList<>();
        for (ArgumentNode arg : call.getArguments()) {
            args.add(evaluate(arg.getValue()));
        }
        if ("len".equals(name) && !args.isEmpty()) {
            Object a = args.get(0);
            if (a instanceof List) return ((List<?>) a).size();
            if (a instanceof Map) return ((Map<?, ?>) a).size();
            if (a instanceof String) return ((String) a).length();
        }
        return call.toValueString();
    }


    private Object applyFilter(FilterNode filter, Object value) {
        String name = filter.getName() == null ? "" : filter.getName().toLowerCase(Locale.ROOT);
        switch (name) {
            case "upper":
                return stringify(value).toUpperCase(Locale.ROOT);
            case "lower":
                return stringify(value).toLowerCase(Locale.ROOT);
            case "title":
            case "capitalize": {
                String s = stringify(value);
                return s.isEmpty() ? s : Character.toUpperCase(s.charAt(0)) + s.substring(1);
            }
            case "trim":
                return stringify(value).trim();
            case "length":
            case "count":
                if (value instanceof List) return ((List<?>) value).size();
                if (value instanceof Map) return ((Map<?, ?>) value).size();
                return stringify(value).length();
            case "default":
                if (value != null) return value;
                if (filter.hasArgs()) return evaluate(filter.getArgs().get(0));
                return "";
            default:
                return value;
        }
    }


    private boolean truthy(Object value) {
        if (value == null) return false;
        if (value instanceof Boolean) return (Boolean) value;
        if (value instanceof String) return !((String) value).isEmpty();
        if (value instanceof Number) return ((Number) value).doubleValue() != 0;
        if (value instanceof List) return !((List<?>) value).isEmpty();
        if (value instanceof Map) return !((Map<?, ?>) value).isEmpty();
        return true;
    }

    private boolean valuesEqual(Object left, Object right) {
        if (left == null || right == null) {
            return left == right;
        }
        if (left instanceof Number && right instanceof Number) {
            return ((Number) left).doubleValue() == ((Number) right).doubleValue();
        }
        return left.equals(right);
    }

    private int compareNumbers(Object left, Object right) {
        if (left instanceof String && right instanceof String) {
            return ((String) left).compareTo((String) right);
        }
        return Double.compare(toDouble(left), toDouble(right));
    }

    @SuppressWarnings("unchecked")
    private boolean contains(Object container, Object item) {
        if (container instanceof List) {
            return ((List<Object>) container).stream().anyMatch(v -> valuesEqual(v, item));
        }
        if (container instanceof Map) {
            return ((Map<String, Object>) container).containsKey(String.valueOf(item));
        }
        if (container instanceof String) {
            return ((String) container).contains(stringify(item));
        }
        return false;
    }

    private double toDouble(Object value) {
        if (value instanceof Number) return ((Number) value).doubleValue();
        if (value instanceof String) {
            try {
                return Double.parseDouble((String) value);
            } catch (NumberFormatException ignored) {
                return 0;
            }
        }
        return 0;
    }

    private int toInt(Object value) {
        return (int) toDouble(value);
    }

    private boolean isWhole(double value) {
        return value == Math.floor(value) && !Double.isInfinite(value);
    }

    private String stringify(Object value) {
        if (value == null) return "";
        if (value instanceof Boolean) {
            return ((Boolean) value) ? "True" : "False";
        }
        return String.valueOf(value);
    }
}
