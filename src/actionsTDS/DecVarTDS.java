package actionsTDS;

import org.antlr.runtime.tree.Tree;

import main.BrowseTree;
import tableInstancesVar.CClass;
import tableInstancesVar.Int;
import tableInstancesVar.SString;
import tableInstancesVar.Var;

public class DecVarTDS {
	Var var;
	
	public DecVarTDS(Tree node)
	{
		String id = node.getChild(0).getText();
		String type = node.getChild(1).getText();

		int scope = BrowseTree.INSTANCE_TDS.size()-1;
		
		switch(type)
		{
			//Si la variable déclarée est un entier.
			case "int":
				var = new Int(id,scope);
				break;
			//Si la variable déclarée est une chaîne de caractères.
			case "string":
				var = new SString(id,scope);
				break;
			//Si la variable déclarée est une instance de classe.
			default:
				var = new CClass(id,scope,type);
				break;
				
		}
		
		
		BrowseTree.INSTANCE_TDS.get(scope).addElement(var);
		
	}

}