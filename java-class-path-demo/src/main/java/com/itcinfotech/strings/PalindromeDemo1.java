package com.itcinfotech.strings;

public class PalindromeDemo1 {
    public static void main(String[] args) {
        String str = "madam";
        char[] charArr = str.toCharArray();
        int end = charArr.length -1;
        StringBuilder reverse = new StringBuilder();
        for (int i = end ; i >= 0; i--) {
            reverse.append(charArr[i]);
        }
        System.out.println("reverse value====>" + reverse);
        if(String.valueOf(reverse).equals(str)) {
            System.out.println("Given string is palindrome");
        }

    }
}
