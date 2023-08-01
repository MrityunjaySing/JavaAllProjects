package part13_Interface;

import java.util.Scanner;

//  first interface  polygon interface use in reactangle
interface Polygon{
	void getArea(int length, int breadth);
	void getPerimeterRect(int length , int breadth);
}
// second interface   circle interface use and perimeter defind
interface Circle1{
	//	here is abstract method
	void getCircle(double r);
	void getPerimeter(double r);
}
// implemet the polygon interface  and Circl1 
class Reactangle implements Polygon, Circle1{
	//	=================here is using area of reactangle and area of perimeter======================
	//	 ==================the implementation of the abstract method=================================

	public void getArea(int length, int breadth) {
		System.out.println("the area of reacangle is :" + (length * breadth));	
	}
	public void getPerimeterRect(int length , int breadth) {
		System.out.println("Area of rectangle perimeter is : " + 2*(length + breadth));
	}

	//	==================== here is using area of circle and circle perimeter========================
	public void getCircle(double r) {
		System.out.println("area of circle is :" + (2*3.14*r*r));
	}
	public void getPerimeter(double r) {
		System.out.println("Area of circle perimeter is:"+ (2*3.14*r));
	}
}
public class PolygonRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Reactangle r1 = new Reactangle();
		r1.getArea(5, 6);
		r1.getPerimeterRect(5,6);
		System.out.println("============================================");
		r1.getCircle(5);
		r1.getPerimeter(10);
	}

}
