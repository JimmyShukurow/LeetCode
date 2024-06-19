package io.smartir.leetcode.DSA.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode88Test {

    @Test
    public void merge() {
        //given
        LeetCode88 leetCode88 = new LeetCode88();
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        //when
        leetCode88.merge(nums1, 3, nums2, 3);

        //then
    }

    @Test
    public void mergeTest2() {
        //given
        LeetCode88 leetCode88 = new LeetCode88();
        int[] nums1 = new int[]{2, 0};
        int[] nums2 = new int[]{1};
        //when
        leetCode88.merge(nums1, 1, nums2, 1);

        //then
    }

    @Test
    public void mergeTest3() {
        //given
        LeetCode88 leetCode88 = new LeetCode88();
        int[] nums1 = new int[]{4, 5, 6, 0, 0, 0};
        int[] nums2 = new int[]{1,2,3};
        //when
        leetCode88.merge(nums1, 3, nums2, 3);

        //then
    }


}