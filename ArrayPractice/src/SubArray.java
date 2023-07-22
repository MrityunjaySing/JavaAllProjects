public class SubArray {
    void subArraySum(int arr[], int n,int sum) {
        // pick the for loop
        for (int i = 0; i < n; i++) {
            int currSum = arr[i];
            if (currSum == sum){
                System.out.println("Sum find out index" +i);
                return;
            }
            else{
                for (int j = i+1; j <n ; j++) {
                    currSum +=arr[j];
                    if(currSum == sum){
                        System.out.println("found the index:" +i+ " index " +j);
                        return;
                    }
                }
            }
        }
    }
//main
    public static void main(String[] args) {
        SubArray sub = new SubArray();
        int arr[]= new int[]{1,4,20,3,10,5};
        int n= arr.length;
        int sum = 33;
        sub.subArraySum(arr,n,sum);
    }
}
