package part8_inheritence;

public class Vahical {
int a=10;
public void test() {
	System.out.println("test mathod");
	int b=40;
	System.out.println(b);
	System.out.println(a);
}
}
class Car extends Vahical{
	int x=50;
	public void demo() {
		System.out.println("This is demo mathod");
		int y=60;
		System.out.println(y);
		System.out.println(x);
		System.out.println(a);
		test();
	}
}
