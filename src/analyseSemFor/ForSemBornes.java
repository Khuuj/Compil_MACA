package analyseSemFor;

import org.antlr.runtime.tree.Tree;

import analyseSemAffect.AffectSemExistVar;

public class ForSemBornes {
	public ForSemBornes(Tree node){
		String start = node.getChild(0).getText();
		String stop = node.getChild(1).getText();
		
		//si start n'est pas un nombre, on verifie que la variable existe et est un int
		if(!isANumber(start)){
			new AffectSemExistVar(node.getChild(0));
			new ForSemIncIsInt(node.getChild(0));
		}
		//si stop n'est pas un nombre, on verifie que la variable existe et est un int
		if(!isANumber(stop)){
			new AffectSemExistVar(node.getChild(1));
			new ForSemIncIsInt(node.getChild(1));
		}
		
		if(isANumber(start)&&isANumber(stop)){
			if(Integer.parseInt(start)>Integer.parseInt(stop)){
				System.err.println("Erreur FORBornes ligne n°"+node.getLine()+" : la valeur de la borne de fin est inférieur à celle de la borne de debut de boucle !");
			}
		}
	}
	
	public boolean isANumber(String chaine){
        try{              
              Integer.parseInt(chaine);
              return true;
        }catch(NumberFormatException nfe){
              return false;
        }
   }
}
