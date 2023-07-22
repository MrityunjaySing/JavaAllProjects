public class TrappingRainWater {
    static long rainWater(int arr[], int n){
        int left[] = new int[n];
        int right[] = new int[n];
        left[0] = arr[0];
        for (int i = 1; i <n;  i++)
            left[i]= Math.max(arr[i-1], arr[i]);
        right[n-1] = arr[n-1];
        for (int i = n-2; i>=0 ; i--)
            right[i] = Math.max(right[i+1],arr[i]);
          long ans=0;
        for (int i = 0; i < n; i++) {
            ans+=(Math.min(left[i], right[i])-arr[i]);
        }
                    return ans;
    }
    public static void main(String[] args) {
        TrappingRainWater res = new TrappingRainWater();
        int arr[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int n = arr.length;
        System.out.println(rainWater(arr,n));
    }
}
