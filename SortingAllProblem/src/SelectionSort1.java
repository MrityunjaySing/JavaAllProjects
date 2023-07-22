import java.util.Scanner;

public class SelectionSort1 {
    static  void select(int[] arr) {
        int min;
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
           // int n1 = arr.length;
            System.out.println("Enter the array of the size");
            int size = sc.nextInt();
            int[] arr = new int[size];

            System.out.println("Enter the array of the element");
            for (int i = 0; i < arr.length; i++) {
                int n = sc.nextInt();
            }
            select(arr);
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i] + " ");
            }

        }
    }

