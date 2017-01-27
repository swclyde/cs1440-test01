package testing.common.data.doNotSerialize;
import vitruvianJ.serialization.DontSerialize;
import vitruvianJ.serialization.Serialize;

public class MyAddressData implements java.io.Serializable{
	/**
	 * 
	 */

	private Long addressid;
	private Long charmid;
	private String line;	
	private String city;
	private String zip;
	
	
	@DontSerialize
	public void setLine(String line) {
		this.line = line;
	}
	@DontSerialize
	public String getLine() {
		return line;
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
	public void setZip(String zip) {
		this.zip = zip;
	}
	@Serialize
	public String getZip() {
		return zip;
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
	
	
	

}
