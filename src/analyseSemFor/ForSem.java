package analyseSemFor;

import org.antlr.runtime.tree.Tree;

import analyseSemAffect.AffectSemExistVar;

public class ForSem {

	public ForSem(Tree node) {
		new AffectSemExistVar(node.getChild(0));
		new ForSemIncIsInt(node.getChild(0));
		new ForSemBornes(node.getChild(1));
	}

}
