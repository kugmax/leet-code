package com.kugmax.learn.letcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestIntegerToRomanSolution {

    @Test
    public void test() {
        IntegerToRomanSolution solution = new IntegerToRomanSolution();

        assertEquals("I", solution.intToRoman(1));
        assertEquals("II", solution.intToRoman(2));
        assertEquals("III", solution.intToRoman(3));
        assertEquals("IV", solution.intToRoman(4));
        assertEquals("V", solution.intToRoman(5));
        assertEquals("VI", solution.intToRoman(6));
        assertEquals("VII", solution.intToRoman(7));
        assertEquals("VIII", solution.intToRoman(8));

        assertEquals("IX", solution.intToRoman(9));
        assertEquals("X", solution.intToRoman(10));
        assertEquals("XX", solution.intToRoman(20));
        assertEquals("XXX", solution.intToRoman(30));
        assertEquals("XL", solution.intToRoman(40));

        assertEquals("L", solution.intToRoman(50));
        assertEquals("LX", solution.intToRoman(60));
        assertEquals("LXX", solution.intToRoman(70));
        assertEquals("LXXX", solution.intToRoman(80));

        assertEquals("LVIII", solution.intToRoman(58));

        assertEquals("MCMXCIV", solution.intToRoman(1994));

        assertEquals("C", solution.intToRoman(100));
        assertEquals("M", solution.intToRoman(1000));
    }
}
