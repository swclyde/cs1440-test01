package testing.common.util;



import vitruvianJ.serialization.xml.*;
import org.w3c.dom.*;

public class XMLConvertor {

	public static void writeToXMLFile (Object o, String filename) {//throws FileNotFoundException {
		XmlFramework.Serialize(filename, o);
		/* USING XSTREAM
		XMLEncoder e = new XMLEncoder(
                new BufferedOutputStream(
                   new FileOutputStream(filename)));
		e.writeObject(o);
		e.close();
		*/
	}
	
	public static String convertToXMLString (Object o) {
		Document d = XmlFramework.Serialize(o);
		//return d.toString();
		return XmlFramework.SerializeToString(d);
		/* USING XSTREAM
		String ans = null;
		XStream xstream = new XStream(new DomDriver());
		ans = xstream.toXML(o);
		return ans;
		*/
	}
}
