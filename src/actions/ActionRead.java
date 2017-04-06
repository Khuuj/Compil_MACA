package actions;

import java.util.Scanner;

import org.antlr.runtime.tree.Tree;

public class ActionRead {
	public ActionRead(Tree node){
		String id = node.getChild(0).getText();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
	}
}
