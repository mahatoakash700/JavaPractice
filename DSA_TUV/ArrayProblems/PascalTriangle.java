package ArrayProblemPractice;

public class PascalTriangle {

    public static void printPascalTriangle(int n) {

        int[][] result = new int[n][];

        for (int i = 0; i < n; i++) {
            //ith row has i+1 col
            result[i] = new int[i + 1];
            
            //both 0th and ith place is 1
            result[i][0] = result[i][i] = 1;

            for (int j = 1; j < i; j++) {
                result[i][j] = result[i - 1][j] + result[i - 1][j - 1];
            }
        }
        PrintArray.print2DArray(result);
    }

    public static void main(String[] args) {
        printPascalTriangle(5);
    }

}
