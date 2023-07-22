package part2_Parametrise_constructor;

public class AccountDriver {

	public static void main(String[] args) {
		Account a1=new Account();
		a1.insert(832345, "Mrityunjay", 10000);
		a1.display();
		a1.checkBalance();
		a1.deposit(40000);
		a1.checkBalance();
		a1.withdraw(15000);
		a1.checkBalance();

	}

}
