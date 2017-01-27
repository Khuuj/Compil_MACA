grammar izi;

@header {
import java.util.HashMap;
}

@members {
/** Map variable name to Integer object holding value */
HashMap<String,Integer>  memory = new HashMap<String,Integer>();
}

prog :  class_decl* var_decl* instr+;

class_decl: 'class' ID_CLASS ('inherit' ID_CLASS)?  '=' '(' class_item_decl ')' ;

class_item_decl : var_decl*;

var_decl : 'var' ID_OTHERS ':' type;

type :  'int'
	| 'string'
	;

instr : ID_OTHERS ':=' expr NEWLINE
        {memory.put($ID_OTHERS.text, new Integer($expr.value));}
        |print
	| NEWLINE
      ;

print : 'write' expr {System.out.println($expr.value);};

expr returns [int value]:  
        ID_OTHERS
	{
	Integer v = (Integer)memory.get($ID_OTHERS.text);
	if(v!=null) $value = v.intValue();
	else System.err.println("caca");
	}
        | INT{$value = Integer.parseInt($INT.text);}
     ;




INT : '0'..'9'+ ;
STRING :   '"' (' '..'~')+ '"' ;
ID_CLASS : 'A'..'Z' ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
ID_OTHERS : 'a'..'z' ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
COMMENTS : '/*' .* '*/' {$channel=HIDDEN;};
NEWLINE:'\r'? '\n';
WS : (' ')+ {$channel=HIDDEN;};

