package testing.common.data;
import  vitruvianJ.serialization.Serialize;
import vitruvianJ.serialization.xml.SimpleXml;

public class AddressData implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6039933857080543857L;
	private Long addressid;
	private Long charmid;
	private String line1;
	private String line2;
	private String city;
	private String zip5;
	private String zip4;
	
	private String usStateCode;
	private String startDate;
	private String endDate;
	private Boolean doNotReleaseFlag;
	private String note;
	
	private String deliveryText;
	private String non_us_address_text;
	private String longitude;
	private String latitude;
	private Boolean caseCertifiedFlag;
	private Boolean corrected;
	
	@Serialize	
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	@Serialize
	@SimpleXml(name="StreetLine1")
	public String getLine1() {
		return line1;
	}
	@Serialize
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	@Serialize
	public String getLine2() {
		return line2;
	}
	@Serialize
	public void setCity(String city) {
		this.city = city;
	}
	@Serialize
	public String getCity() {
		return city;
	}
	@Serialize
	public void setZip5(String zip5) {
		this.zip5 = zip5;
	}
	@Serialize
	public String getZip5() {
		return zip5;
	}
	@Serialize
	public void setZip4(String zip4) {
		this.zip4 = zip4;
	}
	@Serialize
	public String getZip4() {
		return zip4;
	}
	@Serialize
	public void setAddressid(Long addressid) {
		this.addressid = addressid;
	}
	@Serialize
	public Long getAddressid() {
		return addressid;
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
	public void setUsStateCode(String usStateCode) {
		this.usStateCode = usStateCode;
	}
	@Serialize
	public String getUsStateCode() {
		return usStateCode;
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
	@Serialize
	public void setDeliveryText(String deliveryText) {
		this.deliveryText = deliveryText;
	}
	@Serialize
	public String getDeliveryText() {
		return deliveryText;
	}
	@Serialize
	public void setNon_us_address_text(String non_us_address_text) {
		this.non_us_address_text = non_us_address_text;
	}
	@Serialize
	public String getNon_us_address_text() {
		return non_us_address_text;
	}
	@Serialize
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	@Serialize
	public String getLongitude() {
		return longitude;
	}
	@Serialize
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	@Serialize
	public String getLatitude() {
		return latitude;
	}
	@Serialize
	public void setCaseCertifiedFlag(Boolean caseCertifiedFlag) {
		this.caseCertifiedFlag = caseCertifiedFlag;
	}
	@Serialize
	public Boolean getCaseCertifiedFlag() {
		return caseCertifiedFlag;
	}
	@Serialize
	public void setCorrected(Boolean corrected) {
		this.corrected = corrected;
	}
	@Serialize
	public Boolean getCorrected() {
		return corrected;
	}
	
	
	
	public String getNonNullableLine1() {
		if(line1 != null)
			return line1;
		else
			return "";
	}

	public String getNonNullableLine2() {
		if(line2 != null)			
			return line2;
		else
			return "";
	}
	
	public String getNonNullableCity() {
		return city;
	}
	
	public String getNonNullableZip5() {
		return zip5;
	}
	
	public String getNonNullableZip4() {
		return zip4;
	}
	
	public Long getNonNullableAddressid() {
		if(addressid != null)
			return addressid;
		else
			return new Long(-1);
	}
	public Long getNonNullableCharmid() {
		if(charmid != null)
			return charmid;
		else
			return new Long(-1);
	}
	public String getNonNullableUsStateCode() {
		if(usStateCode != null)
			return usStateCode;
		else
			return "";
	}
	public String getNonNullableStartDate() {
		if(startDate != null)
			return startDate;
		else
			return "";
	}
	public String getNonNullableEndDate() {
		if(endDate != null)
			return endDate;
		else
			return "";
	}
	public Boolean getNonNullableDoNotReleaseFlag() {
		if(doNotReleaseFlag != null) return doNotReleaseFlag;
		else return new Boolean(false);
	}
	public String getNonNullableNote() {
		if(note != null) return note;
		else return "";
	}
	public String getNonNullableDeliveryText() {
		return (deliveryText != null)?deliveryText:"";
	}
	public String getNonNullableNon_us_address_text() {
		return (non_us_address_text!=null)?non_us_address_text:"";
	}
	public String getNonNullableLongitude() {
		return (longitude!= null)?longitude:"";
	}
	public String getNonNullableLatitude() {
		return (latitude!=null)?latitude:"";
	}
	public Boolean getNonNullableCaseCertifiedFlag() {
		return (caseCertifiedFlag!=null)?caseCertifiedFlag:new Boolean(false);
	}
	public Boolean getNonNullableCorrected() {
		return (corrected!=null)?corrected:new Boolean(false);
	}
	

}
