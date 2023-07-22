import java.util.Scanner;

public class fectorial {
    static int fact(int n) {
        //base case
        if (n == 0) return 1;
        //smaller problem
        return n * fact(n - 1);
        // Big problem - self work
    }

    public static void main(String[] args) {
        System.out.println(fact(5));

    }
}