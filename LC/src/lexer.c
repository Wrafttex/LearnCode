#include "include/lexer.h"
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

lexer_T* init_lexer(char* contents)
{
    //allocate memory for the struct:
    lexer_T* lexer = calloc(1, sizeof(struct LEXER_STRUCT));
    lexer -> contents = contents;
    lexer -> i = 0;
    lexer -> c = contents[lexer -> i];

    return lexer;
}

void lexer_advance(lexer_T* lexer)
{
    if(lexer -> c != '\0' && lexer -> i < strlen(lexer -> contents))
    {
        //advancing to the next character
        lexer -> i += 1;
        lexer -> c = lexer -> contents[lexer -> i];
    }
}

void lexer_skip_whitespace(lexer_T* lexer)
{
    while (lexer -> c == ' ' || lexer -> c == 10)
    {
        lexer_advance(lexer);
    }
}


token_T* lexer_get_next_token(lexer_T* lexer)
{
    //If we stil have characters to parse - continue:
    while (lexer -> c != '\0' && lexer -> i < strlen(lexer -> contents))
    {
        //first skip whitespace
        if (lexer -> c == ' ' || lexer -> c == 10)
            lexer_skip_whitespace(lexer);

        if (isalnum(lexer -> c))
        return lexer_collect_id(lexer);

        if (lexer -> c == '"')
        {
            return lexer_collect_string(lexer);
        }

        switch (lexer -> c)
        {
            case '=': return lexer_advance_with_token(lexer, init_token(TOKEN_EQUALS, lexer_get_current_char_as_string(lexer))); break;
            case ';': return lexer_advance_with_token(lexer, init_token(TOKEN_SEMI, lexer_get_current_char_as_string(lexer))); break;
            case '(': return lexer_advance_with_token(lexer, init_token(TOKEN_LPAREN, lexer_get_current_char_as_string(lexer))); break;
            case ')': return lexer_advance_with_token(lexer, init_token(TOKEN_RPAREN, lexer_get_current_char_as_string(lexer))); break;
        }
    }

    return (void*)0;
}

token_T* lexer_collect_string(lexer_T* lexer)
{
    lexer_advance(lexer);

    char* value = calloc(1, sizeof(char));
    value[0] = '\0';

    while (lexer -> c != '"')
    {
        char* s = lexer_get_current_char_as_string(lexer);
        // The value we calloc above is realocated so it can fit the string we are creatin in char* s
        value = realloc(value, (strlen(value) + strlen(s) + 1) * sizeof(char));
        //append the current character to the value array value[0]
        strcat(value, s);

        lexer_advance(lexer);
    }

    //now we have found the closing quote, and to ignore we use:
    return init_token(TOKEN_STRING, value);
}

token_T* lexer_collect_id(lexer_T* lexer)
{
    char* value = calloc(1, sizeof(char));
    value[0] = '\0';

    //While current character is alpha numeric (isalnum) we collect the value:
    while (isalnum (lexer -> c))
    {
        char* s = lexer_get_current_char_as_string(lexer);
        // The value we calloc above is realocated so it can fit the string we are creatin in char* s
        value = realloc(value, (strlen(value) + strlen(s) + 1) * sizeof(char));
        //append the current character to the value array value[0]
        strcat(value, s);

        lexer_advance(lexer);
    }

    //now we have found the closing quote, and to ignore we use:
    return init_token(TOKEN_STRING, value);
}


//helper method to clean up the code
token_T* lexer_advance_with_token(lexer_T* lexer, token_T* token)
{
    lexer_advance(lexer);

    return token;
}


char* lexer_get_current_char_as_string(lexer_T* lexer)
{
    char* str = calloc(2, sizeof(char));
    str[0] = lexer -> c; 
    str[1] = '\0';

    return str;
}