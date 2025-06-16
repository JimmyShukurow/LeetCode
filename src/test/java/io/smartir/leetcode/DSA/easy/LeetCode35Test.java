package io.smartir.leetcode.DSA.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode35Test {

    @Test
    void searchInsert() {
        //given
        LeetCode35 underTest = new LeetCode35();
        //when
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        int result = underTest.searchInsert(nums, target);

        //then
        System.out.println(result);

    }
}