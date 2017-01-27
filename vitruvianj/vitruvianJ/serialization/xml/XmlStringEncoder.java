package vitruvianJ.serialization.xml;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.nio.charset.Charset;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;


import vitruvianJ.serialization.xml.Hex;

import junit.framework.Assert;

import org.junit.Test;
import org.w3c.dom.*;
public class XmlStringEncoder {
		private static String EscapeDataString(String value)
		{
			StringBuilder result = new StringBuilder();
			for (int i = 0; i < value.length(); i++)
			{
                if (Character.isLetterOrDigit(value.charAt(i)))
                    result.append(value.charAt(i));
                else if (((int)value.charAt(i)) > 255)
                    result.append(value.charAt(i));
				else
					try {
						result.append(hexadecimal(Character.toString(value.charAt(i)),"US-ASCII"));
					} catch (UnsupportedEncodingException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}// charsetName) Uri.HexEscape(value[i]));
			}

			return result.toString();
		}
		
		private static String UnescapeDataString(String value)
		{
			StringBuilder result = new StringBuilder();
			for (int i = 0; i < value.length();)
			{
                if (((int)value.charAt(i)) > 255)
                    result.append(value.charAt(i));
                else
                	try {
                		if(value.charAt(i)== '%')
                		{
                			result.append(dehexadecimal(value.substring(++i,i+2)));
                			i = i+2;
                		}
                		else
                		{
                			result.append(value.charAt(i++));
                		}
					} catch (UnsupportedEncodingException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}// charsetName) Uri.HexEscape(value[i]));
			}

			return result.toString();
		}
		

		
		/// <summary>
		/// Encode the string using W3C standards.
		/// </summary>
		/// <param name="value">The string to encode.</param>
		/// <returns>The encoded string.</returns>
		public static String W3CEncodeString(String value) throws Exception
		{
			return EscapeDataString(value);// null;//new URLCodec().encode(value);
		}


		/// <summary>
		/// Decode the string using W3C standards.
		/// </summary>
		/// <param name="value">The string to decode.</param>
		/// <returns>The decoded string.</returns>
		public static String W3CDecodeString(String value) throws Exception
		{
            return  UnescapeDataString(value);
		}

		/// <summary>
		/// Determine if the given value is a valid xml document.
		/// </summary>
		/// <param name="value"></param>
		/// <returns>Returns null on invalid text.</returns>
		public static Document ToXmlDocument(String value)
		{
			if ((value == null) || (value.length() <= 0))
				return null;

			if (value.charAt(0) == '<')
			{
				try
				{
					DocumentBuilder doc = DocumentBuilderFactory.newInstance().newDocumentBuilder();
					return doc.parse(value);

				}
				catch (Exception e)
				{
					return null;
					// this is an expected exception in the case of invalid text but most likely in the case of multiple root nodes (also an error)
				}
			}
			else
				return null;
		}
		
		public static String hexadecimal(String input, String charsetName) throws UnsupportedEncodingException {
		    if (input == null) throw new NullPointerException();
		    return  Hex.encodeHexString(input.getBytes(Charset.forName(charsetName)));
		}

		public static String dehexadecimal(String input) throws UnsupportedEncodingException {
		    if (input == null) throw new NullPointerException();
		    try {
				return  new String(Hex.decodeHex(input.toCharArray()));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		}
		

		
		@Test
		public void testStringEncoding()
		{
			
			Assert.assertEquals("Test 1", UnescapeDataString("Test%201"));
			Assert.assertEquals("Test%201%2E", EscapeDataString("Test 1."));
			Assert.assertEquals("Test 1.", UnescapeDataString("Test%201%2E"));
			Assert.assertEquals("Gadgt #1.1", UnescapeDataString("Gadgt%20%231%2E1"));
			
		}
}
