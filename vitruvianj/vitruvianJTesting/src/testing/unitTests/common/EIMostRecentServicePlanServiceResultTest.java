package testing.unitTests.common;

import java.util.ArrayList;

import junit.framework.TestCase;

import org.junit.Test;


import testing.common.ppServiceResult.AlternateID;
import testing.common.ppServiceResult.EIIFSP;
import testing.common.ppServiceResult.EIMostRecentServicePlanServiceResult;
import vitruvianJ.core.PathUtilities;
import vitruvianJ.serialization.xml.XmlFramework;



public class EIMostRecentServicePlanServiceResultTest   extends TestCase {

	protected EIMostRecentServicePlanServiceResult GetTestValue()
    {
		EIMostRecentServicePlanServiceResult result = new EIMostRecentServicePlanServiceResult();
        result.setAlternateIds(new ArrayList<AlternateID>());
        result.getAlternateIds().add(new AlternateID());
        result.getAlternateIds().add(new AlternateID());
        result.setCharmID(new Long(1000));
        result.setErrorMsg("errorMsg");
        result.setMostRecentIFSP(new EIIFSP());
        result.setOriginatingProgram("originatingProgram");
        result.setProgramChildID(1000);
        result.setResultStatus("resultStatus");
        return result;
    }
	@Test
	public void testEIMostRecentServicePlanServiceResult()
	{
		EIMostRecentServicePlanServiceResult eIMostRecentServicePlanServiceResult = new EIMostRecentServicePlanServiceResultTest().GetTestValue();
		 XmlFramework.Save(PathUtilities.GetAbsolutePath("EIMostRecentServicePlanServiceResult.xml"), XmlFramework.Serialize(eIMostRecentServicePlanServiceResult));
	}

}
