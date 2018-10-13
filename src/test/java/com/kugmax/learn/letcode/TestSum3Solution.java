package com.kugmax.learn.letcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class TestSum3Solution {

    @Test
    public void test() {
        Sum3Solution solution = new Sum3Solution();

        List<List<Integer>> result = solution.threeSum(new int[]{-1, 0, 1, 2, -1, -4});

        assertThat(result)
                .contains(Arrays.asList(-1, 0, 1))
                .contains(Arrays.asList(-1, 2, -1));
    }

    @Test
    public void test_2() {
        Sum3Solution solution = new Sum3Solution();

        List<List<Integer>> result = solution.threeSum(new int[]{-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6});

        assertThat(result)
                .contains(Arrays.asList(-4,-2,6))
                .contains(Arrays.asList(-4,0,4))
                .contains(Arrays.asList(-4,1,3))
                .contains(Arrays.asList(-4,2,2))
                .contains(Arrays.asList(-2,-2,4))
                .contains(Arrays.asList(-2,0,2));

    }

    @Test
    public void numsException() {
        assertTrue(new Sum3Solution.NumsException(1, 2, 3).equals(new Sum3Solution.NumsException(3, 2, 1)));
        assertTrue(new Sum3Solution.NumsException(1, -1, 3).equals(new Sum3Solution.NumsException(3, -1, 1)));
        assertFalse(new Sum3Solution.NumsException(0, -1, 3).equals(new Sum3Solution.NumsException(3, -1, 1)));
    }
}
