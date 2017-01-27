package testing.common.ppServiceResult;

import vitruvianJ.serialization.Serialize;


public class ImmunizationEvent extends Event implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 229548481151667240L;
	private	String	contraindicationFlag	;
	private	String	exemptFlag	;
	private	String	invalidFlag	;
	private	String	providerName	;
	private	String	reactionFlag	;
	private	String	vaccinationDate	;
	private	String	vaccineCode	;
	private	Long	vaccineComponentNo	;
	private	String	vaccineName	;
	private	String	vaccineSeriesName	;
	
	
	@Serialize
	public void setContraindicationFlag(String contraindicationFlag) {
		this.contraindicationFlag = contraindicationFlag;
	}
	@Serialize
	public String getContraindicationFlag() {
		return contraindicationFlag;
	}
	@Serialize
	public void setExemptFlag(String exemptFlag) {
		this.exemptFlag = exemptFlag;
	}
	@Serialize
	public String getExemptFlag() {
		return exemptFlag;
	}
	@Serialize
	public void setInvalidFlag(String invalidFlag) {
		this.invalidFlag = invalidFlag;
	}
	@Serialize
	public String getInvalidFlag() {
		return invalidFlag;
	}
	@Serialize
	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}
	@Serialize
	public String getProviderName() {
		return providerName;
	}
	@Serialize
	public void setReactionFlag(String reactionFlag) {
		this.reactionFlag = reactionFlag;
	}
	@Serialize
	public String getReactionFlag() {
		return reactionFlag;
	}
	@Serialize
	public void setVaccinationDate(String vaccinationDate) {
		this.vaccinationDate = vaccinationDate;
	}
	@Serialize
	public String getVaccinationDate() {
		return vaccinationDate;
	}
	@Serialize
	public void setVaccineCode(String vaccineCode) {
		this.vaccineCode = vaccineCode;
	}
	@Serialize
	public String getVaccineCode() {
		return vaccineCode;
	}
	@Serialize
	public void setVaccineComponentNo(Long vaccineComponentNo) {
		this.vaccineComponentNo = vaccineComponentNo;
	}
	@Serialize
	public Long getVaccineComponentNo() {
		return vaccineComponentNo;
	}
	@Serialize
	public void setVaccineName(String vaccineName) {
		this.vaccineName = vaccineName;
	}
	@Serialize
	public String getVaccineName() {
		return vaccineName;
	}
	@Serialize
	public void setVaccineSeriesName(String vaccineSeriesName) {
		this.vaccineSeriesName = vaccineSeriesName;
	}
	@Serialize
	public String getVaccineSeriesName() {
		return vaccineSeriesName;
	}
	
	

}
