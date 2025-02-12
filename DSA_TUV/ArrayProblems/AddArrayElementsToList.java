package ArrayProblems;

import java.util.ArrayList;
import java.util.List;

public class AddArrayElementsToList {

    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // add your code here
        // Set<Integer>data = new TreeSet<>();
        // for(int aData: a){
        // data.add(aData);
        // }

        // for(int bData: b){
        // data.add(bData);
        // }
        // return new ArrayList<>(data);

        int i = 0;
        int j = 0;

        ArrayList<Integer> data = new ArrayList<>();

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                if (data.isEmpty() || !data.contains(a[i])) {
                    data.add(a[i]);
                }
                i++;
            } else if (a[i] > b[j]) {
                if (data.isEmpty() || !data.contains(b[j])) {
                    data.add(b[j]);
                }
                j++;
            } else {
                if (data.isEmpty() || !data.contains(a[i])) {
                    data.add(a[i]);
                }
                i++;
                j++;
            }
        }

        while (i < a.length) {
            if (data.isEmpty() || !data.contains(a[i])) {
                data.add(a[i]);
            }
            i++;
        }

        while (j < b.length) {
            if (data.isEmpty() || !data.contains(b[j])) {
                data.add(b[j]);
            }
            j++;
        }
        return data;
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        int[] b = { 1, 2, 3, 3, 6, 8, 3 };
        List<Integer> result = findUnion(a, b);
        System.out.println(result);
    }

}
