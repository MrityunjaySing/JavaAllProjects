package Collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkList {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(200);
        ll.add(300);
        ll.add(400);
        System.out.println(ll);

        LinkedList ll2  = new LinkedList();
        ll2.add("satyam");
        ll2.add("shivam");
        ll2.add(200);
        ll2.addFirst(500);
        ll2.addLast(600);

        System.out.println(ll2);
        System.out.println(ll2.peek());
        System.out.println(ll2);

        //System.out.println("**********s_ome methods are using********");
        System.out.println(ll2.get(2));
        System.out.println(ll2.indexOf(500));
        System.out.println(ll2.lastIndexOf(600));
        System.out.println(ll2.getFirst());
        System.out.println(ll2.getLast());
        ll2.push(1000);



    }
}
