package com.itcinfotech;

public class FindSecondMaximumNumberFromArrayUsingMathsUtils {

    public static void main(String[] args) {

        int[] arr = {8,9,-1,-100,2,0,4,72,19,200,521,-302};

        int maxNum = Integer.MIN_VALUE;
        int secondMaxNum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > maxNum) {
                secondMaxNum = maxNum;
                maxNum = arr[i];
            } else if(arr[i]> secondMaxNum && arr[i] !=maxNum) {
                secondMaxNum = arr[i];
            }
        }

        System.out.println("MaxNumber ===>" + maxNum);
        System.out.println("Second Max Number ==> " + secondMaxNum);
    }
}
/*
Sudo code:
1) Lets declare two primitive variable max, secondMax
2) Let's consider max, secondMax has lowest mimin from integeer class, so taht we start comparing from that value
3) We ahve to loop the array and having if block to compare each array with max value will be the highest elelment in the aray
   i) let's say if the arr[i] index value is greater than max value, then you have to assign current maxVallue to the secondMax value
   ii) And arr[i] value to the maxVlaue
4) Lets say arr[i] is not grete than max and but it's gretaer than second max and not equals to the maxvalue then
    i) assign arr[i] looping element to the second max
5) exit the loop and print the max and secondmax value
 */