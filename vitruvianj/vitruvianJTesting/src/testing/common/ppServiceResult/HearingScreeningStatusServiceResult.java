package testing.common.ppServiceResult;

import java.util.ArrayList;

import vitruvianJ.serialization.Serialize;


public class HearingScreeningStatusServiceResult extends ServiceResult {

	/**
	 * 
	 */
	private static final long serialVersionUID = -732837521844225435L;

	private ArrayList<MostConclusiveResult> mostConclusiveResultList = new ArrayList<MostConclusiveResult>();
	
	private String rightDisposition;
	private String leftDisposition;
	private String soundField;
	
	public HearingScreeningStatusServiceResult()
	{
	    super();
    }

    public HearingScreeningStatusServiceResult(String originatingProgram, Long charmID)
    {
        super(originatingProgram, charmID);
    }

    public HearingScreeningStatusServiceResult(String originatingProgram, Long charmID, String status)
    {
        super(originatingProgram, charmID, status);
    }

    @Serialize
	public void setMostConclusiveResultList(ArrayList<MostConclusiveResult> mostConclusiveResultList) {
		this.mostConclusiveResultList = mostConclusiveResultList;
	}

	@Serialize
	public ArrayList<MostConclusiveResult> getMostConclusiveResultList() {
		return mostConclusiveResultList;
	}

	@Serialize
	public void setRightDisposition(String rightDisposition) {
		this.rightDisposition = rightDisposition;
	}

	@Serialize
	public String getRightDisposition() {
		return rightDisposition;
	}

	@Serialize
	public void setLeftDisposition(String leftDisposition) {
		this.leftDisposition = leftDisposition;
	}

	@Serialize
	public String getLeftDisposition() {
		return leftDisposition;
	}

	@Serialize
	public void setSoundField(String soundField) {
		this.soundField = soundField;
	}

	@Serialize
	public String getSoundField() {
		return soundField;
	}
}
