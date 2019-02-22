package com.kugmax.learn.algorithms.search;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFindMaxSubarray {

    @Test
    public void findMaxSum_leftToRight() {
        int[]a = new int[] {5, 6, -2, 0};

        FindMaxSubarray algoritm = new FindMaxSubarray();
        int[]max = algoritm.findMaxSum(a, 0, 3, true);

        assertEquals(1, max[0]);
        assertEquals(11, max[1]);
    }

    @Test
    public void findMaxSum_rightToLeft() {
        int[]a = new int[] {5, 6, -2, 0};

        FindMaxSubarray algoritm = new FindMaxSubarray();
        int[]max = algoritm.findMaxSum(a, 0, 1, false);

        assertEquals(0, max[0]);
        assertEquals(11, max[1]);
    }

    @Test
    public void check_simple() {
        int[]a = new int[] {5, 6, -2};

        FindMaxSubarray algoritm = new FindMaxSubarray();
        FindMaxSubarray.Subarray subarray = algoritm.find(a);

        assertEquals(11, subarray.getSum());
        assertEquals(0, subarray.getLeft());
        assertEquals(1, subarray.getRight());
    }


    @Test
    public void check() {
        int[]a = new int[] {13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7};

        FindMaxSubarray algoritm = new FindMaxSubarray();
        FindMaxSubarray.Subarray subarray = algoritm.find(a);

        assertEquals(43, subarray.getSum());
        assertEquals(7, subarray.getLeft());
        assertEquals(10, subarray.getRight());
    }

}
