package testing.unitTests.common;

import java.util.ArrayList;

import junit.framework.TestCase;

import org.junit.Test;


import testing.common.ppServiceResult.AlternateID;
import testing.common.ppServiceResult.BirthRecordForOrsisServiceResult;
import vitruvianJ.core.PathUtilities;
import vitruvianJ.serialization.xml.XmlFramework;



public class BirthRecordForOrsisServiceResultTest  extends TestCase {

	protected BirthRecordForOrsisServiceResult GetTestValue()
    {
		BirthRecordForOrsisServiceResult result = new BirthRecordForOrsisServiceResult();
        result.setAdoptionChangeDate("adoptionChangeDate");
        result.setAdoptionFlag("adoptionFlag");
        result.setAdoptionType("adoptionType");
        result.setAlternateIds(new ArrayList<AlternateID>());
        result.getAlternateIds().add(new AlternateID());
        result.getAlternateIds().add(new AlternateID());
        result.setBirthDate("birthDate");
        result.setBirthFacility("birthFacility");
        result.setCharmID(new Long(1000));
        result.setCityOfBirth("cityOfBirth");
        result.setCountyOfBirth("countyOfBirth");
        result.setDadBirthDate("dadBirthDate");
        result.setDadBirthPlace("dadBirthPlace");
        result.setDadFirstName("dadFirstName");
        result.setDadHisp(true);
        result.setDadLastName("dadLastName");
        result.setDadMiddleName("dadMiddleName");
        result.setDadRace1Cd("dadRace1Cd");
        result.setDadRaceCd("dadRaceCd");
        result.setDadResCity("dadResCity");
        result.setDadResStatePC("dadResStatePC");
        result.setDadResStreet("dadResStreet");
        result.setDadResZip4("dadResZip4");
        result.setDadResZip5("dadResZip5");
        result.setDadSSN("dadSSN");
        result.setDadSuffix("dadSuffix");
        result.setDeceased(true);
        result.setErrorMsg("errorMsg");
        result.setFacilityCode("facilityCode");
        result.setFirstName("firstName");
        result.setGenderCd("genderCd");
        result.setLastName("lastName");
        result.setLegalNotes("legalNotes");
        result.setMiddleName("middleName");
        result.setMomAge(1000);
        result.setMomBirthDate("momBirthDate");
        result.setMomBirthplace("momBirthplace");
        result.setMomFirstName("momFirstName");
        result.setMomHisp(true);
        result.setMomLastName("momLastName");
        result.setMomLastPrior("momLastPrior");
        result.setMomMailCity("momMailCity");
        result.setMomMailStatePC("momMailStatePC");
        result.setMomMailStreet("momMailStreet");
        result.setMomMailZip4("momMailZip4");
        result.setMomMailZip5("momMailZip5");
        result.setMomMarried(true);
        result.setMomMedicaid(true);
        result.setMomMiddleName("momMiddleName");
        result.setMomRace1Cd("momRace1Cd");
        result.setMomRaceCd("momRaceCd");
        result.setMomSSN("momSSN");
        result.setOriginatingProgram("originatingProgram");
        result.setOrsAddDeleteDad("orsAddDeleteDad");
        result.setOrsDecreeDate("orsDecreeDate");
        result.setOvrsNotes1("ovrsNotes1");
        result.setOvrsNotes2("ovrsNotes2");
        result.setPaternityDate("paternityDate");
        result.setPaternityNotes("paternityNotes");
        result.setPaternityStatus("paternityStatus");
        result.setPaternityType("paternityType");
        result.setPaternVoluntary("paternVoluntary");
        result.setPlacedForAdoption(true);
        result.setProgramChildID(1000);
        result.setResultStatus("resultStatus");
        result.setSsn("ssn");
        result.setStateFileNumber("stateFileNumber");
        result.setSuffix("suffix");
        return result;
    }
	@Test
	public void testBirthRecordForOrsisServiceResult()
	{
		BirthRecordForOrsisServiceResult birthRecordForOrsisServiceResult = new BirthRecordForOrsisServiceResultTest().GetTestValue();
		 XmlFramework.Save(PathUtilities.GetAbsolutePath("BirthRecordForOrsisServiceResult.xml"), XmlFramework.Serialize(birthRecordForOrsisServiceResult));
	}

}
