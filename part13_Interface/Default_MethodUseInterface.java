package part13_Interface;

import java.util.Scanner;

interface Polygone{
	void getArea();
	
//	default method create
	default void getSide() {
	System.out.println("i can get side of the polygon");	
	}
}
// implement the interface
class Rectangle implements Polygon{
	public void getArea(int length,int breadth ) {
		int area = length * breadth;
		System.out.println("Area of rectangle is :" + area);
	}
	public void getSide() {
		System.out.println("I have 4 side");
	}
	@Override
	public void getPerimeterRect(int length, int breadth) {
		// TODO Auto-generated method stub
		
	}
}
public class Default_MethodUseInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Rectangle r1 = new Rectangle();
r1.getArea(10, 5);
r1.getSide();

	}

}
