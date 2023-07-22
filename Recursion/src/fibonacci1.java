import java.util.*;
import java.io.*;

public class fibonacci1 {
    public static int fibonacci1(int n){
        int result =0;
        if (n==0 || n==1){
            return n;
        }else{
            return fibonacci1(n-1)+fibonacci1(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int result = fibonacci1(n);
        System.out.println("your factorial number is: "+result);
    }
}
