package Assignment_java;

public class Employee {

	 String name;
	 int  Emp_id; 
     double salary;
     
	public Employee(String name, int Emp_id, double salary) {
		this.name = name;
		this.Emp_id = Emp_id;
		this.salary = salary;
	}
	public void dispaly() {
		System.out.println("Employee name is: "+name);
		System.out.println("Employee Emp_id is: "+Emp_id);
		System.out.println("Employee salary is: "+salary);
	}
public  double getsalarys(int leaveTaken, double leaveDetactionAmount) {
		double salaryAfterDetect = salary - ( leaveTaken * leaveDetactionAmount);
        return salaryAfterDetect;
	}
}
