import java.util.Stack;

public class StackDemo1 {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push("Satyam");
        s.push("Ram");
        s.push("Shyam");
        System.out.println(s.capacity());
        System.out.println(s);
        System.out.println(s.search("Shyam"));
        System.out.println(s.search("Krishna"));
    }
}
