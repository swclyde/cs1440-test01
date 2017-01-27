package testing.unitTests.common;

import java.util.ArrayList;

import junit.framework.TestCase;

import org.junit.Test;

import testing.common.data.AddressData;
import testing.common.ppServiceResult.AlternateID;
import testing.common.ppServiceResult.HearingScreeningStatusServiceResult;
import testing.common.ppServiceResult.MostConclusiveResult;
import vitruvianJ.core.PathUtilities;
import vitruvianJ.serialization.xml.XmlFramework;


public class HearingScreeningStatusServiceResultTest   extends TestCase {

	protected HearingScreeningStatusServiceResult GetTestValue()
    {
		HearingScreeningStatusServiceResult result = new HearingScreeningStatusServiceResult();
        result.setAlternateIds(new ArrayList<AlternateID>());
        result.getAlternateIds().add(new AlternateID());
        result.getAlternateIds().add(new AlternateID());
        result.setCharmID(new Long(1000));
        result.setErrorMsg("errorMsg");
        result.setLeftDisposition("leftDisposition");
        result.setMostConclusiveResultList(new ArrayList<MostConclusiveResult>());
        result.getMostConclusiveResultList().add(new MostConclusiveResult());
        result.getMostConclusiveResultList().add(new MostConclusiveResult());
        result.setOriginatingProgram("originatingProgram");
        result.setProgramChildID(1000);
        result.setResultStatus("resultStatus");
        result.setRightDisposition("rightDisposition");
        result.setSoundField("soundField");
        return result;
    }
	@Test
	public void testHearingScreeningStatusServiceResult()
	{
		HearingScreeningStatusServiceResult hearingScreeningStatusServiceResult = new HearingScreeningStatusServiceResultTest().GetTestValue();
		 XmlFramework.Save(PathUtilities.GetAbsolutePath("HearingScreeningStatusServiceResult.xml"), XmlFramework.Serialize(hearingScreeningStatusServiceResult));
	}

}
