package part12_Abstraction;

abstract class MoterBike{
	abstract void brake();
}
class SportsBike extends MoterBike{
	public void brake() {
		System.out.println("sports bike breake");
	}
}
class Mountains extends MoterBike{
	public void brake() {
		System.out.println("mountaines bike brake");
	}
}
public class Abstracrttion_Examp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mountains m1 = new Mountains();
		m1.brake();
		SportsBike s1 = new SportsBike();
		s1.brake();

	}

}
