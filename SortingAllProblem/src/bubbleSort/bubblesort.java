package bubbleSort;

public class bubblesort {
    void sorting(int arr[]){
        int n= arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    //swapping
                    int temp =arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    //print array
    void printArray(int arr[]){
        int n= arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+ " ");
          //  System.out.println();
        }
    }
    public static void main(String[] args) {
        bubblesort ob = new bubblesort();
     int arr[]= {5,1,4,2,8};
     ob.sorting(arr);
        System.out.println("print sorting array");
        ob.printArray(arr);
        
    }
}
