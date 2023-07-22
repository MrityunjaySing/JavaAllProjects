/*
 * package Game_Project;
 * 
 * import java.util.HashMap; import java.util.Scanner;
 * 
 * class HandleFourhundred extends ButtonHandler { public Weapon handle() {
 * System.out.println("you get the knife"); Knife k = new Knife(); return k; }
 * 
 * }
 * 
 * class HandleEight extends ButtonHandler{ Scanner sc = new Scanner(System.in);
 * public Weapon handle() {
 * System.out.println("Press 1 get Knife and 2 get Gun"); int x = sc.nextInt();
 * return this.execute(x);
 * 
 * } private Weapon execute(int value) { switch(value) { case 1:
 * System.out.println("you get the knife"); Knife k = new Knife(); return k;
 * case 2: System.out.println("you get the gun"); Gun g = new Gun(); return g;
 * default: System.out.println("Invalide choice, please enter valid value"); //
 * int y = sc.nextInt(); // return this.execute(value); return this.handle(); }
 * } }
 * 
 * class HandleDefault extends ButtonHandler{ Scanner sc = new
 * Scanner(System.in); public Weapon handle() { System.out.
 * println("Press 1 get Knife and 2 get Gun and any other no to get Bomb"); int
 * x = sc.nextInt(); return this.execute(x);
 * 
 * } private Weapon execute(int value) { switch(value) { case 1:
 * System.out.println("you get the knife"); Knife k = new Knife(); return k;
 * case 2: System.out.println("You get the Gun"); Gun g = new Gun(); return g;
 * default: System.out.println("you get the Bomb"); Bomb b = new Bomb(); return
 * b;
 * 
 * } } }
 * 
 * public class Game { // here is using press button all handles Weapon public
 * Weapon pressButton(){ HashMap<Integer, ButtonHandler> handlers = new
 * HashMap(); // handlers.put(400, new HandleFourhundred()); Scanner sc = new
 * Scanner(System.in); System.out.println("Game 2.0:Enter the score:"); int
 * score = sc.nextInt(); if(score<=400) { return new
 * HandleFourhundred().handle(); } else if(score<=800) { return new
 * HandleEight().handle(); } else { return new HandleDefault().handle(); }
 * 
 * }
 * 
 * }
 */