package tableTypes;

import java.util.ArrayList;

import tableInstancesVar.Var;
import tableTypesClassItems.ClassItem;

public class ClassType {
	
	public String id; // identificateur de la classe
	public String supClassId; // identificateur de la classe dont elle hérite éventuellement
	public ArrayList<ClassItem> items;//attributs et méthodes de la classe
	
	public ClassType(String id)
	{
		this.id = id;
	}
	
	public ClassType(String id, String supClassId)
	{
		this.id = id;
		this.supClassId = supClassId;
	}
	
	public ClassType(String id, ArrayList<ClassItem> classItems )
	{
		this.id = id;
		this.items = classItems;
	}
	
	public ClassType(String id, String supClassId, ArrayList<ClassItem> items)
	{
		this.id = id;
		this.supClassId = supClassId;
		this.items = items;
	}
	
}
