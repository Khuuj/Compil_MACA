package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.Tree;

import actions.DecVar;
import actions.Root;
import expr.*;
import tableInstances.Table;


public class ParcoursArbre {
	
	// On en fera des ArrayList de TDS, pour l'instant laissons comme ça pour les tests.
	public static Table GLOBAL_TDS;
	public static Table CLASS_TDS;
	
	public static void main(String[] args) throws Exception 
	{
		File initialFile = new File("FichiersTests/input.txt");
	    InputStream targetStream = new FileInputStream(initialFile);
		ANTLRInputStream input = new ANTLRInputStream(targetStream);
        ExprLexer lexer = new ExprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExprParser parser = new ExprParser(tokens);
        Tree root =  (Tree) parser.prog().getTree();
        System.out.println(root.toStringTree()+"\n");
        printChildren(root,0);
        
        //browse(root);
	}
	
	public static void printChildren(Tree t, int nbSpaces)
	{
		int nbChildren = t.getChildCount();
		for (int i = 0 ; i < nbSpaces ; i++)
			System.out.print("\t");
		System.out.print("|");
		System.out.println(t.getText());
		for (int i = 0 ; i < nbChildren ; i++)
		{
			printChildren(t.getChild(i),nbSpaces+1);
		}
	}
	
	public static void browse(Tree node)
	{
		int nbChildren = node.getChildCount();
		action(node);
		for (int i = 0 ; i < nbChildren ; i++)
		{
			browse(node.getChild(i));
		}
	}

	private static void action(Tree node) 
	{
		switch (node.getText())
		{
			case "ROOT":
				new Root(node);
				break;
			case "DEC_CLASS":
			case "DEC_VAR" :
				new DecVar(node);
				break;
			
		}
	}
	
	
}