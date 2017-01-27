package testing.common.userprofile;

import vitruvianJ.serialization.Serialize;

public class UDPClientProfile {

	private String requestID;
	private String timestamp;
	private String userLogin;
	private String password;
	private String ppName;
	private String programID;
	
	@Serialize
	public void setRequestID(String requestID) {
		this.requestID = requestID;
	}
	@Serialize
	public String getRequestID() {
		return requestID;
	}
	@Serialize
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	@Serialize
	public String getTimestamp() {
		return timestamp;
	}
	@Serialize
	public void setUserLogin(String userLogin) {
		this.userLogin = userLogin;
	}
	@Serialize
	public String getUserLogin() {
		return userLogin;
	}
	@Serialize
	public void setPassword(String password) {
		this.password = password;
	}
	@Serialize
	public String getPassword() {
		return password;
	}
	@Serialize
	public void setPpName(String ppName) {
		this.ppName = ppName;
	}
	@Serialize
	public String getPpName() {
		return ppName;
	}
	@Serialize
	public void setProgramID(String programID) {
		this.programID = programID;
	}
	@Serialize
	public String getProgramID() {
		return programID;
	}
	
	
}
