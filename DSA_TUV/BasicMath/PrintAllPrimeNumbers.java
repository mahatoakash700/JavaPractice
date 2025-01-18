package BasicMath;

import java.util.ArrayList;
import java.util.List;

public class PrintAllPrimeNumbers {

    public static List<Integer> printAllPrimeNumbers(int n){
        List<Integer>pnms = new ArrayList<>();
        for(int i=2;i<=n;i++){
            boolean isPrime = true;
            for(int j=2;j*j<=i;j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                pnms.add(i);
            }
        }
        pnms.forEach(prime -> System.out.print(prime + ","));
        return pnms;
    }

    public static void main(String[] args) {
        printAllPrimeNumbers(99);
    }

}
