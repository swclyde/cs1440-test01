package testing.unitTests.common;

import junit.framework.TestCase;

import org.junit.Test;

import testing.common.data.AddressData;
import testing.common.data.OptData;
import vitruvianJ.core.PathUtilities;
import vitruvianJ.serialization.xml.XmlFramework;


public class OptDataTest   extends TestCase {

	protected OptData GetTestValue()
    {
		OptData result = new OptData();
        result.setCharmid(new Long(1000));
        result.setOptid(new Long(1000));
        result.setOpttype("opttype");
        result.setRequestingProgramGroupName("requestingProgramGroupName");
        result.setRequestingProgramName("requestingProgramName");
        result.setServiceGroupName("serviceGroupName");
        result.setServiceName("serviceName");
        return result;
    }
	@Test
	public void testOptData()
	{
		OptData optData = new OptDataTest().GetTestValue();
		 XmlFramework.Save(PathUtilities.GetAbsolutePath("OptData.xml"), XmlFramework.Serialize(optData));
	}

}
