package com.itcinfotech;

import java.util.Arrays;

public class FindSecondMaximumNumberFromArray {

    public static void main(String[] args) {

        int[] arr = {9,1,2,3,4,5,6,7,8};

        int maxNum = Integer.MIN_VALUE;
        int secondMaxNum = Integer.MIN_VALUE;

        for(int i=0; i < arr.length; i++) {
            if(arr[i]> maxNum) {
                secondMaxNum = maxNum;
                maxNum = arr[i];
            } else if(arr[i]> secondMaxNum && arr[i]!=maxNum) {
                secondMaxNum = arr[i];
            }
        }

        System.out.println("MaxNumber ===>" + maxNum);
        System.out.println("Second Max Number ==> " + secondMaxNum);
    }
}
