package testing.serializationTesting;

import java.util.ArrayList;

import junit.framework.Assert;

import org.junit.Test;


import testing.common.data.AddressData;
import testing.common.ppQueryResult.QueryResult;
import testing.common.ppServiceResult.PersonServiceResult;
import testing.common.ppServiceResult.ServiceResult;
import testing.common.userprofile.UDPClientProfile;
import vitruvianJ.core.PathUtilities;
import vitruvianJ.serialization.xml.XmlFramework;

import org.junit.Test;
	
public class TestQueryResult {

	QueryResult GetTestValue()
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
	public void testSerialization_T02()
	{
		QueryResult queryResult = new TestQueryResult().GetTestValue();
		 XmlFramework.Save(PathUtilities.GetAbsolutePath("QueryResult.xml"), XmlFramework.Serialize(queryResult));
	}

	
	@Test
    //Test for primitive object
    public void testDeserialization_T01()
    {      
	String filename_deserialize = PathUtilities.GetAbsolutePath("QueryResult.xml");
    XmlFramework.AddTypeChange("QueryResult", QueryResult.class);                
    QueryResult result = (QueryResult)XmlFramework.Deserialize(filename_deserialize);
    Assert.assertEquals("errorMsg", result.getErrorMsg());
    Assert.assertNotNull(result.getPersonSR());
    Assert.assertEquals(new Integer(1000), result.getProgramChildID());
    Assert.assertEquals("resultStatus" , result.getResultStatus());
    Assert.assertNotNull(result.getServiceResultList());
    }
	
}
