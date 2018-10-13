package com.kugmax.learn.letcode;

//Given nums = [2, 7, 11, 15], target = 9,
//
//Because nums[0] + nums[1] = 2 + 7 = 9,
//return [0, 1].

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class TwoNumbersSolution {

    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            throw new IllegalArgumentException("In " + IntStream.of(nums).boxed().map(Object::toString).collect(toList()) + " there is no two number for target " + target);
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int val = target - nums[i];
            System.out.println(val + " " + map);

            if (map.containsKey(val) && map.get(val) != i) {
                return new int[]{i, map.get(val)};
            }

            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("In " + IntStream.of(nums).boxed().map(Object::toString).collect(toList()) + " there is no two number for target " + target);
    }

    public static void main(String[] s) {
        TwoNumbersSolution solution = new TwoNumbersSolution();

        int[] result = solution.twoSum(new int[] {2, 7, 11, 15}, 9);
        System.out.println(result[0] + " " + result[1]);

        result = solution.twoSum(new int[] {2}, 2);
        System.out.println(result[0] + " " + result[1]);
    }
}
