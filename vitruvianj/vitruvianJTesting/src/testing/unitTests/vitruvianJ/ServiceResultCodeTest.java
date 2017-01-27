package testing.unitTests.vitruvianJ;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import testing.common.data.PersonData;
import testing.common.data.PhoneData;
import testing.common.ppQueryResult.QueryResult;
import testing.common.ppServiceResult.AlertServiceResult;
import testing.common.ppServiceResult.AlternateID;
import testing.common.ppServiceResult.HearingScreeningDispositionServiceResult;
import testing.common.ppServiceResult.HearingScreeningHistoryServiceResult;
import testing.common.ppServiceResult.HearingScreeningMCRServiceResult;
import testing.common.ppServiceResult.ImmunizationEvent;
import testing.common.ppServiceResult.ImmunizationHistoryServiceResult;
import testing.common.ppServiceResult.ImmunizationStatusData;
import testing.common.ppServiceResult.ImmunizationStatusServiceResult;
import testing.common.ppServiceResult.PersonServiceResult;
import testing.common.ppServiceResult.ServiceResult;
import testing.common.util.Utilities;
import testing.unitTests.common.AlertServiceResultTest;
import vitruvianJ.*;
import vitruvianJ.core.PathUtilities;
import vitruvianJ.serialization.formatters.PathFormatter;
import vitruvianJ.serialization.formatters.TypeFormatter;
import vitruvianJ.serialization.xml.XmlDeserializer;
import vitruvianJ.serialization.xml.XmlFramework;
import vitruvianJ.serialization.xml.XmlSerializer;
import vitruvianJ.services.IService;
import vitruvianJ.services.ServiceRegistry;
import vitruvianJ.serialization.xml.*;



//import com.sun.org.apache.xerces.internal.dom.DocumentImpl;
//
//import com.sun.org.apache.xml.internal.serialize.OutputFormat;
//import com.sun.org.apache.xml.internal.serialize.XMLSerializer;


public class ServiceResultCodeTest  extends TestCase {

	
	//=== USE VITRUVIAN TO GENERATE THE QUERYRESULT OBJECT
	private QueryResult deserialize(String xmlfilename) {
		String filename = PathUtilities.GetAbsolutePath(xmlfilename);
        //XmlFramework.AddTypeChange("QueryResult", common.ppQueryResult.QueryResult.class);
        //QueryResult query_result = (QueryResult)XmlFramework.Deserialize(filename);
      //  return query_result;
        
        XmlDeserializer deserializer = Utilities.GetDeserializer();
		//XmlFramework.AddTypeChange("AlertServiceResult", AlertServiceResult.class);
		//String filename_deserialize = PathUtilities.GetAbsolutePath("AlertServiceResult.xml");
		Document doc = XmlFramework.DeserializeToDoc(filename);
		QueryResult query_result = (QueryResult)deserializer.Deserialize(doc);
		return query_result;
	}
	
		
	@Test
	public void test_serializeServiceResult()
	{
		QueryResult q_result = buildCharmQuery();   
		XmlSerializer serializer = Utilities.GetSerializer();						
		Document doc = serializer.Serialize(q_result);
		boolean status = XmlFramework.Save(PathUtilities.GetAbsolutePath("ServiceResultDataSet3.xml"), doc);// "ServiceResultCodeTestDataSet1.xml"), doc);
		assertTrue(status);
	}
	
	
	private QueryResult buildCharmQuery()
	{
		QueryResult q_result = new QueryResult();		
		q_result.setResultStatus("PARTIAL");
		q_result.setErrorMsg("Call to one or more of CHARM Agents failed.");
		q_result.setProgramChildID(null);
		
		PersonServiceResult person_sr =  new PersonServiceResult();		
		person_sr.setPerson(null);
		person_sr.setOriginatingProgram("CHARM_CORE");
		person_sr.setResultStatus("NOT_AVAILABLE");
		person_sr.setErrorMsg("Exeption in getting PersonServiceResult: CHARM_CORE agent not available.");
		person_sr.setProgramChildID(null);
		person_sr.setCharmID(new Long(3340348));
		person_sr.setAlternateIds(null);
		q_result.setPersonSR(person_sr);
		
		
		ArrayList<ServiceResult> s_result = new ArrayList<ServiceResult>();
		
		AlertServiceResult alert_s_result = new AlertServiceResult();
		alert_s_result.setOriginatingProgram("CHARM_CORE");
		alert_s_result.setResultStatus("SUCCESS");
		alert_s_result.setErrorMsg(null);
		alert_s_result.setProgramChildID(null);
		alert_s_result.setCharmID(new Long(3340348));
		alert_s_result.setAlternateIds(null);
		s_result.add(alert_s_result);		
		
		HearingScreeningHistoryServiceResult hshs_result = new HearingScreeningHistoryServiceResult(); 
		hshs_result.setOriginatingProgram("EHDI");
		hshs_result.setResultStatus("FAILURE");
		hshs_result.setErrorMsg("Mapping CharmID does not exist.");
		hshs_result.setProgramChildID(null);
		hshs_result.setCharmID(new Long(3340348));
		hshs_result.setAlternateIds(null);
		s_result.add(hshs_result);		
		
		HearingScreeningMCRServiceResult hs_mcrs_result = new HearingScreeningMCRServiceResult();
		hs_mcrs_result.setMostConclusiveResultList(null);
		hs_mcrs_result.setOriginatingProgram("EHDI");
		hs_mcrs_result.setResultStatus("FAILURE");
		hs_mcrs_result.setErrorMsg("Mapping CharmID does not exist.");
		hs_mcrs_result.setProgramChildID(null);
		hs_mcrs_result.setCharmID(new Long(3340348));
		hs_mcrs_result.setAlternateIds(null);
		s_result.add(hs_mcrs_result);
		
		ImmunizationHistoryServiceResult Ihs_result =  new ImmunizationHistoryServiceResult();
		Ihs_result.setImmunizationEventList(null);
		Ihs_result.setOriginatingProgram("USIIS");
		Ihs_result.setResultStatus("SUCCESS");
		Ihs_result.setErrorMsg(null);
		Ihs_result.setProgramChildID(null);
		Ihs_result.setCharmID(new Long(3340348));		
		ArrayList<AlternateID> alternate_ids = new ArrayList<AlternateID>();
		AlternateID alternate_id =  new AlternateID();
		alternate_id.setValue("15951522");
		alternate_id.setType("USIIS");		
		alternate_ids.add(alternate_id);
		Ihs_result.setAlternateIds(alternate_ids);
		s_result.add(Ihs_result);		
		
		ImmunizationStatusServiceResult Iss_result = new ImmunizationStatusServiceResult();
		ArrayList<ImmunizationStatusData> imm_status_list = new ArrayList<ImmunizationStatusData>();
		ImmunizationStatusData imm_status = new ImmunizationStatusData();
		imm_status.setSeriesName("DTP/DTaP/DT");
		imm_status.setNextDueDate("2009/08/09");
		imm_status.setExempt(null);
		imm_status.setContra(null);
		imm_status.setStatus("OVERDUE");
		imm_status_list.add(imm_status);
		Iss_result.setImmunizationStatusList(imm_status_list);
		Iss_result.setOverallStatus("OVERDUE");
		Iss_result.setOriginatingProgram("USIIS");
		Iss_result.setResultStatus("SUCCESS");
		Iss_result.setErrorMsg(null);
		Iss_result.setProgramChildID(null);
		Iss_result.setCharmID(new Long(3340348));
		List<AlternateID> alt_ids = new ArrayList<AlternateID>();
		AlternateID alt_id =  new AlternateID();
		alt_id.setValue("15951522");
		alt_id.setType("USIIS");
		alt_ids.add(alt_id);
		Iss_result.setAlternateIds(alternate_ids);
		s_result.add(Iss_result);
		 
		 
		 HearingScreeningDispositionServiceResult hsds_result = new HearingScreeningDispositionServiceResult();		
		 hsds_result.setRightDisposition(null);
		 hsds_result.setLeftDisposition(null);
		 hsds_result.setSoundField(null);
		 hsds_result.setOriginatingProgram("EHDI");
		 hsds_result.setResultStatus("FAILURE");
		 hsds_result.setErrorMsg("Mapping CharmID does not exist.");
		 hsds_result.setProgramChildID(null);
		 hsds_result.setCharmID(new Long("3340348"));
		 hsds_result.setAlternateIds(null);
		 s_result.add(hsds_result);
		
		
		 PersonServiceResult ps_result = new PersonServiceResult();				 
		 PersonData person = new PersonData();
		 person.setCharmid(null);
		 person.setFirstname("Josiah");
		 person.setLastname("Thompson");
		 person.setBirthWeightOz(null);
		 person.setAddress(null);
		 person.setPhone(null);
		 person.setIsadult(null);
		 person.setChpModifyUtcTimestamp(null);
		 person.setMiddlename("Weldon");
		 person.setAssocPerson(null);
		 person.setRoletypeid(null);
		 person.setStartdate(null);
		 person.setEnddate(null);
		 person.setEmail(null);
		 person.setMaidenname(null);
		 person.setGender("M");
		 person.setBirthdate(null);
		 person.setStateFileNumber("2009  23716");
		 person.setSsn("646-11-5970");
		 person.setNewBornScreeningNumber("482A763");
		 person.setBirthCountryId(null);
		 person.setBirthUsStateCode(null);
		 person.setBirthCountryId(null);
		 person.setBirthCity(null);
		 person.setBirthOrder(null);
		 person.setBirthWeightGrams(null);
		 person.setSuffix("");
		 person.setMothersMaidenName(null);
		 person.setDeceasedFlag(null);
		 person.setDeceasedDate(null);
		 person.setBirthFacilityCode(null);
		 person.setMultipleBirth(null);
		 ps_result.setPerson(person);
		 ps_result.setOriginatingProgram("VS");
		 ps_result.setResultStatus("FAILURE");
		 ps_result.setErrorMsg("Cannot access to participating program Database: VS");
		 ps_result.setProgramChildID(null);
		 ps_result.setCharmID(new Long(3340348));				 
		 
		 ArrayList<AlternateID> p_alt_ids = new ArrayList<AlternateID>();
		 AlternateID p_alt_id =  new AlternateID();
		 p_alt_id.setValue("2009  23716");
		 p_alt_id.setType("VS");
		 p_alt_ids.add(p_alt_id);
		 ps_result.setAlternateIds(p_alt_ids);
		 s_result.add(ps_result);
		 
		 q_result.setServiceResultList(s_result);
		 
		 return q_result;
	}
	
	@Test
	public void test_deserializeServiceResult() {
		//test_serializeServiceResult();
		
		
		String xmlfilename = "ServiceResultDataSet3.xml";//"charmresult.xml";
		QueryResult q_result = deserialize(xmlfilename);
		
		assertEquals(q_result.getResultStatus(),"PARTIAL");
		assertEquals(q_result.getErrorMsg(), "Call to one or more of CHARM Agents failed.");
		assertEquals(q_result.getProgramChildID(),null);
		
		
		PersonServiceResult person_sr = q_result.getPersonSR();
		assertEquals(null, person_sr.getPerson());
		assertEquals("CHARM_CORE",person_sr.getOriginatingProgram());
		assertEquals("NOT_AVAILABLE",person_sr.getResultStatus());
		assertEquals("Exeption in getting PersonServiceResult: CHARM_CORE agent not available.",person_sr.getErrorMsg());
		assertEquals(null,person_sr.getProgramChildID());
		assertEquals(new Long(3340348),person_sr.getCharmID());
		assertEquals(0, person_sr.getAlternateIds().size());
		
		//
		ArrayList<ServiceResult> s_result = q_result.getServiceResultList();
		
		AlertServiceResult alert_s_result = (AlertServiceResult) s_result.get(0);
		assertEquals("CHARM_CORE", alert_s_result.getOriginatingProgram());
		assertEquals("SUCCESS", alert_s_result.getResultStatus());
		assertEquals(null, alert_s_result.getErrorMsg());
		assertEquals(null, alert_s_result.getProgramChildID());
		assertEquals(new Long(3340348),alert_s_result.getCharmID());
		assertEquals(0, person_sr.getAlternateIds().size());
		
		
		HearingScreeningHistoryServiceResult hshs_result = (HearingScreeningHistoryServiceResult) s_result.get(1);
		assertEquals("EHDI", hshs_result.getOriginatingProgram());
		assertEquals("FAILURE", hshs_result.getResultStatus());
		assertEquals("Mapping CharmID does not exist.", hshs_result.getErrorMsg());
		assertEquals(null, hshs_result.getProgramChildID());
		assertEquals(new Long(3340348),hshs_result.getCharmID());
		assertEquals(0, person_sr.getAlternateIds().size());
		
		HearingScreeningMCRServiceResult hs_mcrs_result = (HearingScreeningMCRServiceResult) s_result.get(2);
		assertEquals(0, hs_mcrs_result.getMostConclusiveResultList().size());
		assertEquals("EHDI", hs_mcrs_result.getOriginatingProgram());
		assertEquals("FAILURE", hs_mcrs_result.getResultStatus());
		assertEquals("Mapping CharmID does not exist.", hs_mcrs_result.getErrorMsg());
		assertEquals(null, hs_mcrs_result.getProgramChildID());
		assertEquals(new Long(3340348),hs_mcrs_result.getCharmID());
		assertEquals(0, person_sr.getAlternateIds().size());				
		
		ImmunizationHistoryServiceResult Ihs_result = (ImmunizationHistoryServiceResult) s_result.get(3);
		assertEquals(new ArrayList(), Ihs_result.getImmunizationEventList());
		assertEquals("USIIS", Ihs_result.getOriginatingProgram());
		assertEquals("SUCCESS", Ihs_result.getResultStatus());
		assertEquals(null, Ihs_result.getErrorMsg());
		assertEquals(null, Ihs_result.getProgramChildID());
		assertEquals(new Long(3340348),Ihs_result.getCharmID());		
		List<AlternateID> alternate_ids = Ihs_result.getAlternateIds();
		AlternateID alternate_id =  alternate_ids.get(0);
		assertEquals("15951522",alternate_id.getValue());
		assertEquals("USIIS",alternate_id.getType());		
		
		ImmunizationStatusServiceResult Iss_result = (ImmunizationStatusServiceResult) s_result.get(4);
		List<ImmunizationStatusData> imm_status_list = Iss_result.getImmunizationStatusList();
		ImmunizationStatusData imm_status = imm_status_list.get(0);
		assertEquals("DTP/DTaP/DT", imm_status.getSeriesName());
		assertEquals("2009/08/09", imm_status.getNextDueDate());
		assertEquals(null, imm_status.getExempt());
		assertEquals(null, imm_status.getContra());
		assertEquals("OVERDUE",imm_status.getStatus());
		List<AlternateID> alt_ids = Iss_result.getAlternateIds();
		AlternateID alt_id =  alt_ids.get(0);
		assertEquals("15951522", alt_id.getValue());
		assertEquals("USIIS",alt_id.getType());
		
		HearingScreeningDispositionServiceResult hsds_result = (HearingScreeningDispositionServiceResult) s_result.get(5);		
		assertEquals(null, hsds_result.getRightDisposition());
		assertEquals(null, hsds_result.getLeftDisposition());
		assertEquals(null, hsds_result.getSoundField());
		assertEquals("EHDI", hsds_result.getOriginatingProgram());
		assertEquals("FAILURE", hsds_result.getResultStatus());
		assertEquals("Mapping CharmID does not exist.", hsds_result.getErrorMsg());
		assertEquals(null, hsds_result.getProgramChildID());
		assertEquals(new Long(3340348),hsds_result.getCharmID());
		assertEquals(0, person_sr.getAlternateIds().size());
		
		
		
		PersonServiceResult ps_result = (PersonServiceResult) s_result.get(6);		
		PersonData person = ps_result.getPerson();
		assertEquals(null, person.getCharmid());
		assertEquals("Josiah",person.getFirstname());
		assertEquals("Thompson",person.getLastname());
		assertEquals(null, person.getBirthWeightOz());
		assertEquals(0,person.getAddress().size());
		assertEquals(0, person.getPhone().size());
		assertEquals(new Boolean(false), person.getIsadult());
		assertEquals(null,person.getChpModifyUtcTimestamp());
		assertEquals("Weldon",person.getMiddlename());
		assertEquals(0, person.getAssocPerson().size());
		assertEquals(null, person.getRoletypeid());
		assertEquals(null, person.getStartdate());
		assertEquals(null, person.getEnddate());
		assertEquals(0, person.getEmail().size());
		assertEquals(null, person.getMaidenname());
		assertEquals("M", person.getGender());
		assertEquals(null, person.getBirthdate());
		assertEquals("2009  23716", person.getStateFileNumber());
		assertEquals("646-11-5970", person.getSsn());
		assertEquals("482A763", person.getNewBornScreeningNumber());
		assertEquals(null, person.getBirthCountryId());
		assertEquals(null, person.getBirthUsStateCode());
		assertEquals(null, person.getBirthCountryId());
		assertEquals(null, person.getBirthCity());
		assertEquals(null, person.getBirthOrder());
		assertEquals(null, person.getBirthWeightGrams());
		assertEquals("", person.getSuffix());
		assertEquals(null, person.getMothersMaidenName());
		assertEquals(new Boolean(false), person.getDeceasedFlag());
		assertEquals(null, person.getDeceasedDate());
		assertEquals(null, person.getBirthFacilityCode());
		assertEquals(new Boolean(false), person.getMultipleBirth());
		assertEquals("VS", ps_result.getOriginatingProgram());
		assertEquals("FAILURE", ps_result.getResultStatus());
		assertEquals("Cannot access to participating program Database: VS", ps_result.getErrorMsg());
		assertEquals(null, ps_result.getProgramChildID());
		assertEquals(new Long(3340348),ps_result.getCharmID());		
		
		alt_ids = ps_result.getAlternateIds();
		alt_id =  alt_ids.get(0);
		String val = (String)alt_id.getValue();
		assertEquals("2009  23716", val.trim());
		assertEquals("VS",alt_id.getType());
		
			
	}				
	
	
	

	
	

}
