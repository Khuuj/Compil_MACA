package tableTypes;

import java.util.ArrayList;

import tableInstances.Var;

public class ClassType {
	
	public String id; // identificateur de la classe
	String supClassId; // identificateur de la classe dont elle hérite éventuellement
	ArrayList<ClassItem> items;//attributs et méthodes de la classe
	
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