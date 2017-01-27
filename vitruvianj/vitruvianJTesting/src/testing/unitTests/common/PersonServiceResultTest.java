package testing.unitTests.common;

import java.util.ArrayList;

import junit.framework.TestCase;

import org.junit.Test;


import testing.common.data.PersonData;
import testing.common.ppServiceResult.AlternateID;
import testing.common.ppServiceResult.PersonServiceResult;
import vitruvianJ.core.PathUtilities;
import vitruvianJ.serialization.xml.XmlFramework;



public class PersonServiceResultTest   extends TestCase {

	protected PersonServiceResult GetTestValue()
    {
		PersonServiceResult result = new PersonServiceResult();
        result.setAlternateIds(new ArrayList<AlternateID>());
        result.getAlternateIds().add(new AlternateID());
        result.getAlternateIds().add(new AlternateID());
        result.setCharmID(new Long(1000));
        result.setErrorMsg("errorMsg");
        result.setOriginatingProgram("originatingProgram");
        result.setPerson(new PersonData());
        result.setProgramChildID(1000);
        result.setResultStatus("resultStatus");
        return result;
    }
	@Test
	public void testPersonServiceResult()
	{
		PersonServiceResult personServiceResult = new PersonServiceResultTest().GetTestValue();
		 XmlFramework.Save(PathUtilities.GetAbsolutePath("PersonServiceResult.xml"), XmlFramework.Serialize(personServiceResult));
	}

}
