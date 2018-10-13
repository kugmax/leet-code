package com.kugmax.learn.letcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLongestPalindromicSolution {

    @Test
    public void testAddDelimiters() {
        LongestPalindromicSolution solution = new LongestPalindromicSolution();

        assertEquals("|c|b|", solution.addDelimiters("cb"));
        assertEquals("|c|b|b|d|", solution.addDelimiters("cbbd"));
        assertEquals("|", solution.addDelimiters(""));
        assertEquals(null, solution.addDelimiters(null));
        assertEquals("| | |", solution.addDelimiters("  "));
        assertEquals("|1|2|3|3|2|1|", solution.addDelimiters("123321"));
    }

    @Test
    public void testPolindromicLength() {
        LongestPalindromicSolution solution = new LongestPalindromicSolution();

        assertEquals(5, solution.polindromicLength("babad", 2, 1, 3));
        assertEquals(3, solution.polindromicLength("babad", 1, 0, 2));

//        assertEquals(2, solution.polindromicLength("babad", 3, 2, 4));
        assertEquals(2, solution.polindromicLength("babad", -7, 0, 1));
    }

    @Test
    public void testSolution() {
        LongestPalindromicSolution solution = new LongestPalindromicSolution();

        assertEquals("c", solution.findLongestPalindrome("cb"));
        assertEquals("bb", solution.findLongestPalindrome("cbbd"));
        assertEquals("bab", solution.findLongestPalindrome("babad"));
        assertEquals("", solution.findLongestPalindrome(""));
        assertEquals("", solution.findLongestPalindrome(null));
        assertEquals("  ", solution.findLongestPalindrome("  "));
        assertEquals("123321", solution.findLongestPalindrome("123321"));
    }
}
