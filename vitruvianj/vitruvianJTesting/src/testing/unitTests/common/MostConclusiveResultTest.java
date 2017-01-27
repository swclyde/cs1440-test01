package testing.unitTests.common;

import junit.framework.TestCase;

import org.junit.Test;

import testing.common.data.AddressData;
import testing.common.ppServiceResult.MostConclusiveResult;
import vitruvianJ.core.PathUtilities;
import vitruvianJ.serialization.xml.XmlFramework;


public class MostConclusiveResultTest   extends TestCase {

	protected MostConclusiveResult GetTestValue()
    {
		MostConclusiveResult result = new MostConclusiveResult();
        result.setTestDate("testDate");
        result.setTestResultDescription("testResultDescription");
        result.setTestTypeDescription("testTypeDescription");
        result.setUsedMethod("usedMethod");
        return result;
    }
	@Test
	public void testMostConclusiveResult()
	{
		MostConclusiveResult mostConclusiveResult = new MostConclusiveResultTest().GetTestValue();
		 XmlFramework.Save(PathUtilities.GetAbsolutePath("MostConclusiveResult.xml"), XmlFramework.Serialize(mostConclusiveResult));
	}

}
