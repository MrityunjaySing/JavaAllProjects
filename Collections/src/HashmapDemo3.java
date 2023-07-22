import java.util.HashMap;

//Constructor 2: HashMap(int initialCapacity)
//HashMap<K, V> hm = new HashMap<K, V>(int initialCapacity);'
// HashMap(int initialCapacity,float loadFactor) Constructor
//HashMap<K, V> hm = new HashMap<K, V>(Map map);


public class HashmapDemo3 {
    public static void main(String[] args) {
        HashMap<Integer, String> hm4 = new HashMap<>();
        hm4.put(10, "ten");
        hm4.put(11, "eleven");
        hm4.put(12, "twelve");
        hm4.put(13, "thirteen");
        hm4.put(14, "forteen");
        HashMap<Integer, String> hm1 = new HashMap<>(10);

        // Initialization of a HashMap using Generics
        HashMap<Integer, String> hm2
                = new HashMap<Integer, String>(2);

        HashMap<Integer, String> hm3
                = new HashMap<>(5, 0.75f);

        HashMap<Integer, String> hm= new HashMap<Integer, String>(hm4);

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        // Adding elements to object of HashMap
        // using put method

        // HashMap 1
        hm1.put(1, "one");
        hm1.put(2, "two");
        hm1.put(3, "three");

        // HashMap 2
        hm2.put(4, "four");
        hm2.put(5, "five");
        hm2.put(6, "six");

        hm3.put(7, "four");
        hm3.put(8, "five");
        hm3.put(9, "six");




        // Printing elements of HashMap 1
        System.out.println("Mappings of HashMap hm1 are : "
                + hm1);

        // Printing elements of HashMap 2
        System.out.println("Mapping of HashMap hm2 are : "
                + hm2);

        System.out.println("Mapping of HashMap hm3 are : "
                + hm3);
        System.out.println("Mapping of HashMap hm4 are : "
                + hm4);
    }
}
