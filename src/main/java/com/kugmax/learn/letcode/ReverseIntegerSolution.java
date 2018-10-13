package com.kugmax.learn.letcode;

public class ReverseIntegerSolution {

    public int reverse(int x) {
        boolean positive = x > 0;
        x = Math.abs(x);

        long result = 0;
        while (x > 0) {
            result = result * 10 + x % 10;
            if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
                return 0;
            }
            x /= 10;
        }

        return (int)(positive ? result : result * -1);
    }
}
