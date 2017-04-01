package analyseSem;

import org.antlr.runtime.tree.Tree;

public class DecVarSem {
	
	public DecVarSem(Tree node)
	{
		new DecVarExistenceId(node);
		new DecVarExistenceType(node);
	}
}
