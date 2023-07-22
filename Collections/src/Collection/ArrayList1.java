package Collection;
import java.util.*;
//import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList all = new ArrayList();
        all.add(100);
        all.add(200);
        all.add(300);
        System.out.println(all);
        ArrayList al1 = new ArrayList();
        al1.add("m");
        al1.add(10);
        al1.add(1,1);
        System.out.println(al1);
        ArrayList al2 = new ArrayList();
        al2.add(400);
        al2.add(500);
        al2.add(600);
        al2.add(2, 450);
        System.out.println(al2);
        int index = al2.indexOf(500);
        System.out.println(index);
        System.out.println(al2.contains(450));
        al2.ensureCapacity((10));
        all.trimToSize();

        System.out.println(al2.size());
        List<Integer> list2 = Arrays.asList(2,4,5,8,9);
        System.out.println(list2);
        list2.forEach(i-> System.out.println(i));

    }
}
