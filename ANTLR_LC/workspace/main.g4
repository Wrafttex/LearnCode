grammar main;

program: (decl | expr | stmt)+ EOF;

decl: DATA_TYPE ID '=' expr ';'
    | DATA_TYPE ID ',' ID ';'   // Scuffed-multi declaration
    | DATA_TYPE ID ';'          // Single-declaration
    ;


stmt: ID '=' expr
    ;

// UNUSED
stmts: stmt
     ;

expr: expr op expr
    | ID
    | NUM
    | FLOAT
    ;

op: '+'                     # Addition
  | '-'                     # Subtraction
  | '*'                     # Multiplication
  | '/'                     # Division
  | '^'                     # Exponent
  | '%'                     # Modulo
  // sqrt
  | '>'                     # Less_than
  | '<'                     # Greater_than
  | '='                     # Equal
  | '<='                    # Great_or_equal
  | '>='                    # Less_or_equal
  | '!='                    # Not_equal
  | '!'                     # Logical_not
  | '=='                    # Comparison
  | 'OR'                    # Logical_or
  | 'AND'                   # Logical_and
  | ','                     # Separator
  // Parenthesis () []
  ;

// Tokens
ID  : [a-z][a-zA-Z0-9_]*;
NUM : '0'
    | '-'?[1-9][0-9]*;

FLOAT : [0-9]*[.]?[0-9]+
      ;

DATA_TYPE : 'VAR';
ML_COMMENT : '#-' .*? '-#';
SL_COMMENT : '#' ~[\r|\n]*;
WS : [ \t\n]+ -> skip;