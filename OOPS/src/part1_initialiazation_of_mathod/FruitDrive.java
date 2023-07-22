package part1_initialiazation_of_mathod;

public class FruitDrive {

	public static void main(String[] args) {
		Fruit f1 = new Fruit();
		f1.setValue("Mango", 200, "Yellow");
		Fruit f2 = new Fruit();
		f2.setValue("Papaya", 100, "Green");
		Fruit f3 = new Fruit();
		f3.setValue("Banana",150, "yello");
		
		f1.display();
		f2.display();
		f3.display();

	}

}
