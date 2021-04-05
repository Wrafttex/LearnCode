grammar LCT;
program: stmt*;
stmt:
    assignStmt
    | invocationStmt
    | show
;


assignStmt: VAR ID '=' expr;

invocationStmt: name=ID ((expr COMMA)* expr)?;

expr: ID | INT | STRING
|     LPAREN expr RPAREN
|     expr op =(MULTIPLICATION | DIVISION) expr
|     expr op =(ADDITION | SUBTRACTION) expr
|     expr AND expr
|     expr AND expr
;

show: 'show' (INT | STRING | ID);

//add: 'add' (INT | ID) 'to' ID ;


//tokens
COMMA: ',';
VAR: 'var';
INT: [0-9]+;
STRING: '"' (~('\n' | '"'))* '"';
ID: [a-zA-Z_] [a-zA-Z0-9_]*;

WS: [ \n\t\r]+ -> skip;

//operators
ADDITION:        '+';
SUBTRACTION:     '-';
MULTIPLICATION:  '*';
DIVISION:        '/';
POW:             '^';
MOD:             '%';
LPAREN:          '(';
RPAREN:          ')';



