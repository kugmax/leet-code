package com.kugmax.learn.algorithms.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestMergeSort {

    @Test
    public void test() {
        MergeSort algorithm = new MergeSort();

        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, algorithm.sort(new int[]{5, 2, 4, 6, 1, 3}));
        assertArrayEquals(new int[]{26, 31, 41, 41, 58, 59}, algorithm.sort(new int[]{31, 41, 59, 26, 41, 58}));
    }

//    @Test
//    public void test_reverse() {
//        MergeSort algorithm = new MergeSort();
//
//        assertArrayEquals(new int[]{6, 5, 4, 3, 2, 1}, algorithm.sort(new int[]{5, 2, 4, 6, 1, 3}, true));
//        assertArrayEquals(new int[]{59, 58, 41, 41, 31, 26}, algorithm.sort(new int[]{31, 41, 59, 26, 41, 58}, true));
//    }
}
