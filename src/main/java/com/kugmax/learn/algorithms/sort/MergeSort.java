package com.kugmax.learn.algorithms.sort;

import java.util.Arrays;

public class MergeSort implements SortAlgorithm {
    @Override
    public int[] sort(int[] a) {
        return sort(a, false);
    }

    @Override
    public int[] sort(int[] a, boolean reverse) {
        if (a.length < 2) {
            return a;
        }

        int middle = a.length / 2;

        return merge(
                sort(Arrays.copyOfRange(a, 0, middle), reverse),
                sort(Arrays.copyOfRange(a, middle, a.length), reverse),
                reverse);
    }


    private int[] merge(int[] left, int[] right, boolean reverse) {
        int[] result = new int[left.length + right.length];

        int i = 0, j = 0;
        for (int k = 0; k < result.length; k++) {
            if (j >= right.length ||
                    (i < left.length && checkDirection(left[i], right[j], reverse))
                    ) {
                result[k] = left[i++];
            } else {
                result[k] = right[j++];
            }
        }

        return result;
    }

    private boolean checkDirection(int left, int right, boolean reverse) {
        return reverse ? left > right : left <= right;
    }
}
