package analyseSem;

import org.antlr.runtime.tree.Tree;

import actionsTDS.BodyClassTDS;
import tableTypes.ClassType;

public class DecClassSem {

	public DecClassSem(Tree node) {
		new DecClassSemAlreadyExist(node);
	
		if((node.getChildCount()>1) && (!node.getChild(1).getText().equals("BODY_CLASS"))){
			new DecClassSemInheritExist(node);
		}

	}

	
}
