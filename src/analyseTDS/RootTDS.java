package analyseTDS;

import java.util.ArrayList;

import main.BrowseTree;
import tableInstances.Table;
import tableTypes.TableClass;

public class RootTDS {

	public RootTDS()
	{
		BrowseTree.INSTANCE_TDS = new ArrayList<Table>();
		BrowseTree.INSTANCE_TDS.add(new Table());
		BrowseTree.CLASS_TDS = new TableClass();
	}
}
