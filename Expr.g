grammar Expr;

prog :  class_decl* var_decl* instr+;

class_decl : 'class' ID_CLASS ('inherit' ID_CLASS)? '=' '(' class_item_decl ')' ;

class_item_decl : var_decl* method_decl*;

var_decl : 'var' ID_OTHERS ':' type ';';

type :  ID_CLASS
	|'int'
	|'string'
	;

method_decl : 'method' ID_OTHERS '(' method_args* ')' '{' var_decl* instr+ '}'
	      |'method' ID_OTHERS '(' method_args* ')' ':' type '{' var_decl* instr+ '}'
	      ;

method_args : ID_OTHERS ':' type (',' ID_OTHERS ':' type)*;

instr : ID_OTHERS ':=' expr ';'
        |ID_OTHERS ':=' 'nil'';'
	|'if' expr 'then' instr ('else' instr)? 'fi'
	|'for' ID_OTHERS 'in' expr '..' expr 'do' instr+ 'end'
	|'{' var_decl* instr+ '}'
	|'do' expr '.' ID_OTHERS '(' expr (',' expr)* ')'';'
	|print
	|read
	|return
      ;

print : 'write' expr
	| 'write' STRING
	;

read : 'read' ID_OTHERS ';';

return : 'return' '(' expr ')'';';

expr : expr_begin expr_end;

expr_begin : ID_OTHERS
	     |'this'
	     |'super'
	     |INT 
                           |'new' ID_CLASS
	     |'(' expr')'
             |'-' expr
           ;

expr_end : expr_middle expr_end 
	|
	   ;
expr_middle :'.'ID_OTHERS '(' expr (','expr)* ')'
	     | oper expr
            ;

oper 
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
	;
	



INT : '0'..'9'+ ;
STRING :   '"' (' '..'~')+ '"' ;
OPERPLUS : '+'|'-';
OPERMULT :	'*';
OPERCOMP :	'-'|'<'|'<='|'>'|'>='|'=='|'!=';
ID_CLASS : 'A'..'Z' ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
ID_OTHERS : 'a'..'z' ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
COMMENTS : '/*' .* '*/' {$channel=HIDDEN;};
NEWLINE:'\r'? '\n';
WS : (' ')+ {$channel=HIDDEN;};


