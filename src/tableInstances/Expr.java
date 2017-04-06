package tableInstances;

import java.util.regex.Pattern;

import org.antlr.runtime.tree.Tree;

import tableInstancesVar.SString;
import tableInstancesVar.Var;

public class Expr {
	
	//Element le plus à gauche de l'expression ( "in", "string" ou instance de classe)
	private Var var;
	
	//Si cette l'expression n'est pas totalement lue, il faut lire la suite.
	private Expr nextExpr;
	
	public Expr(Tree node)
	{
		this.type = node.getChild(0).getText();
		
		switch (this.type)
		{
			case "+":
				this.var = new Var(node.getChild(1));
			case "-":
			case "*":
			case "OPERCONDITION":
			case "OPPOSE":
			case "(":
			case "this":
			case "super":
			case "NEW":
			default:
				//Si c'est un "int"
				if (this.type.matches("[0-9]+"))
					
				//Si c'est un "string"
				else if (this.type.matches("\".*\""))
					
				//Si c'est une instance de classe
				else 
					
						
		}
	}
	
	
	

	int evaluateInt(Tree node)
	{
		
		return value;
	}
	
	SString evaluateSString(Tree node)
	{
		return string;
	}
}
