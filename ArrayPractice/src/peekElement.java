import java.util.Arrays;

public class peekElement {
    public static void main(String[] args) {
        int arr[] = {5, 10, 20, 15};
        int size = arr.length;
        System.out.println("index of the peek point" +findpeek(arr,size));
    }
    static  int peek(int arr[],int lo, int hi,  int size){
        int mid = hi+(hi-lo)/2;
        if((mid == 0 || arr[mid-1]<=arr[mid]) && (mid == size-1||arr[mid+1]<=arr[mid]))
        return mid;

       else if(mid>0 && arr[mid-1]>arr[mid])
       return peek(arr, lo, (mid-1), size);

       else
           return peek(arr, (mid+1), hi, size);

    }
    static  int findpeek(int arr[], int size){
        return  peek(arr,0,size-1,size);
    }
}
