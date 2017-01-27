package testing.common.util;

/**
 * The PhoneNumberFormatConverter class is used to convert phone numbers from different participating databases into
 * standard Charm Phone Number Format.
 * <p>
 * Possible input phone number formats are:
 * <pre>
 * 		1-213-456-7890
 * 		213-456-7890
 *		2134567890
 *		21345678901..
 *		(213)4567890
 *		(213)456-7890
 *		456-7890
 *		xxx-456-7890
 *		4567890
 *		213-456-7890 ext(opt)1234...
 *		2134567890 ext(opt)1234...
 *		(213)4567890 ext(opt)1234...
 *		(213)456-7890 ext(opt)1234...
 *		456-7890 ext(opt)1234...
 *		4567890 ext(opt)1234...
 *		
 * 		ext for extension #, opt for option #
 *</pre>
 * 
 *</p>
 *<p>
 * Output Charm Phone Formats are like the following:
 *<pre> 		
 * 		213-456-7890 EXT1234...
 *		213-456-7890
 * 		xxx-456-7890 EXT1234...
 *		xxx-456-7890
 *</pre>
 *
 * Three digits of "x" is padded when the area code is not available in input phone number. Option numbers used after
 * the phone get through is considered the same as extension numbers.
 * </p>
 * The phone number converter will take us numbers only as input numbers.
 * 
 * @author Xiangbin Qiu
 * @version 1.0
 * 
 */
public class PhoneNumberFormatConverter
{

	/**
	 * Utility class, hence no instances allowed.
	 */
	public PhoneNumberFormatConverter()
	{}
	
	/**
	 * This method cleans the input phone number string by removing all non-word characters.
	 * It also convert all alphabeticals into uppercase and remove a beggining '1' from the input number, if has one.
	 * @param phoneNumber The original raw input phone nubmer as <code>String</code>
	 * @return The cleaned input phone number with numbers and letters only.
	 */
	private static String cleanPhoneNumber(String phoneNumber)
	{
		String result=null;

		phoneNumber = phoneNumber.toUpperCase();
		phoneNumber = phoneNumber.replaceAll("\\(", "");
		phoneNumber = phoneNumber.replaceAll("\\)", "");
		phoneNumber = phoneNumber.replaceAll(" ", "");
		phoneNumber = phoneNumber.replaceAll("-", "");
		
		if(phoneNumber.length()>0 && phoneNumber.charAt(0)=='1')
			phoneNumber = phoneNumber.substring(1);
		
		if (phoneNumber.matches("\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d[0-9]+"))//pure number strings longer than 10 digits will be considered valid and those number after the 10th digit will be considered as extension number
		{
			String temp = phoneNumber.substring(0,10) + "X" + phoneNumber.substring(10);
			phoneNumber =temp;
		}
		
		phoneNumber = phoneNumber.replaceAll("[^\\w]", "");
		phoneNumber = phoneNumber.replaceAll("XXX","");

		if(phoneNumber.length()>0 && phoneNumber.charAt(0)=='1')//in case the phone number begins with some other nonword character and its beginning "1" is not cleaned.
			phoneNumber = phoneNumber.substring(1);

		result = phoneNumber;
		return result;
	}

	/**
	 * This method is a internal private method used to format a 7-digit or 10-digit number into charm phone number format.
	 * @param phoneNumberWithoutExtension The main number part of the input phone number.
	 * @return The formatted main number part.
	 */
	private static String formatNumber(String phoneNumberWithoutExtension)
	{
		String result = "";

		if(phoneNumberWithoutExtension.length()==7)
			result = "xxx-" + phoneNumberWithoutExtension.substring(0, 3) + "-" + phoneNumberWithoutExtension.substring(3);
		else if (phoneNumberWithoutExtension.length()==10)
			result = phoneNumberWithoutExtension.substring(0, 3)+"-"+phoneNumberWithoutExtension.substring(3, 6)+"-" + phoneNumberWithoutExtension.substring(6);

		return result;
	}

	/**
	 * This method is a internal private method used to parse and format the extension number part of a given phone number.
	 * @param extensionString The extension number part of the input phone number.
	 * @return The parsed and formatted extension number.
	 */
	private static String parseExtensionString(String extensionString)
	{
		String result = "";
		if(extensionString.matches("EXT[0-9]+")||extensionString.matches("X[0-9]+")||extensionString.matches("OPT[0-9]+.*"))
		{ 			
			extensionString = extensionString.replaceAll("[A-Z]", "");
			result = " EXT" + extensionString;
		}
		return result;
	}
	
	
	/**
	 * This is the main method that does the conversion. 
	 * <p>
	 * Main algorithm:
	 * <pre>
	 * 1. clean the input number by removing all nonword characters, beginning '1's, 
	 * 		and if the phone number a number string longer than 10, an "X" is inserted at the 11th 
	 * 		position of the string to indicates the extra numbers at the tail will be considered as 
	 * 		extension number
	 * 2. separate the input number into main number part and extension number part 
	 * 3. format the 7 digit or 10 digit main number part into charm main number format ("xxx-xxx-xxxx")
	 * 4. parse the extension number part
	 * 5. join the two parts again into xxx-xxx-xxxx[ EXTxxx...]
	 * </pre>
	 * </p>
	 * @param phoneNumber The input phone number as <code>String</code>.
	 * @return The converted charm phone format.
	 */

	public static String convertToCharmFormat(String phoneNumber)
	{
		String result = "";
		String numberString = "", extensionString = "";
		phoneNumber = cleanPhoneNumber(phoneNumber);

		if (phoneNumber.length()<7)//invalid number if its length is less than 7
			result = "";
		else if(phoneNumber.substring(0, 7).matches("\\d\\d\\d\\d\\d\\d\\d")==false)//invalid number if its first 7 digigts are not all numbers
			result = "";
		else {//break phone number into two parts here
			if(phoneNumber.length()==7)
			{
				numberString=phoneNumber;
			}else
				if(phoneNumber.length()>7 && phoneNumber.length()<10)
				{
					numberString = phoneNumber.substring(0,7);
					extensionString = phoneNumber.substring(7);
				}
				else
					if(phoneNumber.length()==10&&phoneNumber.matches("\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d"))
						numberString = phoneNumber;
					else
					{
						numberString = phoneNumber.split("[A-Z]")[0];
						extensionString = phoneNumber.substring(numberString.length());
					}

			numberString = formatNumber(numberString);
			extensionString = parseExtensionString(extensionString);
			result = numberString + extensionString;
		}
		return result;
	}

	/**
	 * This method is called by the class user to check whether a given phone number is valid for the converter.
	 * 
	 * @param phoneNumber The input phone number.
	 * @return A <code>boolean</code> value to indicate the result.
	 */
	public static boolean isValidPhoneNumber(String phoneNumber)
	{
		boolean result = true;
		phoneNumber = convertToCharmFormat(phoneNumber);
		if(phoneNumber.length()<12)
			result = false;
		return result;
	}

}
