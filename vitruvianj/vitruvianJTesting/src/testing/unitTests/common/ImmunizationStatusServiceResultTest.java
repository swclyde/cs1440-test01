package testing.unitTests.common;

import java.util.ArrayList;

import junit.framework.TestCase;

import org.junit.Test;


import testing.common.ppServiceResult.AlternateID;
import testing.common.ppServiceResult.ImmunizationStatusData;
import testing.common.ppServiceResult.ImmunizationStatusServiceResult;
import vitruvianJ.core.PathUtilities;
import vitruvianJ.serialization.xml.XmlFramework;



public class ImmunizationStatusServiceResultTest   extends TestCase {

	protected ImmunizationStatusServiceResult GetTestValue()
    {
		ImmunizationStatusServiceResult result = new ImmunizationStatusServiceResult();
        result.setAlternateIds(new ArrayList<AlternateID>());
        result.getAlternateIds().add(new AlternateID());
        result.getAlternateIds().add(new AlternateID());
        result.setCharmID(new Long(1000));
        result.setErrorMsg("errorMsg");
        result.setImmunizationStatusList(new ArrayList<ImmunizationStatusData>());
        result.getImmunizationStatusList().add(new ImmunizationStatusData());
        result.getImmunizationStatusList().add(new ImmunizationStatusData());
        result.setOriginatingProgram("originatingProgram");
        result.setOverallStatus("overallStatus");
        result.setProgramChildID(1000);
        result.setResultStatus("resultStatus");
        return result;
    }
	@Test
	public void testImmunizationStatusServiceResult()
	{
		ImmunizationStatusServiceResult immunizationStatusServiceResult = new ImmunizationStatusServiceResultTest().GetTestValue();
		 XmlFramework.Save(PathUtilities.GetAbsolutePath("ImmunizationStatusServiceResult.xml"), XmlFramework.Serialize(immunizationStatusServiceResult));
	}

}
