package testing.unitTests.vitruvianJ;

import java.io.File;
import java.net.URL;


import junit.framework.TestCase;


public class PathUtilitiesTest extends TestCase {

	public String GetDirectoryName()
	{	
		URL u = JFileAppenderTest.class.getResource("\\JFileAppenderTest.class");
		String path = new File(u.toString()).getParent();	
		path = path.substring(6);
		return path;			
	}
	public void testGetDirectoryName()
	{
		System.out.println(GetDirectoryName());
		assertEquals(GetDirectoryName(), GetDirectoryName());
		
		
	}
}
