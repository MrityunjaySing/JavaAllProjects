public class missingNumber {
    public static void main(String[] args) {
        int arr[]={1,2,3,6,7,5};
        int n= arr.length;
        int sum_natural_number =((n+1)*(n+2))/2;
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
        }
        int missing_element = 0;
        missing_element = sum_natural_number - sum;
        System.out.println("missing element is :" + missing_element);
    }
}
