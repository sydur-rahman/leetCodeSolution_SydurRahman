package com.leetcode.easy;

public class Palindrome_009 {
    public static void main(String[] args) {
        Palindrome_009 obj= new Palindrome_009();
        System.out.println(obj.isPalindrome(1221));

    }

    /* here is what we did,
     * We reversed the given integer and stored it in the revInt and check it with the given integer
     * the variable digit  gets the last digit of the temp. Temp store one less digit every time we divide it with 10
    */
    public boolean isPalindrome(int x) {
        if (x<0){
            return false;
        }

        int revInt=0;
        int temp=x;
        while (temp>0){
            int digit= temp % 10;
            temp=temp/10;
            revInt=(revInt*10)+digit;
        }

        if (x==revInt){
            return true;
        }
        return false;
    }

}
