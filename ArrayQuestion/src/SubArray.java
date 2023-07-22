public class SubArray {
    public void subArray(int arr[], int n, int sum){

        for (int i = 0; i <n ; i++) {
            int currentElement = arr[i];
            if(currentElement == sum){
                return;
            }else {
                for (int j = i+1; j <n ; j++) {
                    currentElement +=arr[j];
                    if(currentElement == sum){
                        System.out.println(+i+ "  subArray between the index "+j);
                        return;
                    }
                }
            }

        }
        System.out.println("No subArray");
        return;
    }
    public static void main(String[] args) {
        SubArray obj = new SubArray();
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        int sum = 9;
        obj.subArray(arr, n, sum);
    }
}
