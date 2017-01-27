package testing.common.data.doNotSerialize;
import static org.junit.Assert.assertEquals;
import junit.framework.TestCase;

import org.junit.Test;

import testing.common.data.*;
import vitruvianJ.core.PathUtilities;
import vitruvianJ.serialization.xml.XmlFramework;

public class AddressDataTest  extends TestCase {

	protected MyAddressData GetTestValue()
    {
        MyAddressData result = new MyAddressData();
        result.setAddressid(new Long(1000));      
        result.setCharmid(new Long(1500));
        result.setCity("city");        
        result.setLine("line");        
        result.setZip("zip");        

        return result;
    }
	
	@Test
	public void testAddressDataSerialize()
	{
		MyAddressData addressData = new AddressDataTest().GetTestValue();
		 XmlFramework.Save(PathUtilities.GetAbsolutePath("MyAddressData.xml"), XmlFramework.Serialize(addressData));
	}
	
	@Test
	public void testAddressDataDontSerialize()
	{
		String filename_deserialize = PathUtilities.GetAbsolutePath("MyAddressData.xml");
        XmlFramework.AddTypeChange("MyAddressData", AddressData.class);                
        MyAddressData address_data = (MyAddressData)XmlFramework.Deserialize(filename_deserialize);       
        assertEquals(address_data.getAddressid(),new Long(1000));
        assertEquals(address_data.getCharmid(),new Long(1500));
        assertEquals(address_data.getLine(),null);        
        assertEquals(address_data.getCity(),"city");
        assertEquals(address_data.getZip(),"zip");			                        		
    }   
}
