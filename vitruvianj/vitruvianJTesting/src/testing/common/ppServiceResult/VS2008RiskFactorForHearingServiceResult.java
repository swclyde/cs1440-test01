package testing.common.ppServiceResult;

import java.io.Serializable;

import vitruvianJ.serialization.Serialize;

public class VS2008RiskFactorForHearingServiceResult extends ServiceResult  implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4711311257817264067L;

	public static final String serviceName = "GetRiskFactorsForHearing";
	
	private	Short	birthOrder;
	private	Short	plurality;
	private	Integer	birthWeightGrams;
	private	Short	birthWeightPounds;
	private	Short	birthWeightOunces;
	
    private	Short	APGAR1;
    private	Short	APGAR5;
	private	Boolean	hearingLoss; 
	private	Boolean	risk1Anemia; 
	private	Boolean	risk2Cardiac;
	private	Boolean	risk3Lung;
	private	Boolean	risk5Herpes;
	private	Boolean	risk6Hemoglob;
	private	Boolean	risk7PolyOlig; 
	private	Boolean	risk8CH;
	private	Boolean	risk9PH;
	private	Boolean	risk10Eclampsia;
	private	Boolean	risk11IncCerv;  
	private	Boolean	risk12Prev4000;
	private	Boolean	risk13PrevPret;
	private	Boolean	risk14PrevSm;
	private	Boolean	risk15Renal;
	private	Boolean	risk16RhSens;
	private	Boolean	risk17Rubella;
	private	Boolean	risk18UterBld;
	private	Boolean	risk0None;
	private	Boolean	risk19Other;
	private	Boolean	risk20Unknown;
	private	Boolean	risk21PreExist;
	private	Boolean	risk22Gestation;
	private	String	risk19Specify;
	private	Boolean	delv1Vaginal;
	private	Boolean	delv2VagC;
	private	Boolean	delv3PrimaryC;
	private	Boolean	delv4RepeatC;
	private	Boolean	delv5Forceps;
	private	Boolean	delv6Vacuum;
	private	Boolean	abnl4Meningitis;
	private	Boolean	abnl5Infection;
	private	Boolean	abnl8VentLT30;
	private	Boolean	abnl9VentGE30;
	
	public VS2008RiskFactorForHearingServiceResult()
	{
	    super();
    }

    public VS2008RiskFactorForHearingServiceResult(String originatingProgram, Long charmID)
    {
        super(originatingProgram, charmID);
    }

    public VS2008RiskFactorForHearingServiceResult(String originatingProgram, Long charmID, String status)
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
	public void setHearingLoss(Boolean hearingLoss) {
		this.hearingLoss = hearingLoss;
	}

	@Serialize
	public Boolean getHearingLoss() {
		return hearingLoss;
	}

	@Serialize
	public void setRisk1Anemia(Boolean risk1Anemia) {
		this.risk1Anemia = risk1Anemia;
	}

	@Serialize
	public Boolean getRisk1Anemia() {
		return risk1Anemia;
	}

	@Serialize
	public void setRisk2Cardiac(Boolean risk2Cardiac) {
		this.risk2Cardiac = risk2Cardiac;
	}

	@Serialize
	public Boolean getRisk2Cardiac() {
		return risk2Cardiac;
	}

	@Serialize
	public void setRisk3Lung(Boolean risk3Lung) {
		this.risk3Lung = risk3Lung;
	}

	@Serialize
	public Boolean getRisk3Lung() {
		return risk3Lung;
	}

	@Serialize
	public void setRisk5Herpes(Boolean risk5Herpes) {
		this.risk5Herpes = risk5Herpes;
	}

	@Serialize
	public Boolean getRisk5Herpes() {
		return risk5Herpes;
	}

	@Serialize
	public void setRisk6Hemoglob(Boolean risk6Hemoglob) {
		this.risk6Hemoglob = risk6Hemoglob;
	}

	@Serialize
	public Boolean getRisk6Hemoglob() {
		return risk6Hemoglob;
	}

	@Serialize
	public void setRisk7PolyOlig(Boolean risk7PolyOlig) {
		this.risk7PolyOlig = risk7PolyOlig;
	}

	@Serialize
	public Boolean getRisk7PolyOlig() {
		return risk7PolyOlig;
	}

	@Serialize
	public void setRisk8CH(Boolean risk8CH) {
		this.risk8CH = risk8CH;
	}

	@Serialize
	public Boolean getRisk8CH() {
		return risk8CH;
	}

	@Serialize
	public void setRisk9PH(Boolean risk9PH) {
		this.risk9PH = risk9PH;
	}

	@Serialize
	public Boolean getRisk9PH() {
		return risk9PH;
	}

	@Serialize
	public void setRisk10Eclampsia(Boolean risk10Eclampsia) {
		this.risk10Eclampsia = risk10Eclampsia;
	}

	@Serialize
	public Boolean getRisk10Eclampsia() {
		return risk10Eclampsia;
	}

	@Serialize
	public void setRisk11IncCerv(Boolean risk11IncCerv) {
		this.risk11IncCerv = risk11IncCerv;
	}

	@Serialize
	public Boolean getRisk11IncCerv() {
		return risk11IncCerv;
	}

	@Serialize
	public void setRisk12Prev4000(Boolean risk12Prev4000) {
		this.risk12Prev4000 = risk12Prev4000;
	}

	@Serialize
	public Boolean getRisk12Prev4000() {
		return risk12Prev4000;
	}

	@Serialize
	public void setRisk13PrevPret(Boolean risk13PrevPret) {
		this.risk13PrevPret = risk13PrevPret;
	}

	@Serialize
	public Boolean getRisk13PrevPret() {
		return risk13PrevPret;
	}

	@Serialize
	public void setRisk14PrevSm(Boolean risk14PrevSm) {
		this.risk14PrevSm = risk14PrevSm;
	}

	@Serialize
	public Boolean getRisk14PrevSm() {
		return risk14PrevSm;
	}

	@Serialize
	public void setRisk15Renal(Boolean risk15Renal) {
		this.risk15Renal = risk15Renal;
	}

	@Serialize
	public Boolean getRisk15Renal() {
		return risk15Renal;
	}

	@Serialize
	public void setRisk16RhSens(Boolean risk16RhSens) {
		this.risk16RhSens = risk16RhSens;
	}

	@Serialize
	public Boolean getRisk16RhSens() {
		return risk16RhSens;
	}

	@Serialize
	public void setRisk17Rubella(Boolean risk17Rubella) {
		this.risk17Rubella = risk17Rubella;
	}

	@Serialize
	public Boolean getRisk17Rubella() {
		return risk17Rubella;
	}

	@Serialize
	public void setRisk18UterBld(Boolean risk18UterBld) {
		this.risk18UterBld = risk18UterBld;
	}

	@Serialize
	public Boolean getRisk18UterBld() {
		return risk18UterBld;
	}

	@Serialize
	public void setRisk0None(Boolean risk0None) {
		this.risk0None = risk0None;
	}

	@Serialize
	public Boolean getRisk0None() {
		return risk0None;
	}

	@Serialize
	public void setRisk19Other(Boolean risk19Other) {
		this.risk19Other = risk19Other;
	}

	@Serialize
	public Boolean getRisk19Other() {
		return risk19Other;
	}

	@Serialize
	public void setRisk20Unknown(Boolean risk20Unknown) {
		this.risk20Unknown = risk20Unknown;
	}

	@Serialize
	public Boolean getRisk20Unknown() {
		return risk20Unknown;
	}

	@Serialize
	public void setRisk21PreExist(Boolean risk21PreExist) {
		this.risk21PreExist = risk21PreExist;
	}

	@Serialize
	public Boolean getRisk21PreExist() {
		return risk21PreExist;
	}

	@Serialize
	public void setRisk22Gestation(Boolean risk22Gestation) {
		this.risk22Gestation = risk22Gestation;
	}

	@Serialize
	public Boolean getRisk22Gestation() {
		return risk22Gestation;
	}

	@Serialize
	public void setRisk19Specify(String risk19Specify) {
		this.risk19Specify = risk19Specify;
	}

	@Serialize
	public String getRisk19Specify() {
		return risk19Specify;
	}

	@Serialize
	public void setDelv1Vaginal(Boolean delv1Vaginal) {
		this.delv1Vaginal = delv1Vaginal;
	}

	@Serialize
	public Boolean getDelv1Vaginal() {
		return delv1Vaginal;
	}

	@Serialize
	public void setDelv2VagC(Boolean delv2VagC) {
		this.delv2VagC = delv2VagC;
	}

	@Serialize
	public Boolean getDelv2VagC() {
		return delv2VagC;
	}

	@Serialize
	public void setDelv3PrimaryC(Boolean delv3PrimaryC) {
		this.delv3PrimaryC = delv3PrimaryC;
	}

	@Serialize
	public Boolean getDelv3PrimaryC() {
		return delv3PrimaryC;
	}

	@Serialize
	public void setDelv4RepeatC(Boolean delv4RepeatC) {
		this.delv4RepeatC = delv4RepeatC;
	}

	@Serialize
	public Boolean getDelv4RepeatC() {
		return delv4RepeatC;
	}

	@Serialize
	public void setDelv5Forceps(Boolean delv5Forceps) {
		this.delv5Forceps = delv5Forceps;
	}

	@Serialize
	public Boolean getDelv5Forceps() {
		return delv5Forceps;
	}

	@Serialize
	public void setDelv6Vacuum(Boolean delv6Vacuum) {
		this.delv6Vacuum = delv6Vacuum;
	}

	@Serialize
	public Boolean getDelv6Vacuum() {
		return delv6Vacuum;
	}

	@Serialize
	public void setAbnl4Meningitis(Boolean abnl4Meningitis) {
		this.abnl4Meningitis = abnl4Meningitis;
	}

	@Serialize
	public Boolean getAbnl4Meningitis() {
		return abnl4Meningitis;
	}

	@Serialize
	public void setAbnl5Infection(Boolean abnl5Infection) {
		this.abnl5Infection = abnl5Infection;
	}

	@Serialize
	public Boolean getAbnl5Infection() {
		return abnl5Infection;
	}

	@Serialize
	public void setAbnl8VentLT30(Boolean abnl8VentLT30) {
		this.abnl8VentLT30 = abnl8VentLT30;
	}

	@Serialize
	public Boolean getAbnl8VentLT30() {
		return abnl8VentLT30;
	}

	@Serialize
	public void setAbnl9VentGE30(Boolean abnl9VentGE30) {
		this.abnl9VentGE30 = abnl9VentGE30;
	}

	@Serialize
	public Boolean getAbnl9VentGE30() {
		return abnl9VentGE30;
	}
    
    
    
}
