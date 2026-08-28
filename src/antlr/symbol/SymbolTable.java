package antlr.symbol;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * جدول الرموز (Symbol Table) يدعم النطاقات المتداخلة (Nested Scopes)
 *
 * المتطلبات المحققة: - بنية مناسبة لتخزين الرموز - توابع مساعدة للتحكم
 * بالعمليات على الجدول - دعم النطاقات المتداخلة
 */
public class SymbolTable {

    // ==================== ANSI Colors (Custom Palette) ====================
    public static final String RESET = "\u001B[0m";
    public static final String BOLD = "\u001B[1m";

    // Custom palette: 222831, 393E46, 00ADB5, EEEEEE
    public static final String DARK = "\u001B[38;2;8;217;214m";       // 08D9D6 - Bright cyan
    public static final String GRAY = "\u001B[38;2;255;46;99m";      // FF2E63 - Pink/red accent
    public static final String TEAL = "\u001B[38;2;0;173;181m";      // 00ADB5 - Primary accent
    public static final String LIGHT = "\u001B[38;2;238;238;238m";   // EEEEEE - Main text

    // اسم النطاق الحالي
    private final String scopeName;

    // مستوى التداخل
    private final int scopeLevel;

    // النطاق الأب (null للنطاق العام)
    private final SymbolTable parent;

    // الرموز في هذا النطاق
    private final Map<String, Symbol> symbols;

    // النطاقات الفرعية
    private final List<SymbolTable> children;

    /**
     * إنشاء جدول رموز جديد (النطاق العام)
     */
    public SymbolTable() {
        this("global", 0, null);
    }

    /**
     * إنشاء جدول رموز مع نطاق أب
     */
    public SymbolTable(String scopeName, int scopeLevel, SymbolTable parent) {
        this.scopeName = scopeName;
        this.scopeLevel = scopeLevel;
        this.parent = parent;
        this.symbols = new LinkedHashMap<>();  // للحفاظ على الترتيب
        this.children = new ArrayList<>();
    }

    // ==================== عمليات إدارة الرموز ====================
    /**
     * تعريف رمز جديد في النطاق الحالي
     *
     * @return true إذا تم التعريف بنجاح، false إذا كان موجوداً
     */
    public boolean define(Symbol symbol) {
        if (symbols.containsKey(symbol.getName())) {
            return false;  // الرمز موجود مسبقاً
        }
        symbols.put(symbol.getName(), symbol);
        return true;
    }

    /**
     * تعريف رمز جديد (طريقة مختصرة)
     */
    public boolean define(String name, Symbol.SymbolType type, int line, int col) {
        return define(new Symbol(name, type, line, col));
    }

    /**
     * البحث عن رمز في النطاق الحالي فقط
     */
    public Symbol lookupLocal(String name) {
        return symbols.get(name);
    }

    /**
     * البحث عن رمز في النطاق الحالي والنطاقات الأعلى
     */
    public Symbol resolve(String name) {
        Symbol symbol = symbols.get(name);
        if (symbol != null) {
            return symbol;
        }
        // البحث في النطاق الأب
        if (parent != null) {
            return parent.resolve(name);
        }
        return null;
    }

    /**
     * التحقق من وجود رمز في النطاق الحالي
     */
    public boolean isDefinedLocally(String name) {
        return symbols.containsKey(name);
    }

    /**
     * التحقق من وجود رمز في أي نطاق
     */
    public boolean isDefined(String name) {
        return resolve(name) != null;
    }

    /**
     * تحديث قيمة رمز
     */
    public boolean update(String name, Object value) {
        Symbol symbol = resolve(name);
        if (symbol != null) {
            symbol.setValue(value);
            return true;
        }
        return false;
    }

    /**
     * حذف رمز من النطاق الحالي
     */
    public boolean remove(String name) {
        return symbols.remove(name) != null;
    }

    // ==================== إدارة النطاقات ====================
    /**
     * الدخول إلى نطاق جديد
     */
    public SymbolTable enterScope(String name) {
        SymbolTable child = new SymbolTable(name, scopeLevel + 1, this);
        children.add(child);
        return child;
    }

    /**
     * الخروج من النطاق الحالي
     */
    public SymbolTable exitScope() {
        return parent;
    }

    /**
     * الحصول على النطاق الأب
     */
    public SymbolTable getParent() {
        return parent;
    }

    /**
     * الحصول على النطاق العام (الجذر)
     */
    public SymbolTable getGlobalScope() {
        SymbolTable current = this;
        while (current.parent != null) {
            current = current.parent;
        }
        return current;
    }

    // ==================== Getters ====================
    public String getScopeName() {
        return scopeName;
    }

    public int getScopeLevel() {
        return scopeLevel;
    }

    public Collection<Symbol> getSymbols() {
        return Collections.unmodifiableCollection(symbols.values());
    }

    public List<SymbolTable> getChildren() {
        return Collections.unmodifiableList(children);
    }

    public int getSymbolCount() {
        return symbols.size();
    }

    // ==================== طباعة الجدول ====================
    /**
     * طباعة جدول الرموز
     */
    public void print() {
        System.out.println(this.toString());
    }

    /**
     * طباعة جدول الرموز مع جميع النطاقات الفرعية
     */
    public void printAll() {
        print();
        for (SymbolTable child : children) {
            child.printAll();
        }
    }

    // @Override
    // public String toString() {
    //     StringBuilder sb = new StringBuilder();
    //     String indent = "  ".repeat(scopeLevel);
    //     // عنوان الجدول
    //     sb.append("\n").append(indent);
    //     sb.append("╔══════════════════════════════════════════════════════════════╗\n");
    //     sb.append(indent);
    //     sb.append(String.format("║  Symbol Table: %-45s ║\n", scopeName + " (Level " + scopeLevel + ")"));
    //     sb.append(indent);
    //     sb.append("╠══════════════════════════════════════════════════════════════╣\n");
    //     if (symbols.isEmpty()) {
    //         sb.append(indent);
    //         sb.append("║  (empty)                                                     ║\n");
    //     } else {
    //         // عناوين الأعمدة
    //         sb.append(indent);
    //         sb.append(String.format("║  %-12s %-15s %-8s %-8s %-10s ║\n",
    //             "Name", "Type", "Line", "Col", "Value"));
    //         sb.append(indent);
    //         sb.append("║──────────────────────────────────────────────────────────────║\n");
    //         // الرموز
    //         for (Symbol symbol : symbols.values()) {
    //             sb.append(indent);
    //             String valueStr = symbol.getValue() != null ?
    //                 symbol.getValue().toString() : "-";
    //             if (valueStr.length() > 10) {
    //                 valueStr = valueStr.substring(0, 7) + "...";
    //             }
    //             sb.append(String.format("║  %-12s %-15s %-8d %-8d %-10s ║\n",
    //                 truncate(symbol.getName(), 12),
    //                 symbol.getType(),
    //                 symbol.getLineNumber(),
    //                 symbol.getColumnNumber(),
    //                 valueStr));
    //         }
    //     }
    //     sb.append(indent);
    //     sb.append("╚══════════════════════════════════════════════════════════════╝\n");
    //     return sb.toString();
    // }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String indent = "  ".repeat(scopeLevel);

        // Calculate max widths for each column
        int nameWidth = "Name".length();
        int typeWidth = "Type".length();
        int lineWidth = "Line".length();
        int colWidth = "Col".length();
        int valueWidth = "Value".length();

        for (Symbol symbol : symbols.values()) {
            nameWidth = Math.max(nameWidth, symbol.getName().length());
            typeWidth = Math.max(typeWidth, symbol.getType().toString().length());
            lineWidth = Math.max(lineWidth, String.valueOf(symbol.getLineNumber()).length());
            colWidth = Math.max(colWidth, String.valueOf(symbol.getColumnNumber()).length());
            String val = symbol.getValue() != null ? symbol.getValue().toString() : "-";
            valueWidth = Math.max(valueWidth, val.length());
        }

        // Add padding
        nameWidth += 2;
        typeWidth += 2;
        lineWidth += 2;
        colWidth += 2;
        valueWidth += 2;

        // Calculate total width (columns + separators + borders)
        int totalWidth = nameWidth + typeWidth + lineWidth + colWidth + valueWidth + 7; // 7 = "║  " + " ║"

        // Build dynamic box
        String topBottom = "═".repeat(totalWidth - 2);
        String middle = "─".repeat(totalWidth - 2);

        // Header
        sb.append("\n").append(indent);
        sb.append(TEAL).append("╔").append(topBottom).append("╗").append(RESET).append("\n");
        sb.append(indent);
        String title = String.format("Symbol Table: %s (Level %d)", scopeName, scopeLevel);
        sb.append(TEAL).append("║  ").append(BOLD).append(LIGHT).append(String.format("%-" + (totalWidth - 5) + "s", title)).append(RESET).append(TEAL).append(" ║").append(RESET).append("\n");
        sb.append(indent);
        sb.append(TEAL).append("╠").append(topBottom).append("╣").append(RESET).append("\n");

        if (symbols.isEmpty()) {
            sb.append(indent);
            sb.append(TEAL).append("║  ").append(RESET).append(String.format("%-" + (totalWidth - 5) + "s", "(empty)")).append(TEAL).append(" ║").append(RESET).append("\n");
        } else {
            // Column headers
            sb.append(indent);
            sb.append(TEAL).append("║  ").append(RESET);
            sb.append(BOLD).append(LIGHT);
            sb.append(String.format("%-" + nameWidth + "s%-" + typeWidth + "s%-" + lineWidth + "s%-" + colWidth + "s%-" + valueWidth + "s",
                    "Name", "Type", "Line", "Col", "Value"));
            sb.append(RESET).append(TEAL).append(" ║").append(RESET).append("\n");
            sb.append(indent);
            sb.append(TEAL).append("║").append(middle).append("║").append(RESET).append("\n");

            // Data rows
            for (Symbol symbol : symbols.values()) {
                sb.append(indent);
                String valueStr = symbol.getValue() != null ? symbol.getValue().toString() : "-";
                sb.append(TEAL).append("║  ").append(RESET);
                sb.append(TEAL).append(String.format("%-" + nameWidth + "s", symbol.getName())).append(RESET);
                sb.append(LIGHT).append(String.format("%-" + typeWidth + "s", symbol.getType())).append(RESET);
                sb.append(GRAY).append(String.format("%-" + lineWidth + "d", symbol.getLineNumber())).append(RESET);
                sb.append(GRAY).append(String.format("%-" + colWidth + "d", symbol.getColumnNumber())).append(RESET);
                sb.append(TEAL).append(String.format("%-" + valueWidth + "s", valueStr)).append(RESET);
                sb.append(TEAL).append(" ║").append(RESET).append("\n");
            }
        }

        sb.append(indent);
        sb.append(TEAL).append("╚").append(topBottom).append("╝").append(RESET).append("\n");

        return sb.toString();
    }

    private String truncate(String str, int maxLen) {
        if (str.length() <= maxLen) {
            return str;
        }
        return str.substring(0, maxLen - 3) + "...";
    }

    // ==================== إحصائيات ====================
    /**
     * الحصول على جميع الرموز من جميع النطاقات
     */
    public List<Symbol> getAllSymbols() {
        List<Symbol> all = new ArrayList<>(symbols.values());
        for (SymbolTable child : children) {
            all.addAll(child.getAllSymbols());
        }
        return all;
    }

    /**
     * الحصول على عدد الرموز الكلي
     */
    public int getTotalSymbolCount() {
        int count = symbols.size();
        for (SymbolTable child : children) {
            count += child.getTotalSymbolCount();
        }
        return count;
    }
}
