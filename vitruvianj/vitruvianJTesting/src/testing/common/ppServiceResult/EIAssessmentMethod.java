package testing.common.ppServiceResult;

import java.io.Serializable;

import vitruvianJ.serialization.Serialize;

public class EIAssessmentMethod implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4307094742107071232L;
	private String assessmentMethod;
	private String standardizedScore;
	
	
	@Serialize
	public void setAssessmentMethod(String assessmentMethod) {
		this.assessmentMethod = assessmentMethod;
	}
	@Serialize
	public String getAssessmentMethod() {
		return assessmentMethod;
	}
	@Serialize
	public void setStandardizedScore(String standardizedScore) {
		this.standardizedScore = standardizedScore;
	}
	@Serialize
	public String getStandardizedScore() {
		return standardizedScore;
	}
	
	
}
