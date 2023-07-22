public class recursionUsingArray {
    static void arrPrint(int[] arr, int idx ){
        if (idx == arr.length) {
            return;
        }
        System.out.println(arr[idx]);
        arrPrint(arr, idx+1);

    }
    public static void main(String[] args) {
    int arr[] = {5,6,7,8,9};
    arrPrint(arr,0);
    }
}
