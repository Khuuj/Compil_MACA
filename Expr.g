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
}

prog :  	class_decl* var_decl* instr+ 
	-> ^(ROOT class_decl* var_decl* instr+)
	;


class_decl : 'class' ID_CLASS ('inherit' ID_CLASS)? '=' '(' class_item_decl ')'
	;
	
class_item_decl : var_decl* method_decl*;

var_decl : 
	'var' ID_OTHERS ':' type ';'
	->^(DEC_VAR type ID_OTHERS )
	;
	

type :  
	ID_CLASS
	|'int'
	|'string'
	;

method_decl : 'method' ID_OTHERS '('  method_args* ')' m;

m  	:'{' var_decl* instr+ '}'
	| ':' type '{' var_decl* instr+ '}'
	;


method_args : ID_OTHERS ':' type (',' ID_OTHERS ':' type)*;

instr : 
	ID_OTHERS ':=' i
	->^(AFFECT ID_OTHERS i)
	|'if' expr 'then' instr ('else' instr)? 'fi'
	|'for' ID_OTHERS 'in' expr '..' expr 'do' instr+ 'end' -> ^('for' ^('in' ID_OTHERS ^('..' expr expr)) instr+)
	|'{' var_decl* instr+ '}'
	|'do' expr ';'
	|print
	|read
	|retourne
      ;

i : 
	expr ';' -> expr
	| 'nil' ';' -> 'nil' //pas sur
	;

print : 'write' expr ';';

read : 'read' ID_OTHERS ';';

retourne :
	'return' '(' expr ')'';'
 	-> ^(RETURN expr)
 	;

expr
	: oper e//ID_OTHERS e
	| 'this' e
	| 'super' e
	//| INT e
	| STRING e
	| 'new' ID_CLASS e
	//| '(' expr ')' e
	| '-' expr 
	;

e 	: oper//OPER expr //-> ^(OPER expr) mais noeud unaire
	|'.' ID_OTHERS '(' (expr (',' expr )*)? ')' e
	|
	;

oper
	:condition
	;

condition
	: exprplus( OPERCONDITION^ exprplus )?
	;

exprplus
	: exprmult ( OPERPLUS^ exprmult)*
	;

exprmult
	: atom (OPERMULT^ atom)*
	;

atom: 
	ID_OTHERS
	| INT
	| '('oper')'
	;



INT : '0'..'9'+ ;
STRING :   '"' (' '..'!' | '#'..'~')* '"' ;

OPERCONDITION:'<'|'<='|'>'|'>='|'=='|'!=';
OPERPLUS : '+'|'-';
OPERMULT:	'*'|'/';

ID_CLASS : 'A'..'Z' ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
ID_OTHERS : 'a'..'z' ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

COMMENTS : '/*' .* '*/' {$channel=HIDDEN;};
NEWLINE:'\r'? '\n'{$channel=HIDDEN;};
WS : (' ')+ {$channel=HIDDEN;};