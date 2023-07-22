package shapeproject;

import java.util.Scanner;

public class ShapeGame {
	public Shapes pressButton() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1 get squre or 2 get circle and 3 get Rectangle");
		int s = sc.nextInt();

		switch(s) {

		case 1:
			System.out.println("Enter the radius of circle");
			int num = sc.nextInt();
			System.out.println("your get Area of circle :"+3.14*num*num);
			System.out.println(num);
			System.out.println("Enter the Paramete of circle");
			double  paremeter= sc.nextInt();
			System.out.println("your get Area of Paremeter :"+2*3.14*num);
			System.out.println(paremeter);
			Circle c = new Circle();
			return c;	
		case 2:

			System.out.println("Enter Area of squre");
			float squres = sc.nextFloat();

			System.out.println("\nArea ="+squres*squres);

			System.out.println("Enter perimeter of squre");
			double parimeter = sc.nextFloat();
			parimeter = 4*squres;
			System.out.println("\n Perimeter = "+parimeter);
			Squre sq = new Squre();
			return sq;

		case 3:
			System.out.println("Calculet and All Details Rectangle :");
			System.out.println("Enter the width");
			double width = sc.nextDouble();
			System.out.println("Enter the Hight");
			double hight = sc.nextDouble();
			double area = width*hight;
			System.out.println("Your Rectangle Area is"+area);

			System.out.println("Parimeter of Rectangle");
			System.out.println("Enter the width");
			width = sc.nextDouble();
			System.out.println("Enter the Hight");
			hight = sc.nextDouble();
			double perimeters = sc.nextDouble();
			paremeter = 2*(width+hight);
			System.out.println("your parimeter  is:"+perimeters);
			Rectangle rectangle = new  Rectangle();
			return rectangle;

		default:
			System.out.println("invalid number");
			return pressButton();

		}

	}

}

