package ArrayProblemPractice;

public class Add2DArray {

    public static void print2DArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void add2DArray(int[][] a, int[][] b) {
        int row1 = a.length;
        int col1 = a[0].length;

        int row2 = b.length;
        int col2 = b[0].length;

        if (row1 != row2 || col1 != col2) {
            System.out.println("Please provide same rows and columns for 2 arrays");
            return;
        }

        int[][] sum = new int[row1][col1];

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        print2DArray(sum);
    }

    public static void main(String[] args) {
        int[][] a = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
        int[][] b = { { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        add2DArray(a, b);
    }

}
