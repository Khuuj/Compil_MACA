package tableTypes;

import java.util.ArrayList;
import java.util.HashMap;

import tableInstances.Element;

/**
 * Classe représentant la TDS des classes définies.
 *
 */
@SuppressWarnings("serial")
public class TableClass extends HashMap<Integer,ArrayList<ClassType>>{
	
		/**
		 * Ajoute un élément et retourne si l'ajout a bien pu être fait ou non.
		 * 
		 * @param classType
		 */
		public void addClassType(ClassType classType)
		{
			int key = hash(classType);
			if (this.get(key) == null)
				this.put(key, new ArrayList<ClassType>());
			this.get(key).add(classType);
		}
		
		//Fonction qui calcule la clé d'un élément en fonction de son id
		public int hash(ClassType classType)
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
