#include "include/parser.h"
#include <stdio.h>
#include <string.h>

parser_T* init_parser(lexer_T* lexer)
{
    parser_T* parser = calloc(1, sizeof(struct PARSER_STRUCT));
    parser -> lexer = lexer;
    parser -> current_token = lexer_get_next_token(lexer);

    return parser;
}

void parser_consume(parser_T* parser, int token_type)
{
    if (parser -> current_token -> type == token_type)
    {
        parser -> current_token = lexer_get_next_token(parser -> lexer);
    }
    else
    {
        printf(
            "Unexpected token '%s', with type %d",
            parser -> current_token -> value,
            parser -> current_token -> type
        );
        exit(1);
    }
    
}

//Main Entry Point - returns the whole AST of source code
AST_T* parser_parse(parser_T* parser)
{
    //parsing a list of statements
    return parser_multiple_statements(parser);
}

AST_T* parser_single_statement(parser_T* parser)
{
    switch (parser -> current_token -> type)
    {
    case TOKEN_ID: return parser_parse_id(parser);
        break;
    }

}

AST_T* parser_multiple_statements(parser_T* parser)
{
    //creating compound node and allocating memory for compound list
    AST_T* compound = init_ast(AST_COMPOUND);
    compound -> compound_value = calloc(1, sizeof(struct AST_STRUCT*));

    //parsing a statement that is then added to the list compound_value[0]
    AST_T* ast_statement = parser_single_statement(parser);
    compound -> compound_value[0] = ast_statement;


    //while the token type is == a semicolon, we keep increasing size and adding to the compound size
    while (parser -> current_token -> type == TOKEN_SEMI)
    {
        parser_consume(parser, TOKEN_SEMI);

        AST_T* ast_statement = parser_single_statement(parser);
        compound -> compound_size += 1;
        
        compound -> compound_value = realloc(
            compound -> compound_value, 
            compound -> compound_size * sizeof(struct AST_STRUCT*)
            );
        //putting new statement found at the end of the list
        compound -> compound_value[compound -> compound_size - 1] = ast_statement;
        
    }
    return compound;
}

AST_T* parser_parse_expr(parser_T* parser)
{
    switch (parser -> current_token -> type)
    {
    case TOKEN_STRING: return parser_parse_string(parser);
    }
}

AST_T* parser_parse_factor(parser_T* parser)
{

}

AST_T* parser_parse_term(parser_T* parser)
{

}

AST_T* parser_parse_function_call(parser_T* parser)
{

}

AST_T* parser_parse_variable_definition(parser_T* parser)
{   
    parser_consume(parser, TOKEN_ID); //expecting var
    char* variable_definition_variable_name = parser -> current_token -> value;
    parser_consume(parser, TOKEN_ID); //expecting var name
    parser_consume(parser, TOKEN_EQUALS);
    AST_T* variable_definition_value = parser_parse_expr(parser); //expecting value

    AST_T* variable_definition = init_ast(AST_VARIABLE_DEFINITION);
    variable_definition -> variable_definition_variable_name = variable_definition_variable_name;
    variable_definition -> variable_definition_value = variable_definition_value;

    return variable_definition;
}

AST_T* parser_parse_variable(parser_T* parser)
{
    char* token_value = parser -> current_token -> value;
    parser_consume(parser, TOKEN_ID); //var name or function call name

    if (parser -> current_token -> type == TOKEN_LPAREN)
    {
        return parser_parse_function_call(parser);
    }
    AST_T* ast_variable = init_ast(AST_VARIABLE);
    ast_variable -> variable_name = token_value;

    return ast_variable;   
}

AST_T* parser_parse_string(parser_T* parser)
{
    AST_T* ast_string = init_ast(AST_STRING);
    ast_string -> string_value = parser -> current_token -> value;
    parser_consume(parser, TOKEN_STRING);
    
    return ast_string;
}

AST_T* parser_parse_id(parser_T* parser)
{
    //If id value is known (like a var), then we assume that person tries to define a variable.
    if (strcmp(parser -> current_token -> value, "var") ==0)
    {
        return parser_parse_variable_definition(parser);
    }
    //else we assume they try to access a variable
    else
    {
        return parser_parse_variable(parser);
    }
}