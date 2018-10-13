package com.kugmax.learn.letcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringSolution {

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        if (s.length() == 1 ) {
            return 1;
        }

        Map<Character, Integer> map = new HashMap<>();

        char[] chars = s.toCharArray();
        int len = chars.length;
        int result = 0;

        for (int i = 0, j = 0; j < len; j++) {
            if (map.containsKey(chars[j])) {
                i = Math.max(map.get(chars[j]), i);
            }

            result = Math.max(result, j - i + 1);
            map.put(chars[j], j + 1);
        }

        return result;
    }


    public int set_lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        if (s.length() == 1 ) {
            return 1;
        }

        Set<Character> set = new HashSet<>();

        char[] chars = s.toCharArray();
        int len = chars.length;
        int result = 0, i = 0, j = 0;

        while (i < len && j < len ) {
            if (!set.contains(chars[j])) {
                set.add(chars[j++]);
                result = Math.max(result, j - i);
            } else {
                set.remove(chars[i++]);
            }
        }

        return result;
    }
}
