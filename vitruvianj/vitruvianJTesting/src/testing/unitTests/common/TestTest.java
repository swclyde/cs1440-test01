package testing.unitTests.common;

import junit.framework.TestCase;

import org.junit.Test;

import vitruvianJ.core.PathUtilities;
import vitruvianJ.serialization.xml.XmlFramework;



public class TestTest   extends TestCase {

	protected testing.common.ppServiceResult.Test GetTestValue()
    {
		testing.common.ppServiceResult.Test result = new testing.common.ppServiceResult.Test();
        result.setBabyStage("babystage");
        result.setEar("ear");
        result.setFacilityName("facilityname");
        result.setScreenerName("screenername");
        result.setTestDate("testdate");
        result.setTestResultDescription("testresultdescription");
        result.setTestTypeDescription("testtypedescription");
        return result;
    }
	@Test
	public void testTest()
	{
		testing.common.ppServiceResult.Test test = new TestTest().GetTestValue();
		 XmlFramework.Save(PathUtilities.GetAbsolutePath("Test.xml"), XmlFramework.Serialize(test));
	}

}
