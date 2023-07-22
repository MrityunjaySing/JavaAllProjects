package part8_inheritence;

public class VahicalDriver {
public static void main(String[] args) {
	Vahical v1 = new Vahical();
	System.out.println(v1.a);
	v1.test();
	System.out.println("=================================");
	Car c1 = new Car();
	System.out.println(c1.x);
	System.out.println(c1.a);
	c1.demo();
	c1.test();
}
}
