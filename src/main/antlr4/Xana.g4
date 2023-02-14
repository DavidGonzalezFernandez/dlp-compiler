grammar Xana;


@header {
package es.uniovi.dlp.parser;
}

program: (ID | INT_CONSTANT | REAL_CONSTANT | CHAR_CONSTANT)*
       ;

OMMIT: [ \t\r\n]    -> skip
            ;

LINE_COMMENT: '#' ~'\n' -> skip
            ;

MULTI_LINE_COMMENT: '"""' .*? '"""'     -> skip
            ;

INT_CONSTANT: [0-9]+
            ;

ID:  [a-zA-Z_] [a-zA-Z0-9_]*
            ;

REAL_CONSTANT: [0-9]* '.' [0-9]* ([Ee] [+-]? [0-9]+ )?
            ;

CHAR_CONSTANT: '\'' ( . | ( '\\' ([0-9]+ | [tnr])) ) '\''
            ;
