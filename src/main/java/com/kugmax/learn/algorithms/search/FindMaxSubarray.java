package com.kugmax.learn.algorithms.search;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

public class FindMaxSubarray {

    public Subarray find(int[] a) {
        return findMaxSubarray(a, 0, a.length - 1);
    }


    public Subarray findMaxSubarray(int[]a, int left, int right) {

        if (right == left) {
            return new Subarray(left, right, a[left]);
        }

        int mid = (left + right) / 2;

        Subarray leftSubarray = findMaxSubarray(a, left, mid);
        Subarray rightSubarray = findMaxSubarray(a, mid + 1, right);
        Subarray crossingSubarray = findMaxCrossingSubarray(a, left, mid, right);

        System.out.println(left + " " + mid + " " + right);

        System.out.println("l " + leftSubarray);
        System.out.println("r " + rightSubarray);
        System.out.println("c " + crossingSubarray);
        System.out.println();

        if (leftSubarray.getSum() >= rightSubarray.getSum() && leftSubarray.getSum() >= crossingSubarray.getSum()) {
            return leftSubarray;
        } else if (rightSubarray.getSum() >= leftSubarray.getSum() && rightSubarray.getSum() >= crossingSubarray.getSum()) {
            return rightSubarray;
        } else {
            return crossingSubarray;
        }

    }

    public Subarray findMaxCrossingSubarray(int[] a, int left, int mid, int right) {
        int[] maxLeft = findMaxSum(a, left, mid, true);
        int[] maxRight = findMaxSum(a, mid + 1, right, false);

        return new Subarray(maxLeft[0], maxRight[0], maxLeft[1] + maxRight[1]);
    }

    public int[] findMaxSum(int[] a, int left, int right, boolean leftToRight) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        int max = 0;

        int step = leftToRight ? 1 : -1;
        int start = leftToRight ? left : right;
        int end = leftToRight ? right : left;

        for (int i = start; checkDirection(i, end, leftToRight); i += step) {
            sum += a[i];
            if (sum > maxSum) {
                maxSum = sum;
                max = i;
            }
        }

        return new int[]{max, maxSum};
    }

    private boolean checkDirection(int i, int condition, boolean leftToRight) {
        return leftToRight ? i <= condition : i >= condition;
    }

    @ToString
    @AllArgsConstructor
    @Data
    public static class Subarray {
        private int left;
        private int right;
        private int sum;
    }

}
