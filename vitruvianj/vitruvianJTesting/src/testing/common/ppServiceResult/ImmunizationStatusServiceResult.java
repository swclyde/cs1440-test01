package testing.common.ppServiceResult;

import java.io.Serializable;
import java.util.ArrayList;

import vitruvianJ.serialization.Serialize;


public class ImmunizationStatusServiceResult extends ServiceResult  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4065438919377415088L;
	private ArrayList<ImmunizationStatusData> immunizationStatusList = new ArrayList<ImmunizationStatusData>();
	private	String	overallStatus	;
		
	public ImmunizationStatusServiceResult()
	{
	    super();
    }

    public ImmunizationStatusServiceResult(String originatingProgram, Long charmID)
    {
        super(originatingProgram, charmID);
    }

    public ImmunizationStatusServiceResult(String originatingProgram, Long charmID, String status)
    {
        super(originatingProgram, charmID, status);
    }

    @Serialize
	public void setImmunizationStatusList(ArrayList<ImmunizationStatusData> immunizationStatusList) {
		this.immunizationStatusList = immunizationStatusList;
	}

	@Serialize
	public ArrayList<ImmunizationStatusData> getImmunizationStatusList() {
		return immunizationStatusList;
	}

	@Serialize
	public void setOverallStatus(String overallStatus) {
		this.overallStatus = overallStatus;
	}

	@Serialize
	public String getOverallStatus() {
		return overallStatus;
	}
}
