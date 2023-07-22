public class move_All_negative_No {
    static void moveNgetive(int arr[],  int l, int r) {
        while (arr[l] <= arr[r]) {
            if (arr[l] < 0 && arr[r] < 0) {
                l++;
            } else if (arr[l] > 0 && arr[r] < 0) {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            } else if (arr[l] > 0 && arr[r] > 0) {
                r--;
            } else {
                l++;
                r--;
            }

        }
    }// display the value
        static void display ( int arr[], int r){
            for (int i = 0; i <=r; ++i) {
                System.out.print(arr[i]+ " ");
            }
            System.out.println();
        }


    public static void main(String[] args) {
        int arr[]={-12, 11, -13, -5,
                6, -7, 5, -3, 11 };
        int size = arr.length;
        moveNgetive(arr, 0, size-1);
        display(arr, size-1);
    }
}
