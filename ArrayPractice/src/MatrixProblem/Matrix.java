package MatrixProblem;
import java.util.*;
import java.io.*;
public class Matrix {
    public static void rotateMatrix(int[][] arr){
           // step1 transpose the 2D array
         int m = arr.length;//number of rows
        int n = arr[0].length;//number of colum
        for (int i = 0; i < m; i++) {
            for (int j = i; j < n; j++) {
                //swaping
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        //swap left and right
        for (int i = 0; i < m; i++) {
            int li =0;
            int ri=n-1;
            while (li<ri){
                int temp = arr[i][li];
                arr[i][li] = arr[i][ri];
                arr[i][ri] = temp;
                li++;
                ri--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[][]={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        rotateMatrix(arr);
        for (var mat:arr) {
            System.out.println(Arrays.toString(mat));
        }
    }
}
