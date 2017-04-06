package actionsTDS;

import java.util.ArrayList;

import org.antlr.runtime.tree.Tree;

import tableInstances.Element;
import tableTypesClassItems.Method;

public class MethodTDS {
	
	private Method method;
	
	public MethodTDS(Tree node){
		
		String id = node.getChild(0).getText();
		
		//le 1er fils est toujours l'id et le dernier toujours le corps de la methode
		if(node.getChildCount() == 2){
			BodyMethodTDS body = new BodyMethodTDS(node.getChild(1));
			method = new Method(id,body.getElements());
		}
		//il peut y avoir entre les 2 les type de retour ou les paramètres
		else if(node.getChildCount() == 3){
			
			BodyMethodTDS body = new BodyMethodTDS(node.getChild(2));
			
			if(node.getChild(1).getText().equals("PARAMS")){
				ParamsTDS params = new ParamsTDS(node.getChild(1));
				method = new Method(id,params.getElements(),body.getElements());
			}
			else{
				String returnType = node.getChild(1).getText();
				method = new Method(id,returnType,body.getElements());
			}
		}
		else{
			ParamsTDS params = new ParamsTDS(node.getChild(1));
			String returnType = node.getChild(2).getText();
			BodyMethodTDS body = new BodyMethodTDS(node.getChild(3));
			method = new Method(id,params.getElements(),returnType,body.getElements());
		}
		
	}
	public Method getMethod(){
		return method;
	}
		
}
