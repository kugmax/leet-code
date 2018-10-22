package com.kugmax.learn.algorithms.sort;

import java.util.stream.IntStream;

public class InsertionSort implements SortAlgorithm {

    @Override
    public int[] sort(int[] a) {
        return sort(a, false);
    }

    @Override
    public int[] sort(int[] a, boolean reverse) {
        for (int j = 1; j < a.length; j++) {
            int key = a[j];
            int i = j - 1;
            while (i >= 0 && checkDirection(a[i], key, reverse) ) {
                a[i + 1] = a[i];
                i--;
            }
            a[i + 1] = key;

            IntStream.of(a).forEach(v -> System.out.print(v + " "));
            System.out.println();
        }

        return a;
    }

    private boolean checkDirection(int ai, int key, boolean reverse) {
        return reverse ? ai < key : ai > key;
    }
}
