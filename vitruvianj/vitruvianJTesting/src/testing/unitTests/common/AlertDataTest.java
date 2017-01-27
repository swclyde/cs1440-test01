package testing.unitTests.common;

import junit.framework.TestCase;

import org.junit.Test;


import testing.common.data.AlertData;
import vitruvianJ.core.PathUtilities;
import vitruvianJ.serialization.xml.XmlFramework;


public class AlertDataTest extends TestCase {

	protected AlertData GetTestValue()
    {
		AlertData result = new AlertData();
        result.setAlertcategory("alertCategory");
        result.setAlertdate("alertDate");
        result.setAlertid(new Long(1000));
        result.setCharmid(new Long(1000));
        result.setExpirationdate("expirationdate");
        result.setMessage("message");
        result.setOrigprogram("origprogram");
        result.setSeverity("severity");
        return result;
    }
	@Test
	public void testAlertData()
	{
		AlertData alertData = new AlertDataTest().GetTestValue();
		 XmlFramework.Save(PathUtilities.GetAbsolutePath("AlertData.xml"), XmlFramework.Serialize(alertData));
	}

}
