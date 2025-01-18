package Patterns;

public class TestClass {

    public static void nTriangle(int n) {
        for(int i=0;i<n;i++){
            for(char ch='A';ch<=(n-i);ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
     }

     public static void main(String[] args) {
        nTriangle(4);
     }

}
