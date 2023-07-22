package part8_inheritence;

public class BankDriver {

	public static void main(String[] args) {
		Bank b1 = new Bank("SBI","SBI0123","NOIDA");
		b1.displayBank();
		SavingAccount s1 = new SavingAccount("HDFC","HDFC123","GNOIDA",
				"SATYAM", 3434001, 50000.03);
		s1.displaySavingAccount();

	}
}
