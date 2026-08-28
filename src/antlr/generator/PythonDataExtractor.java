package antlr.generator;

import antlr.ast.python.ProgramNode;
import antlr.ast.python.StatementNode;
import antlr.ast.python.expressions.ExpressionNode;
import antlr.ast.python.expressions.access.VariableNode;
import antlr.ast.python.expressions.literals.BooleanNode;
import antlr.ast.python.expressions.literals.DictEntryNode;
import antlr.ast.python.expressions.literals.DictNode;
import antlr.ast.python.expressions.literals.ListNode;
import antlr.ast.python.expressions.literals.NoneNode;
import antlr.ast.python.expressions.literals.NumberDoubleNode;
import antlr.ast.python.expressions.literals.NumberIntegerNode;
import antlr.ast.python.expressions.literals.StringNode;
import antlr.ast.python.statements.AssignmentNode;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * ==================== المرحلة 5: توليد الكود (Code Generation) ====================
 *
 * PythonDataExtractor يمثّل الجزء الأول من التابع المولّد (Generator):
 * يمشي على شجرة AST الخاصة بكود Python (الشجرة الأولى) ويستخرج منها
 * مصفوفة/قاموس البيانات المعرّفة فيه (مثال: قائمة المنتجات "products")
 * ويحوّلها إلى كائنات Java عادية (List / Map / String / Number / Boolean)
 * يمكن تمريرها مباشرة إلى شجرة Jinja2 (الشجرة الثانية) عبر JinjaTemplateRenderer.
 *
 * هذا يحقق متطلب: "يجب أن يقوم التابع المولّد بتمرير البيانات من مصفوفة
 * البيانات في كود Python إلى الشجرة الثانية الخاصة بـ Jinja2".
 *
 * ملاحظة: المُقيّم (evaluator) هنا محدود عمداً على التعابير الحرفية
 * الثابتة (literals) الشائعة في تعريف بيانات مثل products = [...]:
 * أرقام، نصوص، Booleans، None، قوائم، وقواميس متداخلة، بالإضافة إلى
 * الإشارة لمتغيرات سبق تعريفها بنفس الملف.
 */
public class PythonDataExtractor {

    private final Map<String, Object> variables = new LinkedHashMap<>();

    /**
     * يمشي على جميع تعليمات البرنامج (ProgramNode) ويقوم بتقييم كل
     * إسناد (Assignment) على مستوى الجذر، ليبني بذلك بيئة قيم بسيطة
     * (اسم المتغير -> قيمته الحقيقية).
     */
    public Map<String, Object> extract(ProgramNode program) {
        if (program == null) {
            return variables;
        }
        for (StatementNode stmt : program.getStatements()) {
            if (stmt instanceof AssignmentNode) {
                AssignmentNode assignment = (AssignmentNode) stmt;
                String name = assignment.getVariableName();
                if (name != null) {
                    variables.put(name, evaluate(assignment.getValue()));
                }
            }
        }
        return variables;
    }

    /** إرجاع قيمة متغير معين تم استخراجه سابقاً (مثال: "products"). */
    public Object getVariable(String name) {
        return variables.get(name);
    }

    // ==================== التقييم (Evaluation) - Polymorphism عبر instanceof ====================

    private Object evaluate(ExpressionNode expr) {
        if (expr == null) {
            return null;
        }
        if (expr instanceof StringNode) {
            return ((StringNode) expr).getValue();
        }
        if (expr instanceof NumberIntegerNode) {
            return ((NumberIntegerNode) expr).getValue();
        }
        if (expr instanceof NumberDoubleNode) {
            return ((NumberDoubleNode) expr).getValue();
        }
        if (expr instanceof BooleanNode) {
            return ((BooleanNode) expr).getValue();
        }
        if (expr instanceof NoneNode) {
            return null;
        }
        if (expr instanceof VariableNode) {
            // إشارة لمتغير معرف سابقاً في نفس الملف
            return variables.get(((VariableNode) expr).getName());
        }
        if (expr instanceof ListNode) {
            List<Object> list = new ArrayList<>();
            for (ExpressionNode element : ((ListNode) expr).getElements()) {
                list.add(evaluate(element));
            }
            return list;
        }
        if (expr instanceof DictNode) {
            Map<String, Object> map = new LinkedHashMap<>();
            for (DictEntryNode entry : ((DictNode) expr).getElements()) {
                Object key = evaluate(entry.getKey());
                Object value = evaluate(entry.getValue());
                map.put(String.valueOf(key), value);
            }
            return map;
        }
        // أي تعبير آخر غير مدعوم بالتقييم الحرفي (استدعاء تابع، عملية حسابية...)
        // نستخدم تمثيله النصي المتاح أصلاً في كل ExpressionNode (toValueString)
        // كحل بديل بدل تجاهله بالكامل.
        return expr.toValueString();
    }
}
