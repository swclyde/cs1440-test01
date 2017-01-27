package testing.common.ppServiceResult;

import java.io.Serializable;
import vitruvianJ.serialization.Serialize;
import java.util.ArrayList;
import java.util.Date;

public class NbsTest implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = 3480270216600157097L;
	
	private Integer sampleNumber;	
	private Integer testNumber;	
	private String analysis;
	private String reportedName;
	private String testCode;
	private String testCodeDesc;
	private String testCodeSet;
	private String testStatus;
	private String rptTestComment;
	private Date dateReviewed;
	private ArrayList<NbsTestResult> nbsTestResultList = new ArrayList<NbsTestResult>();

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
	public String getReportedName() {
		return reportedName;
	}
    @Serialize
	public void setReportedName(String reportedName) {
		this.reportedName = reportedName;
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
	public String getTestStatus() {
		return testStatus;
	}
    @Serialize
	public void setTestStatus(String testStatus) {
		this.testStatus = testStatus;
	}
    @Serialize
	public String getRptTestComment() {
		return rptTestComment;
	}
    @Serialize
	public void setRptTestComment(String rptTestComment) {
		this.rptTestComment = rptTestComment;
	}
    @Serialize
	public Date getDateReviewed() {
		return dateReviewed;
	}
    @Serialize
	public void setDateReviewed(Date dateReviewed) {
		this.dateReviewed = dateReviewed;
	}
	@Serialize
	public void setNbsTestResultList(ArrayList<NbsTestResult> nbsTestResultList) {
		this.nbsTestResultList = nbsTestResultList;
	}
    @Serialize
	public ArrayList<NbsTestResult> getNbsTestResultList() {
		return nbsTestResultList;
	}
}