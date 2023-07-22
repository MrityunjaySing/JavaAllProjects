package part2_Parametrise_constructor;

/**
 * @author satyam
 *
 */
public class FruitDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit f1 = new Fruit("Papaya", 200, "green", 5);
		Fruit f2 = new Fruit("Orange", 300, "Yello", 5);
		f1.display();
		System.out.println("==================================================");
		f2.display();
		

	}

}
