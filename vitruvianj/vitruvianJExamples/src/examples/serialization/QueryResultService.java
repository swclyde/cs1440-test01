package examples.serialization;

import org.w3c.dom.Document;


import testing.common.ppQueryResult.QueryResult;
import vitruvianJ.core.PathUtilities;
import vitruvianJ.logging.GUID;
import vitruvianJ.logging.JGUID;
import vitruvianJ.serialization.xml.XmlFramework;
import vitruvianJ.services.IRunnable;

public class QueryResultService implements IRunnable{

	@Override
	public void Run() {
		// TODO Auto-generated method stub
		QueryResult queryResult =  new SampleImmServiceQueryResult().testQueryBuilder();
		 Document pointDoc = XmlFramework.Serialize(queryResult);        
		 XmlFramework.Save(PathUtilities.GetAbsolutePath("query_result.xml"), pointDoc);
		 System.out.println("===============Serialization completed successfully ==========================");		
	}

	@Override
	public void Cleanup() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public JGUID getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "QueryResultService";
	}

}
