package abstraction;

public class Driver {
	public static void main(String[] args) {
		Vehicle v1=new Maruti();
		v1.start();
		
		Car c1=new Maruti();
		c1.openGate();
	}

}
