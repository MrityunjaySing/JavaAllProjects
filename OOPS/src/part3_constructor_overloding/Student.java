package part3_constructor_overloding;

/**
 * @author satyam
 *
 */
public class Student {
	String stu_name;
	int stu_id;
	String stu_sub;
	double stu_fees;
	String stu_col;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(String stu_name ) {
		this.stu_name=stu_name;
		
	}
	public Student(String stu_name , int stu_id) {
		this(stu_name);
		this.stu_id=stu_id;
	}
	
	public Student(String stu_name , int stu_id, String stu_sub) {
		this(stu_name,stu_id);
		this.stu_sub=stu_sub;
		
		
	}
	public Student(String stu_name , int stu_id, String stu_sub, double stu_fees) {
		this( stu_name,stu_id,stu_sub);
		this.stu_fees=stu_fees;
		
	}
	public Student(String stu_name , int stu_id, String stu_sub, double stu_fees,String stu_col) {
		this(stu_name, stu_id,stu_sub,stu_fees);
		this.stu_col = stu_col;
	}

	/*
	 * public Student(String stu_name, int stu_id,String stu_sub,double
	 * stu_fees,String stu_col) { this.stu_name=stu_name; this.stu_id=stu_id;
	 * this.stu_sub=stu_sub; this.stu_col=stu_col; this.stu_fees=stu_fees; }
	 */
	public void getdisplay(){
		System.out.println("student name is: " +stu_name);
		System.out.println("student id is: " +stu_id);
		System.out.println("student sub is: " +stu_sub);
		System.out.println("student fees is: " +stu_fees);
		System.out.println("student collage name is: " +stu_col);
	}
}
