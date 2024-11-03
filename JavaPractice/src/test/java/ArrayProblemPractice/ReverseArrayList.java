package ArrayProblemPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ReverseArrayList {

    public static void reverseElement(ArrayList<Integer> list) {

        int startIndex = 0, lastIndex = list.size() - 1;

        while (startIndex < lastIndex) {
            int temp = list.get(startIndex);
            list.set(startIndex, list.get(lastIndex));
            list.set(lastIndex, temp);

            startIndex++;
            lastIndex--;
        }
        PrintArray.printIntegerArrayList(list);

    }

    public static void sortIntegerElementUsingCollectionSort(ArrayList<Integer> list) {
        Collections.sort(list);// ascending order
        PrintArray.printIntegerArrayList(list);
        Collections.sort(list, Collections.reverseOrder());// descending order
        PrintArray.printIntegerArrayList(list);
    }

    public static void main(String[] args) {
        // reverseElement(new ArrayList<>(Arrays.asList(0, 10, 3, 5, 22, 10)));
        sortIntegerElementUsingCollectionSort(new ArrayList<>(Arrays.asList(0, 10, 3, 5, 22, 10)));
    }

}
