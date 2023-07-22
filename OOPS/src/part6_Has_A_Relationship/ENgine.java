package part6_Has_A_Relationship;

/**
 * @author satyam
 *
 */
public class ENgine {
	int hp;
	int strokes;
	String type;
	ENgine() {
	}
	ENgine(int hp, int strokes, String type) {
	this.hp = hp;
	this.strokes = strokes;
	this.type = type;
	}
	void statusEngine() {
	System.out.println("[+]Pre-checks and Engine is Passed");
	}
	void displayENgine() {
	System.out.println("Engine HP: " +hp);
	System.out.println("Engine Strokes: " +strokes);
	System.out.println("Engine Type: " +type);
	statusEngine();
	System.out.println("=============================================");
	}

}
