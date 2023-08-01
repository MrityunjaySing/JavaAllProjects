package part13_1_InterfaceShape;

public class Driver2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Shape s1= new Circle(10);
s1.FindArea();
s1.FindPerimeter();
System.out.println("=========================================================");
 Shape s2 = new Rectangle(10, 20);
 s2.FindArea();
 s2.FindPerimeter();

	}

}
