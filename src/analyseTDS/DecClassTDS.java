package analyseTDS;

import org.antlr.runtime.tree.Tree;

import main.BrowseTree;
import tableTypes.BodyClass;
import tableTypes.ClassType;

public class DecClassTDS {
	public DecClassTDS(Tree node)
	{
		//'class' a=ID_CLASS ('inherit' b=ID_CLASS)? '=' '(' class_item_decl ')' ->^(DEC_CLASS $a ($b)? class_item_decl?)
		String id = node.getChild(0).getText();
		
		if(node.getChildCount() == 1){
			BrowseTree.CLASS_TDS.addClassType(new ClassType(id));
		}
		else if(node.getChildCount() == 2){
			String next = node.getChild(1).getText();
			if(!node.getChild(1).getText().equals("BODY_CLASS"))
			{
				BrowseTree.CLASS_TDS.addClassType(new ClassType(id,next));
			}
			else{
				BrowseTree.CLASS_TDS.addClassType(new ClassType(id,new BodyClass(node.getChild(1)).getClassItems()));
			}
			
		}
		else{
			String next = node.getChild(1).getText();
			BrowseTree.CLASS_TDS.addClassType(new ClassType(id,next,new BodyClass(node.getChild(2)).getClassItems()));
		}
	}
}