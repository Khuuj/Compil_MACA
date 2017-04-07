package actionsTDS;

import org.antlr.runtime.tree.Tree;

import tableInstances.Element;
import tableInstancesVar.CClass;
import tableInstancesVar.Int;
import tableInstancesVar.SString;
import tableInstancesVar.Var;

public class ParamTDS {
private Var var;
	
	public ParamTDS(Tree node,int scope){
		
		String id = node.getChild(0).getText();
		String type = node.getChild(1).getText();
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
		
	}
	
	public Element getVar(){
		return var;
	}
}
