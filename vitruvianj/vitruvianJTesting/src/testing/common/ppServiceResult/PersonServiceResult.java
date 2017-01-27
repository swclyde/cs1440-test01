package testing.common.ppServiceResult;

import java.io.Serializable;

import testing.common.data.PersonData;
import vitruvianJ.serialization.Serialize;

public class PersonServiceResult extends ServiceResult  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4704355710103861592L;
	private PersonData person;
		
	public PersonServiceResult()
	{
	    super();
    }

    public PersonServiceResult(String originatingProgram, Long charmID)
    {
        super(originatingProgram, charmID);
    }

    public PersonServiceResult(String originatingProgram, Long charmID, String status)
    {
        super(originatingProgram, charmID, status);
    }

    @Serialize
	public void setPerson(PersonData person) {
		this.person = person;
	}

    @Serialize
	public PersonData getPerson() {
		return person;
	}
}
