package part12_Abstraction;

public abstract class Car extends Vehicle1 {
	// here is using abstract keyword  and don't required mathod body
	public abstract void openGate();
	// using a concrate mathod  not declear keyword abstract
	public void playMusic()
	{
		System.out.println("Play the music in car");
	}
}
