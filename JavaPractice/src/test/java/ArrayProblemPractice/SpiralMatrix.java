package ArrayProblemPractice;

public class SpiralMatrix {

    public static void printSpiralMatrix(int[][] arr) {
        System.out.println("Input Matrix");
        PrintArray.print2DArray(arr);
        int row = arr.length;
        int col = arr[0].length;
        int topRow = 0, bottomrow = row - 1, leftCol = 0, rightCol = col - 1;
        int totalElements = 0;

        int[] result = new int[row];

        while (totalElements < (row * col)) {
            // topRow -> left col to right col
            for (int j = leftCol; j <= rightCol && totalElements < (row * col); j++) {
                System.out.print(arr[topRow][j] + " "); // element will be fiiled in top row
                totalElements++;
            }
            topRow++;
            // rightCol -> topRow to bottomRow
            for (int i = topRow; i <= bottomrow && totalElements < (row * col); i++) {
                System.out.print(arr[i][rightCol] + " ");// element will be filled in right last column from 2nd row to
                                                         // last row
                totalElements++;
            }
            rightCol--;
            // bottomRow -> rightCol to leftCol
            for (int j = rightCol; j >= leftCol && totalElements < (row * col); j--) {
                System.out.print(arr[bottomrow][j] + " "); // element will be filled in last rom from 2nd last col to
                                                           // first col
                totalElements++;
            }
            bottomrow--;
            // leftCol -> bottomRow to topRow
            for (int i = bottomrow; i >= topRow && totalElements < (row * col); i--) {
                System.out.print(arr[i][leftCol] + " "); // element will be filled from 2nd last row to 2nd row in the
                                                         // array
                totalElements++;
            }
            leftCol++;
        }

    }

    public static void printSpiralMatrixFromValuePassedDynamically(int num) {
        /*
         * suppose number passed = 3, then spiral matrix should be as below
         * 
         * 1 2 3
         * 8 9 4
         * 7 6 5
         */

        int arr[][] = new int[num][num];
        int topRow = 0, bottomRow = num - 1, leftCol = 0, rightCol = num - 1;
        int currentElement = 1;

        while (currentElement <= (num * num)) {
            for (int j = leftCol; j <= rightCol && currentElement <= (num * num); j++) {
                arr[topRow][j] = currentElement++;
            }
            topRow++;
            for (int i = topRow; i <= bottomRow && currentElement <= (num * num); i++) {
                arr[i][rightCol] = currentElement++;
            }
            rightCol--;

            for (int j = rightCol; j >= leftCol && currentElement <= (num * num); j--) {
                arr[bottomRow][j] = currentElement++;
            }
            bottomRow--;

            for (int i = bottomRow; i >= topRow && currentElement <= (num * num); i--) {
                arr[i][leftCol] = currentElement++;
            }
            leftCol++;
        }

        PrintArray.print2DArray(arr);

    }

    public static void printSpiralMatrixInAntiClockWiseDirection(int[][] arr) {

        System.out.println("Input array");
        PrintArray.print2DArray(arr);
        int row = arr.length;
        int col = arr[0].length;

        int topRow = 0, bottomRow = row - 1, leftCol = 0, rightCol = col - 1;
        int totalElements = 0;
        int[][] newArray = new int[row][col];

        while (totalElements < (row * col)) {
            for (int i = topRow; i <= bottomRow && totalElements < (row * col); i++) {
                newArray[i][leftCol] = totalElements++;
            }
            leftCol++;
            for (int j = leftCol; j <= rightCol && totalElements < (row * col); j++) {
                newArray[bottomRow][j] = totalElements++;
            }
            bottomRow--;

            for (int i = bottomRow; i >= topRow && totalElements < (row * col); i--) {
                newArray[i][rightCol] = totalElements++;
            }
            rightCol--;

            for (int j = rightCol; j >= leftCol && totalElements < (row * col); j--) {
                newArray[topRow][j] = totalElements++;
            }
            topRow++;
        }
        System.out.println("spiral array");
        PrintArray.print2DArray(newArray);
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14,
                15, 16 } };
        int[][] arr1 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        // printSpiralMatrix(arr);
        // System.out.println();
        // printSpiralMatrix(arr1);

        // printSpiralMatrixFromValuePassedDynamically(3);
        // printSpiralMatrixFromValuePassedDynamically(5);

        printSpiralMatrixInAntiClockWiseDirection(arr);
        // printSpiralMatrixInAntiClockWiseDirection(arr1);

    }

}
