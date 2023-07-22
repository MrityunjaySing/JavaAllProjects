import java.util.HashMap;

public class haseMapDemo2 {
    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        map1.put("satyam",101);
        map1.put("mrityunjay",102);
        map1.put("ram", 103);
        map1.put("shyam",1000);

        map2.put("krish",201);
        map2.put("gill",202);
        map2.put("kohali",10);
        map2.put("rohit",35);
        System.out.println(map1.size());
        System.out.println(map2.size());
        System.out.println(map1+" "+map2);
        if(map1.containsKey("mrityunjay")){
            Integer m = map1.get("mrityunjay");
            System.out.println("vlaue of key"+"\"mrityunjay\" is:"+m);
        }

    }
}
