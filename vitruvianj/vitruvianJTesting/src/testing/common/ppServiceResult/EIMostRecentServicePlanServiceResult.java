package testing.common.ppServiceResult;

import java.io.Serializable;

import vitruvianJ.serialization.Serialize;


public class EIMostRecentServicePlanServiceResult  extends ServiceResult  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7257472726753845699L;
	private EIIFSP mostRecentIFSP;
	
	public EIMostRecentServicePlanServiceResult()
	{
	    super();
    }

    public EIMostRecentServicePlanServiceResult(String originatingProgram, Long charmID)
    {
        super(originatingProgram, charmID);
    }

    public EIMostRecentServicePlanServiceResult(String originatingProgram, Long charmID, String status)
    {
        super(originatingProgram, charmID, status);
    }

    @Serialize
	public void setMostRecentIFSP(EIIFSP mostRecentIFSP) {
		this.mostRecentIFSP = mostRecentIFSP;
	}

    @Serialize
	public EIIFSP getMostRecentIFSP() {
		return mostRecentIFSP;
	}

}
