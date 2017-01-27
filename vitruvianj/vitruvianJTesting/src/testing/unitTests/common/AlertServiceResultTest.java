package testing.unitTests.common;



import java.util.ArrayList;

import junit.framework.TestCase;

import org.junit.Test;
import org.w3c.dom.Document;


import testing.common.data.AlertData;
import testing.common.ppServiceResult.AlertServiceResult;
import testing.common.ppServiceResult.AlternateID;
import testing.common.util.Utilities;
import testing.unitTests.vitruvianJ.Type_Object;
import vitruvianJ.core.PathUtilities;
import vitruvianJ.serialization.xml.XmlDeserializer;
import vitruvianJ.serialization.xml.XmlFramework;
import vitruvianJ.serialization.xml.XmlSerializer;



public class AlertServiceResultTest  extends TestCase {

	protected AlertServiceResult GetTestValue()
    {
		
		AlertServiceResult result = new AlertServiceResult();
        result.setCharmID(new Long(1000));
        result.setErrorMsg("errorMsg");
        result.setOriginatingProgram("originatingProgram");
        result.setProgramChildID(new Integer(1000));
        result.setResultStatus("resultStatus");
        result.setAlertList(new ArrayList<AlertData>());
        AlertData data = new AlertData();
        /*
        data.setAlertcategory("alertcategory");
        data.setAlertdate("alertdate");
        data.setAlertid(new Long(1));
        data.setCharmid(new Long(1));
        data.setExpirationdate("expirationdate");
        data.setMessage("message");
        data.setOrigprogram("origprogram");
        data.setSeverity("severity");
        */
        result.getAlertList().add(data);
        result.getAlertList().add(new AlertData());
        result.setAlternateIds(new ArrayList<AlternateID>());
        result.getAlternateIds().add(new AlternateID());
        result.getAlternateIds().add(new AlternateID());

        return result;
    }
	
	@Test
	public void testAlertServiceResult()
	{
		XmlSerializer serializer = Utilities.GetSerializer();
		
		AlertServiceResult alertServiceResult = new AlertServiceResultTest().GetTestValue();
		Document doc = serializer.Serialize(alertServiceResult);
		 XmlFramework.Save(PathUtilities.GetAbsolutePath("AlertServiceResult.xml"), doc);
	}
	
	@Test
	public void testAlertServiceResult_Deserializer()
	{
		XmlDeserializer deserializer = Utilities.GetDeserializer();
		//XmlFramework.AddTypeChange("AlertServiceResult", AlertServiceResult.class);
		String filename_deserialize = PathUtilities.GetAbsolutePath("AlertServiceResult.xml");
		Document doc = XmlFramework.DeserializeToDoc(filename_deserialize);
		AlertServiceResult alertServiceResult = (AlertServiceResult)deserializer.Deserialize(doc);
        
        
        
        //AlertServiceResult alertServiceResult = (AlertServiceResult)XmlFramework.Deserialize(filename_deserialize);
        
        assertEquals(alertServiceResult.getAlertList().size(), 2);
        AlertData data = alertServiceResult.getAlertList().get(0);
        assertEquals(null, data.getAlertid());
        assertEquals(null, data.getCharmid());
        assertEquals(null, data.getAlertcategory());
        assertEquals(null, data.getSeverity());
        assertEquals(null, data.getOrigprogram());
        assertEquals(null, data.getMessage());
        assertEquals(null, data.getAlertdate());
        assertEquals(null, data.getExpirationdate());
        
        assertEquals("originatingProgram",alertServiceResult.getOriginatingProgram());
        assertEquals("resultStatus",alertServiceResult.getResultStatus());
        assertEquals("errorMsg",alertServiceResult.getErrorMsg());
        assertEquals(new Integer(1000),alertServiceResult.getProgramChildID());
        assertEquals(new Long(1000),alertServiceResult.getCharmID());
        
        assertEquals(2,alertServiceResult.getAlternateIds().size());

        AlternateID alternateID = alertServiceResult.getAlternateIds().get(0);
        assertEquals(null, alternateID.getType());
        assertEquals(null, alternateID.getType());        
	}

}
