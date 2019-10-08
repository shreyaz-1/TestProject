package SelfPrg1;

public class Display {
public static void main(String[] args) {
	
	Bank b1=new Bank();
	b1.setIFSCcode("123");
	b1.setBranchName("a");
	b1.setCity("A");
	System.out.println(b1.getCity());
	System.out.println("IFSCcode:" +b1.getIFSCcode() + "EMAIL:" +b1.getBranchName()+"City"+b1.getCity());
	
	Bank b2=new Bank("1234","b","B");
	System.out.println(b2.getIFSCcode());
	System.out.println(b2.getBranchName());
	System.out.println(b2.getCity());
	
	Bank b3=new Bank("12345","c","Cqrq");
	
	BranchPhNo b=new BranchPhNo();
	b.setName("shreya");
	b.setEmail("asd@dn");
	b.setMobileNo("275");
	b3.setBranchPhNo(b);
	System.out.println("IFSCcode:" +b3.getIFSCcode() +"CustomerNAME:" +b3.getBranchName()+"City:" +b3.getCity() +"name:" +b.getName()+"CustomerEMAIL:" +b.getEmail()+"phonenos"+b3.getBranchPhNo().getMobileNo());
}


}
