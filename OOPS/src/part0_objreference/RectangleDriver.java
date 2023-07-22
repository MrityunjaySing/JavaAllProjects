package part0_objreference;

class Rectangle{
	double length;
	double breath;

public Rectangle(double length, double breath) {
	this.length = length;
	this.breath = breath;
}

public double calculetArea() {
	return length*breath;
}
public double claculetParameter() {
	return 2*(length+breath);
  }
}

public class RectangleDriver {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(5.0, 4.0);
		double area = r1.calculetArea();
		double perimeter = r1.claculetParameter();
		System.out.println("Area is:"+area);
		System.out.println("perimeter is:" +perimeter);

	}

}
