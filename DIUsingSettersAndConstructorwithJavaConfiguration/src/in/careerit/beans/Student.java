package in.careerit.beans;

public class Student {
	private int stuId;
	private String stuName;
	private String emailId;
	private Address address;
	public Student() {
		
	}
	
	
	public Student(int stuId, String stuName, String emailId, Address address) {
		this.stuId = stuId;
		this.stuName = stuName;
		this.emailId = emailId;
		this.address = address;
	}



	/*public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	*/

	
	
	@Override
	public String toString() {
		return "Student [" + stuId + ", " + stuName + ", " + emailId + ",{ " + address+ "}]";
	}
	
	
}
