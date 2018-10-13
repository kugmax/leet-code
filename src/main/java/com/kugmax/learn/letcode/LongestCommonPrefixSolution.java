package com.kugmax.learn.letcode;

public class LongestCommonPrefixSolution {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        if (strs.length == 1) {
            return strs[0];
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0;; i++) {

            if (i >= strs[0].length()) {
                return result.toString();
            }

            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {

                if (i >= strs[j].length()) {
                    return result.toString();
                }

                if (c != strs[j].charAt(i)) {
                    return result.toString();
                }
            }

            result.append(c);
        }

//        return result.toString();
    }
}
