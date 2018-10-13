package com.kugmax.learn.letcode;

import java.util.Arrays;
import java.util.TreeSet;
import java.util.stream.Stream;

public class LongestPalindromicSolution {


    public String findLongestPalindrome(String s) {
        String input = addDelimiters(s);
        int len = input.length();
        int[] palindromeLength = new int[len];
        int center = 0, i = 0, j = 0;

//        while (j < len) {
//
//        }

        return null;
    }

    public int polindromicLength(String s, int center, int i, int j) {
        int left = i, right = j;
        while (left > 0 && right < s.length() && s.indexOf(left) == s.indexOf(right)) {
            left--;
            right++;
        }

        return right - left + 1;
    }

    public String addDelimiters(String s) {
        if (s == null) {
            return null;
        }

        StringBuilder builder = new StringBuilder();
        char[] chars = s.toCharArray();
        for (char c : chars ) {
            builder.append("|").append(c);
        }
        builder.append("|");

        return builder.toString();
    }

    public boolean isPalindromic(String input) {
        if (input == null) {
            return false;
        }

        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left++) != input.charAt(right--)) {
                return false;
            }
        }

        return true;
    }
}
