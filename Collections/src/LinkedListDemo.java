import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add("satyam");
        l.add(20);
        l.add(null);
        l.set(0,"Software");
        l.add(0,"Mrityunjay");
        l.removeLast();
        l.addFirst("Lord Krishna");
        System.out.println(l);
    }
}
