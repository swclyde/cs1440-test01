package testing.common.ppServiceResult;

import java.io.Serializable;

import vitruvianJ.serialization.Serialize;


public class Test extends Event  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7910562237745916099L;
	private	String	babyStage	;
	private	String	ear	;
	private	String	facilityName	;
	private	String	screenerName	;
	private	String	testDate	;
	private	String	testResultDescription	;
	private	String	testTypeDescription	;
	
	@Serialize
	public void setBabyStage(String babyStage) {
		this.babyStage = babyStage;
	}
	@Serialize
	public String getBabyStage() {
		return babyStage;
	}
	@Serialize
	public void setEar(String ear) {
		this.ear = ear;
	}
	@Serialize
	public String getEar() {
		return ear;
	}
	@Serialize
	public void setFacilityName(String facilityName) {
		this.facilityName = facilityName;
	}
	@Serialize
	public String getFacilityName() {
		return facilityName;
	}
	@Serialize
	public void setScreenerName(String screenerName) {
		this.screenerName = screenerName;
	}
	@Serialize
	public String getScreenerName() {
		return screenerName;
	}
	@Serialize
	public void setTestDate(String testDate) {
		this.testDate = testDate;
	}
	@Serialize
	public String getTestDate() {
		return testDate;
	}
	@Serialize
	public void setTestResultDescription(String testResultDescription) {
		this.testResultDescription = testResultDescription;
	}
	@Serialize
	public String getTestResultDescription() {
		return testResultDescription;
	}
	@Serialize
	public void setTestTypeDescription(String testTypeDescription) {
		this.testTypeDescription = testTypeDescription;
	}
	@Serialize
	public String getTestTypeDescription() {
		return testTypeDescription;
	}

}
