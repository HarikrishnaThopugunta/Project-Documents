package com.itcinfotech;

import java.util.Arrays;

public class MoveAllZerosInArray {

    public static void main(String[] args) {
        int[] arr = {1,0,3,0,5,0,2,1,0,7,0,3,0,2,0,2,0,2,0,3,0,1,2,3};
        for(int k= 0; k<arr.length ; k++) {
            System.out.println("K value ===>" + k);
            if(arr[k] == 0 ) {
               for (int l = arr.length-1; l > 1 ; l--) {
                   System.out.println("L value ===>" + l);
                   if(arr[l] != 0) {
                       int temp = arr[l];
                       arr[l] = arr[k];
                       arr[k] = temp;
                       break;
                   }                                                                                                                                                                                                                    
               }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
