package io.smartir.leetcode.DSA.medium;

import java.util.Arrays;

public class LeetCode4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] combined = new int[nums1.length + nums2.length];
        int l1 = 0, l2 = 0, l3 = 0;
        while (l1 < nums1.length && l2 < nums2.length) {
            if (nums1[l1] < nums2[l2]) {
                combined[l3] = nums1[l1];
                l1++;
            }else {
                combined[l3] = nums2[l2];
                l2++;
            }
            l3++;
        }
        while (l1<nums1.length){
            combined[l3] = nums1[l1];
            l1++;
            l3++;
        }
        while (l2<nums2.length){
            combined[l3] = nums2[l2];
            l2++;
            l3++;
        }
        if (combined.length%2!=0) return combined[combined.length / 2];
        else {
            var r = combined[combined.length / 2];
            var l = combined[(combined.length / 2) -1];
            return (double) (l + r) / 2;
        }
    }
}
