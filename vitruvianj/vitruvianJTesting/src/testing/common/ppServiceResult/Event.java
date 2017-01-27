package testing.common.ppServiceResult;

import java.io.Serializable;

import vitruvianJ.serialization.Serialize;

public class Event implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8890834474233547014L;
	private	String	confidentialityRequirement		;
	private	String	eventDate		;
	private	String	note		;
	
	
	
	@Serialize
	public void setConfidentialityRequirement(String confidentialityRequirement) {
		this.confidentialityRequirement = confidentialityRequirement;
	}
	@Serialize
	public String getConfidentialityRequirement() {
		return confidentialityRequirement;
	}
	@Serialize
	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}
	@Serialize
	public String getEventDate() {
		return eventDate;
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
