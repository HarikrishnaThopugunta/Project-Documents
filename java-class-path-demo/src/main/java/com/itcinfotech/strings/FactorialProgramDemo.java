package com.itcinfotech.strings;

public class FactorialProgramDemo {

    public static void main(String[] args) {
        //n! -- 5!
        //5*4*3*2*1
        //n*n-1*n-2*n-3*n-4
        int n = 5;
        int factResult = 1;
        for (int i= n; i > 0 ;i--) {
             factResult = i*factResult;
        }
        System.out.println("factorial value + " + factResult);

        int factResultWhile = 1;
        int j = n;
        while (j > 0) {
            factResultWhile = j*factResultWhile;
            j--;
        }
        System.out.println("factResultWhile "+ factResultWhile);
    }

    public int getFactorialUsingRecuursive(int inputNum) {

        if(inputNum == 0) {
        }

        return inputNum-1;
    }

}
