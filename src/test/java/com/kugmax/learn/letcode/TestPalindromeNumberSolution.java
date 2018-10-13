package com.kugmax.learn.letcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestPalindromeNumberSolution {

    @Test
    public void test() {
        PalindromeNumberSolution solution = new PalindromeNumberSolution();

        assertTrue(solution.isPalindrome(34566543));
        assertTrue(solution.isPalindrome(111));
        assertTrue(solution.isPalindrome(121));
        assertTrue(solution.isPalindrome(0));

        assertFalse(solution.isPalindrome(110));
        assertFalse(solution.isPalindrome(10));
        assertFalse(solution.isPalindrome(1215));
        assertFalse(solution.isPalindrome(-11));
    }
}
