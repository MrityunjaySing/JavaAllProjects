package part8_inheritence;
class one{
	public void geek() {
		System.out.println("this is single inheritence");
	}
}
	class two extends one{
		public void print_for() {
			System.out.println("this is using base class");
	}
	}
public class Geeksmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		two g = new two();
		g.geek();
		g.print_for();
		g.geek();
		

	}

}
