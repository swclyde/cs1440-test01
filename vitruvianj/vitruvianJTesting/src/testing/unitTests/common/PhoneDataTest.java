package testing.unitTests.common;

import junit.framework.TestCase;

import org.junit.Test;

import testing.common.data.PhoneData;
import vitruvianJ.core.PathUtilities;
import vitruvianJ.serialization.xml.XmlFramework;


public class PhoneDataTest   extends TestCase {

	protected PhoneData GetTestValue()
    {
		PhoneData result = new PhoneData();
        result.setCharmid(new Long(1000));
        result.setDoNotReleaseFlag(true);
        result.setEndDate("endDate");
        result.setNote("note");
        result.setPhone("phone");
        result.setPhoneid(new Long(1000));
        result.setStartDate("startDate");
        return result;
    }
	@Test
	public void testPhoneData()
	{
		PhoneData phoneData = new PhoneDataTest().GetTestValue();
		 XmlFramework.Save(PathUtilities.GetAbsolutePath("PhoneData.xml"), XmlFramework.Serialize(phoneData));
	}

}
