import java.util.*;
import java.io.*;

public class factorial1 {
    public static int factorial1(int n) {
        int result =0;
        if (n == 0 || n == 1) {
            return 1;
        } else {
             result = n*factorial1(n-1);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
         int result = factorial1(n);
        System.out.println("your factorial number is: "+result);
    }
}
