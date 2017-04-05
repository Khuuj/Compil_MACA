package actions;

import org.antlr.runtime.tree.Tree;

import analyseSem.DecClassSem;

public class DecClass {

	public DecClass(Tree node)
	{
		new DecClassSem(node);
	}
}
