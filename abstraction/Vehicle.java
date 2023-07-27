package abstraction;

public abstract class Vehicle {
	
	public abstract void start();
	public abstract void drive();
	
	public void accelerate()
	{
		System.out.println("Accelerate the vehicle");
	}
	
	public void stop()
	{
		System.out.println("Stop the Vehicle");
	}
	

}
