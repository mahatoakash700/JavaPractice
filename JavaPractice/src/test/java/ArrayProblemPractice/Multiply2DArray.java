package ArrayProblemPractice;

public class Multiply2DArray {

    public static void multiply2DArray(int[][] a, int[][] b) {
        int row1 = a.length;
        int col1 = a[0].length;

        int row2 = b.length;
        int col2 = b[0].length;

        if (col1 != row2) {
            System.out.println("col of first matrix should be same as row of second matrix");
            return;
        }

        System.out.println("Matrix 1");
        PrintArray.print2DArray(a);
        System.out.println("Matrix 2");
        PrintArray.print2DArray(b);

        int[][] newArr = new int[row1][col2];

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < row2; k++) {
                    newArr[i][j] += a[i][k] * b[k][j]; // ith row of 1st matrix and jth col of 2nd matrix
                }
            }
        }

        System.out.println("Multiplication of 2 matrix");
        PrintArray.print2DArray(newArr);

    }

    public static void main(String[] args) {
        int[][] a = { { 1, 2, 1 }, { 3, 1, 2 } };
        int[][] b = { { 2, 1 }, { 1, 3 }, { 1, 1 } };

        multiply2DArray(a, b);

    }

}
