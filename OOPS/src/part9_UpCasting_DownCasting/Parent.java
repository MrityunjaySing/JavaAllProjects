package part9_UpCasting_DownCasting;

public class Parent {
	void PrintData() {
		System.out.println("mathod of parent class");
	}

}
class Child extends Parent{
	void PrintData() {
		System.out.println("Mathod of child class");
	}
}