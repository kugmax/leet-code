package com.kugmax.learn.letcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestWaterContainerSolution {

    @Test
    public void test() {
        WaterContainerSolution solution = new WaterContainerSolution();

        assertEquals(49, solution.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));

        assertEquals(2, solution.maxArea(new int[]{10, 1, 1}));
        assertEquals(20, solution.maxArea(new int[]{10, 1, 10}));
        assertEquals(0, solution.maxArea(new int[]{-10, 10}));
        assertEquals(1, solution.maxArea(new int[]{-10, 1, 10}));

        assertThrows(IllegalArgumentException.class, () -> solution.maxArea(new int[]{10}));
        assertThrows(IllegalArgumentException.class, () -> solution.maxArea(null));
    }
}
