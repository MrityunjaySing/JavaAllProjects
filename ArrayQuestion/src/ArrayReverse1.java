public class ArrayReverse1 {
     static void reverse(int[] arr, int start, int end){
    int temp;
    if(start<end){
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
    }
    static void print(int[] arr,  int size){
        for (int i = 0; i < size; i++)
            System.out.print(arr[i]+ " ");
            System.out.println("");
    }
    public static void main(String[] args) {
      int[] arr = {1,2,3,4,5,6};
      print(arr,6);
     reverse(arr,0,5);
        System.out.println("reverse arry is");
     print(arr, 6);
    }
}
