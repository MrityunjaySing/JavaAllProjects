package part1_initialiazation_of_mathod;

public class Fruit {

	String name;
	int price;
	String color;

	public void setValue(String n, int p, String c) {
		name = n;
		price=p;
		color=c;
	}
	public void display() {
		System.out.println("fruit name: "+name);
		System.out.println("fruit price: "+price);
		System.out.println("fruit color: "+color);
	}

}
