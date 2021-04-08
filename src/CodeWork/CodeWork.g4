grammar CodeWork;

//Start variable
prog: (decl | expr)+ EOF        #Program
    ; // + means, atleast one of these variables we want, EOF is for error handling

decl: INT_TYPE ID '=' NUM   #Declaration
    ;

//earlier the production rule means higher precedense in ANTLR
expr: expr '*' expr             #Multiplication
    | expr '+' expr             #Addition
    | ID                        #Variable
    | NUM                       #Number
    ;

//Tokens
ID : [a-z][a-zA-Z0-9_]*; //identifiers
NUM : '0' | '-'?[1-9][0-9]*;
INT_TYPE : 'INT';
COMMENT: '//' ~[\r\n]* -> skip;
WS: [ \n\t\r]+ -> skip;

