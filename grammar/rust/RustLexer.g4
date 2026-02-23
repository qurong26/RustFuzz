lexer grammar RustLexer;
BOOL:            'bool';
ELSE:               'else';
IF:                 'if';
WHILE:              'while';
I16:                'i16';
I32:                'i32';
I64:                'i64';

BOOL_LITERAL
	:'true'
	|'false'
	;
	
STRUCT
	:'struct'
	;

OR
    : '||'
    ;
	
/*AUTO
	:'auto'
	;*/

// Identifiers

IDENTIFIER:         Letter LetterOrDigit LetterOrDigit LetterOrDigit LetterOrDigit LetterOrDigit LetterOrDigit LetterOrDigit*;
//IDENTIFIER:         Letter Letter Digit;

fragment LetterOrDigit
    : Letter
    | Digit
    ;
	
Digit
	:[0-9]
	;
	

fragment Letter
    : [a-zA-Z] // these are the "java letters" below 0x7F
    ;
