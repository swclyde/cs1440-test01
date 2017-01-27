package testing.unitTests.common;

import java.util.ArrayList;

import junit.framework.TestCase;

import org.junit.Test;

import testing.common.data.AddressData;
import testing.common.ppServiceResult.AlternateID;
import testing.common.ppServiceResult.EIStatusServiceResult;
import vitruvianJ.core.PathUtilities;
import vitruvianJ.serialization.xml.XmlFramework;


public class EIStatusServiceResultTest  extends TestCase {

	protected EIStatusServiceResult GetTestValue()
    {
		EIStatusServiceResult result = new EIStatusServiceResult();
        result.setAlternateIds(new ArrayList<AlternateID>());
        result.getAlternateIds().add(new AlternateID());
        result.getAlternateIds().add(new AlternateID());
        result.setCharmID(new Long(1000));
        result.setEiEligibilityCategory("eiEligibilityCategory");
        result.setEiStatus("eiStatus");
        result.setErrorMsg("errorMsg");
        result.setMostRecentInitialReferralDate("mostRecentInitialReferralDate");
        result.setOriginatingProgram("originatingProgram");
        result.setProgramChildID(1000);
        result.setResultStatus("resultStatus");
        return result;
    }
	
	@Test
	public void testEIStatusServiceResult()
	{
		EIStatusServiceResult eIStatusServiceResult = new EIStatusServiceResultTest().GetTestValue();
		 XmlFramework.Save(PathUtilities.GetAbsolutePath("EIStatusServiceResult.xml"), XmlFramework.Serialize(eIStatusServiceResult));
	}

}
