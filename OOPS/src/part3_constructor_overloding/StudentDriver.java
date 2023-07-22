package part3_constructor_overloding;

public class StudentDriver {

	public static void main(String[] args) {
		Student s1 = new Student("Mrityunjay");
		s1.getdisplay();
		System.out.println("========================================");

		Student s2 = new Student("Mrityunjay",35);
		s2.getdisplay();

		System.out.println("========================================");

		Student s3 = new Student("Mrityunjay",35,"Math");
		s3.getdisplay();

		System.out.println("========================================");

		Student s4 = new Student("Mrityunjay",35,"Math",100000.0);
		s4.getdisplay();

		System.out.println("========================================");

		Student s5 = new Student("Mrityunjay",35,"Math",100000.0,"IIMT");
		s5.getdisplay();
	}

}
