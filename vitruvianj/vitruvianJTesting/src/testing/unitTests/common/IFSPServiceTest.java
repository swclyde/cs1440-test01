package testing.unitTests.common;

import junit.framework.TestCase;

import org.junit.Test;

import testing.common.data.AddressData;
import testing.common.ppServiceResult.IFSPService;
import vitruvianJ.core.PathUtilities;
import vitruvianJ.serialization.xml.XmlFramework;


public class IFSPServiceTest   extends TestCase {

	protected IFSPService GetTestValue()
    {
		IFSPService result = new IFSPService();
        result.setEndDate("endDate");
        result.setServiceCategory("serviceCategory");
        result.setStartDate("startDate");
        return result;
    }
	@Test
	public void testIFSPService()
	{
		IFSPService iFSPService = new IFSPServiceTest().GetTestValue();
		 XmlFramework.Save(PathUtilities.GetAbsolutePath("IFSPService.xml"), XmlFramework.Serialize(iFSPService));
	}

}
