public class Customer implements IBusinessObject {
	
	protected long id;
	protected String code;
	protected String name;
	protected String address;
	protected String cap;
	protected String city;
	protected String province;
	protected String telephone;
	protected String vatNumber;
	
	@Override
	public long getId() {
		return id;
	} 
	
	public void setId(long id) {
		this.id = id;
	}
	
	public void setCode(String code) {
		this.code= code;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setCap(String cap) {
		this.cap = cap;
	}
	
	public String getCap() {
		return cap;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setProvince(String province) {
		this.province = province;
	}
	
	public String getProvince() {
		return province;
	}
	
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	public String getTelephone() {
		return telephone;
	}
	
	public void setVatNumber(String vatNumber) {
		this.vatNumber = vatNumber;
	}
	
	public String getVatNumber() {
		return vatNumber;
	}
	
	public boolean equals(Customer other) {
		return this.code.equals(other.code);
	}
}

