package com.kugmax.learn.algorithms.sort;

public class MergeSort implements SortAlgorithm {
    @Override
    public int[] sort(int[] a) {
        return sort(a, false);
    }

    @Override
    public int[] sort(int[] a, boolean reverse) {
        return mergeSort(a, 0, a.length - 1, reverse);
    }

    private int[] mergeSort(int[] a, int p, int r, boolean reverse) {
        if (p < r) {
            int q = (p +r) / 2;

            mergeSort(a, p, q, reverse);
            mergeSort(a, q + 1, r, reverse);

            merge(a, p, q, r, reverse);
        }

        return a;
    }

    private int[] merge(int[] a, int p, int q, int r, boolean reverse) {
        if ( !(p <= q && q < r) ) {
            throw new IllegalArgumentException("Shout be p <= q && q < r");
        }

        int n1 = q - p + 1;
        int n2 = r - q;

        int[] left = new int[n1 + 1];
        int[] right = new int[n2 + 1];

        System.arraycopy(a, p, left, 0, n1);
        System.arraycopy(a, q + 1, right, 0, n2);

        left[n1] = reverse ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        right[n2] = reverse ? Integer.MIN_VALUE : Integer.MAX_VALUE;

        for (int i = 0, j = 0, k = p; k <= r; k++) {
            if (checkDirection(left[i], right[j], reverse)) {
                a[k] = left[i++];
            } else {
                a[k] = right[j++];
            }
        }

        return a;
    }

    private boolean checkDirection(int left, int right, boolean reverse) {
        return reverse ? left > right : left <= right;
    }
}
