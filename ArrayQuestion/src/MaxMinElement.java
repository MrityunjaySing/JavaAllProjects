import java.util.Arrays;
import java.util.HashMap;

public class MaxMinElement {
    public static void main(String[] args) {
        int temp,size;
        int arr[]= {10,20,25,63,96,57};
        size = arr.length;
        Arrays.sort(arr);
        System.out.println("sorted array"+ Arrays.toString(arr));
        int max = arr[size-3];
        System.out.println("largest value is :"+max);
      //  HashMap<Integer,String> m  = new HashMap<Integer , String>();
        
    }
}
