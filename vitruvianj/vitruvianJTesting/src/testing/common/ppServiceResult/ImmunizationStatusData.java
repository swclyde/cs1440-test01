package testing.common.ppServiceResult;

import java.io.Serializable;

import vitruvianJ.serialization.Serialize;

public class ImmunizationStatusData implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7338931928966455133L;
	private	String	seriesName	;
	private	String	nextDueDate	;
	private	String	status	;
	private	String	exempt	;
	private	String	contra	;
	
	
	@Serialize
	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}
	@Serialize
	public String getSeriesName() {
		return seriesName;
	}
	@Serialize
	public void setNextDueDate(String nextDueDate) {
		this.nextDueDate = nextDueDate;
	}
	@Serialize
	public String getNextDueDate() {
		return nextDueDate;
	}
	@Serialize
	public void setStatus(String status) {
		this.status = status;
	}
	@Serialize
	public String getStatus() {
		return status;
	}
	@Serialize
	public void setExempt(String exempt) {
		this.exempt = exempt;
	}
	@Serialize
	public String getExempt() {
		return exempt;
	}
	@Serialize
	public void setContra(String contra) {
		this.contra = contra;
	}
	@Serialize
	public String getContra() {
		return contra;
	}
	
}
