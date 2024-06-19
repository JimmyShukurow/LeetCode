package io.smartir.leetcode.DSA.easy;

import java.util.Arrays;

public class LeetCode88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int first = 0, second = 0;
        while (first < m && second < n) {
            if (nums1[first] >= nums2[second]) {
                for (int i = m; i >first ; i--) {
                    nums1[i] = nums1[i-1];
                }
                m++;
                nums1[first] = nums2[second];
                second++;
            }
            first++;
        }
        if (second < n) {
            for (int i = nums1.length-n+second; i < nums1.length; i++) {
                nums1[i] = nums2[second];
                second++;
            }
        }
        System.out.println(Arrays.toString(nums1));
    }
}
