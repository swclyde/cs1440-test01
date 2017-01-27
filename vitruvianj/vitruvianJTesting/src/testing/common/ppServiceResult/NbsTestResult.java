package testing.common.ppServiceResult;

import java.io.Serializable;
import java.util.Date;
import vitruvianJ.serialization.Serialize;

public class NbsTestResult implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3636648386669921400L;

	private Integer sampleNumber;
	private Integer testNumber;
	private String analysis;
	private String resultName;
	private String result;
	private String resultUnits;
	private String inSpec;
	private String referenceRange;
	private String refRangeUnits;
	private String testCode;
	private String testCodeDesc;
	private String testCodeSet;
	private String answerCode;
	private String answerCodeDesc;
	private String answerCodeSet;
	private String resultStatus;
	private Date resultEnteredOn;
	
	@Serialize
	public Integer getSampleNumber() {
		return sampleNumber;
	}
	@Serialize
	public void setSampleNumber(Integer sampleNumber) {
		this.sampleNumber = sampleNumber;
	}
	@Serialize
	public Integer getTestNumber() {
		return testNumber;
	}
	@Serialize
	public void setTestNumber(Integer testNumber) {
		this.testNumber = testNumber;
	}
	@Serialize
	public String getAnalysis() {
		return analysis;
	}
	@Serialize
	public void setAnalysis(String analysis) {
		this.analysis = analysis;
	}
	@Serialize
	public String getResultName() {
		return resultName;
	}
	@Serialize
	public void setResultName(String resultName) {
		this.resultName = resultName;
	}
	@Serialize
	public String getResult() {
		return result;
	}
	@Serialize
	public void setResult(String result) {
		this.result = result;
	}
	@Serialize
	public String getResultUnits() {
		return resultUnits;
	}
	@Serialize
	public void setResultUnits(String resultUnits) {
		this.resultUnits = resultUnits;
	}
	@Serialize
	public String getInSpec() {
		return inSpec;
	}
	@Serialize
	public void setInSpec(String inSpec) {
		this.inSpec = inSpec;
	}
	@Serialize
	public String getReferenceRange() {
		return referenceRange;
	}
	@Serialize
	public void setReferenceRange(String referenceRange) {
		this.referenceRange = referenceRange;
	}
	@Serialize
	public String getRefRangeUnits() {
		return refRangeUnits;
	}
	@Serialize
	public void setRefRangeUnits(String refRangeUnits) {
		this.refRangeUnits = refRangeUnits;
	}
	@Serialize
	public String getTestCode() {
		return testCode;
	}
	@Serialize
	public void setTestCode(String testCode) {
		this.testCode = testCode;
	}
	@Serialize
	public String getTestCodeDesc() {
		return testCodeDesc;
	}
	@Serialize
	public void setTestCodeDesc(String testCodeDesc) {
		this.testCodeDesc = testCodeDesc;
	}
	@Serialize
	public String getTestCodeSet() {
		return testCodeSet;
	}
	@Serialize
	public void setTestCodeSet(String testCodeSet) {
		this.testCodeSet = testCodeSet;
	}
	@Serialize
	public String getAnswerCode() {
		return answerCode;
	}
	@Serialize
	public void setAnswerCode(String answerCode) {
		this.answerCode = answerCode;
	}
	@Serialize
	public String getAnswerCodeDesc() {
		return answerCodeDesc;
	}
	@Serialize
	public void setAnswerCodeDesc(String answerCodeDesc) {
		this.answerCodeDesc = answerCodeDesc;
	}
	@Serialize
	public String getAnswerCodeSet() {
		return answerCodeSet;
	}
	@Serialize
	public void setAnswerCodeSet(String answerCodeSet) {
		this.answerCodeSet = answerCodeSet;
	}
	@Serialize
	public String getResultStatus() {
		return resultStatus;
	}
	@Serialize
	public void setResultStatus(String resultStatus) {
		this.resultStatus = resultStatus;
	}
	@Serialize
	public Date getResultEnteredOn() {
		return resultEnteredOn;
	}
	@Serialize
	public void setResultEnteredOn(Date resultEnteredOn) {
		this.resultEnteredOn = resultEnteredOn;
	}
	
}