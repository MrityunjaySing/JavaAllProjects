package part2_Parametrise_constructor;

public class Fruit {
	String name;
	int price;
	String color;
	double weight;

	Fruit(String name, int price, String color, double weight) {
		this.name = name;
		this.price = price;
		this.color = color;
		this.weight = weight;
	}

	public void display() {
		/* System.out.println("fruit name is:"+name+" "+price+" "+color+" "+weight); */
		System.out.println("fruit name is:" +name);
		 System.out.println("fruit price is:" +price);
		  System.out.println("fruit color is:" +color);
		  System.out.println("fruit weight is:" +weight);
		 	}

}
