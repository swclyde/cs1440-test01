package testing.common.ppServiceResult;

import java.io.Serializable;
import java.util.ArrayList;

import testing.common.util.*;
import vitruvianJ.serialization.Serialize;
import vitruvianJ.serialization.xml.SimpleXml;

public class ServiceResult implements Serializable{
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 6968422086450968129L;
	public static final String STATUS_SUCCESS = "SUCCESS";
     public static final String STATUS_PARTIAL = "PARTIAL";
     public static final String STATUS_FAILURE = "FAILURE";
     public static final String STATUS_NOT_AVAILABLE = "NOT_AVAILABLE";
     
     public static final String PROGRAM_CHARMCORE = "CHARM_CORE";
	 public static final String PROGRAM_VS = "VS";
	 public static final String PROGRAM_VS2008 = "VS2008";
	 public static final String PROGRAM_EHDI = "EHDI";
	 public static final String PROGRAM_USIIS = "USIIS";
	 public static final String PROGRAM_ORS = "ORS";
	 public static final String PROGRAM_EI = "EI";
	 public static final String PROGRAM_NBS = "NBS";
	
	 public static final String PROGRAM_ID_CHARMCORE = "0";
	 public static final String PROGRAM_ID_VS = "1";
	 public static final String PROGRAM_ID_VS2008 = "7";
	 public static final String PROGRAM_ID_EHDI = "2";
	 public static final String PROGRAM_ID_USIIS = "3";
	 public static final String PROGRAM_ID_ORS = "4";
	 public static final String PROGRAM_ID_EI = "5";
	 public static final String PROGRAM_ID_NBS = "6";
	
	 private String originatingProgram;
	
	 private String resultStatus; //should setted by agent
	 private String errorMsg; //Agent will use this string to indicate the real error when the status is failure/not_available/partial
	
	 private Integer programChildID;
	 private Long charmID;
	 
	 private ArrayList<AlternateID> alternateIds = new ArrayList<AlternateID>();
	
	 public ServiceResult()
	 {
	 }
	
	public ServiceResult(String originatingProgram, Long charmID)
	{
	    this.originatingProgram = originatingProgram;
	    this.charmID = charmID;
	}
		
	public ServiceResult(String originatingProgram, Long charmID, String status)
	{
	    this.originatingProgram = originatingProgram;
	    this.charmID = charmID;
	    this.resultStatus = status;
	}
	
	public String getPPID()
	{
	    if (originatingProgram == null)
	        return null;
	    else if (originatingProgram == PROGRAM_CHARMCORE)
	        return PROGRAM_ID_CHARMCORE;	  
	    else if (originatingProgram == PROGRAM_VS)
	        return PROGRAM_ID_VS;	        
	    else if (originatingProgram == PROGRAM_EHDI)
	        return PROGRAM_ID_EHDI;
	    else if (originatingProgram == PROGRAM_USIIS)
	        return PROGRAM_ID_USIIS;
	    else if (originatingProgram == PROGRAM_ORS)
	        return PROGRAM_ID_ORS;
	    else if (originatingProgram == PROGRAM_EI)
	        return PROGRAM_ID_EI;
	    else if (originatingProgram == PROGRAM_NBS)
	        return PROGRAM_ID_NBS;
	    else
	        return null;
	        
	}
		
	public String toXML()
	{
	    return 	XMLConvertor.convertToXMLString(this);
	}
	
	public String toString()
	{
		//return super.toString();
	    return toXML();
	}

	@Serialize
	public void setOriginatingProgram(String originatingProgram) {
		this.originatingProgram = originatingProgram;
	}

	@Serialize
	public String getOriginatingProgram() {
		return originatingProgram;
	}

	@Serialize
	public void setResultStatus(String resultStatus) {
		this.resultStatus = resultStatus;
	}

	@Serialize
	public String getResultStatus() {
		return resultStatus;
	}

	@Serialize
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	@Serialize
	public String getErrorMsg() {
		return errorMsg;
	}

	@Serialize
	public void setProgramChildID(Integer programChildID) {
		this.programChildID = programChildID;
	}

	@Serialize
	public Integer getProgramChildID() {
		return programChildID;
	}

	@Serialize
	public void setCharmID(Long charmID) {
		this.charmID = charmID;
	}

	@Serialize
	public Long getCharmID() {
		return charmID;
	}

	@Serialize
	public void setAlternateIds(ArrayList<AlternateID> alternateIds) {
		this.alternateIds = alternateIds;
	}

	@SimpleXml(name="AlternateIDList")
	@Serialize
	public ArrayList<AlternateID> getAlternateIds() {
		return alternateIds;
	}
}
