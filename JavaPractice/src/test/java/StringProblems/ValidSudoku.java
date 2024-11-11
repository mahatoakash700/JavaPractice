package StringProblems;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {

    public static boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char num = board[i][j];
                if (num != '.') {
                    String rowEntry = num + " in row " + i;
                    String colEntry = num + " in col " + j;
                    String blockEntry = num + " in block " + i / 3 + "-" + j / 3;

                    // Print current state of the board
                    System.out.println("Current board state:");
                    printBoard(board);

                    // Print the entries being added to the set
                    System.out.println("Adding to set: " + rowEntry);
                    System.out.println("Adding to set: " + colEntry);
                    System.out.println("Adding to set: " + blockEntry);

                    if (!seen.add(rowEntry) || !seen.add(colEntry) || !seen.add(blockEntry)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    // Helper function to print the board
    private static void printBoard(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // public static boolean isValidSudoku(char[][] board) {
    //     Set<String> seen = new HashSet<>();
    //     for (int i = 0; i < 9; i++) {
    //         for (int j = 0; j < 9; j++) {
    //             char num = board[i][j];
    //             if (num != '.') {
    //                 String rowEntry = num + " in row " + i;
    //                 String colEntry = num + " in col " + j;
    //                 String blockEntry = num + " in block " + i / 3 + "-" + j / 3;

    //                 // Print each entry before adding to `seen` set
    //                 System.out.println("Adding to set: " + rowEntry);
    //                 System.out.println("Adding to set: " + colEntry);
    //                 System.out.println("Adding to set: " + blockEntry);

    //                 if (!seen.add(rowEntry) || !seen.add(colEntry) || !seen.add(blockEntry)) {
    //                     return false;
    //                 }
    //             }
    //         }
    //     }
    //     return true;
    // }

    // public static boolean isValidSudoku(char[][] board) {
    //     Set<String> seen = new HashSet<>();
    //     for (int i = 0; i < 9; i++) {
    //         for (int j = 0; j < 9; j++) {
    //             char num = board[i][j];
    //             if (num != '.') {
    //                 if (!seen.add(num + " in row " + i) ||
    //                         !seen.add(num + "in col " + j) ||
    //                         !seen.add(num + " in block " + i / 3 + "-" + j / 3)) {
    //                     return false;
    //                 }
    //             }
    //         }
    //     }
    //     return true;
    // }

    public static void main(String[] args) {
        char[][] board = new char[][] {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };

        boolean result = isValidSudoku(board);
        System.out.println("IsValid Sudoku: " + result);
    }
}
