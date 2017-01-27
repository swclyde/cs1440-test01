package testing.common.ppServiceResult;

import java.io.Serializable;
import java.util.ArrayList;

import vitruvianJ.serialization.Serialize;

public class EIIFSP implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2927114580462630905L;
	private String startDate;
	private String endDate;
	
	private ArrayList <IFSPService> IFSPServiceList = new ArrayList<IFSPService>();

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


	@Serialize
	public void setIFSPServiceList(ArrayList <IFSPService> IFSPServiceList) {
		this.IFSPServiceList = IFSPServiceList;
	}

	@Serialize
	public ArrayList <IFSPService> getIFSPServiceList() {
		return IFSPServiceList;
	}

	
}
