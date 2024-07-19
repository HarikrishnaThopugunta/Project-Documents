package com.itcinfotech.array;

import java.util.Arrays;

public class FindMissingNumberFromArray {

    public static void main(String[] args) {

        //case1:
        int[] arr = {1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};//8 =====>
        int n = arr.length + 1;
        int sumOfNNaturalNumbers = n * (n + 1) / 2;
        System.out.println("sumOfNNaturalNumbers======>" + sumOfNNaturalNumbers);

        int sumOfGivenArray = Arrays.stream(arr).sum();
        System.out.println("sumOfGivenArray ===> " + sumOfGivenArray);
        int missingNum = sumOfNNaturalNumbers - sumOfGivenArray;

        System.out.println("Missing number is ===> " + missingNum);

        //case2
        int abs = sumOfNNaturalNumbers;
        for (int i = 0; i < arr.length; i++) {
            abs = abs - arr[i];
        }
        System.out.println("ABS number is ====>" + abs);

        //Arrays.sort(arr);
        //case3
        sortArray(arr);
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int expectedValue = current + 1;
            int j = i + 1;//13 -- 14
            if (j < arr.length && expectedValue != arr[j]) {
                System.out.println("Missing value in teh array series=====>" + expectedValue);
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void sortArray(int[] arr) {
        int length = arr.length;
        //int j = 1;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void sortArrayWithOnPointer(int[] arr) {
        int length = arr.length;
        // int j = 1;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
