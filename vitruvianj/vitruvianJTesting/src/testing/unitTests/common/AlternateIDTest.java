package testing.unitTests.common;

import junit.framework.TestCase;

import org.junit.Test;


import testing.common.ppServiceResult.AlternateID;
import vitruvianJ.core.PathUtilities;
import vitruvianJ.serialization.xml.XmlFramework;



public class AlternateIDTest  extends TestCase {

	protected AlternateID GetTestValue()
    {
		AlternateID result = new AlternateID();
        result.setType("type");
        result.setValue("value");
        return result;
    }
	@Test
	public void testAlternateID()
	{
		AlternateID alternateID = new AlternateIDTest().GetTestValue();
		 XmlFramework.Save(PathUtilities.GetAbsolutePath("AlternateID.xml"), XmlFramework.Serialize(alternateID));
	}

}
