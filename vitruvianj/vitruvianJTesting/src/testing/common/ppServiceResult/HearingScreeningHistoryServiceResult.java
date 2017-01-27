package testing.common.ppServiceResult;

import java.io.Serializable;
import java.util.ArrayList;

import vitruvianJ.serialization.Serialize;


public class HearingScreeningHistoryServiceResult extends ServiceResult  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6124221082523883406L;
	private ArrayList<Test> testList = new ArrayList<Test>();
		
	public HearingScreeningHistoryServiceResult()
	{
	    super();
    }

    public HearingScreeningHistoryServiceResult(String originatingProgram, Long charmID)
    {
        super(originatingProgram, charmID);
    }

    public HearingScreeningHistoryServiceResult(String originatingProgram, Long charmID, String status)
    {
        super(originatingProgram, charmID, status);
    }

    @Serialize
	public void setTestList(ArrayList<Test> testList) {
		this.testList = testList;
	}

    @Serialize
	public ArrayList<Test> getTestList() {
		return testList;
	}
}
