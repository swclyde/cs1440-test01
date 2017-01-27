package testing.unitTests.vitruvianJ;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.w3c.dom.Document;

import testing.common.data.*;
import vitruvianJ.core.PathUtilities;
import vitruvianJ.serialization.xml.XmlFramework;
public class TestAddressData {

	public AddressData buildAddressData()
	{
		AddressData data = new AddressData();
		data.setDeliveryText("deliveryText");
		data.setNon_us_address_text("non_us_address_text");
		data.setLongitude("longitude");
		data.setLatitude("latitude");
		data.setCaseCertifiedFlag(true);
		data.setCorrected(true);
		data.setUsStateCode("usStateCode");
		data.setStartDate("startDate");
		data.setEndDate("endDate");
		data.setDoNotReleaseFlag(true);
		data.setNote("note");
		data.setAddressid(new Long(1000));
		data.setCharmid(new Long(1500));
		data.setLine1("line1");
		data.setLine2("line2");
		data.setCity("city");
		data.setZip5("zip5");
		data.setZip4("zip4");	
		return data;
	}
	
	@Test
    //Test for primitive object
    public void testSerialization_AddressDataT01()
    {            
		TestAddressData address_test = new TestAddressData();
		AddressData address_data = address_test.buildAddressData();
		Document pointDoc = XmlFramework.Serialize(address_data);
        //String s = XmlFramework.SerializeToString(pointDoc);
        //System.out.println(s);
        XmlFramework.Save(PathUtilities.GetAbsolutePath("TestAddressData_J.xml"), pointDoc);                		
    }                        
	
	@Test
    //Test for primitive object
    public void testDeserialization_AddressDataT01()
    {            
		
		String filename_deserialize = PathUtilities.GetAbsolutePath("TestAddressData_J.xml");
        XmlFramework.AddTypeChange("AddressData", AddressData.class);                
        AddressData address_data = (AddressData)XmlFramework.Deserialize(filename_deserialize);       
        assertEquals(address_data.getDeliveryText(),"deliveryText");
        assertEquals(address_data.getNon_us_address_text(),"non_us_address_text");
        assertEquals(address_data.getLongitude(),"longitude");
        assertEquals(address_data.getLatitude(),"latitude");
        assertEquals(address_data.getCaseCertifiedFlag(),true);
        assertEquals(address_data.getCorrected(),true);
        assertEquals(address_data.getUsStateCode(),"usStateCode");
        assertEquals(address_data.getStartDate(),"startDate");
        assertEquals(address_data.getEndDate(),"endDate");
        assertEquals(address_data.getDoNotReleaseFlag(),true);
        assertEquals(address_data.getNote(),"note");
        assertEquals(address_data.getAddressid(),new Long(1000));
        assertEquals(address_data.getCharmid(),new Long(1500));
        assertEquals(address_data.getLine1(),"line1");
        assertEquals(address_data.getLine2(),"line2");
        assertEquals(address_data.getCity(),"city");
        assertEquals(address_data.getZip5(),"zip5");
        assertEquals(address_data.getZip4(),"zip4");			                        		
    }   
}
