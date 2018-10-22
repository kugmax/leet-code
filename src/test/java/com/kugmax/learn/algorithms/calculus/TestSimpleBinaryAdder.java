package com.kugmax.learn.algorithms.calculus;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class TestSimpleBinaryAdder {

    @Test
    public void test_1() {
        SimpleBinaryAdder algorithm = new SimpleBinaryAdder();

        int[] result = algorithm.add(
                new int[]{0, 1, 0}, //2
                new int[]{0, 1, 0}); //2

        IntStream.of(result).forEach(System.out::print);
        System.out.println();

        assertArrayEquals(new int[]{0, 1, 0, 0}, result); //4
    }

    @Test
    public void test_2() {
        SimpleBinaryAdder algorithm = new SimpleBinaryAdder();

        int[] result = algorithm.add(
                new int[]{1, 0}, //2
                new int[]{1, 0}); //2

        IntStream.of(result).forEach(System.out::print);
        System.out.println();

        assertArrayEquals(new int[]{1, 0, 0}, result); //4
    }
}
