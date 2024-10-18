package ArrayProblemPractice;

//swapping rows to columns in a matrix. rows and col must be same
public class TransposeMatrix {

    public static void printTransposeMatrix(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;

        if (row != col) {
            System.out.println("Row and col should be same");
            return;
        }
        System.out.println("Before matrix transpose");
        PrintArray.print2DArray(arr);
        for (int i = 0; i < col; i++) {
            for (int j = i; j < row; j++) {

                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;

                // cant use below code
                // because as both arr[i][j] & arr[j][i] pointing to same position, the moment
                // arr[i][j] will get the value after addition, arr[j][i] value also get same
                // value as arr[i][j], while will change the expected subtracted value

                // arr[i][j] = arr[i][j] + arr[j][i];
                // arr[j][i] = arr[i][j] - arr[j][i];
                // arr[i][j] = arr[i][j] - arr[j][i];
            }
        }

        System.out.println("After transpose of matrix");
        PrintArray.print2DArray(arr);

    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 5, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        printTransposeMatrix(arr);
    }

}
