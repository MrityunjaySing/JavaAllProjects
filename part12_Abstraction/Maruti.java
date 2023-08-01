package part12_Abstraction;


public  class Maruti extends Car {
	// using a concrate mathod open method body  not declear keyword abstract
	public void start()
	{
		System.out.println("Start the Maruti");
	}
	public void drive()
	{
		System.out.println("drive the Maruti");
	}
	public void openGate()
	{
		System.out.println("Open the gate of Maruti");
	}
}
