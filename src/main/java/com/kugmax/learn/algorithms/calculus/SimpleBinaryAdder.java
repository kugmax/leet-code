package com.kugmax.learn.algorithms.calculus;

public class SimpleBinaryAdder {

    /**
     * The size of arrays is n.
     * @param a integer value in binary format which stored as array
     * @param b integer value in binary format which stored as array
     * @return c = a + b, witch size (n + 1) array
     */
    public int[] add(int[] a, int[] b) {
        int n = a.length;
        int[] c =  new int[n + 1];

        boolean memory = false;
        for (int i = n - 1; i >= 0; i--) {
            int v = a[i] + b[i];
            int j = i + 1;

            if (v == 0) {
                c[j] = memory ? 1 : 0;
                memory = false;
            } else if (v == 1) {
                if (memory) {
                    c[j] = 0;
                } else {
                    c[j] = 1;
                    memory = false;
                }
            } else {
                c[j] = 0;
                memory = true;
            }
        }

        c[0] = memory ? 1 : 0;

        return c;
    }
}
