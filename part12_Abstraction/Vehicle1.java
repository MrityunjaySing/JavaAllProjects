package part12_Abstraction;

public abstract class Vehicle1 {
	public abstract void start();
	public abstract void drive();

	// using a concrate mathod  not declear keyword abstract
	public void accelerate()
	{
		System.out.println("Accelerate the vehicle");
	}

	public void stop()
	{
		System.out.println("Stop the Vehicle");
	}
}
