package MatrixProblem;

public class transposematrix {
    public static void main(String[] args) {
        int row = 2, col=3;
        int[][] mat = {
            {1,2,3},
                {4,5,6}
        };
        //display current matrix
        display(mat);
        int[][] transpose = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i]=mat[i][j];
            }
        }
        //display transpose matrix
        display(transpose);
    }
    public static void display(int[][] mat){
        System.out.println("The matix is: ");
        for (int[] row: mat){
            for (int col:row){
                System.out.println(col+" ");
            }
            System.out.println();
        }
    }
}
