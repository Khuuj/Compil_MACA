package analyseSemFor;

import org.antlr.runtime.tree.Tree;

import analyseSem.ExistenceTest;

public class ForSem {

	public ForSem(Tree node) {
		new ExistenceTest(node.getChild(0));
		//new ForSemIncIsInt(node.getChild(0));
		new ForSemBornes(node.getChild(1));
	}

}
