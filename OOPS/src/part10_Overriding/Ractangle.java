package part10_Overriding;

public class Ractangle extends Shape{
        double l;
        double w;
       public Ractangle() {
		// TODO Auto-generated constructor stub
	}
       Ractangle(double l, double w){
    	   this.l=l;
    	   this.w=w;
       }
       @Override
       public void findArea() {
    	   System.out.println("Length is "+l);
    	   System.out.println("Width is "+w);
    	   System.out.println("find the area of ractangle:" +l*w);
       }
       @Override
       public void findParameter() {
    	   System.out.println("find the parameter of the ractangle:"+2*(l+w));
       }
}
