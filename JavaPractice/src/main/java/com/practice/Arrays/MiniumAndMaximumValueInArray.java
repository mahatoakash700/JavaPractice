package com.practice.Arrays;

public class MiniumAndMaximumValueInArray {

    public static void getMinValueInArray(int[] arr, int size) {
        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i < size; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }

        System.out.println("min value in array: " + minValue);
    }

    public static void getMaxValueInArray(int[] arr, int size) {
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }

        System.out.println("max value in array: " + maxValue);
    }

    public static void main(String[] args) {
        int[] arr = { 4, 9, 6, 5, 2, 3 };
        int size = arr.length;

        getMinValueInArray(arr, size);
        getMaxValueInArray(arr, size);

    }

}
