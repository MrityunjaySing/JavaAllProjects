package Assignment_java;


public class EmployeeDriver {

	public static void main(String[] args) {
		Employee e1  = new Employee("kislay", 786, 20000.0);
		
		e1.dispaly();
		int leaveTaken = 2;
		 double leaveDetactionAmount = 500.0;
		double salaryAfterDetect = e1.getsalarys(leaveTaken, leaveDetactionAmount);
		System.out.println("Salary after leave deduction: " + salaryAfterDetect);
		

	}

}
