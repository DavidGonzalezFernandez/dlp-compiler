grammar Xana;


@header {
package es.uniovi.dlp.parser;
}

program: (var_def | func_def)* main_def;

// Main definition
main_def: DEF MAIN ABRE_PARENTESIS CIERRA_PARENTESIS DO main_body  END;
main_body: (var_def | statement)*;

// Function definitions
func_def: func_heading func_body;
func_heading: DEF ID ABRE_PARENTESIS param_list CIERRA_PARENTESIS DOS_PUNTOS (simple_type | VOID);
func_body: DO (var_def | statement)* END;

param_list: (var_def (',' var_def)*)?;

// Variable definitions
var_def: ID (COMMA ID)* DOS_PUNTOS var_type_def;
var_type_def: simple_type | array_def_type | struct_def_type;
simple_type: 'int' | 'double' | 'char';
array_def_type: ABRE_CORCHETE INT_CONSTANT DOS_PUNTOS var_type_def CIERRA_CORCHETE;
struct_def_type: DEFSTRUCT DO (var_def)* END;


// Statements
statement: func_invocation | if_else | while | assignment | puts | in | return;
func_invocation: ID ABRE_PARENTESIS argument_list CIERRA_PARENTESIS;
argument_list: (expression (COMMA expression)*)?;
if_else: IF condition DO (statement)* (ELSE (statement)*)? END;
while: WHILE condition DO (statement)* END;
condition: expression;
assignment: expression IGUAL (expression);
puts: PUTS expression (COMMA expression)*;
in: IN expression (COMMA expression)*;
return: RETURN expression?;


// Expressions
expression: simple_value                                                      |
            ID                                                                |
            func_invocation                                                   |
            ABRE_PARENTESIS expression CIERRA_PARENTESIS                      |
            ABRE_CORCHETE expression CIERRA_CORCHETE                          |
            expression ABRE_CORCHETE expression CIERRA_CORCHETE (expression?) |
            expression DOT expression                                         |
            expression AS simple_type                                         |
            MINUS expression                                                  |
            NOT expression                                                    |
            expression ('*' | '/' | '%') expression                           |
            expression ('+' | MINUS) expression                               |
            expression ('>' | '>=' | '<' | '<=' | '!=' | '==') expression     |
            expression ('&&' | '||') expression                               ;

simple_value: INT_CONSTANT | CHAR_CONSTANT | REAL_CONSTANT;

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
