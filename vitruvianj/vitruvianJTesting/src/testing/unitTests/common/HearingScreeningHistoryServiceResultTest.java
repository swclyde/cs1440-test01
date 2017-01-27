package testing.unitTests.common;

import java.util.ArrayList;

import junit.framework.TestCase;

import org.junit.Test;

import testing.common.data.AddressData;
import testing.common.ppServiceResult.AlternateID;
import testing.common.ppServiceResult.HearingScreeningHistoryServiceResult;
import vitruvianJ.core.PathUtilities;
import vitruvianJ.serialization.xml.XmlFramework;


public class HearingScreeningHistoryServiceResultTest   extends TestCase {

	protected HearingScreeningHistoryServiceResult GetTestValue()
    {
	    HearingScreeningHistoryServiceResult result = new HearingScreeningHistoryServiceResult();
        result.setAlternateIds(new ArrayList<AlternateID>());
        result.getAlternateIds().add(new AlternateID());
        result.getAlternateIds().add(new AlternateID());
        result.setCharmID(new Long(1000));
        result.setErrorMsg("errorMsg");
        result.setOriginatingProgram("originatingProgram");
        result.setProgramChildID(1000);
        result.setResultStatus("resultStatus");
        result.setTestList(new ArrayList<testing.common.ppServiceResult.Test>());
        result.getTestList().add(new testing.common.ppServiceResult.Test());
        result.getTestList().add(new testing.common.ppServiceResult.Test());
        return result;
    }
	@Test
	public void testHearingScreeningHistoryServiceResult()
	{
		HearingScreeningHistoryServiceResult hearingScreeningHistoryServiceResult = new HearingScreeningHistoryServiceResultTest().GetTestValue();
		 XmlFramework.Save(PathUtilities.GetAbsolutePath("HearingScreeningHistoryServiceResult.xml"), XmlFramework.Serialize(hearingScreeningHistoryServiceResult));
	}

}
