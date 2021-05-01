grammar LCT;

program
    : statement*
    ;

statement
    : assignStatement
    | reassignment
    | output
    | ifStatement
    | forStatement
    | functionDeclaration
    | functionCall
    | solveFunction
    ;

assignStatement
    : Var Identifier '=' expr
    | Var Identifier
    ;

reassignment
    : Identifier '=' expr
    ;

output
    : Print LeftParen expr RightParen
    ;


functionDeclaration
    : Function identifier '(' arguments? ')' statementBlock
    ;

functionCall
    : identifier '(' arguments? ')'
    ;

identifier
    : Identifier
    | functionName
    ;

arguments
    : expr (',' expr)*
    ;

//TODO Implement reserved functions
functionName
    : 'intersection'
    ;

returnStatement
    : Return LeftParen expr RightParen
    ;

statementBlock
    : statement* returnStatement* End
    ;

forStatement
    : For forCondition statementBlock
    ;

forCondition
    : loopCount=expr 'times'
    ;

ifStatement
    : If conditionBlock (Else If conditionBlock)* (Else Then statementBlock)?
    ;

conditionBlock
    : '('expr')' Then statementBlock
    ;

solveFunction
    : Solve LeftParen variable RightParen 'for' Identifier
    ;

expr
    : Minus expr                                             # UnaryExpr
    | expr op=Power expr                                     # PowerExpr
    | expr Increment                                         # PostIncrementExpr
    | expr Decrement                                         # PostDecrementExpr
    | Increment expr                                         # PreIncrementExpr
    | Decrement expr                                         # PreDecrementExpr
    | Not expr                                               # NotExpr
    | expr op=(Multiply|Divide|Modulo) expr                  # MultiplicativeExpr
    | expr op=(Plus|Minus) expr                              # AdditiveExpr
    | expr op=(LessEqual|MoreEqual|LessThan|MoreThan) expr   # RelationalExpr
    | expr op=(Equal|NotEqual) expr                          # EqualExpr
    | expr AND expr                                          # AndExpr
    | expr OR expr                                           # OrExpr
    | variable                                               # VariableExpr
    | functionCall                                           # FunctionReturn
    ;

variable
    : LeftParen expr RightParen          # ParentExpr
    | (Int | Float)                      # NumberVariable
    | Identifier                         # IdentifierVariable
    | String                             # StringVariable
    | (True | False)                     # BooleanVariable
    ;

// Tokens
fragment Newline: ('\r' '\n'? | '\n');

Multi_comment: '#-' .*? '-#' -> skip;           //Doesn't work without skip
Single_comment: '#' ~[\r|\n]* -> skip;          //

//Reserved keywords
Function: 'function';
Break: 'break';
For: 'loop';
If: 'if';
Else: 'else';
Square_root: 'sqrt';
OR: 'OR';                   // Instead of ||
AND: 'AND';                 // Instead of &&
True: 'true';
False: 'false';
Return: 'return';
Var: 'var';
Print: 'output';
End: 'end';
Then: 'then';
Solve: 'solve';

// Encapsulation Tokens
LeftParen: '(';
RightParen: ')';
LeftBracket: '[';
RightBracket: ']';
LeftBrace: '{';
RightBrace: '}';

Colon: ':';
Semicolon: ';';
Comma: ',';

//Operators
Plus: '+';
Minus: '-';
Multiply: '*';
Divide: '/';
Power: '^';
Modulo: '%';
LessThan: '<';
MoreThan: '>';
Assign: '=';
LessEqual: '<=';
MoreEqual: '>=';
NotEqual: '!=';
Not: '!';
Equal: '==';
Increment: '++';
Decrement: '--';

String: '"' (~('\n' | '"'))* '"';
Int: [0-9]+;
Float: ([0-9]*[.])?[0-9]+;
Identifier: [a-zA-Z_] [a-zA-Z0-9_]*;
BLOk_COMMENT: '/*' .*? '*/' -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;
Whitespace: [ \n\t\r]+ -> skip;

//TODO Maybe split the files, into lexer grammar and parser grammar.
//TODO Solve the issue of using the same identifier names.