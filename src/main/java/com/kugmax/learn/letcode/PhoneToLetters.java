package com.kugmax.learn.letcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneToLetters {
    private final Map<String, List<String>> numberToStrings = new HashMap<>();

    public PhoneToLetters() {
        numberToStrings.put("0", Arrays.asList(" "));
        numberToStrings.put("1", Arrays.asList());
        numberToStrings.put("2", Arrays.asList("a", "b", "c"));
        numberToStrings.put("3", Arrays.asList("d", "e", "f"));
        numberToStrings.put("4", Arrays.asList("g", "h", "i"));
        numberToStrings.put("5", Arrays.asList("j", "k", "l"));
        numberToStrings.put("6", Arrays.asList("m", "n", "o"));
        numberToStrings.put("7", Arrays.asList("p", "q", "r", "s"));
        numberToStrings.put("8", Arrays.asList("t", "u", "v"));
        numberToStrings.put("9", Arrays.asList("w", "x", "y", "z"));
    }

    public List<String> letterCombinations(String digits) {
//        char[] chars = digits.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            for () {
//            }
//        }


        return null;
    }
}
