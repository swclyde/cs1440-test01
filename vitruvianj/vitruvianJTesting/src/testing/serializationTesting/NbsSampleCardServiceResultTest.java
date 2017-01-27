package testing.serializationTesting;
import org.junit.Test;
import org.w3c.dom.Document;

import testing.common.ppServiceResult.NbsSampleCardServiceResult;
import testing.common.util.Utilities;
import vitruvianJ.serialization.xml.XmlFramework;
import vitruvianJ.serialization.xml.XmlSerializer;


public class NbsSampleCardServiceResultTest {
	
	private static String fileName = "C:\\CHARM_VJ\\VitruvianJ_Testing\\config\\NbsCardResult\\NBSSampleCardServiceResult_1.xml";
	private static String OutputfileName = "C:\\CHARM_VJ\\VitruvianJ_Testing\\config\\NbsCardResult\\NBSSampleCardServiceResult_3.xml";

	NbsSampleCardServiceResult getResult(String fileName)
	{
		NbsSampleCardServiceResult tempObject = (NbsSampleCardServiceResult) XmlFramework.DeserializeXml(fileName);
		return tempObject;		
	}
	
	@Test
	public void testDeserialize()
	{
		
		NbsSampleCardServiceResult object =  getResult(fileName);
		
		XmlSerializer serializer = Utilities.GetSerializer();
		Document doc =  serializer.Serialize(object);
		XmlFramework.Save(OutputfileName, doc);
	}
}
