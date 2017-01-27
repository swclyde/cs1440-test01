package testing.common.data;

import vitruvianJ.serialization.Serialize;

public class AlertData implements java.io.Serializable{

	private Long alertid;
	private Long charmid;
	private String alertcategory;
	private String severity;
	private String origprogram;
	private String message;
	private String alertdate;
	private String expirationdate;
	
	@Serialize
	public void setAlertid(Long alertid) {
		this.alertid = alertid;
	}
	@Serialize
	public Long getAlertid() {
		return alertid;
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
	public void setAlertcategory(String alertcategory) {
		this.alertcategory = alertcategory;
	}
	@Serialize
	public String getAlertcategory() {
		return alertcategory;
	}
	@Serialize
	public void setSeverity(String severity) {
		this.severity = severity;
	}
	@Serialize
	public String getSeverity() {
		return severity;
	}
	@Serialize
	public void setOrigprogram(String origprogram) {
		this.origprogram = origprogram;
	}
	@Serialize
	public String getOrigprogram() {
		return origprogram;
	}
	@Serialize
	public void setMessage(String message) {
		this.message = message;
	}
	@Serialize
	public String getMessage() {
		return message;
	}
	@Serialize
	public void setAlertdate(String alertdate) {
		this.alertdate = alertdate;
	}
	@Serialize
	public String getAlertdate() {
		return alertdate;
	}
	@Serialize
	public void setExpirationdate(String expirationdate) {
		this.expirationdate = expirationdate;
	}
	@Serialize
	public String getExpirationdate() {
		return expirationdate;
	}
	
	
}
