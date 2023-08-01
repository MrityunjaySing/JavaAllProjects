package part12_Abstraction;

abstract class Animal {
	  abstract void makeSound();

	  public void eat() {
	    System.out.println("I can eat.");
	  }
	}

	class Dog extends Animal {

	  // provide implementation of abstract method
	  public void makeSound() {
	    System.out.println("Bark bark");
	  }
	}
public class Abstract_MethodUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Dog d1 = new Dog();
       d1.eat();
       d1.makeSound();
	}

}
