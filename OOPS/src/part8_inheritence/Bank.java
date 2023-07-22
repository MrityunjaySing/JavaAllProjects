package part8_inheritence;

public class Bank {
	String bname;
	String ifsc;
	String address;
	Bank(){
		
	}
	Bank(String bname, String ifsc, String address){
		this.bname = bname;
		this.ifsc=ifsc;
		this.address=address;
	}
	public void displayBank() {
		System.out.println("Bank name is:"+bname);
		System.out.println("Bank ifsc is:"+ifsc);
		System.out.println("Bank address is:"+address);	
		System.out.println("====================================");
	}

}
class SavingAccount extends Bank{
	String accname;
    long accno;
	double balance;
	 SavingAccount() {
		
	}
  SavingAccount(String bname, String ifsc, String address,
			String accname,long accno,double balance){
		super(bname, ifsc,address); 
		this.accname = accname;
		this.accno=accno;
		this.balance=balance;
	}
	public void displaySavingAccount() {
		System.out.println("coustmer name is:"+accname);
		System.out.println("accno is:"+accno);
		System.out.println("account balance is :"+balance);
		super.displayBank();
	}
}
