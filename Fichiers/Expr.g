grammar Expr;

options {
k=1; /* vérification pour que la grammaire soit LL(1) */
output =AST;
}

tokens{
ROOT;
DEC_CLASS;
DEC_VAR;
AFFECT;
RETURN;
FOR;
IF;
BLOC;
BODY;
METHOD;
ARGS;
PARAMS;
OPPOSE;
APPELMETHODE;
PARAM;
NEW;
BODY_CLASS;
}

prog :  	
	class_decl* var_decl* instr+ -> ^(ROOT class_decl* var_decl* instr+)
	;


class_decl :
	 'class' a=ID_CLASS ('inherit' b=ID_CLASS)? '=' '(' class_item_decl ')' ->^(DEC_CLASS $a ($b)? class_item_decl?)
	;
	
class_item_decl : 
	var_decl* method_decl* ->^(BODY_CLASS var_decl* method_decl*)
	;

var_decl : 
	'var' ID_OTHERS ':' type ';' ->^(DEC_VAR ID_OTHERS type)
	;
	
type :  
	ID_CLASS
	|'int'
	|'string'
	;

method_decl : 
	'method' ID_OTHERS '('  method_params? ')' m -> ^(METHOD ID_OTHERS   method_params?  m )
	;

m  :
	'{' var_decl* instr+ '}' ->^(BODY  var_decl* instr+ )
	| ':' type '{' var_decl* instr+ '}' -> type ^(BODY  var_decl* instr+ )
	;


method_params : 
	params -> ^(PARAMS params)
	;
	
params	:
	ID_OTHERS ':'  type (',' ID_OTHERS ':' type)* -> ^(PARAM ID_OTHERS  type)*
	;
	

instr : 
	ID_OTHERS ':=' i -> ^(AFFECT ID_OTHERS i)
	|'if' expr 'then' instr ('else' instr)? 'fi'  -> ^(IF expr instr instr?)
	|'for' ID_OTHERS 'in' boundaries 'do' instr+ 'end' -> ^(FOR ID_OTHERS boundaries instr+)// -> ^(FOR ^('in' ID_OTHERS ^('..' expr expr)) instr+)
	|'{' var_decl* instr+ '}' ->^(BLOC  var_decl* instr+ )
	|'do' expr ';'  -> ^('do'expr )
	|print
	|read
	|retourne
     	;

boundaries	:
	 a=expr '..' b=expr  -> ^('..' $a $b)
	 ;

i : 
	expr ';' -> expr
	| 'nil' ';' -> 'nil' //pas sur
	;

print :
	 'write' expr ';' -> ^('write' expr )
	 ;

read : 
	'read' ID_OTHERS ';' -> ^('read' ID_OTHERS)
	;

retourne :
	'return' '(' expr ')'';' -> ^(RETURN expr)
 	;

expr:
	// exprplus e
	exprplus e
	| 'this' e
	| 'super' e
	//| STRING
	| 'new' ID_CLASS  -> ^(NEW ID_CLASS )
	;
e :
	'.' ID_OTHERS '(' f? ')' e -> ^(APPELMETHODE ID_OTHERS f? e?)
	|
	;
	
f  	:  expr (',' expr )* -> ^(ARGS expr*)
	;


exprplus: 
	exprmult  ( ('+'^|'-'^) exprmult )*
	;


exprmult:
	 oper( '*'^ oper )?
	;

oper:
	moinsunaire (OPERCONDITION^ moinsunaire)*
	;

moinsunaire:	
	'-' atom -> ^(OPPOSE atom)
	| atom
	;
atom: 
	 ID_OTHERS
	| STRING
	|  INT 
	| '('expr')'
	;


INT : '0'..'9'+ ;
STRING :   '"' (' '..'!' | '#'..'~')* '"' ;

OPERCONDITION:'<'|'<='|'>'|'>='|'=='|'!=';


ID_CLASS : 'A'..'Z' ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
ID_OTHERS : 'a'..'z' ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

COMMENTS : '/*' .* '*/' {$channel=HIDDEN;};
NEWLINE:'\r'? '\n' {$channel=HIDDEN;};
WS : (' '|'\t')+  {$channel=HIDDEN;};