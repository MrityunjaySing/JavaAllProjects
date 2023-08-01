package part12_Abstraction;

abstract class Language {

	  // method of abstract class
	  public void display() {
	    System.out.println("This is Java Programming");
	  }
	}


public class Abstract_classUse extends Language {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Abstract_classUse a1 = new Abstract_classUse();
a1.display();
	}

}
