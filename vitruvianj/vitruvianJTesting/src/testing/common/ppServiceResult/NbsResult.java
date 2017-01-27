package testing.common.ppServiceResult;

import java.io.Serializable;

import vitruvianJ.serialization.Serialize;

public class NbsResult implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6003537790420996673L;

	private String lastName;
	private String firstName;
	private String gender;
	private String birthDate;
	private String newBornScreeningNumber;
	private String motherFirstName;
	private String motherLastName;
	private String specimenType; 
    private String textID;
    private String dateCollected;
    private String dateReceived;
	private String chartNumber;
    private String dateCompleted;
	private String enteredOn;
	private String formatedEntry;
	private String analysis;
	private String testStatus;
	private String testNumber;
	private String rptTestComment;
	private String originalSample;   
	private String sampleNumber;
	private String resName;   
	private String reviewNote;
	private String contactName;
	private String organization;
	private String streetAddress;
	private String city;
	private String state;
    private String zip;
    
    @Serialize
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
    @Serialize
	public String getLastName() {
		return lastName;
	}
	@Serialize
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	@Serialize
	public String getFirstName() {
		return firstName;
	}
	@Serialize
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Serialize
	public String getGender() {
		return gender;
	}
	@Serialize
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	@Serialize
	public String getBirthDate() {
		return birthDate;
	}
	@Serialize
	public void setNewBornScreeningNumber(String newBornScreeningNumber) {
		this.newBornScreeningNumber = newBornScreeningNumber;
	}
	@Serialize
	public String getNewBornScreeningNumber() {
		return newBornScreeningNumber;
	}
	@Serialize
	public void setMomLastName(String momLastName) {
		this.motherLastName = momLastName;
	}
    @Serialize
	public String getMomLastName() {
		return motherLastName;
	}
	@Serialize
	public void setMomFirstName(String momFirstName) {
		this.motherFirstName = momFirstName;
	}
    @Serialize
	public String getMomFirstName() {
		return motherFirstName;
	}
	@Serialize
	public void setSpecimenType(String specimenType) {
		this.specimenType = specimenType;
	}
	@Serialize
	public String getSpecimenType() {
		return specimenType;
	}
	@Serialize
	public void setTextID(String textID) {
		this.textID = textID;
	}
	@Serialize
	public String getTextID() {
		return textID;
	}
	@Serialize
	public void setDateCollected(String dateCollected) {
		this.dateCollected = dateCollected;
	}
	@Serialize
	public String getDateCollected() {
		return dateCollected;
	}
	@Serialize
	public void setDateReceived(String dateReceived) {
		this.dateReceived = dateReceived;
	}
	@Serialize
	public String getDateReceived() {
		return dateReceived;
	}
	@Serialize
	public void setChartNumber(String chartNumber) {
		this.chartNumber = chartNumber;
	}
	@Serialize
	public String getChartNumber() {
		return chartNumber;
	}
	@Serialize
	public void setDateCompleted(String dateCompleted) {
		this.dateCompleted = dateCompleted;
	}
	@Serialize
	public String getDateCompleted() {
		return dateCompleted;
	}
	@Serialize
	public void setEnteredOn(String enteredOn) {
		this.enteredOn = enteredOn;
	}
	@Serialize
	public String getEnteredOn() {
		return enteredOn;
	}
	@Serialize
	public void setFormatedEntry(String formatedEntry) {
		this.formatedEntry = formatedEntry;
	}
	@Serialize
	public String getFormatedEntry() {
		return formatedEntry;
	}
	@Serialize
	public void setAnalysis(String analysis) {
		this.analysis = analysis;
	}
	@Serialize
	public String getAnalysis() {
		return analysis;
	}
	@Serialize
	public void setTestStatus(String testStatus) {
		this.testStatus = testStatus;
	}
	@Serialize
	public String getTestStatus() {
		return testStatus;
	}
	@Serialize
	public void setTestNumber(String testNumber) {
		this.testNumber = testNumber;
	}
	@Serialize
	public String getTestNumber() {
		return testNumber;
	}
	@Serialize
	public void setRptTestComment(String rptTestComment) {
		this.rptTestComment = rptTestComment;
	}
	@Serialize
	public String getRptTestComment() {
		return rptTestComment;
	}
	@Serialize
	public void setOriginalSample(String originalSample) {
		this.originalSample = originalSample;
	}
	@Serialize
	public String getOriginalSample() {
		return originalSample;
	}
	@Serialize
	public void setSampleNumber(String sampleNumber) {
		this.sampleNumber = sampleNumber;
	}
	@Serialize
	public String getSampleNumber() {
		return sampleNumber;
	}
	@Serialize
	public void setResName(String resName) {
		this.resName = resName;
	}
	@Serialize
	public String getResName() {
		return resName;
	}
	@Serialize
	public void setReviewNote(String reviewNote) {
		this.reviewNote = reviewNote;
	}
	@Serialize
	public String getReviewNote() {
		return reviewNote;
	}	
	@Serialize
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	@Serialize
	public String getContactName() {
		return contactName;
	}
	@Serialize
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	@Serialize
	public String getOrganization() {
		return organization;
	}
	@Serialize
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	@Serialize
	public String getStreetAddress() {
		return streetAddress;
	}
	@Serialize
	public void setCity(String city) {
		this.city = city;
	}
	@Serialize
	public String getCity() {
		return city;
	}
	@Serialize
	public void setState(String state) {
		this.state = state;
	}
	@Serialize
	public String getState() {
		return state;
	}
	@Serialize
	public void setZip(String zip) {
		this.zip = zip;
	}
	@Serialize
	public String getZip() {
		return zip;
	}

}
