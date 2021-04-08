grammar LCT;

program: statement*;

statement
 : assignment
 | reassignment
 | output
 | ifStatement
 | forStatement
 ;

assignment: VAR ID ASSIGN expr;
reassignment: ID ASSIGN expr;

output: PRINT expr;

statementBlock
 : '{' block '}'
 | statement
 ;

block: statement*;

forStatement: FOR forCondition statementBlock;
forCondition : iterator=expr  'from' startExpr=INT range='to' endExpr=INT ;

ifStatement: IF conditionBlock (ELSE IF conditionBlock)* (ELSE statementBlock)?;
conditionBlock: '('expr')' statementBlock;

expr
 : variables                                                        #variablesExpr
 | expr op=(MULTIPLICATION | DIVISION) expr                         #multiDivExpr
 | expr op=(PLUS | MINUS) expr                                      #plusMinusExpr
 | expr op=(LESSEQUAL | GREATEREQUAL | LESSTHAN | GREATERTHAN) expr #relationalExpr
 | expr op=(EQUAL | NOTEQUAL) expr                                  #equalExpr
 | expr AND expr                                                    #andExpr
 | expr OR expr                                                     #orExpr
 ;

variables
 : (INT | FLOAT)    #numberVariable
 | STRING           #stringVariable
 | ID               #idVariable
 | (TRUE | FALSE)   #booleanVariable
 ;

PLUS : '+';
MINUS : '-';
MULTIPLICATION : '*';
DIVISION : '/';

EQUAL : '==';
NOTEQUAL : '!=';
GREATEREQUAL : '>=';
LESSEQUAL : '<=';
AND : '&&';
OR : '||';
GREATERTHAN : '>';
LESSTHAN : '<';

ASSIGN : '=';
TRUE : 'true';
FALSE : 'false';
FOR : 'loop';
PRINT: 'output';
VAR: 'var';
IF : 'if';
ELSE : 'else';

ID
 : [a-zA-Z_] [a-zA-Z_0-9]*
 ;

INT
 : [0-9]+
 ;

FLOAT
 : [0-9]+ '.' [0-9]*
 | '.' [0-9]+
 ;

STRING
 : '"' (~["\r\n] | '""')* '"'
 ;

COMMENT
 : '//' ~[\r\n]* -> skip
 ;

SPACE
 : [ \t\r\n] -> skip
 ;