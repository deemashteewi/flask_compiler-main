# ANTLR Multi-Language Compiler

A comprehensive compiler/parser project built with **ANTLR 4.13.2** that implements lexers, parsers, and AST builders for Python-like languages and Jinja2 templates. This project demonstrates compiler construction concepts including lexical analysis, syntax analysis, AST generation, visitor patterns, and semantic analysis with symbol tables.

## Features

### Python-like Language Support
- **Statements**: assignments, print, if/elif/else, for, while, break, continue, return
- **Definitions**: functions with decorators, classes with inheritance
- **Expressions**: full operator precedence (arithmetic, comparison, logical)
- **Data Structures**: lists, dictionaries, list comprehensions
- **Parameters**: regular, `*args`, `**kwargs`, keyword-only, positional-only
- **Indentation-aware**: automatic INDENT/DEDENT token generation

### Jinja2 Template Support
- **Template Inheritance**: `{% extends %}`, `{% block %}`
- **Control Flow**: `{% for %}`, `{% if %}`, `{% elif %}`, `{% else %}`
- **Macros**: `{% macro %}` with parameters and defaults
- **Variables**: `{% set %}`, `{% with %}`
- **Imports**: `{% import %}`, `{% from ... import %}`
- **Filters**: `{{ value | filter(args) }}`
- **Tests**: `{% if var is defined %}`, `{% if var is none %}`
- **Whitespace Control**: `{%-` and `-%}` trim operators
- **Mixed Content**: HTML with embedded template syntax

## Project Structure

```
antlr_course/
├── grammars/                          # ANTLR grammar definitions
│   ├── pythonLexer.g4                 # Python lexer (tokens, indentation)
│   ├── pythonParser.g4                # Python parser (statements, expressions)
│   ├── jinja2Lexer.g4                 # Jinja2 lexer (3 modes: default, stmt, expr)
│   └── jinja2Parser.g4                # Jinja2 parser (templates, blocks)
│
├── src/
│   ├── Main.java                      # Entry point (compilation pipeline)
│   └── antlr/
│       ├── ast/                       # Abstract Syntax Tree nodes
│       │   ├── node/ASTNode.java      # Base class with visitor pattern
│       │   ├── python/                # Python AST nodes (~47 classes)
│       │   │   ├── expressions/       # Variables, literals, operations
│       │   │   ├── statements/        # Control flow, definitions
│       │   │   └── parameters/        # Function parameters
│       │   └── jinja2/                # Jinja2 AST nodes (~40 classes)
│       │       ├── blocks/            # for, if, macro, autoescape
│       │       ├── statements/        # import, set, include
│       │       ├── expressions/       # Variables, operations, literals
│       │       └── targets/           # Assignment targets
│       │
│       ├── visitor/                   # AST visitor implementations
│       │   ├── ASTBuilder.java        # Python parse tree → AST
│       │   ├── JinjaASTBuilder.java   # Jinja2 parse tree → AST
│       │   └── ASTPrinter.java        # Colored console AST output
│       │
│       ├── gen/                       # Generated lexer/parser classes
│       │   ├── python/                # pythonLexer, pythonParser
│       │   └── jinja2/                # jinja2Lexer, jinja2Parser
│       │
│       └── symbol/                    # Semantic analysis
│           ├── Symbol.java            # Variable/function symbols
│           └── SymbolTable.java       # Scope-aware symbol management
│
├── tests/                             # Test files and examples
│   ├── dictionary.py                  # Comprehensive Python test
│   ├── teg/                           # Additional test cases
│   └── flask/                         # Flask + Jinja2 example
│       ├── app.py                     # Flask application
│       └── templates/                 # Jinja2 templates
│
├── dependencies/
│   └── antlr-4.13.2-complete.jar      # ANTLR runtime library
│
└── antlr-denter-main/                 # DenterHelper for indentation
```

## Architecture

### Compilation Pipeline

The compiler processes source code through 5 distinct phases:

```
┌─────────────────────────────────────────────────────────────────────┐
│                        COMPILATION PIPELINE                          │
└─────────────────────────────────────────────────────────────────────┘

   Source Code
        │
        ▼
┌───────────────────┐
│ Phase 1: Lexical  │  CharStream → Lexer → TokenStream
│    Analysis       │  • Tokenizes source into lexemes
│                   │  • DenterHelper adds INDENT/DEDENT
└─────────┬─────────┘
          │
          ▼
┌───────────────────┐
│ Phase 2: Syntax   │  TokenStream → Parser → Parse Tree
│    Analysis       │  • Validates grammar rules
│                   │  • Builds concrete syntax tree
└─────────┬─────────┘
          │
          ▼
┌───────────────────┐
│ Phase 3: AST      │  Parse Tree → ASTBuilder → AST
│    Building       │  • Visitor traverses parse tree
│                   │  • Creates abstract syntax tree
└─────────┬─────────┘
          │
          ▼
┌───────────────────┐
│ Phase 4: Semantic │  AST → SymbolTable
│    Analysis       │  • Tracks variable definitions
│                   │  • Manages scope hierarchy
└─────────┬─────────┘
          │
          ▼
┌───────────────────┐
│ Phase 5: Output   │  AST → ASTPrinter → Console
│                   │  • Colored tree visualization
│                   │  • Symbol table display
└───────────────────┘
```

### AST Node Hierarchy

#### Python AST Nodes

```
ASTNode (abstract base)
├── ProgramNode
├── StatementNode
│   ├── AssignmentNode
│   ├── PrintNode
│   ├── ReturnNode
│   ├── IfStatementNode
│   ├── ForStatementNode
│   ├── WhileStatementNode
│   ├── BreakNode / ContinueNode
│   ├── FunctionDefinitionNode
│   ├── ClassDefinitionNode
│   └── ImportStatement
│
└── ExpressionNode
    ├── Literals: NumberIntegerNode, StringNode, BooleanNode, ListNode, DictNode
    ├── Access: VariableNode, DotAccessNode, IndexAccessNode, FunctionCallNode
    └── Operations: BinaryOpNode, UnaryOpNode, ComparisonNode, LogicalOpNode
```

#### Jinja2 AST Nodes

```
ASTNode (abstract base)
├── TemplateNode
├── HtmlTextNode
├── ExpressionBlockNode ({{ }})
├── ForBlockNode / IfBlockNode
├── MacroNode / CallBlockNode
├── BlockDefinitionNode
├── SetStatementNode / SetBlockNode
├── ImportNode / FromImportNode
├── IncludeNode / ExtendsNode
├── WithBlockNode / FilterBlockNode
├── AutoescapeBlockNode
│
└── JinjaExpressionNode
    ├── Literals: JinjaStringNode, JinjaNumberIntegerNode, JinjaListNode, JinjaDictNode
    ├── Access: VariableExprNode, DotAccessExprNode, FunctionCallExprNode
    └── Operations: JinjaBinaryOpNode, JinjaUnaryOpNode, TernaryExprNode, TestExprNode
```

### Visitor Pattern

The project implements the **Visitor Pattern** for AST traversal:

```java
// Visitor interface with 70+ visit methods
public interface ASTVisitor<T> {
    T visit(ProgramNode node);
    T visit(AssignmentNode node);
    T visit(IfStatementNode node);
    // ... more visit methods
}

// Example visitor implementation
public class ASTPrinter implements ASTVisitor<String> {
    @Override
    public String visit(ProgramNode node) {
        // Format and return colored tree output
    }
}
```

## Grammar Highlights

### Python Lexer Modes

```antlr
// Indentation handling with DenterHelper
@members {
    private DenterHelper denter = ...
}

// Token definitions
NUM: [0-9]+;
DOUBLE: [0-9]+ '.' [0-9]+;
STRING: '"' (~["\r\n])* '"' | '\'' (~['\r\n])* '\'';
```

### Jinja2 Multi-Mode Lexer

```antlr
// Three distinct lexer modes
mode DEFAULT_MODE;    // HTML content
OPEN_STMT: '{%' -> pushMode(JINJA_STMT);
OPEN_EXPR: '{{' -> pushMode(JINJA_EXPR);

mode JINJA_STMT;      // {% ... %}
CLOSE_STMT: '%}' -> popMode;

mode JINJA_EXPR;      // {{ ... }}
CLOSE_EXPR: '}}' -> popMode;
```

### Expression Precedence

```antlr
// Operator precedence (lowest to highest)
expr: ternary_expr;
ternary_expr: or_expr ('if' or_expr 'else' ternary_expr)?;
or_expr: and_expr ('or' and_expr)*;
and_expr: not_expr ('and' not_expr)*;
comparison: arithmetic (comp_op arithmetic)*;
arithmetic: term (('+' | '-') term)*;
term: factor (('*' | '/' | '%' | '//') factor)*;
factor: ('+' | '-') factor | power;
power: postfix ('**' factor)?;
postfix: primary (call | index | slice | dot)*;
```

## Getting Started

### Prerequisites

- **Java JDK 11+**
- **IntelliJ IDEA** (recommended) or any Java IDE
- **ANTLR 4.13.2** (included in `dependencies/`)

### Building

1. Clone the repository
2. Open in IntelliJ IDEA
3. Ensure `dependencies/antlr-4.13.2-complete.jar` is in classpath
4. Build the project

### Regenerating Parsers (if grammar changes)

```bash
# Python grammar
java -jar dependencies/antlr-4.13.2-complete.jar -visitor -listener \
    -o src/antlr/gen/python grammars/pythonLexer.g4 grammars/pythonParser.g4

# Jinja2 grammar
java -jar dependencies/antlr-4.13.2-complete.jar -visitor -listener \
    -o src/antlr/gen/jinja2 grammars/jinja2Lexer.g4 grammars/jinja2Parser.g4
```

### Running

```bash
# Run Main.java to compile test files
java -cp "out/production/antlr_course;dependencies/antlr-4.13.2-complete.jar" Main
```

## Example Output

### Input (Python-like)

```python
def factorial(n):
    if n <= 1:
        return 1
    return n * factorial(n - 1)

result = factorial(5)
print(result)
```

### Output (AST)

```
ProgramNode
├── FunctionDefinitionNode [line 1]
│   ├── name: factorial
│   ├── RegularParamNode: n
│   └── BlockNode
│       ├── IfStatementNode [line 2]
│       │   ├── condition: ComparisonNode (<=)
│       │   └── ReturnNode: NumberIntegerNode(1)
│       └── ReturnNode
│           └── BinaryOpNode (*)
│               ├── VariableNode: n
│               └── FunctionCallNode: factorial
├── AssignmentNode [line 6]
│   ├── target: result
│   └── FunctionCallNode: factorial
└── PrintNode [line 7]
    └── VariableNode: result
```

### Symbol Table

```
┌─────────────┬──────────────┬───────┬────────┬────────────┐
│ Name        │ Type         │ Line  │ Column │ Value      │
├─────────────┼──────────────┼───────┼────────┼────────────┤
│ factorial   │ FUNCTION     │ 1     │ 4      │ -          │
│ n           │ PARAMETER    │ 1     │ 14     │ -          │
│ result      │ VARIABLE     │ 6     │ 0      │ -          │
└─────────────┴──────────────┴───────┴────────┴────────────┘
```

## Test Files

| File | Description |
|------|-------------|
| `tests/dictionary.py` | Comprehensive Python test with all features |
| `tests/teg/test_comprehensive.py` | Complex nested expressions |
| `tests/flask/app.py` | Real Flask application example |
| `tests/flask/templates/*.html` | Jinja2 template examples |

## Key Components

### DenterHelper

Handles Python-style indentation by generating virtual `INDENT` and `DEDENT` tokens:

```java
DenterHelper denter = DenterHelper.builder()
    .nl(NL)
    .indent(pythonParser.INDENT)
    .dedent(pythonParser.DEDENT)
    .pullToken(super::nextToken);
```

### Symbol Table

Manages variable scopes and semantic information:

```java
SymbolTable symbolTable = new SymbolTable();
symbolTable.enterScope("function_name");
symbolTable.define(new Symbol("x", Symbol.Type.VARIABLE, line, col, value));
Symbol resolved = symbolTable.resolve("x");  // Searches up scope chain
symbolTable.exitScope();
```

## Dependencies

- **ANTLR 4.13.2** - Parser generator and runtime
- **antlr-denter** - Indentation-based block detection

## License

This project is intended for educational purposes demonstrating compiler construction with ANTLR.

## Acknowledgments

- [ANTLR 4](https://www.antlr.org/) - Parser generator
- [antlr-denter](https://github.com/yshavit/antlr-denter) - Python-style indentation handling
- [Jinja2](https://jinja.palletsprojects.com/) - Template engine specification reference
