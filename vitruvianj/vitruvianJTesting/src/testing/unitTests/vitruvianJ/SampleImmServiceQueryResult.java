package testing.unitTests.vitruvianJ;

import java.util.ArrayList;

import testing.common.data.PersonData;
import testing.common.data.PhoneData;
import testing.common.ppQueryResult.QueryResult;
import testing.common.ppServiceResult.ImmunizationEvent;
import testing.common.ppServiceResult.ImmunizationHistoryServiceResult;
import testing.common.ppServiceResult.PersonServiceResult;
import testing.common.ppServiceResult.ServiceResult;



/// <summary>
/// Summary description for Class1
/// </summary>
public class SampleImmServiceQueryResult
{
    public QueryResult testQueryBuilder()
    {
        //== BUILD THE IMMUNIZATION QUERY RESULT
        QueryResult immunizationQueryResult = new QueryResult();
        
        immunizationQueryResult.setResultStatus(QueryResult.STAUS_SUCCESS);
        immunizationQueryResult.setPersonSR(buildPersonServiceResult()) ;
        immunizationQueryResult.setServiceResultList(buildServiceResultList());
        immunizationQueryResult.setErrorMsg("msg_ali");
        //== USE VITRUVIAN TO SERIALIZE THE immunizationQueryResult OBJECT AND PRODUCE A XML OUTPUT 
        return immunizationQueryResult;

    }

    private ArrayList<ServiceResult> buildServiceResultList()
    {
    	ArrayList<ServiceResult> serviceResultList = new ArrayList<ServiceResult>();

        ImmunizationHistoryServiceResult immHistorySR = new ImmunizationHistoryServiceResult();
        immHistorySR.setOriginatingProgram(ServiceResult.PROGRAM_EHDI);
        immHistorySR.setResultStatus(ServiceResult.STATUS_SUCCESS);
        immHistorySR.setImmunizationEventList(new ArrayList<ImmunizationEvent>());

        ImmunizationEvent event1 = new ImmunizationEvent();
        event1.setEventDate("2006-01-25 00:00:00.0");
        event1.setProviderName("SOUTHWEST HD - ST. GEORGE");
        event1.setVaccineCode("20");
        event1.setVaccineComponentNo(new Long(0));
        event1.setVaccineName("DTaP");
        event1.setVaccineSeriesName("DTP");

        ImmunizationEvent event2 = new ImmunizationEvent();
        event2.setEventDate("2003-01-13 00:00:00.0");
        event2.setVaccineCode("50");
        event2.setVaccineComponentNo(new Long(1));
        event2.setVaccineName("DTaP-H1B");
        event2.setVaccineSeriesName("DTP");

        ImmunizationEvent event3 = new ImmunizationEvent();
        event3.setEventDate("2002-05-12 00:00:00.0");
        event3.setVaccineCode("100");
        event3.setVaccineComponentNo(new Long(0));
        event3.setVaccineName("(PCV7) PNEUMOCOCCAL CONJUGATE");
        event3.setVaccineSeriesName("PNEUMO PCV-7");

        immHistorySR.getImmunizationEventList().add(event1);
        immHistorySR.getImmunizationEventList().add(event2);
        immHistorySR.getImmunizationEventList().add(event3);

        serviceResultList.add(immHistorySR);

        return serviceResultList;
    }


    private PersonServiceResult buildPersonServiceResult()
    {
        PersonServiceResult personsr = new PersonServiceResult();
        personsr.setOriginatingProgram(ServiceResult.PROGRAM_CHARMCORE);
        personsr.setResultStatus(ServiceResult.STATUS_SUCCESS);
        personsr.setPerson(buildPersonData());  
        
        return personsr;
    }

    private PersonData buildPersonData()
    {
        PersonData personData = new PersonData();
        
        personData.setIsadult(false);
        personData.setFirstname("Logan");
        
        personData.setLastname("Bowen");
        personData.setGender("M");
        personData.setBirthdate("1980/05/24");
        personData.setStateFileNumber("2007  01789 ");
        personData.setSsn("529033489");
        personData.setBirthUtahCountyId((short)29);
        personData.setBirthUsStateCode("UT");
        personData.setBirthCountryId(221);
        personData.setBirthCity("OGDEN");
        personData.setBirthWeightGrams((short)2508);
        personData.setBirthWeightOz((short)88);
        personData.setBirthFacilityCode("141");
         
        PhoneData phone1 = new PhoneData();
        phone1.setPhone("4355551234");
        phone1.setStartDate("2009/01/01");
        
        PhoneData phone2 = new PhoneData();
        phone2.setPhone("8012345643");
		
        personData.getPhone().add(phone1);
        personData.getPhone().add(phone2);

        return personData;
    }

}

