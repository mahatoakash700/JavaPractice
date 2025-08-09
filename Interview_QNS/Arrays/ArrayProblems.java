import java.util.*;

public class ArrayProblems {

    public static void reverseArray(int[] input) {
        //int[] numbers = {10, 20, 30, 40, 50};
        if (input == null || input.length <= 1) {
            System.out.println("Invalid input");
            return;
        }
        int n = input.length;

        int l = 0, r = n - 1;

        while (l < r) {
            input[l] = input[l] + input[r];
            input[r] = input[l] - input[r];
            input[l] = input[l] - input[r];
            l++;
            r--;
        }

        System.out.println("result: " + Arrays.toString(input));
    }

    public static void largestElement(int[] input){
//        int[] input = {10,20,01,-1,21};
        int n =input.length;

        if(input == null || n<=1){
            System.out.println("invalid input");
            return;
        }

        int max = Integer.MIN_VALUE;

        for(int value : input){
            if(value > max){
                max = value;
            }
        }
        System.out.println("result: "+max);
    }

    public static void secondLargestElement(int[] input){
        //      int[] input = {10,20,01,-1,21};
        int n =input.length;

        if(input == null || n<=1){
            System.out.println("invalid input");
            return;
        }

        int largest = Integer.MIN_VALUE;
        int sLargest = Integer.MIN_VALUE;

        for(int value : input){
            if(value > largest){
                sLargest = largest;
                largest = value;
            }
            else if(value < largest && value > sLargest){
                sLargest = value;
            }
        }
        System.out.println("second largest: "+sLargest);
    }

    public static void isDuplicateValuePresent(int[] input){
//        int[] input = {10,20,01,-1,21};

        int n =input.length;

        if(input == null || n<=1){
            System.out.println("invalid input");
            return;
        }
        Set<Integer>dataSet = new HashSet<>();
        for(int val : input){
            if(!dataSet.add(val)){
                System.out.print("Duplicate is present");
                return;
            }
        }

        System.out.println("No Duplicate is present");
    }

    public static void removeDuplicates(int[] input){
//        int[] input = {10,20,01,-1,01,21,10,01};
        int n =input.length;

        if(input == null || n<=1){
            System.out.println("invalid input");
            return;
        }
        Set<Integer>dataSet = new LinkedHashSet<>();
        for(int val : input){
            dataSet.add(val);
        }

        int[] result = new int[dataSet.size()];

        int i=0;
        for(int data : dataSet){
            result[i++] = data;
        }

        System.out.println("result"+Arrays.toString(result));
    }





    public static void main(String[] args) {
        int[] input = {10, 20, 30, 40, 50};
        reverseArray(input);

        largestElement(new int[]{10, 20, 01, -1, 21});

        secondLargestElement(new int[]{10, 20, 01, -1, 21});

        isDuplicateValuePresent(new int[]{10, 20, 01, -1, 21});

        removeDuplicates(new int[]{10, 20, 01, -1, 01, 21, 10, 01});
    }
}
