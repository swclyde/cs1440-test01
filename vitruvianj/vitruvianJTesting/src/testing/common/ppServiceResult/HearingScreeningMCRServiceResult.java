package testing.common.ppServiceResult;

import java.io.Serializable;
import java.util.ArrayList;

import vitruvianJ.serialization.Serialize;

public class HearingScreeningMCRServiceResult extends ServiceResult  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4905549633773364875L;
	private ArrayList<MostConclusiveResult> mostConclusiveResultList = new ArrayList<MostConclusiveResult>();
	
	public HearingScreeningMCRServiceResult()
	{
	    super();
    }

    public HearingScreeningMCRServiceResult(String originatingProgram, Long charmID)
    {
        super(originatingProgram, charmID);
    }

    public HearingScreeningMCRServiceResult(String originatingProgram, Long charmID, String status)
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

}
