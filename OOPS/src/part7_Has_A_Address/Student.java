package part7_Has_A_Address;

public class Student {
String name;
int roll_No;
Address ad = new Address();
Student(){
	
}

Student(String name, int roll_No, Address ad){
	this.name = name;
	this.roll_No=roll_No;
	this.ad = ad;
}
public void displayStudent() {
	System.out.println("student name:"+name);
	System.out.println("student roll_no is:"+roll_No);
	System.out.println("students address is:"+ad);
	
}
}
