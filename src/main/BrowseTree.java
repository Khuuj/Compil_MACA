
package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.Tree;

<<<<<<< HEAD

=======
>>>>>>> branch 'master' of https://github.com/Khuuj/Compil_MACA
import actionsTDS.AffectTDS;
import actionsTDS.DecClassTDS;
import actionsTDS.DecVarTDS;
import actionsTDS.RootTDS;
import analyseSem.AffectSem;
import analyseSem.DecClassSem;
import analyseSem.DecVarSem;
import analyseSem.ReadSem;
import analyseSem.WriteSem;
import expr.ExprLexer;
import expr.ExprParser;
import tableInstances.Table;
import tableTypes.TableClass;

/**
 * Cette classe comprends la fonction main du compilateur.
 * 
 * Elle parcourt l'arbre, contient les TDS (qui s'empilent selon la portée de leur contenu
 * dans la variable "INSTANCE_TDS"), et répercute vers les différentes classes du projets les
 * éléments obtenus afin d'effectuer les contrôles sémantiques et les ajouts dans les TDS.
 * 
 * Il y a INSTANCE_TDS qui est une pile de TDS et comprends tout les éléments instanciés, et 
 * CLASS_TDS qui comprends tous les types de classe définies (et pas leur instances !!).
 * 
 * Les TDS sont des hashmaps avec gestion de collision afin d'optimiser les ajouts et accès.
 * 
 */
public class BrowseTree {
	
	/**Contient les TDS des éléments instanciés.
	 * Les TDS sont empilées en fonction de leur portées.
	 */
	public static ArrayList<Table> INSTANCE_TDS;
	
	/*Est-ce qu'on a besoin d'une portée pour la définition de classes ? 
	 * Il faudrait lire la grammaire pour s'en assurer!
	 */
	public static TableClass CLASS_TDS;
	
	public static void main(String[] args) throws Exception 
	{
		File initialFile = new File("FichiersTests/input.txt");
	    InputStream targetStream = new FileInputStream(initialFile);
		ANTLRInputStream input = new ANTLRInputStream(targetStream);
        ExprLexer lexer = new ExprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExprParser parser = new ExprParser(tokens);
        Tree tree =  (Tree) parser.prog().getTree();
        
        //Affiche l'arbre sous forme parenthésée
        System.out.println(tree.toStringTree()+"\n");
        
        //Affiche l'arbre reçu sous une forme plus lisible
        printChildren(tree);
        
        
        browse(tree);     
	}
	
	/**
	 * Fonction qui affiche un arbre sous forme plus claire.
	 * 
	 * @param tree : l'arbre donné par antlr.
	 */
	private static void printChildren(Tree tree) {
        printChildren(tree,0);		
	}

	/**
	 * Fonction récursive utilisée pour l'affichage de l'arbre.
	 * 
	 * @param node : noeud parcouru lors de l'appel.
	 * @param nbSpaces : variable permettant l'indentation successive en fonction de la profondeur dans l'arbre 
	 */
	public static void printChildren(Tree node, int nbSpaces)
	{
		int nbChildren = node.getChildCount();
		for (int i = 0 ; i < nbSpaces ; i++)
			System.out.print("\t");
		System.out.print("|");
		System.out.println(node.getText());
		for (int i = 0 ; i < nbChildren ; i++)
		{
			printChildren(node.getChild(i),nbSpaces+1);
		}
	}
	
	/**
	 * Fonction récursive parcourant les enfant de ROOT et appelant la fonction "action(Tree node)" à chaque noeud
	 * 
	 * @param node : noeud parcouru lors de l'appel.
	 */
	public static void browse(Tree node)
	{
		int nbChildren = node.getChildCount();
		action(node);
		for (int i = 0 ; i < nbChildren ; i++)
		{
			action(node.getChild(i));
		}
	}
	
	/**
	 * Fonction effectuant l'action nécessaire à un noeud donné.
	 * En pratique elle appelle des fonctions définies dans des classes dédiées à ces noeuds.
	 * 
	 * @param node : le noeud traité.
	 */
	private static void action(Tree node) 
	{
		switch (node.getText())
		{
			//cas traité afin d'éventuellement ajouter des traitement plus tard
			case "ROOT":
				new RootTDS();
				break;
				
			//cas de déclaration de classe.
			case "DEC_CLASS":
				new DecClassSem(node);
				new DecClassTDS(node);
				break;
				
			//cas de déclaration de variable.
			case "DEC_VAR" :
				new DecVarSem(node);
				new DecVarTDS(node);
				break;
			
			//cas d'affectation de variable
			case "AFFECT":
				new AffectSem(node);
				new AffectTDS(node);
				break;
			
			/*case "FOR":
				new ForSem(node);
				new ForTDS(node);
				break;*/
				
			case "write":
				new WriteSem(node);
				break;
			
			case "read":
				new ReadSem(node);

			default:
				break;
			
		}
	}
	
	
}