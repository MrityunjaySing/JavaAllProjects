package InsertionSort;
import java.util.*;

public class InsertionSort {
    public static void insertionSort(int arr[]){
        for (int i = 1; i <arr.length ; i++) {
            int j=i;
            while(j>0 && arr[j]>arr[j-1] ){  // < Assending and  >desending order
              //Swapping
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]= {20,50,12,19,11,10};
        insertionSort(arr);
        System.out.println("Sorted array is:");
        System.out.println(Arrays.toString(arr));
    }
}
