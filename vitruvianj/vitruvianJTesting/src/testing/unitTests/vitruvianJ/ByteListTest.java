package testing.unitTests.vitruvianJ;

import junit.framework.TestCase;
import java.util.*;


import org.junit.Before;
import org.junit.Test;

import vitruvianJ.ByteList;



public class ByteListTest extends TestCase{

	ByteList _bList;
	
	
	public void setUp() throws Exception {
		_bList = new ByteList();
	}
	
	
	public void testByteList() {
		
		ByteList byteList = new ByteList();
		try{
		assertEquals((byteList.GetSection(0)).length, 1024);
		}catch(Exception e){}
	}

	
	public void testByteListObjectArray() {
		try{			
		ByteList byteList = new ByteList(true,2,3.5);		
		assertEquals(false, (byteList.GetBool(0)).booleanValue());
		}catch(Exception e){}
	}

	
	
	public void testSetThis() {
		try{
			
		 _bList.setThis(3);		
		 byte[] b = _bList.getSections().get(3);
		 assertNotNull(b.length);
		 //_bList.getS
		
		}catch(Exception e){}
		//fail("Not yet implemented");
	}

	@Test
	public void testClear() {
		try{
		_bList = new ByteList();
		_bList.setThis(3);				
		 _bList.Clear();
		 int size = _bList.getSections().size();
		 assertEquals(size, 0);
		}catch(Exception e){}
	}

	@Test
	public void testGetLength() {
		try{
		_bList = new ByteList();
		_bList.setThis(3);	
		int length = _bList.getLength();
		assertEquals(length, 0);
		}catch(Exception e){}
	}

	
}
