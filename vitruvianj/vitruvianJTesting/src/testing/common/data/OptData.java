package testing.common.data;

import vitruvianJ.serialization.Serialize;

public class OptData implements java.io.Serializable{

	private Long optid;
	private Long charmid;
	private String opttype;
	private String serviceName;
	private String requestingProgramName;
	private String serviceGroupName;
	private String requestingProgramGroupName;
	
	@Serialize
	public void setCharmid(Long charmid) {
		this.charmid = charmid;
	}
	@Serialize
	public Long getCharmid() {
		return charmid;
	}
	@Serialize
	public void setOpttype(String opttype) {
		this.opttype = opttype;
	}
	@Serialize
	public String getOpttype() {
		return opttype;
	}
	@Serialize
	public void setOptid(Long optid) {
		this.optid = optid;
	}
	@Serialize
	public Long getOptid() {
		return optid;
	}
	@Serialize
	public void setServiceName(String service) {
		this.serviceName = service;
	}
	@Serialize
	public String getServiceName() {
		return serviceName;
	}
	@Serialize
	public void setRequestingProgramName(String requestingProgram) {
		this.requestingProgramName = requestingProgram;
	}
	@Serialize
	public String getRequestingProgramName() {
		return requestingProgramName;
	}
	@Serialize
	public void setServiceGroupName(String serviceGroupName) {
		this.serviceGroupName = serviceGroupName;
	}
	@Serialize
	public String getServiceGroupName() {
		return serviceGroupName;
	}
	@Serialize
	public void setRequestingProgramGroupName(String requestingProgramGroupName) {
		this.requestingProgramGroupName = requestingProgramGroupName;
	}
	@Serialize
	public String getRequestingProgramGroupName() {
		return requestingProgramGroupName;
	}
	
	
}
