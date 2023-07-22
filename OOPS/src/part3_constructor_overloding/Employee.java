package part3_constructor_overloding;
// constructor channing

/**
 * @author satyam
 *
 */
public class Employee {
	 String Emp_name;
	 int Emp_id;
	 double Emp_sal;
	
	public Employee() {
		System.out.println("all data emp ");
	}
	
   public Employee(String Emp_name) {
		this.Emp_name = Emp_name;
		
	}
//    this using constructor channing
   public Employee(String Emp_name,int Emp_id){
	   this(Emp_name);
	   this.Emp_id  = Emp_id;
	}
	public Employee(String Emp_name,int Emp_id,double Emp_sal) {
		this(Emp_name,Emp_id);
		this.Emp_sal = Emp_sal;
             
	}
	
}
