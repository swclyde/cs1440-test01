package testing.unitTests.common;

import junit.framework.TestCase;

import org.junit.Test;

import testing.common.data.AddressData;
import testing.common.ppServiceResult.NbsResult;
import vitruvianJ.core.PathUtilities;
import vitruvianJ.serialization.xml.XmlFramework;


public class NbsResultTest   extends TestCase {

	protected NbsResult GetTestValue()
    {
		NbsResult result = new NbsResult();
        result.setAnalysis("analysis");
        result.setBirthDate("birthDate");
        result.setChartNumber("chartNumber");
        result.setCity("city");
        result.setDateCollected("dateCollected");
        result.setDateCompleted("dateCompleted");
        result.setDateReceived("dateReceived");
        result.setEnteredOn("enteredOn");
        result.setFirstName("firstName");
        result.setFormatedEntry("formatedEntry");
        result.setGender("gender");
        result.setLastName("lastName");
        result.setNewBornScreeningNumber("newBornScreeningNumber");
        result.setOrganization("organization");
        result.setOriginalSample("originalSample");
        result.setResName("resName");
        result.setReviewNote("reviewNote");
        result.setSampleNumber("sampleNumber");
        result.setSpecimenType("specimenType");
        result.setState("state");
        result.setStreetAddress("streetAddress");
        result.setTestNumber("testNumber");
        result.setTestStatus("testStatus");
        result.setTextID("textID");
        result.setZip("zip");
        return result;
    }
	@Test
	public void testNbsResult()
	{
		NbsResult nbsResult = new NbsResultTest().GetTestValue();
		 XmlFramework.Save(PathUtilities.GetAbsolutePath("NbsResult.xml"), XmlFramework.Serialize(nbsResult));
	}

}
