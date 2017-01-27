package testing.common.ppServiceResult;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import vitruvianJ.serialization.Serialize;

public class NbsSample implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6323829780206600899L;
	
	/* data from NBS_CARD */
	private String nbsNumber;
	private String specimenType; 
    private String rejectReason;
    private String transfusion;
	private Date transfusionDate;
    private String tpn;
	private String prematureSick;
	private String textId;
	private Date dateReceived;
	private Date cardChangedOn;
	private String cardBabysLastName;
	private String cardBabysFirstName;
	private String cardBabysSex;
	private String cardAdoption;
	private String cardMothersState;

	/* data from NBS_KIT */
	private Date changedOn;
	private String babysLastName;
	private String babysFirstName;
	private String babysSex; 
	private Integer birthWeight;
	private String adoption;
	private Date birthDate;
	private String birthplaceType;
	private Integer birthplace;
	private String multipleBirth;
	private String babyExpired;
	private Date dateOfDeath;
	private String mothersLastName;
	private String mothersFirstName;
	private String mothersMaidenName;
	private String mothersAddress;
	private String mothersCity;
	private String mothersState;
	private String mothersZip;
	private Date mothersBirthDate;
	private String mothersPhoneNo;
	private String fathersLastName;
	private String fathersFirstName; 

	/* data from sample */
	private String reviewNote;
	private Integer sampleNumber;
	private Date loginDate;
	private Date dateCompleted;
	private String birthplaceOrganization;
	private String birthplaceStreetAddr;
	private String birthplaceCity;
	private String birthplaceState;
	private String birthplaceCountry;
	private String birthplaceZip;
	private String birthplaceTelCountryCode;
	private String birthplaceTelAreaCode;
	private String birthplacePhone;
	private String birthplaceExtension;
	private String birthplaceCellAreaCode;
	private String birthplaceCellNumber;
	private String birthplaceFaxAreaCode;
	private String birthplaceFaxNumber;
	private String birthplaceFaxExtension;
	private String birthplaceEmailAddr;
	private String birthplaceCode;
	private String birthplaceContactName;
	
	private String physicianFirstName;
	private String physicianMidInit;
	private String physicianLastName;
	private String physicianNameSufx;
	private String physicianTitle;
	private String physicianOrganization;
	private String physicianStreetAddr;
	private String physicianCity;
	private String physicianState;
	private String physicianCountry;
	private String physicianZip;
	private String physicianTelCountryCode;
	private String physicianTelAreaCode;
	private String physicianPhone;
	private String physicianExtension;
	private String physicianCellAreaCode;
	private String physicianCellNumber;
	private String physicianFaxAreaCode;
	private String physicianFaxNumber;
	private String physicianFaxExtension;
	private String physicianEmailAddr;
	private String physicianCode;
	private String physicianContactName;
	
    private ArrayList<NbsTest> nbsTestList = new ArrayList<NbsTest>();
    	
    @Serialize
    public String getNbsNumber() {
		return nbsNumber;
	}
    @Serialize
	public void setNbsNumber(String nbsNumber) {
		this.nbsNumber = nbsNumber;
	}
    @Serialize
	public String getSpecimenType() {
		return specimenType;
	}
    @Serialize
	public void setSpecimenType(String specimenType) {
		this.specimenType = specimenType;
	}
    @Serialize
	public String getRejectReason() {
		return rejectReason;
	}
    @Serialize
	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}
    @Serialize
	public String getTransfusion() {
		return transfusion;
	}
    @Serialize
	public void setTransfusion(String transfusion) {
		this.transfusion = transfusion;
	}
    @Serialize
	public Date getTransfusionDate() {
		return transfusionDate;
	}
    @Serialize
	public void setTransfusionDate(Date transfusionDate) {
		this.transfusionDate = transfusionDate;
	}
    @Serialize
	public String getTpn() {
		return tpn;
	}
    @Serialize
	public void setTpn(String tpn) {
		this.tpn = tpn;
	}
    @Serialize
	public String getPrematureSick() {
		return prematureSick;
	}
    @Serialize
	public void setPrematureSick(String prematureSick) {
		this.prematureSick = prematureSick;
	}
    @Serialize
	public String getTextId() {
		return textId;
	}
    @Serialize
	public void setTextId(String textId) {
		this.textId = textId;
	}
    @Serialize
	public Date getDateReceived() {
		return dateReceived;
	}
    @Serialize
	public void setDateReceived(Date dateReceived) {
		this.dateReceived = dateReceived;
	}
    @Serialize
	public Date getCardChangedOn() {
		return cardChangedOn;
	}
    @Serialize
	public void setCardChangedOn(Date cardChangedOn) {
		this.cardChangedOn = cardChangedOn;
	}
    @Serialize
	public String getCardBabysLastName() {
		return cardBabysLastName;
	}
    @Serialize
	public void setCardBabysLastName(String cardBabysLastName) {
		this.cardBabysLastName = cardBabysLastName;
	}
    @Serialize
	public String getCardBabysFirstName() {
		return cardBabysFirstName;
	}
    @Serialize
	public void setCardBabysFirstName(String cardBabysFirstName) {
		this.cardBabysFirstName = cardBabysFirstName;
	}
    @Serialize
	public String getCardBabysSex() {
		return cardBabysSex;
	}
    @Serialize
	public void setCardBabysSex(String cardBabysSex) {
		this.cardBabysSex = cardBabysSex;
	}
    @Serialize
	public String getCardAdoption() {
		return cardAdoption;
	}
    @Serialize
	public void setCardAdoption(String cardAdoption) {
		this.cardAdoption = cardAdoption;
	}
    @Serialize
	public String getCardMothersState() {
		return cardMothersState;
	}
    @Serialize
	public void setCardMothersState(String cardMothersState) {
		this.cardMothersState = cardMothersState;
	}
    @Serialize
	public Date getChangedOn() {
		return changedOn;
	}
    @Serialize
	public void setChangedOn(Date changedOn) {
		this.changedOn = changedOn;
	}
    @Serialize
	public String getBabysLastName() {
		return babysLastName;
	}
    @Serialize
	public void setBabysLastName(String babysLastName) {
		this.babysLastName = babysLastName;
	}
    @Serialize
	public String getBabysFirstName() {
		return babysFirstName;
	}
    @Serialize
	public void setBabysFirstName(String babysFirstName) {
		this.babysFirstName = babysFirstName;
	}
    @Serialize
	public String getBabysSex() {
		return babysSex;
	}
    @Serialize
	public void setBabysSex(String babysSex) {
		this.babysSex = babysSex;
	}
    @Serialize
	public Integer getBirthWeight() {
		return birthWeight;
	}
    @Serialize
	public void setBirthWeight(Integer birthWeight) {
		this.birthWeight = birthWeight;
	}
    @Serialize
	public String getAdoption() {
		return adoption;
	}
    @Serialize
	public void setAdoption(String adoption) {
		this.adoption = adoption;
	}
    @Serialize
	public Date getBirthDate() {
		return birthDate;
	}
    @Serialize
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
    @Serialize
	public String getBirthplaceType() {
		return birthplaceType;
	}
    @Serialize
	public void setBirthplaceType(String birthplaceType) {
		this.birthplaceType = birthplaceType;
	}
    @Serialize
	public Integer getBirthplace() {
		return birthplace;
	}
    @Serialize
	public void setBirthplace(Integer birthplace) {
		this.birthplace = birthplace;
	}
    @Serialize
	public String getMultipleBirth() {
		return multipleBirth;
	}
    @Serialize
	public void setMultipleBirth(String multipleBirth) {
		this.multipleBirth = multipleBirth;
	}
    @Serialize
	public String getBabyExpired() {
		return babyExpired;
	}
    @Serialize
	public void setBabyExpired(String babyExpired) {
		this.babyExpired = babyExpired;
	}
    @Serialize
	public Date getDateOfDeath() {
		return dateOfDeath;
	}
    @Serialize
	public void setDateOfDeath(Date dateOfDeath) {
		this.dateOfDeath = dateOfDeath;
	}
    @Serialize
	public String getMothersLastName() {
		return mothersLastName;
	}
    @Serialize
	public void setMothersLastName(String mothersLastName) {
		this.mothersLastName = mothersLastName;
	}
    @Serialize
	public String getMothersFirstName() {
		return mothersFirstName;
	}
    @Serialize
	public void setMothersFirstName(String mothersFirstName) {
		this.mothersFirstName = mothersFirstName;
	}
    @Serialize
	public String getMothersMaidenName() {
		return mothersMaidenName;
	}
    @Serialize
	public void setMothersMaidenName(String mothersMaidenName) {
		this.mothersMaidenName = mothersMaidenName;
	}
    @Serialize
	public String getMothersAddress() {
		return mothersAddress;
	}
    @Serialize
	public void setMothersAddress(String mothersAddress) {
		this.mothersAddress = mothersAddress;
	}
    @Serialize
	public String getMothersCity() {
		return mothersCity;
	}
    @Serialize
	public void setMothersCity(String mothersCity) {
		this.mothersCity = mothersCity;
	}
    @Serialize
	public String getMothersState() {
		return mothersState;
	}
    @Serialize
	public void setMothersState(String mothersState) {
		this.mothersState = mothersState;
	}
    @Serialize
	public String getMothersZip() {
		return mothersZip;
	}
    @Serialize
	public void setMothersZip(String mothersZip) {
		this.mothersZip = mothersZip;
	}
    @Serialize
	public Date getMothersBirthDate() {
		return mothersBirthDate;
	}
    @Serialize
	public void setMothersBirthDate(Date mothersBirthDate) {
		this.mothersBirthDate = mothersBirthDate;
	}
    @Serialize
	public String getMothersPhoneNo() {
		return mothersPhoneNo;
	}
    @Serialize
	public void setMothersPhoneNo(String mothersPhoneNo) {
		this.mothersPhoneNo = mothersPhoneNo;
	}
    @Serialize
	public String getFathersLastName() {
		return fathersLastName;
	}
    @Serialize
	public void setFathersLastName(String fathersLastName) {
		this.fathersLastName = fathersLastName;
	}
    @Serialize
	public String getFathersFirstName() {
		return fathersFirstName;
	}
    @Serialize
	public void setFathersFirstName(String fathersFirstName) {
		this.fathersFirstName = fathersFirstName;
	}
    @Serialize
	public String getReviewNote() {
		return reviewNote;
	}
    @Serialize
	public void setReviewNote(String reviewNote) {
		this.reviewNote = reviewNote;
	}
    @Serialize
	public Integer getSampleNumber() {
		return sampleNumber;
	}
    @Serialize
	public void setSampleNumber(Integer sampleNumber) {
		this.sampleNumber = sampleNumber;
	}
    @Serialize
	public Date getLoginDate() {
		return loginDate;
	}
    @Serialize
	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
	}
    @Serialize
	public Date getDateCompleted() {
		return dateCompleted;
	}
    @Serialize
	public void setDateCompleted(Date dateCompleted) {
		this.dateCompleted = dateCompleted;
	}
    @Serialize
	public String getBirthplaceOrganization() {
		return birthplaceOrganization;
	}
    @Serialize
	public void setBirthplaceOrganization(String birthplaceOrganization) {
		this.birthplaceOrganization = birthplaceOrganization;
	}
    @Serialize
	public String getBirthplaceStreetAddr() {
		return birthplaceStreetAddr;
	}
    @Serialize
	public void setBirthplaceStreetAddr(String birthplaceStreetAddr) {
		this.birthplaceStreetAddr = birthplaceStreetAddr;
	}
    @Serialize
	public String getBirthplaceCity() {
		return birthplaceCity;
	}
    @Serialize
	public void setBirthplaceCity(String birthplaceCity) {
		this.birthplaceCity = birthplaceCity;
	}
    @Serialize
	public String getBirthplaceState() {
		return birthplaceState;
	}
    @Serialize
	public void setBirthplaceState(String birthplaceState) {
		this.birthplaceState = birthplaceState;
	}
    @Serialize
	public String getBirthplaceCountry() {
		return birthplaceCountry;
	}
    @Serialize
	public void setBirthplaceCountry(String birthplaceCountry) {
		this.birthplaceCountry = birthplaceCountry;
	}
    @Serialize
	public String getBirthplaceZip() {
		return birthplaceZip;
	}
    @Serialize
	public void setBirthplaceZip(String birthplaceZip) {
		this.birthplaceZip = birthplaceZip;
	}
    @Serialize
	public String getBirthplaceTelCountryCode() {
		return birthplaceTelCountryCode;
	}
    @Serialize
	public void setBirthplaceTelCountryCode(String birthplaceTelCountryCode) {
		this.birthplaceTelCountryCode = birthplaceTelCountryCode;
	}
    @Serialize
	public String getBirthplaceTelAreaCode() {
		return birthplaceTelAreaCode;
	}
    @Serialize
	public void setBirthplaceTelAreaCode(String birthplaceTelAreaCode) {
		this.birthplaceTelAreaCode = birthplaceTelAreaCode;
	}
    @Serialize
	public String getBirthplacePhone() {
		return birthplacePhone;
	}
    @Serialize
	public void setBirthplacePhone(String birthplacePhone) {
		this.birthplacePhone = birthplacePhone;
	}
    @Serialize
	public String getBirthplaceExtension() {
		return birthplaceExtension;
	}
    @Serialize
	public void setBirthplaceExtension(String birthplaceExtension) {
		this.birthplaceExtension = birthplaceExtension;
	}
    @Serialize
	public String getBirthplaceCellAreaCode() {
		return birthplaceCellAreaCode;
	}
    @Serialize
	public void setBirthplaceCellAreaCode(String birthplaceCellAreaCode) {
		this.birthplaceCellAreaCode = birthplaceCellAreaCode;
	}
    @Serialize
	public String getBirthplaceCellNumber() {
		return birthplaceCellNumber;
	}
    @Serialize
	public void setBirthplaceCellNumber(String birthplaceCellNumber) {
		this.birthplaceCellNumber = birthplaceCellNumber;
	}
    @Serialize
	public String getBirthplaceFaxAreaCode() {
		return birthplaceFaxAreaCode;
	}
    @Serialize
	public void setBirthplaceFaxAreaCode(String birthplaceFaxAreaCode) {
		this.birthplaceFaxAreaCode = birthplaceFaxAreaCode;
	}
    @Serialize
	public String getBirthplaceFaxNumber() {
		return birthplaceFaxNumber;
	}
    @Serialize
	public void setBirthplaceFaxNumber(String birthplaceFaxNumber) {
		this.birthplaceFaxNumber = birthplaceFaxNumber;
	}
    @Serialize
	public String getBirthplaceFaxExtension() {
		return birthplaceFaxExtension;
	}
    @Serialize
	public void setBirthplaceFaxExtension(String birthplaceFaxExtension) {
		this.birthplaceFaxExtension = birthplaceFaxExtension;
	}
    @Serialize
	public String getBirthplaceEmailAddr() {
		return birthplaceEmailAddr;
	}
    @Serialize
	public void setBirthplaceEmailAddr(String birthplaceEmailAddr) {
		this.birthplaceEmailAddr = birthplaceEmailAddr;
	}
    @Serialize
	public String getBirthplaceCode() {
		return birthplaceCode;
	}
    @Serialize
	public void setBirthplaceCode(String birthplaceCode) {
		this.birthplaceCode = birthplaceCode;
	}
    @Serialize
	public String getBirthplaceContactName() {
		return birthplaceContactName;
	}
    @Serialize
	public void setBirthplaceContactName(String birthplaceContactName) {
		this.birthplaceContactName = birthplaceContactName;
	}
    @Serialize
	public String getPhysicianFirstName() {
		return physicianFirstName;
	}
    @Serialize
	public void setPhysicianFirstName(String physicianFirstName) {
		this.physicianFirstName = physicianFirstName;
	}
    @Serialize
	public String getPhysicianMidInit() {
		return physicianMidInit;
	}
    @Serialize
	public void setPhysicianMidInit(String physicianMidInit) {
		this.physicianMidInit = physicianMidInit;
	}
    @Serialize
	public String getPhysicianLastName() {
		return physicianLastName;
	}
    @Serialize
	public void setPhysicianLastName(String physicianLastName) {
		this.physicianLastName = physicianLastName;
	}
    @Serialize
	public String getPhysicianTitle() {
		return physicianTitle;
	}
    @Serialize
	public void setPhysicianTitle(String physicianTitle) {
		this.physicianTitle = physicianTitle;
	}
    @Serialize
	public String getPhysicianOrganization() {
		return physicianOrganization;
	}
    @Serialize
	public void setPhysicianOrganization(String physicianOrganization) {
		this.physicianOrganization = physicianOrganization;
	}
    @Serialize
	public String getPhysicianStreetAddr() {
		return physicianStreetAddr;
	}
    @Serialize
	public void setPhysicianStreetAddr(String physicianStreetAddr) {
		this.physicianStreetAddr = physicianStreetAddr;
	}
    @Serialize
	public String getPhysicianCity() {
		return physicianCity;
	}
    @Serialize
	public void setPhysicianCity(String physicianCity) {
		this.physicianCity = physicianCity;
	}
    @Serialize
	public String getPhysicianState() {
		return physicianState;
	}
    @Serialize
	public void setPhysicianState(String physicianState) {
		this.physicianState = physicianState;
	}
    @Serialize
	public String getPhysicianCountry() {
		return physicianCountry;
	}
    @Serialize
	public void setPhysicianCountry(String physicianCountry) {
		this.physicianCountry = physicianCountry;
	}
    @Serialize
	public String getPhysicianZip() {
		return physicianZip;
	}
    @Serialize
	public void setPhysicianZip(String physicianZip) {
		this.physicianZip = physicianZip;
	}
    @Serialize
	public String getPhysicianTelCountryCode() {
		return physicianTelCountryCode;
	}
    @Serialize
	public void setPhysicianTelCountryCode(String physicianTelCountryCode) {
		this.physicianTelCountryCode = physicianTelCountryCode;
	}
    @Serialize
	public String getPhysicianTelAreaCode() {
		return physicianTelAreaCode;
	}
    @Serialize
	public void setPhysicianTelAreaCode(String physicianTelAreaCode) {
		this.physicianTelAreaCode = physicianTelAreaCode;
	}
    @Serialize
	public String getPhysicianPhone() {
		return physicianPhone;
	}
    @Serialize
	public void setPhysicianPhone(String physicianPhone) {
		this.physicianPhone = physicianPhone;
	}
    @Serialize
	public String getPhysicianExtension() {
		return physicianExtension;
	}
    @Serialize
	public void setPhysicianExtension(String physicianExtension) {
		this.physicianExtension = physicianExtension;
	}
    @Serialize
	public String getPhysicianCellAreaCode() {
		return physicianCellAreaCode;
	}
    @Serialize
	public void setPhysicianCellAreaCode(String physicianCellAreaCode) {
		this.physicianCellAreaCode = physicianCellAreaCode;
	}
    @Serialize
	public String getPhysicianCellNumber() {
		return physicianCellNumber;
	}
    @Serialize
	public void setPhysicianCellNumber(String physicianCellNumber) {
		this.physicianCellNumber = physicianCellNumber;
	}
    @Serialize
	public String getPhysicianFaxAreaCode() {
		return physicianFaxAreaCode;
	}
    @Serialize
	public void setPhysicianFaxAreaCode(String physicianFaxAreaCode) {
		this.physicianFaxAreaCode = physicianFaxAreaCode;
	}
    @Serialize
	public String getPhysicianFaxNumber() {
		return physicianFaxNumber;
	}
    @Serialize
	public void setPhysicianFaxNumber(String physicianFaxNumber) {
		this.physicianFaxNumber = physicianFaxNumber;
	}
    @Serialize
	public String getPhysicianFaxExtension() {
		return physicianFaxExtension;
	}
    @Serialize
	public void setPhysicianFaxExtension(String physicianFaxExtension) {
		this.physicianFaxExtension = physicianFaxExtension;
	}
    @Serialize
	public String getPhysicianEmailAddr() {
		return physicianEmailAddr;
	}
    @Serialize
	public void setPhysicianEmailAddr(String physicianEmailAddr) {
		this.physicianEmailAddr = physicianEmailAddr;
	}
    @Serialize
	public void setPhysicianNameSufx(String physicianNameSufx) {
		this.physicianNameSufx = physicianNameSufx;
	}
    @Serialize
	public String getPhysicianCode() {
		return physicianCode;
	}
    @Serialize
	public void setPhysicianCode(String physicianCode) {
		this.physicianCode = physicianCode;
	}
    @Serialize
	public String getPhysicianContactName() {
		return physicianContactName;
	}
    @Serialize
	public void setPhysicianContactName(String physicianContactName) {
		this.physicianContactName = physicianContactName;
	}
    @Serialize
	public String getPhysicianNameSufx() {
		return physicianNameSufx;
	}
	@Serialize
	public void setNbsTestList(ArrayList<NbsTest> nbsTestList) {
		this.nbsTestList = nbsTestList;
	}
    @Serialize
	public ArrayList<NbsTest> getNbsTestList() {
		return nbsTestList;
	}
}
