package com.kugmax.learn.letcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLongestCommonPrefixSolution {

    @Test
    public void test() {
        LongestCommonPrefixSolution solution = new LongestCommonPrefixSolution();

        assertEquals("fl", solution.longestCommonPrefix(new String[]{"flower","flow","flight"}));
        assertEquals("", solution.longestCommonPrefix(new String[]{"dog","racecar","car"}));

        assertEquals("", solution.longestCommonPrefix(new String[]{"","",""}));
        assertEquals("", solution.longestCommonPrefix(null));

        assertEquals("flower", solution.longestCommonPrefix(new String[]{"flower"}));
    }
}
