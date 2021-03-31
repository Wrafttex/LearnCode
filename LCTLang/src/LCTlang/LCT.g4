grammar LCT;

program: stmt*;

stmt:
    assignStmt
    | invocationStmt
    | show
    | func
    ;

assignStmt: VAR ID '=' expr;

invocationStmt: name=ID ((expr COMMA)* expr)?;

expr: ID | INT | STRING;

show: 'show' (INT | STRING | ID);

//add: 'add' (INT | ID) 'to' ID ;

//TODO Test the grammar with input-files
func: funcname LPAREN expr (',,' expr)* RPAREN
    |'function' ID LPAREN (VAR ID)* (',' VAR ID)* RPAREN
    | ID LPAREN (ID)* (',' ID)* RPAREN
    | ID LPAREN RPAREN
    ;

//TODO Implement reserved functions
funcname: ;

// Tokens
COMMA: ',';
VAR: 'var';
INT : '0'
    | '-'?[1-9][0-9]*;

FLOAT : [0.9]*[.]?[0.9]+
      ;

STRING: '"' (~('\n' | '"'))* '"';
ID: [a-zA-Z_] [a-zA-Z0-9_]*;

LPAREN: '(';
RPAREN: ')';

ML_COMMENT : '#-' .*? '-#';
SL_COMMENT : '#' ~[\r|\n]*;
WS: [ \n\t\r]+ -> skip;


//TODO Indentation and Dedentation tokens
//TODO Keep in mind of the lexer precedence