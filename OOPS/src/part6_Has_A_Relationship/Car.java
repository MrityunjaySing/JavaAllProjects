package part6_Has_A_Relationship;

/**
 * @author satyam
 *
 */
public class Car {
	String brand;
	String colour;
	double price;
	ENgine e = new ENgine(2000, 6, "Diesel");
	Car() {
	}
	Car(String brand, String colour, double price) {
	this.brand = brand;
	this.colour = colour;
	this.price = price;
	}
	Car(String brand, String colour, double price,ENgine e) {
	this.brand = brand;
	this.colour = colour;
	this.price = price;
	this.e=e;
	}
	void displayCar() {
	System.out.println("Car Brand: " + brand);
	System.out.println("Car Colour: " + colour);
	System.out.println("Car Price: " + price);
	e.displayENgine();
	}
}
