package testing.unitTests.common;

import java.util.ArrayList;

import junit.framework.TestCase;

import org.junit.Test;


import testing.common.ppQueryResult.QueryResult;
import testing.common.ppServiceResult.PersonServiceResult;
import testing.common.ppServiceResult.ServiceResult;
import testing.common.userprofile.UDPClientProfile;
import vitruvianJ.core.PathUtilities;
import vitruvianJ.serialization.xml.XmlFramework;



public class QueryResultTest   extends TestCase {

	public QueryResult GetTestValue()
    {
		QueryResult result = new QueryResult();
        result.setErrorMsg("errorMsg");
        result.setPersonSR(new PersonServiceResult());
        result.setProgramChildID(1000);
        result.setResultStatus("resultStatus");
        result.setServiceResultList(new ArrayList<ServiceResult>());
        result.getServiceResultList().add(new ServiceResult());
        result.getServiceResultList().add(new ServiceResult());
        result.setUdpClientProfile(new UDPClientProfile());
        return result;
    }
	@Test
	public void testQueryResult()
	{
		QueryResult queryResult = new QueryResultTest().GetTestValue();
		 XmlFramework.Save(PathUtilities.GetAbsolutePath("QueryResult.xml"), XmlFramework.Serialize(queryResult));
	}

}
