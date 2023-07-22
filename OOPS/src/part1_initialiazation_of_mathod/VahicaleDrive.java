package part1_initialiazation_of_mathod;

public class VahicaleDrive {

	public static void main(String[] args) {
		Vahicale v1 = new Vahicale();
		v1.setValue("Maruti", 600000, "red");
		Vahicale v2 = new Vahicale();
		v2.setValue("Thar", 2000000, "black");
		v1.dispaly();
		v2.dispaly();
	}

}
