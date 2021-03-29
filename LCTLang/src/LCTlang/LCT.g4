grammar LCT;
program: stmt*;
stmt:
    assignStmt
    | invocationStmt
    | show
;

assignStmt: VAR ID '=' expr;

invocationStmt: name=ID ((expr COMMA)* expr)?;

expr: ID | INT | STRING;

show: 'show' (INT | STRING | ID);

//tokens
COMMA: ',';
VAR: 'var';
TO: 'to';
INT: [0-9]+;
STRING: '"' (~('\n' | '"'))* '"';
ID: [a-zA-Z_] [a-zA-Z0-9_]*;

WS: [ \n\t\r]+ -> skip;