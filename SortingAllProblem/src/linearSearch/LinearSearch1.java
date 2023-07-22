package linearSearch;
import java.util.*;
import java.io.*;      //Time complexity O(n) ans Space O(1)
public class LinearSearch1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
     // size of an elem by user
        System.out.println("Enter the numb of element present in array");
        int n =  sc.nextInt();
     //array ele by user
        System.out.println("Enter the array element");
        int[]arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the target ele");
        int x  = sc.nextInt();

        // implementation of linear search
        int indx =-1;
        for (int i = 0; i < n; i++) {
            if (arr[i]==x){
                indx =i;
                break;
            }
        }
        if (indx == -1){
            System.out.println("Search element does not found");
        }
        else {
            System.out.println("Search element is found: "+indx);
        }
    }
}
