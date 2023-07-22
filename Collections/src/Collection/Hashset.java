package Collection;

import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {
        HashSet hs = new HashSet<>();
        hs.add(100);
        hs.add(50);
        hs.add(90);
        hs.add(150);
        hs.add(70);
        hs.add(85);
        System.out.println(hs);
        System.out.println(hs.contains(90));
    }
}
