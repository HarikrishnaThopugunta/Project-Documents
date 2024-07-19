package com.itcinfotech.array;

import java.util.Arrays;

public class LeedCodeFindDisappearedNumbers {

    public static void main(String[] args) {
        twoSum(new int[]{2,15,11,7,6}, 9);
        //9-2 = 7 -- contains in arrays elements

    }

    public static void twoSum(int[] nums, int target) {
        int j = 1;
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length-1; i++) {
            int r = nums[i] + nums[j];
            if(r == target) {
                System.out.println("i==>" + i +"j===>"+ j);
                break;
            }
            j++;
        }

    }
//    public static void twoSum(int[] nums, int target) {
//        int j = 1;
//        Arrays.sort(nums);
//        System.out.println(Arrays.toString(nums));
//        for (int i = 0; i < nums.length-1; i++) {
//            int r = nums[i] + nums[j];
//            if(r == target) {
//                System.out.println("i==>" + i +"j===>"+ j);
//                break;
//            }
//            j++;
//        }
//
//    }

//    public static void twoSum(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    System.out.println("result---> " + i + j);
//                }
//            }
//        }
//    }
}
