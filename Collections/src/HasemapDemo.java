import java.util.HashMap;

public class HasemapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> m = new HashMap();
        m.put("satyam",101);
        m.put("mrityunjay",102);
        m.put("ram", 103);
        m.put("shyam",1000);
        System.out.println(m.size());
        System.out.println(m);
        if(m.containsKey("ram")) {
            Integer a = m.get("ram");
            System.out.println(a);
        }
    }
}
