package io.smartir.leetcode.DSA.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode918Test {

    @Test
    void maxSubarraySumCircular() {
        //given
        LeetCode918 underTest = new LeetCode918();
        int[] nums = {1,-2,3,-2};
        //when
        var result = underTest.maxSubarraySumCircular(nums);
        //then
        System.out.println(result);
    }

    @Test
    void maxSubarraySumCircular2() {
        //given
        LeetCode918 underTest = new LeetCode918();
        int[] nums = {5, -3, 5};
        //when
        var result = underTest.maxSubarraySumCircular(nums);
        //then
        System.out.println(result);
    }
}