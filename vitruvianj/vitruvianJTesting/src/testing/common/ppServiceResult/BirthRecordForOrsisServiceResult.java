package testing.common.ppServiceResult;

import java.io.Serializable;

import vitruvianJ.serialization.Serialize;

public class BirthRecordForOrsisServiceResult extends ServiceResult implements Serializable
{	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2986501591326458587L;
	private	String	stateFileNumber;
	private	String	firstName;
	private	String	middleName;
	private	String	lastName;
	private	String	suffix;
	private	String	genderCd;
	private	String	ssn;
	private	Boolean	deceased;
	private	String	cityOfBirth;
	private	String	countyOfBirth;
	private	String	birthDate;
	private	String	birthFacility;
	private	String	facilityCode;
	private	String	dadBirthDate;
	private	String	dadBirthPlace;
	private	String	dadFirstName;
	private	Boolean	dadHisp;
	private	String	dadLastName;
	private	String	dadMiddleName;
	private	String	dadRace1Cd;
	private	String	dadRaceCd;
	private	String	dadResStreet;
	private	String	dadResCity;
	private	String	dadResStatePC;
	private	String	dadResZip5;
	private	String	dadResZip4;
	private	String	dadSSN;
	private	String	dadSuffix;
	private	Boolean	momMedicaid;
	private	Integer	momAge;
	private	String	momBirthDate;
	private	String	momBirthplace;
	private	String	momFirstName;
	private	Boolean	momHisp;
	private	String	momLastName;
	private	String	momMailStreet;
	private	String	momMailCity;
	private	String	momMailStatePC;
	private	String	momMailZip5;
	private	String	momMailZip4;
	private	Boolean	momMarried;
	private	String	momMiddleName;
	private	String	momRace1Cd;
	private	String	momRaceCd;
	private	String	momSSN;
	private	String	momLastPrior;
	private	String	orsDecreeDate;
	private	String	orsAddDeleteDad;
	private	String	paternityDate;
	private	String	paternityStatus;
	private	String	paternityNotes;
	private	String	paternityType;
	private	String	paternVoluntary;
	private	Boolean	placedForAdoption;
	private	String	adoptionChangeDate;
	private	String	adoptionFlag;
	private	String	adoptionType;
	private	String	ovrsNotes1;
	private	String	ovrsNotes2;
	private	String	legalNotes;

	public BirthRecordForOrsisServiceResult()
	{
	    super();
    }

    public BirthRecordForOrsisServiceResult(String originatingProgram, Long charmID)
    {
        super(originatingProgram, charmID);
    }

    public BirthRecordForOrsisServiceResult(String originatingProgram, Long charmID, String status)
    {
        super(originatingProgram, charmID, status);
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
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Serialize
	public String getFirstName() {
		return firstName;
	}

	@Serialize
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	@Serialize
	public String getMiddleName() {
		return middleName;
	}

	@Serialize
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Serialize
	public String getLastName() {
		return lastName;
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
	public void setGenderCd(String genderCd) {
		this.genderCd = genderCd;
	}

	@Serialize
	public String getGenderCd() {
		return genderCd;
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
	public void setDeceased(Boolean deceased) {
		this.deceased = deceased;
	}

	@Serialize
	public Boolean getDeceased() {
		return deceased;
	}

	@Serialize
	public void setCityOfBirth(String cityOfBirth) {
		this.cityOfBirth = cityOfBirth;
	}

	@Serialize
	public String getCityOfBirth() {
		return cityOfBirth;
	}

	@Serialize
	public void setCountyOfBirth(String countyOfBirth) {
		this.countyOfBirth = countyOfBirth;
	}

	@Serialize
	public String getCountyOfBirth() {
		return countyOfBirth;
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
	public void setBirthFacility(String birthFacility) {
		this.birthFacility = birthFacility;
	}

	@Serialize
	public String getBirthFacility() {
		return birthFacility;
	}

	@Serialize
	public void setFacilityCode(String facilityCode) {
		this.facilityCode = facilityCode;
	}

	@Serialize
	public String getFacilityCode() {
		return facilityCode;
	}

	@Serialize
	public void setDadBirthDate(String dadBirthDate) {
		this.dadBirthDate = dadBirthDate;
	}

	@Serialize
	public String getDadBirthDate() {
		return dadBirthDate;
	}

	@Serialize
	public void setDadBirthPlace(String dadBirthPlace) {
		this.dadBirthPlace = dadBirthPlace;
	}

	@Serialize
	public String getDadBirthPlace() {
		return dadBirthPlace;
	}

	@Serialize
	public void setDadFirstName(String dadFirstName) {
		this.dadFirstName = dadFirstName;
	}

	@Serialize
	public String getDadFirstName() {
		return dadFirstName;
	}

	@Serialize
	public void setDadHisp(Boolean dadHisp) {
		this.dadHisp = dadHisp;
	}

	@Serialize
	public Boolean getDadHisp() {
		return dadHisp;
	}

	@Serialize
	public void setDadLastName(String dadLastName) {
		this.dadLastName = dadLastName;
	}

	@Serialize
	public String getDadLastName() {
		return dadLastName;
	}

	@Serialize
	public void setDadMiddleName(String dadMiddleName) {
		this.dadMiddleName = dadMiddleName;
	}

	@Serialize
	public String getDadMiddleName() {
		return dadMiddleName;
	}

	@Serialize
	public void setDadRace1Cd(String dadRace1Cd) {
		this.dadRace1Cd = dadRace1Cd;
	}

	@Serialize
	public String getDadRace1Cd() {
		return dadRace1Cd;
	}

	@Serialize
	public void setDadRaceCd(String dadRaceCd) {
		this.dadRaceCd = dadRaceCd;
	}

	@Serialize
	public String getDadRaceCd() {
		return dadRaceCd;
	}

	@Serialize
	public void setDadResStreet(String dadResStreet) {
		this.dadResStreet = dadResStreet;
	}

	@Serialize
	public String getDadResStreet() {
		return dadResStreet;
	}

	@Serialize
	public void setDadResCity(String dadResCity) {
		this.dadResCity = dadResCity;
	}

	@Serialize
	public String getDadResCity() {
		return dadResCity;
	}

	@Serialize
	public void setDadResStatePC(String dadResStatePC) {
		this.dadResStatePC = dadResStatePC;
	}

	@Serialize
	public String getDadResStatePC() {
		return dadResStatePC;
	}

	@Serialize
	public void setDadResZip5(String dadResZip5) {
		this.dadResZip5 = dadResZip5;
	}

	@Serialize
	public String getDadResZip5() {
		return dadResZip5;
	}

	@Serialize
	public void setDadResZip4(String dadResZip4) {
		this.dadResZip4 = dadResZip4;
	}

	@Serialize
	public String getDadResZip4() {
		return dadResZip4;
	}

	@Serialize
	public void setDadSSN(String dadSSN) {
		this.dadSSN = dadSSN;
	}

	@Serialize
	public String getDadSSN() {
		return dadSSN;
	}

	@Serialize
	public void setDadSuffix(String dadSuffix) {
		this.dadSuffix = dadSuffix;
	}

	@Serialize
	public String getDadSuffix() {
		return dadSuffix;
	}

	@Serialize
	public void setMomMedicaid(Boolean momMedicaid) {
		this.momMedicaid = momMedicaid;
	}

	@Serialize
	public Boolean getMomMedicaid() {
		return momMedicaid;
	}

	@Serialize
	public void setMomAge(Integer momAge) {
		this.momAge = momAge;
	}

	@Serialize
	public Integer getMomAge() {
		return momAge;
	}

	@Serialize
	public void setMomBirthDate(String momBirthDate) {
		this.momBirthDate = momBirthDate;
	}

	@Serialize
	public String getMomBirthDate() {
		return momBirthDate;
	}

	@Serialize
	public void setMomBirthplace(String momBirthplace) {
		this.momBirthplace = momBirthplace;
	}

	@Serialize
	public String getMomBirthplace() {
		return momBirthplace;
	}

	@Serialize
	public void setMomFirstName(String momFirstName) {
		this.momFirstName = momFirstName;
	}

	@Serialize
	public String getMomFirstName() {
		return momFirstName;
	}

	@Serialize
	public void setMomHisp(Boolean momHisp) {
		this.momHisp = momHisp;
	}

	@Serialize
	public Boolean getMomHisp() {
		return momHisp;
	}

	@Serialize
	public void setMomLastName(String momLastName) {
		this.momLastName = momLastName;
	}

	@Serialize
	public String getMomLastName() {
		return momLastName;
	}

	@Serialize
	public void setMomMailStreet(String momMailStreet) {
		this.momMailStreet = momMailStreet;
	}

	@Serialize
	public String getMomMailStreet() {
		return momMailStreet;
	}

	@Serialize
	public void setMomMailCity(String momMailCity) {
		this.momMailCity = momMailCity;
	}

	@Serialize
	public String getMomMailCity() {
		return momMailCity;
	}

	@Serialize
	public void setMomMailStatePC(String momMailStatePC) {
		this.momMailStatePC = momMailStatePC;
	}

	@Serialize
	public String getMomMailStatePC() {
		return momMailStatePC;
	}

	@Serialize
	public void setMomMailZip5(String momMailZip5) {
		this.momMailZip5 = momMailZip5;
	}

	@Serialize
	public String getMomMailZip5() {
		return momMailZip5;
	}

	@Serialize
	public void setMomMailZip4(String momMailZip4) {
		this.momMailZip4 = momMailZip4;
	}

	@Serialize
	public String getMomMailZip4() {
		return momMailZip4;
	}

	@Serialize
	public void setMomMarried(Boolean momMarried) {
		this.momMarried = momMarried;
	}

	@Serialize
	public Boolean getMomMarried() {
		return momMarried;
	}

	@Serialize
	public void setMomMiddleName(String momMiddleName) {
		this.momMiddleName = momMiddleName;
	}

	@Serialize
	public String getMomMiddleName() {
		return momMiddleName;
	}

	@Serialize
	public void setMomRace1Cd(String momRace1Cd) {
		this.momRace1Cd = momRace1Cd;
	}

	@Serialize
	public String getMomRace1Cd() {
		return momRace1Cd;
	}

	@Serialize
	public void setMomRaceCd(String momRaceCd) {
		this.momRaceCd = momRaceCd;
	}

	@Serialize
	public String getMomRaceCd() {
		return momRaceCd;
	}

	@Serialize
	public void setMomSSN(String momSSN) {
		this.momSSN = momSSN;
	}

	@Serialize
	public String getMomSSN() {
		return momSSN;
	}

	@Serialize
	public void setMomLastPrior(String momLastPrior) {
		this.momLastPrior = momLastPrior;
	}

	@Serialize
	public String getMomLastPrior() {
		return momLastPrior;
	}

	@Serialize
	public void setOrsDecreeDate(String orsDecreeDate) {
		this.orsDecreeDate = orsDecreeDate;
	}

	@Serialize
	public String getOrsDecreeDate() {
		return orsDecreeDate;
	}

	@Serialize
	public void setOrsAddDeleteDad(String orsAddDeleteDad) {
		this.orsAddDeleteDad = orsAddDeleteDad;
	}

	@Serialize
	public String getOrsAddDeleteDad() {
		return orsAddDeleteDad;
	}

	@Serialize
	public void setPaternityDate(String paternityDate) {
		this.paternityDate = paternityDate;
	}

	@Serialize
	public String getPaternityDate() {
		return paternityDate;
	}

	@Serialize
	public void setPaternityStatus(String paternityStatus) {
		this.paternityStatus = paternityStatus;
	}

	@Serialize
	public String getPaternityStatus() {
		return paternityStatus;
	}

	@Serialize
	public void setPaternityNotes(String paternityNotes) {
		this.paternityNotes = paternityNotes;
	}

	@Serialize
	public String getPaternityNotes() {
		return paternityNotes;
	}

	@Serialize
	public void setPaternityType(String paternityType) {
		this.paternityType = paternityType;
	}

	@Serialize
	public String getPaternityType() {
		return paternityType;
	}

	@Serialize
	public void setPaternVoluntary(String paternVoluntary) {
		this.paternVoluntary = paternVoluntary;
	}

	@Serialize
	public String getPaternVoluntary() {
		return paternVoluntary;
	}

	@Serialize
	public void setPlacedForAdoption(Boolean placedForAdoption) {
		this.placedForAdoption = placedForAdoption;
	}

	@Serialize
	public Boolean getPlacedForAdoption() {
		return placedForAdoption;
	}

	@Serialize
	public void setAdoptionChangeDate(String adoptionChangeDate) {
		this.adoptionChangeDate = adoptionChangeDate;
	}

	@Serialize
	public String getAdoptionChangeDate() {
		return adoptionChangeDate;
	}

	@Serialize
	public void setAdoptionFlag(String adoptionFlag) {
		this.adoptionFlag = adoptionFlag;
	}

	@Serialize
	public String getAdoptionFlag() {
		return adoptionFlag;
	}

	@Serialize
	public void setAdoptionType(String adoptionType) {
		this.adoptionType = adoptionType;
	}

	@Serialize
	public String getAdoptionType() {
		return adoptionType;
	}

	@Serialize
	public void setOvrsNotes1(String ovrsNotes1) {
		this.ovrsNotes1 = ovrsNotes1;
	}

	@Serialize
	public String getOvrsNotes1() {
		return ovrsNotes1;
	}

	@Serialize
	public void setOvrsNotes2(String ovrsNotes2) {
		this.ovrsNotes2 = ovrsNotes2;
	}

	@Serialize
	public String getOvrsNotes2() {
		return ovrsNotes2;
	}

	@Serialize
	public void setLegalNotes(String legalNotes) {
		this.legalNotes = legalNotes;
	}

	@Serialize
	public String getLegalNotes() {
		return legalNotes;
	}
    
    
}
