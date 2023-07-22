package part10_Overriding;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius");
		int r = sc.nextInt();
		Shape s1= new Circle(r);
		s1.findArea();
		s1.findParameter();
		System.out.println("======================================");
		System.out.println("Enter the length:");
		int l = sc.nextInt();
		System.out.println("Enter the width:");
		int w= sc.nextInt();
		Shape s2 = new Ractangle(l,w);
		s2.findArea();
		s2.findParameter();

	}

}
