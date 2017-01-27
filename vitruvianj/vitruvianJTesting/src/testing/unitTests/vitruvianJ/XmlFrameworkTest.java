package testing.unitTests.vitruvianJ;


import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import testing.common.ppQueryResult.QueryResult;
import vitruvianJ.core.PathUtilities;
import vitruvianJ.serialization.xml.XmlFramework;




public class XmlFrameworkTest extends TestCase {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testAddTypeChange() {
		XmlFramework framework = new XmlFramework();
		String str = new String("ali");
		XmlFramework.AddTypeChange(str,str.getClass());
		Assert.assertEquals(str.getClass(), framework.GetDeserliazeTypeChange().get(str));
		Assert.assertEquals(str, framework.GetSerliazeTypeChange().get(str.getClass()));		
	}

	@Test
	public void testSerializeObject() {
		Document doc = XmlFramework.Serialize(new String("AL"));
		Element root = doc.getDocumentElement();
		Assert.assertEquals("object", root.getNodeName());
		
	}	
	@Test
	public void testSave() {
		String fileName = PathUtilities.GetAbsolutePath("q_result.xml");
		Document doc = XmlFramework.Serialize(new String("AL"));
		Assert.assertTrue(XmlFramework.Save(fileName, doc));		
	}

	@Test
	public void testDeserializeString() {
		String fileName = PathUtilities.GetAbsolutePath("q_result.xml");
		Object obj = XmlFramework.Deserialize(fileName);
		Assert.assertNotNull(obj);
	}

	public void testToStringSerialize()
    {            
        Type_Object type_obj = new Type_Object();
        type_obj.setInt_Var(6);
        type_obj.setLong_Var(6L);
        type_obj.setFloat_Var(6.6f);
        type_obj.setDouble_Var(6.6d);         
        type_obj.setString_Var("66");
       
        Document pointDoc = XmlFramework.Serialize(type_obj);
        String s = XmlFramework.SerializeToString(pointDoc);
        
        
        String s1 = null;
		try{			
		 DOMSource domSource = new DOMSource(pointDoc);
		 TransformerFactory tf = TransformerFactory.newInstance();
         Transformer m = tf.newTransformer();
         java.io.StringWriter sw = new java.io.StringWriter();
         StreamResult sr = new StreamResult(sw);
         m.transform(domSource, sr);
         s1 = sw.toString();
		}catch(Exception e)
		{}
                    
        assertEquals(s1, s); //values in String
    }


	public void testObjectToStringSerialize()
    {            
        Type_Object type_obj = new Type_Object();
        type_obj.setInt_Var(6);
        type_obj.setLong_Var(6L);
        type_obj.setFloat_Var(6.6f);
        type_obj.setDouble_Var(6.6d);         
        type_obj.setString_Var("66");
       
        Document pointDoc = XmlFramework.Serialize(type_obj);
        XmlFramework.SerializeToString(pointDoc);
        String s = XmlFramework.SerializeToString(pointDoc);
        
        String s1 = XmlFramework.SerializeObjectToString(type_obj);
        Assert.assertEquals(s1, s);
    }


	
	@Test
	public void testDeserializeXmlString() {		
		QueryResult q_result = new SampleImmServiceQueryResult().testQueryBuilder();
        Document pointDoc = XmlFramework.Serialize(q_result);
		 XmlFramework.Save(PathUtilities.GetAbsolutePath("q_result.xml"), pointDoc);       			
		String fileName = PathUtilities.GetAbsolutePath("q_result.xml");
		Object obj = XmlFramework.DeserializeXml(fileName);
		Assert.assertNotNull(obj);		
	}

	
}
