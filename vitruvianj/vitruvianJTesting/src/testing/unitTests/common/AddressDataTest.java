package testing.unitTests.common;
import junit.framework.Assert;
import junit.framework.TestCase;

import org.junit.Test;

import testing.common.data.*;
import testing.common.util.Utilities;
import vitruvianJ.core.PathUtilities;
import vitruvianJ.serialization.xml.XmlFramework;

public class AddressDataTest  extends TestCase {

	protected AddressData GetTestValue()
    {
        AddressData result = new AddressData();
        result.setAddressid(new Long(1000));
        result.setCaseCertifiedFlag(true);
        result.setCharmid(new Long(1500));
        result.setCity("my city");
        result.setCorrected(true);
        result.setDeliveryText("deliveryText");
        result.setDoNotReleaseFlag(false);
        result.setEndDate("endDate");
        result.setLatitude("latitude");
        result.setLine1("line1");
        result.setLine2("line2");
        result.setLongitude("longitude");
        result.setNon_us_address_text("non_us_address_text");
        result.setNote("note");
        result.setStartDate("startDate");
        result.setUsStateCode("usStateCode");
        result.setZip4("my zip4");
        result.setZip5("my zip5");

        return result;
    }
	
	@Test
	public void testAddressData()
	{
		AddressData addressData = new AddressDataTest().GetTestValue();
		 XmlFramework.Save(PathUtilities.GetAbsolutePath("AddressData_082012Xml.xml"), XmlFramework.Serialize(addressData));
	}
	
	@Test
	public void testAddressDataDeserialize()
	{
		String filename_deserialize = PathUtilities.GetAbsolutePath("AddressData_082012Xml.xml");
	    AddressData result = (AddressData)XmlFramework.Deserialize(filename_deserialize);	        
	    Assert.assertEquals("line1",result.getLine1());
	    Assert.assertEquals("my zip4",result.getZip4());
	}
}
