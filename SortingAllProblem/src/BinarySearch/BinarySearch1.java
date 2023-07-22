package BinarySearch;
import java.util.*;
import java.io.*;
//import java.util.Scanner;

public class BinarySearch1 {
    public static int binarySearch(int[]arr, int target){
        int lo=0, hi= arr.length-1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid]< target){
                lo = mid+1;
            }
            else {
                hi = mid-1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // size of an elem by user
        System.out.println("Enter the numb of element present in array");
        int n = sc.nextInt();
        //array ele by user
        System.out.println("Enter the array element");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target ele");
        int x = sc.nextInt();

        // implementation of linear search
        int result = binarySearch( arr, x);

        if (result == -1) {
            System.out.println("Search element does not found");
        } else {
            System.out.println("Search element is found: " +result);
        }
    }
}