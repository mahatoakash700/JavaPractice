package Patterns;


import java.util.Scanner;

public class StarPrint1 {

    public static void printStartPattern1(int n) {
        /*
         *  ****
            ****
            ****
            ****
            ****
         */
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        printStartPattern1(n);
    }

}
