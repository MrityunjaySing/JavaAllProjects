public class AnonymsArray {
    public static void main(String[] args) {
        AnonymsArray.sum(new int[][]{{10,30,40,90},{10,30,40,90}});
        }
    static void sum(int[][] no){
        int total =0;
        for (int ii[]:no
             ) {
            for (int i:ii
                 ) {
                total = total+i;
            }

        }
        System.out.println("sum is"+total);
    }
}
