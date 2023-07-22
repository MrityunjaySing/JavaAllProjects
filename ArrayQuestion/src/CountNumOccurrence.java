public class CountNumOccurrence {
    static int Occurence(int arr[], int n,int key){
        int cout =0;
        for (int i = 0; i < n; i++) {
            if(key == arr[i]){
                cout++;
                //return cout;
            }
        }
        return cout;
    }
    public static void main(String[] args) {
        //CountNumOccurrence obj = new CountNumOccurrence();
        int arr[] = {1,1,2,2,2,2,3,3,4};
        int n = arr.length;
        int key = 3;
       int res= Occurence(arr, n, key);
            System.out.println(res+ " ");

    }
}
