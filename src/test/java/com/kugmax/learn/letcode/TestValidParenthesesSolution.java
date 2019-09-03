package com.kugmax.learn.letcode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TestValidParenthesesSolution {

    @Test
    public void test() {
        ValidParenthesesSolution solution = new ValidParenthesesSolution();

        assertTrue(solution.isValid(""));
        assertTrue(solution.isValid(" "));
        assertTrue(solution.isValid(null));

        assertTrue(solution.isValid("()[]{}"));
        assertTrue(solution.isValid("([()]{})"));

        assertFalse(solution.isValid("({{)}}"));
        assertFalse(solution.isValid(")("));
    }
}
