package tableInstances;

import org.antlr.runtime.tree.Tree;

public class Expr {
	
	private int value;
	
	public Expr(Tree node)
	{
		this.value = evaluate(node);
	}
	
	
	

	int evaluate(Tree node)
	{
		
		return value;
	}
}
