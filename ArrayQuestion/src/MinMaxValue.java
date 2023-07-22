import java.util.Scanner;

public class MinMaxValue {
    public static void main(String[] args) {
     Scanner inp = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int num = inp.nextInt();
        int i , sum=0;
        int arr[] = new int[num];// create n size of the array
        for ( i = 0; i < num; i++) {
            System.out.println(" Enter: ");
            arr[i] = inp.nextInt();
        }
        int max = arr[0], min = arr[0]; // initalizing

        for ( i = 0; i <num ; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(" mximum number is : " +max);
        System.out.println(" Minimum number is: " +min);
    }
}
