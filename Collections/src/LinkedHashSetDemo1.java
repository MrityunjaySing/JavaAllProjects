import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo1 {
    public static void main(String[] args) {
        LinkedHashSet h  = new LinkedHashSet();
        h.add("B");
        h.add("D");
        h.add("Z");
        h.add(null);
        h.add(10);
        System.out.println(h.add("Z"));//false Duplicate element are not allowed
        System.out.println(h);
    }
}
