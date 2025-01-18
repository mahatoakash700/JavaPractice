package BasicMath;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintAllDivisors {

    public static List<Integer> printAllDivisors(int n){
        List<Integer>nms = new ArrayList<>();

        for(int i=1;i<=Math.sqrt(n);i++){

            if(n%i ==0){
                nms.add(i);
                if(n/i != i){
                    nms.add(n/i);
                }
            }
        }
        Collections.sort(nms);
        nms.stream().forEach(System.out::println);
        return nms;

    }

    public static void main(String[] args) {
        printAllDivisors(208);
    }

}
