package part1_initialiazation_of_mathod;

public class Vahicale {
	String name;
	int price;
	String color;
	public void setValue(String n, int p, String c) {
		name = n;
		price=p;
		color=c;
	}
	public  void dispaly() {
		System.out.println("vahicale name: "+name);
		System.out.println("vahicale price: "+price);
		System.out.println("vahicale color: "+color);
		
	}
}
