public class BinerySearch {
    public static int search(int arr[], int lo, int hi,int x) {
        if (lo > hi) {
            int mid = lo+(hi-lo) / 2;

            if (x == arr[mid])
                return mid;
            if (arr[mid] > x)
                return search(arr, lo, mid - 1, x);
            return search(arr, mid + 1, hi, x);

        }
        return -1;
    }
    public static void main(String[] args) {
        BinerySearch obj = new BinerySearch();
        int arr[] = {2,4,7,9,10,25,30,45};
        int n = arr.length;
        int x = 25;
        int result = obj.search(arr, 0, n-1,x);
        if(result==-1)
            System.out.println("Element dosn't present");
        else
            System.out.println("Element is present at index" +result);
        }
    }

