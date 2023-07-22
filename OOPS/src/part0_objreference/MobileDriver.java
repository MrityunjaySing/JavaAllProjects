package part0_objreference;

class Mobile{
    String name;
    int price;

   /* @Override
    public String toString() {
        return "Name: " + name + ", Price: " + price;
    }*/

}
public class MobileDriver {
	 public static void main(String[] args) {
	        Mobile m1 = new Mobile();
	        m1.name = "sumsung";
	        m1.price = 24000;
	       System.out.println(m1.name);
	        System.out.println(m1.price);

	    }

}
