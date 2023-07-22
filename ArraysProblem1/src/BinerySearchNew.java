public class BinerySearchNew {
    int search(int arr[], int x){
        int start = 0;
        int end = arr.length-1;
        while(start<=end) {
            int mid = start + (end - start) / 2;
            if (x == arr[mid]) {
                return mid;
            } else if (x < arr[mid]) {
                   end = mid-1;
            }else {
                start = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
            BinerySearchNew obj = new BinerySearchNew();
        int arr[] = {10,20,25,35,40,50};
        int n = arr.length;
        int x=35;
        int result = obj.search(arr, x);
        if(result ==-1){
            System.out.println("Element is" +x+" not present at indx");
        }else{
            System.out.println("Element is " +x+" present at index " +result);
        }

    }
}
