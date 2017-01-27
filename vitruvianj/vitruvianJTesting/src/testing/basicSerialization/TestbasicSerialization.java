package testing.basicSerialization;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;


import testing.basicSerialization.*;
import vitruvianJ.core.PathUtilities;
import vitruvianJ.serialization.xml.XmlDeserializer;
import vitruvianJ.serialization.xml.XmlFramework;
import vitruvianJ.serialization.xml.XmlSerializer;




public class TestbasicSerialization {

	@Test
	public void testDeserialization()
	{
		 
		@SuppressWarnings("unchecked")
		List<Widget> result = (List<Widget>)Utilities.GetDeserializer().Deserialize(XmlFramework.DeserializeToDoc(PathUtilities.GetAbsolutePath("Test-widgets.xml")));
		Assert.assertEquals(3, result.size());
		Widget w1 = result.get(0);
		Assert.assertEquals("Test 1",  w1.getLabel());		
		Assert.assertEquals("Test Widget 1", w1.getDescription());
		
		Gadgt g = w1.getGadgtList().get(0);
		Assert.assertEquals("Gad1.1", g.getLabel());
		Assert.assertEquals("Gadget #1.1", g.getDescription());
		Assert.assertEquals(new Integer(11), g.getWeight());
		Assert.assertEquals(new Integer(101), g.getHeight());
	}
	
	@Test
	public void testSerialization()
	{
		 // Set up some test data to play with
        Widget w1 = new Widget("Test 1", "Test Widget 1");
        w1.Add(new Gadgt("Gad1.1", "Gadget #1.1", 11, 101));
        w1.Add(new Gadgt("Gad1.2", "Gadget #1.2", 12, 102));
        w1.Add(new Gadgt("Gad1.3", "Gadget #1.3", 13, 103));
        w1.Add(new Gadgt("Gad1.4", "Gadget #1.4", 14, 104));

        Widget w2 = new Widget("Test 2", "Test Widget 2");
        w2.Add(new Gadgt("Gad2.1", "Gadget #2.1", 21, 201));
        w2.Add(new Gadgt("Gad2.2", "Gadget #2.2", 22, 202));
        w2.Add(new Gadgt("Gad2.3", "Gadget #2.3", 23, 203));
        w2.Add(new Gadgt("Gad2.4", "Gadget #2.4", 24, 204));

        Widget w3 = new Widget("Test 3", "Test Widget 3");
        w3.Add(new Gadgt("Gad3.1", "Gadget #2.1", 31, 301));
        w3.Add(new Gadgt("Gad3.2", "Gadget #2.2", 32, 302));
        w3.Add(new Gadgt("Gad3.3", "Gadget #2.3", 33, 303));
        w3.Add(new Gadgt("Gad3.4", "Gadget #2.4", 34, 304));

        List<Widget> widgets = new ArrayList<Widget>();
        widgets.add(w1);
        widgets.add(w2);
        widgets.add(w3);

        XmlSerializer serializer = Utilities.GetSerializer();
       
		XmlFramework.Save(PathUtilities.GetAbsolutePath("Test-w1.xml"), serializer.Serialize(w1));
		XmlFramework.Save(PathUtilities.GetAbsolutePath("Test-w2.xml"), serializer.Serialize(w2));
		XmlFramework.Save(PathUtilities.GetAbsolutePath("Test-w3.xml"), serializer.Serialize(w3));
		XmlFramework.Save(PathUtilities.GetAbsolutePath("Test-widgets.xml"), serializer.Serialize(widgets));

		//Deserialize the code from C# file
		//List<Widget> result = (List<Widget>)XmlFramework.Deserialize(PathUtilities.GetAbsolutePath("Test-widgets-cSharp.xml"));

	}
}
