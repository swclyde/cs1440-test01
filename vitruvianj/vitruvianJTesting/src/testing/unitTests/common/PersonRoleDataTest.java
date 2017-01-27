package testing.unitTests.common;

import junit.framework.TestCase;

import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import testing.common.data.PersonRoleData;
import vitruvianJ.core.PathUtilities;
import vitruvianJ.serialization.xml.XmlFramework;
import vitruvianJ.serialization.xml.XmlSerializer;



public class PersonRoleDataTest   extends TestCase {

	protected PersonRoleData GetTestValue()
    {
		PersonRoleData result = new PersonRoleData();
        result.setChildCharmId(new Long(1000));
        result.setEndDate("endDate");
        result.setPersonCharmId(new Long(1000));
        result.setPersonRoleId(new Long(1000));
        result.setRoleTypeId(new Long(1000));
        result.setStartDate("startDate");
        result.setRoleTypeId(null);
        return result;
    }
	@Test
	public void testPersonRoleData()
	{
		PersonRoleData personRoleData = new PersonRoleDataTest().GetTestValue();
		 XmlFramework.Save(PathUtilities.GetAbsolutePath("PersonRoleData.xml"), XmlFramework.Serialize(personRoleData));
	}
	
	@Test
	public void testNullValueException()
	{
		
		PersonRoleData personRoleData = (PersonRoleData) XmlFramework.Deserialize(PathUtilities.GetAbsolutePath("PersonRoleData.xml"));
		Long charmId = personRoleData.getPersonCharmId();
	}
	@Test
	public void testInvocationTargetException()
	{
		//protected void Serialize(Document document, Node node, Object value, References references)
		PersonRoleData personData = GetTestValue();
		XmlSerializer serializer = new XmlSerializer();
		Document doc = XmlFramework.Serialize(personData);
		Node node = doc.getFirstChild();
		Object obj = personData;		
		serializer.Serialize(doc, node, obj, null);
	}

}
