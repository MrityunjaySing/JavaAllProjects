package part1_initialiazation_of_mathod;

public class Mobile {
	String name;
	int price;
	String color;
public void setValue(String n,int p, String c) {
	name = n;
	price=p;
	color=c;
}
public void displayCar() {
	// TODO Auto-generated method stub
	System.out.println("Mobile name:" +name);
	System.out.println("Mobile price:" +price);
	System.out.println("Mobile color:" +color);
}
}
