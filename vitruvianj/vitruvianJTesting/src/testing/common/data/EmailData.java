package testing.common.data;

import vitruvianJ.serialization.Serialize;

public class EmailData implements java.io.Serializable{
	
	private Long emailid;
	private Long charmid;
	private String email;
	
	@Serialize
	public void setEmailid(Long emailid) {
		this.emailid = emailid;
	}
	@Serialize
	public Long getEmailid() {
		return emailid;
	}
	@Serialize
	public void setCharmid(Long charmid) {
		this.charmid = charmid;
	}
	@Serialize
	public Long getCharmid() {
		return charmid;
	}
	@Serialize
	public void setEmail(String email) {
		this.email = email;
	}
	@Serialize
	public String getEmail() {
		return email;
	}
	
}
