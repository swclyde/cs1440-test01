package testing.common.ppServiceResult;

import java.io.Serializable;
import java.util.ArrayList;

import vitruvianJ.serialization.Serialize;

public class EIAssessment implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7802555992632443716L;
	private String domain;
	private Boolean isDomain; //true: significanceOfDelay; false: screeningResult
	private String assessDate;
	private String significanceOfDelay; 
	private String screeningResult;
	private ArrayList <EIAssessmentMethod> assessmentList = new ArrayList<EIAssessmentMethod>();
	
	
	@Serialize
	public void setDomain(String domain) {
		this.domain = domain;
	}
	@Serialize
	public String getDomain() {
		return domain;
	}
	@Serialize
	public void setIsDomain(Boolean isDomain) {
		this.isDomain = isDomain;
	}
	@Serialize
	public Boolean getIsDomain() {
		return isDomain;
	}
	@Serialize
	public void setAssessDate(String assessDate) {
		this.assessDate = assessDate;
	}
	@Serialize
	public String getAssessDate() {
		return assessDate;
	}
	@Serialize
	public void setSignificanceOfDelay(String significanceOfDelay) {
		this.significanceOfDelay = significanceOfDelay;
	}
	@Serialize
	public String getSignificanceOfDelay() {
		return significanceOfDelay;
	}
	@Serialize
	public void setScreeningResult(String screeningResult) {
		this.screeningResult = screeningResult;
	}
	@Serialize
	public String getScreeningResult() {
		return screeningResult;
	}
	@Serialize
	public void setAssessmentList(ArrayList <EIAssessmentMethod> assessmentList) {
		this.assessmentList = assessmentList;
	}
	@Serialize
	public ArrayList <EIAssessmentMethod> getAssessmentList() {
		return assessmentList;
	}
}
