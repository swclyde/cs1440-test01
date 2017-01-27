package testing.unitTests.common;

import junit.framework.TestCase;

import org.junit.Test;

import testing.common.data.AddressData;
import testing.common.userprofile.UDPClientProfile;
import vitruvianJ.core.PathUtilities;
import vitruvianJ.serialization.xml.XmlFramework;


public class UDPClientProfileTest   extends TestCase {

	protected UDPClientProfile GetTestValue()
    {
		UDPClientProfile result = new UDPClientProfile();

        result.setPassword("password");
        result.setPpName("ppName");
        result.setProgramID("programID");
        result.setRequestID("requestID");
        result.setTimestamp("timestamp");
        result.setUserLogin("userLogin");

        return result;
    }
	@Test
	public void testUDPClientProfile()
	{
		UDPClientProfile uDPClientProfile = new UDPClientProfileTest().GetTestValue();
		 XmlFramework.Save(PathUtilities.GetAbsolutePath("UDPClientProfile.xml"), XmlFramework.Serialize(uDPClientProfile));
	}

}
