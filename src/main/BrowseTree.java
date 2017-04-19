
package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.Tree;
import actionsTDS.AffectTDS;
import actionsTDS.BlockTDS;
import actionsTDS.DecClassTDS;
import actionsTDS.DecVarTDS;
import actionsTDS.ForTDS;
import actionsTDS.IfTDS;
import actionsTDS.RootTDS;
import analyseSem.IfSem;
import analyseSemAffect.AffectSem;
import analyseSemDecClass.DecClassSem;
import analyseSemDecVar.DecVarSem;
import analyseSemFor.ForSem;
import analyseSemTODO.BlockSem;
import analyseSemTODO.DoSem;
import analyseSemTODO.ReadSem;
import analyseSemTODO.ReturnSem;
import analyseSemTODO.WriteSem;
import expr.ExprLexer;
import expr.ExprParser;
import tableInstances.Element;
import tableInstances.Table;
import tableInstancesVar.Var;
import tableTypes.ClassType;
import tableTypes.TableClass;
import tableTypesClassItems.ClassItem;
import tableTypesClassItems.Method;

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
        
        System.out.println("");
        System.out.println("");
        printTDSClass();
        System.out.println("");
        System.out.println("");
        printsClass();
        System.out.println("");
        System.out.println("");
        printMethods();
        /*System.out.println("");
        System.out.println("");
        printInstance();*/
	}
	
	public static void printTDSClass(){
		int i = 0;
		
		System.out.println("hashmap des class");
		System.out.println("");
		System.out.println("Clé\t\tClassList");
		for(Entry<Integer,ArrayList<ClassType>> entry : CLASS_TDS.entrySet()) {
		    Integer cle = entry.getKey();
		    ArrayList<ClassType> list = entry.getValue();
		    System.out.println(cle+"\t\tliste "+ i);
		    i++;
		}
	}
	
	public static void printsClass(){
		System.out.println("liste des class");
		System.out.println("");
		System.out.println("idClass\t\tidClassSup\t\titems");
		for(Entry<Integer,ArrayList<ClassType>> entry : CLASS_TDS.entrySet()) {
		    Integer cle = entry.getKey();
		    ArrayList<ClassType> list = entry.getValue();
		    for(ClassType c : list){
		    	System.out.print(c.id+" \t\t"+ c.supClassId + " \t\t ");
		    	for(ClassItem i : c.items){
		    		System.out.print("\t"+i.getClass().getSimpleName()+":"+i.id);
		    	}
		    	System.out.println("");	
	    	}
		}
	}
	
	public static void printMethods(){
		System.out.println("liste des methodes");
		System.out.println("");
		System.out.println("idClass\t\tmethode\t\ttype retour\t\tnb Params\t\tnom param\t\ttype param");
		for(Entry<Integer,ArrayList<ClassType>> entry : CLASS_TDS.entrySet()) {
		    Integer cle = entry.getKey();
		    ArrayList<ClassType> list = entry.getValue();
		    for(ClassType c : list){
		    	for(ClassItem i : c.items){
		    		if(i instanceof Method){
		    			System.out.print(c.id+"\t\t"+i.id+"\t\t"+ ((Method)i).returnType + "\t\t\t"+ ((Method)i).paramsNb);
		    			if(((Method)i).paramsNb != 0){
		    				for(Element e : ((Method)i).paramsTypes){
			    				System.out.print("\t\t\t"+ e.id + "\t\t\t"+ ((Var)e).type);
			    			}
		    			}
		    			System.out.println("");
		    		}	
		    	}	
	    	}
		}
	}
	
	public static void printInstance(){
		System.out.println("liste instances");
		System.out.println("");
		System.out.println("idClass\t\tidClassSup\t\titems");
		for(Table t : INSTANCE_TDS){

			/*for(Entry<Integer,ArrayList<Element>> entry : t) {
			    Integer cle = entry.getKey();
			    ArrayList<Element> list = entry.getValue();
			    
			}*/
		}
		
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
	public static void action(Tree node) 
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
			
			case "FOR":
				new ForSem(node);
				new ForTDS(node);
				break;
			
			case "IF":
				new IfSem(node);
				new IfTDS(node);
				break;
				
			case "BLOC":
				new BlockSem(node);
				new BlockTDS(node);
				break;
			
			case "do":
				new DoSem(node);
				break;
				
			case "write":
				new WriteSem(node);
				break;
			
			case "read":
				new ReadSem(node);
				break;
				
			case "RETURN":
				new ReturnSem(node);
				break;
				
			default:
				break;
			
		}
	}
// tesssssssssssssssssssssssssssssssssst	
	
}