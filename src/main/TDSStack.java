package main;

import java.util.ArrayList;

import tableInstances.Table;

public class TDSStack extends ArrayList<Table>{
	
	public Table remove(int tableIndex)
	{	
		BrowseTree.INSTANCE_TDS_PRINT = BrowseTree.INSTANCE_TDS_PRINT  + this.get(tableIndex).toString();
		return super.remove(tableIndex);
	}
}
