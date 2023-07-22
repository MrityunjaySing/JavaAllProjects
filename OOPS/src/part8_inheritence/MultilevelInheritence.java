package part8_inheritence;


/**
 * @author satyam
 *
 */

class one1{
	public 	void print_geeks() {
System.out.println("this is base class");
   }
}
class two2 extends one1{
	public void print_geek1() {
		System.out.println("this is print intermediate class");
	}
}

class three3 extends two2{
	void print_geeks2() {
		System.out.println("this is print drived class");
	}
}
public class MultilevelInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		three3 m1 = new three3();
		m1.print_geeks();
		m1.print_geek1();
		m1.print_geeks2();
		

	}

}
