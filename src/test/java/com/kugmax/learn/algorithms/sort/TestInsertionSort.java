package com.kugmax.learn.algorithms.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestInsertionSort {

    @Test
    public void test() {
        InsertionSort algorithm = new InsertionSort();

        int[] result = algorithm.sort(new int[]{5, 2, 4, 6, 1, 3});
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, result);
    }
}
