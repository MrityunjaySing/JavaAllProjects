public class moveNegitve {
    //swap value
    static  void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] =temp;
    }
    // move -ve
    static void move(int arr[]){
        int lo =0;
        int hi = arr.length-1;
        while(lo<=hi){
            if (arr[lo]<=0){
                lo++;
            }
            else
                swap(arr, lo,hi--);
        }
    }

    public static void main(String[] args) {
        int[] ar = { 1, 2,  -4, -5, 2, -7, 3,
                2, -6, -8, -9, 3, 2,  1 };
        move(ar);
        for (int e:ar)
            System.out.print(e+ " ");
    }


}
