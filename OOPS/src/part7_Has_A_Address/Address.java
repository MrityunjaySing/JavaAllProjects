package part7_Has_A_Address;

public class Address {
   String city;
   String state;
   int pin;
   Address(){
}
   Address(String city, String state, int pin){
	   this.city=city;
	   this.state=state;
	   this.pin=pin;
   }
   public void displayAddress() {
	   System.out.println("city is:"+city);
	   System.out.println("state is:"+state);
	   System.out.println("pin is:"+pin);
   }
}
