package SelectionSort;
import java.util.*;
import java.util.Arrays;

public class selectionSort {
    public static void selection(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            int min_indx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_indx]) {
                    min_indx = j;
                }
            }
            if (arr[min_indx] != arr[i]) {
                int temp = arr[min_indx];
                arr[min_indx] = arr[i];
                arr[i] = temp;
            }
        }
    }
        public static void main (String[]args){
            int arr[] = {20, 50, 10, 12, 17, 15, 25};
            selection(arr);
            System.out.println(Arrays.toString(arr));
        }
    }

