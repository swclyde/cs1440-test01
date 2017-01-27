/*
 * Copyright 2003 Utah Department of Health. All rights reserved.
 *
 * This software is the proprietary information of Utah Department of Health.
 */
package testing.common.util;

import java.util.*;
import java.text.*;

/**
 * The MultiFormatDateConverter class is used to convert <code>java.util.Date</code> or <code>java.sql.Date</code>
 * to string, or a date represented as a string into <code>java.util.Date</code>. The Date objects are converted
 * into the yyyy/MM/dd which is the Charm Date Format. This class also provides a method to get the current
 * date as a string in the Charm Date Format. Charm Date Format (yyyy/MM/dd) is the format in which the dates are 
 * shared between AlertEngine and CharmAgent, and CharmAgent and CharmServer. AlertEngine, CharmAgent, and 
 * CharmServer may be operating in different timezones. Hence, to make important dates like birth date and deceased
 * date agnostic of timezones, they are represented by a string in the format described below. This string format also
 * lends itself to easy searching and comparision. The CoreAgent also stores these dates as string.
 * 
 * <p>
 * The following is a list of supported string date
 * formats that can be converted to a <code>java.util.date</code>:
 * <pre>
 *      MM/dd/yy
 *      MM/dd/yyyy
 *      dd-MM-yy
 *      dd-MM-yyyy
 *      yyyy/MM/dd
 *      yyyy-MM-dd
 *      dd-MMM-yy
 *      dd-MMM-yyyy
 * </pre>
 * </p>
 *
 * <p>
 * There is no way to distinguish between string dates of similar patterns (e.g. MM/dd/yyyy and dd/MM/yyyy
 * are indistinguishable). Because of this, there are a limited number of valid string date patterns available.
 * </p>
 *
 * <p>
 * <b><i>Note:</i><b> This class internally uses the <code>java.text.SimpleDateFormat</code> class. 
 * All the above mentioned date formats are supported by this class. Hence, for more details look at
 * the API documentation for that class.
 * </p>
 *
 * @author Monal Daxini
 */
public class MultiFormatDateConverter
{
    /** 
     * This constant represents the format in which the dates are 
     * shared between AlertEngine and CharmAgent, and CharmAgent and CharmServer.
     * AlertEngine, CharmAgent, and CharmServer may be operating in different timezones.
     * Hence, to make important dates like birth date and deceased date agnostic of timezones,
     * they are represented by a string in the format described below. This string format also
     * lends itself to easy searching and comparision.
     * The CoreAgent also stores these dates as string.
     */
    public static String CHARM_DATE_FORMAT = "yyyy/MM/dd";
    
    // This constant array defines the acceptable string date formats.
    //
    // IMPORTANT: The formats are used in the order specified in this array to check against the
    //            given string dates to convert them or parse them. Hence, The order in which these
    //            formats are specified in the array is very important. If this order is changed
    //            then some of the formats may not work.
    private static final String[] VALID_DATE_FORMATS = {"MM/dd/yy", "MM/dd/yyyy", 
                                                        "dd-MM-yy", "dd-MM-yyyy",
                                                        "yyyy/MM/dd", "yyyy-MM-dd", 
                                                        "dd-MMM-yy", "dd-MMM-yyyy"};

    // The SimpleDateFormat object is cached for efficiency.
    private static SimpleDateFormat dateFormatter;

    //

    // A static constructor which initializes the date formatter.
    static
    {
        dateFormatter = new SimpleDateFormat();
        dateFormatter.setLenient(false);
    }

    /**
     * Utility class, hence no instances allowed.
     */
    private MultiFormatDateConverter()
    {
    }
    
    /**
     * This method returns the current date as a string in the Charm Date Format (yyyy/MM/dd).
     * This method uses the default timezone defined in <code>java.util.TimeZone</code> class.
     *
     * @return  current date as string in yyyyy/MM/dd format.
     */
    public static String getCurrentDateAsString()
    {
        // Get the current date in the current TimeZone.
        java.util.Date curDate = new Date();

        // Convert date to a string of the format CHARM_DATE_FORMAT.
        dateFormatter.applyPattern(CHARM_DATE_FORMAT);
        return dateFormatter.format(curDate);
    }
    
    /**
     * This method converts a given date into a string representation of
     * the date in the Charm Date Format (yyyy/MM/dd).
     *
     * @param   givenDate    the given date, which has to be converted to a string. 
     *
     * @return  string representation of the date in the Charm Date Format (yyyy/MM/dd)
     */
    public static String getDateAsString(java.util.Date givenDate)
    {
        // Convert date to a string of the format CHARM_DATE_FORMAT.
        dateFormatter.applyPattern(CHARM_DATE_FORMAT);
        return dateFormatter.format(givenDate);
    }
    
    /**
     * This method converts a date represented as string in one of the following supported formats to a
     * Charm Date Format (yyyy/MM/dd). If the string date specified is not supported then a null is returned.
     *
     * <p>
     * The following is a list of supported string date formats that can be converted to Charm Date Format.
     * These fomats are used exactly in the order specified below to parse the given string date.
     * <pre>
     *      MM/dd/yy
     *      MM/dd/yyyy
     *      dd-MM-yy
     *      dd-MM-yyyy
     *      yyyy/MM/dd
     *      yyyy-MM-dd
     *      dd-MMM-yy
     *      dd-MMM-yyyy
     * </pre>
     * </p>
     *
     * @param   dateString     the string date to be converted. 
     *
     * @return  a date as a string in the yyyy/MM/dd format, or 
     *          null if the format of the given string date is not supported.
     */
    public static String convertToCharmDateFormat(String dateString)
    {
        String charmStringDate = null;
        
        // First, convert dateString into a date
        java.util.Date parsedDate = parse(dateString);
        
        if(parsedDate != null)
        {
            // Convert string date to a string of the format CHARM_DATE_FORMAT.
            dateFormatter.applyPattern(CHARM_DATE_FORMAT);
            charmStringDate = dateFormatter.format(parsedDate);
        }
        return charmStringDate;
    }

    /**
     * This method parses the given string date into a java.util.Date. If the string date specified
     * is not supported then a null is returned.
     *
     * @param dateString     the string date to be converted into a <code>java.util.Date</code> object.
     *
     * @return  a java.util.Date object, or 
     *          null if the format of the given string date is not supported.
     */
    public static java.util.Date parse(String dateString)
    {
        java.util.Date parsedDate = null;
        ParsePosition ppos = new ParsePosition(0);
        
        for(int i=0; i < VALID_DATE_FORMATS.length; i++)
        {
            dateFormatter.applyPattern(VALID_DATE_FORMATS[i]);
            parsedDate = dateFormatter.parse(dateString, ppos);
            if(parsedDate != null)
                break;
        }
        return parsedDate;
    }

    /**
     * This method prints each of the valid string date patterns. The supported patterns
     * for both the source and destination string representation of a date can be obtained by
     * calling the toString() method.
     *
     * @return   A string representing this class, including all valid string date patterns.
  	 */
	public static String getSupportedDateFormats()
	{
		StringBuffer sbuf = new StringBuffer();
		String ls = System.getProperty("line.separator");
		sbuf.append("MultiFormatDateConverter");
		sbuf.append(ls);
    	sbuf.append("------------------------");
    	sbuf.append(ls);
    	sbuf.append("Valid String Date Formats:");
     	sbuf.append(ls);

        // Append each valid string date pattern.
        for (int i=0; i < VALID_DATE_FORMATS.length; i++)
        {
        	sbuf.append(VALID_DATE_FORMATS[i]);
        	sbuf.append(ls);
        }
    	return sbuf.toString();
	}
}
