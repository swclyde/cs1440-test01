package testing.common.ppServiceResult;

import java.io.Serializable;
import java.util.ArrayList;

import vitruvianJ.serialization.Serialize;

public class NbsMailerResultsServiceResult extends ServiceResult implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -644496366862367401L;
	private ArrayList<NbsResult> nbsResultList = new ArrayList<NbsResult>();
	
	public NbsMailerResultsServiceResult()
	{
	    super();
    }

    public NbsMailerResultsServiceResult(String originatingProgram, Long charmID)
    {
        super(originatingProgram, charmID);
    }

    public NbsMailerResultsServiceResult(String originatingProgram, Long charmID, String status)
    {
        super(originatingProgram, charmID, status);
    }

    @Serialize
	public void setNbsResultList(ArrayList<NbsResult> nbsResultList) {
		this.nbsResultList = nbsResultList;
	}

    @Serialize
	public ArrayList<NbsResult> getNbsResultList() {
		return nbsResultList;
	}
}
