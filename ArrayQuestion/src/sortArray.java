public class sortArray {
    public static void main(String[] args) {
        int arr[]=new int[]{5,2,7,8,1};
        int temp =0;

        //display original array
        System.out.println("element of the original");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        // sort of assending order
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        // display element
        System.out.println("your element is assending order");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
