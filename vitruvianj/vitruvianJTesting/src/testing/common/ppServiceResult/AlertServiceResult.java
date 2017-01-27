package testing.common.ppServiceResult;

import java.io.Serializable;
import java.util.ArrayList;


import testing.common.data.AlertData;
import testing.common.ppServiceResult.ServiceResult;
import vitruvianJ.serialization.Serialize;

public class AlertServiceResult extends ServiceResult implements Serializable{
	
	/** 
	 * 
	 */
	private static final long serialVersionUID = 8289678525838338295L;
	/**
	 * 
	 */
	private ArrayList<AlertData> alertList = new ArrayList<AlertData>();
	
	
	@Serialize
	public void setAlertList(ArrayList<AlertData> alertList) {
		this.alertList = alertList;
	}
	@Serialize
	public ArrayList<AlertData> getAlertList() {
		return alertList;
	}

}
