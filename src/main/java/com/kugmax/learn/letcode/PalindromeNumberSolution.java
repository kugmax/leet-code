package com.kugmax.learn.letcode;

public class PalindromeNumberSolution {

//    o(n)
    public boolean _isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        ReverseIntegerSolution reverseIntegerSolution = new ReverseIntegerSolution();
        return x == reverseIntegerSolution.reverse(x);
    }

//    o(log n)
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        if (x == 0) {
            return true;
        }

        if (x % 10 == 0) {
            return false;
        }

        int input = x;
        long result = 0;

        while (x > result) {
            result = result * 10 + input % 10;
            input /= 10;
        }

        return result == x || result / 10 == x;
    }
}
