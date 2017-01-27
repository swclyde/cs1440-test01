package testing.common.ppServiceResult;

import java.io.Serializable;
import java.util.ArrayList;

import vitruvianJ.serialization.Serialize;

public class NbsSampleCardServiceResult extends ServiceResult implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8773822903555000666L;
	private ArrayList<NbsSample> nbsSampleList = new ArrayList<NbsSample>();
	
	public NbsSampleCardServiceResult()
	{
	    super();
    }

    public NbsSampleCardServiceResult(String originatingProgram, Long charmID)
    {
        super(originatingProgram, charmID);
    }

    public NbsSampleCardServiceResult(String originatingProgram, Long charmID, String status)
    {
        super(originatingProgram, charmID, status);
    }

    @Serialize
	public void setNbsSampleList(ArrayList<NbsSample> nbsSampleList) {
		this.nbsSampleList = nbsSampleList;
	}

    @Serialize
	public ArrayList<NbsSample> getNbsSampleList() {
		return nbsSampleList;
	}
}
