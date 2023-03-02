grammar Xana;

@header {
    package es.uniovi.dlp.parser;
    import es.uniovi.dlp.ast.*;
    import es.uniovi.dlp.ast.expressions.*;
    import es.uniovi.dlp.ast.expressions.subexpressions.*;
    import es.uniovi.dlp.ast.program.*;
    import es.uniovi.dlp.ast.statement.substatements.*;
    import es.uniovi.dlp.ast.statement.*;
    import es.uniovi.dlp.ast.types.*;
    import es.uniovi.dlp.ast.types.subtypes.*;
}

program     //TODO pendiente
    : (var_def | func_def)* main_def
    ;

// Main definition
main_def        //TODO pendiente
    : DEF MAIN ABRE_PARENTESIS CIERRA_PARENTESIS DO main_body  END
    ;
main_body       //TODO pendiente
    : (var_def | statement)*
    ;

// Function definitions
func_def        //TODO pendiente
    : func_heading func_body
    ;
func_heading        //TODO pendiente
    : DEF ID ABRE_PARENTESIS param_list CIERRA_PARENTESIS DOS_PUNTOS (simple_type | VOID)
    ;
func_body       //TODO pendiente
    : DO (var_def | statement)* END
    ;

param_list      //TODO pendiente
    : (var_def (',' var_def)*)?
    ;

// Variable definitions
var_def returns [List<VarDefinition> ast = new ArrayList<VarDefinition>();]
    : v1=ID {$ast.add(new VarDefinition($v1.getLine(), $v1.getCharPositionInLine()+1, $v1.text));}
      (COMMA v2=ID {$ast.add(new VarDefinition($v2.getLine(), $v2.getCharPositionInLine()+1, $v2.text));})*
      DOS_PUNTOS var_type_def { for (VarDefinition v : $ast) v.setType($var_type_def.ast); }
    ;

var_type_def returns [Type ast]
    : simple_type { $ast = $simple_type.ast; }
    | array_def_type { $ast = $array_def_type.ast; }
    | struct_def_type { $ast = $struct_def_type.ast; }
    ;

simple_type returns [Type ast]
    : t='int'    { $ast = new IntType($t.getLine(), $t.getCharPositionInLine()+1); }
    | t='double' { $ast = new DoubleType($t.getLine(), $t.getCharPositionInLine()+1); }
    | t='char'   { $ast = new CharType($t.getLine(), $t.getCharPositionInLine()+1); }
    ;

array_def_type returns [Type ast]
    : ABRE_CORCHETE INT_CONSTANT DOS_PUNTOS var_type_def CIERRA_CORCHETE {$ast = new ArrayType($ABRE_CORCHETE.getLine(), $ABRE_CORCHETE.getCharPositionInLine()+1);}
    ;

struct_def_type returns [Type ast]
    : DEFSTRUCT DO (var_def)* END {$ast = new StructType($DEFSTRUCT.getLine(), $DEFSTRUCT.getCharPositionInLine()+1);}
    ;


// Statements
statement       //TODO pendiente
    : func_invocation
    | if_else
    | while
    | assignment
    | puts
    | in
    | return
    ;


func_invocation returns [FunctionInvocation ast]
    : ID ABRE_PARENTESIS argument_list CIERRA_PARENTESIS
    {$ast = new FunctionInvocation($ID.getLine(), $ID.getCharPositionInLine()+1);}
    ;

argument_list       //TODO pendiente
    : (expression (COMMA expression)*)?
    ;


if_else     //TODO pendiente
    : IF expression DO (statement)* (ELSE (statement)*)? END
    ;


while       //TODO pendiente
    : WHILE expression DO (statement)* END
    ;


assignment      //TODO pendiente
    : leftExp=expression IGUAL rightExp=expression
    ;


puts        //TODO pendiente
    : PUTS expression (COMMA expression)*
    ;


in      //TODO pendiente
    : IN expression (COMMA expression)*
    ;


return      //TODO pendiente
    : RETURN expression?
    ;


// Expressions
expression      //TODO pendiente
    : simple_constant
    | ID
    | func_invocation
    | '(' expression ')'
    | array=expression '[' index=expression ']'
    | struct=expression DOT field=expression
    | expression AS simple_type
    | MINUS expression
    | NOT expression
    | leftExpresion=expression op=('*' | '/' | '%') rightExpression=expression
    | leftExpresion=expression op=('+' | MINUS) rightExpression=expression
    | leftExpresion=expression op=('>' | '>=' | '<' | '<=' | '!=' | '==') rightExpression=expression
    | leftExpresion=expression op=('&&' | '||') rightExpression=expression
    ;

simple_constant returns [Expression ast]
    : INT_CONSTANT
        { $ast = new IntLiteral($INT_CONSTANT.getLine(), $INT_CONSTANT.getCharPositionInLine()+1, Integer.parseInt($INT_CONSTANT.text));}
    | CHAR_CONSTANT
        { $ast = new CharLiteral($CHAR_CONSTANT.getLine(), $CHAR_CONSTANT.getCharPositionInLine()+1);}
    | REAL_CONSTANT
        { $ast = new DoubleLiteral($REAL_CONSTANT.getLine(), $REAL_CONSTANT.getCharPositionInLine()+1, Double.parseDouble($REAL_CONSTANT.text));}
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
