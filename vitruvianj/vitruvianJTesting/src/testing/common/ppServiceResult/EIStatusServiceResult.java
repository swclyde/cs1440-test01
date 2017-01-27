package testing.common.ppServiceResult;

import java.io.Serializable;

import vitruvianJ.serialization.Serialize;


public class EIStatusServiceResult extends ServiceResult  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6017247064579282041L;
	private String mostRecentInitialReferralDate;
	private String eiStatus; //could be referred, pending enrollment, enrolled,  tracking, deactivated
	private String eiEligibilityCategory;
	
	public EIStatusServiceResult()
	{
	    super();
    }

    public EIStatusServiceResult(String originatingProgram, Long charmID)
    {
        super(originatingProgram, charmID);
    }

    public EIStatusServiceResult(String originatingProgram, Long charmID, String status)
    {
        super(originatingProgram, charmID, status);
    }

    @Serialize
	public void setMostRecentInitialReferralDate(String mostRecentInitialReferralDate) {
		this.mostRecentInitialReferralDate = mostRecentInitialReferralDate;
	}

    @Serialize
	public String getMostRecentInitialReferralDate() {
		return mostRecentInitialReferralDate;
	}

	@Serialize
	public void setEiStatus(String eiStatus) {
		this.eiStatus = eiStatus;
	}

	@Serialize
	public String getEiStatus() {
		return eiStatus;
	}

	@Serialize
	public void setEiEligibilityCategory(String eiEligibilityCategory) {
		this.eiEligibilityCategory = eiEligibilityCategory;
	}

	@Serialize
	public String getEiEligibilityCategory() {
		return eiEligibilityCategory;
	}
}
