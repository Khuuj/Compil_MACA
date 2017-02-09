grammar Expr;

options {
k=1; /* vérification pour que la grammaire soit LL(1) */
}
prog :  class_decl* var_decl* instr+;

class_decl : 'class' ID_CLASS ('inherit' ID_CLASS)? '=' '(' class_item_decl ')' ;

class_item_decl : var_decl* method_decl*;

var_decl : 'var' ID_OTHERS ':' type ';';

type :  ID_CLASS
	|'int'
	|'string'
	;

method_decl : 'method' ID_OTHERS '('  method_args* ')' m;

m  	:'{' var_decl* instr+ '}'
	| ':' type '{' var_decl* instr+ '}'
	;


method_args : ID_OTHERS ':' type (',' ID_OTHERS ':' type)*;

instr : ID_OTHERS ':=' i
	|'if' expr 'then' instr ('else' instr)? 'fi'
	|'for' ID_OTHERS 'in' expr '..' expr 'do' instr+ 'end'
	|'{' var_decl* instr+ '}'
	|'do' expr '.' ID_OTHERS '(' expr (',' expr)* ')'';'
	|print
	|read
	|retourne
      ;

i : expr ';' | 'nil' ';' ;

print : 'write' p ';';

p : expr  | STRING;

read : 'read' ID_OTHERS ';';

retourne : 'return' '(' expr ')'';';

expr
	: ID_OTHERS e
	| 'this' e
	| 'super' e
	| INT e
	| 'new' ID_CLASS e
	| '(' expr ')' e
	| '-' expr e
	;

e : '.' ID_OTHERS '(' expr (',' expr )* ')'
	|OPER expr
	|
	;




/*oper 
	:  operplus;

operplus 
	:  opermult
	| OPERPLUS
	;

opermult 
	: opercomp
	| OPERMULT
	;

opercomp 
	:OPERCOMP
	;*/
INT : '0'..'9'+ ;
STRING :   '"' (' '..'~')+ '"' ;
OPER : '+'|'*'|'-'|'<'|'<='|'>'|'>='|'=='|'!=';
ID_CLASS : 'A'..'Z' ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
ID_OTHERS : 'a'..'z' ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
COMMENTS : '/*' .* '*/' {$channel=HIDDEN;};
NEWLINE:'\r'? '\n'{$channel=HIDDEN;};
WS : (' ')+ {$channel=HIDDEN;};