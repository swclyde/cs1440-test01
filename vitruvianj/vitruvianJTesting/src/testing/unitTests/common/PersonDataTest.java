package testing.unitTests.common;

import java.util.ArrayList;

import junit.framework.TestCase;

import org.junit.Test;

import testing.common.data.AddressData;
import testing.common.data.EmailData;
import testing.common.data.PersonData;
import testing.common.data.PhoneData;
import vitruvianJ.core.PathUtilities;
import vitruvianJ.serialization.xml.XmlFramework;


public class PersonDataTest   extends TestCase {

	protected PersonData GetTestValue()
    {
		PersonData result = new PersonData();
        result.setAddress(new ArrayList<AddressData>());
        result.getAddress().add(new AddressData());
        result.getAddress().add(new AddressData());
        result.setAssocPerson(new ArrayList<PersonData>());
        result.getAssocPerson().add(new PersonData());
        result.getAssocPerson().add(new PersonData());
        result.setBirthCity("birthCity");
        result.setBirthCountryId(1000);
        result.setBirthdate("birthdate");
        result.setBirthFacilityCode("birthFacilityCode");
        result.setBirthOrder((short) 1000);
        result.setBirthUsStateCode("birthUsStateCode");
        result.setBirthUtahCountyId((short)1000);
        result.setBirthWeightGrams((short)1000);
        result.setBirthWeightOz((short)1000);
        result.setCharmid(new Long(1000));
        result.setChpModifyUtcTimestamp(new Long(1000));
        result.setDeceasedDate("deceasedDate");
        result.setDeceasedFlag(true);
        result.setEmail(new ArrayList<EmailData>());
        result.getEmail().add(new EmailData());
        result.getEmail().add(new EmailData());
        result.setEnddate("enddate");
        result.setFirstname("firstname");
        result.setGender("gender");
        result.setIsadult(true);
        result.setLastname("lastname");
        result.setMaidenname("maidenname");
        result.setMiddlename("middlename");
        result.setMothersMaidenName("mothersMaidenName");
        result.setMultipleBirth(true);
        result.setNewBornScreeningNumber("newBornScreeningNumber");
        result.setPhone(new ArrayList<PhoneData>());
        result.getPhone().add(new PhoneData());
        result.getPhone().add(new PhoneData());
        result.setRoletypeid(new Long(1000));
        //result.setSortName("sortName");
        result.setSsn("ssn");
        result.setStartdate("startdate");
        result.setStateFileNumber("stateFileNumber");
        result.setSuffix("suffix");
        return result;
    }
	@Test
	public void testPersonData()
	{
		PersonData personData = new PersonDataTest().GetTestValue();
		 XmlFramework.Save(PathUtilities.GetAbsolutePath("PersonData.xml"), XmlFramework.Serialize(personData));
		 
		  personData = (PersonData) XmlFramework.Deserialize("PersonData.xml");
	}

}
