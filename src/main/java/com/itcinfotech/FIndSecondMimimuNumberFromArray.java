package com.itcinfotech;

public class FIndSecondMimimuNumberFromArray {


    public static void main(String[] args) {

        int[] arr = {-200,-120, 0, 1, 28,120,-500};
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for(int i =0; i< arr.length ; i++) {
            if(arr[i] < min) {
                secondMin = min;
                min = arr[i];
            } else if(arr[i] < secondMin && arr[i] != min) {
                secondMin = arr[i];
            }

        }
        System.out.println("Minimum value from array: " + min);
        System.out.println("Second Minimum value from array: " + secondMin);
    }


}
/*
1)
 */