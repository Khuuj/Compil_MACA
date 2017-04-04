package actions;

import java.util.ArrayList;

import org.antlr.runtime.tree.Tree;

import main.BrowseTree;
import tableInstances.Table;
import tableTypes.TableClass;

/**
 * Classe centralisant les traitement effectués sur la racine de l'arbre.
 * On peut par exemple imaginer vouloir limiter le nombre de variables déclarées ou d'autres limitations.
 *
 */
public class Root {
	
	public Root(Tree node)
	{
		BrowseTree.INSTANCE_TDS = new ArrayList<Table>();
		BrowseTree.INSTANCE_TDS.add(new Table());
		BrowseTree.CLASS_TDS = new TableClass();
	}
}
