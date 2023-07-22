package part4_CopyConstructor;
class EKart{
	String name;
	String brand;
	String size;
	int price;
	double weight;
	 EKart() {
		// TODO Auto-generated constructor stub
	}
	 EKart(String name, String brand, String size, int price, double weight){
		 this.name=name;
		 this.brand=brand;
		 this.size=size;
		 this.price=price;
		 this.weight=weight;
	 }
// here is using copy constructor reference with EKart Object
	 EKart(EKart c){
		 this.name=c.name;
		 this.brand=c.brand;
		 this.size=c.size;
		 this.price=c.price;
		 this.weight=c.weight;
	 }
	 void getDisplay() {
		 System.out.println("Echart product name is:" +name);
		 System.out.println("Echart product brand name is:" +brand);
		 System.out.println("Echart product size name is:" +size);
		 System.out.println("Echart product price name is:" +price);
		 System.out.println("Echart product weight  is:" +weight);
	 }
}
public class EchartDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EKart c1 = new EKart("FullsleevsNeak","Danim","M",2000, 0.500 );
		EKart c2 = new EKart(c1);
		c2.getDisplay();
		System.out.println("============================================");
		EKart c3 = new EKart("Half Shirt","Luvi's","XL",1000, 0.250 );
		EKart c4 = new EKart(c3);
		c4.getDisplay();

	}

}
