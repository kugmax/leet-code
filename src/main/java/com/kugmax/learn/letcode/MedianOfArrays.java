package main.java.com.kugmax.learn.letcode;

import java.util.*;
import static java.util.stream.Collectors.toList;

public class MedianOfArrays {
//    nums1 = [1, 3]
//    nums2 = [2]
//
//    The median is 2.0
//    nums1 = [1, 2]
//    nums2 = [3, 4]
//
//    The median is (2 + 3)/2 = 2.5

    public static void main(String args[]) {
//        int[] nums1 = {1, 3};
//        int[] nums2 = {1};

        int[] nums1 = {1, 1};
        int[] nums2 = {1, 2};

        List<Integer> list = new ArrayList<>();

        if (nums2 != null && nums2.length > 0) {
            list.addAll(Arrays.stream(nums2).boxed().collect(toList()));
        }

        if (nums1 != null && nums1.length > 0) {
            list.addAll(Arrays.stream(nums1).boxed().collect(toList()));
        }

        list.sort(Comparator.naturalOrder());


        double result;
        int size = list.size();

        System.out.println(list);

        if (size % 2 == 0) {
            int second = size / 2;
            int first = second - 1;

            result = (list.get(first) + list.get(second)) / 2.0;
        } else  {
            result = list.get(size / 2);
        }

        System.out.println(result);
    }
}
