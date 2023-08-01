package part11_Encapsulation;

import java.util.Scanner;
public class Employ {
	private int pwd=997140;
	private String name;
	private int empid;
	private double salary;
	Employ()
	{
		
	}
	Employ(String name, int empid, double salary)
	{
		this.name=name;
		this.empid=empid;
		this.salary=salary;
	}
	public String getName()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the password to get name:");
		int x=sc.nextInt();
		if(pwd==x)
		{
			System.out.println("Validation is successfull");
			return name;
		}
		else
		{
			System.out.println("Validation is not  successfull");
			return null;	
		}
	}
	public int getEMpId()
	{
		//validate
		return empid;
	}
	public double getSalary()
	{
		//validate
		return salary;
	}
	public void setName(String name)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the password to set the name:");
		int x=sc.nextInt();
		if(pwd==x)
		{
			System.out.println("Validation is successfull and name is set");
			this.name=name;
		}
		else
		{
			System.out.println("Validation is not  successfull and name is not set");	
		}
	}
	public void setEmpId(int empid)
	{
		//validation
		this.empid=empid;
	}
	public void setSalary(double salary)
	{
		//validation
		this.salary=salary;
	}

}
