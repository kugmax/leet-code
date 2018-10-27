package com.kugmax.learn.algorithms.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestMergeSortSentinels {

    @Test
    public void test() {
        MergeSortSentinels algorithm = new MergeSortSentinels();

        assertArrayEquals(new int[]{1, 2, 2, 3, 4, 5, 6, 7}, algorithm.sort(new int[]{5, 2, 4, 7, 1, 3, 2, 6}));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, algorithm.sort(new int[]{5, 2, 4, 1, 3}));

        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, algorithm.sort(new int[]{5, 2, 4, 6, 1, 3}));
        assertArrayEquals(new int[]{26, 31, 41, 41, 58, 59}, algorithm.sort(new int[]{31, 41, 59, 26, 41, 58}));

        assertArrayEquals(new int[]{1, 2}, algorithm.sort(new int[]{2, 1}));
        assertArrayEquals(new int[]{1, 2}, algorithm.sort(new int[]{1, 2}));

        assertArrayEquals(new int[]{5}, algorithm.sort(new int[]{5}));
    }

    @Test
    public void test_reverse() {
        MergeSortSentinels algorithm = new MergeSortSentinels();

        assertArrayEquals(new int[]{7, 6, 5, 4, 3, 2, 2, 1}, algorithm.sort(new int[]{5, 2, 4, 7, 1, 3, 2, 6}, true));
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, algorithm.sort(new int[]{5, 2, 4, 1, 3}, true));

        assertArrayEquals(new int[]{6, 5, 4, 3, 2, 1}, algorithm.sort(new int[]{5, 2, 4, 6, 1, 3}, true));
        assertArrayEquals(new int[]{59, 58, 41, 41, 31, 26}, algorithm.sort(new int[]{31, 41, 59, 26, 41, 58}, true));


        assertArrayEquals(new int[]{2, 1}, algorithm.sort(new int[]{2, 1}, true));
        assertArrayEquals(new int[]{2, 1}, algorithm.sort(new int[]{1, 2}, true));

        assertArrayEquals(new int[]{5}, algorithm.sort(new int[]{5}, true));
    }
}
