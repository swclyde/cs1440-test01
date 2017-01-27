package testing.common.ppServiceResult;

import java.io.Serializable;

import vitruvianJ.serialization.Serialize;

public class MostConclusiveResult implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1385561617039435926L;
	private	String	testDate	;
	private	String	testResultDescription	;
	private	String	testTypeDescription	;
	private	String	usedMethod	;
	
	
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
	@Serialize
	public void setUsedMethod(String usedMethod) {
		this.usedMethod = usedMethod;
	}
	@Serialize
	public String getUsedMethod() {
		return usedMethod;
	}

}
