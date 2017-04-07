package analyseSemAffect;

import org.antlr.runtime.tree.Tree;

import analyseSemOper.TypeTester;
import analyseSemTODO.ExprSem;

public class AffectSemType {

	public AffectSemType(Tree node) {
		
		String valeur=node.getChild(0).getText();
		
		boolean sameType;
		
		String VarType=(new TypeTester(node.getChild(0))).getType();
		
		sameType=ExprSem.rightType(node.getChild(1), VarType);
		
		if (!sameType){
			System.err.println("Erreur AFFECTType ligne n°"+node.getLine()+" : La variable "+valeur+" et la valeur affect�e sont de deux types diff�rents");
		}
	}

}
