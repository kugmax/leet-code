package com.kugmax.learn.letcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestReverseIntegerSolution {

    @Test
    public void test() {
        ReverseIntegerSolution solution = new ReverseIntegerSolution();

        assertEquals(321, solution.reverse(123));
        assertEquals(-321, solution.reverse(-123));
        assertEquals(21, solution.reverse(120));

        assertEquals(0, solution.reverse(0));
        assertEquals(21, solution.reverse(12));
        assertEquals(899999999, solution.reverse(999999998));

        assertEquals(0, solution.reverse(1534236469));
        assertEquals(0, solution.reverse(Integer.MAX_VALUE));
        assertEquals(0, solution.reverse(Integer.MIN_VALUE));



    }
}
