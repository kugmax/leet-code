package com.kugmax.learn.algorithms.sort;

public class SelectionSort implements SortAlgorithm {

    @Override
    public int[] sort(int[] a) {
        return sort(a, false);
    }

    @Override
    public int[] sort(int[] a, boolean reverse) {
        for (int i = 0; i < a.length; i++) {
            int minIndex = i;

            for (int j = i + 1; j < a.length; j++) {
                if (checkDirection(a[minIndex], a[j], reverse)) {
                    minIndex = j;
                }
            }

            int tmp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = tmp;
        }

        return a;
    }

    private boolean checkDirection(int min, int ai, boolean reverse) {
        return reverse ? min < ai : min > ai;
    }
}
