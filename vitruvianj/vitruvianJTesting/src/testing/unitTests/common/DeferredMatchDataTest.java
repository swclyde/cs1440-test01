package testing.unitTests.common;

import junit.framework.TestCase;

import org.junit.Test;

import testing.common.data.DeferredMatchData;
import vitruvianJ.core.PathUtilities;
import vitruvianJ.serialization.xml.XmlFramework;


public class DeferredMatchDataTest   extends TestCase {

	protected DeferredMatchData GetTestValue()
    {
		DeferredMatchData result = new DeferredMatchData();
        result.setMatchDestCharmId(new Long(1000));
        result.setMatchingDegree("matchingDegree");
        result.setMatchingScore(new Double(1.23));
        result.setMatchSrcCharmId(new Long(1000));
        return result;
    }
	@Test
	public void testDeferredMatchData()
	{
		DeferredMatchData deferredMatchData = new DeferredMatchDataTest().GetTestValue();
		 XmlFramework.Save(PathUtilities.GetAbsolutePath("DeferredMatchData.xml"), XmlFramework.Serialize(deferredMatchData));
	}

}
