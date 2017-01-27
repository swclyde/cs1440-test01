package testing.common.data;

import java.util.ArrayList;

import vitruvianJ.serialization.Serialize;


public class PersonData implements java.io.Serializable{

	//=== general person info
	private Long charmid=null;
	private Boolean isadult = null;
	private String firstname = null;
	private String lastname = null;
	private String middlename = null;
	private String maidenname = null;
	private String gender = null;
	private String birthdate = null;
	
	//=== identifier info
	private String stateFileNumber = null;
	private String ssn = null;
	private String newBornScreeningNumber = null;
	
	//=== birth info 
	private Short birthUtahCountyId = null;
	private String birthUsStateCode = null;
	private Integer birthCountryId = null;
	private String birthCity = null;
	private Short birthOrder = null;
	private Short birthWeightOz = null;
	private Short birthWeightGrams = null;
	private String birthFacilityCode = null;
	private Boolean multipleBirth = null;
	
	//=== other person info
	private String suffix = null;
	private String mothersMaidenName = null;
	private Boolean deceasedFlag = null; 
	private String deceasedDate = null;
	private Long chpModifyUtcTimestamp = null;
	
	
	//=== fields from person_role table
	private Long roletypeid = null;
	private String startdate = null;
	private String enddate = null;
	
	//=== for locator info
	private ArrayList<AddressData> address = new ArrayList<AddressData>();
	private ArrayList<PhoneData> phone = new ArrayList<PhoneData>();
	private ArrayList<EmailData> email = new ArrayList<EmailData>();

	//=== for associate person info
	//private ArrayList motherList = new ArrayList();
	//private ArrayList fatherList = new ArrayList();
	//private ArrayList legalGuardianList = new ArrayList();
	private ArrayList<PersonData> assocPerson = new ArrayList<PersonData>();
	
	
	@Serialize
	public void setFirstname(String firstname) {
		//System.out.println("get called " + firstname);
		this.firstname = firstname;
	}
	@Serialize
	public String getFirstname() {
		return firstname;
	}
	@Serialize
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	@Serialize
	public String getLastname() {
		return lastname;
	}
	@Serialize
	public void setBirthWeightOz(Short weight) {
		this.birthWeightOz = weight;
	}
	@Serialize
	public Short getBirthWeightOz() {
		return birthWeightOz;
	}
	@Serialize
	public void setAddress(ArrayList<AddressData> address) {
		this.address = address;
	}
	@Serialize
	public ArrayList<AddressData> getAddress() {
		return address;
	}

	@Serialize
	public void setCharmid(Long charmid) {
		this.charmid = charmid;
	}

	@Serialize
	public Long getCharmid() {
		return charmid;
	}
	@Serialize
	public void setPhone(ArrayList<PhoneData> phone) {
		this.phone = phone;
	}
	@Serialize
	public ArrayList<PhoneData> getPhone() {
		return phone;
	}
	@Serialize
	public void setIsadult(Boolean isadult) {
		this.isadult = isadult;
	}
	@Serialize
	public Boolean getIsadult() {
		return isadult;
	}
	@Serialize
	public void setChpModifyUtcTimestamp(Long modifytimestamp) {
		this.chpModifyUtcTimestamp = modifytimestamp;
	}
	@Serialize
	public Long getChpModifyUtcTimestamp() {
		return chpModifyUtcTimestamp;
	}
	@Serialize
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	@Serialize
	public String getMiddlename() {
		return middlename;
	}
	@Serialize
	public void setAssocPerson(ArrayList<PersonData> assocp) {
		this.assocPerson = assocp;
	}
	@Serialize
	public ArrayList<PersonData> getAssocPerson() {
		return assocPerson;
	}
	@Serialize
	public void setRoletypeid(Long roletypeid) {
		this.roletypeid = roletypeid;
	}
	@Serialize
	public Long getRoletypeid() {
		return roletypeid;
	}
	@Serialize
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	@Serialize
	public String getStartdate() {
		return startdate;
	}
	@Serialize
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	@Serialize
	public String getEnddate() {
		return enddate;
	}
	@Serialize
	public void setEmail(ArrayList<EmailData> email) {
		this.email = email;
	}
	@Serialize
	public ArrayList<EmailData> getEmail() {
		return email;
	}
	@Serialize
	public void setMaidenname(String maidenname) {
		this.maidenname = maidenname;
	}
	@Serialize
	public String getMaidenname() {
		return maidenname;
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
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	@Serialize
	public String getBirthdate() {
		return birthdate;
	}
	@Serialize
	public void setStateFileNumber(String stateFileNumber) {
		this.stateFileNumber = stateFileNumber;
	}
	@Serialize
	public String getStateFileNumber() {
		return stateFileNumber;
	}
	@Serialize
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	@Serialize
	public String getSsn() {
		return ssn;
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
	public void setBirthUtahCountyId(Short birthUtahCountyId) {
		this.birthUtahCountyId = birthUtahCountyId;
	}
	@Serialize
	public Short getBirthUtahCountyId() {
		return birthUtahCountyId;
	}
	@Serialize
	public void setBirthUsStateCode(String birthUsStateCode) {
		this.birthUsStateCode = birthUsStateCode;
	}
	@Serialize
	public String getBirthUsStateCode() {
		return birthUsStateCode;
	}
	@Serialize
	public void setBirthCountryId(Integer birthCountryId) {
		this.birthCountryId = birthCountryId;
	}
	@Serialize
	public Integer getBirthCountryId() {
		return birthCountryId;
	}
	@Serialize
	public void setBirthCity(String birthCity) {
		this.birthCity = birthCity;
	}
	@Serialize
	public String getBirthCity() {
		return birthCity;
	}
	@Serialize
	public void setBirthOrder(Short birthOrder) {
		this.birthOrder = birthOrder;
	}
	@Serialize
	public Short getBirthOrder() {
		return birthOrder;
	}
	@Serialize
	public void setBirthWeightGrams(Short birthWeightGrams) {
		this.birthWeightGrams = birthWeightGrams;
	}
	@Serialize
	public Short getBirthWeightGrams() {
		return birthWeightGrams;
	}
	@Serialize
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	@Serialize
	public String getSuffix() {
		return suffix;
	}
	@Serialize
	public void setMothersMaidenName(String mothersMaidenName) {
		this.mothersMaidenName = mothersMaidenName;
	}
	@Serialize
	public String getMothersMaidenName() {
		return mothersMaidenName;
	}
	@Serialize
	public void setDeceasedFlag(Boolean deceasedFlag) {
		this.deceasedFlag = deceasedFlag;
	}
	@Serialize
	public Boolean getDeceasedFlag() {
		return deceasedFlag;
	}
	@Serialize
	public void setDeceasedDate(String deceasedDate) {
		this.deceasedDate = deceasedDate;
	}
	@Serialize
	public String getDeceasedDate() {
		return deceasedDate;
	}

	@Serialize
	public void setBirthFacilityCode(String birthFacilityCode) {
		this.birthFacilityCode = birthFacilityCode;
	}
	@Serialize
	public String getBirthFacilityCode() {
		return birthFacilityCode;
	}
	@Serialize
	public void setMultipleBirth(Boolean multipleBirth) {
		this.multipleBirth = multipleBirth;
	}
	@Serialize
	public Boolean getMultipleBirth() {
		return multipleBirth;
	}
	
	/*
	public void setMotherList(ArrayList motherList) {
		this.motherList = motherList;
	}
	public ArrayList getMotherList() {
		return motherList;
	}
	public void setFatherList(ArrayList fatherList) {
		this.fatherList = fatherList;
	}
	public ArrayList getFatherList() {
		return fatherList;
	}
	public void setLegalGuardianList(ArrayList legalGuardianList) {
		this.legalGuardianList = legalGuardianList;
	}
	public ArrayList getLegalGuardianList() {
		return legalGuardianList;
	}
	*/
	
}
