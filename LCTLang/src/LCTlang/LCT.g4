grammar LCT;

program
    : statement*
    ;

statement
    : assignStatement
    | invocationStatement
    | returnStatement
    | show
    | functionDeclaration
    | functionBlock
    ;

assignStatement: Var expression ';';

invocationStatement: name=Identifier ((expression ',')* expression)?;     // Not working as intended?

statementList
    : statement+
    ;

expression
    : expression '++'                                # PostIncrementExpression
    | expression '--'                                # PostDecrementExpression
    | '++' expression                                # PreIncrementExpression
    | '--' expression                                # PreDecrementExpression
    | '!' expression                                 # NotExpression
    | expression '^' expression                      # PowerExpression
    | expression ('*'|'/'|'%') expression            # MultiplicativeExpression
    | expression ('+'|'-') expression                # AdditiveExpression
    | expression '=' expression                      # AssignmentExpression
    | Identifier                                     # IdentifierExpression
    | Int                                            # IDK
    | String                                         # IDK
    ;

show: 'show' (Int | String | Identifier);



functionDeclaration
    : Function identifier '(' arguments? ')' functionBody
    ;

functionBody
    : '{' statement+ '}'
    ;

functionBlock
    : '{' statementList? '}'
    ;

identifier
    : functionIdentifier
    ;

functionIdentifier
    : functionName
    | Identifier
    ;

arguments
    : expression (',' expression)*
    ;


/* OLD
arguments
    : '('(argument (',' argument)* ','?)?')'
    ;

argument
    : (expression | ID)
    ;
*/
//TODO Implement reserved functions
functionName
    : 'test'
    ;

returnStatement
    : Return expression Semicolon
    ;

/*
keyword
    : FUNCTION
    | VAR
    | BREAK
    | FOR
    | IF
    | ELSE
    | TRUE
    | FALSE
    | RETURN
    ;
*/

// Tokens
fragment Newline: ('\r' '\n'? | '\n');

Multi_comment: '#-' .*? '-#' -> skip;           //Doesn't work without skip
Single_comment: '#' ~[\r|\n]* -> skip;          //

//Reserved keywords
Function: 'function';
Break: 'break';
For: 'for';
If: 'if';
Else: 'else';
Square_root: 'sqrt';
OR: 'OR';                   // Instead of ||
AND: 'AND';                 // Instead of &&
True: 'true';
False: 'false';
Return: 'return';
Var: 'var';

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

String: '"' (~('\n' | '"'))* '"';
Int: '0' | '-'?[1-9][0-9]*;
Float: [0.9]*[.]?[0.9]+;
Identifier: [a-zA-Z_] [a-zA-Z0-9_]*;

Whitespace: [ \n\t\r]+ -> skip;

//TODO Maybe split the files, into lexer grammar and parser grammar.
//TODO Solve the issue of using the same identifier names.