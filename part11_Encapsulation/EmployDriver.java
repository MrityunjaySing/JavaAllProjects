package part11_Encapsulation;

public class EmployDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employ e1=new Employ("Mohan", 124, 546547.56);
		System.out.println("Name is: "+e1.getName());
		
		e1.setName("Shyam");
		System.out.println("Name is: "+e1.getName());
		
	}

}
