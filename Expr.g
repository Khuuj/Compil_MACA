grammar Expr;

@header {
import java.util.HashMap;
}

@members {
/** Map variable name to Integer object holding value */
HashMap<String,Integer>  memory = new HashMap<String,Integer>();
}

prog :  var_decl* instr+;

var_decl : 'var' ID_OTHERS ':' type;

type :  INT;

instr : ID_OTHERS ':=' expr
        {memory.put($ID_OTHERS.text, new Integer(5));}
        |print
      ;

print : 'write' expr {System.out.println("aaa");};

expr :  
        ID_OTHERS
        | INT
     ;




INT : '0'..'9'+ ;
STRING :   '"' (' '..'~')+ '"' ;
ID_CLASS : 'A'..'Z' ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
ID_OTHERS : 'a'..'z' ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
COMMENTS : '/*' .* '*/' {$channel=HIDDEN;};
NEWLINE:'\r'? '\n';
WS : (' ')+ {$channel=HIDDEN;};


