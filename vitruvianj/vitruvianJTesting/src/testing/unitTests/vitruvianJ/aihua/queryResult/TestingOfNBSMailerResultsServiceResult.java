package testing.unitTests.vitruvianJ.aihua.queryResult;

import junit.framework.Assert;

import org.junit.Test;

import testing.common.ppQueryResult.QueryResult;
import testing.common.ppServiceResult.AlternateID;
import testing.common.ppServiceResult.NbsMailerResultsServiceResult;
import testing.common.ppServiceResult.NbsResult;
import testing.common.util.Utilities;
import vitruvianJ.core.PathUtilities;
import vitruvianJ.serialization.xml.XmlFramework;



public class TestingOfNBSMailerResultsServiceResult {

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
		String filename_deserialize = PathUtilities.GetAbsolutePath("nbsmailerresultsserviceresult-aihua.xml");
		//NbsMailerResultsServiceResult result = (NbsMailerResultsServiceResult)Utilities.GetDeserializer().Deserialize(XmlFramework.DeserializeToDoc(filename_deserialize));
	    XmlFramework.AddTypeChange("NbsMailerResultsServiceResult", NbsMailerResultsServiceResult.class);                
	    NbsMailerResultsServiceResult result = (NbsMailerResultsServiceResult)XmlFramework.Deserialize(filename_deserialize);
	    
	    NbsResult nbs_result =  result.getNbsResultList().get(0);
	    
	    Assert.assertEquals(new String("F"),nbs_result.getGender());
	    Assert.assertEquals(new String("592A653"),nbs_result.getNewBornScreeningNumber());
	    Assert.assertEquals("SALT LAKE CITY", nbs_result.getCity());
	    Assert.assertEquals("BRIANNA", nbs_result.getFirstName());
	    Assert.assertEquals("BRACAMONTES", nbs_result.getLastName());
	    Assert.assertEquals("2011/05/08", nbs_result.getBirthDate());
	    //Assert.assertEquals("GUERRERO", nbs_result.getMomLastName());
	    //Assert.assertEquals("GEORGINA", nbs_result.getMomFirstName());
	    Assert.assertEquals("FIRST", nbs_result.getSpecimenType());
	    Assert.assertEquals("F1330041201170", nbs_result.getTextID());
	    Assert.assertEquals("2011/05/10", nbs_result.getDateCollected());
	    Assert.assertEquals("2011/05/13", nbs_result.getDateReceived());
	    Assert.assertEquals("020307319", nbs_result.getChartNumber());
	    Assert.assertEquals("2011/05/14", nbs_result.getDateCompleted());
	    Assert.assertEquals("2011/05/14", nbs_result.getEnteredOn());
	    Assert.assertEquals("Normal", nbs_result.getFormatedEntry());
	    Assert.assertEquals("AMINO", nbs_result.getAnalysis());
	    Assert.assertEquals("A", nbs_result.getTestStatus());
	    Assert.assertEquals("4023725", nbs_result.getTestNumber());
	    //Assert.assertEquals(null, nbs_result.getRptTestComment());
	    Assert.assertEquals("1435436", nbs_result.getOriginalSample());
	    Assert.assertEquals("1435437", nbs_result.getSampleNumber());
	    Assert.assertEquals("Determination", nbs_result.getResName());
	    Assert.assertEquals(null, nbs_result.getReviewNote());
	    //Assert.assertEquals("ATTN  MEDREC TEAM", nbs_result.getContactName());
	    Assert.assertEquals("UNIVERSITY OF UTAH HSC", nbs_result.getOrganization());
	    Assert.assertEquals("50 N MEDICAL DR", nbs_result.getStreetAddress());
	    Assert.assertEquals("84132-0001", nbs_result.getZip());	    
	    Assert.assertEquals("UT", nbs_result.getState());	    	   
	    Assert.assertEquals(null, result.getProgramChildID());
	    Assert.assertEquals("SUCCESS" , result.getResultStatus());
	    Assert.assertEquals(new Long(5384190),result.getCharmID());
	    AlternateID alt_id =  result.getAlternateIds().get(0);
	    Assert.assertEquals("592A653",alt_id.getValue());
	    Assert.assertEquals("NBS",alt_id.getType());
    }
    
}
