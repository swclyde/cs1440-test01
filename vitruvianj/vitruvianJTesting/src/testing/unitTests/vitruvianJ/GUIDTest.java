package testing.unitTests.vitruvianJ;

import junit.framework.TestCase;
import java.util.*;

//import vitruvianJ.logging.GUID;
import vitruvianJ.logging.JGUID;


public class GUIDTest extends TestCase {

	public void testRandomNumber()
	{
		Random rand = new Random();
		for(int i =0; i<20; i++){
			int val = rand.nextInt(10);
			System.out.println(val);
			assertTrue(val<10);
		}		
	}
	
	public void testGUIDConstructors()
	{
		JGUID g = new JGUID();		
		assertEquals(g.toString().length(),36 );
		
		g = new JGUID("6B29FC40-CA47-1067-B31D-00DD010662DA");		
		assertEquals(g.toString(),"6B29FC40-CA47-1067-B31D-00DD010662DA" );
		
	}
	public void testGetGuidVal()
	{
		String randVal = new JGUID().getJGuidVal();	
		System.out.println(randVal);
		assertEquals(36, randVal.length() );
	}
}
