package part6_Has_A_Relationship;

/**
 * @author satyam
 *
 */
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car("BMW", "Blue&Black", 3000000);
		c.displayCar();
		Car c1 = new Car("Audi", "White", 2000000, new ENgine(5000, 6, "Diesel"));
		c1.displayCar();
		Car c2 = new Car("Rolls Royce", "Gold", 8000000, new ENgine(8000, 6, "Diesel"));
		c2.displayCar();
 
	}

}
