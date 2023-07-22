package part10_Overriding;

public class Circle extends Shape{
	double r;
	Circle(){
		
	}
	Circle(double r){
		this.r =r;
	}
	@Override
	public void findArea() {
		System.out.println("Radius of circle is :"+r);
		System.out.println("Area of circle is:"+3.14*r*r);
	}
	@Override
	public void findParameter() {
		System.out.println("Parameter of circle is:" +2*3.14*r);
	}

}
