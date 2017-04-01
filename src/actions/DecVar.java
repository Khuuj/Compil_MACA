package actions;

import org.antlr.runtime.tree.Tree;

import analyseSem.DecVarSem;
import analyseTDS.DecVarTDS;

public class DecVar {
	
	public DecVar(Tree node)
	{
		new DecVarSem(node);
		new DecVarTDS(node);
	}
	
	
}
