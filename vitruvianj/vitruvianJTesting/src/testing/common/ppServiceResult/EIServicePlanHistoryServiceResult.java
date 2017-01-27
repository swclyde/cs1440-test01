package testing.common.ppServiceResult;

import java.io.Serializable;
import java.util.ArrayList;

import vitruvianJ.serialization.Serialize;

public class EIServicePlanHistoryServiceResult extends ServiceResult  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7753891686841522714L;
	private ArrayList <EIIFSP> IFSPList = new ArrayList<EIIFSP>();
	
	public EIServicePlanHistoryServiceResult()
	{
	    super();
    }

    public EIServicePlanHistoryServiceResult(String originatingProgram, Long charmID)
    {
        super(originatingProgram, charmID);
    }

    public EIServicePlanHistoryServiceResult(String originatingProgram, Long charmID, String status)
    {
        super(originatingProgram, charmID, status);
    }

    @Serialize
	public void setIFSPList(ArrayList <EIIFSP> iFSPList) {
		IFSPList = iFSPList;
	}

    @Serialize
	public ArrayList <EIIFSP> getIFSPList() {
		return IFSPList;
	}

}
