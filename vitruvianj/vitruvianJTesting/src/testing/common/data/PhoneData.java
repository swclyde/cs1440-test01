package testing.common.data;

import vitruvianJ.serialization.Serialize;

public class PhoneData implements java.io.Serializable{
	
	private Long phoneid;
	private Long charmid;
	private String phone;
	private String startDate;
	private String endDate;
	private Boolean doNotReleaseFlag;
	private String note;

	@Serialize
	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Serialize
	public String getPhone() {
		return phone;
	}

	@Serialize
	public void setPhoneid(Long phoneid) {
		this.phoneid = phoneid;
	}

	@Serialize
	public Long getPhoneid() {
		return phoneid;
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

	@Serialize
	public void setDoNotReleaseFlag(Boolean doNotReleaseFlag) {
		this.doNotReleaseFlag = doNotReleaseFlag;
	}

	@Serialize
	public Boolean getDoNotReleaseFlag() {
		return doNotReleaseFlag;
	}

	@Serialize
	public void setNote(String note) {
		this.note = note;
	}

	@Serialize
	public String getNote() {
		return note;
	}
	

}
