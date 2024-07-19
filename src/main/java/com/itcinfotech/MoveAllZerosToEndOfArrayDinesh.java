package com.itcinfotech;

import java.util.Arrays;

public class MoveAllZerosToEndOfArrayDinesh {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 0, 1, 0, 3, 0, 5, 0, 1, 0, 5, 0, 3, 0};
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 0) {
                j++;
            }
        }

        System.out.println(Arrays.toString(arr));

    }

}
