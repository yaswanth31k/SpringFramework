package in.careerit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	private int stuId;
	private String stuName;
	private String emailId;
	@Autowired
	@Qualifier("add")
	private Address pAddress;
	@Autowired
	@Qualifier("add1")
	private Address cAddress;

	
//	public Student() {
//		
//	}
//	
//	
//	public Student(int stuId, String stuName, String emailId, Address address) {
//		this.stuId = stuId;
//		this.stuName = stuName;
//		this.emailId = emailId;
//		this.address = address;
//	}



	public int getStuId() {
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

	

	
	
	@Override
	public String toString() {
		return "Student [" + stuId + ", " + stuName + ", " + emailId + ",{ " + pAddress + "}"+",{ " + cAddress + "}]";
	}
	
	
}
