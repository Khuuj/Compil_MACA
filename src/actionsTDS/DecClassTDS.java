package actionsTDS;

import org.antlr.runtime.tree.Tree;

import analyseSem.DecClassSemInheritExist;
import main.BrowseTree;
import tableTypes.ClassType;

public class DecClassTDS {
	
	private ClassType classType;
	
	public DecClassTDS(Tree node)
	{
		String id = node.getChild(0).getText();

		// le 1er fils est le nom de la class
		if(node.getChildCount() == 1){
			classType = new ClassType(id);
		}
		// le second fils est: le nom de la classe mère si elle exist, le corp de la classe sinon
		else if(node.getChildCount() == 2)
		{
			String next = node.getChild(1).getText();
			
			if(!node.getChild(1).getText().equals("BODY_CLASS")){
				classType = new ClassType(id,next);
			}
			else{
				BodyClassTDS body = new BodyClassTDS(node.getChild(1));
				classType = new ClassType(id,body.getClassItems());
			}
		}
		//le 3eme fils s'il existe est forcement le corp de la classe
		else{
			String next = node.getChild(1).getText();
			BodyClassTDS body = new BodyClassTDS(node.getChild(2));;
	
			classType = new ClassType(id,next,body.getClassItems());
		}
	
		BrowseTree.CLASS_TDS.addClassType(classType);
	}
}

