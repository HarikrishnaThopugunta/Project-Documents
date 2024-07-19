package com.itcinfotech.strings;

public class PalindromeUsingRecursive {
    public static void main(String[] args) {
        String str = "madam";
        //start - 0
        //end - 4
        int start = 0;
        int end = str.length() - 1;
        boolean palindrome = isPalindrome(start, end, str);

        System.out.println("palindrome ===>" + palindrome);
    }

    public static Boolean isPalindrome(int start, int end, String str) {
        // this if condition is equals to while loop
        int temp = 20;
        if (start >= end) {
            return true;
        }

        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return isPalindrome(start + 1, end - 1, str);
    }

    public Integer addition(Integer a, Integer b) {

        //int[] arr = {"One","Two", "Three","Four", "Five"};
        return addition(a,b);
    }
}
