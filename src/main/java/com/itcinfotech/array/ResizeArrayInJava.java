package com.itcinfotech.array;

import java.util.Arrays;

public class ResizeArrayInJava {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int temp = 10;
        int[] response = resize(arr, 20);
        System.out.println(response.hashCode());//20
        System.out.println(Arrays.toString(response));//20
        System.out.println(arr.length);//9
        System.out.println(Arrays.toString(arr));//9
        System.out.println(arr.hashCode());//9
    }

    public static int[] resize(int[] arr, int capacity) {
        System.out.println("arr inside resize method hascode" + arr.hashCode());//9
        arr[0] = 10000;
        int[] temp = new int[capacity];
        for(int i=0; i<arr.length; i++) {
            temp[i] = arr[i];
        }
        System.out.println("temp inside resize method hascode" + temp.hashCode());//9
        arr = temp;
        System.out.println("arr " + Arrays.toString(arr));//20
        System.out.println("temp array" +Arrays.toString(temp));//9
        arr[1] = 99999;
        System.out.println("arr inside after assigning with temp resize method hascode" + arr.hashCode());//9
       return temp;
    }

}
