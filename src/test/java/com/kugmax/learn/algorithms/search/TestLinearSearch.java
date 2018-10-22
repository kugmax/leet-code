package com.kugmax.learn.algorithms.search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestLinearSearch {

    @Test
    public void test() {
        LinearSearch algorithm = new LinearSearch();

        assertEquals(4, algorithm.searchIndex(new int[]{5, 2, 4, 6, 1, 3}, 1));
        assertEquals(-1, algorithm.searchIndex(new int[]{5, 2, 4, 6, 1, 3}, 9));
    }
}
