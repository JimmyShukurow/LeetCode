package io.smartir.leetcode.DSA.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode373Test {

    @Test
    public void getPairs() {
        LeetCode373 underTest = new LeetCode373();

        //given
        int[] nums1 = {1, 7, 11};
        int[] nums2 = {2, 4, 6};
        int k = 3;

        //when
        var result = underTest.kSmallestPairs(nums1, nums2, k);
        //then
        System.out.println(result);
    }

    @Test
    public void getPairs2() {
        LeetCode373 underTest = new LeetCode373();

        //given
        int[] nums1 = {1, 1, 2};
        int[] nums2 = {1, 2, 3};
        int k = 2;

        //when
        var result = underTest.kSmallestPairs(nums1, nums2, k);
        //then
        System.out.println(result);
    }

    @Test
    public void getPairs3() {
        LeetCode373 underTest = new LeetCode373();

        //given
        int[] nums1 = {1, 2, 4, 5, 6};
        int[] nums2 = {3, 5, 7, 9};
        int k = 3;

        //when
        var result = underTest.kSmallestPairs(nums1, nums2, k);
        //then
        System.out.println(result);
    }
}