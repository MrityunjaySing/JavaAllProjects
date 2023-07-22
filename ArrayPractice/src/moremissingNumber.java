public class moremissingNumber {
    public static void main(String[] args) {
        int[] arr= {1,1,2,4,4,5,8,9,9,11};
        int[] data = new int[arr.length];
        for (int i : arr) {
            data[i]=1;
        }
        System.out.println("missing number of given array");
        for (int i = 1; i <data.length-1 ; i++) {
            if (data[i]==0){
                System.out.println(i);
            }
        }

    }
}
