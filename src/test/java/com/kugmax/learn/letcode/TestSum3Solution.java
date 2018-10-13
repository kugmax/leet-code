package com.kugmax.learn.letcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSum3Solution {

    @Test
    public void test() {
        Sum3Solution solution = new Sum3Solution();

        List<List<Integer>> result = new ArrayList<>();
        result.add(Arrays.asList(-1, 0, 1));
        result.add(Arrays.asList(-1, -1, 2));

        assertEquals(result ,solution.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }
}
