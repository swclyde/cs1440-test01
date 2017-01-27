package testing.unitTests.common;

import java.util.ArrayList;

import junit.framework.TestCase;

import org.junit.Test;


import testing.common.ppServiceResult.AlternateID;
import testing.common.ppServiceResult.HearingScreeningMCRServiceResult;
import testing.common.ppServiceResult.MostConclusiveResult;
import vitruvianJ.core.PathUtilities;
import vitruvianJ.serialization.xml.XmlFramework;



public class HearingScreeningMCRServiceResultTest   extends TestCase {

	protected HearingScreeningMCRServiceResult GetTestValue()
    {
		HearingScreeningMCRServiceResult result = new HearingScreeningMCRServiceResult();
        result.setAlternateIds(new ArrayList<AlternateID>());
        result.getAlternateIds().add(new AlternateID());
        result.getAlternateIds().add(new AlternateID());
        result.setCharmID(new Long(1000));
        result.setErrorMsg("errorMsg");
        result.setMostConclusiveResultList(new ArrayList<MostConclusiveResult>());
        result.getMostConclusiveResultList().add(new MostConclusiveResult());
        result.getMostConclusiveResultList().add(new MostConclusiveResult());
        result.setOriginatingProgram("originatingProgram");
        result.setProgramChildID(1000);
        result.setResultStatus("resultStatus");
        return result;
    }
	@Test
	public void testHearingScreeningMCRServiceResult()
	{
		HearingScreeningMCRServiceResult hearingScreeningMCRServiceResult = new HearingScreeningMCRServiceResultTest().GetTestValue();
		 XmlFramework.Save(PathUtilities.GetAbsolutePath("HearingScreeningMCRServiceResult.xml"), XmlFramework.Serialize(hearingScreeningMCRServiceResult));
	}

}
