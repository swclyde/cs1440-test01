package testing.unitTests.common;

import junit.framework.TestCase;

import org.junit.Test;

import testing.common.data.AddressData;
import testing.common.ppServiceResult.ImmunizationStatusData;
import vitruvianJ.core.PathUtilities;
import vitruvianJ.serialization.xml.XmlFramework;


public class ImmunizationStatusDataTest   extends TestCase {

	protected ImmunizationStatusData GetTestValue()
    {
		ImmunizationStatusData result = new ImmunizationStatusData();
        result.setContra("contra");
        result.setExempt("exempt");
        result.setNextDueDate("nextDueDate");
        result.setSeriesName("seriesName");
        result.setStatus("status");
        return result;
    }
	@Test
	public void testImmunizationStatusData()
	{
		ImmunizationStatusData immunizationStatusData = new ImmunizationStatusDataTest().GetTestValue();
		 XmlFramework.Save(PathUtilities.GetAbsolutePath("ImmunizationStatusData.xml"), XmlFramework.Serialize(immunizationStatusData));
	}

}
