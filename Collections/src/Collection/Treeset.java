package Collection;

import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(100);
        ts.add(50);
        ts.add(90);
        ts.add(150);
        ts.add(70);
        ts.add(85);
        System.out.println(ts);

        ts.add(150);//duplicate vlue not allowed
        System.out.println(ts);

        System.out.println(ts.higher(50));
        System.out.println(ts.lower(150));
        System.out.println(ts.ceiling(70));
        System.out.println(ts.floor(70));
    }
}
