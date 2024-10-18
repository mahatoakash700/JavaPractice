package ArrayProblemPractice;

public class PrintArray {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void print2DArray(int[][] arr) {
        // System.out.println("rows: " + arr.length);
        // System.out.println("cols: " + arr[0].length);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 5, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        print2DArray(arr);
    }

}
