package com.kugmax.learn.algorithms.sort;

import java.util.stream.IntStream;

public class InsertionSort {

    public int[] sort(int[] a) {
        for (int j = 1; j < a.length; j++) {
            int key = a[j];
            int i = j - 1;
            while (i >= 0 && a[i] > key) {
                a[i + 1] = a[i];
                i--;
            }
            a[i + 1] = key;

            IntStream.of(a).forEach(v -> System.out.print(v + " "));
            System.out.println();
        }

        return a;
    }
}
