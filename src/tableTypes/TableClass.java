package tableTypes;

import java.util.ArrayList;
import java.util.HashMap;

import tableInstances.Element;

public class TableClass extends HashMap<Integer,ArrayList<Element>>{
	
		//ajoute un élément et retourne si l'jout a bien pu être fait ou non.
		public void addClassType(Element classType)
		{
			int clé = hash(classType);
			this.get(clé).add(classType);
		}
		
		//Fonction qui calcule la clé d'un élément en fonction de son id
		public int hash(Element classType)
		{
			int tailleId = classType.id.length();
			//nombre premier afin d'éviter la redondance dans les clés
			int hashNb = 23;
			int key = 0;
			for(int i = 0 ; i < tailleId ; i++)
			{
				key = key * hashNb + classType.id.charAt(i);
			}
			return key;
		}
}
