package tableInstances;

import java.util.ArrayList;
import java.util.HashMap;


/**
 * Classe représentant une TDS d'éléments instanciés.
 *
 */
@SuppressWarnings("serial")
public class Table extends HashMap<Integer,ArrayList<Element>>{
	
	/**
	 * Constructeur permettant d'instancier une TDS.
	 */
	public Table()
	{
		super();
	}
	
	/**
	 * Ajoute un élément dans la TDS.
	 * 
	 * @param element : l'élément a être ajouté dans la TDS.
	 */
	public void addElement(Element element)
	{
		int key = hash(element.id);
		if (this.get(key) == null)
			this.put(key, new ArrayList<Element>());
		this.get(key).add(element);
	}
	
	/**
	 * Fonction qui calcule la clé d'un élément dans la TDS en fonction de son id.
	 * 
	 * @param element : id de l'élément dont la clé doit être calculée.
	 * @return la clé de l'élément dans la TDS.
	 */
	public static int hash(String id)
	{
		int tailleId = id.length();
		//Nombre premier afin d'éviter la redondance dans les clés
		int hashNb = 23;
		int clé = 0;
		for(int i = 0 ; i < tailleId ; i++)
		{
			clé = clé * hashNb + id.charAt(i);
		}
		return clé;
	}
	
}
