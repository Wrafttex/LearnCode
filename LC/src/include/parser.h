#ifndef PARSER_H
#define PARSER_H
#include "lexer.h"
#include "AST.h"

typedef struct PARSER_STRUCT
{
    lexer_T* lexer;
    token_T* current_token;
} parser_T;

parser_T* init_parser(lexer_T* lexer);

//in consume we tell the parser that we expect a certain token, if we get an unexpected, then it wont consume
void parser_consume(parser_T* parser, int token_type);

//main entry point of parser, returns the whole AST Tree from any source code
AST_T* parser_parse(parser_T* parser);

AST_T* parser_single_statement(parser_T* parser);

AST_T* parser_multiple_statements(parser_T* parser);

AST_T* parser_parse_expr(parser_T* parser);

//Parsing things you multiply
AST_T* parser_parse_factor(parser_T* parser);

//parsing things you add
AST_T* parser_parse_term(parser_T* parser);

AST_T* parser_parse_function_call(parser_T* parser);

AST_T* parser_parse_variable_definition(parser_T* parser);

AST_T* parser_parse_variable(parser_T* parser);

AST_T* parser_parse_string(parser_T* parser);

AST_T* parser_parse_id(parser_T* parser);

#endif