package part7_Has_A_Address;
 class Driver {
public static void main(String[] args) {
	Address a1 = new Address("noida","u.p", 201301);
	Student s1 = new Student("mohan", 203, a1);
	
	a1.displayAddress();
	s1.displayStudent();
}

}
