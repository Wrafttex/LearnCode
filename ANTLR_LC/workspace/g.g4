grammar g;


program: (decl | expr)+ EOF
    ;

decl: ID ':' DATA_TYPE '=' NUM;

op: '*' | '+' | '-';

expr: expr op expr
    | ID
    | NUM
    | ML_COMMENT
    | SL_COMMENT
    ;

// Tokens
ID  : [a-z][a-zA-Z0-9_]*;
NUM : '0' | '-'?[1-9][0-9]*;
DATA_TYPE : 'INT' | 'BOOL' | 'CHAR' | 'STRING' | 'DECIMAL';
ML_COMMENT : '#-' .*? '-#';
SL_COMMENT : '#' ~[\r|\n]*;
WS : [\t\n]+ -> skip; // Haven't been tested.