package com.kugmax.learn.algorithms.sort;

import java.util.stream.IntStream;

public class MergeSort implements SortAlgorithm {
    @Override
    public int[] sort(int[] a) {
        int[] result = mergeSort(a, 0, a.length);

        IntStream.of(result).forEach(v-> System.out.print(v + " "));

        return result;
    }

    @Override
    public int[] sort(int[] a, boolean reverse) {
        return new int[0];
    }

    private int[] mergeSort(int[] a, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            mergeSort(a, p, q);
            mergeSort(a, q + 1, r);
            merge(a, p, q, r);
        }

        return a;
    }

    private int[] merge(int[] a, int p, int q, int r) { //a shout be sorted
        if ( !(p <= q && q < r) ) {
            throw new IllegalArgumentException("Shout be p <= q && q < r");
        }

        IntStream.of(a).forEach(v-> System.out.print(v + " "));
        System.out.println("p=" + p + " q=" + q + " r=" + r );

        int n1 = q - p + 1;
        int n2 = r - q;

        System.out.println("n1=" + n1 + " n2=" + n2);

        int[] left = new int[n1 + 1];
        int[] right = new int[n2 + 1];

        System.arraycopy(a, p, left, 0, n1);
        System.arraycopy(a, q, right, 0, n2);

        left[n1] = Integer.MAX_VALUE;
        right[n2] = Integer.MAX_VALUE;

        IntStream.of(left).forEach(v-> System.out.print(v + " "));
        System.out.println();
        IntStream.of(right).forEach(v-> System.out.print(v + " "));
        System.out.println();
        System.out.println("===================");

        for (int i = 0, j = 0, k = p; k < r; k++) {
            if (left[i] <= right[j]) {
                a[k] = left[i++];
            } else {
                a[k] = right[j++];
            }
        }

        return a;
    }
}
