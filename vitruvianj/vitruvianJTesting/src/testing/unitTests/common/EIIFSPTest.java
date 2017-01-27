package testing.unitTests.common;

import java.util.ArrayList;

import junit.framework.TestCase;

import org.junit.Test;


import testing.common.ppServiceResult.EIIFSP;
import testing.common.ppServiceResult.IFSPService;
import vitruvianJ.core.PathUtilities;
import vitruvianJ.serialization.xml.XmlFramework;



public class EIIFSPTest   extends TestCase {

	protected EIIFSP GetTestValue()
    {
		EIIFSP result = new EIIFSP();
        result.setEndDate("endDate");
        result.setIFSPServiceList(new ArrayList<IFSPService>());
        result.getIFSPServiceList().add(new IFSPService());
        result.getIFSPServiceList().add(new IFSPService());
        result.setStartDate("startDate");
        return result;
    }
	@Test
	public void testEIIFSP()
	{
		EIIFSP eIIFSP = new EIIFSPTest().GetTestValue();
		 XmlFramework.Save(PathUtilities.GetAbsolutePath("EIIFSP.xml"), XmlFramework.Serialize(eIIFSP));
	}

}
