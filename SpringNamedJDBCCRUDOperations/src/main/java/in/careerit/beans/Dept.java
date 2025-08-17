package in.careerit.beans;

public class Dept {
	private int deptNo;
	private String DName;
	private String loc;
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	public void setDName(String dName) {
		DName = dName;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	@Override
	public String toString() {
		return "[deptNo=" + deptNo + ", DName=" + DName + ", loc=" + loc + "]";
	}
	
	
}
