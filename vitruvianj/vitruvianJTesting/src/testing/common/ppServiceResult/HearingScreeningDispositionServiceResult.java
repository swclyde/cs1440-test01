package testing.common.ppServiceResult;

import java.io.Serializable;

import vitruvianJ.serialization.Serialize;

public class HearingScreeningDispositionServiceResult extends ServiceResult  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6387629582798821175L;
	private String rightDisposition;
	private String leftDisposition;
	private String soundField;
	
	public HearingScreeningDispositionServiceResult()
	{
	    super();
    }

    public HearingScreeningDispositionServiceResult(String originatingProgram, Long charmID)
    {
        super(originatingProgram, charmID);
    }

    public HearingScreeningDispositionServiceResult(String originatingProgram, Long charmID, String status)
    {
        super(originatingProgram, charmID, status);
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
