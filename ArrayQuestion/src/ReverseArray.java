import java.util.Scanner;

public class ReverseArray {
    static void reverse(int[] arr) {
        System.out.println("reverse array is");
      //  for (int i = arr.length; i > 0; i--) {
            //System.out.println(arr[i] + " ");
        }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        /*by a user input and size also*/
        System.out.println("Enter the array of size");
        int size = obj.nextInt();
        int[] arr = new int[size];//{62,55,99,23,51,12,36};
        System.out.println("Enter the array element");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = obj.nextInt();
        }
        reverse(arr);
        for (int i = arr.length-1; i>=0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}