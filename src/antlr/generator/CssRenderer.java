package antlr.generator;

import antlr.ast.css.CSSDeclarationNode;
import antlr.ast.css.CSSRuleNode;
import antlr.ast.css.CSSStylesheetNode;
import antlr.ast.css.selectors.CSSSelectorNode;
import antlr.ast.css.values.CSSValueNode;

import java.util.List;
import java.util.stream.Collectors;

public final class CssRenderer {

    private CssRenderer() {
    }

    private static boolean isCommaSeparated(String property) {
        return "font-family".equalsIgnoreCase(property);
    }

    public static String render(CSSStylesheetNode stylesheet) {
        if (stylesheet == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (CSSRuleNode rule : stylesheet.getRules()) {
            sb.append(renderRule(rule));
        }
        return sb.toString();
    }

    private static String renderRule(CSSRuleNode rule) {
        StringBuilder sb = new StringBuilder();

        String selectors = rule.getSelectors().stream()
                .map(CSSSelectorNode::getSelectorText)
                .collect(Collectors.joining(", "));
        sb.append(selectors).append(" {\n");

        for (CSSDeclarationNode decl : rule.getDeclarations()) {
            sb.append("    ")
              .append(decl.getProperty())
              .append(": ")
              .append(renderValues(decl.getProperty(), decl.getValues()))
              .append(";\n");
        }

        sb.append("}\n");
        return sb.toString();
    }

    private static String renderValues(String property, List<CSSValueNode> values) {
        if (values == null || values.isEmpty()) {
            return "";
        }

        if ("box-shadow".equalsIgnoreCase(property) && values.size() % 4 == 0 && values.size() > 4) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < values.size(); i += 4) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(values.get(i).getValueText()).append(' ')
                  .append(values.get(i + 1).getValueText()).append(' ')
                  .append(values.get(i + 2).getValueText()).append(' ')
                  .append(values.get(i + 3).getValueText());
            }
            return sb.toString();
        }

        String separator = isCommaSeparated(property) ? ", " : " ";
        return values.stream()
                .map(CSSValueNode::getValueText)
                .collect(Collectors.joining(separator));
    }
}
