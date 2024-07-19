package com.itcinfotech.array;

public class ThreeSumArrayDemo {

    public static void main(String[] args) {

        int target = 0;//triplets == 0
        int[] arr = {-1,0,1,+2,-1,-4};
        //i -1, j = 0 , k =1

        for(int i =0; i< arr.length - 2; i++) {
            for (int j = i +1; j< arr.length-1; j++) {
                 for( int k = j+1 ; k < arr.length ; k++) {
                       if(arr[i] + arr[j] + arr[k] == 0) {
                           System.out.println("i = "+ arr[i] + "j = "+ arr[j]
                                   + " k ="+ arr[k]);
                       }
                 }
            }

        }

    }
}
