grammar Xana;


@header {
package es.uniovi.dlp.parser;
}

program: var_def* func_def* main_def
       ;

main_def: DEF MAIN ABRE_PARENTESIS CIERRA_PARENTESIS DO main_body  END;
main_body: (var_def | statement)*;       //TODO: ¿puede llevar return?

func_def: void_func_def | non_void_func_def;

void_func_heading: DEF ID ABRE_PARENTESIS param_list CIERRA_PARENTESIS DOS_PUNTOS simple_type;
void_func_body: (var_def | statement | return_empty)*;
void_func_def: void_func_heading void_func_body;

non_void_func_heading: DEF ID ABRE_PARENTESIS param_list CIERRA_PARENTESIS DOS_PUNTOS simple_type;
non_void_func_body: (var_def | statement | return_expression*);
non_void_func_def: non_void_func_heading non_void_func_body;

param_list: var_def (',' var_def)*;

var_def: ID (COMMA ID)* DOS_PUNTOS var_type_def;

var_type_def: simple_type | array_def | struct_def;

simple_type: 'int' | 'double' | 'char';

array_def: ABRE_CORCHETE INT_CONSTANT DOS_PUNTOS var_type_def CIERRA_CORCHETE;

struct_def: DEFSTRUCT DO (var_def)* END;    //TODO: 1+ o 0+

func_invocation: ID ABRE_PARENTESIS argument_list CIERRA_PARENTESIS;

argument_list: (expression (COMMA expression)*)?;

statement: func_invocation | if_else | while | assignment | puts | in;

assignment: ID IGUAL expression;

puts: PUTS expression;

in: IN expression;

condition: /**TODO*/;

if_else: IF condition DO (statement)* (ELSE (statement)*)? END;

while: WHILE condition DO (statement)* END;

return_empty: RETURN;

return_expression: RETURN expression;

simple_value: INT_CONSTANT | CHAR_CONSTANT | REAL_CONSTANT;

expression: simple_value |
            ABRE_PARENTESIS expression CIERRA_PARENTESIS    |
            ABRE_CORCHETE expression CIERRA_CORCHETE        |
            expression DOT expression                       |
            expression AS expression; //TODO acabar


UNARY_MINUS: '-';

ABRE_CORCHETE: '[';
CIERRA_CORCHETE: ']';

DOT: '.';

AS: 'as';

IF: 'if';

PUTS: 'puts';

IN: 'in';

IGUAL: '=';

ELSE: 'else';

WHILE: 'while';

MAIN: 'main';

RETURN: 'return';

ABRE_PARENTESIS: '(';

CIERRA_PARENTESIS: ')';

DEF: 'def';

DOS_PUNTOS: '::';

DEFSTRUCT: 'defstruct';

COMMA: ',';

DO: 'do';

END: 'end';

OMMIT: [ \t\r\n] -> skip
            ;

LINE_COMMENT: '#' .*? ('\r'|'\n'|EOF) -> skip
             ;

MULTI_LINE_COMMENT: '"""' .*? '"""' -> skip
            ;

INT_CONSTANT: [0-9]+
            ;

REAL_CONSTANT:  ([0-9]+'.'[0-9]* | '.' [0-9]+) (([Ee] [+-]? [0-9]+ )?)  |
                [0-9]+ (([Ee] [+-]? [0-9]+ ))
            ;

CHAR_CONSTANT: '\'' ( . | ( '\\' ([0-9]+ | [tnr])) ) '\''
            ;

ID:  [a-zA-Z_] [a-zA-Z0-9_]*
            ;
