package testing.unitTests.vitruvianJ;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import testing.common.data.PersonData;
import testing.common.data.PhoneData;
import testing.common.ppQueryResult.QueryResult;
import testing.common.ppServiceResult.ImmunizationEvent;
import testing.common.ppServiceResult.ImmunizationHistoryServiceResult;
import testing.common.ppServiceResult.PersonServiceResult;
import testing.common.ppServiceResult.ServiceResult;
import vitruvianJ.core.ClassFactory;
import vitruvianJ.core.PathUtilities;
import vitruvianJ.serialization.xml.XmlDeserializer;
import vitruvianJ.serialization.xml.XmlFramework;
import vitruvianJ.serialization.xml.XmlSerializer;
import vitruvianJ.services.IService;
import vitruvianJ.services.ServiceRegistry;







import junit.framework.Assert;
import junit.framework.TestCase;

public class XmlDeserializerTest  extends TestCase {

	@Before
	public void setUp() throws Exception {
	}

	@Test
    //Test for primitive object
    public void testDeserialize_primitives_T01()
    {            
        Type_Object type_obj = new Type_Object();
        type_obj.setInt_Var(6);
        type_obj.setLong_Var(6L);
        type_obj.setFloat_Var(6.6f);
        type_obj.setDouble_Var(6.6d);         
        type_obj.setString_Var("66");
       
        Document pointDoc = XmlFramework.Serialize(type_obj);
        String s = XmlFramework.SerializeToString(pointDoc);
        System.out.println(s);
        XmlFramework.Save(PathUtilities.GetAbsolutePath("type_object.xml"), pointDoc);         
        
        // Add a method that returns string --> Serialze to String 
        
        String filename_deserialize = PathUtilities.GetAbsolutePath("type_object.xml");
        XmlFramework.AddTypeChange("Type_Object", Type_Object.class);
        
        
        type_obj = (Type_Object)XmlFramework.Deserialize(filename_deserialize);
        

        assertEquals(Type_Object.class, type_obj.getClass());
        assertEquals(type_obj.getInt_Var(), new Integer(6)); //values in Int                        
        assertEquals(type_obj.getLong_Var(), new Long(6)); //values in Long         
        assertEquals(type_obj.getString_Var(), "66"); //values in String
    }


	
	

	
	Document LoadDocument(String filename)
	{
		try{
			DocumentBuilder doc_b = DocumentBuilderFactory.newInstance().newDocumentBuilder();		
			Document doc = doc_b.parse(filename) ;
			return doc;
		}catch(Exception e)
		{
			return null;
		}
	}
	
	@Test
    //Test for deserialization of Collections
    public void testDeserialize_Collections_T02()
    {
        //Initialize the test input
        String filename = PathUtilities.GetAbsolutePath("Services.xml");
        Document doc =   LoadDocument(filename);

        Node root = doc.getLastChild();         
        List<IService> value =  ServiceRegistry.getServices();
        Type val_type = value.getClass();
        value = (List<IService>)new XmlDeserializer().Deserialize(root, val_type, value, null, null);
       

        IService testing_services = (IService)value.get(1);
        Type testing_services_type = testing_services.getClass();
        Node child_node = root.getChildNodes().item(1);
        //Testing Object
        TestingService ts = new TestingService();
        TestingService test_obj = (TestingService)new XmlDeserializer().Deserialize(child_node, testing_services_type, testing_services, null, null);
        assertEquals(ts.getName(), test_obj.getName());
        Assert.assertEquals(TestingService.class, test_obj.getClass());          
    }

	@Test
    //Test for Deserialization of Services
    public void testDeserialize_Services_T03()
    {
        //Initialize the test input
        String filename = PathUtilities.GetAbsolutePath("Services.xml");
        Document doc = LoadDocument(filename);

        Node root = doc.getLastChild();         
        List<IService> value = ServiceRegistry.getServices();
        Type val_type = value.getClass();
        value = (List<IService>)new XmlDeserializer().Deserialize(root, val_type, value, null, null);
        assertEquals(value.size(), 2); // 2 services are loaded from Xml

    }

	private QueryResult deserialize(String xmlfilename) {
		String filename = PathUtilities.GetAbsolutePath(xmlfilename);
        XmlFramework.AddTypeChange("QueryResult", testing.common.ppQueryResult.QueryResult.class);
        QueryResult query_result = (QueryResult)XmlFramework.Deserialize(filename);
        return query_result;
	}
	@Test
    //Test for Null values of Deserialization
    public void testDeserialize_Null_T04()
    {
		QueryResult q_result = new SampleImmServiceQueryResult().testQueryBuilder();
        Document pointDoc = XmlFramework.Serialize(q_result);
		 XmlFramework.Save(PathUtilities.GetAbsolutePath("q_result.xml"), pointDoc);       			
		String fileName = PathUtilities.GetAbsolutePath("q_result.xml");
			//=== USE VITRUVIAN TO GENERATE THE QUERYRESULT OBJECT
			//Note : q_result.xml is contained in Framework folder. An XML file used for deserialization.
			String xmlfilename = "q_result.xml";
			QueryResult immqr = deserialize(xmlfilename);
			PersonServiceResult psr = immqr.getPersonSR();								
			PersonData p = psr.getPerson();			
			assertEquals(null, p.getMiddlename());					
			assertEquals(null,p.getDeceasedDate());
			assertEquals(null,p.getMaidenname());
			assertEquals(null,p.getNewBornScreeningNumber());	
			assertEquals("msg_ali",immqr.getErrorMsg());
    }

	
	

}
