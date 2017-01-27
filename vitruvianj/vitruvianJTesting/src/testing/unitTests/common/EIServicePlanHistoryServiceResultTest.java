package testing.unitTests.common;

import java.util.ArrayList;

import junit.framework.TestCase;

import org.junit.Test;

import testing.common.data.AddressData;
import testing.common.ppServiceResult.AlternateID;
import testing.common.ppServiceResult.EIIFSP;
import testing.common.ppServiceResult.EIServicePlanHistoryServiceResult;
import vitruvianJ.core.PathUtilities;
import vitruvianJ.serialization.xml.XmlFramework;


public class EIServicePlanHistoryServiceResultTest   extends TestCase {

	protected EIServicePlanHistoryServiceResult GetTestValue()
    {
		EIServicePlanHistoryServiceResult result = new EIServicePlanHistoryServiceResult();
        result.setAlternateIds(new ArrayList<AlternateID>());
        result.getAlternateIds().add(new AlternateID());
        result.getAlternateIds().add(new AlternateID());
        result.setCharmID(new Long(1000));
        result.setErrorMsg("errorMsg");
        result.setIFSPList(new ArrayList<EIIFSP>());
        result.getIFSPList().add(new EIIFSP());
        result.getIFSPList().add(new EIIFSP());
        result.setOriginatingProgram("originatingProgram");
        result.setProgramChildID(1000);
        result.setResultStatus("resultStatus");
        return result;
    }
	@Test
	public void testEIServicePlanHistoryServiceResult()
	{
		EIServicePlanHistoryServiceResult eIServicePlanHistoryServiceResult = new EIServicePlanHistoryServiceResultTest().GetTestValue();
		 XmlFramework.Save(PathUtilities.GetAbsolutePath("EIServicePlanHistoryServiceResult.xml"), XmlFramework.Serialize(eIServicePlanHistoryServiceResult));
	}

}
