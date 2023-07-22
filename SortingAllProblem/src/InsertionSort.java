public class InsertionSort {
   static void Insort(int arr[], int n){

       for (int i = 1; i <n ; i++) {
           int temp = arr[i];
           int j = i - 1;
           while(j>=0&&arr[j]>temp){
               arr[j+1] = arr[j];
               j= j-1;
           }
           arr[j+1] = temp;
       }
   }
    public static void main(String[] args) {
       int arr[] = {12,11,13,5,6};
       int n = arr.length;
       Insort(arr, n);
        for (int i:arr) {
            System.out.print(i+ " ");
        }
    }
}
