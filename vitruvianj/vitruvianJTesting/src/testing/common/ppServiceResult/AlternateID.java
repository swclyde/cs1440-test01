package testing.common.ppServiceResult;

import java.io.Serializable;

import vitruvianJ.serialization.Serialize;

public class AlternateID implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2253806350970600788L;
	private String type;
	private String value;
	
	@Serialize
	public void setType(String type) {
		this.type = type;
	}
	@Serialize
	public String getType() {
		return type;
	}
	@Serialize
	public void setValue(String value) {
		this.value = value;
	}
	@Serialize
	public String getValue() {
		return value;
	}
	
}
