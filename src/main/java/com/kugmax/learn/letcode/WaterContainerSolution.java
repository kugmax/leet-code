package com.kugmax.learn.letcode;

public class WaterContainerSolution {
    public int maxArea(int[] height) {
        if (height == null || height.length < 2) {
            throw new IllegalArgumentException("Array must has more at least two elements");
        }

        int len = height.length;
        int i = 0, j = len - 1, area = 0;

        while (i != j) {

            int newAra;
            if (height[i] > height[j]) {
                newAra = height[j] * (j - i);
                j--;
            } else {
                newAra = height[i] * (j - i);
                i++;
            }

            if (newAra > area) {
                area = newAra;
            }
        }

        return area;
    }
}
