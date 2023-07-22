import java.util.HashSet;

public class HashSetDemo1 {
    public static void main(String[] args) {
        HashSet h  = new HashSet();
        h.add("B");
        h.add("D");
        h.add("Z");
        h.add(null);
        h.add(10);
        System.out.println(h.add("Z"));//false Duplicate element are not allowed
        System.out.println(h);
    }
}
