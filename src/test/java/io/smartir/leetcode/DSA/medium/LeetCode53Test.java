package io.smartir.leetcode.DSA.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode53Test {

    @Test
    void maxSubArray() {
        //given
        LeetCode53 underTest = new LeetCode53();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        //when
        var result = underTest.maxSubArray(nums);
        //then
        System.out.println(result);
    }

    @Test
    void maxSubArray2() {
        //given
        LeetCode53 underTest = new LeetCode53();
        int[] nums = {5,4,-1,7,8};
        //when
        var result = underTest.maxSubArray(nums);
        //then
        System.out.println(result);
    }
}