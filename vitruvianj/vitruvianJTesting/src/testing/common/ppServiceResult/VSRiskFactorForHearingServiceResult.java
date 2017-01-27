package testing.common.ppServiceResult;

import java.io.Serializable;

import vitruvianJ.serialization.Serialize;

public class VSRiskFactorForHearingServiceResult extends ServiceResult  implements Serializable
{
	//public static final String serviceName = "GetRiskFactorsForHearing";
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8983888748084348766L;
	private	Short	birthOrder;
	private	Short	plurality;
	private	Integer	birthWeightGrams;
	private	Short	birthWeightPounds;
	private	Short	birthWeightOunces;
	private	Short	gestation;
    private	Short	APGAR1;
    private	Short	APGAR5;
	private	String	hereditaryHearingLoss; // Y/N/U
	private	Boolean	cytomeglovirus;
	private	Boolean	herpes;
	private	Boolean	rubella;
	private	Boolean	toxoplasmosis;
	private	Boolean	maternalInfectionsUnknown;
	private	Boolean	meconium; 
	private	Boolean	anemia;
	private	Boolean	assistedVent6Hours;
	private	Boolean	meningitis;
	private	String	NICU;    // S/L
	private	Boolean	seizure;
	private	Boolean	injury;
	private	Boolean	newbornAntibiotics;
	private	Boolean	unknownAbnormalConditions;
	private	Boolean	anencephaly;
	private	Boolean	hydrocephalus;
	private	Boolean	microcephalus;
	private	Boolean	cleft;
	private	Boolean	downSyndrome;
	private	Boolean	chromAnom;
	private String momEducation;
	
	public VSRiskFactorForHearingServiceResult()
	{
	    super();
    }

    public VSRiskFactorForHearingServiceResult(String originatingProgram, Long charmID)
    {
        super(originatingProgram, charmID);
    }

    public VSRiskFactorForHearingServiceResult(String originatingProgram, Long charmID, String status)
    {
        super(originatingProgram, charmID, status);
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
	public void setPlurality(Short plurality) {
		this.plurality = plurality;
	}

	@Serialize
	public Short getPlurality() {
		return plurality;
	}

	@Serialize
	public void setBirthWeightGrams(Integer birthWeightGrams) {
		this.birthWeightGrams = birthWeightGrams;
	}

	@Serialize
	public Integer getBirthWeightGrams() {
		return birthWeightGrams;
	}

	@Serialize
	public void setBirthWeightPounds(Short birthWeightPounds) {
		this.birthWeightPounds = birthWeightPounds;
	}

	@Serialize
	public Short getBirthWeightPounds() {
		return birthWeightPounds;
	}

	@Serialize
	public void setBirthWeightOunces(Short birthWeightOunces) {
		this.birthWeightOunces = birthWeightOunces;
	}

	@Serialize
	public Short getBirthWeightOunces() {
		return birthWeightOunces;
	}

	@Serialize
	public void setGestation(Short gestation) {
		this.gestation = gestation;
	}

	@Serialize
	public Short getGestation() {
		return gestation;
	}

	@Serialize
	public void setAPGAR1(Short aPGAR1) {
		APGAR1 = aPGAR1;
	}

	@Serialize
	public Short getAPGAR1() {
		return APGAR1;
	}

	@Serialize
	public void setAPGAR5(Short aPGAR5) {
		APGAR5 = aPGAR5;
	}

	@Serialize
	public Short getAPGAR5() {
		return APGAR5;
	}

	@Serialize
	public void setHereditaryHearingLoss(String hereditaryHearingLoss) {
		this.hereditaryHearingLoss = hereditaryHearingLoss;
	}

	@Serialize
	public String getHereditaryHearingLoss() {
		return hereditaryHearingLoss;
	}

	@Serialize
	public void setCytomeglovirus(Boolean cytomeglovirus) {
		this.cytomeglovirus = cytomeglovirus;
	}

	@Serialize
	public Boolean getCytomeglovirus() {
		return cytomeglovirus;
	}

	@Serialize
	public void setHerpes(Boolean herpes) {
		this.herpes = herpes;
	}

	@Serialize
	public Boolean getHerpes() {
		return herpes;
	}

	@Serialize
	public void setRubella(Boolean rubella) {
		this.rubella = rubella;
	}

	@Serialize
	public Boolean getRubella() {
		return rubella;
	}

	@Serialize
	public void setToxoplasmosis(Boolean toxoplasmosis) {
		this.toxoplasmosis = toxoplasmosis;
	}

	@Serialize
	public Boolean getToxoplasmosis() {
		return toxoplasmosis;
	}

	@Serialize
	public void setMaternalInfectionsUnknown(Boolean maternalInfectionsUnknown) {
		this.maternalInfectionsUnknown = maternalInfectionsUnknown;
	}

	@Serialize
	public Boolean getMaternalInfectionsUnknown() {
		return maternalInfectionsUnknown;
	}

	@Serialize
	public void setMeconium(Boolean meconium) {
		this.meconium = meconium;
	}

	@Serialize
	public Boolean getMeconium() {
		return meconium;
	}

	@Serialize
	public void setAnemia(Boolean anemia) {
		this.anemia = anemia;
	}

	@Serialize
	public Boolean getAnemia() {
		return anemia;
	}

	@Serialize
	public void setAssistedVent6Hours(Boolean assistedVent6Hours) {
		this.assistedVent6Hours = assistedVent6Hours;
	}

	@Serialize
	public Boolean getAssistedVent6Hours() {
		return assistedVent6Hours;
	}

	@Serialize
	public void setMeningitis(Boolean meningitis) {
		this.meningitis = meningitis;
	}

	@Serialize
	public Boolean getMeningitis() {
		return meningitis;
	}

	@Serialize
	public void setNICU(String nICU) {
		NICU = nICU;
	}

	@Serialize
	public String getNICU() {
		return NICU;
	}

	@Serialize
	public void setSeizure(Boolean seizure) {
		this.seizure = seizure;
	}

	@Serialize
	public Boolean getSeizure() {
		return seizure;
	}

	@Serialize
	public void setInjury(Boolean injury) {
		this.injury = injury;
	}

	@Serialize
	public Boolean getInjury() {
		return injury;
	}

	@Serialize
	public void setNewbornAntibiotics(Boolean newbornAntibiotics) {
		this.newbornAntibiotics = newbornAntibiotics;
	}

	@Serialize
	public Boolean getNewbornAntibiotics() {
		return newbornAntibiotics;
	}

	@Serialize
	public void setUnknownAbnormalConditions(Boolean unknownAbnormalConditions) {
		this.unknownAbnormalConditions = unknownAbnormalConditions;
	}

	@Serialize
	public Boolean getUnknownAbnormalConditions() {
		return unknownAbnormalConditions;
	}

	@Serialize
	public void setAnencephaly(Boolean anencephaly) {
		this.anencephaly = anencephaly;
	}

	@Serialize
	public Boolean getAnencephaly() {
		return anencephaly;
	}

	@Serialize
	public void setHydrocephalus(Boolean hydrocephalus) {
		this.hydrocephalus = hydrocephalus;
	}

	@Serialize
	public Boolean getHydrocephalus() {
		return hydrocephalus;
	}

	@Serialize
	public void setMicrocephalus(Boolean microcephalus) {
		this.microcephalus = microcephalus;
	}

	@Serialize
	public Boolean getMicrocephalus() {
		return microcephalus;
	}

	@Serialize
	public void setCleft(Boolean cleft) {
		this.cleft = cleft;
	}

	@Serialize
	public Boolean getCleft() {
		return cleft;
	}

	@Serialize
	public void setDownSyndrome(Boolean downSyndrome) {
		this.downSyndrome = downSyndrome;
	}

	@Serialize
	public Boolean getDownSyndrome() {
		return downSyndrome;
	}

	@Serialize
	public void setChromAnom(Boolean chromAnom) {
		this.chromAnom = chromAnom;
	}

	@Serialize
	public Boolean getChromAnom() {
		return chromAnom;
	}

	@Serialize
	public void setMomEducation(String momEducation) {
		this.momEducation = momEducation;
	}

	@Serialize
	public String getMomEducation() {
		return momEducation;
	}
}
