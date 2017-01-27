package testing.unitTests.common;

import junit.framework.TestCase;

import org.junit.Test;

import testing.common.data.AliasData;
import vitruvianJ.core.PathUtilities;
import vitruvianJ.serialization.xml.XmlFramework;



public class AliasDataTest   extends TestCase {

	protected AliasData GetTestValue()
    {
		AliasData result = new AliasData();
        result.setAliasId(new Long(1000));
        result.setCharmId(new Long(1000));
        result.setFirstName("firstName");
        result.setLastName("lastName");
        result.setMiddleName("middleName");
        result.setSuffix("suffix");
        return result;
    }
	@Test
	public void testAliasData()
	{
		AliasData aliasData = new AliasDataTest().GetTestValue();
		 XmlFramework.Save(PathUtilities.GetAbsolutePath("AliasData.xml"), XmlFramework.Serialize(aliasData));
	}

}
