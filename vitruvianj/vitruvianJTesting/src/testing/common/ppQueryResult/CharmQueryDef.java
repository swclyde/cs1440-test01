package testing.common.ppQueryResult;

public class CharmQueryDef {
	
	//CHARM-Core querries
	public static final String PERSON_QUERY = "PersonQuery"; //return only person service result
	public static final String ALERT_QUERY = "AlertQuery"; //will return only alerts from core
	
	//USIIS querries
	public static final String USIIS_CORE_QUERY = "USIISCoreQuery"; //return USIIS demo data
	public static final String IMMUNIZATION_HISTORY_QUERY = "ImmunizationHistoryQuery";
	public static final String IMMUNIZATION_STATUS_QUERY = "ImmunizationStatusQuery";
	public static final String IMMUNIZATION_DISPLAY_FOR_EHDI_QUERY = "ImmunizationDisplayForEHDIQuery"; // returns all info required in ImmunizationDisplay.jsp - Person, Alerts, ImmunizationStatus, Immunizationhistory SR's
	
	//EHDI querries
	public static final String EHDI_CORE_QUERY = "EHDICoreQuery"; //return EHDI demo data
	public static final String HEARING_SCREENING_MCR_QUERY = "HearingScreeningMCRQuery"; //splited from hearing screening status query
	public static final String HEARING_SCREENING_DISPOSITION_QUERY = "HearingScreeningDispositionQuery"; //splited from hearing screening status query
	public static final String HEARINGSCREENING_HISTORY_QUERY = "HearingScreeningHistoryQuery";
	public static final String HEARINGSCREENING_DISPLAY_FOR_USIIS_QUERY = "HearingScreeningDisplayForUSIISQuery"; // returns all info required in USIISDisplay.jsp - Person, Alerts, HearingScreeningHistory, HearingScreeningStatus SR's
	public static final String HEARINGSCREENING_STATUS_QUERY = "HearingScreeningStatusQuery";
	
	//VS querries
	public static final String VS_CORE_QUERY = "VSCoreQuery"; //return VS demo data, was BasicBirthRecordQuery
	public static final String VS_RISK_FACTORS_FOR_HEARING_QUERY = "VSRiskFactorsForHearingQuery";
	public static final String BIRTH_RECORD_FOR_ORSIS_QUERY = "BirthRecordForOrsisQuery";
	
	//NBS querries
	public static final String NBS_CORE_QUERY = "NbsCoreQuery"; //return NBS demo data
	public static final String NBS_MAILER_RESULTS_QUERY = "NbsMailerResultsQuery"; 
	
	//BTOTS querries
	public static final String EI_CORE_QUERY = "EICoreQuery"; //return EI demo data
	public static final String BTOT_DISPLAY_QUERY = "BTOTSDisplayQuery";
	public static final String EI_STATUS_QUERY = "EiStatusQuery";
	public static final String EI_ASSESSMENT_QUERY = "EIAssessmentQuery";
	public static final String EI_MOST_RECENT_SERVICE_PLAN_QUERY = "EIMostRecentServicePlanQuery";
	public static final String EI_SERVICE_PLAN_HISTORY_QUERY = "EIServicePlanHistoryQuery";
	public static final String BTOTS_AGGREGATE_QUERY = "EiAllQueries";
	
	//Other querries
	public static final String COMBINED_CORE_QUERY = "CombinedCoreQuery"; // return core query from pp 
	public static final String MULTIPLE_QUERIES = "MultipleQueries"; // return core query from pp
	public static final String ALL_QUERY = "AllQuery"; // returns all SR's
}
