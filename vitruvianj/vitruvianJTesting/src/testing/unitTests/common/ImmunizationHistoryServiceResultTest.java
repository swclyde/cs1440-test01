package testing.unitTests.common;

import java.util.ArrayList;

import junit.framework.TestCase;

import org.junit.Test;

import testing.common.data.AddressData;
import testing.common.ppServiceResult.AlternateID;
import testing.common.ppServiceResult.ImmunizationEvent;
import testing.common.ppServiceResult.ImmunizationHistoryServiceResult;
import vitruvianJ.core.PathUtilities;
import vitruvianJ.serialization.xml.XmlFramework;


public class ImmunizationHistoryServiceResultTest   extends TestCase {

	protected ImmunizationHistoryServiceResult GetTestValue()
    {
		ImmunizationHistoryServiceResult result = new ImmunizationHistoryServiceResult();
        result.setAlternateIds(new ArrayList<AlternateID>());
        result.getAlternateIds().add(new AlternateID());
        result.getAlternateIds().add(new AlternateID());
        result.setCharmID(new Long(1000));
        result.setErrorMsg("errorMsg");
        result.setImmunizationEventList(new ArrayList<ImmunizationEvent>());
        result.getImmunizationEventList().add(new ImmunizationEvent());
        result.getImmunizationEventList().add(new ImmunizationEvent());
        result.setOriginatingProgram("originatingProgram");
        result.setProgramChildID(1000);
        result.setResultStatus("resultStatus");
        return result;
    }
	@Test
	public void testImmunizationHistoryServiceResult()
	{
		ImmunizationHistoryServiceResult immunizationHistoryServiceResult = new ImmunizationHistoryServiceResultTest().GetTestValue();
		 XmlFramework.Save(PathUtilities.GetAbsolutePath("ImmunizationHistoryServiceResult.xml"), XmlFramework.Serialize(immunizationHistoryServiceResult));
	}

}
