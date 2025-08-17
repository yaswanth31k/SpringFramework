//POJO(Plain old java object class)
package in.careerit.beans;

public class Employee {
	private int empId;
	private String empName;
	private String emailId;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int emplId) {
		this.empId = emplId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String emplName) {
		this.empName = emplName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
}