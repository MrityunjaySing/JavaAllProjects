package shapeproject;

import java.util.Scanner;

public class KidDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char x;
		ShapeGame a = new ShapeGame();
		do {
		Shapes s = a.pressButton();
		s.FindArea();
		s.FindParimeter();
		System.out.println("do you want to change the shape");
		System.out.println("Press Y/y to change and Press E/e to exit");
		x=sc.next().charAt(0);
		}while(x=='Y'||x=='y');
		sc.close();
	}

}
