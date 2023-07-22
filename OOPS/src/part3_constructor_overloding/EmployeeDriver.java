package part3_constructor_overloding;

public class EmployeeDriver {

	public static void main(String[] args) {
		Employee Emp = new Employee();
		System.out.println("Emp_name is: "+Emp.Emp_name );
		System.out.println(" Emp_id is: " +Emp.Emp_id);
		System.out.println(" Emp_sal is: "+Emp.Emp_sal);

		System.out.println("=======================================");

		Employee e1 = new Employee("satyam");
		System.out.println("Emp_name is: "+e1.Emp_name );
		System.out.println(" Emp_id is: " +e1.Emp_id);
		System.out.println(" Emp_sal is: "+e1.Emp_sal);

		System.out.println("=======================================");

		Employee e2 = new Employee("satyam" ,10);
		System.out.println("Emp_name is: "+e2.Emp_name );
		System.out.println(" Emp_id is: " +e2.Emp_id);
		System.out.println(" Emp_sal is: "+e2.Emp_sal);

		System.out.println("=======================================");

		Employee e3 = new Employee("satyam",5,100000.0);
		System.out.println("Emp_name is: "+e3.Emp_name );
		System.out.println(" Emp_id is: " +e3.Emp_id);
		System.out.println(" Emp_sal is: "+e3.Emp_sal);
	}

}
