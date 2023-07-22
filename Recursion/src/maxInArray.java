public class maxInArray {
    static void revrse(int arr[] , int start, int end){
        int temp;
        while(start<end){

            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void arrPrint(int arr[],int size){
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        arrPrint(arr, 6);
        revrse(arr, 0,5);
        System.out.println("Reverse array is");
        arrPrint(arr, 6);
    }
}
