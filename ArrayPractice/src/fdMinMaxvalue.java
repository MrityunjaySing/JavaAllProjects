public class fdMinMaxvalue {
    public static void main(String[] args) {
        int arr[] = {3,5,4,1,9};
        findmindmax(arr);
    }
    static void findmindmax(int arr[]){
        if(arr == null || arr.length==0) return;
        {
            int min = arr[0];
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                min = Math.min(min, arr[i]);
                max = Math.max(max, arr[i]);
//                if(arr[i]<min) {
//                    min = arr[i];
//                }
//                if (arr[i]>max) {
//                    max = arr[i];
//                }
            }
            System.out.println(max+" maximum element");
            System.out.println(min+" minimum element");
        }
    }
}
