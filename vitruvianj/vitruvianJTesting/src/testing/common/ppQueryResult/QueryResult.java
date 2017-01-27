package testing.common.ppQueryResult;

import java.io.Serializable;
import java.util.ArrayList;

import testing.common.ppServiceResult.PersonServiceResult;
import testing.common.ppServiceResult.ServiceResult;
import testing.common.userprofile.UDPClientProfile;
import testing.common.util.*;
import vitruvianJ.serialization.Serialize;


public class QueryResult implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final String STAUS_SUCCESS = "SUCCESS";
    public static final String STATUS_PARTIAL = "PARTIAL";
    public static final String STATUS_FAILURE = "FAILURE";
    public static final String STATUS_NOT_AVAILABLE = "NOT_AVAILABLE";
    public static final String STATUS_AUTHENTIFICATION_FAILURE = "AUTHENTIFICATION_FAILURE";
    public static final String STATUS_INVALID_QUERY_NAME = "INVALID_QUERY_NAME";
    public static final String STATUS_INVALID_PROGRAM_ID = "INVALID_PROGRAM_ID";
    
	private PersonServiceResult personSR; //remove charm id from it
	private ArrayList<ServiceResult> serviceResultList = new ArrayList<ServiceResult>();

	private String resultStatus; // partial, null, success
	private String errorMsg; 
	
	private UDPClientProfile udpClientProfile;
	private Integer programChildID;
	
	public String toXML()
	{
	    return 	XMLConvertor.convertToXMLString(this);
	}
	
	public String toString()
	{
	    return toXML();
	}

	@Serialize
	public void setPersonSR(PersonServiceResult personSR) {
		this.personSR = personSR;
	}

	@Serialize
	public PersonServiceResult getPersonSR() {
		return personSR;
	}

	@Serialize
	public void setServiceResultList(ArrayList<ServiceResult> serviceResultList) {
		this.serviceResultList = serviceResultList;
	}

	@Serialize
	public ArrayList<ServiceResult> getServiceResultList() {
		return serviceResultList;
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
	public void setUdpClientProfile(UDPClientProfile udpClientProfile) {
		this.udpClientProfile = udpClientProfile;
	}

	@Serialize
	public UDPClientProfile getUdpClientProfile() {
		return udpClientProfile;
	}

	@Serialize
	public void setProgramChildID(Integer programChildID) {
		this.programChildID = programChildID;
	}

	@Serialize
	public Integer getProgramChildID() {
		return programChildID;
	}
}
