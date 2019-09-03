package com.kugmax.learn.letcode;


//Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
// determine if the input string is valid.

//An input string is valid if:
//    Open brackets must be closed by the same type of brackets.
//    Open brackets must be closed in the correct order.
//    Note that an empty string is also considered valid.


// - ( {{ ) }}
// - )(

// + ()[]{}
// + ( [ () ] {} )

import java.util.Stack;

public class ValidParenthesesSolution {

    public boolean isValid(String s) {
        if (s == null || s.isBlank()) {
            return true;
        }

        Stack<Character> memmory = new Stack<>();
        char[] chars = s.toCharArray();

        try {
            for (Character c : chars) {
                if (c == ')') {
                    if ('(' != memmory.pop())
                        return false;
                } else if (c == ']') {
                    if ('[' != memmory.pop())
                        return false;
                } else if (c == '}') {
                    if ('{' != memmory.pop())
                        return false;
                } else {
                    memmory.push(c);
                }
            }
        } catch (Exception e) {
            return false;
        }

        return memmory.isEmpty();
    }
}