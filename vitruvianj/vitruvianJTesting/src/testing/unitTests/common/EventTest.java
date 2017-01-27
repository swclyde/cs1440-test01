package testing.unitTests.common;

import junit.framework.TestCase;

import org.junit.Test;


import testing.common.ppServiceResult.Event;
import vitruvianJ.core.PathUtilities;
import vitruvianJ.serialization.xml.XmlFramework;



public class EventTest   extends TestCase {

	protected Event GetTestValue()
    {
		Event result = new Event();
        result.setConfidentialityRequirement("confidentialityRequirement");
        result.setEventDate("eventDate");
        result.setNote("note");
        return result;
    }
	@Test
	public void testEvent()
	{
		Event event = new EventTest().GetTestValue();
		 XmlFramework.Save(PathUtilities.GetAbsolutePath("Event.xml"), XmlFramework.Serialize(event));
	}

}
