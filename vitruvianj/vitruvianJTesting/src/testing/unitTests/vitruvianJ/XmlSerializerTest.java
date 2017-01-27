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
import vitruvianJ.serialization.formatters.GuidFormatter;
import vitruvianJ.serialization.formatters.JGUIDFormatter;
import vitruvianJ.serialization.formatters.PathFormatter;
import vitruvianJ.serialization.formatters.TypeFormatter;
import vitruvianJ.serialization.xml.XmlDeserializer;
import vitruvianJ.serialization.xml.XmlFramework;
import vitruvianJ.serialization.xml.XmlSerializer;
import vitruvianJ.services.IService;
import vitruvianJ.services.ServiceRegistry;
import vitruvianJ.serialization.xml.*;






public class XmlSerializerTest  extends TestCase {

	@Before
	public void setUp() throws Exception {
		
		
	}
//
//	//=== USE VITRUVIAN TO GENERATE THE QUERYRESULT OBJECT
//	private QueryResult deserialize(String xmlfilename) {
//		String filename = PathUtilities.GetAbsolutePath(xmlfilename);
//        //XmlFramework.AddTypeChange("QueryResult", common.ppQueryResult.QueryResult.class);
//        //QueryResult query_result = (QueryResult)XmlFramework.Deserialize(filename);
//      //  return query_result;
//        
//        XmlDeserializer deserializer = Utilities.GetDeserializer();
//		//XmlFramework.AddTypeChange("AlertServiceResult", AlertServiceResult.class);
//		//String filename_deserialize = PathUtilities.GetAbsolutePath("AlertServiceResult.xml");
//		Document doc = XmlFramework.DeserializeToDoc(filename);
//		QueryResult query_result = (QueryResult)deserializer.Deserialize(doc);
//		return query_result;
//	}
//	
//		
//	@Test
//	public void test_IsNull_Serialize() {
//		QueryResult q_result = new SampleImmServiceQueryResult().testQueryBuilder();                
//        //Note : q_result.xml is contained in Framework folder.
//		
//		XmlSerializer serializer = Utilities.GetSerializer();						
//		Document doc = serializer.Serialize(q_result);
//		XmlFramework.Save(PathUtilities.GetAbsolutePath("q_result.xml"), doc);
//
//        System.out.println("===============Serializer ==========================");
//        System.out.println("Query Result - programChildID : " + q_result.getProgramChildID());
//        System.out.println(" ==========================");
//		
//        String xmlfilename =  "q_result.xml";
//		QueryResult immqr = deserialize(xmlfilename);
//		
//		//=== TEST THE FIELDS IN immunizationQueryResult;
//		//assertEquals(QueryResult.STAUS_SUCCESS, immqr.resultStatus);
//		
//		//check person service result part
//		
//		PersonServiceResult psr = immqr.getPersonSR();
//		assertNotNull(immqr.getPersonSR());
//		assertEquals(ServiceResult.PROGRAM_CHARMCORE, psr.getOriginatingProgram());
//		assertEquals(ServiceResult.STATUS_SUCCESS, psr.getResultStatus());
//		
//		PersonData p = psr.getPerson();
//		assertNotNull(psr.getPerson());
//		assertFalse(p.getIsadult());
//		assertEquals("Logan", p.getFirstname());
//		assertEquals("Bowen", p.getLastname());
//		assertEquals("M", p.getGender());
//		assertEquals("1980/05/24", p.getBirthdate());
//		assertEquals("2007  01789 ", p.getStateFileNumber());
//		assertEquals("529033489", p.getSsn());
//		assertEquals(29, p.getBirthUtahCountyId().intValue());
//		assertEquals("UT", p.getBirthUsStateCode());
//		assertEquals(221, p.getBirthCountryId().intValue());
//		assertEquals("OGDEN", p.getBirthCity());
//		assertEquals(2508, p.getBirthWeightGrams().shortValue());
//		assertEquals(88, p.getBirthWeightOz().shortValue());
//		assertEquals("141", p.getBirthFacilityCode());
//		assertEquals(null, p.getMiddlename());		
//		assertEquals(null,p.getBirthOrder());
//		assertEquals(null,p.getCharmid());
//		assertEquals(null,p.getDeceasedDate());
//		assertEquals(false,p.getDeceasedFlag().booleanValue());
//		assertEquals(null,p.getMaidenname());
//		assertEquals(false,p.getMultipleBirth().booleanValue());
//		assertEquals(null,p.getNewBornScreeningNumber());
//		
//		ArrayList phone = p.getPhone();
//		assertNotNull(phone);
//		assertEquals(2, phone.size());
//		PhoneData phone1 = (PhoneData) phone.get(0);
//		assertEquals("4355551234", phone1.getPhone());
//		assertEquals("2009/01/01", phone1.getStartDate());
//				
//		assertNull(phone1.getEndDate());
//		
//		PhoneData phone2 = (PhoneData) phone.get(1);
//		assertEquals("8012345643", phone2.getPhone());
//		assertNull(phone2.getStartDate());
//		assertNull(phone2.getEndDate());
//		
//		ArrayList address = p.getAddress();
//		assertNotNull(address);
//		assertEquals(0, address.size());
//		
//		ArrayList assocperson = p.getAssocPerson();
//		assertNotNull(assocperson);
//		assertEquals(0, assocperson.size());
//		
//		//check service result list part
//		ArrayList<ServiceResult> serviceResults = immqr.getServiceResultList();
//		assertNotNull(serviceResults);
//		assertEquals(1, serviceResults.size());
//		ServiceResult serv = serviceResults.get(0);
//		
//		ImmunizationHistoryServiceResult immSR = (ImmunizationHistoryServiceResult) serv;
//		assertNotNull(immSR);
//		assertEquals(ServiceResult.PROGRAM_EHDI, immSR.getOriginatingProgram());
//		assertEquals(ServiceResult.STATUS_SUCCESS, immSR.getResultStatus());
//		
//		ArrayList<ImmunizationEvent> events = immSR.getImmunizationEventList();
//		assertNotNull(events);
//		assertEquals(3, events.size());
//		
//		ImmunizationEvent event1 = events.get(0);
//		assertEquals("2006-01-25 00:00:00.0", event1.getEventDate());
//		assertEquals("SOUTHWEST HD - ST. GEORGE", event1.getProviderName());
//		assertEquals("20", event1.getVaccineCode());
//		assertEquals(0, event1.getVaccineComponentNo().longValue());
//		assertEquals("DTaP", event1.getVaccineName());
//        assertEquals("DTP", event1.getVaccineSeriesName());
//        assertNull(event1.getConfidentialityRequirement());
//        assertNull(event1.getContraindicationFlag());
//        assertNull(event1.getInvalidFlag());
//		
//		ImmunizationEvent event2 = events.get(1);
//		assertEquals ("2003-01-13 00:00:00.0", event2.getEventDate());
//		assertEquals ("50", event2.getVaccineCode());
//		assertEquals (1, event2.getVaccineComponentNo().longValue() );
//		assertEquals ("DTaP-H1B", event2.getVaccineName());
//		assertEquals ("DTP", event2.getVaccineSeriesName());
//        
//		ImmunizationEvent event3 = events.get(2);
//		assertEquals ("2002-05-12 00:00:00.0", event3.getEventDate() );
//		assertEquals ("100", event3.getVaccineCode());
//		assertEquals (0, event3.getVaccineComponentNo().longValue());
//		assertEquals ("(PCV7) PNEUMOCOCCAL CONJUGATE", event3.getVaccineName());
//		assertEquals ("PNEUMO PCV-7", event3.getVaccineSeriesName());
//        
//	}				
//
//	
//		@Test
//	public void testGetandSetTypeChange() {
//		XmlSerializer serliaizer = new XmlSerializer();
//		serliaizer.getTypeChange().put(new String().getClass(), "2");
//		Assert.assertEquals("2", serliaizer.getTypeChange().get(new String().getClass()));		
//	}
//
//	@Test
//	public void testSerialize() {
//		XmlSerializer serializer = new XmlSerializer();
//		Document doc = serializer.Serialize(new String("2"), new TypeFormatter());
//		Element root = doc.getDocumentElement();
//		String name = root.getNodeName();
//		Assert.assertEquals("object", name);	
//		//The second method		
//	}
//	
//	
//	
//	
//	@Test
//	public void testSerializeObject() {
//		XmlSerializer xmlserializer = new XmlSerializer();
//		
//		Document d = xmlserializer.Serialize(new String("Ali Raza"));
//		Assert.assertNotNull(d);
//	}
//
//	@Test
//	public void testInnerNode()
//	{
//		Element e = null;
//		Node n = null;
//		// Document (Xerces implementation only).
//		Document xmldoc= new DocumentImpl();
//		// Root element.
//		Element root = xmldoc.createElement("USERS");
//		String[] id = {"PWD122","MX787","A4Q45"};
//		String[] type = {"customer","manager","employee"};
//		String[] desc = {"Tim@Home","Jack&Moud","John D'oé"};
//		for (int i=0;i<id.length;i++)
//		{
//		  // Child i.
//		  e = xmldoc.createElementNS(null, "USER");
//		  e.setAttributeNS(null, "ID", id[i]);
//		  e.setAttributeNS(null, "TYPE", type[i]);
//		  n = xmldoc.createTextNode(desc[i]);
//		  e.appendChild(n);
//		  root.appendChild(e);
//		}
//		try{
//			xmldoc.appendChild(root);
//			FileOutputStream fos = new FileOutputStream(PathUtilities.GetAbsolutePath("abc.xml"));
//			OutputFormat of = new OutputFormat("XML","ISO-8859-1",true);
//			of.setIndent(1);
//			of.setIndenting(true);
//			of.setDoctype(null,"users.dtd");
//			XMLSerializer serializer = new XMLSerializer(fos,of);		
//			serializer.asDOMSerializer();
//			serializer.serialize( xmldoc.getDocumentElement() );
//			fos.close();
//			
//			 Document doc = parseFile(PathUtilities.GetAbsolutePath("abc.xml"));
//			 
//			 //Node root1 = doc.getDocumentElement();
//			 doc.getFirstChild();
//			 doc.getLastChild();
//		}catch(Exception ex){
//			
//		}		
//	}

	
	public Document parseFile(String fileName) {
	         DocumentBuilder docBuilder;
	         Document doc = null;
	         DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
	         docBuilderFactory.setIgnoringElementContentWhitespace(true);
	         try {
	             docBuilder = docBuilderFactory.newDocumentBuilder();
	         }
	         catch (Exception e) {
	             System.out.println("Wrong parser configuration: " + e.getMessage());
	             return null;
	         }
	         File sourceFile = new File(fileName);
	         try {
	             doc = docBuilder.parse(sourceFile);
	         }
	         catch (Exception e) {
	             System.out.println("Wrong XML file structure: " + e.getMessage());
	             return null;
	         }
	        
	         System.out.println("XML file parsed");
	         return doc;
	     }
	@Test
	public void testAddAttributeType()
	{
		XmlSerializer xmlserializer = new XmlSerializer();
		Document d = xmlserializer.Serialize(new String("Ali Raza"));
		d.getParentNode();		
		//xmlserializer.AddTypeAttribute(d, node, xmlserializer.getClass());
		
		
	}
	
	@Test
	public void testSerializeObjectFormatter() {
		XmlSerializer xmlserializer = new XmlSerializer();
		Document d = xmlserializer.Serialize("B85E62C3-DC56-40C0-852A-49F759AC68FB", new JGUIDFormatter());
		XmlFramework.Save("guid.xml", d);
		Assert.assertNotNull(d);
	}

	

}
