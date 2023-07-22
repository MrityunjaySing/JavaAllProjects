package part4_CopyConstructor;
/**
 * @author satyam
 *
 */
class Laptop{
	String name;
	int price;
	double weight;
	int ram;
	String color;
     Laptop() {
	}
     Laptop(String name, int price, double weight, int ram, String color){
    	 this.name=name;
    	 this.price=price;
    	 this.weight=weight;
    	 this.ram=ram;
    	 this.color=color;
     }
//     here is using copy constructor Laptop object reference in driver class
     Laptop(Laptop l){
    	 this.name=l.name;
    	 this.price=l.price;
    	 this.weight=l.weight;
    	 this.ram=l.ram;
    	 this.color=l.color;
     }
     void getdisplay() {
    	 System.out.println("laptop name is:"+name);
    	 System.out.println("laptop price is:"+price);
    	 System.out.println("laptop weight is:"+weight);
    	 System.out.println("laptop ram is:" +ram);
    	 System.out.println("laptop color is:" +color);
     }
}

public class LaptopDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Laptop L1 =new Laptop("Dell",55000,2.5, 8, "Black");
          Laptop L2 = new Laptop(L1);
          L2.getdisplay();
          System.out.println("=========================================");
          Laptop L3 =new Laptop("HP",40000, 2.8, 12, "White");
          Laptop L4 = new Laptop(L3);
          L4.getdisplay();
	}

}
