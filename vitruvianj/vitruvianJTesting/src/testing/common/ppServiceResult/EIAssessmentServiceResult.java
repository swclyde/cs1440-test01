package testing.common.ppServiceResult;

import java.io.Serializable;
import java.util.ArrayList;

import vitruvianJ.serialization.Serialize;

public class EIAssessmentServiceResult extends ServiceResult  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5370787312833307608L;
	private ArrayList <EIAssessment> assessmentList = new ArrayList<EIAssessment>();
	
	public EIAssessmentServiceResult()
	{
	    super();
    }

    public EIAssessmentServiceResult(String originatingProgram, Long charmID)
    {
        super(originatingProgram, charmID);
    }

    public EIAssessmentServiceResult(String originatingProgram, Long charmID, String status)
    {
        super(originatingProgram, charmID, status);
    }

    @Serialize
	public void setAssessmentList(ArrayList <EIAssessment> assessmentList) {
		this.assessmentList = assessmentList;
	}

    @Serialize
	public ArrayList <EIAssessment> getAssessmentList() {
		return assessmentList;
	}
}
