package testing.common.ppServiceResult;

import java.io.Serializable;

import vitruvianJ.serialization.Serialize;

public class IFSPService implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6848164010153801199L;
	private String serviceCategory;
	private String startDate;
	private String endDate;
	
	@Serialize
	public void setServiceCategory(String serviceCategory) {
		this.serviceCategory = serviceCategory;
	}
	@Serialize
	public String getServiceCategory() {
		return serviceCategory;
	}
	@Serialize
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	@Serialize
	public String getStartDate() {
		return startDate;
	}
	@Serialize
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	@Serialize
	public String getEndDate() {
		return endDate;
	}

}
