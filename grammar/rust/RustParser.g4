parser grammar RustParser;
options { tokenVocab=RustLexer; }

Body
    : memberContent  mainMethodDeclaration
    ;

memberContent
    : GlobalVariable  fieldDeclaration* fieldDeclaration* fieldDeclaration* structDeclaration*  methodDeclaration methodDeclaration*
    ;

structDeclaration
	: STRUCT identifier structBody
	;

structBody
	:'<T> {' structMemberContent* '}'
	;

structMemberContent
	: fieldDeclaration* methodDeclaration*
	;


methodDeclaration
    : 'fn' identifier  formalParameters  '->' typeTypeOrVoid methodBody
    ;

mainMethodDeclaration
    : 'fn main()' mainMethodBody
    ;

methodBody
    : block
    ;

mainMethodBody
    : mainMethodBlock
    ;

typeTypeOrVoid
    : typeType
    | '()'
    ;

fieldDeclaration
    : 'let' identifier ':' primitiveType ';'  identifier ('=' expression) ';'
    ;

formalParameters
    : '(' ( formalParameterList?) ')'
    ;

formalParameterList
    : formalParameter (',' formalParameter)* (',' lastFormalParameter)? 
    | lastFormalParameter
    ;

formalParameter
    :  'mut' methodVarname ':' primitiveType
    ;

lastFormalParameter
    :   'mut' methodVarname ':' primitiveType
    ;

methodVarname
    : identifier
    ;

integerLiteral
    : integer
    ;

shortLiteral
    : shortInteger
    ;

longLiteral
    : longInteger
    ;


// STATEMENTS / BLOCKS

block
    : '{' 'unsafe {' ( localVariableDeclaration ';' )* ( localVariableDeclaration ';' )*  '}' statement ExpressionInBlock blockStatement '}'
    ;

loopBlock
    : '{' 'unsafe {' ( localVariableDeclaration ';' )* ( localVariableDeclaration ';' )*  '}' statement ExpressionInBlock blockStatement '}'
    ;

mainMethodBlock
    : '{'  mainContent '}'
    ;
mainContent
    : ' '
    ;

blockStatement
    : 'unsafe {' localVariableDeclaration ';' '}'
    | statement
	| 'unsafe {' (updateExpression ';')*  '}'
    ;

localVariableDeclaration
    : variableDeclaration
    ;

variableDeclaration	
    : 'let' identifier ':' primitiveType ';'  identifier ('=' expression)
	;

identifier
    : IDENTIFIER
    ;

statement
    : ifStatement
    | forStatement
    | whileStatement
    | 'unsafe {' (updateExpression ';')* '}'
	| 'unsafe {' (updateExpression ';')* '}'
    ;

whileStatement
    : WHILE '(' boolParExpression ')' loopBlock
    ;

ifStatement
    : IF '(' boolExpression ')' block elseStatement?
    ;
	
elseStatement
	:ELSE block
	;

forStatement
    : forControl  loopBlock
    ;

forControl
    : 'let i:i32; for i in 1..3'
    ;

updateExpression
    :   boolVarName  ('=' | '&=' | '|=' ) '(' boolExpression ')'
    //| floatVarName ('/=' ) floatDivisor 
    //| floatVarName ('=' | '+=' | '-=' | '*=' ) floatExpression 
    | integerVarName ('=' | '+=' | '-=' | '*=') integerExpression 
    | integerVarName '=' integerDivisor ('/' | '%') integerDivisor
    | integerVarName ( '^='  ) integerExpression 
//	    | integerVarName ( '^=' | '>>=' | '<<=' ) integerExpression 
    | longVarName '=' longDivisor ('/' | '%') longDivisor 
    | longVarName ('=' | '+=' | '-=' | '*=') longExpression 
    | longVarName ( '^=' ) longExpression 
//	| longVarName ( '^=' | '>>=' | '<<=' ) longExpression 
    | shortVarName '=' shortDivisor ('/' | '%') shortDivisor 
    | shortVarName ('=' | '+=' | '-=' | '*=' ) shortExpression 
    | shortVarName ( '^=' ) shortExpression 
//	| shortVarName ( '^=' | '>>=' | '<<=' ) shortExpression 
    ;

/** Matches cases then statements, both of which are mandatory.
 *  To handle empty cases at the end, we add switchLabel* to statement.
 */


// EXPRESSIONS


boolParExpression
    :  '(' integerVarName ')' ('<=' | '>=' | '>' | '<') '(' integerExpression ')' 
    |  '(' integerVarName ')' ('==' | '!=') '(' integerExpression ')' 
	//| '(' floatVarName ')' ('<=' | '>=' | '>' | '<') '(' floatExpression ')'  
    //|  '(' floatVarName ')' ('==' | '!=') '(' floatExpression ')' 
    |  '(' shortVarName ')' ('<=' | '>=' | '>' | '<') '(' shortExpression ')' 
    |  '(' shortVarName ')' ('==' | '!=') '(' shortExpression ')' 
    |  '(' longVarName ')' ('<=' | '>=' | '>' | '<') '(' longExpression ')' 
    |  '(' longVarName ')' ('==' | '!=') '(' longExpression ')' 
    |  '!'  '(' boolVarName ')'
    | '('  boolVarName ')' '&' '(' boolExpression ')'
    | '('  boolVarName ')' '|' '(' boolExpression ')'
    | '('  boolVarName ')' '&&' '(' boolExpression ')'
    | '('  boolVarName ')' OR  '(' boolExpression ')'
    |   boolVarName
    ;

boolExpression
    :   boolExpression 
    //|  '(' floatExpression ')' ('<=' | '>=' | '>' | '<') '(' floatExpression ')'  
    //|  '(' floatExpression ')' ('==' | '!=') '(' floatExpression ')' 
    |  '(' integerExpression ')' ('<=' | '>=' | '>' | '<') '(' integerExpression ')' 
    |  '(' integerExpression ')' ('==' | '!=') '(' integerExpression ')' 
    |  '(' shortExpression ')' ('<=' | '>=' | '>' | '<') '(' shortExpression ')' 
    |  '(' shortExpression ')' ('==' | '!=') '(' shortExpression ')' 
    |  '(' longExpression ')' ('<=' | '>=' | '>' | '<') '(' longExpression ')' 
    |  '(' longExpression ')' ('==' | '!=') '(' longExpression ')' 
    |  '!'  '(' boolExpression ')'
    | '('  boolExpression ')' '&' '(' boolExpression ')'
    | '('  boolExpression ')' '|' '(' boolExpression ')'
    | '('  boolExpression ')' '&&' '(' boolExpression ')'
    | '('  boolExpression ')' OR  '(' boolExpression ')'
    |   boolVarName 
    |   BOOL_LITERAL
    ;

expression
    : integerExpression
	//floatExpression 
    | shortExpression
    | longExpression
    ;


/*floatExpression
    : '(' floatExpression ')'
    | floatVarName
    | floatLiteral
    //| methodCall
    //| NEW creator
    //| floatVarName ('++' | '--')
	//| ('++'|'--') floatVarName
    | '(' ('+'|'-') floatVarName ')'
    | '(' floatVarName '/' '(' floatDivisor ')' ')'
    | '(' floatVarName ('*'|'+'|'-') '(' floatExpression ')' ')'
    | '(' '(' floatExpression ')'  '/' '(' floatDivisor ')' ')'
    | '(' '(' floatExpression ')'  ('*'|'+'|'-') '(' floatExpression ')' ')'
    //| varName '=' NEW creator 
    ;
	*/

integerExpression
    : '(' integerExpression ')'
    | integerVarName
    | integerLiteral
    | '(' ('+'|'-') integerVarName ')'
    | '(' integerVarName ('*'|'+'|'-') '(' integerExpression ')' ')'
    | '('  '(' integerExpression ')'  ('*'|'+'|'-') '(' integerExpression ')' ')'
    ;


shortExpression
    : '(' shortExpression ')'
    | shortVarName
    | shortLiteral
    ;


longExpression
    : '(' longExpression ')'
    | longVarName
    | longLiteral
    //| longVarName ('++' | '--')
	//| ('++'|'--') longVarName
    | '(' ('+'|'-') longVarName ')'
    | '(' longDivisor ('/'|'%')  '(' longDivisor ')' ')'
    | '(' longVarName ('*'|'+'|'-') '(' longExpression ')' ')'
    | '('  '(' longDivisor ')'  ('/'|'%')  '(' longDivisor ')' ')'
    | '('  '(' longExpression ')'  ('*'|'+'|'-') '(' longExpression ')' ')'
    ;

longDivisor
    : longVarName
    ;
shortDivisor
    : shortVarName
    ;

integerDivisor
    : integerVarName 
    ;
/*floatDivisor
    : floatVarName 
    ;
	*/

boolVarName
    : identifier
    ;

integerVarName
    : identifier
    ;

shortVarName
    : identifier
    ;

longVarName
    : identifier
    ;



typeType
    : primitiveType
    ;

primitiveType
    : BOOL
    | I16
    | I32
    | I64
    //| DOUBLE
    ;

//integer: [1-9][0-9][0-9][0-9];
integer: [0-9];


//shortInteger: [1-9][0-9][0-9];
shortInteger: [0-9];


//longInteger: [1-9][0-9][0-9][0-9][0-9][0-9][0-9];
longInteger: [0-9];

/*double: integer '.' [0-9]([0-9])?
  |'0.' [0-9]([0-9])?;
  */
  
GlobalVariable: 'GlobalVariable';

