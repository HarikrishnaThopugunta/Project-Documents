package com.itcinfotech.strings;

public class PalindromeDemo {
    public static void main(String[] args) {

        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("that"));
        System.out.println(isPalindrome("malayalam"));

        //Time complexity of palindrome - O(n/2)
    }

    public static boolean isPalindrome(String word) {
        char[] charArray = word.toCharArray();
        int start = 0;
        int end = charArray.length -1;

        while (start < end) {
            if(charArray[start] != charArray[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
