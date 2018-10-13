package com.kugmax.learn.letcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLongestSubstringSolution {

    @Test
    public void test() {
        LongestSubstringSolution solution = new LongestSubstringSolution();

        assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));
        assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"));

        assertEquals(6, solution.lengthOfLongestSubstring("abcaddefghy"));

        assertEquals(0, solution.lengthOfLongestSubstring(null));
        assertEquals(0, solution.lengthOfLongestSubstring(""));
        assertEquals(1, solution.lengthOfLongestSubstring("___"));
        assertEquals(2, solution.lengthOfLongestSubstring("112233"));
        assertEquals(2, solution.lengthOfLongestSubstring("au"));
        assertEquals(1, solution.lengthOfLongestSubstring("a"));
    }
}
