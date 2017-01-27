package testing.serializationTesting;

import javax.activation.MailcapCommandMap;

import junit.framework.Assert;

import org.junit.Test;

import testing.common.data.PersonData;
import testing.common.ppQueryResult.QueryResult;
import testing.common.ppServiceResult.AlertServiceResult;
import testing.common.ppServiceResult.AlternateID;
import testing.common.ppServiceResult.NbsMailerResultsServiceResult;
import testing.common.ppServiceResult.NbsResult;
import testing.common.ppServiceResult.PersonServiceResult;
import testing.common.ppServiceResult.ServiceResult;
import testing.common.util.Utilities;
import vitruvianJ.core.PathUtilities;
import vitruvianJ.serialization.xml.XmlFramework;



public class TestingOfNBSMailerResultsQuery {

	@Test
	public void testSerialization_T02()
	{
		
	}

	
	@Test
    //Test for primitive object
    public void testDeserialization_T01()
    {      
			String filename_deserialize = PathUtilities.GetAbsolutePath("nbsmailerresultsquery.xml");
			
		    //XmlFramework.AddTypeChange("QueryResult", QueryResult.class);                
		    QueryResult result = (QueryResult)Utilities.GetDeserializer().Deserialize(XmlFramework.DeserializeToDoc(filename_deserialize));
		    //XmlFramework.Deserialize(filename_deserialize);
		    
		    PersonData pr_result =  result.getPersonSR().getPerson();
		    
		    Assert.assertEquals(null,pr_result.getSuffix() );
		    Assert.assertEquals(new Boolean(false),pr_result.getIsadult() );
		    Assert.assertEquals(null,pr_result.getRoletypeid() );
		    Assert.assertEquals(new Long(5384190),pr_result.getCharmid() );
		    Assert.assertEquals("Brianna",pr_result.getFirstname() );
		    Assert.assertEquals("Bracamonte Guerrero",pr_result.getLastname() );
		    Assert.assertEquals("Iris",pr_result.getMiddlename() );
		    Assert.assertEquals(null,pr_result.getMaidenname() );
		    Assert.assertEquals("F",pr_result.getGender() );
		    Assert.assertEquals("2011/05/08",pr_result.getBirthdate() );
		    Assert.assertEquals(null,pr_result.getSsn() );
		    Assert.assertEquals(0,pr_result.getAddress().size() );
		    Assert.assertEquals(0,pr_result.getPhone().size() );
		    Assert.assertEquals(0,pr_result.getAssocPerson().size() );
		    Assert.assertEquals(new Short((short)122),pr_result.getBirthWeightOz() );
		    Assert.assertEquals(null,pr_result.getChpModifyUtcTimestamp() );
		    Assert.assertEquals(null,pr_result.getStartdate() );
		    Assert.assertEquals(null,pr_result.getEnddate() );
		    Assert.assertEquals(0,pr_result.getEmail().size() );
		    Assert.assertEquals("2011  19007",pr_result.getStateFileNumber().trim() );
		    Assert.assertEquals("592A653",pr_result.getNewBornScreeningNumber() );
		    Assert.assertEquals(new Short((short)18),pr_result.getBirthUtahCountyId() );
		    Assert.assertEquals(null,pr_result.getBirthUsStateCode() );
		    Assert.assertEquals(null,pr_result.getBirthCountryId() );
		    Assert.assertEquals("Salt Lake City",pr_result.getBirthCity() );
		    Assert.assertEquals(new Short((short)0),pr_result.getBirthOrder() );
		    Assert.assertEquals(new Short((short)3470) ,pr_result.getBirthWeightGrams() );
		    Assert.assertEquals(null ,pr_result.getMothersMaidenName() );
		    Assert.assertEquals(new Boolean(false) ,pr_result.getDeceasedFlag() );
		    Assert.assertEquals(null ,pr_result.getDeceasedDate() );
		    Assert.assertEquals("125",pr_result.getBirthFacilityCode() );
		    Assert.assertEquals(new Boolean(false) ,pr_result.getMultipleBirth() );
		    
		    
		    AlertServiceResult alert_sr = (AlertServiceResult)result.getServiceResultList().get(0) ;
		    Assert.assertEquals(0,alert_sr.getAlertList().size() );
		    Assert.assertEquals(new Long(5384190),alert_sr.getCharmID() );
		    Assert.assertEquals("CHARM_CORE",alert_sr.getOriginatingProgram() );
		    Assert.assertEquals("SUCCESS",alert_sr.getResultStatus() );
		    Assert.assertEquals(null,alert_sr.getErrorMsg() );
		    Assert.assertEquals(null,alert_sr.getProgramChildID() );
		    Assert.assertEquals(0 ,alert_sr.getAlternateIds().size() );
		    
		    NbsMailerResultsServiceResult nb_mailerService =  (NbsMailerResultsServiceResult)result.getServiceResultList().get(1);
		    NbsResult nbs_result =  nb_mailerService.getNbsResultList().get(0) ;
		    Assert.assertEquals("UT", nbs_result.getState() );
		    Assert.assertEquals("UNIVERSITY OF UTAH HSC", nbs_result.getOrganization() );
		    Assert.assertEquals("1435437", nbs_result.getSampleNumber() );
		    Assert.assertEquals("4023725", nbs_result.getTestNumber() );
		    Assert.assertEquals("F", nbs_result.getGender() );
		    Assert.assertEquals("SALT LAKE CITY", nbs_result.getCity() );
		    Assert.assertEquals("592A653", nbs_result.getNewBornScreeningNumber() );
		    Assert.assertEquals("BRACAMONTES", nbs_result.getLastName() );
		    Assert.assertEquals("BRIANNA", nbs_result.getFirstName() );
		    Assert.assertEquals("2011/05/08", nbs_result.getBirthDate() );
		    Assert.assertEquals("FIRST", nbs_result.getSpecimenType() );
		    Assert.assertEquals("F1330041201170", nbs_result.getTextID() );
		    Assert.assertEquals("2011/05/10", nbs_result.getDateCollected() );
		    Assert.assertEquals("2011/05/13", nbs_result.getDateReceived() );
		    Assert.assertEquals("020307319", nbs_result.getChartNumber() );
		    Assert.assertEquals("2011/05/14", nbs_result.getDateCompleted() );
		    Assert.assertEquals("2011/05/14", nbs_result.getEnteredOn() );
		    Assert.assertEquals("Normal", nbs_result.getFormatedEntry() );
		    Assert.assertEquals("AMINO",nbs_result.getAnalysis() );
		    Assert.assertEquals("A",nbs_result.getTestStatus() );
		    Assert.assertEquals("1435436",nbs_result.getOriginalSample() );
		    Assert.assertEquals("Determination",nbs_result.getResName() );
		    Assert.assertEquals(null,nbs_result.getReviewNote() );
		    Assert.assertEquals("50 N MEDICAL DR",nbs_result.getStreetAddress() );
	    

	    }
    
}
