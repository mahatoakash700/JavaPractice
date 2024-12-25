package Patterns;

import java.util.Scanner;

public class StarPrint2 {
    public static void printStarPattern1(int n) {

        /*
         * 
         * *
         * * *
         * * * *
         */
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printStarPattern2(int n) {
        /*
         * 1
         * 1 2
         * 1 2 3
         */
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void printStarPattern3(int n) {
        /*
         * 1
         * 2 2
         * 3 3 3
         */
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void printStarPattern4(int n) {
        // * * *
        // * *
        // *

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printStarPattern5(int n) {
        // 1 2 3
        // 1 2
        // 1
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void printStarPattern6(int n) {
        /*
         * ----*----
         * ---***---
         * --*****--
         * -*******-
         * *********
         */
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("-");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= n - i; j++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }

    public static void printStarPattern7(int n) {
        /*
         * *********
         * -*******-
         * --*****--
         * ---***---
         * ----*----
         */
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("-");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= n - i; j++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }

    public static void printStarPattern8(int n) {
        /*
              *
             ***
            *****
            *****
             ***
              *
        */

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void printStarPattern9(int n) {
        /*
           *
           **
           ***
           **
           *
         */

        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;
            if (i > n) {
                stars = 2 * n - i;
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printStarPattern10(int n) {
        /*
         * 1
         * 0 1
         * 1 0 1
         * 0 1 0 1
         * 1 0 1 0 1
         * 0 1 0 1 0 1
         */
        for (int i = 1; i <= n; i++) {
            int start;
            if (i % 2 == 0)
                start = 0;
            else
                start = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }

    public static void printStarPattern11(int n) {
        /*
         * 1             1
         * 1 2         2 1
         * 1 2 3     3 2 1
         * 1 2 3 4 4 3 2 1
         */
        int space = 2 * (n - 1);
        // int space = (2*n) - 2;
        // both space value works
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = 1; j <= space; j++) {
                System.out.print("-");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            System.out.println();
            space -= 2;
        }
    }

    public static void printStarPattern12(int n) {
        /*
         * A
         * A B
         * A B C
         * A B C D
         */
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public static void printStarPattern13(int n) {
        /*
         * 1
         * 2 3
         * 4 5 6
         * 7 8 9 10
         */
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }

    public static void printStarPattern14(int n) {
        /*
         * A B C D
         * A B C
         * A B
         * A
         */

        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch < 'A' + (n - i); ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public static void printStarPattern15(int n) {
        /*
         * A
         * B B
         * C C C
         * D D D D
         */
        for (int i = 0; i < n; i++) {
            char ch = (char) ('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public static void printStarPattern16(int n) {

        /*
         * A
         * A B A
         * A B C B A
         * A B C D C B A
         * A B C D E D C B A
         */
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("-");
            }
            char ch = (char) ('A');
            int breakpoint = (2 * i - 1) / 2;
            System.out.println("Breakpoint: " + breakpoint);
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.println("k-value: " + k);
                if (k <= breakpoint)
                    System.out.print(ch++);
                else
                    System.out.print(ch--);
            }

            for (int j = 1; j <= n - i; j++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }

    public static void printStarPattern17(int n) {
        /*
         * 1 1
         * 1 2 2 1
         * 1 2 3 3 2 1
         * 1 2 3 4 4 3 2 1
         * 1 2 3 4 5 5 4 3 2 1
         * 1 2 3 4 5 6 6 5 4 3 2 1
         * 1 2 3 4 5 6 7 7 6 5 4 3 2 1
         */
        // int space = 2 * (n - 1);
        for (int i = 1; i <= n; i++) {
            // numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // space
            int space = (n - i) * 2;
            for (int k = 1; k <= space; k++) {
                System.out.print("-");
            }
            // numbers
            for (int l = i; l >= 1; l--) {
                System.out.print(l);
            }
            System.out.println();
        }
    }

    public static void printStarPattern18(int n) {
        /*
         * F
         * E F
         * D E F
         * C D E F
         * B C D E F
         * A B C D E F
         */

        for (int i = 1; i <= n; i++) {
            char ch = (char) ('A' + n - i);
            for (int j = 1; j <= i; j++) {
                System.out.print(ch++ + " ");
            }
            System.out.println();
        }
    }

    public static void printStarPattern19(int n){
        /*
        ************
        *****  *****
        ****    ****
        ***      ***
        **        **
        *          *
        *          *
        **        **
        ***      ***
        ****    ****
        *****  *****
        ************
        */
        int space = 0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }

            for(int k = 1; k<=space;k++){
                System.out.print("-");
            }

            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
            space += 2;
        }
        int spaces = 2 * (n - 1);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= spaces; j++) {
                System.out.print("-");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
            spaces -= 2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        // printStarPattern1(n);
        // printStarPattern2(n);
        // printStarPattern3(n);
        // printStarPattern4(n);
        // printStarPattern5(n);
        // printStarPattern6(n);
        // printStarPattern7(n);
        // printStarPattern8(n);
        // printStarPattern9(n);
        // printStarPattern10(n);
        // printStarPattern11(n);
        // printStarPattern12(n);
        // printStarPattern13(n);
        // printStarPattern14(n);
        // printStarPattern15(n);
        // printStarPattern16(n);
        // printStarPattern17(n);
        // printStarPattern18(n);
        printStarPattern19(n);
    }
}
