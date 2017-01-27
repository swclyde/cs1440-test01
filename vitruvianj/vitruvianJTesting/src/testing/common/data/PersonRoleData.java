package testing.common.data;

import java.lang.reflect.InvocationTargetException;

import vitruvianJ.serialization.Serialize;

public class PersonRoleData implements java.io.Serializable{
	private Long personRoleId = null;
	private Long childCharmId = null;
	private Long personCharmId = null;
	private Long roleTypeId = null;
	private String startDate = null;
	private String endDate = null;
	
	
	@Serialize
	public void setPersonRoleId(Long personRoleId) {
		this.personRoleId = personRoleId;
	}
	@Serialize
	public Long getPersonRoleId() throws Exception{
		raiseException();
		return personRoleId;
	}
	
	void raiseException() throws Exception
	{
		throw new InvocationTargetException(null);
		
	}
	@Serialize
	public void setChildCharmId(Long childCharmId) {
		this.childCharmId = childCharmId;
	}
	@Serialize
	public Long getChildCharmId() {
		return childCharmId;
	}
	@Serialize
	public void setPersonCharmId(Long personCharmId) {
		this.personCharmId = personCharmId;
	}
	@Serialize
	public Long getPersonCharmId() {
		return personCharmId;
	}
	@Serialize
	public void setRoleTypeId(Long roleTypeId) {
		this.roleTypeId = roleTypeId;
	}
	@Serialize
	public Long getRoleTypeId() {
		return roleTypeId;
	}
	@Serialize
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	@Serialize
	public String getStartDate() {
		return startDate;
	}
	@Serialize
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	@Serialize
	public String getEndDate() {
		return endDate;
	}
	
	

}
