package in.careerit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	private int stuId;
	private String stuName;
	private String emailId;
	
	private Address pAddress;
	private Address cAddress;
		
	Student(int stuId, String stuName, String emailId, Address pAddress, Address cAddress) {
		this.stuId = stuId;
		this.stuName = stuName;
		this.emailId = emailId;
		this.pAddress = pAddress;
		this.cAddress = cAddress;
	}



	
//	public int getStuId() {
//		return stuId;
//	}
//	public void setStuId(int stuId) {
//		this.stuId = stuId;
//	}
//	public String getStuName() {
//		return stuName;
//	}
//	public void setStuName(String stuName) {
//		this.stuName = stuName;
//	}
//	public String getEmailId() {
//		return emailId;
//	}
//	public void setEmailId(String emailId) {
//		this.emailId = emailId;
//	}
//	
//	
//	
//	public Address getpAddress() {
//		return pAddress;
//	}
//	public void setpAddress(Address pAddress) {
//		this.pAddress = pAddress;
//	}
//	public Address getcAddress() {
//		return cAddress;
//	}
//	public void setcAddress(Address cAddress) {
//		this.cAddress = cAddress;
//	}
	@Override
	public String toString() {
		return "Student [" + stuId + ", " + stuName + ", " + emailId + ",{ " + pAddress + "}"+",{ " + cAddress + "}]";
	}
	
	
}
