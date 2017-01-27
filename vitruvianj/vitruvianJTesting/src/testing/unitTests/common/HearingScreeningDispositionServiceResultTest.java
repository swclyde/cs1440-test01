package testing.unitTests.common;

import java.util.ArrayList;

import junit.framework.TestCase;

import org.junit.Test;

import testing.common.data.AddressData;
import testing.common.ppServiceResult.AlternateID;
import testing.common.ppServiceResult.HearingScreeningDispositionServiceResult;
import vitruvianJ.core.PathUtilities;
import vitruvianJ.serialization.xml.XmlFramework;


public class HearingScreeningDispositionServiceResultTest   extends TestCase {

	protected HearingScreeningDispositionServiceResult GetTestValue()
    {
		HearingScreeningDispositionServiceResult result = new HearingScreeningDispositionServiceResult();
        result.setAlternateIds(new ArrayList<AlternateID>());
        result.getAlternateIds().add(new AlternateID());
        result.getAlternateIds().add(new AlternateID());
        result.setCharmID(new Long(1000));
        result.setErrorMsg("errorMsg");
        result.setLeftDisposition("leftDisposition");
        result.setOriginatingProgram("originatingProgram");
        result.setProgramChildID(1000);
        result.setResultStatus("resultStatus");
        result.setRightDisposition("rightDisposition");
        result.setSoundField("soundField");
        return result;
    }
	@Test
	public void testHearingScreeningDispositionServiceResult()
	{
		HearingScreeningDispositionServiceResult hearingScreeningDispositionServiceResult = new HearingScreeningDispositionServiceResultTest().GetTestValue();
		 XmlFramework.Save(PathUtilities.GetAbsolutePath("HearingScreeningDispositionServiceResult.xml"), XmlFramework.Serialize(hearingScreeningDispositionServiceResult));
	}

}
