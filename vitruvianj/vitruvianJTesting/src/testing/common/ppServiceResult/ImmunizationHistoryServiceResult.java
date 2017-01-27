package testing.common.ppServiceResult;

import java.io.Serializable;
import java.util.ArrayList;

import vitruvianJ.serialization.Serialize;

public class ImmunizationHistoryServiceResult extends ServiceResult  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4162729415846080678L;
	private ArrayList<ImmunizationEvent> immunizationEventList = new ArrayList<ImmunizationEvent>();
	
	public ImmunizationHistoryServiceResult()
	{
	    super();
    }

    public ImmunizationHistoryServiceResult(String originatingProgram, Long charmID)
    {
        super(originatingProgram, charmID);
    }

    public ImmunizationHistoryServiceResult(String originatingProgram, Long charmID, String status)
    {
        super(originatingProgram, charmID, status);
    }

    @Serialize
	public void setImmunizationEventList(ArrayList<ImmunizationEvent> immunizationEventList) {
		this.immunizationEventList = immunizationEventList;
	}

    @Serialize
	public ArrayList<ImmunizationEvent> getImmunizationEventList() {
		return immunizationEventList;
	}
}
