public class insertionSort2ndpart {
    static void insrtion(int arr[]){
        int n = arr.length;
        for (int i = 1; i <n ; i++) {
            int j=i;
            while(j>0&& arr[j]<arr[j-1]){
                int temp = arr[j];
                        arr[j] = arr[j-1];
                        arr[j-1] = temp;
                        j--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,3,6,9,12,2};
        insrtion(arr);
        for (int value:arr) {
            System.out.print(value+ " ");
        }
    }
}
