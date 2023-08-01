package part12_Abstraction;

import java.util.Vector;

public class Driver {

	public static void main(String[] args) {
		Vehicle1 v1=new Maruti();
		v1.start();

		Car c1=new Maruti();
		c1.openGate();
		c1.start();
		c1.playMusic();
		
//		this line do not requir 
//		 Car c2 = new Maruti();	 
//		 Car c3 = new Maruti();
		
		 Vehicle1 v2 = new Maruti();
		 v2.accelerate();
		 v2.stop();
		}
	}
	


