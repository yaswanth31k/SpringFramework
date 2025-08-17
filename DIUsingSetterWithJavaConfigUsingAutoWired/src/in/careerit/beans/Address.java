package in.careerit.beans;

public class Address {
	private String plotNo;
	private String houseNo;
	private String Street;
	private String city;
	private String pincode;
//	public Address() {
//		
//	}
//	
//	
//	public Address(String plotNo, String houseNo, String street, String city, String pincode) {
//		this.plotNo = plotNo;
//		this.houseNo = houseNo;
//		this.Street = street;
//		this.city = city;
//		this.pincode = pincode;
//	}



	public String getPlotNo() {
		return plotNo;
	}
	public void setPlotNo(String plotNo) {
		this.plotNo = plotNo;
	}
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	
	@Override
	public String toString() {
		return  plotNo + ", " + houseNo + ", " + Street + ", " + city
				+ ", " + pincode ;
	}


}
