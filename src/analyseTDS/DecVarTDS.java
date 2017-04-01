package analyseTDS;

import org.antlr.runtime.tree.Tree;

import main.ParcoursArbre;
import tableInstances.Var;

public class DecVarTDS {
	
	public DecVarTDS(Tree node)
	{
		String id = node.getChild(0).getText();
		String type = node.getChild(1).getText();
		
		ParcoursArbre.GLOBAL_TDS.addClassType(new Var(id,type));
	}
}
