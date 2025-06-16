package io.smartir.leetcode.DSA.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode215Test {
    @Test
    void findKthLargest() {
        //given
        LeetCode215 underTest = new LeetCode215();
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        //when
        var result = underTest.findKthLargest(nums, k);
        //then
        System.out.println(result);
    }

    @Test
    void findKthLargest2() {
        //given
        LeetCode215 underTest = new LeetCode215();
        int[] nums = {3,2,3,1,2,4,5,5,6};
        int k = 4;
        //when
        var result = underTest.findKthLargest(nums, k);
        //then
        System.out.println(result);
    }

}