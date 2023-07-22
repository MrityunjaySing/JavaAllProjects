package part5_mathod_overloding;
 class Calculator {
	public static void sum(int a, int b)
	{
		System.out.println("int, int arg method");
		System.out.println("The sum is: "+(a+b));
	}
	public static void sum(int a, double b)
	{
		System.out.println("int, double arg method");
		System.out.println("The sum is: "+(a+b));
	}
	public static void sum(double a, int b)
	{
		System.out.println("double, int arg method");
		System.out.println("The sum is: "+(a+b));
	}
	public static void sum(double a, double b)
	{
		System.out.println("double, double arg method");
		System.out.println("The sum is: "+(a+b));
	}
	public static void sum(int a, int b, int c)
	{
		System.out.println("int, int, int arg method");
		System.out.println("The sum is: "+(a+b+c));
	}
	public static void sum(int a, int b, double c)
	{
		System.out.println("int, int, double arg method");
		System.out.println("The sum is: "+(a+b+c));
	}
	public static void sum(int a, double b, double c)
	{
		System.out.println("int, double, double arg method");
		System.out.println("The sum is: "+(a+b+c));
	}
	public static void sum(double a, double b, double c)
	{
		System.out.println("double, double, double arg method");
		System.out.println("The sum is: "+(a+b+c));
	}

}
public class MathodOverlodingDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.print(false);
		Calculator.sum(12.3, 40); 
		Calculator.sum(12, 45, 45.6);
		Calculator.sum(12, 45, 56);
		Calculator.sum(12.4, 12);

	}

}
