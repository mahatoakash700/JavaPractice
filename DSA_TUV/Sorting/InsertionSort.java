package Sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] arr){
        int n = arr.length;

        for(int i=0;i<n;i++){
            int j= i;
            while(j>0 && arr[j-1] > arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }


    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };
        insertionSort(arr);
    }

}
