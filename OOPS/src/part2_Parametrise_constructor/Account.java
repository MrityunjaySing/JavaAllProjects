package part2_Parametrise_constructor;

public class Account {
	int acc_no;
	String name;
	float amount;
	void insert(int a,String n,float amt)
	{
		acc_no=a;
		name=n;
		amount=amt;
	}
	//deposit method
	void deposit(float amt)
	{
		amount=amount+amt;
		System.out.println(amt+ " Deposited");
	}
	//withdraw method
	void withdraw(float amt)
	{
		if(amount<amt)
		{
			System.out.println("INSUFFICIENT BALANCE");
		}
		else
		{
			amount=amount-amt;
			System.out.println(amt+ " WITHDRAWN");
		}
	}
	void checkBalance()
	{
		System.out.println("Balance is: " +amount);
	}
	//method to display the value of object
	void display()
	{
		System.out.println("ACCOUNT NO IS: "+acc_no);
		System.out.println("Name of Account Holder is: "+name);
		System.out.println("AMOUNT IS: "+amount);
	}
}
