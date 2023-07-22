package part4_CopyConstructor;
class Fruit{
	String name;
	int price;
	double weight;
	Fruit(){
		
	}
	Fruit(String name, int price, double weight){
		this.name=name;
		this.price=price;
		this.weight=weight;
	}
	// this is using copy constructor
	Fruit(Fruit p){
		this.name=p.name;
		this.price=p.price;
		this.weight=p.weight;
	}
	void getdisplay() {
		System.out.println("fruit name is:" +name);
		System.out.println("fruit price is:" +price);
		System.out.println("fruit weight is:" +weight);
	}
}
public class FruitDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Fruit f1 = new Fruit("mango", 200, 5.6);
       Fruit f2 = new Fruit(f1);
       Fruit f3 = new Fruit("Apple", 500, 7.5);
       Fruit f4 = new Fruit(f3);
       f2.getdisplay();
       System.out.println("=========================================");
       f4.getdisplay();
       
	}

}
