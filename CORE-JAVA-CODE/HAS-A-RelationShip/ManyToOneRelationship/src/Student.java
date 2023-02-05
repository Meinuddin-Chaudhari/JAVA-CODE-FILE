public class Student {
 
	String sId;
	String sName;
	String sAddr;
	
	Branch branch;

	public String getsId() {
		return sId;
	}
	public String getsName() {
		return sName;
	}
	public String getsAddr() {
		return sAddr;
	}
	public Branch getBranch() {
		return branch;
	}
	public void setsId(String sId) {
		this.sId = sId;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public void setsAddr(String sAddr) {
		this.sAddr = sAddr;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}	
}
