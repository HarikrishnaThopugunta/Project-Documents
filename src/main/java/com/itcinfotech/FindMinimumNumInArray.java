package com.itcinfotech;

import java.util.Objects;

public class FindMinimumNumInArray {

    public static void main(String[] args) {

        int[] arr = {5,6,3,12,56,31,9,1,0};

        FindMinimumNumInArray instance = new FindMinimumNumInArray();
        System.out.println("Minimum number from array is : " + instance.getMinimumNumFromArray(arr));

        //System.out.println("Minimum number from array is : " + instance.getMinimumNumFromArray(null));

        System.out.println("Minimum number from array is : " + instance.getMinimumNumFromArray(new int[] {}));

    }


    private int getMinimumNumFromArray(int[] arr) {
        if(Objects.isNull(arr) || arr.length == 0) {
            throw new IllegalArgumentException("Received Illegal array as input");
        }

        int minNum = arr[0];
        for(int i=0; i< arr.length; i++) {
            if(arr[i] < minNum) {
                minNum = arr[i];
            }
        }
        return minNum;
    }
}
