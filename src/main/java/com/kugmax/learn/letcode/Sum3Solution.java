package com.kugmax.learn.letcode;

import java.util.*;

public class Sum3Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Set<NumsException> exceptions = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {

            List<List<Integer>> two = twoSum(nums, -nums[i], i);

            if (!two.isEmpty()) {
                for (List<Integer> twoResult: two) {
                    NumsException numException = new NumsException(nums[twoResult.get(1)], nums[twoResult.get(0)], nums[i]);
                    if (exceptions.contains(numException)) {
                        continue;
                    }
                    exceptions.add(numException);
                    result.add(Arrays.asList(nums[i], nums[twoResult.get(1)], nums[twoResult.get(0)]));
                }
            }
        }

        return result;
    }


    private List<List<Integer>> twoSum(int[] nums, int target, int exceptions) { //from TwoNumbersSolution
        if (nums == null || nums.length < 2) {
            return new ArrayList<>();
        }

        List<List<Integer>> results = new ArrayList<>();

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (exceptions == i) {
                continue;
            }

            int val = target - nums[i];

            if (map.containsKey(val) && map.get(val) != i) {
                results.add(Arrays.asList(i, map.get(val)));
            }

            map.put(nums[i], i);
        }

        return results;
    }

    public static class NumsException {
       private final Set<Integer> nums = new HashSet<>();

        public NumsException(int x, int y, int z) {
            nums.add(x);
            nums.add(y);
            nums.add(z);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            NumsException that = (NumsException) o;
            return Objects.equals(nums, that.nums);
        }

        @Override
        public int hashCode() {

            return Objects.hash(nums);
        }

        @Override
        public String toString() {
            return "NumsException{" +
                    "nums=" + nums +
                    '}';
        }
    }
}
