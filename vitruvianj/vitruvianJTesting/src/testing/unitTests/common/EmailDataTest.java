package testing.unitTests.common;

import junit.framework.TestCase;

import org.junit.Test;

import testing.common.data.AddressData;
import testing.common.data.EmailData;
import vitruvianJ.core.PathUtilities;
import vitruvianJ.serialization.xml.XmlFramework;


public class EmailDataTest  extends TestCase {

	protected EmailData GetTestValue()
    {
		EmailData result = new EmailData();
        result.setCharmid(new Long(1000));
        result.setEmail("email");
        result.setEmailid(new Long(1000));
        return result;
    }
	@Test
	public void testEmailData()
	{
		EmailData emailData = new EmailDataTest().GetTestValue();
		 XmlFramework.Save(PathUtilities.GetAbsolutePath("EmailData.xml"), XmlFramework.Serialize(emailData));
	}

}
