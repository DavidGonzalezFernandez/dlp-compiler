grammar Xana;

@header {
    package es.uniovi.dlp.parser;
    import es.uniovi.dlp.ast.*;
    import es.uniovi.dlp.ast.expressions.*;
    import es.uniovi.dlp.ast.definition.*;
    import es.uniovi.dlp.ast.statement.*;
    import es.uniovi.dlp.ast.types.*;
}

program returns [Program ast]
    locals [List<Definition> definitions = new ArrayList<>()]
    : (var_def {$definitions.addAll($var_def.ast);} | func_def {$definitions.add($func_def.ast);})*
        main_def {$definitions.add($main_def.ast);}
        {$ast = new Program(1, 1, $definitions);}
    ;

main_def returns [FunctionDefinition ast]
    : DEF MAIN ABRE_PARENTESIS CIERRA_PARENTESIS func_body
    {$ast = new FunctionDefinition(
        $DEF.getLine(),
        $DEF.getCharPositionInLine()+1,
        $MAIN.text,
        new FunctionType(
            $DEF.getLine(),
            $DEF.getCharPositionInLine()+1,
            new VoidType($DEF.getLine(), $DEF.getCharPositionInLine()+1)
        ),
        $func_body.definitions,
        $func_body.statements
    );}
    ;

func_def returns [FunctionDefinition ast]
    : DEF ID ABRE_PARENTESIS param_list CIERRA_PARENTESIS DOS_PUNTOS return_type func_body
    {$ast = new FunctionDefinition(
        $DEF.getLine(),
        $DEF.getCharPositionInLine()+1,
        $ID.text,
        new FunctionType($DEF.getLine(), $DEF.getCharPositionInLine()+1, $param_list.ast, $return_type.ast),
        $func_body.definitions,
        $func_body.statements
    );}
    ;

// TODO: comprobar si está bien hacer una única lista de Object
func_body returns [List<VarDefinition> definitions = new ArrayList<>(),
    List<Statement> statements = new ArrayList<>()
]
    : DO (var_def {$definitions.addAll($var_def.ast);} | statement {$statements.addAll($statement.ast);})* END
    ;

return_type returns [CompilerType ast]
    : simple_type {$ast = $simple_type.ast;}
    | VOID {$ast = new VoidType($VOID.getLine(), $VOID.getCharPositionInLine()+1);}
    ;

param_list returns [List<VarDefinition> ast = new ArrayList<>();]
    : (v1=var_def {$ast.addAll($v1.ast);}
        (',' v2=var_def {$ast.addAll($v2.ast);})*
      )?
    ;

// Variable definitions
var_def returns [List<VarDefinition> ast = new ArrayList<VarDefinition>();]
    : v1=ID {$ast.add(new VarDefinition($v1.getLine(), $v1.getCharPositionInLine()+1, $v1.text));}
      (COMMA v2=ID {$ast.add(new VarDefinition($v2.getLine(), $v2.getCharPositionInLine()+1, $v2.text));})*
      DOS_PUNTOS var_type_def { for (VarDefinition v : $ast) v.setType($var_type_def.ast); }
    ;

var_type_def returns [CompilerType ast]
    : simple_type { $ast = $simple_type.ast; }
    | array_def_type { $ast = $array_def_type.ast; }
    | struct_def_type { $ast = $struct_def_type.ast; }
    ;

simple_type returns [CompilerType ast]
    : t='int'    { $ast = IntType.getInstance(); }
    | t='double' { $ast = DoubleType.getInstance(); }
    | t='char'   { $ast = CharType.getInstance(); }
    ;

array_def_type returns [ArrayType ast]
    : ABRE_CORCHETE INT_CONSTANT DOS_PUNTOS var_type_def CIERRA_CORCHETE
    {$ast = new ArrayType(
        $ABRE_CORCHETE.getLine(),
        $ABRE_CORCHETE.getCharPositionInLine()+1,
        Integer.parseInt($INT_CONSTANT.text),
        $var_type_def.ast);
    }
    ;

struct_def_type returns [StructType ast]
    locals [List<StructField> definitions = new ArrayList<>();]
    : DEFSTRUCT DO (var_def
        { for (VarDefinition v : $var_def.ast)
            $definitions.add(new StructField(v.getLine(), v.getColumn(), v.getName(), v.getType()));
        }
    )* END
    {$ast = new StructType($DEFSTRUCT.getLine(), $DEFSTRUCT.getCharPositionInLine()+1, $definitions);}
    ;


// Statements
statement returns [List<Statement> ast = new ArrayList<>();]
    : func_invocation   {$ast.add($func_invocation.ast);}
    | if_else           {$ast.add($if_else.ast);}
    | while_statement   {$ast.add($while_statement.ast);}
    | assignment        {$ast.add($assignment.ast);}
    | puts              {$ast.addAll($puts.ast);}
    | in                {$ast.addAll($in.ast);}
    | return_statement  {$ast.add($return_statement.ast);}
    ;

func_invocation returns [FunctionInvocation ast]
    : ID ABRE_PARENTESIS argument_list CIERRA_PARENTESIS
    {$ast = new FunctionInvocation(
        $ID.getLine(),
        $ID.getCharPositionInLine()+1,
        new Variable($ID.getLine(), $ID.getCharPositionInLine()+1, $ID.text),
        $argument_list.ast
    );}
    ;

argument_list returns [List<Expression> ast = new ArrayList<Expression>();]
    : (expr1=expression {$ast.add($expr1.ast);} (COMMA expr2=expression {$ast.add($expr2.ast);})*)?
    ;

if_else returns [IfElse ast]
    locals [List<Statement> ifBody = new ArrayList<Statement>(),
        List<Statement> elseBody = new ArrayList<Statement>()]
    : IF expression DO
    (st1=statement {$ifBody.addAll($st1.ast);})*
    (ELSE (st2=statement {$elseBody.addAll($st2.ast);})*)?
    END
    {$ast = new IfElse($IF.getLine(), $IF.getCharPositionInLine()+1, $expression.ast, $ifBody, $elseBody);}
    ;

while_statement returns [While ast]
    locals [List<Statement> whileBody = new ArrayList<Statement>();]
    : WHILE expression DO (statement {$whileBody.addAll($statement.ast);})* END
    {$ast = new While($WHILE.getLine(), $WHILE.getCharPositionInLine()+1, $expression.ast, $whileBody);}
    ;

assignment returns [Assignment ast]
    : leftExp=expression IGUAL rightExp=expression
    { $ast = new Assignment($start.getLine(), $start.getCharPositionInLine()+1, $leftExp.ast, $rightExp.ast); }
    ;

puts returns [List<Statement> ast = new ArrayList<Statement>();]
    : PUTS expr1=expression
        {$ast.add(new WriteStatement($start.getLine(), $start.getCharPositionInLine()+1, $expr1.ast));}
    (COMMA expr2=expression
        {$ast.add(new WriteStatement($start.getLine(), $start.getCharPositionInLine()+1, $expr2.ast));}
    )*
    ;

in returns [List<Statement> ast = new ArrayList<Statement>();]
    : IN expr1=expression
        {$ast.add(new ReadStatement($start.getLine(), $start.getCharPositionInLine()+1, $expr1.ast));}
    (COMMA expr2=expression
        {$ast.add(new ReadStatement($start.getLine(), $start.getCharPositionInLine()+1, $expr2.ast));}
    )*
    ;

return_statement returns [ReturnStatement ast]
    : RETURN expression
    {$ast = new ReturnStatement($RETURN.getLine(), $RETURN.getCharPositionInLine()+1+($RETURN.text.length()+1), $expression.ast);}
    ;


// Expressions
expression returns [Expression ast]
    : '(' expression ')'
        {$ast = $expression.ast;}
    | array=expression '[' index=expression ']'
        {$ast = new ArrayIndexing($start.getLine(), $start.getCharPositionInLine()+1, $array.ast, $index.ast);}
    | struct=expression DOT field=ID
        {$ast = new FieldAccess($start.getLine(), $start.getCharPositionInLine()+1, $struct.ast, $field.text);}
    | expr=expression AS new_type=simple_type
        {$ast = new Cast($start.getLine(), $start.getCharPositionInLine()+1, $expr.ast, $new_type.ast);}
    | MINUS expression
        {$ast = new MinusOperation($MINUS.getLine(), $MINUS.getCharPositionInLine()+1, $expression.ast);}
    | NOT expression
        {$ast = new NotOperation($NOT.getLine(), $NOT.getCharPositionInLine()+1, $expression.ast);}
    | left=expression op=('*' | '/' | '%') right=expression
        {$ast = new ArithmeticOperation($op.getLine(), $op.getCharPositionInLine()+1, $left.ast, $op.text, $right.ast);}
    | leftExpression=expression op=('+' | MINUS) rightExpression=expression
        {$ast = new ArithmeticOperation($op.getLine(), $op.getCharPositionInLine()+1, $leftExpression.ast, $op.text, $rightExpression.ast);}
    | leftExpression=expression op=('>' | '>=' | '<' | '<=' | '!=' | '==') rightExpression=expression
        {$ast = new ComparisonOperation($op.getLine(), $op.getCharPositionInLine()+1, $leftExpression.ast, $op.text, $rightExpression.ast);}
    | leftExpression=expression op=('&&' | '||') rightExpression=expression
        {$ast = new LogicOperation($op.getLine(), $op.getCharPositionInLine()+1, $leftExpression.ast, $op.text, $rightExpression.ast);}
    | func_invocation
        {$ast = $func_invocation.ast;}
    | ID
        {$ast = new Variable($ID.getLine(), $ID.getCharPositionInLine()+1, $ID.text);}
    | simple_constant
        {$ast = $simple_constant.ast;}
    ;

simple_constant returns [Expression ast]
    : i=INT_CONSTANT
        { $ast = new IntLiteral($i.getLine(), $i.getCharPositionInLine()+1, $i.text);}
    | c=CHAR_CONSTANT
        { $ast = new CharLiteral($c.getLine(), $c.getCharPositionInLine()+1, $c.text);}
    | r=REAL_CONSTANT
        { $ast = new DoubleLiteral($r.getLine(), $r.getCharPositionInLine()+1, $r.text);}
    ;

// TOKENS
MINUS: '-';

NOT: '!';

ABRE_CORCHETE: '[';
CIERRA_CORCHETE: ']';
ABRE_PARENTESIS: '(';
CIERRA_PARENTESIS: ')';
VOID: 'void';

DOT: '.';

AS: 'as';

IF: 'if';
ELSE: 'else';
WHILE: 'while';

PUTS: 'puts';
IN: 'in';

IGUAL: '=';

DEF: 'def';
MAIN: 'main';

RETURN: 'return';

DOS_PUNTOS: '::';

DEFSTRUCT: 'defstruct';

COMMA: ',';

DO: 'do';

END: 'end';

OMMIT: [ \t\r\n] -> skip;

LINE_COMMENT: '#' .*? ('\r'|'\n'|EOF) -> skip;

MULTI_LINE_COMMENT: '"""' .*? '"""' -> skip;

INT_CONSTANT: [0-9]+;

REAL_CONSTANT:  ([0-9]+'.'[0-9]* | '.' [0-9]+) (([Ee] [+-]? [0-9]+ )?)  |
                [0-9]+ (([Ee] [+-]? [0-9]+ ));

CHAR_CONSTANT: '\'' ( . | ( '\\' ([0-9]+ | [tnr])) ) '\'';

ID:  [a-zA-Z_] [a-zA-Z0-9_]*;
