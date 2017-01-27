package testing.common.data;

import vitruvianJ.serialization.Serialize;

public class AliasData implements java.io.Serializable{
	
	private Long aliasId;
	private Long charmId;
	private String lastName;
	private String firstName;
	private String middleName;
	private String suffix;
	
	@Serialize
	public void setAliasId(Long aliasId) {
		this.aliasId = aliasId;
	}
	@Serialize
	public Long getAliasId() {
		return aliasId;
	}
	@Serialize
	public void setCharmId(Long charmId) {
		this.charmId = charmId;
	}
	@Serialize
	public Long getCharmId() {
		return charmId;
	}
	@Serialize
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Serialize
	public String getLastName() {
		return lastName;
	}
	@Serialize
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	@Serialize
	public String getFirstName() {
		return firstName;
	}
	@Serialize
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	@Serialize
	public String getMiddleName() {
		return middleName;
	}
	@Serialize
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	@Serialize
	public String getSuffix() {
		return suffix;
	}
	
	

}
