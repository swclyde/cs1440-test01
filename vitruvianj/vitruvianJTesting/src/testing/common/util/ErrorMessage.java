package testing.common.util;

/***
 * This class holds all the error messages set up for ServiceResult, QueryResult, and jsp pages
 * It follows the spreadsheet: \SVN\documents\Design\version2\SystemWide_Docs\AgentQMJspWebIfErrorMsg.xls
 * The string with $ in front means a parameter, it will be replaced by the real value at run time.
 * @author hulan
 *
 */
public class ErrorMessage {
		
	//error messages for jsp pages
	private static String JSP_REPORT_TO_CHARM = " Please try again later, or report it to CHARM support team.";
	
	public static String getErrMsg_JSP_CANNOT_COMM_AGENT () {
		return "Cannot communicate with charm agent." + JSP_REPORT_TO_CHARM; 
	}
	
	public static String getErrMsg_JSP_CHARM_COMP_NOT_AVAILABLE (String errorMsgInQR) {
		return "Some CHARM service components are not available, " + errorMsgInQR + JSP_REPORT_TO_CHARM;
	}
	
	public static String getErrMsg_JSP_USER_NOT_AUTHORIZED (String errorMsgInQR) {
		return "User is not authorized, " + errorMsgInQR;
	}
	
	public static String getErrMsg_JPS_INVALID_QUERY_NAME (String errorMsgInQR) { 
		return "Invalid QueryName, " + errorMsgInQR + JSP_REPORT_TO_CHARM; 
	}
	
	public static String getErrMsg_JPS_ERROR_ON_AGENT (String agentName, String errorMsgInSR) {
		return "Cannot communicate or unexpected error with " + agentName + " agent: " + errorMsgInSR + JSP_REPORT_TO_CHARM;
	}
	
	public static String getErrMsg_JPS_FAILURE_ON_SR (String errorMsgInSR) {
		return "Something is wrong for getting the result, " + errorMsgInSR + JSP_REPORT_TO_CHARM; 
	}
	
	public static String getErrMsg_JPS_INVALID_PROGRAM_ID (String errorMsgInQR) {
		return "Something is wrong for getting the result, " + errorMsgInQR ;
	}

	
	//error messages for QueryResult
	public static String getErrMsg_QR_NOT_AVAILABLE () {
		return "Query manager is not available.";
	}
	
	public static String getErrMsg_QR_USER_NOT_AUTHORIZED () {
		return "Authentification failed.";
	}
	
	public static String getErrMsg_QR_INVALID_QUERY_NAME (String queryName) {
		return "Queryname is unknown to CHARM.";
	}
	
	public static String getErrMsg_QR_AGENT_FAILURE () {
		return "Call to one or more of CHARM Agents failed.";
	}
	
	public static String getErrMsg_QR_PROGRAMID_NOT_EXIST (String programID) {
		return "ProgramID does not exist.";
	}
	
	//error message for ServiceResult
	public static String getErrMsg_SR_AGENT_NOT_AVAILABLE (String serviceresultname, String realExceptionMsg) {
		return "Exeption in getting " + serviceresultname + ": " + realExceptionMsg + ".";
	}
	
	public static String getErrMsg_SR_INVALID_SERVICE_NAME (String serviceName) {
		return "Service name is unknown to CHARM.";
	}
	
	public static String getErrMsg_SR_DB_EXCEPTION (String databaseName) {
		return "Cannot access to participating program Database: " + databaseName;
	}
	
	public static String getErrMsg_SR_CHARMID_NOT_EXIST (String charmID) {
		return "Mapping CharmID does not exist.";
	}
	
}
