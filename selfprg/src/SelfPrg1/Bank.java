package SelfPrg1;

public class Bank {

	private String IFSCcode;
	private String BranchName;
	private String City;
	
	private BranchPhNo branchPhNo;
	
	public Bank() {
		// TODO Auto-generated constructor stub
	}
	
	public Bank(String iFSCcode, String branchName, String city) {
		super();
		IFSCcode = iFSCcode;
		BranchName = branchName;
		this.City = city;
	}

	

	public String getIFSCcode() {
		return IFSCcode;
	}

	public void setIFSCcode(String iFSCcode) {
		IFSCcode = iFSCcode;
	}

	public String getBranchName() {
		return BranchName;
	}

	public void setBranchName(String branchName) {
		BranchName = branchName;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		this.City = city;
	}

	public BranchPhNo getBranchPhNo() {
		return branchPhNo;
	}

	public void setBranchPhNo(BranchPhNo branchPhNo) {
		this.branchPhNo = branchPhNo;
	}



	
	


	



	
	
}