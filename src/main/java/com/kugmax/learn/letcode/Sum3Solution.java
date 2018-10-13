package com.kugmax.learn.letcode;

import java.util.*;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

//Given array nums = [-1, 0, 1, 2, -1, -4],
//
//        A solution set is:
//        [
//        [-1, 0, 1],
//        [-1, -1, 2]
//        ]

//not content duplicate triples

public class Sum3Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Set<Integer> exceptions = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (exceptions.contains(i)) {
                continue;
            }

            exceptions.add(i);

            int[] two = twoSum(nums, -nums[i], exceptions);

            if (two != null) {
                result.add(Arrays.asList(nums[two[0]], nums[two[1]], nums[i]));
                exceptions.add(two[0]);
                exceptions.add(two[1]);
            } else {
                exceptions.remove(i);
            }
        }

        return result;
    }


    private int[] twoSum(int[] nums, int target, Set<Integer> exceptions) { //from TwoNumbersSolution
        if (nums == null || nums.length < 2) {
            return null;
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (exceptions.contains(i)) {
                continue;
            }

            int val = target - nums[i];

            if (map.containsKey(val) && map.get(val) != i) {
                return new int[]{i, map.get(val)};
            }

            map.put(nums[i], i);
        }

        return null;
    }
}
