package BacktrackingPart1st;

import java.util.*;
public class printAlsequence {
    public static  void printSequence(int[]arr, int indx, ArrayList<Integer> tempArr){
        // base case
        if(indx == arr.length){
            // print subsequence --- but do not print entries
            if(tempArr.size()>0){
                System.out.println(tempArr);
            }
            return;
        }
        //recursive call

        // include
        printSequence(arr, indx+1, tempArr);

        // add the value in temArray
        tempArr.add(arr[indx]);

        // do not include
        printSequence(arr, indx+1, tempArr);

        // remove last value
        tempArr.remove(tempArr.size()-1);

    }

    public static void main(String[] args) {
        int arr[] = {1,2};
        System.out.println("for the array " +Arrays.toString(arr));
        printSequence(arr,0, new ArrayList<>());
        System.out.println();

        int arr2[] = {1,2,3};
        System.out.println("for the array " +Arrays.toString(arr2));
        printSequence(arr2,0, new ArrayList<>());
    }
}
