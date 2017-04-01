package tableInstances;

import java.util.ArrayList;
import java.util.HashMap;

@SuppressWarnings("serial")
public class Table extends HashMap<Integer,ArrayList<Element>>{
	
	
	public Table()
	{
	}
	
	//ajoute un élément et retourne si l'ajout a bien pu être fait ou non.
	public void addElement(Element element)
	{
		int clé = hash(element);
		this.get(clé).add(element);
	}
	
	//Fonction qui calcule la clé d'un élément en fonction de son id
	public int hash(Element element)
	{
		int tailleId = element.id.length();
		//nombre premier afin d'éviter la redondance dans les clés
		int hashNb = 23;
		int clé = 0;
		for(int i = 0 ; i < tailleId ; i++)
		{
			clé = clé * hashNb + element.id.charAt(i);
		}
		return clé;
	}
	
}
