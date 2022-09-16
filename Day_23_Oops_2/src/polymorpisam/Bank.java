package polymorpisam;

public class Bank {
	private String branch;
	private String ifscCode;
	private boolean isHaveAtm;
	
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getBranch() {
		return branch;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIsHaveAtm(boolean isHaveAtm) {
		this.isHaveAtm = isHaveAtm;
	}
	
	public Bank(String branch, String ifcsCode, boolean isHaveATM) {
		this.branch = branch;
		this.ifscCode = ifscCode;
		//this.isHaveATM = isHaveATM;
		
	}

}
